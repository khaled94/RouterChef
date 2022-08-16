package m4;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l3.s;
import n3.k1;
import n3.s1;

/* loaded from: classes.dex */
public final class kp1 {

    /* renamed from: a */
    public final Context f10521a;

    /* renamed from: b */
    public final String f10522b;

    /* renamed from: c */
    public final String f10523c;

    public kp1(Context context, o90 o90Var) {
        this.f10521a = context;
        this.f10522b = context.getPackageName();
        this.f10523c = o90Var.f12051s;
    }

    public final void a(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        s sVar = s.B;
        s1 s1Var = sVar.f5789c;
        map.put("device", s1.N());
        map.put("app", this.f10522b);
        map.put("is_lite_sdk", true != s1.g(this.f10521a) ? "0" : "1");
        List<String> b10 = es.b();
        if (((Boolean) jo.f10145d.f10148c.a(es.H4)).booleanValue()) {
            ((ArrayList) b10).addAll(((k1) sVar.f5793g.c()).e().f14606i);
        }
        map.put("e", TextUtils.join(",", b10));
        map.put("sdkVersion", this.f10523c);
    }
}
