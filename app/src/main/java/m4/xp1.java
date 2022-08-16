package m4;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import h4.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class xp1 {

    /* renamed from: a */
    public final ba1 f15439a;

    /* renamed from: b */
    public final String f15440b;

    /* renamed from: c */
    public final String f15441c;

    /* renamed from: d */
    public final String f15442d;

    /* renamed from: e */
    public final Context f15443e;

    /* renamed from: f */
    public final mm1 f15444f;

    /* renamed from: g */
    public final a f15445g;

    /* renamed from: h */
    public final w7 f15446h;

    public xp1(ba1 ba1Var, o90 o90Var, String str, String str2, Context context, mm1 mm1Var, a aVar, w7 w7Var) {
        this.f15439a = ba1Var;
        this.f15440b = o90Var.f12051s;
        this.f15441c = str;
        this.f15442d = str2;
        this.f15443e = context;
        this.f15444f = mm1Var;
        this.f15445g = aVar;
        this.f15446h = w7Var;
    }

    public static String c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List<String> a(km1 km1Var, cm1 cm1Var, List<String> list) {
        return b(km1Var, cm1Var, false, "", "", list);
    }

    public final List<String> b(km1 km1Var, cm1 cm1Var, boolean z10, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z10 ? "0" : "1";
        for (String str4 : list) {
            String c10 = c(c(c(str4, "@gw_adlocid@", ((om1) km1Var.f10488a.f8363t).f12205f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f15440b);
            if (cm1Var != null) {
                c10 = y70.b(c(c(c(c10, "@gw_qdata@", cm1Var.f7066z), "@gw_adnetid@", cm1Var.y), "@gw_allocid@", cm1Var.f7065x), this.f15443e, cm1Var.T);
            }
            String c11 = c(c(c(c10, "@gw_adnetstatus@", TextUtils.join("_", this.f15439a.f6430d)), "@gw_seqnum@", this.f15441c), "@gw_sessid@", this.f15442d);
            boolean z11 = false;
            if (((Boolean) jo.f10145d.f10148c.a(es.V1)).booleanValue() && !TextUtils.isEmpty(str)) {
                z11 = true;
            }
            boolean z12 = !TextUtils.isEmpty(str2);
            if (!z11) {
                if (z12) {
                    z12 = true;
                } else {
                    arrayList.add(c11);
                }
            }
            if (this.f15446h.c(Uri.parse(c11))) {
                Uri.Builder buildUpon = Uri.parse(c11).buildUpon();
                if (z11) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z12) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                c11 = buildUpon.build().toString();
            }
            arrayList.add(c11);
        }
        return arrayList;
    }
}
