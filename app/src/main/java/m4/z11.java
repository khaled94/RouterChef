package m4;

import android.content.Context;
import java.util.Objects;
import k4.b;

/* loaded from: classes.dex */
public final class z11 implements s11 {

    /* renamed from: a */
    public final long f15976a;

    /* renamed from: b */
    public final oc1 f15977b;

    public z11(long j3, Context context, fk0 fk0Var, if0 if0Var, String str) {
        this.f15976a = j3;
        zg0 y = if0Var.y();
        Objects.requireNonNull(context);
        y.f16200b = context;
        y.f16202d = new on();
        Objects.requireNonNull(str);
        y.f16201c = str;
        oc1 a10 = y.a().f6158g.a();
        this.f15977b = a10;
        a10.Y0(new y11(this, fk0Var));
    }

    @Override // m4.s11
    public final void a(jn jnVar) {
        this.f15977b.F1(jnVar);
    }

    @Override // m4.s11
    public final void c() {
        this.f15977b.k1(new b(null));
    }

    @Override // m4.s11
    public final void zza() {
        this.f15977b.L();
    }
}
