package m4;

/* loaded from: classes.dex */
public final class i2 implements q2, v91 {

    /* renamed from: s */
    public Object f9513s;

    /* renamed from: t */
    public Object f9514t;

    /* renamed from: u */
    public Object f9515u;

    public i2(String str) {
        kq2 kq2Var = new kq2();
        kq2Var.f10542j = str;
        this.f9513s = new t(kq2Var);
    }

    public /* synthetic */ i2(fg2 fg2Var, nj2 nj2Var, w3 w3Var) {
        this.f9513s = fg2Var;
        this.f9514t = nj2Var;
        this.f9515u = w3Var;
    }

    @Override // m4.q2
    public final void b(eq1 eq1Var, vo2 vo2Var, a3 a3Var) {
        this.f9514t = eq1Var;
        a3Var.c();
        mp2 p = vo2Var.p(a3Var.a(), 5);
        this.f9515u = p;
        p.f((t) this.f9513s);
    }

    @Override // m4.q2
    public final void d(dd ddVar) {
        long c10;
        r01.d((eq1) this.f9514t);
        int i10 = ls1.f10971a;
        eq1 eq1Var = (eq1) this.f9514t;
        synchronized (eq1Var) {
            long j3 = eq1Var.f8037c;
            c10 = j3 != -9223372036854775807L ? j3 + eq1Var.f8036b : eq1Var.c();
        }
        long d5 = ((eq1) this.f9514t).d();
        if (c10 == -9223372036854775807L || d5 == -9223372036854775807L) {
            return;
        }
        t tVar = (t) this.f9513s;
        if (d5 != tVar.f13875o) {
            kq2 kq2Var = new kq2(tVar);
            kq2Var.f10546n = d5;
            t tVar2 = new t(kq2Var);
            this.f9513s = tVar2;
            ((mp2) this.f9515u).f(tVar2);
        }
        int zza = ddVar.zza();
        ((mp2) this.f9515u).d(ddVar, zza);
        ((mp2) this.f9515u).e(c10, 1, zza, 0, null);
    }

    @Override // m4.v91
    public final void h(Object obj) {
        gg2 gg2Var = (gg2) obj;
    }
}
