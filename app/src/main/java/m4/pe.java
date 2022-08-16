package m4;

import c1.e;
import c5.d;
import c5.i;
import c5.s;
import d4.m;
import java.io.IOException;
import y4.a6;
import y4.f;
import y4.h3;
import y4.k6;

/* loaded from: classes.dex */
public final class pe implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f12488s;

    /* renamed from: t */
    public final /* synthetic */ Object f12489t;

    /* renamed from: u */
    public final /* synthetic */ Object f12490u;

    public /* synthetic */ pe(Object obj, Object obj2, int i10) {
        this.f12488s = i10;
        this.f12490u = obj;
        this.f12489t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 1;
        boolean z10 = false;
        switch (this.f12488s) {
            case 0:
                te teVar = ((se) this.f12490u).f13612w;
                IOException iOException = (IOException) this.f12489t;
                dc0 dc0Var = (dc0) teVar;
                va0 va0Var = dc0Var.E;
                if (va0Var == null) {
                    return;
                }
                if (dc0Var.f7295z.f7767k) {
                    va0Var.c(iOException);
                    return;
                } else {
                    va0Var.f("onLoadError", iOException);
                    return;
                }
            case 1:
                String str = (String) this.f12490u;
                oa0 oa0Var = ((sb0) this.f12489t).f13581x;
                if (oa0Var == null) {
                    return;
                }
                ((ta0) oa0Var).c("exception", "what", "ExoPlayerAdapter exception", "extra", str);
                return;
            case 2:
                pk2 pk2Var = (pk2) this.f12489t;
                jp2 jp2Var = (jp2) this.f12490u;
                pk2Var.N = pk2Var.G == null ? jp2Var : new ip2(-9223372036854775807L, 0L);
                pk2Var.O = jp2Var.b();
                if (pk2Var.U == -1 && jp2Var.b() == -9223372036854775807L) {
                    z10 = true;
                }
                pk2Var.P = z10;
                if (true == z10) {
                    i10 = 7;
                }
                pk2Var.Q = i10;
                pk2Var.f12552x.p(pk2Var.O, jp2Var.f(), pk2Var.P);
                if (pk2Var.K) {
                    return;
                }
                pk2Var.x();
                return;
            case 3:
                ((h3) this.f12490u).f20483s.a();
                a6 a6Var = ((h3) this.f12490u).f20483s;
                k6 k6Var = (k6) this.f12489t;
                a6Var.B().g();
                a6Var.e();
                m.e(k6Var.f20535s);
                f b10 = f.b(k6Var.N);
                f L = a6Var.L(k6Var.f20535s);
                a6Var.C().F.c("Setting consent, package, consent", k6Var.f20535s, b10);
                a6Var.p(k6Var.f20535s, b10);
                if (!b10.h(L)) {
                    return;
                }
                a6Var.n(k6Var);
                return;
            default:
                synchronized (((s) this.f12490u).f2797t) {
                    d<TResult> dVar = ((s) this.f12490u).f2798u;
                    if (dVar != 0) {
                        dVar.c((i) this.f12489t);
                    }
                }
                return;
        }
    }

    public /* synthetic */ pe(Object obj, Object obj2, int i10, e eVar) {
        this.f12488s = i10;
        this.f12489t = obj;
        this.f12490u = obj2;
    }
}
