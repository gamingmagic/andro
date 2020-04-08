package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import java.io.File;

/* renamed from: o.eh */
public final class C0312eh extends C0499km {

    /* renamed from: Ą */
    private TextView f847;

    /* renamed from: ą */
    private Button f848;

    /* renamed from: Ć */
    private Button f849;

    /* renamed from: ć */
    private ListView f850;

    /* renamed from: ȃ */
    private RelativeLayout f851;

    /* renamed from: ˮ͈ */
    String[] f852;

    /* renamed from: 櫯 */
    File f853;

    /* renamed from: 鷭 */
    c_activity f854;

    C0312eh(c_activity c_activity) {
        this.f854 = c_activity;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final boolean mo3539() {
        View findViewById = ((ViewGroup) this.f854.findViewById(16908290)).findViewById(R.id.relativeLayout1);
        return findViewById != null && findViewById == this.f851;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h_ */
    public final void mo3537h_() {
        this.f854.setContentView(R.layout.select_client_dir);
        this.f851 = (RelativeLayout) this.f854.findViewById(R.id.relativeLayout1);
        this.f847 = (TextView) this.f854.findViewById(R.id.textView2);
        this.f850 = (ListView) this.f854.findViewById(R.id.listView1);
        this.f848 = (Button) this.f854.findViewById(R.id.button1);
        this.f849 = (Button) this.f854.findViewById(R.id.button2);
        C0453ix.m477(R.id.relativeLayout1);
        this.f850.setOnItemClickListener(new C0313ei(this));
        this.f848.setOnClickListener(new C0314ej(this));
        this.f849.setOnClickListener(new C0315ek(this));
        mo3679(new File(C0595nv.f2874), true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3679(File file, boolean z) {
        if (!file.exists()) {
            if (!z) {
                Toast.makeText(this.f854, "Directory not exists", 0).show();
            }
            file = File.listRoots()[0];
        }
        if (!file.canRead()) {
            if (!z) {
                Toast.makeText(this.f854, "Access denied", 0).show();
                return;
            }
            file = File.listRoots()[0];
        }
        this.f853 = file;
        this.f847.setText(file.getAbsolutePath());
        this.f852 = m343(file);
        this.f850.setAdapter(new ArrayAdapter(this.f854, R.layout.spinner_item, this.f852));
        if (C0653pe.m800(file)) {
            Builder builder = new Builder(this.f854);
            builder.setMessage("Game client found. Use \"" + file + "\"?");
            builder.setPositiveButton("Yes", new C0316el(this, file));
            builder.setNegativeButton("No", null);
            builder.show();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3538() {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r0v17, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v3
      assigns: []
      uses: []
      mth insns count: 57
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 10 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] m343(java.io.File r9) {
        /*
            r0 = 0
            java.lang.String[] r3 = new java.lang.String[r0]
            boolean r0 = r9.isDirectory()
            if (r0 != 0) goto L_0x0026
            o.no r0 = new o.no
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = r9.getAbsolutePath()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r2 = " is not a directory"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0026:
            java.lang.String r0 = r9.getAbsolutePath()
            java.lang.String r1 = "/"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0044
            r0 = r3
            java.lang.String r7 = ".."
            r3 = r0
            int r1 = r0.length
            int r1 = r1 + 1
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r0, r1)
            int r0 = r3.length
            r8[r0] = r7
            r0 = r8
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3 = r0
        L_0x0044:
            java.io.File[] r9 = r9.listFiles()
            if (r9 != 0) goto L_0x004b
            return r3
        L_0x004b:
            r6 = r9
            int r5 = r9.length
            r4 = 0
            goto L_0x007b
        L_0x004f:
            r9 = r6[r4]
            boolean r0 = r9.isDirectory()
            if (r0 == 0) goto L_0x0079
            r0 = r3
            java.lang.String r7 = r9.getName()
            r3 = r0
            if (r0 != 0) goto L_0x006b
            java.lang.Class r0 = r7.getClass()
            r1 = 0
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r3 = r0
        L_0x006b:
            int r0 = r3.length
            int r0 = r0 + 1
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r3, r0)
            int r0 = r3.length
            r8[r0] = r7
            r0 = r8
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3 = r0
        L_0x0079:
            int r4 = r4 + 1
        L_0x007b:
            if (r4 < r5) goto L_0x004f
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0312eh.m343(java.io.File):java.lang.String[]");
    }
}
