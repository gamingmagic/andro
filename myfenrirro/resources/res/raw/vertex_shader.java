attribute vec4 	in_vpos; //[xyz = position, w = palette ID]
attribute vec4 	in_texcoord; //[xy = position in texture in pixels, zw = texture position in atlas, pixels]
uniform mat4 	in_wvp_mat;
varying vec4 texcoord;
varying float palette_id;

#if defined(TERRAIN)
	varying vec2 vpos_xz;
#endif

#if defined(OBJECT)
	attribute float in_vmeshid;	// Is really array of ints, but GLSL doesn't allow int attributes
	uniform mat4 	in_obj_mesh_mats[50];	// TODO: change to c_ro_rsm.MAX_MESHES
#endif

#if defined(WATER)
	uniform float 	in_frame_idx;	// Is really int, but some devices don't allow ints
	uniform vec3 	in_frame_texcoords[32];	// TODO: change to maxframes
#endif

#if defined(SPRITE)
	attribute vec4 	in_vcolor;
	uniform mat4 	in_transformation_mat;
	uniform vec3	in_vcamera;
	uniform float	in_camera_dist;
	varying vec4 	vcolor;
#endif

#if defined(SIMPLE3DOBJECT)
	uniform mat4 	in_transformation_mat;
#endif

#if defined(SPRITE2D)
	uniform mat4 	in_transformation_mat;
	//attribute vec4 	in_vcolor;
	//varying vec4 	vcolor;
#endif

#if defined (STR_EFFECT)
	uniform mat4 uViewModelMat; //rotation to orthogonal
	uniform vec4 u3dPosition;
#endif

#if defined (EFFECT_PRIM)
		//calculated once per frame
		uniform mat4 uViewModelMat; //rotation to orthogonal

		//calculated each primitive
		uniform mat4 in_transformation_mat; //effect rotation (after sprite offset apply
		uniform mat4 uSpriteAngle; //sprite rotation (before sprite offset apply)

		uniform vec4 in_frame_texcoords;
		uniform vec4 uSpriteSize;
		uniform vec3 uSpriteOffset;
		uniform vec4 u3dPosition;
		uniform float uParam;
		uniform float uSpriteDepth;
		uniform float uSpriteZindex;
#endif
void main()
{
#if defined(WATER)
	gl_Position	= in_wvp_mat * vec4(in_vpos.xyz, 1.0);
	texcoord.xy	= in_texcoord.xy;
	texcoord.zw  = in_frame_texcoords[int(in_frame_idx)].xy + 0.5;
	palette_id = in_frame_texcoords[int(in_frame_idx)].z + 0.5;
#else
	texcoord 	= in_texcoord;
	texcoord.zw += 0.5;
	palette_id = in_vpos.w + 0.5;
#endif

//if we want to use [1/N : 1-1/N] range, then uncomment this and replace d in c_texdata.to_float_rect() and similar with 1;
//#if !defined(INTERPOLATE)
//	texcoord.xy += 0.5;
//#endif

#if defined(TERRAIN)
	//gl_Position	= in_wvp_mat * vec4(in_vpos.x, in_vpos.y/10.0, in_vpos.z, in_vpos.w);	// For ShortBuffer
	gl_Position	= in_wvp_mat * vec4(in_vpos.xyz, 1.0);
	vpos_xz		= in_vpos.xz;
#endif

#if defined(OBJECT)
	gl_Position	= in_wvp_mat * in_obj_mesh_mats[int(in_vmeshid)] * vec4(in_vpos.xyz, 1.0);
#endif

#if defined(SPRITE)
	// We decrease sprite Z after projecting to make sprites a little closer to camera,
	// to avoid bugs appearing when some 3d object is behind a sprite 
	vec4 vpos = in_wvp_mat * in_transformation_mat * vec4(in_vpos.xyz, 1.0);
	float rotx = 3.14 / 4.0;
	float zdelta_add = 55.0;
	float zdelta_mul = 2.5;
	float delta = (zdelta_add + zdelta_mul * rotx * in_vpos.y) / in_camera_dist;
	vpos.z -= delta;
	gl_Position = vpos;

	vcolor		= in_vcolor/255.0;	// We use unsigned byte quads in range 0-255 for color
#endif

#if defined(DEBUG3D)
	gl_Position	= in_wvp_mat * vec4(in_vpos.xyz, 1.0);
#endif

#if defined(SPRITE2D)
	gl_Position = in_transformation_mat * vec4(in_vpos.x, in_vpos.y, 0.5, 1.0);
	//vcolor		= in_vcolor/255.0;	// We use unsigned byte quads in range 0-255 for color
	palette_id = in_vpos.z + 0.5;
#endif
#if defined (STR_EFFECT)
	gl_Position = in_wvp_mat * ( uViewModelMat * vec4( in_vpos.xy, 0.0, 1.0 ) + u3dPosition );

	palette_id = 0.5; //assume no atlas
#endif

#if defined (EFFECT_PRIM)
	#if defined (INTERPOLATE)
		texcoord.xy = in_texcoord.xy * (in_frame_texcoords.xy-1.0);
	#else
		texcoord.xy = in_texcoord.xy * in_frame_texcoords.xy;
	#endif

	texcoord.zw	= in_frame_texcoords.zw + 0.5; //vec2(0.5,0.5); //assume no atlas
	palette_id = 0.5;

	ivec4 sizeSel;
	sizeSel[2] = int(in_texcoord.z);
	sizeSel[3] = int(uParam);
	sizeSel[0] = sizeSel[2] / 16; sizeSel[2] -= sizeSel[0]*16;
	sizeSel[1] = sizeSel[2] / 4;  sizeSel[2] -= sizeSel[1]*4;

	#if defined (TRY1) || defined (TRY2)
		mat4 rotate = uViewModelMat;
	#else
		mat4 rotate = (sizeSel[3]>0?in_transformation_mat:uViewModelMat);
	#endif

	// Calculate position base on angle and sprite offset/size
	#if defined (TRY2)
		vec4 position = vec4( in_vpos.xyz * uSpriteSize.xyz, 1.0);
	#else
		vec4 position = vec4( in_vpos.x * uSpriteSize[sizeSel[0]], in_vpos.y * uSpriteSize[sizeSel[1]], in_vpos.z * uSpriteSize[sizeSel[2]], 1.0);
	#endif

	position = uSpriteAngle * position;
	position.xyz += uSpriteOffset.xyz;

	// Project to camera plane
	position = in_wvp_mat * (rotate * position + u3dPosition );
	position.z -= uSpriteZindex * 0.01 + uSpriteDepth;

	gl_Position = position;
#endif

#if defined(SIMPLE3DOBJECT)
	gl_Position = in_wvp_mat * in_transformation_mat * vec4(in_vpos.xyz, 1.0);
#endif
}	
 