precision mediump float;

uniform sampler2D 	in_texture;
uniform sampler2D 	in_texture2;
uniform vec3		in_pixel_atlas_size; //[xy = pixel size, z = 0]
uniform vec3		in_palette_atlas_size; //[xy = pixel size, z = palletes in row]
varying vec4		texcoord; //[xy = position in texture, pixels, zw = texture position in atlas + 0.5, pixels]
varying float		palette_id;

uniform int			debugcolor;

#if defined(USE_COLORMAP)
	uniform sampler2D 	in_texture_colormap;
#endif

#if defined(TERRAIN)
	uniform vec2 	in_map_size;	// For colormap texcoord calculation
	varying vec2 	vpos_xz;	// is really vpos xz (used for colormap)
#endif

#if defined(SPRITE)
	varying vec4 	vcolor;
	uniform vec4	in_color;	// NOTE: this is NOT attribute in_vcolor, this is one color for one drawing sprite!
#endif

#if defined(SPRITE2D) || defined(STR_EFFECT) || defined (EFFECT_PRIM)
	//varying vec4 	vcolor;
	uniform vec4	in_color;	// NOTE: this is NOT attribute in_vcolor, this is one color for one drawing sprite!
#endif


void main()
{
	const float side = 16.0;

	int max_palettes_x = int(in_palette_atlas_size.z);

	int slot_i = int(palette_id); // palette slot
	int slot_y = slot_i / max_palettes_x;
	int slot_x = slot_i - slot_y * max_palettes_x;

	vec2 color_xy = (texcoord.xy + floor(texcoord.zw))*in_pixel_atlas_size.xy;

	//float16 can only address coordinates [-2048.0; 2048.0] with step 1.0, so we use this range [-0.5; 0.5] instead of [0; 1]
	if (color_xy.x >= 0.5) color_xy.x = (floor(texcoord.x) + (floor(texcoord.z) - 1.0/in_pixel_atlas_size.x))*in_pixel_atlas_size.x;
	if (color_xy.y >= 0.5) color_xy.y = (floor(texcoord.y) + (floor(texcoord.w) - 1.0/in_pixel_atlas_size.y))*in_pixel_atlas_size.y;


#if defined(INTERPOLATE)
	vec4 fr; //multiplier for 4 pixel components.
	fr.zw = fract(texcoord.xy);
	fr.xy = 1.0 - fr.zw;
	fr = fr.xxzz * fr.ywyw;

	mat4 color4;
	// in_pixel_atlas_size.z contains zero
	color4[0] = texture2D(in_texture,color_xy + in_pixel_atlas_size.zz);
	color4[1] = texture2D(in_texture,color_xy + in_pixel_atlas_size.zy);
	color4[2] = texture2D(in_texture,color_xy + in_pixel_atlas_size.xz);
	color4[3] = texture2D(in_texture,color_xy + in_pixel_atlas_size.xy);
	ivec4 color_idx = ivec4(vec4(color4[0].a, color4[1].a, color4[2].a, color4[3].a) * 255.0 + 0.5);

	vec4 color_y;
	vec4 color_x = vec4(color_idx);
#else
	vec4 color_idx = texture2D(in_texture,color_xy);
	float color_y;
	float color_x = floor(color_idx.a * 255.0 + 0.5);
#endif
	color_y = floor(color_x/side);
	color_x -= color_y * side;

	color_x += float(slot_x) * side;
	color_y += float(slot_y) * side;
	color_x *= in_palette_atlas_size.x;
	color_y *= in_palette_atlas_size.y;

#if defined(INTERPOLATE)
	int i;
	for (i = 0; i< 4; i++){
		//  float conversion needs here. vec4[int] seems to return vector of unknown size on Huawei MediaPad T3 10.
		color4[i]=texture2D(in_texture2,vec2(float(color_x[i]),color_y[i]));
	}

//#if !defined(WATER) && !defined(TERRAIN)
	//Warning: cycle wrap will not working on Huawei MediaPad T3 10
	//discard rgb color information for transparent pixels
	if ( vec4(color4[0]).a < 0.05 ) fr[0] = 0.0;
	if ( vec4(color4[1]).a < 0.05 ) fr[1] = 0.0;
	if ( vec4(color4[2]).a < 0.05 ) fr[2] = 0.0;
	if ( vec4(color4[3]).a < 0.05 ) fr[3] = 0.0;
//#endif

	vec4 alpha = vec4(color4[0].a, color4[1].a, color4[2].a, color4[3].a);
	alpha -= floor(alpha);
	bool no_alpha = (alpha.x + alpha.y + alpha.z + alpha.w == 0.0);

	vec4 color = (color4 * fr);

	if (no_alpha){ //no alpha channel detected, so all or nothing.
		if(color.a<0.5)
			discard;
		else
			color.a=1.0;
	}

	color.rgb *= 1.0/(fr.x + fr.y + fr.z + fr.w); //retain color information
	// if sum is zero, color is zero too and pixel already discarded, no matter result

#else
	vec4 color = texture2D(in_texture2,vec2(color_x,color_y));
#endif

	if (color.a<0.05)
		discard;

#if defined(TERRAIN) && defined(USE_COLORMAP)
	vec2 texcoord_colormap;
//	texcoord_colormap.x = -( (vpos_xz.x) / 10.0 + in_map_size.x / 2.0 ) / in_map_size.x;
//	texcoord_colormap.y =  ( (vpos_xz.y) / 10.0 + in_map_size.y / 2.0 ) / in_map_size.y;

	texcoord_colormap.x = ( in_map_size.x / 2.0 - vpos_xz.x / 10.0 ) / in_map_size.x;
	texcoord_colormap.y = ( in_map_size.y / 2.0 + vpos_xz.y / 10.0 ) / in_map_size.y;

	vec4 color2 = texture2D(in_texture_colormap,texcoord_colormap);
	color.x = color.x * color2.x;
	color.y = color.y * color2.y;
	color.z = color.z * color2.z;
#endif


#if defined(WATER)
	color.a = 0.5;
#endif

#if defined(SPRITE)
	color = color * vcolor * in_color;
#endif

#if defined(SPRITE2D) || defined (STR_EFFECT) || defined(EFFECT_PRIM)
	color = color * in_color;
#endif

#if defined(DEBUG3D)
	color = vec4(1.0, 0.0, 0.0, 1.0);
#endif

	gl_FragColor = color;

//	debug
//	gl_FragColor = vec4(1.0, 0.0, 0.0, 1.0);
}
