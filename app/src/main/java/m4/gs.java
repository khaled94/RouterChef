package m4;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import l3.s;
import m3.g;
import n3.s1;

/* loaded from: classes.dex */
public final class gs {

    /* renamed from: a */
    public final String f9013a = ht.f9445b.e();

    /* renamed from: b */
    public final Map<String, String> f9014b;

    /* renamed from: c */
    public final Context f9015c;

    /* renamed from: d */
    public final String f9016d;

    public gs(Context context, String str) {
        this.f9015c = context;
        this.f9016d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f9014b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        s sVar = s.B;
        s1 s1Var = sVar.f5789c;
        linkedHashMap.put("device", s1.N());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        linkedHashMap.put("is_lite_sdk", true != s1.g(context) ? "0" : "1");
        g gVar = sVar.f5800n;
        Objects.requireNonNull(gVar);
        tz1 Z = u90.f14294a.Z(new t50(gVar, context));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((s50) Z.get()).f13524j));
            linkedHashMap.put("network_fine", Integer.toString(((s50) Z.get()).f13525k));
        } catch (Exception e10) {
            s.B.f5793g.g(e10, "CsiConfiguration.CsiConfiguration");
        }
    }
}
