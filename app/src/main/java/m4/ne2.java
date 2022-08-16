package m4;

import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ne2 {

    /* renamed from: a */
    public final tj2 f11637a;

    /* renamed from: b */
    public final Object f11638b;

    /* renamed from: d */
    public boolean f11640d;

    /* renamed from: e */
    public boolean f11641e;

    /* renamed from: f */
    public oe2 f11642f;

    /* renamed from: g */
    public boolean f11643g;

    /* renamed from: i */
    public final sz1[] f11645i;

    /* renamed from: j */
    public final yl2 f11646j;

    /* renamed from: k */
    public final ye2 f11647k;

    /* renamed from: l */
    public ne2 f11648l;

    /* renamed from: n */
    public am2 f11650n;

    /* renamed from: o */
    public long f11651o;

    /* renamed from: m */
    public s70 f11649m = s70.f13532d;

    /* renamed from: c */
    public final zk2[] f11639c = new zk2[2];

    /* renamed from: h */
    public final boolean[] f11644h = new boolean[2];

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashSet, java.util.Set<m4.we2>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<m4.uj2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Map<java.lang.Object, m4.we2>, java.util.HashMap] */
    public ne2(sz1[] sz1VarArr, long j3, yl2 yl2Var, pm2 pm2Var, ye2 ye2Var, oe2 oe2Var, am2 am2Var) {
        this.f11645i = sz1VarArr;
        this.f11651o = j3;
        this.f11646j = yl2Var;
        this.f11647k = ye2Var;
        uj2 uj2Var = oe2Var.f12130a;
        this.f11638b = uj2Var.f8973a;
        this.f11642f = oe2Var;
        this.f11650n = am2Var;
        long j10 = oe2Var.f12131b;
        long j11 = oe2Var.f12133d;
        Objects.requireNonNull(ye2Var);
        Pair pair = (Pair) uj2Var.f8973a;
        Object obj = pair.first;
        uj2 b10 = uj2Var.b(pair.second);
        we2 we2Var = (we2) ye2Var.f15663c.get(obj);
        Objects.requireNonNull(we2Var);
        ye2Var.f15668h.add(we2Var);
        ve2 ve2Var = ye2Var.f15667g.get(we2Var);
        if (ve2Var != null) {
            ve2Var.f14665a.h(ve2Var.f14666b);
        }
        we2Var.f14949c.add(b10);
        tj2 i10 = we2Var.f14947a.i(b10, pm2Var, j10);
        ye2Var.f15662b.put(i10, we2Var);
        ye2Var.l();
        this.f11637a = j11 != -9223372036854775807L ? new gj2(i10, j11) : i10;
    }

    public final long a(am2 am2Var, long j3) {
        return b(am2Var, j3, false, new boolean[2]);
    }

    public final long b(am2 am2Var, long j3, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= am2Var.f6203a) {
                break;
            }
            boolean[] zArr2 = this.f11644h;
            if (z10 || !am2Var.a(this.f11650n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            sz1[] sz1VarArr = this.f11645i;
            if (i11 >= 2) {
                break;
            }
            Objects.requireNonNull(sz1VarArr[i11]);
            i11++;
        }
        n();
        this.f11650n = am2Var;
        o();
        long o10 = this.f11637a.o(am2Var.f6207e, this.f11644h, this.f11639c, zArr, j3);
        int i12 = 0;
        while (true) {
            sz1[] sz1VarArr2 = this.f11645i;
            if (i12 >= 2) {
                break;
            }
            Objects.requireNonNull(sz1VarArr2[i12]);
            i12++;
        }
        this.f11641e = false;
        int i13 = 0;
        while (true) {
            zk2[] zk2VarArr = this.f11639c;
            if (i13 < 2) {
                if (zk2VarArr[i13] != null) {
                    r01.h(am2Var.b(i13));
                    Objects.requireNonNull(this.f11645i[i13]);
                    this.f11641e = true;
                } else {
                    r01.h(am2Var.f6207e[i13] == null);
                }
                i13++;
            } else {
                return o10;
            }
        }
    }

    public final long c() {
        if (!this.f11640d) {
            return this.f11642f.f12131b;
        }
        long a10 = this.f11641e ? this.f11637a.a() : Long.MIN_VALUE;
        return a10 == Long.MIN_VALUE ? this.f11642f.f12134e : a10;
    }

    public final long d() {
        return this.f11651o;
    }

    public final long e() {
        return this.f11642f.f12131b + this.f11651o;
    }

    public final s70 f() {
        return this.f11649m;
    }

    public final ne2 g() {
        return this.f11648l;
    }

    public final am2 h() {
        return this.f11650n;
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.am2 i() {
        /*
            Method dump skipped, instructions count: 2226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ne2.i():m4.am2");
    }

    public final void j(float f10, z40 z40Var) {
        this.f11640d = true;
        this.f11649m = this.f11637a.d();
        am2 i10 = i();
        oe2 oe2Var = this.f11642f;
        long j3 = oe2Var.f12131b;
        long j10 = oe2Var.f12134e;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        long b10 = b(i10, j3, false, new boolean[2]);
        long j11 = this.f11651o;
        oe2 oe2Var2 = this.f11642f;
        this.f11651o = (oe2Var2.f12131b - b10) + j11;
        this.f11642f = oe2Var2.b(b10);
    }

    public final void k() {
        n();
        ye2 ye2Var = this.f11647k;
        tj2 tj2Var = this.f11637a;
        try {
            if (tj2Var instanceof gj2) {
                ye2Var.d(((gj2) tj2Var).f8951s);
            } else {
                ye2Var.d(tj2Var);
            }
        } catch (RuntimeException e10) {
            x90.e("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void l() {
        tj2 tj2Var = this.f11637a;
        if (tj2Var instanceof gj2) {
            long j3 = this.f11642f.f12133d;
            if (j3 == -9223372036854775807L) {
                j3 = Long.MIN_VALUE;
            }
            ((gj2) tj2Var).f8955w = j3;
        }
    }

    public final boolean m() {
        return this.f11640d && (!this.f11641e || this.f11637a.a() == Long.MIN_VALUE);
    }

    public final void n() {
        if (p()) {
            int i10 = 0;
            while (true) {
                am2 am2Var = this.f11650n;
                if (i10 >= am2Var.f6203a) {
                    return;
                }
                am2Var.b(i10);
                kl2 kl2Var = this.f11650n.f6207e[i10];
                i10++;
            }
        }
    }

    public final void o() {
        if (p()) {
            int i10 = 0;
            while (true) {
                am2 am2Var = this.f11650n;
                if (i10 >= am2Var.f6203a) {
                    return;
                }
                am2Var.b(i10);
                kl2 kl2Var = this.f11650n.f6207e[i10];
                i10++;
            }
        }
    }

    public final boolean p() {
        return this.f11648l == null;
    }
}
