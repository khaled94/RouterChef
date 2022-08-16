package m4;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zp0 extends br0<bq0> implements ep0, up0 {

    /* renamed from: t */
    public final cm1 f16303t;

    /* renamed from: u */
    public final AtomicBoolean f16304u = new AtomicBoolean();

    public zp0(Set<es0<bq0>> set, cm1 cm1Var) {
        super(set);
        this.f16303t = cm1Var;
    }

    public final void a() {
        qn qnVar;
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8062b5)).booleanValue() || !this.f16304u.compareAndSet(false, true) || (qnVar = this.f16303t.f7037c0) == null || qnVar.f12931s != 3) {
            return;
        }
        M0(new m7(this, 3));
    }

    @Override // m4.up0
    public final void f() {
        if (this.f16303t.f7034b == 1) {
            a();
        }
    }

    @Override // m4.ep0
    public final void l() {
        int i10 = this.f16303t.f7034b;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            a();
        }
    }
}
