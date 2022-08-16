package m4;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import m4.am0;
import m4.fo0;

/* loaded from: classes.dex */
public final class kk1<R extends fo0<AdT>, AdT extends am0> implements dl1<R, AdT> {

    /* renamed from: a */
    public final dl1<R, AdT> f10461a;

    /* renamed from: b */
    public final dl1<R, pk1<R, AdT>> f10462b;

    /* renamed from: c */
    public final xn1<R, AdT> f10463c;

    /* renamed from: d */
    public final String f10464d;
    @GuardedBy("this")

    /* renamed from: e */
    public R f10465e;

    /* renamed from: f */
    public final Executor f10466f;

    public kk1(dl1<R, AdT> dl1Var, dl1<R, pk1<R, AdT>> dl1Var2, xn1<R, AdT> xn1Var, String str, Executor executor) {
        this.f10461a = dl1Var;
        this.f10462b = dl1Var2;
        this.f10463c = xn1Var;
        this.f10464d = str;
        this.f10466f = executor;
    }

    @Override // m4.dl1
    public final tz1 a(final el1 el1Var, final cl1 cl1Var) {
        tz1 tz1Var;
        synchronized (this) {
            eo0 b10 = cl1Var.b(el1Var.f8002b);
            b10.b(new lk1(this.f10464d));
            final R r10 = (R) b10.f();
            r10.e();
            r10.e();
            jn jnVar = r10.e().f12203d;
            if (jnVar.K == null && jnVar.P == null) {
                om1 e10 = r10.e();
                final jk1 jk1Var = new jk1(cl1Var, el1Var, e10.f12203d, e10.f12205f, this.f10466f, e10.f12209j, null);
                tz1Var = mz1.p(gz1.r(((qk1) this.f10462b).b(el1Var, cl1Var, r10)), new xy1() { // from class: m4.ik1
                    @Override // m4.xy1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final m4.tz1 h(java.lang.Object r15) {
                        /*
                            r14 = this;
                            m4.kk1 r0 = m4.kk1.this
                            m4.el1 r1 = r2
                            m4.jk1 r2 = r3
                            m4.cl1 r3 = r4
                            m4.fo0 r4 = r5
                            m4.pk1 r15 = (m4.pk1) r15
                            java.util.Objects.requireNonNull(r0)
                            if (r15 == 0) goto L86
                            m4.qn1 r12 = r15.f12540a
                            m4.jk1 r13 = new m4.jk1
                            m4.cl1<U extends m4.fo0<A>> r6 = r2.f10104a
                            m4.el1 r7 = r2.f10105b
                            m4.jn r8 = r2.f10106c
                            java.lang.String r9 = r2.f10107d
                            java.util.concurrent.Executor r10 = r2.f10108e
                            m4.un r11 = r2.f10109f
                            r5 = r13
                            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                            m4.pn1<R extends m4.fo0<AdT>, AdT extends m4.am0> r2 = r15.f12542c
                            r5 = 0
                            if (r2 == 0) goto L3f
                            r0.f10465e = r5
                            m4.xn1<R extends m4.fo0<AdT>, AdT extends m4.am0> r2 = r0.f10463c
                            monitor-enter(r2)
                            java.util.ArrayDeque<m4.wn1<R extends m4.fo0<AdT>, AdT extends m4.am0>> r3 = r2.f15422c     // Catch: java.lang.Throwable -> L3c
                            r3.add(r13)     // Catch: java.lang.Throwable -> L3c
                            monitor-exit(r2)
                            m4.pn1<R extends m4.fo0<AdT>, AdT extends m4.am0> r15 = r15.f12542c
                            m4.tz1 r15 = r0.b(r15, r1)
                            goto L90
                        L3c:
                            r15 = move-exception
                            monitor-exit(r2)
                            throw r15
                        L3f:
                            m4.xn1<R extends m4.fo0<AdT>, AdT extends m4.am0> r2 = r0.f10463c
                            monitor-enter(r2)
                            r6 = 2
                            r2.f15424e = r6     // Catch: java.lang.Throwable -> L83
                            monitor-enter(r2)     // Catch: java.lang.Throwable -> L83
                            m4.do1<R extends m4.fo0<AdT>, AdT extends m4.am0> r6 = r2.f15423d     // Catch: java.lang.Throwable -> L80
                            r7 = 1
                            if (r6 != 0) goto L4d
                            r8 = r7
                            goto L4e
                        L4d:
                            r8 = 0
                        L4e:
                            monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
                            if (r8 == 0) goto L54
                            monitor-exit(r2)
                            r6 = r5
                            goto L59
                        L54:
                            m4.tz1 r6 = r6.a(r13)     // Catch: java.lang.Throwable -> L83
                            monitor-exit(r2)
                        L59:
                            if (r6 == 0) goto L69
                            r0.f10465e = r5
                            m4.z31 r15 = new m4.z31
                            r15.<init>(r0, r7)
                            java.util.concurrent.Executor r0 = r0.f10466f
                            m4.tz1 r15 = m4.mz1.p(r6, r15, r0)
                            goto L90
                        L69:
                            m4.xn1<R extends m4.fo0<AdT>, AdT extends m4.am0> r2 = r0.f10463c
                            monitor-enter(r2)
                            java.util.ArrayDeque<m4.wn1<R extends m4.fo0<AdT>, AdT extends m4.am0>> r5 = r2.f15422c     // Catch: java.lang.Throwable -> L7d
                            r5.add(r13)     // Catch: java.lang.Throwable -> L7d
                            monitor-exit(r2)
                            m4.el1 r2 = new m4.el1
                            m4.bl1 r1 = r1.f8002b
                            m4.o50 r15 = r15.f12541b
                            r2.<init>(r1, r15)
                            r1 = r2
                            goto L86
                        L7d:
                            r15 = move-exception
                            monitor-exit(r2)
                            throw r15
                        L80:
                            r15 = move-exception
                            monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
                            throw r15     // Catch: java.lang.Throwable -> L83
                        L83:
                            r15 = move-exception
                            monitor-exit(r2)
                            throw r15
                        L86:
                            m4.dl1<R extends m4.fo0<AdT>, AdT extends m4.am0> r15 = r0.f10461a
                            m4.tk1 r15 = (m4.tk1) r15
                            m4.tz1 r15 = r15.b(r1, r3, r4)
                            r0.f10465e = r4
                        L90:
                            return r15
                        */
                        throw new UnsupportedOperationException("Method not decompiled: m4.ik1.h(java.lang.Object):m4.tz1");
                    }
                }, this.f10466f);
            }
            this.f10465e = r10;
            tz1Var = ((tk1) this.f10461a).b(el1Var, cl1Var, r10);
        }
        return tz1Var;
    }

    public final tz1<AdT> b(pn1<R, AdT> pn1Var, el1 el1Var) {
        R r10 = pn1Var.f12576a;
        this.f10465e = r10;
        if (pn1Var.f12578c != null) {
            if (r10.d() != null) {
                pn1Var.f12578c.f6194e.g(pn1Var.f12576a.d());
            }
            return mz1.m(pn1Var.f12578c);
        }
        r10.a().f15057g = pn1Var.f12577b;
        return ((tk1) this.f10461a).b(el1Var, null, pn1Var.f12576a);
    }

    @Override // m4.dl1
    public final Object g() {
        R r10;
        synchronized (this) {
            r10 = this.f10465e;
        }
        return r10;
    }
}
