package l3;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import m4.d50;
import m4.g70;
import n3.s1;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final Context f5745a;

    /* renamed from: b */
    public boolean f5746b;

    /* renamed from: c */
    public final g70 f5747c;

    /* renamed from: d */
    public final d50 f5748d = new d50(false, Collections.emptyList());

    public b(Context context, g70 g70Var) {
        this.f5745a = context;
        this.f5747c = g70Var;
    }

    public final void a(String str) {
        List<String> list;
        if (!c()) {
            return;
        }
        if (str == null) {
            str = "";
        }
        g70 g70Var = this.f5747c;
        if (g70Var != null) {
            g70Var.a(str, null, 3);
            return;
        }
        d50 d50Var = this.f5748d;
        if (!d50Var.f7224s || (list = d50Var.f7225t) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                s1 s1Var = s.B.f5789c;
                s1.m(this.f5745a, "", replace);
            }
        }
    }

    public final boolean b() {
        return !c() || this.f5746b;
    }

    public final boolean c() {
        g70 g70Var = this.f5747c;
        return (g70Var != null && g70Var.zza().f7735x) || this.f5748d.f7224s;
    }
}
