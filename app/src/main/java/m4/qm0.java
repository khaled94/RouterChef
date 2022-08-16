package m4;

import java.util.concurrent.atomic.AtomicBoolean;
import m3.p;

/* loaded from: classes.dex */
public final class qm0 implements p {

    /* renamed from: s */
    public final ip0 f12924s;

    /* renamed from: t */
    public final AtomicBoolean f12925t = new AtomicBoolean(false);

    /* renamed from: u */
    public final AtomicBoolean f12926u = new AtomicBoolean(false);

    public qm0(ip0 ip0Var) {
        this.f12924s = ip0Var;
    }

    @Override // m3.p
    public final void J3() {
    }

    @Override // m3.p
    public final void Z1() {
        c();
    }

    @Override // m3.p
    public final void a() {
        this.f12924s.M0(is.f9738s);
    }

    @Override // m3.p
    public final void b() {
    }

    public final void c() {
        if (!this.f12926u.get()) {
            this.f12926u.set(true);
            this.f12924s.M0(k2.f10244t);
        }
    }

    @Override // m3.p
    public final void v2() {
    }

    @Override // m3.p
    public final void w(int i10) {
        this.f12925t.set(true);
        c();
    }
}
