package m4;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o7 implements ts1, kz1, tc1, v91 {

    /* renamed from: s */
    public final /* synthetic */ int f12017s;

    /* renamed from: t */
    public final Object f12018t;

    public /* synthetic */ o7(Object obj, int i10) {
        this.f12017s = i10;
        this.f12018t = obj;
    }

    @Override // m4.kz1
    public final void a(Object obj) {
        switch (this.f12017s) {
            case 1:
                ((AtomicInteger) ((aa0) this.f12018t).f6088t).set(1);
                return;
            default:
                synchronized (((qc1) this.f12018t)) {
                    ((qc1) this.f12018t).f12785c = ((am0) obj).f6195f;
                    ((am0) obj).b();
                }
                return;
        }
    }

    @Override // m4.ts1
    public final void b(int i10, long j3) {
        ((zr1) this.f12018t).d(i10, System.currentTimeMillis() - j3);
    }

    @Override // m4.ts1
    public final void c(int i10, long j3, String str) {
        ((zr1) this.f12018t).f(i10, System.currentTimeMillis() - j3, null, null, str);
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        ((AtomicInteger) ((aa0) this.f12018t).f6088t).set(-1);
    }

    @Override // m4.v91
    public final void h(Object obj) {
        gg2 gg2Var = (gg2) obj;
    }

    @Override // m4.tc1
    /* renamed from: zza */
    public final void mo22zza() {
        synchronized (((qc1) this.f12018t)) {
        }
    }
}
