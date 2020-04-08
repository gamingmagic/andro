package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;
import java.io.File;
import p004o.aav;
import p004o.aaw;
import p004o.aay.C0165;
import p004o.adh;

public class PaintActivity extends Activity {

    /* renamed from: 櫯 */
    private String f94;

    /* renamed from: 鷭 */
    private adh f95;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri uri = (Uri) getIntent().getExtras().getParcelable("imageUri");
        this.f94 = m49(uri, uri.getLastPathSegment());
        int i = getResources().getDisplayMetrics().widthPixels;
        int i2 = getResources().getDisplayMetrics().heightPixels;
        int i3 = i > i2 ? 0 : 1;
        int r5 = adh.m172(getContentResolver(), uri);
        setRequestedOrientation(r5);
        if (i3 == r5) {
            this.f95 = new adh(this, uri, i, i2);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LayoutParams(-1, -1));
            linearLayout.setGravity(17);
            linearLayout.setOrientation(1);
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setLayoutParams(new LayoutParams(-1, -1));
            linearLayout2.setGravity(17);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2);
            linearLayout2.addView(this.f95);
            setContentView(linearLayout);
            Toast.makeText(this, getString(C0165.hockeyapp_paint_indicator_toast), 1).show();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, getString(C0165.hockeyapp_paint_menu_save));
        menu.add(0, 2, 0, getString(C0165.hockeyapp_paint_menu_undo));
        menu.add(0, 3, 0, getString(C0165.hockeyapp_paint_menu_clear));
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 1:
                m50();
                return true;
            case 2:
                adh adh = this.f95;
                if (!adh.f366.empty()) {
                    adh.f366.pop();
                    adh.invalidate();
                }
                return true;
            case 3:
                adh adh2 = this.f95;
                adh2.f366.clear();
                adh2.invalidate();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || this.f95.f366.empty()) {
            return super.onKeyDown(i, keyEvent);
        }
        aav aav = new aav(this);
        new Builder(this).setMessage(C0165.hockeyapp_paint_dialog_message).setPositiveButton(C0165.hockeyapp_paint_dialog_positive_button, aav).setNegativeButton(C0165.hockeyapp_paint_dialog_negative_button, aav).setNeutralButton(C0165.hockeyapp_paint_dialog_neutral_button, aav).show();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: 鷭 */
    public void m50() {
        File file = new File(getCacheDir(), "HockeyApp");
        file.mkdir();
        File file2 = new File(file, this.f94 + ".jpg");
        int i = 1;
        while (file2.exists()) {
            file2 = new File(file, this.f94 + "_" + i + ".jpg");
            i++;
        }
        this.f95.setDrawingCacheEnabled(true);
        new aaw(this, this.f95.getDrawingCache()).execute(new File[]{file2});
        Intent intent = new Intent();
        intent.putExtra("imageUri", Uri.fromFile(file2));
        if (getParent() == null) {
            setResult(-1, intent);
        } else {
            getParent().setResult(-1, intent);
        }
        finish();
    }

    /* renamed from: 鷭 */
    private String m49(Uri uri, String str) {
        String str2 = null;
        Cursor query = getApplicationContext().getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str2 = query.getString(0);
                }
            } finally {
                query.close();
            }
        }
        return str2 == null ? str : new File(str2).getName();
    }
}
