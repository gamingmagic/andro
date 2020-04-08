package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.hockeyapp.android.views.AttachmentListView;
import p004o.aai;
import p004o.aaj;
import p004o.aal;
import p004o.aap;
import p004o.aay.C0164if;
import p004o.aay.C0165;
import p004o.aay.C0166;
import p004o.abm;
import p004o.abr;
import p004o.abv;
import p004o.abx;
import p004o.acl;
import p004o.acm;
import p004o.acn;
import p004o.acr;
import p004o.acu;
import p004o.acu.C0176;
import p004o.acx;
import p004o.adc;

public class FeedbackActivity extends Activity implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: Ą */
    public TextView f61;

    /* renamed from: ą */
    private EditText f62;

    /* renamed from: Ć */
    private EditText f63;

    /* renamed from: ć */
    private EditText f64;

    /* renamed from: ċ */
    private Button f65;

    /* renamed from: đ */
    private acl f66;

    /* renamed from: Ē */
    private Handler f67;

    /* renamed from: ē */
    private List<Uri> f68;
    /* access modifiers changed from: private */

    /* renamed from: Ė */
    public abm f69;
    /* access modifiers changed from: private */

    /* renamed from: ė */
    public ArrayList<abv> f70;
    /* access modifiers changed from: private */

    /* renamed from: Ę */
    public boolean f71;

    /* renamed from: ę */
    private boolean f72;
    /* access modifiers changed from: private */

    /* renamed from: ȃ */
    public Context f73;

    /* renamed from: Ȋ */
    private Button f74;

    /* renamed from: ˮ͈ */
    private String f75;

    /* renamed from: ˮ͍ */
    private EditText f76;

    /* renamed from: ܕ */
    private acm f77;
    /* access modifiers changed from: private */

    /* renamed from: 㥳 */
    public abr f78;

    /* renamed from: 䒧 */
    private LinearLayout f79;

    /* renamed from: 岱 */
    private Button f80;

    /* renamed from: 庸 */
    private Handler f81;

    /* renamed from: 廂 */
    private String f82;

    /* renamed from: 櫯 */
    private String f83;

    /* renamed from: 纫 */
    private ScrollView f84;
    /* access modifiers changed from: private */

    /* renamed from: 躆 */
    public ListView f85;

    /* renamed from: 鷭 */
    public Button f86;

    /* renamed from: 띥 */
    private String f87;

    /* renamed from: 鷭 */
    public static /* synthetic */ void m44(FeedbackActivity feedbackActivity, String str, String str2) {
        FeedbackActivity feedbackActivity2 = feedbackActivity;
        FeedbackActivity feedbackActivity3 = feedbackActivity2;
        String str3 = str2;
        String str4 = str;
        FeedbackActivity feedbackActivity4 = feedbackActivity2;
        feedbackActivity2.f66 = new acl(feedbackActivity4, str4, feedbackActivity4.f67, str3);
        acn.m116(feedbackActivity3.f66);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutInflater().inflate(C0166.hockeyapp_activity_feedback, null));
        setTitle(getString(C0165.hockeyapp_feedback_title));
        this.f73 = this;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f87 = extras.getString("url");
            this.f83 = extras.getString("initialUserName");
            this.f75 = extras.getString("initialUserEmail");
            Parcelable[] parcelableArray = extras.getParcelableArray("initialAttachments");
            if (parcelableArray != null) {
                this.f68 = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    this.f68.add((Uri) parcelable);
                }
            }
        }
        if (bundle != null) {
            this.f72 = bundle.getBoolean("feedbackViewInitialized");
            this.f71 = bundle.getBoolean("inSendFeedback");
        } else {
            this.f71 = false;
            this.f72 = false;
        }
        ((NotificationManager) getSystemService("notification")).cancel(2);
        this.f81 = new aaj(this);
        this.f67 = new aal(this);
        m42();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById(C0164if.wrapper_attachments);
            Iterator it = bundle.getParcelableArrayList("attachments").iterator();
            while (it.hasNext()) {
                viewGroup.addView(new adc(this, viewGroup, (Uri) it.next(), true));
            }
            this.f72 = bundle.getBoolean("feedbackViewInitialized");
        }
        super.onRestoreInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelableArrayList("attachments", ((AttachmentListView) findViewById(C0164if.wrapper_attachments)).mo3424());
        bundle.putBoolean("feedbackViewInitialized", this.f72);
        bundle.putBoolean("inSendFeedback", this.f71);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (this.f77 != null) {
            acm acm = this.f77;
            acm.f298 = null;
            acm.f296 = null;
        }
    }

    public Object onRetainNonConfigurationInstance() {
        if (this.f77 != null) {
            acm acm = this.f77;
            acm.f298 = null;
            acm.f296 = null;
        }
        return this.f77;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f71) {
            this.f71 = false;
            m42();
        } else {
            finish();
        }
        return true;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C0164if.button_send) {
            if (!acx.m145((Context) this)) {
                Toast.makeText(this, C0165.hockeyapp_error_no_network_message, 1).show();
                return;
            }
            if (this.f86 != null) {
                this.f86.setEnabled(false);
            }
            if (this.f76 != null) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f76.getWindowToken(), 0);
            }
            String r10 = C0176.f323.mo3504(this.f73);
            String trim = this.f62.getText().toString().trim();
            String trim2 = this.f63.getText().toString().trim();
            String trim3 = this.f64.getText().toString().trim();
            String trim4 = this.f76.getText().toString().trim();
            if (TextUtils.isEmpty(trim3)) {
                this.f64.setVisibility(0);
                this.f64.setError(getString(C0165.hockeyapp_feedback_validate_subject_error));
                if (this.f86 != null) {
                    this.f86.setEnabled(true);
                }
            } else if (aap.f141 == abx.REQUIRED && TextUtils.isEmpty(trim)) {
                this.f62.setError(getString(C0165.hockeyapp_feedback_validate_name_error));
                if (this.f86 != null) {
                    this.f86.setEnabled(true);
                }
            } else if (aap.f140 == abx.REQUIRED && TextUtils.isEmpty(trim2)) {
                this.f63.setError(getString(C0165.hockeyapp_feedback_validate_email_empty));
                if (this.f86 != null) {
                    this.f86.setEnabled(true);
                }
            } else if (TextUtils.isEmpty(trim4)) {
                this.f76.setError(getString(C0165.hockeyapp_feedback_validate_text_error));
                if (this.f86 != null) {
                    this.f86.setEnabled(true);
                }
            } else if (aap.f140 != abx.REQUIRED || acx.m140(trim2)) {
                acu acu = C0176.f323;
                Context context = this.f73;
                String str = trim3;
                String str2 = trim2;
                String str3 = trim;
                if (context != null) {
                    acu.f322 = context.getSharedPreferences("net.hockeyapp.android.prefs_name_email", 0);
                    if (acu.f322 != null) {
                        acu.f321 = acu.f322.edit();
                        if (str3 == null || str2 == null || str == null) {
                            acu.f321.putString("net.hockeyapp.android.prefs_key_name_email", null);
                        } else {
                            acu.f321.putString("net.hockeyapp.android.prefs_key_name_email", String.format("%s|%s|%s", new Object[]{str3, str2, str}));
                        }
                        acu.f321.apply();
                    }
                }
                m43(this.f87, trim, trim2, trim3, trim4, ((AttachmentListView) findViewById(C0164if.wrapper_attachments)).mo3424(), r10, this.f81, false);
            } else {
                this.f63.setError(getString(C0165.hockeyapp_feedback_validate_email_error));
                if (this.f86 != null) {
                    this.f86.setEnabled(true);
                }
            }
        } else if (id == C0164if.button_attachment) {
            if (((ViewGroup) findViewById(C0164if.wrapper_attachments)).getChildCount() >= 3) {
                Toast.makeText(this, "3", 0).show();
                return;
            }
            openContextMenu(view);
        } else if (id == C0164if.button_add_response) {
            mo3403(false);
            this.f71 = true;
        } else {
            if (id == C0164if.button_refresh) {
                m43(this.f87, null, null, null, null, null, C0176.f323.mo3504(this.f73), this.f81, true);
            }
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 2, 0, getString(C0165.hockeyapp_feedback_attach_file));
        contextMenu.add(0, 1, 0, getString(C0165.hockeyapp_feedback_attach_picture));
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 1:
            case 2:
                int itemId = menuItem.getItemId();
                if (itemId == 2) {
                    Intent intent = new Intent();
                    intent.setType("*/*");
                    intent.setAction("android.intent.action.GET_CONTENT");
                    startActivityForResult(Intent.createChooser(intent, getString(C0165.hockeyapp_feedback_select_file)), 2);
                    return true;
                } else if (itemId != 1) {
                    return false;
                } else {
                    Intent intent2 = new Intent();
                    intent2.setType("image/*");
                    intent2.setAction("android.intent.action.GET_CONTENT");
                    startActivityForResult(Intent.createChooser(intent2, getString(C0165.hockeyapp_feedback_select_picture)), 1);
                    return true;
                }
            default:
                return super.onContextItemSelected(menuItem);
        }
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i) {
        switch (i) {
            case 0:
                return new Builder(this).setMessage(getString(C0165.hockeyapp_dialog_error_message)).setCancelable(false).setTitle(getString(C0165.hockeyapp_dialog_error_title)).setIcon(17301543).setPositiveButton(getString(C0165.hockeyapp_dialog_positive_button), new aai(this)).create();
            default:
                return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case 0:
                AlertDialog alertDialog = (AlertDialog) dialog;
                if (this.f78 == null) {
                    alertDialog.setMessage(getString(C0165.hockeyapp_feedback_generic_error));
                    break;
                } else {
                    alertDialog.setMessage(this.f78.f201);
                    return;
                }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 2) {
                Uri data = intent.getData();
                if (data != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById(C0164if.wrapper_attachments);
                    viewGroup.addView(new adc(this, viewGroup, data, true));
                }
            } else if (i == 1) {
                Uri data2 = intent.getData();
                if (data2 != null) {
                    try {
                        Intent intent2 = new Intent(this, PaintActivity.class);
                        intent2.putExtra("imageUri", data2);
                        startActivityForResult(intent2, 3);
                    } catch (ActivityNotFoundException e) {
                        String str = "HockeyApp";
                        ActivityNotFoundException activityNotFoundException = e;
                        String str2 = "Paint activity not declared!";
                        if (str.length() == 0 || str.length() > 23) {
                            str = "HockeyApp";
                        }
                        if (acr.f312 <= 6) {
                            Log.e(str, str2, activityNotFoundException);
                        }
                    }
                }
            } else if (i == 3) {
                Uri uri = (Uri) intent.getParcelableExtra("imageUri");
                if (uri != null) {
                    ViewGroup viewGroup2 = (ViewGroup) findViewById(C0164if.wrapper_attachments);
                    viewGroup2.addView(new adc(this, viewGroup2, uri, true));
                }
            }
        }
    }

    /* renamed from: 鷭 */
    public final void mo3403(boolean z) {
        this.f84 = (ScrollView) findViewById(C0164if.wrapper_feedback_scroll);
        this.f79 = (LinearLayout) findViewById(C0164if.wrapper_messages);
        this.f85 = (ListView) findViewById(C0164if.list_feedback_messages);
        if (z) {
            this.f79.setVisibility(0);
            this.f84.setVisibility(8);
            this.f61 = (TextView) findViewById(C0164if.label_last_updated);
            this.f74 = (Button) findViewById(C0164if.button_add_response);
            this.f74.setOnClickListener(this);
            this.f65 = (Button) findViewById(C0164if.button_refresh);
            this.f65.setOnClickListener(this);
            return;
        }
        this.f79.setVisibility(8);
        this.f84.setVisibility(0);
        this.f62 = (EditText) findViewById(C0164if.input_name);
        this.f63 = (EditText) findViewById(C0164if.input_email);
        this.f64 = (EditText) findViewById(C0164if.input_subject);
        this.f76 = (EditText) findViewById(C0164if.input_message);
        if (!this.f72) {
            String r5 = C0176.f323.mo3503(this.f73);
            if (r5 != null) {
                String[] split = r5.split("\\|");
                if (split != null && split.length >= 2) {
                    this.f62.setText(split[0]);
                    this.f63.setText(split[1]);
                    if (split.length >= 3) {
                        this.f64.setText(split[2]);
                        this.f76.requestFocus();
                    } else {
                        this.f64.requestFocus();
                    }
                }
            } else {
                this.f62.setText(this.f83);
                this.f63.setText(this.f75);
                this.f64.setText("");
                if (TextUtils.isEmpty(this.f83)) {
                    this.f62.requestFocus();
                } else if (TextUtils.isEmpty(this.f75)) {
                    this.f63.requestFocus();
                } else {
                    this.f64.requestFocus();
                }
            }
            this.f72 = true;
        }
        this.f76.setText("");
        if (C0176.f323.mo3504(this.f73) != null) {
            this.f64.setVisibility(8);
        } else {
            this.f64.setVisibility(0);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(C0164if.wrapper_attachments);
        viewGroup.removeAllViews();
        if (this.f68 != null) {
            for (Uri adc : this.f68) {
                viewGroup.addView(new adc(this, viewGroup, adc, true));
            }
        }
        this.f80 = (Button) findViewById(C0164if.button_attachment);
        this.f80.setOnClickListener(this);
        registerForContextMenu(this.f80);
        this.f86 = (Button) findViewById(C0164if.button_send);
        this.f86.setOnClickListener(this);
    }

    /* renamed from: 鷭 */
    private void m42() {
        this.f82 = C0176.f323.mo3504(this);
        if (this.f82 == null || this.f71) {
            mo3403(false);
            return;
        }
        mo3403(true);
        m43(this.f87, null, null, null, null, null, this.f82, this.f81, true);
    }

    /* renamed from: 鷭 */
    private void m43(String str, String str2, String str3, String str4, String str5, List<Uri> list, String str6, Handler handler, boolean z) {
        this.f77 = new acm(this.f73, str, str2, str3, str4, str5, list, str6, handler, z);
        acn.m116(this.f77);
    }
}
