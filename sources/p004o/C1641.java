package p004o;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: o.榊 */
public final class C1641 {

    /* renamed from: Ą */
    private static boolean f7594 = true;

    /* renamed from: ȃ */
    private static boolean f7595 = true;

    /* renamed from: ą */
    private String f7596;

    /* renamed from: Ć */
    private C0350fr[] f7597 = new C0350fr[48];

    /* renamed from: ć */
    private OnPreparedListener f7598 = new C1459(this);

    /* renamed from: ˮ͈ */
    HashMap<String, C0351fs> f7599 = new HashMap<>();

    /* renamed from: 櫯 */
    public boolean f7600 = false;

    /* renamed from: 鷭 */
    public MediaPlayer f7601 = new MediaPlayer();

    static {
    }

    public C1641() {
        this.f7601.setAudioStreamType(3);
        this.f7601.setOnPreparedListener(this.f7598);
    }

    /* renamed from: 鷭 */
    public final void mo4427(String str) {
        if (f7595) {
            try {
                if (str.equals(this.f7596)) {
                    if (!this.f7601.isPlaying()) {
                        this.f7601.start();
                    }
                } else if (new File(str).exists()) {
                    if (this.f7601.isPlaying()) {
                        this.f7601.stop();
                    }
                    this.f7601.reset();
                    this.f7601.setDataSource(str);
                    this.f7601.setLooping(true);
                    this.f7601.prepare();
                    this.f7601.start();
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: 鷭 */
    public final void mo4426() {
        for (int i = 0; i < this.f7597.length; i++) {
            if (this.f7597[i] != null) {
                if (this.f7597[i].f936.getState() == 1) {
                    this.f7597[i].f936.stop();
                }
                try {
                    this.f7597[i].f936.release();
                } catch (IllegalStateException unused) {
                }
                this.f7597[i] = null;
            }
        }
    }

    /* renamed from: 鷭 */
    public final void mo4429(String str, byte[] bArr) {
        if (!this.f7599.containsKey(str)) {
            try {
                this.f7599.put(str, new C0351fs(str, bArr));
            } catch (C0588no unused) {
            }
        }
    }

    /* renamed from: 鷭 */
    public final void mo4428(String str, float f) {
        if (str.endsWith(".wav")) {
            str = str.substring(0, str.length() - 4);
        }
        if (this.f7599.containsKey(str)) {
            mo4425(str, f);
        } else {
            C1014.f6158.mo3387((Runnable) new C2029(this, str, f));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final synchronized void mo4425(String str, float f) {
        int i;
        if (f7594) {
            C0351fs fsVar = (C0351fs) this.f7599.get(str);
            if (fsVar != null) {
                String str2 = str;
                int i2 = -1;
                int i3 = -1;
                long currentTimeMillis = System.currentTimeMillis();
                int i4 = 0;
                while (true) {
                    if (i4 >= this.f7597.length) {
                        i = i2 != -1 ? i2 : i3;
                    } else {
                        if (this.f7597[i4] != null) {
                            C0531lo loVar = this.f7597[i4].f937.f938;
                            long j = (long) ((loVar.f1670 * 1000) / (((loVar.f1672 * loVar.f1673) * loVar.f1671) / 8));
                            if (this.f7597[i4].f936.getPlayState() == 1 || this.f7597[i4].f935 + j < currentTimeMillis) {
                                if (this.f7597[i4].f937.f939.equals(str2)) {
                                    i = i4;
                                    break;
                                } else if (i3 == -1) {
                                    i3 = i4;
                                }
                            }
                        } else if (i2 == -1) {
                            i2 = i4;
                        }
                        i4++;
                    }
                }
                if (i != -1) {
                    boolean z = false;
                    if (this.f7597[i] != null && this.f7597[i].f937.f939.equals(str) && this.f7597[i].f936.getState() == 1) {
                        try {
                            this.f7597[i].f936.stop();
                            this.f7597[i].f936.reloadStaticData();
                            z = true;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    if (!z) {
                        if (this.f7597[i] != null) {
                            if (this.f7597[i].f936.getState() == 1) {
                                this.f7597[i].f936.stop();
                            }
                            this.f7597[i].f936.release();
                        }
                        this.f7597[i] = new C0350fr(fsVar);
                    }
                    this.f7597[i].f936.setStereoVolume(f, f);
                    if (this.f7597[i].f936.getState() == 1) {
                        this.f7597[i].f936.play();
                    }
                    this.f7597[i].f935 = System.currentTimeMillis();
                }
            }
        }
    }
}
