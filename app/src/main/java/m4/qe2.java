package m4;

import android.os.Handler;
import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qe2 {

    /* renamed from: a */
    public final d30 f12817a = new d30();

    /* renamed from: b */
    public final j40 f12818b = new j40();

    /* renamed from: c */
    public final eg2 f12819c;

    /* renamed from: d */
    public final Handler f12820d;

    /* renamed from: e */
    public long f12821e;

    /* renamed from: f */
    public int f12822f;

    /* renamed from: g */
    public boolean f12823g;

    /* renamed from: h */
    public ne2 f12824h;

    /* renamed from: i */
    public ne2 f12825i;

    /* renamed from: j */
    public ne2 f12826j;

    /* renamed from: k */
    public int f12827k;

    /* renamed from: l */
    public Object f12828l;

    /* renamed from: m */
    public long f12829m;

    public qe2(eg2 eg2Var, Handler handler) {
        this.f12819c = eg2Var;
        this.f12820d = handler;
    }

    public static final boolean c(uj2 uj2Var) {
        return !uj2Var.a() && uj2Var.f8977e == -1;
    }

    public final boolean A(z40 z40Var, uj2 uj2Var, boolean z10) {
        int a10 = z40Var.a(uj2Var.f8973a);
        return !z40Var.e(z40Var.d(a10, this.f12817a, false).f7204c, this.f12818b, 0L).f9841g && z40Var.i(a10, this.f12817a, this.f12818b, this.f12822f, this.f12823g) == -1 && z10;
    }

    public final boolean a(z40 z40Var, uj2 uj2Var) {
        if (!c(uj2Var)) {
            return false;
        }
        return z40Var.e(z40Var.n(uj2Var.f8973a, this.f12817a).f7204c, this.f12818b, 0L).f9847m == z40Var.a(uj2Var.f8973a);
    }

    public final boolean b(z40 z40Var) {
        ne2 ne2Var;
        ne2 ne2Var2 = this.f12824h;
        if (ne2Var2 == null) {
            return true;
        }
        int a10 = z40Var.a(ne2Var2.f11638b);
        while (true) {
            a10 = z40Var.i(a10, this.f12817a, this.f12818b, this.f12822f, this.f12823g);
            while (true) {
                ne2Var = ne2Var2.f11648l;
                if (ne2Var == null || ne2Var2.f11642f.f12135f) {
                    break;
                }
                ne2Var2 = ne2Var;
            }
            if (a10 == -1 || ne2Var == null || z40Var.a(ne2Var.f11638b) != a10) {
                break;
            }
            ne2Var2 = ne2Var;
        }
        boolean o10 = o(ne2Var2);
        ne2Var2.f11642f = j(z40Var, ne2Var2.f11642f);
        return !o10;
    }

    public final ne2 d() {
        ne2 ne2Var = this.f12824h;
        if (ne2Var == null) {
            return null;
        }
        if (ne2Var == this.f12825i) {
            this.f12825i = ne2Var.f11648l;
        }
        ne2Var.k();
        int i10 = this.f12827k - 1;
        this.f12827k = i10;
        if (i10 == 0) {
            this.f12826j = null;
            ne2 ne2Var2 = this.f12824h;
            this.f12828l = ne2Var2.f11638b;
            this.f12829m = ne2Var2.f11642f.f12130a.f8976d;
        }
        this.f12824h = this.f12824h.f11648l;
        z();
        return this.f12824h;
    }

    public final ne2 e() {
        ne2 ne2Var = this.f12825i;
        r01.h((ne2Var == null || ne2Var.f11648l == null) ? false : true);
        this.f12825i = this.f12825i.f11648l;
        z();
        return this.f12825i;
    }

    public final ne2 f() {
        return this.f12826j;
    }

    public final ne2 g() {
        return this.f12824h;
    }

    public final ne2 h() {
        return this.f12825i;
    }

    public final oe2 i(long j3, ze2 ze2Var) {
        ne2 ne2Var = this.f12826j;
        return ne2Var == null ? w(ze2Var.f16165a, ze2Var.f16166b, ze2Var.f16167c, ze2Var.f16182s) : v(ze2Var.f16165a, ne2Var, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.oe2 j(m4.z40 r14, m4.oe2 r15) {
        /*
            r13 = this;
            m4.uj2 r1 = r15.f12130a
            boolean r10 = c(r1)
            boolean r11 = r13.a(r14, r1)
            boolean r12 = r13.A(r14, r1, r10)
            m4.uj2 r0 = r15.f12130a
            java.lang.Object r0 = r0.f8973a
            m4.d30 r2 = r13.f12817a
            r14.n(r0, r2)
            boolean r14 = r1.a()
            r0 = -1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 != 0) goto L31
            int r14 = r1.f8977e
            if (r14 != r0) goto L28
            goto L31
        L28:
            m4.d30 r4 = r13.f12817a
            r4.c(r14)
            r4 = 0
            r6 = r4
            goto L32
        L31:
            r6 = r2
        L32:
            boolean r14 = r1.a()
            if (r14 == 0) goto L43
            m4.d30 r14 = r13.f12817a
            int r2 = r1.f8974b
            int r3 = r1.f8975c
            long r2 = r14.b(r2, r3)
            goto L4d
        L43:
            int r14 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r14 == 0) goto L49
            r8 = r6
            goto L4e
        L49:
            m4.d30 r14 = r13.f12817a
            long r2 = r14.f7205d
        L4d:
            r8 = r2
        L4e:
            boolean r14 = r1.a()
            if (r14 == 0) goto L5c
            m4.d30 r14 = r13.f12817a
            int r0 = r1.f8974b
            r14.e(r0)
            goto L65
        L5c:
            int r14 = r1.f8977e
            if (r14 == r0) goto L65
            m4.d30 r0 = r13.f12817a
            r0.e(r14)
        L65:
            m4.oe2 r14 = new m4.oe2
            long r2 = r15.f12131b
            long r4 = r15.f12132c
            r0 = r14
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.qe2.j(m4.z40, m4.oe2):m4.oe2");
    }

    public final uj2 k(z40 z40Var, Object obj) {
        long j3;
        int a10;
        int i10 = z40Var.n(obj, this.f12817a).f7204c;
        Object obj2 = this.f12828l;
        if (obj2 == null || (a10 = z40Var.a(obj2)) == -1 || z40Var.d(a10, this.f12817a, false).f7204c != i10) {
            ne2 ne2Var = this.f12824h;
            while (true) {
                if (ne2Var == null) {
                    ne2Var = this.f12824h;
                    while (ne2Var != null) {
                        int a11 = z40Var.a(ne2Var.f11638b);
                        if (a11 == -1 || z40Var.d(a11, this.f12817a, false).f7204c != i10) {
                            ne2Var = ne2Var.f11648l;
                        }
                    }
                    j3 = this.f12821e;
                    this.f12821e = 1 + j3;
                    if (this.f12824h == null) {
                        this.f12828l = obj;
                        this.f12829m = j3;
                    }
                } else if (ne2Var.f11638b.equals(obj)) {
                    break;
                } else {
                    ne2Var = ne2Var.f11648l;
                }
            }
            j3 = ne2Var.f11642f.f12130a.f8976d;
        } else {
            j3 = this.f12829m;
        }
        d30 d30Var = this.f12817a;
        z40Var.n(obj, d30Var);
        Objects.requireNonNull(d30Var);
        return new uj2(obj, j3);
    }

    public final void l() {
        if (this.f12827k == 0) {
            return;
        }
        ne2 ne2Var = this.f12824h;
        r01.d(ne2Var);
        this.f12828l = ne2Var.f11638b;
        this.f12829m = ne2Var.f11642f.f12130a.f8976d;
        while (ne2Var != null) {
            ne2Var.k();
            ne2Var = ne2Var.f11648l;
        }
        this.f12824h = null;
        this.f12826j = null;
        this.f12825i = null;
        this.f12827k = 0;
        z();
    }

    public final void m(long j3) {
        ne2 ne2Var = this.f12826j;
        if (ne2Var != null) {
            r01.h(ne2Var.p());
            if (!ne2Var.f11640d) {
                return;
            }
            ne2Var.f11637a.e(j3 - ne2Var.f11651o);
        }
    }

    public final boolean n(tj2 tj2Var) {
        ne2 ne2Var = this.f12826j;
        return ne2Var != null && ne2Var.f11637a == tj2Var;
    }

    public final boolean o(ne2 ne2Var) {
        boolean z10 = false;
        r01.h(ne2Var != null);
        if (ne2Var.equals(this.f12826j)) {
            return false;
        }
        this.f12826j = ne2Var;
        while (true) {
            ne2Var = ne2Var.f11648l;
            if (ne2Var == null) {
                break;
            }
            if (ne2Var == this.f12825i) {
                this.f12825i = this.f12824h;
                z10 = true;
            }
            ne2Var.k();
            this.f12827k--;
        }
        ne2 ne2Var2 = this.f12826j;
        if (ne2Var2.f11648l != null) {
            ne2Var2.n();
            ne2Var2.f11648l = null;
            ne2Var2.o();
        }
        z();
        return z10;
    }

    public final boolean p() {
        ne2 ne2Var = this.f12826j;
        if (ne2Var != null) {
            if (ne2Var.f11642f.f12137h || !ne2Var.m() || this.f12826j.f11642f.f12134e == -9223372036854775807L) {
                return false;
            }
            return this.f12827k < 100;
        }
        return true;
    }

    public final boolean q(z40 z40Var, long j3, long j10) {
        oe2 oe2Var;
        boolean z10;
        ne2 ne2Var = null;
        for (ne2 ne2Var2 = this.f12824h; ne2Var2 != null; ne2Var2 = ne2Var2.f11648l) {
            oe2 oe2Var2 = ne2Var2.f11642f;
            if (ne2Var == null) {
                oe2Var = j(z40Var, oe2Var2);
            } else {
                oe2 v10 = v(z40Var, ne2Var, j3);
                if (v10 == null) {
                    return !o(ne2Var);
                } else if (oe2Var2.f12131b != v10.f12131b || !oe2Var2.f12130a.equals(v10.f12130a)) {
                    return !o(ne2Var);
                } else {
                    oe2Var = v10;
                }
            }
            ne2Var2.f11642f = oe2Var.a(oe2Var2.f12132c);
            long j11 = oe2Var2.f12134e;
            long j12 = oe2Var.f12134e;
            if (j11 != -9223372036854775807L && j11 != j12) {
                ne2Var2.l();
                long j13 = oe2Var.f12134e;
                long j14 = j13 == -9223372036854775807L ? Long.MAX_VALUE : j13 + ne2Var2.f11651o;
                if (ne2Var2 == this.f12825i) {
                    Objects.requireNonNull(ne2Var2.f11642f);
                    if (j10 == Long.MIN_VALUE || j10 >= j14) {
                        z10 = true;
                        return o(ne2Var2) && !z10;
                    }
                }
                z10 = false;
                if (o(ne2Var2)) {
                }
            }
            ne2Var = ne2Var2;
        }
        return true;
    }

    public final boolean r(z40 z40Var, int i10) {
        this.f12822f = i10;
        return b(z40Var);
    }

    public final boolean s(z40 z40Var, boolean z10) {
        this.f12823g = z10;
        return b(z40Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1 != (-9223372036854775807L)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.ne2 t(m4.sz1[] r12, m4.yl2 r13, m4.pm2 r14, m4.ye2 r15, m4.oe2 r16, m4.am2 r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            m4.ne2 r1 = r0.f12826j
            if (r1 != 0) goto L1e
            m4.uj2 r1 = r8.f12130a
            boolean r1 = r1.a()
            if (r1 == 0) goto L1b
            long r1 = r8.f12132c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L1b
            goto L29
        L1b:
            r1 = 0
            goto L29
        L1e:
            long r2 = r1.f11651o
            m4.oe2 r1 = r1.f11642f
            long r4 = r1.f12134e
            long r2 = r2 + r4
            long r4 = r8.f12131b
            long r1 = r2 - r4
        L29:
            r3 = r1
            m4.ne2 r10 = new m4.ne2
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            m4.ne2 r1 = r0.f12826j
            if (r1 == 0) goto L4a
            m4.ne2 r2 = r1.f11648l
            if (r10 != r2) goto L41
            goto L4e
        L41:
            r1.n()
            r1.f11648l = r10
            r1.o()
            goto L4e
        L4a:
            r0.f12824h = r10
            r0.f12825i = r10
        L4e:
            r1 = 0
            r0.f12828l = r1
            r0.f12826j = r10
            int r1 = r0.f12827k
            int r1 = r1 + 1
            r0.f12827k = r1
            r11.z()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.qe2.t(m4.sz1[], m4.yl2, m4.pm2, m4.ye2, m4.oe2, m4.am2):m4.ne2");
    }

    public final void u(z40 z40Var, Object obj, int i10) {
        z40Var.n(obj, this.f12817a);
        this.f12817a.c(i10);
        Objects.requireNonNull(this.f12817a.f7207f.a(i10));
    }

    public final oe2 v(z40 z40Var, ne2 ne2Var, long j3) {
        long j10;
        long j11;
        long j12;
        Object obj;
        long j13;
        oe2 oe2Var = ne2Var.f11642f;
        long j14 = (ne2Var.f11651o + oe2Var.f12134e) - j3;
        if (!oe2Var.f12135f) {
            uj2 uj2Var = oe2Var.f12130a;
            z40Var.n(uj2Var.f8973a, this.f12817a);
            if (uj2Var.a()) {
                int i10 = uj2Var.f8974b;
                if (this.f12817a.f7207f.a(i10).f6715a == -1) {
                    return null;
                }
                int a10 = this.f12817a.f7207f.a(i10).a(uj2Var.f8975c);
                if (a10 < 0) {
                    return x(z40Var, uj2Var.f8973a, i10, a10, oe2Var.f12132c, uj2Var.f8976d);
                }
                long j15 = oe2Var.f12132c;
                if (j15 == -9223372036854775807L) {
                    j40 j40Var = this.f12818b;
                    d30 d30Var = this.f12817a;
                    Pair<Object, Long> m10 = z40Var.m(j40Var, d30Var, d30Var.f7204c, -9223372036854775807L, Math.max(0L, j14));
                    if (m10 == null) {
                        return null;
                    }
                    j15 = ((Long) m10.second).longValue();
                }
                u(z40Var, uj2Var.f8973a, uj2Var.f8974b);
                return y(z40Var, uj2Var.f8973a, Math.max(0L, j15), oe2Var.f12132c, uj2Var.f8976d);
            }
            int a11 = this.f12817a.a(uj2Var.f8977e);
            if (a11 != this.f12817a.f7207f.a(uj2Var.f8977e).f6715a) {
                return x(z40Var, uj2Var.f8973a, uj2Var.f8977e, a11, oe2Var.f12134e, uj2Var.f8976d);
            }
            u(z40Var, uj2Var.f8973a, uj2Var.f8977e);
            return y(z40Var, uj2Var.f8973a, 0L, oe2Var.f12134e, uj2Var.f8976d);
        }
        int i11 = z40Var.i(z40Var.a(oe2Var.f12130a.f8973a), this.f12817a, this.f12818b, this.f12822f, this.f12823g);
        if (i11 == -1) {
            return null;
        }
        int i12 = z40Var.d(i11, this.f12817a, true).f7204c;
        Object obj2 = this.f12817a.f7203b;
        long j16 = oe2Var.f12130a.f8976d;
        if (z40Var.e(i12, this.f12818b, 0L).f9846l == i11) {
            Pair<Object, Long> m11 = z40Var.m(this.f12818b, this.f12817a, i12, -9223372036854775807L, Math.max(0L, j14));
            if (m11 == null) {
                return null;
            }
            Object obj3 = m11.first;
            long longValue = ((Long) m11.second).longValue();
            ne2 ne2Var2 = ne2Var.f11648l;
            if (ne2Var2 == null || !ne2Var2.f11638b.equals(obj3)) {
                j13 = this.f12821e;
                this.f12821e = 1 + j13;
            } else {
                j13 = ne2Var2.f11642f.f12130a.f8976d;
            }
            j10 = j13;
            j11 = -9223372036854775807L;
            j12 = longValue;
            obj = obj3;
        } else {
            obj = obj2;
            j10 = j16;
            j12 = 0;
            j11 = 0;
        }
        d30 d30Var2 = this.f12817a;
        z40Var.n(obj, d30Var2);
        Objects.requireNonNull(d30Var2);
        z40Var.n(obj, this.f12817a);
        return y(z40Var, obj, j12, j11, j10);
    }

    public final oe2 w(z40 z40Var, uj2 uj2Var, long j3, long j10) {
        z40Var.n(uj2Var.f8973a, this.f12817a);
        boolean a10 = uj2Var.a();
        Object obj = uj2Var.f8973a;
        return a10 ? x(z40Var, obj, uj2Var.f8974b, uj2Var.f8975c, j3, uj2Var.f8976d) : y(z40Var, obj, j10, j3, uj2Var.f8976d);
    }

    public final oe2 x(z40 z40Var, Object obj, int i10, int i11, long j3, long j10) {
        uj2 uj2Var = new uj2(obj, i10, i11, j10);
        long b10 = z40Var.n(obj, this.f12817a).b(i10, i11);
        if (i11 == this.f12817a.a(i10)) {
            this.f12817a.d();
        }
        this.f12817a.e(i10);
        return new oe2(uj2Var, (b10 == -9223372036854775807L || b10 > 0) ? 0L : Math.max(0L, (-1) + b10), j3, -9223372036854775807L, b10, false, false, false);
    }

    public final oe2 y(z40 z40Var, Object obj, long j3, long j10, long j11) {
        z40Var.n(obj, this.f12817a);
        Objects.requireNonNull(this.f12817a);
        uj2 uj2Var = new uj2(obj, j11);
        boolean c10 = c(uj2Var);
        boolean a10 = a(z40Var, uj2Var);
        boolean A = A(z40Var, uj2Var, c10);
        long j12 = this.f12817a.f7205d;
        return new oe2(uj2Var, (j12 == -9223372036854775807L || j3 < j12) ? j3 : Math.max(0L, (-1) + j12), j10, -9223372036854775807L, j12, c10, a10, A);
    }

    public final void z() {
        dw1 o10 = gw1.o();
        for (ne2 ne2Var = this.f12824h; ne2Var != null; ne2Var = ne2Var.f11648l) {
            o10.n(ne2Var.f11642f.f12130a);
        }
        ne2 ne2Var2 = this.f12825i;
        this.f12820d.post(new pe2(this, o10, ne2Var2 == null ? null : ne2Var2.f11642f.f12130a));
    }
}
