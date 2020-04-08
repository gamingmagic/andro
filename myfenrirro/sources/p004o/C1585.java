package p004o;

import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import com.libroserver.apk.R;

/* renamed from: o.恶 */
final class C1585 extends C0519ld {

    /* renamed from: Ą */
    Button f7496 = ((Button) this.f1626.findViewById(R.id.button1));

    /* renamed from: ȃ */
    SeekBar f7497 = ((SeekBar) this.f1626.findViewById(R.id.seekBar1));

    /* renamed from: ˮ͈ */
    EditText f7498 = ((EditText) this.f1626.findViewById(R.id.editText3));

    /* renamed from: 櫯 */
    EditText f7499 = ((EditText) this.f1626.findViewById(R.id.editText2));

    /* renamed from: 鷭 */
    EditText f7500 = ((EditText) this.f1626.findViewById(R.id.editText1));

    C1585() {
        super(R.layout.chatroom_create);
        this.f7496.setOnClickListener(new C1434(this));
        this.f7497.setMax(18);
        this.f7497.setOnSeekBarChangeListener(new C1458(this));
    }

    /* renamed from: ȃ */
    public final void mo3546() {
    }

    /* renamed from: Ą */
    public final void mo3544() {
    }
}
