package m4;

import c5.m;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class vc0 implements kz1, yl0, v91, m {

    /* renamed from: s */
    public Object f14660s;

    public /* synthetic */ vc0() {
        this.f14660s = new CountDownLatch(1);
    }

    public /* synthetic */ vc0(Object obj) {
        this.f14660s = obj;
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((c41) this.f14660s).f6726g.l0((km1) obj);
    }

    @Override // c5.c
    public final void b() {
        ((CountDownLatch) this.f14660s).countDown();
    }

    @Override // c5.f
    public final void c(Object obj) {
        ((CountDownLatch) this.f14660s).countDown();
    }

    @Override // c5.e
    public final void e(Exception exc) {
        ((CountDownLatch) this.f14660s).countDown();
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        ((c41) this.f14660s).f6727h.h();
    }

    @Override // m4.v91
    public final void h(Object obj) {
        ((rx) obj).y0(((ze2) this.f14660s).f16170f);
    }

    @Override // m4.yl0
    public final lq zza() {
        ym1 ym1Var = (ym1) this.f14660s;
        Objects.requireNonNull(ym1Var);
        try {
            return ym1Var.f15839a.f();
        } catch (Throwable th) {
            throw new pm1(th);
        }
    }
}
