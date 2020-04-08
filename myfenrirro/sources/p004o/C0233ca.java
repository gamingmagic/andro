package p004o;

import android.graphics.Bitmap;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.HttpStatus;

/* renamed from: o.ca */
class C0233ca implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ boolean[] f531;

    /* renamed from: 鷭 */
    final /* synthetic */ C0214bi f532;

    C0233ca(C0214bi biVar, boolean[] zArr) {
        this.f532 = biVar;
        this.f531 = zArr;
    }

    public final void run() {
        C0453ix.f1367 = null;
        C0453ix ixVar = C1014.f6147.f51;
        Bitmap[] bitmapArr = C1014.f6158.f671;
        Bitmap[] bitmapArr2 = C1014.f6158.f664;
        Bitmap[] bitmapArr3 = C1014.f6158.f666;
        Bitmap bitmap = C1014.f6158.f655;
        Bitmap bitmap2 = C1014.f6158.f675;
        Bitmap[] bitmapArr4 = C1014.f6158.f672;
        Bitmap[] bitmapArr5 = C1014.f6158.f656;
        Bitmap[] bitmapArr6 = C1014.f6158.f657;
        Bitmap[] bitmapArr7 = C1014.f6158.f658;
        Bitmap[] bitmapArr8 = C1014.f6158.f678;
        Bitmap bitmap3 = C1014.f6158.f668;
        ixVar.f1393 = bitmapArr;
        ixVar.f1423 = bitmapArr2;
        ixVar.f1394 = bitmapArr3;
        ixVar.f1395 = bitmapArr4;
        ixVar.f1411 = bitmapArr5;
        ixVar.f1396 = bitmapArr6;
        ixVar.f1419 = bitmapArr7;
        ixVar.f1397 = bitmapArr8;
        ixVar.f1450 = bitmap;
        ixVar.f1456 = bitmap2;
        C1014.f6147.setContentView(R.layout.main);
        ixVar.f1412 = (RelativeLayout) C1014.f6147.findViewById(R.id.RelativeLayout1);
        RelativeLayout relativeLayout = (RelativeLayout) C1014.f6147.f53.getParent();
        if (relativeLayout != null) {
            relativeLayout.removeView(C1014.f6147.f53);
        }
        ixVar.f1412.addView(C1014.f6147.f53, 0);
        ImageView imageView = (ImageView) C1014.f6147.findViewById(R.id.imageview_chat);
        imageView.setOnClickListener(ixVar.f1399);
        imageView.setImageBitmap(ixVar.f1393[0]);
        ImageView imageView2 = (ImageView) C1014.f6147.findViewById(R.id.imageview_inventory);
        imageView2.setOnClickListener(ixVar.f1400);
        imageView2.setImageBitmap(ixVar.f1423[0]);
        ImageView imageView3 = (ImageView) C1014.f6147.findViewById(R.id.imageview_profile);
        imageView3.setOnClickListener(ixVar.f1431);
        imageView3.setImageBitmap(ixVar.f1394[0]);
        ImageView imageView4 = (ImageView) C1014.f6147.findViewById(R.id.imageview_skills);
        imageView4.setOnClickListener(ixVar.f1401);
        imageView4.setImageBitmap(ixVar.f1395[0]);
        ImageView imageView5 = (ImageView) C1014.f6147.findViewById(R.id.imageview_status);
        imageView5.setOnClickListener(ixVar.f1402);
        imageView5.setImageBitmap(ixVar.f1411[0]);
        ImageView imageView6 = (ImageView) C1014.f6147.findViewById(R.id.imageview_equip);
        imageView6.setOnClickListener(ixVar.f1403);
        imageView6.setImageBitmap(ixVar.f1396[0]);
        ImageView imageView7 = (ImageView) C1014.f6147.findViewById(R.id.imageview_option);
        imageView7.setOnClickListener(ixVar.f1404);
        imageView7.setImageBitmap(ixVar.f1419[0]);
        ImageView imageView8 = (ImageView) C1014.f6147.findViewById(R.id.imageview_ability);
        imageView8.setOnClickListener(ixVar.f1424);
        imageView8.setImageBitmap(ixVar.f1397[0]);
        ImageView imageView9 = (ImageView) C1014.f6147.findViewById(R.id.cashshop_button);
        if (bitmap3 == null || (C1014.f6140.f4517 == null && C1014.f6140.f4477)) {
            imageView9.setVisibility(8);
        } else {
            imageView9.setVisibility(0);
            imageView9.setImageBitmap(bitmap3);
            imageView9.setOnClickListener(new C0480jt(ixVar));
        }
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_attackbtn)).setOnTouchListener(ixVar.f1405);
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_attackbtn)).setOnClickListener(ixVar.f1406);
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_attackbtn)).setOnLongClickListener(ixVar.f1414);
        ixVar.f1426 = (TextView) C1014.f6147.findViewById(R.id.textview_selectskilltarget_skillname);
        ixVar.f1447 = (TextView) C1014.f6147.findViewById(R.id.textview_selectskilltarget);
        ixVar.f1454 = (TextView) C1014.f6147.findViewById(R.id.textview_broadcast);
        ixVar.f1458 = (Button) C1014.f6147.findViewById(R.id.button1);
        ixVar.f1458.setOnClickListener(new C0481ju(ixVar));
        C1746 r4 = ixVar.f1427;
        r4.f8027 = (AutoCompleteTextView) C1014.f6147.findViewById(R.id.edittext_dst);
        r4.f8028 = (EditText) C1014.f6147.findViewById(R.id.edittext_chat);
        r4.f8029 = (TextView) C1014.f6147.findViewById(R.id.textview_chat);
        r4.f8027.setThreshold(0);
        r4.f8027.setDropDownWidth(HttpStatus.SC_MULTIPLE_CHOICES);
        r4.f8027.setSingleLine(true);
        r4.f8028.setOnKeyListener(r4.f8033);
        r4.f8028.setSingleLine(true);
        r4.mo4487();
        r4.f8028.setVisibility(4);
        r4.f8027.setVisibility(4);
        C1746 r5 = r4;
        r4.f8029.setMaxLines(5);
        r5.f8029.setMovementMethod(null);
        r5.f8029.setBackgroundColor(0);
        r4.f8029.setText(null);
        r4.f8029.setLinkTextColor(-1575036);
        r4.mo4486();
        C1014.f6147.getWindow().addFlags(128);
        if (ixVar.f1429 == null) {
            C0453ix ixVar2 = ixVar;
            ixVar.f1429 = new ArrayList<>();
            int r52 = C1014.f6160.mo3795("nhotkeys" + C0453ix.m478(), 0);
            for (int i = 0; i < r52; i++) {
                ixVar2.f1429.add(new C0500kn(i));
            }
        }
        Iterator it = ixVar.f1429.iterator();
        while (it.hasNext()) {
            ((C0500kn) it.next()).mo3537h_();
        }
        C0234cb cbVar = ixVar.f1416;
        cbVar.mo3538();
        cbVar.f544.mo3537h_();
        ixVar.f1432.f991 = new C0525li();
        ixVar.mo3865();
        C1014.f6142.f1698.f8351 = C0574na.NONE;
        C1014.f6144.f7008 = true;
        this.f531[0] = true;
    }
}
