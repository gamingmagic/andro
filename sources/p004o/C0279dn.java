package p004o;

import android.app.AlertDialog.Builder;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p000v4.p002os.EnvironmentCompat;
import android.util.JsonWriter;
import android.util.Log;
import com.roworkshop.andro.c_activity;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.UUID;
import p004o.C1782.C1785;
import p004o.C1838.C1839;

/* renamed from: o.dn */
class C0279dn implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0271df f739;

    C0279dn(C0271df dfVar) {
        this.f739 = dfVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        C0271df dfVar = this.f739;
        C1839 r15 = C1838.f8423[i];
        if (dfVar.f727) {
            new Builder(C1014.f6147).setMessage("Already processing other purchase, can't continue with this one").show();
        } else if (dfVar.f728 == null) {
            new Builder(C1014.f6147).setMessage("Can't start purchase process: not connected to Billing Server. Please try again later.").show();
        } else {
            if (C1014.f6140 != null) {
                CharArrayWriter charArrayWriter = new CharArrayWriter();
                JsonWriter jsonWriter = new JsonWriter(charArrayWriter);
                try {
                    jsonWriter.beginObject();
                    jsonWriter.name("account_id");
                    jsonWriter.value((long) C1014.f6161.f6162);
                    jsonWriter.name("server");
                    jsonWriter.value(C1014.f6140 != null ? C1014.f6140.f4522 : EnvironmentCompat.MEDIA_UNKNOWN);
                    jsonWriter.name("ragnarok_username");
                    jsonWriter.value(C1014.f6154);
                    jsonWriter.name("order_uid");
                    jsonWriter.value(new StringBuilder(String.valueOf(C1014.f6140.f4522)).append(C1014.f6161.f6162).append("-").append(UUID.randomUUID().toString()).toString());
                    jsonWriter.endObject();
                    jsonWriter.flush();
                    jsonWriter.close();
                    charArrayWriter.toCharArray();
                    dfVar.f727 = true;
                    try {
                        C1782 r0 = dfVar.f728;
                        c_activity c_activity = C1014.f6147;
                        String str = r15.f8428;
                        C1785 r9 = dfVar.f724;
                        String str2 = "inapp";
                        c_activity c_activity2 = c_activity;
                        C1782 r14 = r0;
                        r0.mo4508("launchPurchaseFlow");
                        r14.mo4507("launchPurchaseFlow");
                        if (!str2.equals("subs") || r14.f8312) {
                            try {
                                C1858 r02 = r14.f8308;
                                r14.f8307.getPackageName();
                                Bundle r10 = r02.mo4541();
                                C1782 r11 = r14;
                                Object obj = r10.get("RESPONSE_CODE");
                                if (obj == null) {
                                    i2 = 0;
                                } else if (obj instanceof Integer) {
                                    i2 = ((Integer) obj).intValue();
                                } else if (obj instanceof Long) {
                                    i2 = (int) ((Long) obj).longValue();
                                } else {
                                    Log.e(r11.f8316, "In-app billing error: " + "Unexpected type for bundle response code.");
                                    Log.e(r11.f8316, "In-app billing error: " + obj.getClass().getName());
                                    throw new RuntimeException("Unexpected type for bundle response code: " + obj.getClass().getName());
                                }
                                if (i2 != 0) {
                                    Log.e(r14.f8316, "In-app billing error: " + ("Unable to buy item, Error response: " + C1782.m2448(i2)));
                                    C1375 r152 = new C1375(i2, "Unable to buy item");
                                    if (r9 != null) {
                                        r9.mo3641(r152, null);
                                    }
                                } else {
                                    PendingIntent pendingIntent = (PendingIntent) r10.getParcelable("BUY_INTENT");
                                    r14.f8309 = 10001;
                                    r14.f8311 = r9;
                                    r14.f8313 = str2;
                                    c_activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 10001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
                                }
                            } catch (SendIntentException e) {
                                Log.e(r14.f8316, "In-app billing error: " + ("SendIntentException while launching purchase flow for sku " + str));
                                e.printStackTrace();
                                C1375 r153 = new C1375(-1004, "Failed to send intent.");
                                if (r9 != null) {
                                    r9.mo3641(r153, null);
                                }
                            } catch (RemoteException e2) {
                                Log.e(r14.f8316, "In-app billing error: " + ("RemoteException while launching purchase flow for sku " + str));
                                e2.printStackTrace();
                                C1375 r154 = new C1375(-1001, "Remote exception while starting purchase flow");
                                if (r9 != null) {
                                    r9.mo3641(r154, null);
                                }
                            }
                        } else {
                            C1375 r102 = new C1375(-1009, "Subscriptions are not available.");
                            if (r9 != null) {
                                r9.mo3641(r102, null);
                            }
                        }
                        C0453ix ixVar = C1014.f6147.f51;
                        String str3 = "Purchase in progress...";
                        if (ixVar.f1370 != null) {
                            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
                        }
                        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str3));
                    } catch (IllegalStateException e3) {
                        throw new C0822tr(e3, "Failed to start purchase process.", false);
                    }
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
    }
}
