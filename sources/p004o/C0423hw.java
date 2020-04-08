package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.hw */
class C0423hw implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0421hu f1228;

    C0423hw(C0421hu huVar) {
        this.f1228 = huVar;
    }

    public final void onClick(View view) {
        C0340fh fhVar = this.f1228.f1226.f51.f1386;
        C1014.f6147.setContentView(R.layout.settings_loginscreen);
        fhVar.f922 = true;
        fhVar.f921 = (CheckBox) C1014.f6147.findViewById(R.id.checkBox1);
        fhVar.f920 = (CheckBox) C1014.f6147.findViewById(R.id.checkBox2);
        fhVar.f919 = (CheckBox) C1014.f6147.findViewById(R.id.checkBox3);
        fhVar.f915 = (TextView) C1014.f6147.findViewById(R.id.textView8);
        fhVar.f916 = (Button) C1014.f6147.findViewById(R.id.button4);
        fhVar.f917 = (TextView) C1014.f6147.findViewById(R.id.textView5);
        fhVar.f918 = (Button) C1014.f6147.findViewById(R.id.button2);
        fhVar.f921.setEnabled(C0441in.f1306 >= 4096);
        fhVar.f921.setChecked(C0595nv.f2868);
        fhVar.f921.setOnCheckedChangeListener(new C0341fi(fhVar));
        fhVar.f919.setEnabled(true);
        fhVar.f919.setChecked(C0595nv.f2860);
        fhVar.f919.setOnCheckedChangeListener(new C0342fj(fhVar));
        fhVar.f920.setEnabled(C0441in.f1306 >= 4096);
        fhVar.f920.setChecked(C0595nv.f2870);
        fhVar.f920.setOnCheckedChangeListener(new C0343fk(fhVar));
        fhVar.f917.setText(C0595nv.f2874);
        fhVar.f918.setOnClickListener(new C0344fl(fhVar));
    }
}
