package p004o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;
import java.util.ArrayList;

/* renamed from: o.fa */
final class C0333fa extends BaseAdapter {

    /* renamed from: 鷭 */
    ArrayList<C0329ex> f902 = new ArrayList<>();

    C0333fa() {
        C0336fd fdVar = new C0336fd();
        C0334fb fbVar = new C0334fb("NoShift enemies", "noshift_enemy", new String[]{"Disable support skills on enemies", "Enable support skills on enemies"});
        C0334fb fbVar2 = new C0334fb("NoShift friends", "noshift_friend", new String[]{"Disable offensive skills on friends", "Enable offensive skills on friends"});
        C0338ff ffVar = new C0338ff("Party chat message prefix", "party_wis_prefix", C0595nv.f2865);
        C0338ff ffVar2 = new C0338ff("Guild chat message prefix", "guild_wis_prefix", C0595nv.f2866);
        C0334fb fbVar3 = new C0334fb("Display land effects", "enable_land_effects", new String[]{"On", "Off"});
        this.f902.add(fdVar);
        this.f902.add(fbVar);
        this.f902.add(fbVar2);
        this.f902.add(ffVar);
        this.f902.add(ffVar2);
        this.f902.add(fbVar3);
    }

    public final int getCount() {
        return this.f902.size();
    }

    public final Object getItem(int i) {
        return this.f902.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0329ex exVar = (C0329ex) this.f902.get(i);
        exVar.f895 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.settings_item, null);
        exVar.f894 = (TextView) exVar.f895.findViewById(R.id.textView1);
        exVar.f893 = (TextView) exVar.f895.findViewById(R.id.textView2);
        exVar.f894.setText(exVar.f897);
        exVar.f893.setText(exVar.f896);
        return exVar.f895;
    }
}
