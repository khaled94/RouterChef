package m4;

import h4.a;
import java.util.concurrent.atomic.AtomicReference;
import m4.dh1;

/* loaded from: classes.dex */
public final class me1<S extends dh1> implements eh1<S> {

    /* renamed from: a */
    public final AtomicReference<le1<S>> f11177a = new AtomicReference<>();

    /* renamed from: b */
    public final a f11178b;

    /* renamed from: c */
    public final eh1<S> f11179c;

    /* renamed from: d */
    public final long f11180d;

    public me1(eh1<S> eh1Var, long j3, a aVar) {
        this.f11178b = aVar;
        this.f11179c = eh1Var;
        this.f11180d = j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if ((r0.f10743b < r0.f10744c.b()) != false) goto L9;
     */
    @Override // m4.eh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.tz1<S> a() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicReference<m4.le1<S extends m4.dh1>> r0 = r5.f11177a
            java.lang.Object r0 = r0.get()
            m4.le1 r0 = (m4.le1) r0
            if (r0 == 0) goto L1b
            long r1 = r0.f10743b
            h4.a r3 = r0.f10744c
            long r3 = r3.b()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 == 0) goto L2f
        L1b:
            m4.le1 r0 = new m4.le1
            m4.eh1<S extends m4.dh1> r1 = r5.f11179c
            m4.tz1 r1 = r1.a()
            long r2 = r5.f11180d
            h4.a r4 = r5.f11178b
            r0.<init>(r1, r2, r4)
            java.util.concurrent.atomic.AtomicReference<m4.le1<S extends m4.dh1>> r1 = r5.f11177a
            r1.set(r0)
        L2f:
            m4.tz1<S extends m4.dh1<?>> r0 = r0.f10742a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.me1.a():m4.tz1");
    }
}
