package m4;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.b1;
import l3.s;
import n3.s1;

/* loaded from: classes.dex */
public final class y70 {
    public static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            StringBuilder sb = new StringBuilder(str.substring(0, i10));
            b1.b(sb, str2, "=", str3, "&");
            sb.append(str.substring(i10));
            return Uri.parse(sb.toString());
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    public static String b(String str, Context context, boolean z10) {
        String f10;
        yr<Boolean> yrVar = es.f8073d0;
        jo joVar = jo.f10145d;
        if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue() || z10) {
            s sVar = s.B;
            if (!sVar.f5809x.l(context) || TextUtils.isEmpty(str) || (f10 = sVar.f5809x.f(context)) == null) {
                return str;
            }
            String str2 = (String) joVar.f10148c.a(es.W);
            if (((Boolean) joVar.f10148c.a(es.V)).booleanValue() && str.contains(str2)) {
                if (s1.C(str, sVar.f5789c.f16557a, (String) joVar.f10148c.a(es.T))) {
                    sVar.f5809x.i(context, f10);
                    return c(str, context).replace(str2, f10);
                } else if (!s1.C(str, sVar.f5789c.f16558b, (String) joVar.f10148c.a(es.U))) {
                    return str;
                } else {
                    sVar.f5809x.j(context, f10);
                    return c(str, context).replace(str2, f10);
                }
            } else if (str.contains("fbs_aeid")) {
                return str;
            } else {
                if (s1.C(str, sVar.f5789c.f16557a, (String) joVar.f10148c.a(es.T))) {
                    sVar.f5809x.i(context, f10);
                    return a(c(str, context), "fbs_aeid", f10).toString();
                } else if (!s1.C(str, sVar.f5789c.f16558b, (String) joVar.f10148c.a(es.U))) {
                    return str;
                } else {
                    sVar.f5809x.j(context, f10);
                    return a(c(str, context), "fbs_aeid", f10).toString();
                }
            }
        }
        return str;
    }

    public static String c(String str, Context context) {
        s sVar = s.B;
        String h10 = sVar.f5809x.h(context);
        String g10 = sVar.f5809x.g(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(h10)) {
            str = a(str, "gmp_app_id", h10).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(g10)) ? str : a(str, "fbs_aiid", g10).toString();
    }
}
