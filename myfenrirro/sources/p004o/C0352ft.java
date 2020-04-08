package p004o;

import android.util.Log;

/* renamed from: o.ft */
final class C0352ft {

    /* renamed from: 櫯 */
    String[] f940 = new String[this.f941];

    /* renamed from: 鷭 */
    int f941 = 5;

    C0352ft(String str) {
        String[] split;
        for (String str2 : str.split("\r")) {
            if (str2.startsWith("﻿")) {
                str2 = str2.substring(1);
            }
            String trim = str2.trim();
            if (!trim.startsWith("//")) {
                String[] split2 = trim.split("\t");
                if (split2.length >= 2) {
                    int parseInt = Integer.parseInt(split2[0].trim());
                    if (parseInt < 0 || parseInt >= this.f941) {
                        String str3 = "Invalid shield view type " + parseInt;
                        Log.e("AndRO", str3);
                        throw new C0588no(str3);
                    }
                    this.f940[parseInt] = split2[1].trim();
                } else {
                    continue;
                }
            }
        }
    }
}
