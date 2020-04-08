precision mediump float;

varying vec3 texcoord;

uniform sampler2D in_texture;
uniform sampler2D in_texture2;
uniform vec2 palette_atlas_size;

uniform int fs_mode;

void main()
{
	if ( fs_mode == -1 ) {
		float side = 16.0;
		vec4 color = texture2D(in_texture,texcoord.xy);
		//float color_idx = color.a * 256.0;
		float color_idx = floor(color.a * 255.0 + 0.5);
		float pal_y = floor(texcoord.z / palette_atlas_size.x);
		float pal_x = texcoord.z - pal_y * palette_atlas_size.x;
		float color_y = floor(color_idx/side);
		float color_x = color_idx - color_y * side;
		color_x = color_x + pal_x;
		color_y = color_y + pal_y;
		float global_color_idx = color_x + color_y * palette_atlas_size.x;
		float global_color_y = floor(global_color_idx / palette_atlas_size.x);
		float global_color_x = global_color_idx - global_color_y * palette_atlas_size.x;
		vec2 coord_in_pal_atlas =  vec2 ( global_color_x / palette_atlas_size.x, global_color_y / palette_atlas_size.y );	
		color = texture2D(in_texture2,coord_in_pal_atlas);
		if ( color.r > 0.9 && color.g < 0.1 && color.b > 0.9 )
			discard;
		gl_FragColor = color;
	} else if ( fs_mode == 0 ) {			// Main mode: paletted image; texcoord.z holds starting palette pixel idx
		int iatlasx = int(floor(palette_atlas_size.x+0.5));
		int ipalstartpixel = int(floor(texcoord.z+0.5));
		int side = 16;
		vec4 color = texture2D(in_texture,texcoord.xy);

		int color_idx = int(floor(color.a * 255.0 + 0.5));
		int pal_y = ipalstartpixel / iatlasx;
		int pal_x = ipalstartpixel - pal_y * iatlasx;
		int color_y = color_idx / side;
		int color_x = color_idx - color_y * side;
		color_x = color_x + pal_x;
		color_y = color_y + pal_y;

		int global_color_idx = color_x + color_y * iatlasx;
		int global_color_y = global_color_idx / iatlasx;
		int global_color_x = global_color_idx - global_color_y * iatlasx;
		
		vec2 coord_in_pal_atlas =  vec2 ( float(global_color_x) / palette_atlas_size.x, float(global_color_y) / palette_atlas_size.y );
		color = texture2D(in_texture2,coord_in_pal_atlas);
		if ( color.r > 0.9 && color.g < 0.1 && color.b > 0.9 )
			discard;
		gl_FragColor = color;
	} else if ( fs_mode == 1 ) {	// Show predefined color
		gl_FragColor = vec4(1.0, 1.0, 0.0, 1.0);
	} else if ( fs_mode == 2 ) {	// Show texcoord
		gl_FragColor = vec4(1.0, texcoord.x, texcoord.y, 1.0);
	} else if ( fs_mode == 3 ) {	// Show color from texture1, converting alpha to red.
		vec4 color = texture2D(in_texture,texcoord.xy);
		color.r = color.a;
		color.a = 1.0;
		gl_FragColor = color;
	}
}
