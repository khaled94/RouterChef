package m4;

import android.content.Context;
import android.os.Bundle;
import e1.j;
import java.util.Objects;

/* loaded from: classes.dex */
public final class go {

    /* renamed from: a */
    public final in f8983a;

    /* renamed from: b */
    public final hn f8984b;

    /* renamed from: c */
    public final br f8985c;

    /* renamed from: d */
    public final b40 f8986d;

    /* renamed from: e */
    public w40 f8987e;

    public go(in inVar, hn hnVar, br brVar, b40 b40Var) {
        this.f8983a = inVar;
        this.f8984b = hnVar;
        this.f8985c = brVar;
        this.f8986d = b40Var;
    }

    public static void b(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        io ioVar = io.f9708f;
        g90 g90Var = ioVar.f9709a;
        String str2 = ioVar.f9712d.f12051s;
        Objects.requireNonNull(g90Var);
        g90.i(context, str2, bundle, new j(g90Var));
    }

    public final t30 a(Context context, f10 f10Var) {
        return new zn(context, f10Var).d(context, false);
    }
}
