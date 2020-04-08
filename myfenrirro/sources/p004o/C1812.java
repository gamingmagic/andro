package p004o;

import android.graphics.Point;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.util.Log;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: o.騛 */
final class C1812 implements Renderer {

    /* renamed from: Ć */
    static C0616on f8342 = new C0616on(0.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: ć */
    static C0616on f8343 = new C0616on(1.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: đ */
    private static final String[] f8344 = {"GL_INVALID_ENUM", "GL_INVALID_VALUE", "GL_INVALID_OPERATION", "GL_STACK_OVERFLOW", "GL_STACK_UNDERFLOW", "GL_OUT_OF_MEMORY"};

    /* renamed from: Ē */
    private static int[] f8345;

    /* renamed from: Ą */
    String f8346;

    /* renamed from: ą */
    String f8347;

    /* renamed from: ċ */
    private C1814[] f8348 = new C1814[C1815.MAX.f8408];

    /* renamed from: ȃ */
    public long f8349;

    /* renamed from: Ȋ */
    private Point[] f8350 = new Point[C1813if.values().length];

    /* renamed from: ˮ͈ */
    C0574na f8351 = C0574na.NONE;

    /* renamed from: ˮ͍ */
    Runnable f8352 = new C1351(this);

    /* renamed from: ܕ */
    private long f8353;

    /* renamed from: 䒧 */
    private boolean f8354 = false;

    /* renamed from: 岱 */
    C1337 f8355;

    /* renamed from: 庸 */
    private int f8356;

    /* renamed from: 櫯 */
    IntBuffer f8357;

    /* renamed from: 纫 */
    private int f8358;

    /* renamed from: 躆 */
    private int f8359 = 0;

    /* renamed from: 鷭 */
    Queue<Runnable> f8360 = new ConcurrentLinkedQueue();

    /* renamed from: o.騛$if */
    enum C1813if {
        TERRAIN_COLORS,
        TERRAIN_PALETTES,
        OBJECT_COLORS,
        OBJECT_PALETTES,
        SPRITE_COLORS,
        SPRITE_PALETTES,
        COLORMAP
    }

    /* renamed from: o.騛$櫯 */
    class C1814 {

        /* renamed from: Ą */
        int f8369;

        /* renamed from: ą */
        int f8370;

        /* renamed from: Ć */
        int f8371;

        /* renamed from: ć */
        int f8372;

        /* renamed from: ċ */
        int f8373;

        /* renamed from: đ */
        int f8374;

        /* renamed from: Ē */
        int f8375;

        /* renamed from: ē */
        int f8376;

        /* renamed from: Ė */
        int f8377;

        /* renamed from: ė */
        int f8378;

        /* renamed from: Ę */
        int f8379;

        /* renamed from: ę */
        int f8380;

        /* renamed from: ȃ */
        int f8381;

        /* renamed from: Ȋ */
        int f8382;

        /* renamed from: ˮ͈ */
        int f8383;

        /* renamed from: ˮ͍ */
        int f8384;

        /* renamed from: ܕ */
        int f8385;

        /* renamed from: 㥳 */
        int f8386;

        /* renamed from: 䒧 */
        int f8387;

        /* renamed from: 岱 */
        int f8389;

        /* renamed from: 庸 */
        int f8390;

        /* renamed from: 廂 */
        int f8391;

        /* renamed from: 櫯 */
        int f8392;

        /* renamed from: 纫 */
        int f8393;

        /* renamed from: 躆 */
        int f8394;

        /* renamed from: 鷭 */
        int f8395;

        /* renamed from: 띥 */
        int f8396;

        private C1814() {
        }

        /* synthetic */ C1814(C1812 r1, C1814 r2) {
            this();
        }
    }

    /* renamed from: o.騛$鷭 */
    enum C1815 {
        TERRAIN,
        OBJECT,
        SPRITE,
        WATER,
        DEBUG3D,
        SPRITE2D,
        SIMPLE3DOBJECT,
        STR_EFFECT,
        EFFECT_PRIM,
        MAX;
        

        /* renamed from: Ȋ */
        int f8408;

        static {
            C1815[] values = values();
            for (int i = 0; i < values.length; i++) {
                values[i].f8408 = i;
            }
        }

        /* renamed from: 鷭 */
        static String m2485(int i) {
            C1815[] values = values();
            for (int i2 = 0; i2 < values.length; i2++) {
                if (values[i2].f8408 == i) {
                    return values[i2].name();
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4525(C1558 r14, C0441in inVar) {
        if (this.f8357 != null) {
            GLES20.glDeleteTextures(C1813if.values().length, this.f8357);
            this.f8357 = null;
        }
        this.f8357 = ByteBuffer.allocateDirect(C1813if.values().length * 4).order(ByteOrder.nativeOrder()).asIntBuffer();
        GLES20.glGenTextures(C1813if.values().length, this.f8357);
        int glGetError = GLES20.glGetError();
        this.f8358 = glGetError;
        if (glGetError != 0) {
            m2470(this.f8358);
        }
        C1813if[] values = C1813if.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            C1813if ifVar = values[i];
            GLES20.glBindTexture(3553, this.f8357.get(ifVar.ordinal()));
            int glGetError2 = GLES20.glGetError();
            this.f8358 = glGetError2;
            if (glGetError2 != 0) {
                m2470(this.f8358);
            }
            int i2 = ifVar == C1813if.COLORMAP ? 9729 : 9728;
            GLES20.glTexParameteri(3553, 10241, i2);
            int glGetError3 = GLES20.glGetError();
            this.f8358 = glGetError3;
            if (glGetError3 != 0) {
                m2470(this.f8358);
            }
            GLES20.glTexParameteri(3553, 10240, i2);
            int glGetError4 = GLES20.glGetError();
            this.f8358 = glGetError4;
            if (glGetError4 != 0) {
                m2470(this.f8358);
            }
        }
        mo4524(r14.f7338.f1300, C1813if.TERRAIN_COLORS, C1813if.TERRAIN_PALETTES, true);
        mo4524(r14.f7346, C1813if.OBJECT_COLORS, C1813if.OBJECT_PALETTES, true);
        r14.f7338.f1300 = null;
        r14.f7346 = null;
        if (C0595nv.f2870) {
            try {
                GLES20.glActiveTexture(33986);
                int glGetError5 = GLES20.glGetError();
                this.f8358 = glGetError5;
                if (glGetError5 != 0) {
                    m2470(this.f8358);
                }
                GLES20.glBindTexture(3553, this.f8357.get(C1813if.COLORMAP.ordinal()));
                int glGetError6 = GLES20.glGetError();
                this.f8358 = glGetError6;
                if (glGetError6 != 0) {
                    m2470(this.f8358);
                }
                ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(r14.f7351.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
                asShortBuffer.put(r14.f7351);
                asShortBuffer.position(0);
                GLES20.glTexImage2D(3553, 0, 6408, r14.f7348, r14.f7352, 0, 6408, 32820, asShortBuffer);
                int glGetError7 = GLES20.glGetError();
                this.f8358 = glGetError7;
                if (glGetError7 != 0) {
                    m2470(this.f8358);
                }
                r14.f7351 = null;
            } catch (OutOfMemoryError unused) {
                throw new C0822tr("Not enough memory for lightmap. Disable lightmap and reduce texture quality in options.");
            }
        }
        mo4524(inVar, C1813if.SPRITE_COLORS, C1813if.SPRITE_PALETTES, true);
    }

    /* renamed from: 鷭 */
    private final int m2468(int i, String str, String str2) {
        int glCreateShader = GLES20.glCreateShader(i);
        int glGetError = GLES20.glGetError();
        this.f8358 = glGetError;
        if (glGetError != 0) {
            m2470(this.f8358);
        }
        GLES20.glShaderSource(glCreateShader, str);
        int glGetError2 = GLES20.glGetError();
        this.f8358 = glGetError2;
        if (glGetError2 != 0) {
            m2470(this.f8358);
        }
        GLES20.glCompileShader(glCreateShader);
        int glGetError3 = GLES20.glGetError();
        this.f8358 = glGetError3;
        if (glGetError3 != 0) {
            m2470(this.f8358);
        }
        int[] iArr = new int[10];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        int glGetError4 = GLES20.glGetError();
        this.f8358 = glGetError4;
        if (glGetError4 != 0) {
            m2470(this.f8358);
        }
        if (iArr[0] == 1) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        int glGetError5 = GLES20.glGetError();
        this.f8358 = glGetError5;
        if (glGetError5 != 0) {
            m2470(this.f8358);
        }
        C0592ns.m674(new StringBuilder(String.valueOf(str2)).append(" couldn't be compiled: ").toString());
        C0592ns.m674(glGetShaderInfoLog);
        return -1;
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        IntBuffer wrap = IntBuffer.wrap(new int[2]);
        GLES20.glGetIntegerv(3379, wrap);
        C0441in.f1306 = wrap.get(0);
        int glGetError = GLES20.glGetError();
        this.f8358 = glGetError;
        if (glGetError != 0) {
            m2470(this.f8358);
        }
        wrap.position(0);
        GLES20.glGetString(35724);
        int glGetError2 = GLES20.glGetError();
        this.f8358 = glGetError2;
        if (glGetError2 != 0) {
            m2470(this.f8358);
        }
        for (int i = 0; i < this.f8348.length; i++) {
            this.f8348[i] = new C1814(this, null);
            this.f8348[i].f8395 = GLES20.glCreateProgram();
            int glGetError3 = GLES20.glGetError();
            this.f8358 = glGetError3;
            if (glGetError3 != 0) {
                m2470(this.f8358);
            }
        }
        String sb = new StringBuilder(String.valueOf(C0595nv.f2870 ? "#define USE_COLORMAP\n" : "")).append(C0595nv.f2860 ? "#define INTERPOLATE\n" : "").toString();
        int[] iArr = new int[this.f8348.length];
        int[] iArr2 = new int[this.f8348.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            String r6 = C1815.m2485(i2);
            iArr2[i2] = -1;
            iArr[i2] = -1;
            int i3 = 0;
            while (i3 < 3) {
                if (iArr[i2] < 0) {
                    iArr[i2] = m2468(35633, new StringBuilder(String.valueOf(sb)).append("#define ").append(r6).append(i3 > 0 ? "\n#define TRY" + i3 : "").append("\n").append(this.f8346).toString(), "Vertex Shader " + r6 + (C0595nv.f2860 ? " [INTERPOLATE]" : "") + (i3 > 0 ? "[TRY" + i3 + "]" : ""));
                }
                if (iArr2[i2] < 0) {
                    iArr2[i2] = m2468(35632, new StringBuilder(String.valueOf(sb)).append("#define ").append(r6).append(i3 > 0 ? "\n#define TRY" + i3 : "").append("\n").append(this.f8347).toString(), "Fragment Shader " + r6 + (C0595nv.f2860 ? " [INTERPOLATE]" : "") + (i3 > 0 ? "[TRY" + i3 + "]" : ""));
                }
                i3++;
            }
        }
        for (int i4 = 0; i4 < this.f8348.length; i4++) {
            if (iArr[i4] < 0 || iArr2[i4] < 0) {
                this.f8348[i4] = null;
            } else {
                C1814 r62 = this.f8348[i4];
                int i5 = this.f8348[i4].f8395;
                GLES20.glAttachShader(i5, iArr[i4]);
                int glGetError4 = GLES20.glGetError();
                this.f8358 = glGetError4;
                if (glGetError4 != 0) {
                    m2470(this.f8358);
                }
                GLES20.glAttachShader(i5, iArr2[i4]);
                int glGetError5 = GLES20.glGetError();
                this.f8358 = glGetError5;
                if (glGetError5 != 0) {
                    m2470(this.f8358);
                }
                GLES20.glLinkProgram(i5);
                int glGetError6 = GLES20.glGetError();
                this.f8358 = glGetError6;
                if (glGetError6 != 0) {
                    m2470(this.f8358);
                }
                r62.f8381 = GLES20.glGetAttribLocation(i5, "in_vpos");
                int glGetError7 = GLES20.glGetError();
                this.f8358 = glGetError7;
                if (glGetError7 != 0) {
                    m2470(this.f8358);
                }
                r62.f8369 = GLES20.glGetAttribLocation(i5, "in_texcoord");
                int glGetError8 = GLES20.glGetError();
                this.f8358 = glGetError8;
                if (glGetError8 != 0) {
                    m2470(this.f8358);
                }
                r62.f8370 = GLES20.glGetAttribLocation(i5, "in_vmeshid");
                int glGetError9 = GLES20.glGetError();
                this.f8358 = glGetError9;
                if (glGetError9 != 0) {
                    m2470(this.f8358);
                }
                r62.f8371 = GLES20.glGetAttribLocation(i5, "in_vcolor");
                int glGetError10 = GLES20.glGetError();
                this.f8358 = glGetError10;
                if (glGetError10 != 0) {
                    m2470(this.f8358);
                }
                r62.f8392 = GLES20.glGetUniformLocation(i5, "in_wvp_mat");
                int glGetError11 = GLES20.glGetError();
                this.f8358 = glGetError11;
                if (glGetError11 != 0) {
                    m2470(this.f8358);
                }
                r62.f8383 = GLES20.glGetUniformLocation(i5, "in_obj_mesh_mats");
                int glGetError12 = GLES20.glGetError();
                this.f8358 = glGetError12;
                if (glGetError12 != 0) {
                    m2470(this.f8358);
                }
                r62.f8372 = GLES20.glGetUniformLocation(i5, "in_texture");
                int glGetError13 = GLES20.glGetError();
                this.f8358 = glGetError13;
                if (glGetError13 != 0) {
                    m2470(this.f8358);
                }
                r62.f8384 = GLES20.glGetUniformLocation(i5, "in_texture2");
                int glGetError14 = GLES20.glGetError();
                this.f8358 = glGetError14;
                if (glGetError14 != 0) {
                    m2470(this.f8358);
                }
                r62.f8389 = GLES20.glGetUniformLocation(i5, "in_texture_colormap");
                int glGetError15 = GLES20.glGetError();
                this.f8358 = glGetError15;
                if (glGetError15 != 0) {
                    m2470(this.f8358);
                }
                r62.f8373 = GLES20.glGetUniformLocation(i5, "in_pixel_atlas_size");
                int glGetError16 = GLES20.glGetError();
                this.f8358 = glGetError16;
                if (glGetError16 != 0) {
                    m2470(this.f8358);
                }
                r62.f8382 = GLES20.glGetUniformLocation(i5, "in_palette_atlas_size");
                int glGetError17 = GLES20.glGetError();
                this.f8358 = glGetError17;
                if (glGetError17 != 0) {
                    m2470(this.f8358);
                }
                r62.f8393 = GLES20.glGetUniformLocation(i5, "in_frame_idx");
                int glGetError18 = GLES20.glGetError();
                this.f8358 = glGetError18;
                if (glGetError18 != 0) {
                    m2470(this.f8358);
                }
                r62.f8387 = GLES20.glGetUniformLocation(i5, "in_frame_texcoords");
                int glGetError19 = GLES20.glGetError();
                this.f8358 = glGetError19;
                if (glGetError19 != 0) {
                    m2470(this.f8358);
                }
                r62.f8394 = GLES20.glGetUniformLocation(i5, "in_map_size");
                int glGetError20 = GLES20.glGetError();
                this.f8358 = glGetError20;
                if (glGetError20 != 0) {
                    m2470(this.f8358);
                }
                r62.f8385 = GLES20.glGetUniformLocation(i5, "in_transformation_mat");
                int glGetError21 = GLES20.glGetError();
                this.f8358 = glGetError21;
                if (glGetError21 != 0) {
                    m2470(this.f8358);
                }
                r62.f8390 = GLES20.glGetUniformLocation(i5, "in_camera_dist");
                int glGetError22 = GLES20.glGetError();
                this.f8358 = glGetError22;
                if (glGetError22 != 0) {
                    m2470(this.f8358);
                }
                r62.f8374 = GLES20.glGetUniformLocation(i5, "in_color");
                int glGetError23 = GLES20.glGetError();
                this.f8358 = glGetError23;
                if (glGetError23 != 0) {
                    m2470(this.f8358);
                }
                r62.f8375 = GLES20.glGetUniformLocation(i5, "debugcolor");
                int glGetError24 = GLES20.glGetError();
                this.f8358 = glGetError24;
                if (glGetError24 != 0) {
                    m2470(this.f8358);
                }
                r62.f8376 = GLES20.glGetUniformLocation(i5, "uViewModelMat");
                m2469();
                r62.f8396 = GLES20.glGetUniformLocation(i5, "uSpriteAngle");
                m2469();
                r62.f8386 = GLES20.glGetUniformLocation(i5, "uSpriteSize");
                m2469();
                r62.f8377 = GLES20.glGetUniformLocation(i5, "uSpriteOffset");
                m2469();
                r62.f8378 = GLES20.glGetUniformLocation(i5, "u3dPosition");
                m2469();
                r62.f8379 = GLES20.glGetUniformLocation(i5, "uSpriteDepth");
                m2469();
                r62.f8380 = GLES20.glGetUniformLocation(i5, "uSpriteZindex");
                m2469();
                r62.f8391 = GLES20.glGetUniformLocation(i5, "uParam");
                m2469();
                GLES20.glUseProgram(i5);
                int glGetError25 = GLES20.glGetError();
                this.f8358 = glGetError25;
                if (glGetError25 != 0) {
                    m2470(this.f8358);
                }
                GLES20.glUniform1i(r62.f8372, 0);
                int glGetError26 = GLES20.glGetError();
                this.f8358 = glGetError26;
                if (glGetError26 != 0) {
                    m2470(this.f8358);
                }
                GLES20.glUniform1i(r62.f8384, 1);
                int glGetError27 = GLES20.glGetError();
                this.f8358 = glGetError27;
                if (glGetError27 != 0) {
                    m2470(this.f8358);
                }
                if (C0595nv.f2870) {
                    GLES20.glUniform1i(r62.f8389, 2);
                }
                int glGetError28 = GLES20.glGetError();
                this.f8358 = glGetError28;
                if (glGetError28 != 0) {
                    m2470(this.f8358);
                }
            }
        }
        GLES20.glEnable(2929);
        int glGetError29 = GLES20.glGetError();
        this.f8358 = glGetError29;
        if (glGetError29 != 0) {
            m2470(this.f8358);
        }
        GLES20.glDepthFunc(515);
        int glGetError30 = GLES20.glGetError();
        this.f8358 = glGetError30;
        if (glGetError30 != 0) {
            m2470(this.f8358);
        }
        GLES20.glEnable(3042);
        int glGetError31 = GLES20.glGetError();
        this.f8358 = glGetError31;
        if (glGetError31 != 0) {
            m2470(this.f8358);
        }
        GLES20.glBlendFunc(770, 771);
        int glGetError32 = GLES20.glGetError();
        this.f8358 = glGetError32;
        if (glGetError32 != 0) {
            m2470(this.f8358);
        }
        GLES20.glLineWidth(4.0f);
        int glGetError33 = GLES20.glGetError();
        this.f8358 = glGetError33;
        if (glGetError33 != 0) {
            m2470(this.f8358);
        }
        GLES20.glPixelStorei(3317, 1);
        int glGetError34 = GLES20.glGetError();
        this.f8358 = glGetError34;
        if (glGetError34 != 0) {
            m2470(this.f8358);
        }
        GLES20.glPixelStorei(3333, 1);
        int glGetError35 = GLES20.glGetError();
        this.f8358 = glGetError35;
        if (glGetError35 != 0) {
            m2470(this.f8358);
        }
        if (this.f8351 == C0574na.READY) {
            C1014.f6148.mo3387(new C2050(this));
        }
    }

    static {
        int[] iArr = new int[16];
        iArr[2] = 1;
        iArr[3] = 768;
        iArr[4] = 769;
        iArr[5] = 770;
        iArr[6] = 771;
        iArr[7] = 772;
        iArr[8] = 773;
        iArr[9] = 774;
        iArr[10] = 775;
        iArr[11] = 776;
        iArr[14] = 32769;
        iArr[15] = 32772;
        f8345 = iArr;
    }

    /* renamed from: 鷭 */
    private static void m2470(int i) {
        int i2 = i - 1280;
        if (i2 < 0 || i2 >= f8344.length) {
            String str = "OpenGL error: Unknown error " + (i2 + 1280);
            Log.e("AndRO", str);
            throw new C0588no(str);
        }
        String str2 = "OpenGL error: " + f8344[i2];
        Log.e("AndRO", str2);
        throw new C0588no(str2);
    }

    /* renamed from: 鷭 */
    private static void m2469() {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            int i = glGetError - 1280;
            if (i < 0 || i >= f8344.length) {
                String str = "OpenGL error: Unknown error " + (i + 1280);
                Log.e("AndRO", str);
                throw new C0588no(str);
            }
            String str2 = "OpenGL error: " + f8344[i];
            Log.e("AndRO", str2);
            throw new C0588no(str2);
        }
    }

    /* renamed from: 鷭 */
    private final void m2482(C2014[] r11, int i) {
        if (r11 != null && i > 0) {
            C1814 r6 = this.f8348[C1815.OBJECT.f8408];
            GLES20.glUseProgram(r6.f8395);
            int glGetError = GLES20.glGetError();
            this.f8358 = glGetError;
            if (glGetError != 0) {
                m2470(this.f8358);
            }
            m2465(r6);
            C2014 r7 = null;
            GLES20.glEnableVertexAttribArray(r6.f8381);
            int glGetError2 = GLES20.glGetError();
            this.f8358 = glGetError2;
            if (glGetError2 != 0) {
                m2470(this.f8358);
            }
            GLES20.glEnableVertexAttribArray(r6.f8369);
            int glGetError3 = GLES20.glGetError();
            this.f8358 = glGetError3;
            if (glGetError3 != 0) {
                m2470(this.f8358);
            }
            GLES20.glEnableVertexAttribArray(r6.f8370);
            int glGetError4 = GLES20.glGetError();
            this.f8358 = glGetError4;
            if (glGetError4 != 0) {
                m2470(this.f8358);
            }
            int i2 = 0;
            while (i2 < i) {
                C2014 r8 = r11[i2];
                try {
                    GLES20.glUniformMatrix4fv(r6.f8383, r8.f8909.length / 16, false, r8.f8909, 0);
                    int glGetError5 = GLES20.glGetError();
                    this.f8358 = glGetError5;
                    if (glGetError5 != 0) {
                        m2470(this.f8358);
                    }
                    if (r7 == null || r8.f8910 != r7.f8910) {
                        GLES20.glDisableVertexAttribArray(r6.f8381);
                        int glGetError6 = GLES20.glGetError();
                        this.f8358 = glGetError6;
                        if (glGetError6 != 0) {
                            m2470(this.f8358);
                        }
                        GLES20.glDisableVertexAttribArray(r6.f8369);
                        int glGetError7 = GLES20.glGetError();
                        this.f8358 = glGetError7;
                        if (glGetError7 != 0) {
                            m2470(this.f8358);
                        }
                        GLES20.glDisableVertexAttribArray(r6.f8370);
                        int glGetError8 = GLES20.glGetError();
                        this.f8358 = glGetError8;
                        if (glGetError8 != 0) {
                            m2470(this.f8358);
                        }
                        GLES20.glVertexAttribPointer(r6.f8381, 4, 5126, false, 0, r8.f8910.f7249);
                        int glGetError9 = GLES20.glGetError();
                        this.f8358 = glGetError9;
                        if (glGetError9 != 0) {
                            m2470(this.f8358);
                        }
                        GLES20.glVertexAttribPointer(r6.f8369, 4, 5126, false, 0, r8.f8910.f7247);
                        int glGetError10 = GLES20.glGetError();
                        this.f8358 = glGetError10;
                        if (glGetError10 != 0) {
                            m2470(this.f8358);
                        }
                        GLES20.glVertexAttribPointer(r6.f8370, 1, 5126, false, 0, r8.f8910.f7248);
                        int glGetError11 = GLES20.glGetError();
                        this.f8358 = glGetError11;
                        if (glGetError11 != 0) {
                            m2470(this.f8358);
                        }
                        GLES20.glEnableVertexAttribArray(r6.f8381);
                        int glGetError12 = GLES20.glGetError();
                        this.f8358 = glGetError12;
                        if (glGetError12 != 0) {
                            m2470(this.f8358);
                        }
                        GLES20.glEnableVertexAttribArray(r6.f8369);
                        int glGetError13 = GLES20.glGetError();
                        this.f8358 = glGetError13;
                        if (glGetError13 != 0) {
                            m2470(this.f8358);
                        }
                        GLES20.glEnableVertexAttribArray(r6.f8370);
                        int glGetError14 = GLES20.glGetError();
                        this.f8358 = glGetError14;
                        if (glGetError14 != 0) {
                            m2470(this.f8358);
                        }
                    }
                    GLES20.glDrawArrays(4, 0, r8.f8910.f7249.capacity() / 4);
                    int glGetError15 = GLES20.glGetError();
                    this.f8358 = glGetError15;
                    if (glGetError15 != 0) {
                        m2470(this.f8358);
                    }
                    r7 = r8;
                    i2++;
                } catch (IllegalArgumentException e) {
                    throw new C0588no(e, "(6)" + C1014.m1833());
                }
            }
            GLES20.glDisableVertexAttribArray(r6.f8381);
            int glGetError16 = GLES20.glGetError();
            this.f8358 = glGetError16;
            if (glGetError16 != 0) {
                m2470(this.f8358);
            }
            GLES20.glDisableVertexAttribArray(r6.f8369);
            int glGetError17 = GLES20.glGetError();
            this.f8358 = glGetError17;
            if (glGetError17 != 0) {
                m2470(this.f8358);
            }
            GLES20.glDisableVertexAttribArray(r6.f8370);
            int glGetError18 = GLES20.glGetError();
            this.f8358 = glGetError18;
            if (glGetError18 != 0) {
                m2470(this.f8358);
            }
        }
    }

    /* renamed from: 鷭 */
    private final void m2479(C0604od[] odVarArr, int i, Point point) {
        if (odVarArr != null && i > 0) {
            GLES20.glEnable(2884);
            int glGetError = GLES20.glGetError();
            this.f8358 = glGetError;
            if (glGetError != 0) {
                m2470(this.f8358);
            }
            GLES20.glCullFace(1028);
            int glGetError2 = GLES20.glGetError();
            this.f8358 = glGetError2;
            if (glGetError2 != 0) {
                m2470(this.f8358);
            }
            C1814 r6 = this.f8348[C1815.TERRAIN.f8408];
            GLES20.glUseProgram(r6.f8395);
            int glGetError3 = GLES20.glGetError();
            this.f8358 = glGetError3;
            if (glGetError3 != 0) {
                m2470(this.f8358);
            }
            m2473(r6);
            GLES20.glUniform2f(r6.f8394, (float) point.x, (float) point.y);
            int glGetError4 = GLES20.glGetError();
            this.f8358 = glGetError4;
            if (glGetError4 != 0) {
                m2470(this.f8358);
            }
            for (int i2 = 0; i2 < i; i2++) {
                C0604od odVar = odVarArr[i2];
                if (odVar.f2968.capacity() != 0) {
                    GLES20.glVertexAttribPointer(r6.f8381, 4, 5126, false, 0, odVar.f2970);
                    int glGetError5 = GLES20.glGetError();
                    this.f8358 = glGetError5;
                    if (glGetError5 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glVertexAttribPointer(r6.f8369, 4, 5126, false, 0, odVar.f2969);
                    int glGetError6 = GLES20.glGetError();
                    this.f8358 = glGetError6;
                    if (glGetError6 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glEnableVertexAttribArray(r6.f8381);
                    int glGetError7 = GLES20.glGetError();
                    this.f8358 = glGetError7;
                    if (glGetError7 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glEnableVertexAttribArray(r6.f8369);
                    int glGetError8 = GLES20.glGetError();
                    this.f8358 = glGetError8;
                    if (glGetError8 != 0) {
                        m2470(this.f8358);
                    }
                    try {
                        GLES20.glDrawElements(4, odVar.f2968.capacity(), 5123, odVar.f2968);
                        int glGetError9 = GLES20.glGetError();
                        this.f8358 = glGetError9;
                        if (glGetError9 != 0) {
                            m2470(this.f8358);
                        }
                        GLES20.glDisableVertexAttribArray(r6.f8381);
                        int glGetError10 = GLES20.glGetError();
                        this.f8358 = glGetError10;
                        if (glGetError10 != 0) {
                            m2470(this.f8358);
                        }
                        GLES20.glDisableVertexAttribArray(r6.f8369);
                        int glGetError11 = GLES20.glGetError();
                        this.f8358 = glGetError11;
                        if (glGetError11 != 0) {
                            m2470(this.f8358);
                        }
                    } catch (RuntimeException e) {
                        throw new RuntimeException(e.getMessage() + " s.ib.capacity()=" + odVar.f2968.capacity() + "s.vb.capacity()=" + odVar.f2970.capacity() + "s.tb.capacity=" + odVar.f2969.capacity() + " map=" + C1014.f6142.f1695.f7353 + " hires_textures=" + C0595nv.f2868 + " use_colormap=" + C0595nv.f2870);
                    }
                }
            }
            GLES20.glDisable(2884);
            int glGetError12 = GLES20.glGetError();
            this.f8358 = glGetError12;
            if (glGetError12 != 0) {
                m2470(this.f8358);
            }
        }
    }

    /* renamed from: 鷭 */
    private final void m2478(C1814 r6, C1813if ifVar, C1813if ifVar2) {
        GLES20.glUniform3f(r6.f8373, 1.0f / ((float) this.f8350[ifVar.ordinal()].x), 1.0f / ((float) this.f8350[ifVar.ordinal()].y), 0.0f);
        int glGetError = GLES20.glGetError();
        this.f8358 = glGetError;
        if (glGetError != 0) {
            m2470(this.f8358);
        }
        GLES20.glUniform3f(r6.f8382, 1.0f / ((float) this.f8350[ifVar2.ordinal()].x), 1.0f / ((float) this.f8350[ifVar2.ordinal()].y), (float) (this.f8350[ifVar2.ordinal()].x / 16));
        int glGetError2 = GLES20.glGetError();
        this.f8358 = glGetError2;
        if (glGetError2 != 0) {
            m2470(this.f8358);
        }
        GLES20.glUniform1i(r6.f8375, C1014.f6139);
        int glGetError3 = GLES20.glGetError();
        this.f8358 = glGetError3;
        if (glGetError3 != 0) {
            m2470(this.f8358);
        }
    }

    /* renamed from: 鷭 */
    private final void m2480(C0604od[] odVarArr, int i, C0530ln lnVar) {
        if (lnVar != null && odVarArr != null && i > 0) {
            GLES20.glEnable(2884);
            int glGetError = GLES20.glGetError();
            this.f8358 = glGetError;
            if (glGetError != 0) {
                m2470(this.f8358);
            }
            GLES20.glCullFace(1028);
            int glGetError2 = GLES20.glGetError();
            this.f8358 = glGetError2;
            if (glGetError2 != 0) {
                m2470(this.f8358);
            }
            C1814 r6 = this.f8348[C1815.WATER.f8408];
            GLES20.glUseProgram(r6.f8395);
            int glGetError3 = GLES20.glGetError();
            this.f8358 = glGetError3;
            if (glGetError3 != 0) {
                m2470(this.f8358);
            }
            m2473(r6);
            GLES20.glUniform1f(r6.f8393, (float) ((int) ((System.currentTimeMillis() / 50) % ((long) lnVar.f1667.length))));
            int glGetError4 = GLES20.glGetError();
            this.f8358 = glGetError4;
            if (glGetError4 != 0) {
                m2470(this.f8358);
            }
            GLES20.glUniform3fv(r6.f8387, lnVar.f1666.length / 3, lnVar.f1666, 0);
            int glGetError5 = GLES20.glGetError();
            this.f8358 = glGetError5;
            if (glGetError5 != 0) {
                m2470(this.f8358);
            }
            for (int i2 = 0; i2 < i; i2++) {
                C0604od odVar = odVarArr[i2];
                GLES20.glVertexAttribPointer(r6.f8381, 4, 5126, false, 0, odVar.f2970);
                int glGetError6 = GLES20.glGetError();
                this.f8358 = glGetError6;
                if (glGetError6 != 0) {
                    m2470(this.f8358);
                }
                GLES20.glVertexAttribPointer(r6.f8369, 4, 5126, false, 0, odVar.f2969);
                int glGetError7 = GLES20.glGetError();
                this.f8358 = glGetError7;
                if (glGetError7 != 0) {
                    m2470(this.f8358);
                }
                GLES20.glEnableVertexAttribArray(r6.f8381);
                int glGetError8 = GLES20.glGetError();
                this.f8358 = glGetError8;
                if (glGetError8 != 0) {
                    m2470(this.f8358);
                }
                GLES20.glEnableVertexAttribArray(r6.f8369);
                int glGetError9 = GLES20.glGetError();
                this.f8358 = glGetError9;
                if (glGetError9 != 0) {
                    m2470(this.f8358);
                }
                GLES20.glDrawElements(4, odVar.f2968.capacity(), 5123, odVar.f2968);
                int glGetError10 = GLES20.glGetError();
                this.f8358 = glGetError10;
                if (glGetError10 != 0) {
                    m2470(this.f8358);
                }
                GLES20.glDisableVertexAttribArray(r6.f8381);
                int glGetError11 = GLES20.glGetError();
                this.f8358 = glGetError11;
                if (glGetError11 != 0) {
                    m2470(this.f8358);
                }
                GLES20.glDisableVertexAttribArray(r6.f8369);
                int glGetError12 = GLES20.glGetError();
                this.f8358 = glGetError12;
                if (glGetError12 != 0) {
                    m2470(this.f8358);
                }
            }
            GLES20.glDisable(2884);
            int glGetError13 = GLES20.glGetError();
            this.f8358 = glGetError13;
            if (glGetError13 != 0) {
                m2470(this.f8358);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4524(C0441in inVar, C1813if ifVar, C1813if ifVar2, boolean z) {
        C0442if[] ifVarArr;
        if (this.f8357 != null) {
            GLES20.glActiveTexture(33984);
            int glGetError = GLES20.glGetError();
            this.f8358 = glGetError;
            if (glGetError != 0) {
                m2470(this.f8358);
            }
            GLES20.glBindTexture(3553, this.f8357.get(ifVar.ordinal()));
            int glGetError2 = GLES20.glGetError();
            this.f8358 = glGetError2;
            if (glGetError2 != 0) {
                m2470(this.f8358);
            }
            if (z || inVar.f1315.x < inVar.f1313 || inVar.f1315.y < inVar.f1307) {
                try {
                    GLES20.glTexImage2D(3553, 0, 6406, inVar.f1313, inVar.f1307, 0, 6406, 5121, null);
                    int glGetError3 = GLES20.glGetError();
                    this.f8358 = glGetError3;
                    if (glGetError3 != 0) {
                        m2470(this.f8358);
                    }
                    for (C0442if ifVar3 : inVar.f1314) {
                        ifVar3.f1328 = false;
                    }
                    inVar.f1315.x = inVar.f1313;
                    inVar.f1315.y = inVar.f1307;
                } catch (RuntimeException e) {
                    if ((inVar.f1313 == 4096 || inVar.f1307 == 4096) && (C0595nv.f2868 || C0595nv.f2870)) {
                        c_activity c_activity = C1014.f6147;
                        c_activity.mo3387((Runnable) new C1296(c_activity, "Your device doesn't support HiRes textures / Color map.\nDisable them in game settings."));
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException unused) {
                        }
                    }
                    RuntimeException runtimeException = new RuntimeException("atlas.width=" + inVar.f1313 + "atlas.height=" + inVar.f1307 + " map=" + C1014.f6142.f1695.f7353 + " hires_textures=" + C0595nv.f2868);
                    runtimeException.initCause(e);
                    throw runtimeException;
                }
            }
            for (C0442if ifVar4 : inVar.f1314) {
                if (z || !ifVar4.f1328) {
                    ByteBuffer allocate = ByteBuffer.allocate(ifVar4.f1325 * ifVar4.f1326);
                    allocate.put(ifVar4.f1334, 0, ifVar4.f1325 * ifVar4.f1326);
                    if (ifVar4.f1331) {
                        allocate.position(0);
                        GLES20.glTexSubImage2D(3553, 0, ifVar4.f1330, ifVar4.f1329, ifVar4.f1325, ifVar4.f1326, 6406, 5121, allocate);
                        int glGetError4 = GLES20.glGetError();
                        this.f8358 = glGetError4;
                        if (glGetError4 != 0) {
                            m2470(this.f8358);
                        }
                    } else {
                        byte[] bArr = new byte[(ifVar4.f1325 * ifVar4.f1326)];
                        int i = 0;
                        for (int i2 = 1; i2 <= ifVar4.f1326; i2 <<= 1) {
                            if ((i2 & ifVar4.f1326) != 0) {
                                int i3 = 0;
                                for (int i4 = 1; i4 <= ifVar4.f1325; i4 <<= 1) {
                                    if ((i4 & ifVar4.f1325) != 0) {
                                        for (int i5 = 0; i5 < i2; i5++) {
                                            allocate.position(((i5 + i) * ifVar4.f1325) + i3);
                                            allocate.get(bArr, i5 * i4, i4);
                                        }
                                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                                        try {
                                            GLES20.glTexSubImage2D(3553, 0, ifVar4.f1330 + i3, ifVar4.f1329 + i, i4, i2, 6406, 5121, wrap);
                                            m2469();
                                            i3 += i4;
                                        } catch (RuntimeException e2) {
                                            throw new C0588no(e2, "texdata fn=" + ifVar4.f1333 + " x=" + ifVar4.f1330 + " y=" + ifVar4.f1329 + "w=" + ifVar4.f1325 + "h=" + ifVar4.f1326 + "; block = " + i4 + "x" + i2 + " at " + i3 + "," + i + " rem=" + wrap.remaining() + C1014.m1833());
                                        }
                                    }
                                }
                                i += i2;
                            }
                        }
                    }
                    ifVar4.f1328 = true;
                }
            }
            GLES20.glActiveTexture(33985);
            int glGetError5 = GLES20.glGetError();
            this.f8358 = glGetError5;
            if (glGetError5 != 0) {
                m2470(this.f8358);
            }
            GLES20.glBindTexture(3553, this.f8357.get(ifVar2.ordinal()));
            int glGetError6 = GLES20.glGetError();
            this.f8358 = glGetError6;
            if (glGetError6 != 0) {
                m2470(this.f8358);
            }
            GLES20.glTexImage2D(3553, 0, 6408, inVar.f1324 * 16, inVar.f1321 * 16, 0, 6408, 5121, IntBuffer.wrap(inVar.mo3838()));
            int glGetError7 = GLES20.glGetError();
            this.f8358 = glGetError7;
            if (glGetError7 != 0) {
                m2470(this.f8358);
            }
            this.f8350[ifVar.ordinal()] = new Point(inVar.f1313, inVar.f1307);
            this.f8350[ifVar2.ordinal()] = new Point(inVar.f1324 * 16, inVar.f1321 * 16);
        }
    }

    /* renamed from: 鷭 */
    private final void m2473(C1814 r3) {
        GLES20.glActiveTexture(33984);
        int glGetError = GLES20.glGetError();
        this.f8358 = glGetError;
        if (glGetError != 0) {
            m2470(this.f8358);
        }
        GLES20.glBindTexture(3553, this.f8357.get(C1813if.TERRAIN_COLORS.ordinal()));
        int glGetError2 = GLES20.glGetError();
        this.f8358 = glGetError2;
        if (glGetError2 != 0) {
            m2470(this.f8358);
        }
        GLES20.glActiveTexture(33985);
        int glGetError3 = GLES20.glGetError();
        this.f8358 = glGetError3;
        if (glGetError3 != 0) {
            m2470(this.f8358);
        }
        GLES20.glBindTexture(3553, this.f8357.get(C1813if.TERRAIN_PALETTES.ordinal()));
        int glGetError4 = GLES20.glGetError();
        this.f8358 = glGetError4;
        if (glGetError4 != 0) {
            m2470(this.f8358);
        }
        if (C0595nv.f2870) {
            GLES20.glActiveTexture(33986);
            int glGetError5 = GLES20.glGetError();
            this.f8358 = glGetError5;
            if (glGetError5 != 0) {
                m2470(this.f8358);
            }
            GLES20.glBindTexture(3553, this.f8357.get(C1813if.COLORMAP.ordinal()));
            int glGetError6 = GLES20.glGetError();
            this.f8358 = glGetError6;
            if (glGetError6 != 0) {
                m2470(this.f8358);
            }
        }
        m2478(r3, C1813if.TERRAIN_COLORS, C1813if.TERRAIN_PALETTES);
    }

    /* renamed from: 櫯 */
    private final void m2465(C1814 r3) {
        GLES20.glActiveTexture(33984);
        int glGetError = GLES20.glGetError();
        this.f8358 = glGetError;
        if (glGetError != 0) {
            m2470(this.f8358);
        }
        GLES20.glBindTexture(3553, this.f8357.get(C1813if.OBJECT_COLORS.ordinal()));
        int glGetError2 = GLES20.glGetError();
        this.f8358 = glGetError2;
        if (glGetError2 != 0) {
            m2470(this.f8358);
        }
        GLES20.glActiveTexture(33985);
        int glGetError3 = GLES20.glGetError();
        this.f8358 = glGetError3;
        if (glGetError3 != 0) {
            m2470(this.f8358);
        }
        GLES20.glBindTexture(3553, this.f8357.get(C1813if.OBJECT_PALETTES.ordinal()));
        int glGetError4 = GLES20.glGetError();
        this.f8358 = glGetError4;
        if (glGetError4 != 0) {
            m2470(this.f8358);
        }
        if (C0595nv.f2870) {
            GLES20.glActiveTexture(33986);
            int glGetError5 = GLES20.glGetError();
            this.f8358 = glGetError5;
            if (glGetError5 != 0) {
                m2470(this.f8358);
            }
            GLES20.glBindTexture(3553, this.f8357.get(C1813if.COLORMAP.ordinal()));
            int glGetError6 = GLES20.glGetError();
            this.f8358 = glGetError6;
            if (glGetError6 != 0) {
                m2470(this.f8358);
            }
        }
        m2478(r3, C1813if.OBJECT_COLORS, C1813if.OBJECT_PALETTES);
    }

    /* renamed from: ˮ͈ */
    private final void m2463(C1814 r3) {
        GLES20.glActiveTexture(33984);
        int glGetError = GLES20.glGetError();
        this.f8358 = glGetError;
        if (glGetError != 0) {
            m2470(this.f8358);
        }
        GLES20.glBindTexture(3553, this.f8357.get(C1813if.SPRITE_COLORS.ordinal()));
        int glGetError2 = GLES20.glGetError();
        this.f8358 = glGetError2;
        if (glGetError2 != 0) {
            m2470(this.f8358);
        }
        GLES20.glActiveTexture(33985);
        int glGetError3 = GLES20.glGetError();
        this.f8358 = glGetError3;
        if (glGetError3 != 0) {
            m2470(this.f8358);
        }
        GLES20.glBindTexture(3553, this.f8357.get(C1813if.SPRITE_PALETTES.ordinal()));
        int glGetError4 = GLES20.glGetError();
        this.f8358 = glGetError4;
        if (glGetError4 != 0) {
            m2470(this.f8358);
        }
        m2478(r3, C1813if.SPRITE_COLORS, C1813if.SPRITE_PALETTES);
    }

    /* renamed from: 鷭 */
    static int m2467(int i, int i2, Point point, byte[] bArr, int[] iArr) {
        int i3;
        Buffer buffer;
        if (point == null) {
            point = new Point();
        }
        point.x = C0622ot.m727(i);
        point.y = C0622ot.m727(i2);
        if (bArr != null) {
            if (!(i == point.x && i2 == point.y)) {
                byte[] bArr2 = new byte[(point.x * point.y)];
                for (int i4 = 0; i4 < point.y; i4++) {
                    for (int i5 = 0; i5 < point.x; i5++) {
                        if (i5 < i && i4 < i2) {
                            bArr2[(point.x * i4) + i5] = bArr[(i4 * i) + i5];
                        }
                    }
                }
                bArr = bArr2;
            }
            buffer = ByteBuffer.wrap(bArr);
            i3 = 6406;
        } else if (iArr != null) {
            buffer = IntBuffer.wrap(iArr);
            i3 = 6408;
        } else {
            C0592ns.m674("Attempt to create texture for already released frame.");
            return 0;
        }
        IntBuffer allocate = IntBuffer.allocate(1);
        GLES20.glGenTextures(1, allocate);
        m2469();
        int i6 = allocate.get(0);
        GLES20.glBindTexture(3553, i6);
        m2469();
        GLES20.glTexParameteri(3553, 10241, 9728);
        m2469();
        GLES20.glTexParameteri(3553, 10240, 9728);
        m2469();
        GLES20.glTexImage2D(3553, 0, i3, point.x, point.y, 0, i3, 5121, buffer);
        m2469();
        return i6;
    }

    /* renamed from: 鷭 */
    private final void m2476(C1814 r7, C0410 r8, C0616on onVar, C1341 r10, float f) {
        GLES20.glUniform4f(r7.f8374, onVar.f3008, onVar.f3007, onVar.f3006, onVar.f3009);
        int glGetError = GLES20.glGetError();
        this.f8358 = glGetError;
        if (glGetError != 0) {
            m2470(this.f8358);
        }
        GLES20.glUniform1f(r7.f8390, f);
        int glGetError2 = GLES20.glGetError();
        this.f8358 = glGetError2;
        if (glGetError2 != 0) {
            m2470(this.f8358);
        }
        try {
            GLES20.glUniformMatrix4fv(r7.f8385, 1, false, r10.f6874, 0);
            int glGetError3 = GLES20.glGetError();
            this.f8358 = glGetError3;
            if (glGetError3 != 0) {
                m2470(this.f8358);
            }
            GLES20.glVertexAttribPointer(r7.f8381, 4, 5126, false, 0, r8.f1176);
            int glGetError4 = GLES20.glGetError();
            this.f8358 = glGetError4;
            if (glGetError4 != 0) {
                m2470(this.f8358);
            }
            GLES20.glVertexAttribPointer(r7.f8369, 4, 5126, false, 0, r8.f1175);
            int glGetError5 = GLES20.glGetError();
            this.f8358 = glGetError5;
            if (glGetError5 != 0) {
                m2470(this.f8358);
            }
            GLES20.glVertexAttribPointer(r7.f8371, 4, 5121, false, 0, r8.f1178);
            int glGetError6 = GLES20.glGetError();
            this.f8358 = glGetError6;
            if (glGetError6 != 0) {
                m2470(this.f8358);
            }
            for (int i = 0; i < r8.f1172.size(); i++) {
                C0601oa oaVar = (C0601oa) r8.f1172.get(i);
                if (!(oaVar == null || oaVar.f2927 == null)) {
                    GLES20.glActiveTexture(33984);
                    int glGetError7 = GLES20.glGetError();
                    this.f8358 = glGetError7;
                    if (glGetError7 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glBindTexture(3553, oaVar.f2927.mo3782());
                    int glGetError8 = GLES20.glGetError();
                    this.f8358 = glGetError8;
                    if (glGetError8 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glActiveTexture(33985);
                    int glGetError9 = GLES20.glGetError();
                    this.f8358 = glGetError9;
                    if (glGetError9 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glBindTexture(3553, oaVar.f2926 == null ? oaVar.f2927.mo3781() : oaVar.f2926.mo3625());
                    int glGetError10 = GLES20.glGetError();
                    this.f8358 = glGetError10;
                    if (glGetError10 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glUniform3f(r7.f8373, 1.0f / ((float) oaVar.f2927.f1159.x), 1.0f / ((float) oaVar.f2927.f1159.y), 0.0f);
                    int glGetError11 = GLES20.glGetError();
                    this.f8358 = glGetError11;
                    if (glGetError11 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glUniform3f(r7.f8382, 0.0625f, 0.0625f, 1.0f);
                    int glGetError12 = GLES20.glGetError();
                    this.f8358 = glGetError12;
                    if (glGetError12 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glEnableVertexAttribArray(r7.f8381);
                    int glGetError13 = GLES20.glGetError();
                    this.f8358 = glGetError13;
                    if (glGetError13 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glEnableVertexAttribArray(r7.f8369);
                    int glGetError14 = GLES20.glGetError();
                    this.f8358 = glGetError14;
                    if (glGetError14 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glEnableVertexAttribArray(r7.f8371);
                    int glGetError15 = GLES20.glGetError();
                    this.f8358 = glGetError15;
                    if (glGetError15 != 0) {
                        m2470(this.f8358);
                    }
                    r8.f1177.position(i * 6);
                    GLES20.glDrawElements(4, 6, 5123, r8.f1177);
                    int glGetError16 = GLES20.glGetError();
                    this.f8358 = glGetError16;
                    if (glGetError16 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glDisableVertexAttribArray(r7.f8381);
                    int glGetError17 = GLES20.glGetError();
                    this.f8358 = glGetError17;
                    if (glGetError17 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glDisableVertexAttribArray(r7.f8369);
                    int glGetError18 = GLES20.glGetError();
                    this.f8358 = glGetError18;
                    if (glGetError18 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glDisableVertexAttribArray(r7.f8371);
                    int glGetError19 = GLES20.glGetError();
                    this.f8358 = glGetError19;
                    if (glGetError19 != 0) {
                        m2470(this.f8358);
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            throw new C0588no(e, "(8)" + C1014.m1833());
        }
    }

    /* renamed from: 鷭 */
    private final void m2477(C1814 r7, C1413 r8) {
        m2476(r7, r8.f6977, r8.f6985 ? f8342 : r8.f6979, r8.f6969, r8.f6970);
        if (r8.f6973 != null) {
            m2476(r7, r8.f6973, r8.f6979, r8.f6986, r8.f6970);
        }
        if (r8.f6982 != null) {
            m2476(r7, r8.f6982, f8343, r8.f6987, r8.f6970);
        }
        if (r8.f6981 != null) {
            m2476(r7, r8.f6981, r8.f6985 ? f8342 : r8.f6979, r8.f6984, r8.f6974);
        }
    }

    /* renamed from: 鷭 */
    private final void m2481(C1413[] r15) {
        if (r15 != null) {
            C1814 r6 = this.f8348[C1815.SPRITE.f8408];
            GLES20.glUseProgram(r6.f8395);
            int glGetError = GLES20.glGetError();
            this.f8358 = glGetError;
            if (glGetError != 0) {
                m2470(this.f8358);
            }
            C1413[] r10 = r15;
            int length = r15.length;
            for (int i = 0; i < length; i++) {
                C1413 r7 = r10[i];
                if (r7.f6988.f1706 != C0539.SCREEN && r7.f6979.f3009 == 1.0f) {
                    m2477(r6, r7);
                }
            }
            C1413[] r102 = r15;
            int length2 = r15.length;
            for (int i2 = 0; i2 < length2; i2++) {
                C1413 r72 = r102[i2];
                if (!(r72.f6988.f1706 == C0539.SCREEN || r72.f6979.f3009 == 1.0f)) {
                    m2477(r6, r72);
                }
            }
            GLES20.glDepthFunc(519);
            int glGetError2 = GLES20.glGetError();
            this.f8358 = glGetError2;
            if (glGetError2 != 0) {
                m2470(this.f8358);
            }
            C1413[] r103 = r15;
            int length3 = r15.length;
            for (int i3 = 0; i3 < length3; i3++) {
                C1413 r73 = r103[i3];
                if (r73.f6976 != null) {
                    m2476(r6, r73.f6976, r73.f6975, r73.f6989, r73.f6970);
                }
            }
            C1814 r62 = this.f8348[C1815.SPRITE2D.f8408];
            GLES20.glUseProgram(r62.f8395);
            int glGetError3 = GLES20.glGetError();
            this.f8358 = glGetError3;
            if (glGetError3 != 0) {
                m2470(this.f8358);
            }
            C1413[] r104 = r15;
            int length4 = r15.length;
            for (int i4 = 0; i4 < length4; i4++) {
                C1413 r74 = r104[i4];
                if (r74.f6988.f1706 == C0539.SCREEN) {
                    C0410 r11 = r74.f6977;
                    C0616on onVar = r74.f6979;
                    C1341 r13 = r74.f6969;
                    C1814 r75 = r62;
                    GLES20.glUniform4f(r75.f8374, onVar.f3008, onVar.f3007, onVar.f3006, onVar.f3009);
                    int glGetError4 = GLES20.glGetError();
                    this.f8358 = glGetError4;
                    if (glGetError4 != 0) {
                        m2470(this.f8358);
                    }
                    try {
                        GLES20.glUniformMatrix4fv(r75.f8385, 1, false, r13.f6874, 0);
                        int glGetError5 = GLES20.glGetError();
                        this.f8358 = glGetError5;
                        if (glGetError5 != 0) {
                            m2470(this.f8358);
                        }
                        GLES20.glVertexAttribPointer(r75.f8381, 4, 5126, false, 0, r11.f1176);
                        int glGetError6 = GLES20.glGetError();
                        this.f8358 = glGetError6;
                        if (glGetError6 != 0) {
                            m2470(this.f8358);
                        }
                        GLES20.glVertexAttribPointer(r75.f8369, 4, 5126, false, 0, r11.f1175);
                        int glGetError7 = GLES20.glGetError();
                        this.f8358 = glGetError7;
                        if (glGetError7 != 0) {
                            m2470(this.f8358);
                        }
                        for (int i5 = 0; i5 < r11.f1172.size(); i5++) {
                            C0601oa oaVar = (C0601oa) r11.f1172.get(i5);
                            if (!(oaVar == null || oaVar.f2927 == null)) {
                                GLES20.glActiveTexture(33984);
                                int glGetError8 = GLES20.glGetError();
                                this.f8358 = glGetError8;
                                if (glGetError8 != 0) {
                                    m2470(this.f8358);
                                }
                                GLES20.glBindTexture(3553, oaVar.f2927.mo3782());
                                int glGetError9 = GLES20.glGetError();
                                this.f8358 = glGetError9;
                                if (glGetError9 != 0) {
                                    m2470(this.f8358);
                                }
                                GLES20.glActiveTexture(33985);
                                int glGetError10 = GLES20.glGetError();
                                this.f8358 = glGetError10;
                                if (glGetError10 != 0) {
                                    m2470(this.f8358);
                                }
                                GLES20.glBindTexture(3553, oaVar.f2926 == null ? oaVar.f2927.mo3781() : oaVar.f2926.mo3625());
                                int glGetError11 = GLES20.glGetError();
                                this.f8358 = glGetError11;
                                if (glGetError11 != 0) {
                                    m2470(this.f8358);
                                }
                                GLES20.glUniform3f(r75.f8373, 1.0f / ((float) oaVar.f2927.f1159.x), 1.0f / ((float) oaVar.f2927.f1159.y), 0.0f);
                                int glGetError12 = GLES20.glGetError();
                                this.f8358 = glGetError12;
                                if (glGetError12 != 0) {
                                    m2470(this.f8358);
                                }
                                GLES20.glUniform3f(r75.f8382, 0.0625f, 0.0625f, 1.0f);
                                int glGetError13 = GLES20.glGetError();
                                this.f8358 = glGetError13;
                                if (glGetError13 != 0) {
                                    m2470(this.f8358);
                                }
                                GLES20.glEnableVertexAttribArray(r75.f8381);
                                int glGetError14 = GLES20.glGetError();
                                this.f8358 = glGetError14;
                                if (glGetError14 != 0) {
                                    m2470(this.f8358);
                                }
                                GLES20.glEnableVertexAttribArray(r75.f8369);
                                int glGetError15 = GLES20.glGetError();
                                this.f8358 = glGetError15;
                                if (glGetError15 != 0) {
                                    m2470(this.f8358);
                                }
                                r11.f1177.position(i5 * 6);
                                GLES20.glDrawElements(4, 6, 5123, r11.f1177);
                                int glGetError16 = GLES20.glGetError();
                                this.f8358 = glGetError16;
                                if (glGetError16 != 0) {
                                    m2470(this.f8358);
                                }
                                GLES20.glDisableVertexAttribArray(r75.f8381);
                                int glGetError17 = GLES20.glGetError();
                                this.f8358 = glGetError17;
                                if (glGetError17 != 0) {
                                    m2470(this.f8358);
                                }
                                GLES20.glDisableVertexAttribArray(r75.f8369);
                                int glGetError18 = GLES20.glGetError();
                                this.f8358 = glGetError18;
                                if (glGetError18 != 0) {
                                    m2470(this.f8358);
                                }
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw new C0588no(e, "(9)" + C1014.m1833());
                    }
                }
            }
            GLES20.glDepthFunc(515);
            int glGetError19 = GLES20.glGetError();
            this.f8358 = glGetError19;
            if (glGetError19 != 0) {
                m2470(this.f8358);
            }
        }
    }

    /* renamed from: 鷭 */
    private void m2474(C1814 r8, C0236cc ccVar) {
        if (ccVar.f591 != null) {
            float[] fArr = ccVar.f591.f6874;
            if (fArr != null) {
                try {
                    GLES20.glUniformMatrix4fv(r8.f8385, 1, false, fArr, 0);
                    int glGetError = GLES20.glGetError();
                    this.f8358 = glGetError;
                    if (glGetError != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glUniform4f(r8.f8374, ccVar.f586.f3008, ccVar.f586.f3007, ccVar.f586.f3006, ccVar.f586.f3009);
                    int glGetError2 = GLES20.glGetError();
                    this.f8358 = glGetError2;
                    if (glGetError2 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glVertexAttribPointer(r8.f8381, 3, 5126, false, 0, ccVar.f590);
                    int glGetError3 = GLES20.glGetError();
                    this.f8358 = glGetError3;
                    if (glGetError3 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glVertexAttribPointer(r8.f8369, 4, 5126, false, 0, ccVar.f592);
                    int glGetError4 = GLES20.glGetError();
                    this.f8358 = glGetError4;
                    if (glGetError4 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glEnableVertexAttribArray(r8.f8381);
                    int glGetError5 = GLES20.glGetError();
                    this.f8358 = glGetError5;
                    if (glGetError5 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glEnableVertexAttribArray(r8.f8369);
                    int glGetError6 = GLES20.glGetError();
                    this.f8358 = glGetError6;
                    if (glGetError6 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glDrawElements(4, ccVar.f589.capacity(), 5123, ccVar.f589);
                    int glGetError7 = GLES20.glGetError();
                    this.f8358 = glGetError7;
                    if (glGetError7 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glDisableVertexAttribArray(r8.f8381);
                    int glGetError8 = GLES20.glGetError();
                    this.f8358 = glGetError8;
                    if (glGetError8 != 0) {
                        m2470(this.f8358);
                    }
                    GLES20.glDisableVertexAttribArray(r8.f8369);
                    int glGetError9 = GLES20.glGetError();
                    this.f8358 = glGetError9;
                    if (glGetError9 != 0) {
                        m2470(this.f8358);
                    }
                } catch (IllegalArgumentException e) {
                    throw new C0588no(e, "(1)" + C1014.m1833());
                }
            }
        }
    }

    /* renamed from: 櫯 */
    private void m2466(C1413[] r7) {
        if (r7 != null) {
            GLES20.glDepthFunc(519);
            int glGetError = GLES20.glGetError();
            this.f8358 = glGetError;
            if (glGetError != 0) {
                m2470(this.f8358);
            }
            C1814 r2 = this.f8348[C1815.SPRITE2D.f8408];
            GLES20.glUseProgram(r2.f8395);
            int glGetError2 = GLES20.glGetError();
            this.f8358 = glGetError2;
            if (glGetError2 != 0) {
                m2470(this.f8358);
            }
            m2463(r2);
            C1413[] r5 = r7;
            int length = r7.length;
            for (int i = 0; i < length; i++) {
                C1413 r72 = r5[i];
                if (r72.f6971 != null) {
                    m2474(r2, r72.f6971);
                }
                if (r72.f6972 != null) {
                    m2474(r2, r72.f6972);
                }
                if (r72.f6980 != null) {
                    m2474(r2, r72.f6980);
                }
                if (r72.f6983 != null) {
                    m2474(r2, r72.f6983);
                }
                if (r72.f6978 != null) {
                    m2474(r2, r72.f6978);
                }
            }
            GLES20.glDepthFunc(515);
            int glGetError3 = GLES20.glGetError();
            this.f8358 = glGetError3;
            if (glGetError3 != 0) {
                m2470(this.f8358);
            }
        }
    }

    /* renamed from: 鷭 */
    private final void m2475(C1814 r7, C0245ci ciVar) {
        try {
            GLES20.glUniformMatrix4fv(r7.f8385, 1, false, ciVar.f591.f6874, 0);
            int glGetError = GLES20.glGetError();
            this.f8358 = glGetError;
            if (glGetError != 0) {
                m2470(this.f8358);
            }
            GLES20.glUniform4f(r7.f8374, ciVar.f586.f3008, ciVar.f586.f3007, ciVar.f586.f3006, ciVar.f586.f3009);
            int glGetError2 = GLES20.glGetError();
            this.f8358 = glGetError2;
            if (glGetError2 != 0) {
                m2470(this.f8358);
            }
            GLES20.glVertexAttribPointer(r7.f8381, 3, 5126, false, 0, ciVar.f590);
            int glGetError3 = GLES20.glGetError();
            this.f8358 = glGetError3;
            if (glGetError3 != 0) {
                m2470(this.f8358);
            }
            GLES20.glVertexAttribPointer(r7.f8369, 4, 5126, false, 0, ciVar.f592);
            int glGetError4 = GLES20.glGetError();
            this.f8358 = glGetError4;
            if (glGetError4 != 0) {
                m2470(this.f8358);
            }
            GLES20.glEnableVertexAttribArray(r7.f8381);
            int glGetError5 = GLES20.glGetError();
            this.f8358 = glGetError5;
            if (glGetError5 != 0) {
                m2470(this.f8358);
            }
            GLES20.glEnableVertexAttribArray(r7.f8369);
            int glGetError6 = GLES20.glGetError();
            this.f8358 = glGetError6;
            if (glGetError6 != 0) {
                m2470(this.f8358);
            }
            GLES20.glDrawElements(4, ciVar.f589.capacity(), 5123, ciVar.f589);
            int glGetError7 = GLES20.glGetError();
            this.f8358 = glGetError7;
            if (glGetError7 != 0) {
                m2470(this.f8358);
            }
            GLES20.glDisableVertexAttribArray(r7.f8381);
            int glGetError8 = GLES20.glGetError();
            this.f8358 = glGetError8;
            if (glGetError8 != 0) {
                m2470(this.f8358);
            }
            GLES20.glDisableVertexAttribArray(r7.f8369);
            int glGetError9 = GLES20.glGetError();
            this.f8358 = glGetError9;
            if (glGetError9 != 0) {
                m2470(this.f8358);
            }
        } catch (IllegalArgumentException e) {
            throw new C0588no(e, "(2)" + C1014.m1833());
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 155 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2472(p004o.C1739 r10) {
        /*
            r9 = this;
            r0 = 519(0x207, float:7.27E-43)
            android.opengl.GLES20.glDepthFunc(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r9.f8358 = r0
            if (r0 == 0) goto L_0x0012
            int r0 = r9.f8358
            m2470(r0)
        L_0x0012:
            o.騛$櫯[] r0 = r9.f8348
            o.騛$鷭 r1 = p004o.C1812.C1815.SPRITE2D
            int r1 = r1.f8408
            r6 = r0[r1]
            int r0 = r6.f8395
            android.opengl.GLES20.glUseProgram(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r9.f8358 = r0
            if (r0 == 0) goto L_0x002c
            int r0 = r9.f8358
            m2470(r0)
        L_0x002c:
            r9.m2465(r6)
            int r0 = r6.f8385     // Catch:{ IllegalArgumentException -> 0x0049 }
            o.ತ r1 = r10.f591     // Catch:{ IllegalArgumentException -> 0x0049 }
            float[] r1 = r1.f6874     // Catch:{ IllegalArgumentException -> 0x0049 }
            r2 = 1
            r3 = 0
            r4 = 0
            android.opengl.GLES20.glUniformMatrix4fv(r0, r2, r3, r1, r4)     // Catch:{ IllegalArgumentException -> 0x0049 }
            int r0 = android.opengl.GLES20.glGetError()     // Catch:{ IllegalArgumentException -> 0x0049 }
            r9.f8358 = r0     // Catch:{ IllegalArgumentException -> 0x0049 }
            if (r0 == 0) goto L_0x0063
            int r0 = r9.f8358     // Catch:{ IllegalArgumentException -> 0x0049 }
            m2470(r0)     // Catch:{ IllegalArgumentException -> 0x0049 }
            goto L_0x0063
        L_0x0049:
            r7 = move-exception
            o.no r0 = new o.no
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "(3)"
            r1.<init>(r2)
            java.lang.String r2 = p004o.C1014.m1833()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r7, r1)
            throw r0
        L_0x0063:
            int r0 = r6.f8374
            o.on r1 = r10.f586
            float r1 = r1.f3008
            o.on r2 = r10.f586
            float r2 = r2.f3007
            o.on r3 = r10.f586
            float r3 = r3.f3006
            o.on r4 = r10.f586
            float r4 = r4.f3009
            android.opengl.GLES20.glUniform4f(r0, r1, r2, r3, r4)
            int r0 = android.opengl.GLES20.glGetError()
            r9.f8358 = r0
            if (r0 == 0) goto L_0x0085
            int r0 = r9.f8358
            m2470(r0)
        L_0x0085:
            int r0 = r6.f8381
            java.nio.FloatBuffer r5 = r10.f590
            r1 = 3
            r2 = 5126(0x1406, float:7.183E-42)
            r3 = 0
            r4 = 0
            android.opengl.GLES20.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            int r0 = android.opengl.GLES20.glGetError()
            r9.f8358 = r0
            if (r0 == 0) goto L_0x009e
            int r0 = r9.f8358
            m2470(r0)
        L_0x009e:
            int r0 = r6.f8369
            java.nio.FloatBuffer r5 = r10.f592
            r1 = 4
            r2 = 5126(0x1406, float:7.183E-42)
            r3 = 0
            r4 = 0
            android.opengl.GLES20.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            int r0 = android.opengl.GLES20.glGetError()
            r9.f8358 = r0
            if (r0 == 0) goto L_0x00b7
            int r0 = r9.f8358
            m2470(r0)
        L_0x00b7:
            int r0 = r6.f8381
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r9.f8358 = r0
            if (r0 == 0) goto L_0x00c9
            int r0 = r9.f8358
            m2470(r0)
        L_0x00c9:
            int r0 = r6.f8369
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r9.f8358 = r0
            if (r0 == 0) goto L_0x00db
            int r0 = r9.f8358
            m2470(r0)
        L_0x00db:
            java.nio.ShortBuffer r0 = r10.f589
            int r0 = r0.capacity()
            java.nio.ShortBuffer r1 = r10.f589
            r2 = 4
            r3 = 5123(0x1403, float:7.179E-42)
            android.opengl.GLES20.glDrawElements(r2, r0, r3, r1)
            int r0 = android.opengl.GLES20.glGetError()
            r9.f8358 = r0
            if (r0 == 0) goto L_0x00f6
            int r0 = r9.f8358
            m2470(r0)
        L_0x00f6:
            int r0 = r6.f8381
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r9.f8358 = r0
            if (r0 == 0) goto L_0x0108
            int r0 = r9.f8358
            m2470(r0)
        L_0x0108:
            int r0 = r6.f8369
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r9.f8358 = r0
            if (r0 == 0) goto L_0x011a
            int r0 = r9.f8358
            m2470(r0)
        L_0x011a:
            o.䀠 r0 = r10.f8016
            r9.m2475(r6, r0)
            r9.m2463(r6)
            java.util.HashMap<java.lang.Integer, o.ཪཱུ> r0 = r10.f8015
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r8 = r0.iterator()
            goto L_0x0149
        L_0x012d:
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r7 = r0
            java.util.HashMap<java.lang.Integer, o.al> r0 = r10.f8014
            java.lang.Object r1 = r7.getKey()
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0149
            java.lang.Object r0 = r7.getValue()
            o.ci r0 = (p004o.C0245ci) r0
            r9.m2475(r6, r0)
        L_0x0149:
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L_0x012d
            java.util.HashMap<java.lang.Integer, o.al> r0 = r10.f8014
            java.util.Collection r0 = r0.values()
            java.util.Iterator r8 = r0.iterator()
            goto L_0x0164
        L_0x015a:
            java.lang.Object r0 = r8.next()
            o.ci r0 = (p004o.C0245ci) r0
            r7 = r0
            r9.m2475(r6, r7)
        L_0x0164:
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L_0x015a
            r0 = 515(0x203, float:7.22E-43)
            android.opengl.GLES20.glDepthFunc(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r9.f8358 = r0
            if (r0 == 0) goto L_0x017c
            int r0 = r9.f8358
            m2470(r0)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1812.m2472(o.脢):void");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 155 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2471(java.util.LinkedList<p004o.C1632> r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r9.size()
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            r0 = 519(0x207, float:7.27E-43)
            android.opengl.GLES20.glDepthFunc(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r8.f8358 = r0
            if (r0 == 0) goto L_0x001c
            int r0 = r8.f8358
            m2470(r0)
        L_0x001c:
            o.騛$櫯[] r0 = r8.f8348
            o.騛$鷭 r1 = p004o.C1812.C1815.SPRITE2D
            int r1 = r1.f8408
            r6 = r0[r1]
            int r0 = r6.f8395
            android.opengl.GLES20.glUseProgram(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r8.f8358 = r0
            if (r0 == 0) goto L_0x0036
            int r0 = r8.f8358
            m2470(r0)
        L_0x0036:
            r8.m2463(r6)
            java.util.Iterator r7 = r9.iterator()
            goto L_0x013d
        L_0x003f:
            java.lang.Object r0 = r7.next()
            o.柫 r0 = (p004o.C1632) r0
            r9 = r0
            o.ತ r0 = r9.f591
            if (r0 == 0) goto L_0x004f
            o.ತ r0 = r9.f591
            float[] r0 = r0.f6874
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 == 0) goto L_0x013d
            int r0 = r6.f8385     // Catch:{ IllegalArgumentException -> 0x006c }
            o.ತ r1 = r9.f591     // Catch:{ IllegalArgumentException -> 0x006c }
            float[] r1 = r1.f6874     // Catch:{ IllegalArgumentException -> 0x006c }
            r2 = 1
            r3 = 0
            r4 = 0
            android.opengl.GLES20.glUniformMatrix4fv(r0, r2, r3, r1, r4)     // Catch:{ IllegalArgumentException -> 0x006c }
            int r0 = android.opengl.GLES20.glGetError()     // Catch:{ IllegalArgumentException -> 0x006c }
            r8.f8358 = r0     // Catch:{ IllegalArgumentException -> 0x006c }
            if (r0 == 0) goto L_0x0086
            int r0 = r8.f8358     // Catch:{ IllegalArgumentException -> 0x006c }
            m2470(r0)     // Catch:{ IllegalArgumentException -> 0x006c }
            goto L_0x0086
        L_0x006c:
            r9 = move-exception
            o.no r0 = new o.no
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "(4)"
            r1.<init>(r2)
            java.lang.String r2 = p004o.C1014.m1833()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r9, r1)
            throw r0
        L_0x0086:
            int r0 = r6.f8374
            o.on r1 = r9.f586
            float r1 = r1.f3008
            o.on r2 = r9.f586
            float r2 = r2.f3007
            o.on r3 = r9.f586
            float r3 = r3.f3006
            o.on r4 = r9.f586
            float r4 = r4.f3009
            android.opengl.GLES20.glUniform4f(r0, r1, r2, r3, r4)
            int r0 = android.opengl.GLES20.glGetError()
            r8.f8358 = r0
            if (r0 == 0) goto L_0x00a8
            int r0 = r8.f8358
            m2470(r0)
        L_0x00a8:
            int r0 = r6.f8381
            java.nio.FloatBuffer r5 = r9.f590
            r1 = 3
            r2 = 5126(0x1406, float:7.183E-42)
            r3 = 0
            r4 = 0
            android.opengl.GLES20.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            int r0 = android.opengl.GLES20.glGetError()
            r8.f8358 = r0
            if (r0 == 0) goto L_0x00c1
            int r0 = r8.f8358
            m2470(r0)
        L_0x00c1:
            int r0 = r6.f8369
            java.nio.FloatBuffer r5 = r9.f592
            r1 = 4
            r2 = 5126(0x1406, float:7.183E-42)
            r3 = 0
            r4 = 0
            android.opengl.GLES20.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            int r0 = android.opengl.GLES20.glGetError()
            r8.f8358 = r0
            if (r0 == 0) goto L_0x00da
            int r0 = r8.f8358
            m2470(r0)
        L_0x00da:
            int r0 = r6.f8381
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r8.f8358 = r0
            if (r0 == 0) goto L_0x00ec
            int r0 = r8.f8358
            m2470(r0)
        L_0x00ec:
            int r0 = r6.f8369
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r8.f8358 = r0
            if (r0 == 0) goto L_0x00fe
            int r0 = r8.f8358
            m2470(r0)
        L_0x00fe:
            java.nio.ShortBuffer r0 = r9.f589
            int r0 = r0.capacity()
            java.nio.ShortBuffer r1 = r9.f589
            r2 = 4
            r3 = 5123(0x1403, float:7.179E-42)
            android.opengl.GLES20.glDrawElements(r2, r0, r3, r1)
            int r0 = android.opengl.GLES20.glGetError()
            r8.f8358 = r0
            if (r0 == 0) goto L_0x0119
            int r0 = r8.f8358
            m2470(r0)
        L_0x0119:
            int r0 = r6.f8381
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r8.f8358 = r0
            if (r0 == 0) goto L_0x012b
            int r0 = r8.f8358
            m2470(r0)
        L_0x012b:
            int r0 = r6.f8369
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r8.f8358 = r0
            if (r0 == 0) goto L_0x013d
            int r0 = r8.f8358
            m2470(r0)
        L_0x013d:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x003f
            r0 = 515(0x203, float:7.22E-43)
            android.opengl.GLES20.glDepthFunc(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1812.m2471(java.util.LinkedList):void");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 322 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2464(p004o.C1413[] r37) {
        /*
            r36 = this;
            if (r37 == 0) goto L_0x0007
            r0 = r37
            int r0 = r0.length
            if (r0 > 0) goto L_0x0008
        L_0x0007:
            return
        L_0x0008:
            r0 = 515(0x203, float:7.22E-43)
            android.opengl.GLES20.glDepthFunc(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r1 = r36
            r1.f8358 = r0
            if (r0 == 0) goto L_0x001e
            r0 = r36
            int r0 = r0.f8358
            m2470(r0)
        L_0x001e:
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glEnable(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r1 = r36
            r1.f8358 = r0
            if (r0 == 0) goto L_0x0034
            r0 = r36
            int r0 = r0.f8358
            m2470(r0)
        L_0x0034:
            r0 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glEnable(r0)
            int r0 = android.opengl.GLES20.glGetError()
            r1 = r36
            r1.f8358 = r0
            if (r0 == 0) goto L_0x004a
            r0 = r36
            int r0 = r0.f8358
            m2470(r0)
        L_0x004a:
            r9 = r37
            r0 = r37
            int r8 = r0.length
            r7 = 0
            goto L_0x0af1
        L_0x0052:
            r37 = r9[r7]
            java.lang.Class<o.mb> r0 = p004o.C0548mb.class
            r1 = r37
            o.lu r1 = r1.f6988
            java.lang.Class r1 = r1.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0aef
            r0 = r37
            o.lu r0 = r0.f6988
            o.mb r0 = (p004o.C0548mb) r0
            r10 = r0
            java.util.ArrayList<o.귊> r11 = r10.f1773
            monitor-enter(r11)
            r12 = 0
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0aec }
            java.util.ArrayList<o.귊> r0 = r10.f1773     // Catch:{ all -> 0x0aec }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0aec }
            goto L_0x0adf
        L_0x007b:
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x0aec }
            o.귊 r0 = (p004o.C1885) r0     // Catch:{ all -> 0x0aec }
            r13 = r0
            long r0 = r13.f8509     // Catch:{ all -> 0x0aec }
            long r0 = r15 - r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0adf
            r17 = 0
            java.util.ArrayList<o.䌮> r0 = r13.f8510     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x095d
            r0 = r36
            o.騛$櫯[] r0 = r0.f8348     // Catch:{ all -> 0x0aec }
            o.騛$鷭 r1 = p004o.C1812.C1815.EFFECT_PRIM     // Catch:{ all -> 0x0aec }
            int r1 = r1.f8408     // Catch:{ all -> 0x0aec }
            r37 = r0[r1]     // Catch:{ all -> 0x0aec }
            if (r37 == 0) goto L_0x095d
            r0 = r37
            int r0 = r0.f8395     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glUseProgram(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r36
            r1 = r37
            r0.m2463(r1)     // Catch:{ all -> 0x0aec }
            java.util.ArrayList<o.䌮> r0 = r13.f8510     // Catch:{ all -> 0x0aec }
            java.util.Iterator r21 = r0.iterator()     // Catch:{ all -> 0x0aec }
            goto L_0x094e
        L_0x00b7:
            r0 = r21
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0aec }
            o.䌮 r0 = (p004o.C1452) r0     // Catch:{ all -> 0x0aec }
            r19 = r0
            r18 = r19
            r0 = r19
            long r0 = r0.f7087     // Catch:{ all -> 0x0aec }
            long r0 = r15 - r0
            r28 = r0
            float r0 = (float) r0     // Catch:{ all -> 0x0aec }
            r1 = r19
            long r1 = r1.f7086     // Catch:{ all -> 0x0aec }
            float r1 = (float) r1     // Catch:{ all -> 0x0aec }
            float r20 = r0 / r1
            r22 = 0
            r23 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e0
            r0 = 0
            goto L_0x0761
        L_0x00e0:
            r24 = r19
            r0 = r19
            o.lj r0 = r0.f7085     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x00ef
            r0 = r24
            o.lj r0 = r0.f7085     // Catch:{ all -> 0x0aec }
            r24 = r0
            goto L_0x0108
        L_0x00ef:
            r0 = r24
            o.귊 r0 = r0.f7100     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x00fe
            r0 = r24
            o.귊 r0 = r0.f7100     // Catch:{ all -> 0x0aec }
            o.lj r24 = r0.mo4553()     // Catch:{ all -> 0x0aec }
            goto L_0x0108
        L_0x00fe:
            o.lj r24 = new o.lj     // Catch:{ all -> 0x0aec }
            r0 = r24
            r1 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)     // Catch:{ all -> 0x0aec }
        L_0x0108:
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7107     // Catch:{ all -> 0x0aec }
            r1 = r24
            float r1 = r1.f1652     // Catch:{ all -> 0x0aec }
            r2 = r19
            o.lj r2 = r2.f7094     // Catch:{ all -> 0x0aec }
            float r2 = r2.f1652     // Catch:{ all -> 0x0aec }
            float r1 = r1 + r2
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7107     // Catch:{ all -> 0x0aec }
            r1 = r24
            float r1 = r1.f1651     // Catch:{ all -> 0x0aec }
            r2 = r19
            o.lj r2 = r2.f7094     // Catch:{ all -> 0x0aec }
            float r2 = r2.f1651     // Catch:{ all -> 0x0aec }
            float r1 = r1 + r2
            r2 = 1
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7107     // Catch:{ all -> 0x0aec }
            r1 = r24
            float r1 = r1.f1650     // Catch:{ all -> 0x0aec }
            r2 = r19
            o.lj r2 = r2.f7094     // Catch:{ all -> 0x0aec }
            float r2 = r2.f1650     // Catch:{ all -> 0x0aec }
            float r1 = r1 + r2
            r2 = 2
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            o.ತ r26 = new o.ತ     // Catch:{ all -> 0x0aec }
            r1 = r26
            r1.<init>()     // Catch:{ all -> 0x0aec }
            r1 = r26
            float[] r1 = r1.f6874     // Catch:{ all -> 0x0aec }
            r2 = 0
            android.opengl.Matrix.setIdentityM(r1, r2)     // Catch:{ all -> 0x0aec }
            r1 = r26
            r0.f7109 = r1     // Catch:{ all -> 0x0aec }
            r0 = r19
            o.䌮$if[] r0 = r0.f7090     // Catch:{ all -> 0x0aec }
            r1 = 0
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x019a
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            o.ತ r0 = r0.f7109     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.䌮$if[] r1 = r1.f7090     // Catch:{ all -> 0x0aec }
            r2 = 0
            r26 = r1[r2]     // Catch:{ all -> 0x0aec }
            r27 = r20
            r1 = r26
            float[] r1 = r1.f7105     // Catch:{ all -> 0x0aec }
            r2 = 0
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 1
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r1 = r1 + r2
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 2
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r2 = r2 * r27
            float r1 = r1 + r2
            r2 = 1016003125(0x3c8efa35, float:0.017453292)
            float r23 = r1 * r2
            r1 = r23
            r0.mo4307(r1)     // Catch:{ all -> 0x0aec }
        L_0x019a:
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            o.ತ r26 = new o.ತ     // Catch:{ all -> 0x0aec }
            r1 = r26
            r1.<init>()     // Catch:{ all -> 0x0aec }
            r1 = r26
            float[] r1 = r1.f6874     // Catch:{ all -> 0x0aec }
            r2 = 0
            android.opengl.Matrix.setIdentityM(r1, r2)     // Catch:{ all -> 0x0aec }
            r1 = r26
            r0.f7112 = r1     // Catch:{ all -> 0x0aec }
            r0 = r19
            o.䌮$if[] r0 = r0.f7090     // Catch:{ all -> 0x0aec }
            r1 = 1
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x01ed
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            o.ತ r0 = r0.f7112     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.䌮$if[] r1 = r1.f7090     // Catch:{ all -> 0x0aec }
            r2 = 1
            r26 = r1[r2]     // Catch:{ all -> 0x0aec }
            r27 = r20
            r1 = r26
            float[] r1 = r1.f7105     // Catch:{ all -> 0x0aec }
            r2 = 0
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 1
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r1 = r1 + r2
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 2
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r2 = r2 * r27
            float r1 = r1 + r2
            r2 = 1016003125(0x3c8efa35, float:0.017453292)
            float r1 = r1 * r2
            r0.mo4308(r1)     // Catch:{ all -> 0x0aec }
        L_0x01ed:
            r0 = r19
            o.䌮$if[] r0 = r0.f7090     // Catch:{ all -> 0x0aec }
            r1 = 2
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x0229
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            o.ತ r0 = r0.f7112     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.䌮$if[] r1 = r1.f7090     // Catch:{ all -> 0x0aec }
            r2 = 2
            r26 = r1[r2]     // Catch:{ all -> 0x0aec }
            r27 = r20
            r1 = r26
            float[] r1 = r1.f7105     // Catch:{ all -> 0x0aec }
            r2 = 0
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 1
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r1 = r1 + r2
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 2
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r2 = r2 * r27
            float r1 = r1 + r2
            r2 = 1016003125(0x3c8efa35, float:0.017453292)
            float r1 = r1 * r2
            r0.mo4309(r1)     // Catch:{ all -> 0x0aec }
        L_0x0229:
            r0 = r19
            o.䌮$if[] r0 = r0.f7090     // Catch:{ all -> 0x0aec }
            r1 = 3
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x0265
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            o.ತ r0 = r0.f7112     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.䌮$if[] r1 = r1.f7090     // Catch:{ all -> 0x0aec }
            r2 = 3
            r26 = r1[r2]     // Catch:{ all -> 0x0aec }
            r27 = r20
            r1 = r26
            float[] r1 = r1.f7105     // Catch:{ all -> 0x0aec }
            r2 = 0
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 1
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r1 = r1 + r2
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 2
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r2 = r2 * r27
            float r1 = r1 + r2
            r2 = 1016003125(0x3c8efa35, float:0.017453292)
            float r1 = r1 * r2
            r0.mo4307(r1)     // Catch:{ all -> 0x0aec }
        L_0x0265:
            r0 = r19
            float r0 = r0.f7095     // Catch:{ all -> 0x0aec }
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0277
            r0 = r19
            o.䌮$if[] r0 = r0.f7101     // Catch:{ all -> 0x0aec }
            r1 = 3
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
            if (r0 != 0) goto L_0x027a
        L_0x0277:
            r25 = 0
            goto L_0x02ae
        L_0x027a:
            r0 = r19
            o.䌮$if[] r0 = r0.f7101     // Catch:{ all -> 0x0aec }
            r1 = 3
            r26 = r0[r1]     // Catch:{ all -> 0x0aec }
            r27 = r20
            r0 = r26
            float[] r0 = r0.f7105     // Catch:{ all -> 0x0aec }
            r1 = 0
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
            r1 = r26
            float[] r1 = r1.f7105     // Catch:{ all -> 0x0aec }
            r2 = 1
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            float r1 = r1 * r27
            float r0 = r0 + r1
            r1 = r26
            float[] r1 = r1.f7105     // Catch:{ all -> 0x0aec }
            r2 = 2
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            float r1 = r1 * r27
            float r1 = r1 * r27
            float r0 = r0 + r1
            r1 = 1016003125(0x3c8efa35, float:0.017453292)
            float r0 = r0 * r1
            float r0 = android.util.FloatMath.sin(r0)     // Catch:{ all -> 0x0aec }
            r1 = r19
            float r1 = r1.f7095     // Catch:{ all -> 0x0aec }
            float r25 = r0 * r1
        L_0x02ae:
            r24 = 0
            goto L_0x032e
        L_0x02b2:
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7106     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.䌮$if[] r1 = r1.f7081     // Catch:{ all -> 0x0aec }
            r1 = r1[r24]     // Catch:{ all -> 0x0aec }
            if (r1 != 0) goto L_0x02c2
            r1 = 0
            goto L_0x02ec
        L_0x02c2:
            r1 = r19
            o.䌮$if[] r1 = r1.f7081     // Catch:{ all -> 0x0aec }
            r26 = r1[r24]     // Catch:{ all -> 0x0aec }
            r27 = r20
            r1 = r26
            float[] r1 = r1.f7105     // Catch:{ all -> 0x0aec }
            r2 = 0
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 1
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r1 = r1 + r2
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 2
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r2 = r2 * r27
            float r1 = r1 + r2
            r2 = r19
            float r2 = r2.f7083     // Catch:{ all -> 0x0aec }
            float r1 = r1 * r2
        L_0x02ec:
            r0[r24] = r1     // Catch:{ all -> 0x0aec }
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7108     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.䌮$if[] r1 = r1.f7101     // Catch:{ all -> 0x0aec }
            r1 = r1[r24]     // Catch:{ all -> 0x0aec }
            if (r1 != 0) goto L_0x02fe
            r1 = 0
            goto L_0x0323
        L_0x02fe:
            r1 = r19
            o.䌮$if[] r1 = r1.f7101     // Catch:{ all -> 0x0aec }
            r26 = r1[r24]     // Catch:{ all -> 0x0aec }
            r27 = r20
            r1 = r26
            float[] r1 = r1.f7105     // Catch:{ all -> 0x0aec }
            r2 = 0
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 1
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r1 = r1 + r2
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 2
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r2 = r2 * r27
            float r1 = r1 + r2
        L_0x0323:
            float r1 = r25 + r1
            r2 = r19
            float r2 = r2.f7083     // Catch:{ all -> 0x0aec }
            float r1 = r1 * r2
            r0[r24] = r1     // Catch:{ all -> 0x0aec }
            int r24 = r24 + 1
        L_0x032e:
            r0 = r24
            r1 = 3
            if (r0 < r1) goto L_0x02b2
            r0 = r19
            o.䌮$if[] r0 = r0.f7081     // Catch:{ all -> 0x0aec }
            r1 = 3
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x0363
            r0 = r19
            o.䌮$if[] r0 = r0.f7081     // Catch:{ all -> 0x0aec }
            r1 = 3
            r26 = r0[r1]     // Catch:{ all -> 0x0aec }
            r27 = r20
            r0 = r26
            float[] r0 = r0.f7105     // Catch:{ all -> 0x0aec }
            r1 = 0
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
            r1 = r26
            float[] r1 = r1.f7105     // Catch:{ all -> 0x0aec }
            r2 = 1
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            float r1 = r1 * r27
            float r0 = r0 + r1
            r1 = r26
            float[] r1 = r1.f7105     // Catch:{ all -> 0x0aec }
            r2 = 2
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            float r1 = r1 * r27
            float r1 = r1 * r27
            float r22 = r0 + r1
        L_0x0363:
            r0 = r19
            float[] r0 = r0.f7082     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x0385
            r24 = 0
            goto L_0x037c
        L_0x036c:
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7110     // Catch:{ all -> 0x0aec }
            r1 = r19
            float[] r1 = r1.f7082     // Catch:{ all -> 0x0aec }
            r1 = r1[r24]     // Catch:{ all -> 0x0aec }
            r0[r24] = r1     // Catch:{ all -> 0x0aec }
            int r24 = r24 + 1
        L_0x037c:
            r0 = r19
            float[] r0 = r0.f7082     // Catch:{ all -> 0x0aec }
            int r0 = r0.length     // Catch:{ all -> 0x0aec }
            r1 = r24
            if (r1 < r0) goto L_0x036c
        L_0x0385:
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7110     // Catch:{ all -> 0x0aec }
            r1 = r19
            float r1 = r1.f7102     // Catch:{ all -> 0x0aec }
            r2 = 3
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r19
            float r0 = r0.f7092     // Catch:{ all -> 0x0aec }
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x03af
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7110     // Catch:{ all -> 0x0aec }
            r1 = r19
            float r1 = r1.f7102     // Catch:{ all -> 0x0aec }
            float r1 = r1 * r20
            r2 = r19
            float r2 = r2.f7092     // Catch:{ all -> 0x0aec }
            float r1 = r1 / r2
            r2 = 3
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            goto L_0x03d2
        L_0x03af:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r20
            r1 = r19
            float r1 = r1.f7098     // Catch:{ all -> 0x0aec }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03d2
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7110     // Catch:{ all -> 0x0aec }
            r1 = r19
            float r1 = r1.f7102     // Catch:{ all -> 0x0aec }
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r20
            float r1 = r1 * r2
            r2 = r19
            float r2 = r2.f7098     // Catch:{ all -> 0x0aec }
            float r1 = r1 / r2
            r2 = 3
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
        L_0x03d2:
            r0 = r19
            o.hk r0 = r0.f7103     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x062f
            r0 = r19
            o.hk r0 = r0.f7103     // Catch:{ all -> 0x0aec }
            o.hk$if r0 = r0.f1147     // Catch:{ all -> 0x0aec }
            o.hk$if r1 = p004o.C0405hk.C0406if.EXT_SPR     // Catch:{ all -> 0x0aec }
            if (r0 != r1) goto L_0x0620
            r34 = r28
            r25 = r22
            r24 = r19
            r0 = r19
            o.hk r0 = r0.f7103     // Catch:{ all -> 0x0aec }
            o.tb r0 = r0.f1148     // Catch:{ all -> 0x0aec }
            o.tb$鷭[] r0 = r0.f4682     // Catch:{ all -> 0x0aec }
            r1 = 0
            r26 = r0[r1]     // Catch:{ all -> 0x0aec }
            r0 = r26
            float r0 = r0.f4691     // Catch:{ all -> 0x0aec }
            r27 = r0
            r0 = r34
            float r0 = (float) r0     // Catch:{ all -> 0x0aec }
            float r0 = r0 / r27
            int r1 = (int) r0     // Catch:{ all -> 0x0aec }
            r27 = r1
            r0 = r26
            o.tb$鷭$鷭[] r0 = r0.f4692     // Catch:{ all -> 0x0aec }
            int r0 = r0.length     // Catch:{ all -> 0x0aec }
            r1 = r27
            if (r1 < r0) goto L_0x0411
            r0 = r26
            o.tb$鷭$鷭[] r0 = r0.f4692     // Catch:{ all -> 0x0aec }
            int r0 = r0.length     // Catch:{ all -> 0x0aec }
            int r27 = r0 + -1
        L_0x0411:
            r0 = r26
            o.tb$鷭$鷭[] r0 = r0.f4692     // Catch:{ all -> 0x0aec }
            r0 = r0[r27]     // Catch:{ all -> 0x0aec }
            o.tb$鷭$鷭$if[] r0 = r0.f4697     // Catch:{ all -> 0x0aec }
            int r1 = r0.length     // Catch:{ all -> 0x0aec }
            r28 = r1
            r0 = r24
            o.䌮$鷭[] r0 = r0.f7093     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x044c
            r0 = r24
            o.䌮$鷭[] r0 = r0.f7093     // Catch:{ all -> 0x0aec }
            r32 = r0
            r0 = r32
            int r0 = r0.length     // Catch:{ all -> 0x0aec }
            r31 = r0
            r30 = 0
            goto L_0x0446
        L_0x0430:
            r29 = r32[r30]     // Catch:{ all -> 0x0aec }
            if (r29 == 0) goto L_0x0444
            r0 = r29
            long r0 = r0.f7115     // Catch:{ all -> 0x0aec }
            long r0 = r34 - r0
            r2 = r24
            long r2 = r2.f7099     // Catch:{ all -> 0x0aec }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0444
            int r28 = r28 + 1
        L_0x0444:
            int r30 = r30 + 1
        L_0x0446:
            r0 = r30
            r1 = r31
            if (r0 < r1) goto L_0x0430
        L_0x044c:
            r0 = r28
            o.䌮$鷭[] r0 = new p004o.C1452.C1454[r0]     // Catch:{ all -> 0x0aec }
            r29 = r0
            r28 = 0
            r0 = r26
            o.tb$鷭$鷭[] r0 = r0.f4692     // Catch:{ all -> 0x0aec }
            r0 = r0[r27]     // Catch:{ all -> 0x0aec }
            o.tb$鷭$鷭$if[] r1 = r0.f4697     // Catch:{ all -> 0x0aec }
            r26 = r1
            r0 = r26
            int r0 = r0.length     // Catch:{ all -> 0x0aec }
            r32 = r0
            r31 = 0
            goto L_0x0590
        L_0x0467:
            r30 = r26[r31]     // Catch:{ all -> 0x0aec }
            o.䌮$鷭 r27 = new o.䌮$鷭     // Catch:{ all -> 0x0aec }
            r0 = r24
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            r1 = r27
            r2 = r24
            r1.<init>(r0)     // Catch:{ all -> 0x0aec }
            r0 = r34
            r2 = r27
            r2.f7115 = r0     // Catch:{ all -> 0x0aec }
            r0 = r30
            int r0 = r0.f4709     // Catch:{ all -> 0x0aec }
            if (r0 <= 0) goto L_0x048f
            r0 = r24
            o.hk r0 = r0.f7103     // Catch:{ all -> 0x0aec }
            o.hk$鷭[] r0 = r0.f1145     // Catch:{ all -> 0x0aec }
            r1 = r30
            int r1 = r1.f4708     // Catch:{ all -> 0x0aec }
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
            goto L_0x049b
        L_0x048f:
            r0 = r24
            o.hk r0 = r0.f7103     // Catch:{ all -> 0x0aec }
            o.hk$鷭[] r0 = r0.f1144     // Catch:{ all -> 0x0aec }
            r1 = r30
            int r1 = r1.f4708     // Catch:{ all -> 0x0aec }
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
        L_0x049b:
            r1 = r27
            r1.f7111 = r0     // Catch:{ all -> 0x0aec }
            r0 = r27
            float[] r0 = r0.f7108     // Catch:{ all -> 0x0aec }
            r1 = 0
            r1 = r0[r1]     // Catch:{ all -> 0x0aec }
            r2 = r30
            float r2 = r2.f4702     // Catch:{ all -> 0x0aec }
            r3 = r27
            o.hk$鷭 r3 = r3.f7111     // Catch:{ all -> 0x0aec }
            int r3 = r3.f1157     // Catch:{ all -> 0x0aec }
            float r3 = (float) r3     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r3
            r3 = r30
            int r3 = r3.f4706     // Catch:{ all -> 0x0aec }
            if (r3 == 0) goto L_0x04ba
            r3 = -1
            goto L_0x04bb
        L_0x04ba:
            r3 = 1
        L_0x04bb:
            float r3 = (float) r3     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r3
            float r1 = r1 * r2
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r27
            float[] r0 = r0.f7108     // Catch:{ all -> 0x0aec }
            r1 = 1
            r1 = r0[r1]     // Catch:{ all -> 0x0aec }
            r2 = r30
            float r2 = r2.f4703     // Catch:{ all -> 0x0aec }
            r3 = r27
            o.hk$鷭 r3 = r3.f7111     // Catch:{ all -> 0x0aec }
            int r3 = r3.f1158     // Catch:{ all -> 0x0aec }
            float r3 = (float) r3     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r3
            float r1 = r1 * r2
            r2 = 1
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r30
            int r0 = r0.f4704     // Catch:{ all -> 0x0aec }
            if (r0 <= 0) goto L_0x04ee
            r0 = r27
            o.ತ r0 = r0.f7109     // Catch:{ all -> 0x0aec }
            r1 = r30
            int r1 = r1.f4704     // Catch:{ all -> 0x0aec }
            float r1 = (float) r1     // Catch:{ all -> 0x0aec }
            r2 = 1016003125(0x3c8efa35, float:0.017453292)
            float r1 = r1 * r2
            r0.mo4307(r1)     // Catch:{ all -> 0x0aec }
        L_0x04ee:
            r0 = r27
            float[] r0 = r0.f7107     // Catch:{ all -> 0x0aec }
            r1 = 0
            r1 = r0[r1]     // Catch:{ all -> 0x0aec }
            r2 = r27
            float[] r2 = r2.f7106     // Catch:{ all -> 0x0aec }
            r3 = 0
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            r3 = r27
            o.ತ r3 = r3.f7112     // Catch:{ all -> 0x0aec }
            float[] r3 = r3.f6874     // Catch:{ all -> 0x0aec }
            r4 = 4
            r3 = r3[r4]     // Catch:{ all -> 0x0aec }
            float r3 = r3 * r25
            float r2 = r2 + r3
            float r1 = r1 + r2
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r27
            float[] r0 = r0.f7107     // Catch:{ all -> 0x0aec }
            r1 = 1
            r1 = r0[r1]     // Catch:{ all -> 0x0aec }
            r2 = r27
            float[] r2 = r2.f7106     // Catch:{ all -> 0x0aec }
            r3 = 1
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            r3 = r27
            o.ತ r3 = r3.f7112     // Catch:{ all -> 0x0aec }
            float[] r3 = r3.f6874     // Catch:{ all -> 0x0aec }
            r4 = 5
            r3 = r3[r4]     // Catch:{ all -> 0x0aec }
            float r3 = r3 * r25
            float r2 = r2 + r3
            float r1 = r1 + r2
            r2 = 1
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r27
            float[] r0 = r0.f7107     // Catch:{ all -> 0x0aec }
            r1 = 2
            r1 = r0[r1]     // Catch:{ all -> 0x0aec }
            r2 = r27
            float[] r2 = r2.f7106     // Catch:{ all -> 0x0aec }
            r3 = 2
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            r3 = r27
            o.ತ r3 = r3.f7112     // Catch:{ all -> 0x0aec }
            float[] r3 = r3.f6874     // Catch:{ all -> 0x0aec }
            r4 = 6
            r3 = r3[r4]     // Catch:{ all -> 0x0aec }
            float r3 = r3 * r25
            float r2 = r2 + r3
            float r1 = r1 + r2
            r2 = 2
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r27
            float[] r0 = r0.f7106     // Catch:{ all -> 0x0aec }
            r1 = r30
            int r1 = r1.f4713     // Catch:{ all -> 0x0aec }
            float r1 = (float) r1     // Catch:{ all -> 0x0aec }
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r27
            float[] r0 = r0.f7106     // Catch:{ all -> 0x0aec }
            r1 = r30
            int r1 = r1.f4711     // Catch:{ all -> 0x0aec }
            float r1 = (float) r1     // Catch:{ all -> 0x0aec }
            r2 = 1
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r27
            float[] r0 = r0.f7106     // Catch:{ all -> 0x0aec }
            r1 = 0
            r2 = 2
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r33 = 0
            goto L_0x0583
        L_0x056b:
            r0 = r27
            float[] r0 = r0.f7110     // Catch:{ all -> 0x0aec }
            r1 = r0[r33]     // Catch:{ all -> 0x0aec }
            r2 = r30
            int r2 = r2.f4701     // Catch:{ all -> 0x0aec }
            int r3 = r33 << 3
            int r2 = r2 >> r3
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2     // Catch:{ all -> 0x0aec }
            r3 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 / r3
            float r1 = r1 * r2
            r0[r33] = r1     // Catch:{ all -> 0x0aec }
            int r33 = r33 + 1
        L_0x0583:
            r0 = r33
            r1 = 4
            if (r0 < r1) goto L_0x056b
            r0 = r28
            int r28 = r28 + 1
            r29[r0] = r27     // Catch:{ all -> 0x0aec }
            int r31 = r31 + 1
        L_0x0590:
            r0 = r31
            r1 = r32
            if (r0 < r1) goto L_0x0467
            r0 = r24
            o.䌮$鷭[] r0 = r0.f7093     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x0619
            r0 = r24
            o.䌮$鷭[] r0 = r0.f7093     // Catch:{ all -> 0x0aec }
            r26 = r0
            r0 = r26
            int r0 = r0.length     // Catch:{ all -> 0x0aec }
            r32 = r0
            r31 = 0
            goto L_0x0613
        L_0x05ab:
            r30 = r26[r31]     // Catch:{ all -> 0x0aec }
            if (r30 == 0) goto L_0x0611
            r0 = r30
            long r0 = r0.f7115     // Catch:{ all -> 0x0aec }
            long r0 = r34 - r0
            r2 = r24
            long r2 = r2.f7099     // Catch:{ all -> 0x0aec }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0611
            r0 = r30
            long r0 = r0.f7115     // Catch:{ all -> 0x0aec }
            long r0 = r34 - r0
            float r0 = (float) r0     // Catch:{ all -> 0x0aec }
            r1 = r24
            long r1 = r1.f7099     // Catch:{ all -> 0x0aec }
            float r1 = (float) r1     // Catch:{ all -> 0x0aec }
            float r27 = r0 / r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 - r27
            r1 = r30
            float r1 = r1.f7114     // Catch:{ all -> 0x0aec }
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r2 - r1
            float r33 = r0 / r1
            r25 = 0
            goto L_0x05e8
        L_0x05dc:
            r0 = r30
            float[] r0 = r0.f7108     // Catch:{ all -> 0x0aec }
            r1 = r0[r25]     // Catch:{ all -> 0x0aec }
            float r1 = r1 * r33
            r0[r25] = r1     // Catch:{ all -> 0x0aec }
            int r25 = r25 + 1
        L_0x05e8:
            r0 = r25
            r1 = 4
            if (r0 < r1) goto L_0x05dc
            r0 = r30
            float[] r0 = r0.f7110     // Catch:{ all -> 0x0aec }
            r1 = 3
            r1 = r0[r1]     // Catch:{ all -> 0x0aec }
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r27
            r3 = r30
            float r3 = r3.f7114     // Catch:{ all -> 0x0aec }
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 - r3
            float r2 = r2 / r3
            float r1 = r1 * r2
            r2 = 3
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r27
            r1 = r30
            r1.f7114 = r0     // Catch:{ all -> 0x0aec }
            r0 = r28
            int r28 = r28 + 1
            r29[r0] = r30     // Catch:{ all -> 0x0aec }
        L_0x0611:
            int r31 = r31 + 1
        L_0x0613:
            r0 = r31
            r1 = r32
            if (r0 < r1) goto L_0x05ab
        L_0x0619:
            r0 = r29
            r1 = r24
            r1.f7093 = r0     // Catch:{ all -> 0x0aec }
            goto L_0x062f
        L_0x0620:
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.hk r1 = r1.f7103     // Catch:{ all -> 0x0aec }
            o.hk$鷭[] r1 = r1.f1144     // Catch:{ all -> 0x0aec }
            r2 = 0
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            r0.f7111 = r1     // Catch:{ all -> 0x0aec }
        L_0x062f:
            r0 = r19
            float r0 = r0.f7083     // Catch:{ all -> 0x0aec }
            float r22 = r22 * r0
            int[] r0 = p004o.C1452.m2152()     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.if r1 = r1.f7084     // Catch:{ all -> 0x0aec }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0aec }
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
            switch(r0) {
                case 1: goto L_0x065a;
                case 2: goto L_0x065a;
                case 3: goto L_0x0760;
                case 4: goto L_0x06e3;
                case 5: goto L_0x0690;
                case 6: goto L_0x0760;
                case 7: goto L_0x0722;
                default: goto L_0x0646;
            }     // Catch:{ all -> 0x0aec }
        L_0x0646:
            goto L_0x0760
        L_0x065a:
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7106     // Catch:{ all -> 0x0aec }
            r1 = 0
            r1 = r0[r1]     // Catch:{ all -> 0x0aec }
            double r1 = (double) r1     // Catch:{ all -> 0x0aec }
            r3 = r22
            double r3 = (double) r3     // Catch:{ all -> 0x0aec }
            r5 = r23
            double r5 = (double) r5     // Catch:{ all -> 0x0aec }
            double r5 = java.lang.Math.sin(r5)     // Catch:{ all -> 0x0aec }
            double r3 = r3 * r5
            double r1 = r1 - r3
            float r1 = (float) r1     // Catch:{ all -> 0x0aec }
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7106     // Catch:{ all -> 0x0aec }
            r1 = 1
            r1 = r0[r1]     // Catch:{ all -> 0x0aec }
            double r1 = (double) r1     // Catch:{ all -> 0x0aec }
            r3 = r22
            double r3 = (double) r3     // Catch:{ all -> 0x0aec }
            r5 = r23
            double r5 = (double) r5     // Catch:{ all -> 0x0aec }
            double r5 = java.lang.Math.cos(r5)     // Catch:{ all -> 0x0aec }
            double r3 = r3 * r5
            double r1 = r1 + r3
            float r1 = (float) r1     // Catch:{ all -> 0x0aec }
            r2 = 1
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            goto L_0x0760
        L_0x0690:
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7108     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.䌮$if[] r1 = r1.f7101     // Catch:{ all -> 0x0aec }
            r2 = 3
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            if (r1 != 0) goto L_0x06a1
            r1 = 0
            goto L_0x06de
        L_0x06a1:
            r1 = r19
            o.䌮$if[] r1 = r1.f7101     // Catch:{ all -> 0x0aec }
            r2 = 3
            r26 = r1[r2]     // Catch:{ all -> 0x0aec }
            r27 = r20
            r1 = r26
            float[] r1 = r1.f7105     // Catch:{ all -> 0x0aec }
            r2 = 0
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 1
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r1 = r1 + r2
            r2 = r26
            float[] r2 = r2.f7105     // Catch:{ all -> 0x0aec }
            r3 = 2
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r2 = r2 * r27
            float r2 = r2 * r27
            float r1 = r1 + r2
            r2 = 1016003125(0x3c8efa35, float:0.017453292)
            float r1 = r1 * r2
            double r1 = (double) r1     // Catch:{ all -> 0x0aec }
            double r1 = java.lang.Math.tan(r1)     // Catch:{ all -> 0x0aec }
            float r1 = (float) r1     // Catch:{ all -> 0x0aec }
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            r2 = r19
            o.䌮$鷭 r2 = r2.f7096     // Catch:{ all -> 0x0aec }
            float[] r2 = r2.f7108     // Catch:{ all -> 0x0aec }
            r3 = 1
            r2 = r2[r3]     // Catch:{ all -> 0x0aec }
            float r1 = r1 * r2
        L_0x06de:
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            goto L_0x0760
        L_0x06e3:
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7108     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.䌮$鷭 r1 = r1.f7096     // Catch:{ all -> 0x0aec }
            float[] r2 = r1.f7108     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.䌮$鷭 r1 = r1.f7096     // Catch:{ all -> 0x0aec }
            float[] r1 = r1.f7108     // Catch:{ all -> 0x0aec }
            r3 = 0
            r1 = r1[r3]     // Catch:{ all -> 0x0aec }
            int r1 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0708
            r1 = r19
            o.䌮$鷭 r1 = r1.f7096     // Catch:{ all -> 0x0aec }
            float[] r1 = r1.f7108     // Catch:{ all -> 0x0aec }
            r3 = 0
            r1 = r1[r3]     // Catch:{ all -> 0x0aec }
            float r1 = r22 - r1
            goto L_0x0709
        L_0x0708:
            r1 = 0
        L_0x0709:
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x0aec }
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7108     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.䌮$鷭 r1 = r1.f7096     // Catch:{ all -> 0x0aec }
            float[] r1 = r1.f7108     // Catch:{ all -> 0x0aec }
            r2 = 3
            r1[r2] = r22     // Catch:{ all -> 0x0aec }
            r1 = 2
            r0[r1] = r22     // Catch:{ all -> 0x0aec }
            goto L_0x0760
        L_0x0722:
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7108     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.䌮$鷭 r1 = r1.f7096     // Catch:{ all -> 0x0aec }
            float[] r2 = r1.f7108     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.䌮$鷭 r1 = r1.f7096     // Catch:{ all -> 0x0aec }
            float[] r1 = r1.f7108     // Catch:{ all -> 0x0aec }
            r3 = 0
            r1 = r1[r3]     // Catch:{ all -> 0x0aec }
            int r1 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0747
            r1 = r19
            o.䌮$鷭 r1 = r1.f7096     // Catch:{ all -> 0x0aec }
            float[] r1 = r1.f7108     // Catch:{ all -> 0x0aec }
            r3 = 0
            r1 = r1[r3]     // Catch:{ all -> 0x0aec }
            float r1 = r22 - r1
            goto L_0x0748
        L_0x0747:
            r1 = 0
        L_0x0748:
            r3 = 3
            r2[r3] = r1     // Catch:{ all -> 0x0aec }
            r2 = 2
            r0[r2] = r1     // Catch:{ all -> 0x0aec }
            r0 = r19
            o.䌮$鷭 r0 = r0.f7096     // Catch:{ all -> 0x0aec }
            float[] r0 = r0.f7108     // Catch:{ all -> 0x0aec }
            r1 = r19
            o.䌮$鷭 r1 = r1.f7096     // Catch:{ all -> 0x0aec }
            float[] r1 = r1.f7108     // Catch:{ all -> 0x0aec }
            r2 = 1
            r1[r2] = r22     // Catch:{ all -> 0x0aec }
            r1 = 0
            r0[r1] = r22     // Catch:{ all -> 0x0aec }
        L_0x0760:
            r0 = 1
        L_0x0761:
            if (r0 != 0) goto L_0x076a
            r0 = r18
            r0.mo4344()     // Catch:{ all -> 0x0aec }
            goto L_0x094e
        L_0x076a:
            r17 = 1
            r0 = r18
            o.hk r0 = r0.f7103     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x094e
            r0 = 515(0x203, float:7.22E-43)
            android.opengl.GLES20.glDepthFunc(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glEnable(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8379     // Catch:{ all -> 0x0aec }
            r1 = r18
            float r1 = r1.f7091     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glUniform1f(r0, r1)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8391     // Catch:{ all -> 0x0aec }
            r1 = r18
            boolean r1 = r1.f7080     // Catch:{ all -> 0x0aec }
            if (r1 == 0) goto L_0x079c
            r1 = 1
            goto L_0x079d
        L_0x079c:
            r1 = 0
        L_0x079d:
            float r1 = (float) r1     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glUniform1f(r0, r1)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8380     // Catch:{ all -> 0x0aec }
            r1 = r18
            float r1 = r1.f7097     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glUniform1f(r0, r1)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r18
            boolean r0 = r0.f7078     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x07ba
            r0 = 1
            goto L_0x07bc
        L_0x07ba:
            r0 = 771(0x303, float:1.08E-42)
        L_0x07bc:
            r1 = 770(0x302, float:1.079E-42)
            android.opengl.GLES20.glBlendFunc(r1, r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8381     // Catch:{ all -> 0x0aec }
            java.nio.FloatBuffer r5 = p004o.C1452.f7076     // Catch:{ all -> 0x0aec }
            r1 = 3
            r2 = 5126(0x1406, float:7.183E-42)
            r3 = 0
            r4 = 0
            android.opengl.GLES20.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8369     // Catch:{ all -> 0x0aec }
            java.nio.FloatBuffer r5 = p004o.C1452.f7075     // Catch:{ all -> 0x0aec }
            r1 = 3
            r2 = 5126(0x1406, float:7.183E-42)
            r3 = 0
            r4 = 0
            android.opengl.GLES20.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8381     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glEnableVertexAttribArray(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8369     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glEnableVertexAttribArray(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r18
            boolean r0 = r0.f7079     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x0808
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glDisable(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
        L_0x0808:
            r0 = r18
            o.䌮$鷭[] r0 = r0.f7093     // Catch:{ all -> 0x0aec }
            r23 = r0
            r0 = r23
            int r0 = r0.length     // Catch:{ all -> 0x0aec }
            r20 = r0
            r19 = 0
            goto L_0x0926
        L_0x0817:
            r22 = r23[r19]     // Catch:{ all -> 0x0aec }
            if (r22 == 0) goto L_0x0924
            r0 = r22
            float[] r0 = r0.f7110     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x0924
            r0 = r37
            int r0 = r0.f8374     // Catch:{ all -> 0x0aec }
            r1 = r22
            float[] r1 = r1.f7110     // Catch:{ all -> 0x0aec }
            r2 = 1
            r3 = 0
            android.opengl.GLES20.glUniform4fv(r0, r2, r1, r3)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r22
            o.hk$鷭 r0 = r0.f7111     // Catch:{ all -> 0x0aec }
            int r0 = r0.mo3782()     // Catch:{ all -> 0x0aec }
            r1 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r1, r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8373     // Catch:{ all -> 0x0aec }
            r1 = r22
            o.hk$鷭 r1 = r1.f7111     // Catch:{ all -> 0x0aec }
            android.graphics.Point r1 = r1.f1159     // Catch:{ all -> 0x0aec }
            int r1 = r1.x     // Catch:{ all -> 0x0aec }
            float r1 = (float) r1     // Catch:{ all -> 0x0aec }
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2 / r1
            r2 = r22
            o.hk$鷭 r2 = r2.f7111     // Catch:{ all -> 0x0aec }
            android.graphics.Point r2 = r2.f1159     // Catch:{ all -> 0x0aec }
            int r2 = r2.y     // Catch:{ all -> 0x0aec }
            float r2 = (float) r2     // Catch:{ all -> 0x0aec }
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 / r2
            r3 = 0
            android.opengl.GLES20.glUniform3f(r0, r1, r2, r3)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8387     // Catch:{ all -> 0x0aec }
            r1 = r22
            o.hk$鷭 r1 = r1.f7111     // Catch:{ all -> 0x0aec }
            int r1 = r1.f1157     // Catch:{ all -> 0x0aec }
            float r1 = (float) r1     // Catch:{ all -> 0x0aec }
            r2 = r22
            o.hk$鷭 r2 = r2.f7111     // Catch:{ all -> 0x0aec }
            int r2 = r2.f1158     // Catch:{ all -> 0x0aec }
            float r2 = (float) r2     // Catch:{ all -> 0x0aec }
            r3 = 0
            r4 = 0
            android.opengl.GLES20.glUniform4f(r0, r1, r2, r3, r4)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = 33985(0x84c1, float:4.7623E-41)
            android.opengl.GLES20.glActiveTexture(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r22
            o.hk$鷭 r0 = r0.f7111     // Catch:{ all -> 0x0aec }
            int r0 = r0.mo3781()     // Catch:{ all -> 0x0aec }
            r1 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r1, r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8382     // Catch:{ all -> 0x0aec }
            r1 = 1031798784(0x3d800000, float:0.0625)
            r2 = 1031798784(0x3d800000, float:0.0625)
            r3 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glUniform3f(r0, r1, r2, r3)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8386     // Catch:{ all -> 0x0aec }
            r1 = r22
            float[] r1 = r1.f7108     // Catch:{ all -> 0x0aec }
            r2 = 1
            r3 = 0
            android.opengl.GLES20.glUniform4fv(r0, r2, r1, r3)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8377     // Catch:{ all -> 0x0aec }
            r1 = r22
            float[] r1 = r1.f7106     // Catch:{ all -> 0x0aec }
            r2 = 1
            r3 = 0
            android.opengl.GLES20.glUniform3fv(r0, r2, r1, r3)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8378     // Catch:{ all -> 0x0aec }
            r1 = r22
            float[] r1 = r1.f7107     // Catch:{ all -> 0x0aec }
            r2 = 1
            r3 = 0
            android.opengl.GLES20.glUniform4fv(r0, r2, r1, r3)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8396     // Catch:{ all -> 0x0aec }
            r1 = r22
            o.ತ r1 = r1.f7109     // Catch:{ all -> 0x0aec }
            float[] r1 = r1.f6874     // Catch:{ all -> 0x0aec }
            r2 = 1
            r3 = 0
            r4 = 0
            android.opengl.GLES20.glUniformMatrix4fv(r0, r2, r3, r1, r4)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8385     // Catch:{ all -> 0x0aec }
            r1 = r22
            o.ತ r1 = r1.f7112     // Catch:{ all -> 0x0aec }
            float[] r1 = r1.f6874     // Catch:{ all -> 0x0aec }
            r2 = 1
            r3 = 0
            r4 = 0
            android.opengl.GLES20.glUniformMatrix4fv(r0, r2, r3, r1, r4)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            java.nio.ShortBuffer r0 = p004o.C1452.f7073     // Catch:{ all -> 0x0aec }
            r1 = r18
            int r1 = r1.f7089     // Catch:{ all -> 0x0aec }
            int r1 = r1 * 3
            r0.position(r1)     // Catch:{ all -> 0x0aec }
            r0 = r18
            int r0 = r0.f7077     // Catch:{ all -> 0x0aec }
            int r0 = r0 * 3
            java.nio.ShortBuffer r1 = p004o.C1452.f7073     // Catch:{ all -> 0x0aec }
            r2 = 4
            r3 = 5123(0x1403, float:7.179E-42)
            android.opengl.GLES20.glDrawElements(r2, r0, r3, r1)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
        L_0x0924:
            int r19 = r19 + 1
        L_0x0926:
            r0 = r19
            r1 = r20
            if (r0 < r1) goto L_0x0817
            r0 = r18
            boolean r0 = r0.f7079     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x093a
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glEnable(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
        L_0x093a:
            r0 = r37
            int r0 = r0.f8381     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glDisableVertexAttribArray(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8369     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glDisableVertexAttribArray(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
        L_0x094e:
            r0 = r21
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x0aec }
            if (r0 != 0) goto L_0x00b7
            if (r17 != 0) goto L_0x0adf
            r0 = 0
            r13.f8510 = r0     // Catch:{ all -> 0x0aec }
            goto L_0x0adf
        L_0x095d:
            o.co r0 = r13.f8511     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x0adb
            o.co r0 = r13.f8511     // Catch:{ all -> 0x0aec }
            o.ti r0 = r0.f646     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x0adb
            r0 = r36
            o.騛$櫯[] r0 = r0.f8348     // Catch:{ all -> 0x0aec }
            o.騛$鷭 r1 = p004o.C1812.C1815.STR_EFFECT     // Catch:{ all -> 0x0aec }
            int r1 = r1.f8408     // Catch:{ all -> 0x0aec }
            r37 = r0[r1]     // Catch:{ all -> 0x0aec }
            if (r37 == 0) goto L_0x0adb
            o.co r0 = r13.f8511     // Catch:{ all -> 0x0aec }
            o.ti r1 = r0.f646     // Catch:{ all -> 0x0aec }
            r18 = r1
            long r0 = r13.f8509     // Catch:{ all -> 0x0aec }
            long r21 = r15 - r0
            r0 = r18
            int r0 = r0.f4946     // Catch:{ all -> 0x0aec }
            long r0 = (long) r0     // Catch:{ all -> 0x0aec }
            long r0 = r0 * r21
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            int r2 = (int) r0     // Catch:{ all -> 0x0aec }
            r19 = r2
            o.co r0 = r13.f8511     // Catch:{ all -> 0x0aec }
            boolean r0 = r0.f644     // Catch:{ all -> 0x0aec }
            if (r0 == 0) goto L_0x09a2
            r0 = r18
            int r0 = r0.f4951     // Catch:{ all -> 0x0aec }
            r1 = r19
            if (r1 <= r0) goto L_0x09a2
            o.co r0 = r13.f8511     // Catch:{ all -> 0x0aec }
            r0.mo3601()     // Catch:{ all -> 0x0aec }
            r0 = 0
            r13.f8511 = r0     // Catch:{ all -> 0x0aec }
            goto L_0x0adf
        L_0x09a2:
            r0 = r18
            int r0 = r0.f4951     // Catch:{ all -> 0x0aec }
            int r0 = r0 + 1
            int r19 = r19 % r0
            r0 = r37
            int r0 = r0.f8395     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glUseProgram(r0)     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8381     // Catch:{ all -> 0x0aec }
            o.co r1 = r13.f8511     // Catch:{ all -> 0x0aec }
            java.nio.FloatBuffer r5 = r1.f641     // Catch:{ all -> 0x0aec }
            r1 = 2
            r2 = 5126(0x1406, float:7.183E-42)
            r3 = 0
            r4 = 0
            android.opengl.GLES20.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8369     // Catch:{ all -> 0x0aec }
            o.co r1 = r13.f8511     // Catch:{ all -> 0x0aec }
            java.nio.FloatBuffer r5 = r1.f642     // Catch:{ all -> 0x0aec }
            r1 = 4
            r2 = 5126(0x1406, float:7.183E-42)
            r3 = 0
            r4 = 0
            android.opengl.GLES20.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8381     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glEnableVertexAttribArray(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8369     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glEnableVertexAttribArray(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            o.lj r20 = r13.mo4553()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8378     // Catch:{ all -> 0x0aec }
            r1 = r20
            float r1 = r1.f1652     // Catch:{ all -> 0x0aec }
            r2 = r20
            float r2 = r2.f1651     // Catch:{ all -> 0x0aec }
            r3 = r20
            float r3 = r3.f1650     // Catch:{ all -> 0x0aec }
            r4 = 0
            android.opengl.GLES20.glUniform4f(r0, r1, r2, r3, r4)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r18
            int[] r0 = r0.f4947     // Catch:{ all -> 0x0aec }
            r23 = r0[r19]     // Catch:{ all -> 0x0aec }
            goto L_0x0aba
        L_0x0a0e:
            o.co r0 = r13.f8511     // Catch:{ all -> 0x0aec }
            o.hk[] r0 = r0.f645     // Catch:{ all -> 0x0aec }
            r1 = r18
            int[] r1 = r1.f4949     // Catch:{ all -> 0x0aec }
            r1 = r1[r23]     // Catch:{ all -> 0x0aec }
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
            o.hk$鷭[] r0 = r0.f1144     // Catch:{ all -> 0x0aec }
            r1 = 0
            r17 = r0[r1]     // Catch:{ all -> 0x0aec }
            r0 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r17
            int r0 = r0.mo3782()     // Catch:{ all -> 0x0aec }
            r1 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r1, r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8373     // Catch:{ all -> 0x0aec }
            r1 = r17
            android.graphics.Point r1 = r1.f1159     // Catch:{ all -> 0x0aec }
            int r1 = r1.x     // Catch:{ all -> 0x0aec }
            float r1 = (float) r1     // Catch:{ all -> 0x0aec }
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2 / r1
            r2 = r17
            android.graphics.Point r2 = r2.f1159     // Catch:{ all -> 0x0aec }
            int r2 = r2.y     // Catch:{ all -> 0x0aec }
            float r2 = (float) r2     // Catch:{ all -> 0x0aec }
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 / r2
            r3 = 0
            android.opengl.GLES20.glUniform3f(r0, r1, r2, r3)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = 33985(0x84c1, float:4.7623E-41)
            android.opengl.GLES20.glActiveTexture(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r17
            int r0 = r0.mo3781()     // Catch:{ all -> 0x0aec }
            r1 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r1, r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8382     // Catch:{ all -> 0x0aec }
            r1 = 1031798784(0x3d800000, float:0.0625)
            r2 = 1031798784(0x3d800000, float:0.0625)
            r3 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glUniform3f(r0, r1, r2, r3)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8374     // Catch:{ all -> 0x0aec }
            o.co r1 = r13.f8511     // Catch:{ all -> 0x0aec }
            float[][] r1 = r1.f643     // Catch:{ all -> 0x0aec }
            r1 = r1[r23]     // Catch:{ all -> 0x0aec }
            r2 = 1
            r3 = 0
            android.opengl.GLES20.glUniform4fv(r0, r2, r1, r3)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            int[] r0 = f8345     // Catch:{ all -> 0x0aec }
            r1 = r18
            char[] r1 = r1.f4950     // Catch:{ all -> 0x0aec }
            char r1 = r1[r23]     // Catch:{ all -> 0x0aec }
            r1 = r1 & 15
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
            int[] r1 = f8345     // Catch:{ all -> 0x0aec }
            r2 = r18
            char[] r2 = r2.f4950     // Catch:{ all -> 0x0aec }
            char r2 = r2[r23]     // Catch:{ all -> 0x0aec }
            int r2 = r2 >>> 4
            r1 = r1[r2]     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glBlendFunc(r0, r1)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            int r0 = r23 << 2
            r1 = 5
            r2 = 4
            android.opengl.GLES20.glDrawArrays(r1, r0, r2)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            int r23 = r23 + 1
        L_0x0aba:
            r0 = r18
            int[] r0 = r0.f4947     // Catch:{ all -> 0x0aec }
            int r1 = r19 + 1
            r0 = r0[r1]     // Catch:{ all -> 0x0aec }
            r1 = r23
            if (r1 < r0) goto L_0x0a0e
            r0 = r37
            int r0 = r0.f8381     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glDisableVertexAttribArray(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            r0 = r37
            int r0 = r0.f8369     // Catch:{ all -> 0x0aec }
            android.opengl.GLES20.glDisableVertexAttribArray(r0)     // Catch:{ all -> 0x0aec }
            m2469()     // Catch:{ all -> 0x0aec }
            goto L_0x0adf
        L_0x0adb:
            r0 = 1
            r13.f8503 = r0     // Catch:{ all -> 0x0aec }
            r12 = 1
        L_0x0adf:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0aec }
            if (r0 != 0) goto L_0x007b
            if (r12 == 0) goto L_0x0aea
            r10.mo4017()     // Catch:{ all -> 0x0aec }
        L_0x0aea:
            monitor-exit(r11)     // Catch:{ all -> 0x0aec }
            goto L_0x0aef
        L_0x0aec:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0aec }
            throw r0
        L_0x0aef:
            int r7 = r7 + 1
        L_0x0af1:
            if (r7 < r8) goto L_0x0052
            r0 = 515(0x203, float:7.22E-43)
            android.opengl.GLES20.glDepthFunc(r0)
            m2469()
            r0 = 770(0x302, float:1.079E-42)
            r1 = 771(0x303, float:1.08E-42)
            android.opengl.GLES20.glBlendFunc(r0, r1)
            m2469()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1812.m2464(o.㙜[]):void");
    }

    public final void onDrawFrame(GL10 gl10) {
        if (!C1014.f6147.f47 && this.f8351 != C0574na.UNLOADED) {
            C1014.f6147.mo3387(this.f8352);
        }
        while (true) {
            synchronized (this) {
                Runnable runnable = (Runnable) this.f8360.poll();
                if (runnable != null) {
                    runnable.run();
                } else if (this.f8351 != C0574na.UNLOADED) {
                    C1337 r6 = this.f8355;
                    if (r6 != null) {
                        GLES20.glClear(16640);
                        GLES20.glClearDepthf(1.0f);
                        if (this.f8351 == C0574na.NONE && r6.f6869 != null) {
                            this.f8351 = C0574na.PREPARING;
                            mo4525(r6.f6869, r6.f6868);
                            this.f8351 = C0574na.READY;
                        } else if (r6.f6867 != null) {
                            if (r6.f6864 != null) {
                                C1341 r8 = r6.f6864;
                                C1341 r9 = r6.f6865;
                                for (int i = 0; i < this.f8348.length; i++) {
                                    if (this.f8348[i] != null) {
                                        GLES20.glUseProgram(this.f8348[i].f8395);
                                        int glGetError = GLES20.glGetError();
                                        this.f8358 = glGetError;
                                        if (glGetError != 0) {
                                            m2470(this.f8358);
                                        }
                                        try {
                                            GLES20.glUniformMatrix4fv(this.f8348[i].f8392, 1, false, r8.f6874, 0);
                                            int glGetError2 = GLES20.glGetError();
                                            this.f8358 = glGetError2;
                                            if (glGetError2 != 0) {
                                                m2470(this.f8358);
                                            }
                                            GLES20.glUniformMatrix4fv(this.f8348[i].f8376, 1, false, r9.f6874, 0);
                                            m2469();
                                        } catch (IllegalArgumentException e) {
                                            throw new C0588no(e, "(5)" + C1014.m1833());
                                        }
                                    }
                                }
                            }
                            m2479(r6.f6867.f7535.f7538, r6.f6867.f7535.f7537, new Point(r6.f6869.f7338.f1296, r6.f6869.f7338.f1297));
                            m2482(r6.f6867.f7533.f7541, r6.f6867.f7533.f7540);
                            C1559if ifVar = r6.f6869.f7349;
                            if (ifVar.f7359) {
                                C1814 r92 = this.f8348[C1815.SIMPLE3DOBJECT.f8408];
                                GLES20.glUseProgram(r92.f8395);
                                int glGetError3 = GLES20.glGetError();
                                this.f8358 = glGetError3;
                                if (glGetError3 != 0) {
                                    m2470(this.f8358);
                                }
                                m2465(r92);
                                try {
                                    GLES20.glUniformMatrix4fv(r92.f8385, 1, false, ifVar.f7355.f6874, 0);
                                    int glGetError4 = GLES20.glGetError();
                                    this.f8358 = glGetError4;
                                    if (glGetError4 != 0) {
                                        m2470(this.f8358);
                                    }
                                    GLES20.glDisableVertexAttribArray(r92.f8381);
                                    int glGetError5 = GLES20.glGetError();
                                    this.f8358 = glGetError5;
                                    if (glGetError5 != 0) {
                                        m2470(this.f8358);
                                    }
                                    GLES20.glDisableVertexAttribArray(r92.f8369);
                                    int glGetError6 = GLES20.glGetError();
                                    this.f8358 = glGetError6;
                                    if (glGetError6 != 0) {
                                        m2470(this.f8358);
                                    }
                                    GLES20.glVertexAttribPointer(r92.f8381, 4, 5126, false, 0, ifVar.f7358);
                                    int glGetError7 = GLES20.glGetError();
                                    this.f8358 = glGetError7;
                                    if (glGetError7 != 0) {
                                        m2470(this.f8358);
                                    }
                                    GLES20.glVertexAttribPointer(r92.f8369, 4, 5126, false, 0, ifVar.f7354);
                                    int glGetError8 = GLES20.glGetError();
                                    this.f8358 = glGetError8;
                                    if (glGetError8 != 0) {
                                        m2470(this.f8358);
                                    }
                                    GLES20.glEnableVertexAttribArray(r92.f8381);
                                    int glGetError9 = GLES20.glGetError();
                                    this.f8358 = glGetError9;
                                    if (glGetError9 != 0) {
                                        m2470(this.f8358);
                                    }
                                    GLES20.glEnableVertexAttribArray(r92.f8369);
                                    int glGetError10 = GLES20.glGetError();
                                    this.f8358 = glGetError10;
                                    if (glGetError10 != 0) {
                                        m2470(this.f8358);
                                    }
                                    GLES20.glDrawArrays(5, 0, ifVar.f7358.capacity() / 4);
                                    int glGetError11 = GLES20.glGetError();
                                    this.f8358 = glGetError11;
                                    if (glGetError11 != 0) {
                                        m2470(this.f8358);
                                    }
                                    GLES20.glDisableVertexAttribArray(r92.f8381);
                                    int glGetError12 = GLES20.glGetError();
                                    this.f8358 = glGetError12;
                                    if (glGetError12 != 0) {
                                        m2470(this.f8358);
                                    }
                                    GLES20.glDisableVertexAttribArray(r92.f8369);
                                    int glGetError13 = GLES20.glGetError();
                                    this.f8358 = glGetError13;
                                    if (glGetError13 != 0) {
                                        m2470(this.f8358);
                                    }
                                } catch (IllegalArgumentException e2) {
                                    throw new C0588no(e2, "(7)" + C1014.m1833());
                                }
                            }
                            m2481(r6.f6866);
                            m2471(r6.f6863);
                            m2480(r6.f6867.f7534.f7538, r6.f6867.f7534.f7537, r6.f6869.f7339);
                            m2464(r6.f6866);
                            if (r6.f6869.f7347 != null) {
                                m2472(r6.f6869.f7347);
                            }
                            m2466(r6.f6866);
                            IntBuffer r82 = C0246cj.m228();
                            if (r82 != null) {
                                GLES20.glDeleteTextures(r82.remaining(), r82);
                                m2469();
                            }
                            if (this.f8354) {
                                if (this.f8354) {
                                    if (System.currentTimeMillis() / 1000 > this.f8353) {
                                        C1428 r0 = C1014.f6144;
                                        C1428 r02 = C1014.f6144;
                                        C1428 r03 = C1014.f6144;
                                        this.f8356 = this.f8359;
                                        this.f8353 = System.currentTimeMillis() / 1000;
                                    }
                                    this.f8359++;
                                }
                            }
                        }
                    }
                    this.f8349 = System.currentTimeMillis();
                    return;
                } else {
                    return;
                }
            }
        }
        while (true) {
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        C1014.f6147.mo3387((Runnable) new C1612(this, i, i2));
    }

    public C1812(c_activity c_activity) {
        this.f8346 = C0622ot.m741(c_activity.mo3388((int) R.raw.vertex_shader), C0618op.UTF8);
        this.f8347 = C0622ot.m741(c_activity.mo3388((int) R.raw.fragment_shader), C0618op.UTF8);
    }
}
