package m4;

import java.util.List;
import java.util.concurrent.Executor;
import z3.k;

/* loaded from: classes.dex */
public final class zp1 {

    /* renamed from: a */
    public final Executor f16305a;

    /* renamed from: b */
    public final n90 f16306b;

    public zp1(Executor executor, n90 n90Var) {
        this.f16305a = executor;
        this.f16306b = n90Var;
    }

    public final void a(String str) {
        this.f16305a.execute(new k(this, str, 6));
    }

    public final void b(List<String> list) {
        for (String str : list) {
            a(str);
        }
    }
}
