package m4;

import a6.f;
import android.util.Log;
import g1.l;
import java.io.EOFException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class yk2 implements mp2 {
    public jd0 A;

    /* renamed from: a */
    public final vk2 f15807a;

    /* renamed from: d */
    public final ai2 f15810d;

    /* renamed from: e */
    public xk2 f15811e;

    /* renamed from: f */
    public t f15812f;

    /* renamed from: n */
    public int f15820n;

    /* renamed from: o */
    public int f15821o;
    public int p;

    /* renamed from: q */
    public int f15822q;

    /* renamed from: u */
    public boolean f15826u;

    /* renamed from: x */
    public t f15829x;
    public boolean y;

    /* renamed from: z */
    public boolean f15830z;

    /* renamed from: b */
    public final br1 f15808b = new br1(1);

    /* renamed from: g */
    public int f15813g = 1000;

    /* renamed from: h */
    public int[] f15814h = new int[1000];

    /* renamed from: i */
    public long[] f15815i = new long[1000];

    /* renamed from: l */
    public long[] f15818l = new long[1000];

    /* renamed from: k */
    public int[] f15817k = new int[1000];

    /* renamed from: j */
    public int[] f15816j = new int[1000];

    /* renamed from: m */
    public lp2[] f15819m = new lp2[1000];

    /* renamed from: c */
    public final dl2<wk2> f15809c = new dl2<>();

    /* renamed from: r */
    public long f15823r = Long.MIN_VALUE;

    /* renamed from: s */
    public long f15824s = Long.MIN_VALUE;

    /* renamed from: t */
    public long f15825t = Long.MIN_VALUE;

    /* renamed from: w */
    public boolean f15828w = true;

    /* renamed from: v */
    public boolean f15827v = true;

    public yk2(pm2 pm2Var, ai2 ai2Var) {
        this.f15810d = ai2Var;
        this.f15807a = new vk2(pm2Var);
    }

    @Override // m4.mp2
    public final int a(jp0 jp0Var, int i10, boolean z10) {
        vk2 vk2Var = this.f15807a;
        int b10 = vk2Var.b(i10);
        uk2 uk2Var = vk2Var.f14714d;
        int d5 = jp0Var.d(uk2Var.f14441d.f6573a, uk2Var.a(vk2Var.f14715e), b10);
        if (d5 == -1) {
            if (!z10) {
                throw new EOFException();
            }
            return -1;
        }
        long j3 = vk2Var.f14715e + d5;
        vk2Var.f14715e = j3;
        uk2 uk2Var2 = vk2Var.f14714d;
        if (j3 != uk2Var2.f14439b) {
            return d5;
        }
        vk2Var.f14714d = uk2Var2.f14442e;
        return d5;
    }

    @Override // m4.mp2
    public final void b(dd ddVar, int i10) {
        d(ddVar, i10);
    }

    @Override // m4.mp2
    public final int c(jp0 jp0Var, int i10) {
        return a(jp0Var, i10, true);
    }

    @Override // m4.mp2
    public final void d(dd ddVar, int i10) {
        vk2 vk2Var = this.f15807a;
        Objects.requireNonNull(vk2Var);
        while (i10 > 0) {
            int b10 = vk2Var.b(i10);
            uk2 uk2Var = vk2Var.f14714d;
            ddVar.d(uk2Var.f14441d.f6573a, uk2Var.a(vk2Var.f14715e), b10);
            i10 -= b10;
            long j3 = vk2Var.f14715e + b10;
            vk2Var.f14715e = j3;
            uk2 uk2Var2 = vk2Var.f14714d;
            if (j3 == uk2Var2.f14439b) {
                vk2Var.f14714d = uk2Var2.f14442e;
            }
        }
    }

    @Override // m4.mp2
    public final void e(long j3, int i10, int i11, int i12, lp2 lp2Var) {
        int i13 = i10 & 1;
        if (this.f15827v) {
            if (i13 == 0) {
                return;
            }
            this.f15827v = false;
        }
        if (this.y) {
            if (j3 < this.f15823r) {
                return;
            }
            if (i13 == 0) {
                if (!this.f15830z) {
                    Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f15829x)));
                    this.f15830z = true;
                }
                i10 |= 1;
            }
        }
        long j10 = (this.f15807a.f14715e - i11) - i12;
        synchronized (this) {
            int i14 = this.f15820n;
            if (i14 > 0) {
                int g10 = g(i14 - 1);
                r01.f(this.f15815i[g10] + ((long) this.f15816j[g10]) <= j10);
            }
            this.f15826u = (536870912 & i10) != 0;
            this.f15825t = Math.max(this.f15825t, j3);
            int g11 = g(this.f15820n);
            this.f15818l[g11] = j3;
            this.f15815i[g11] = j10;
            this.f15816j[g11] = i11;
            this.f15817k[g11] = i10;
            this.f15819m[g11] = lp2Var;
            this.f15814h[g11] = 0;
            if ((this.f15809c.f7546b.size() == 0) || !this.f15809c.b().f15039a.equals(this.f15829x)) {
                dl2<wk2> dl2Var = this.f15809c;
                int i15 = this.f15821o + this.f15820n;
                t tVar = this.f15829x;
                Objects.requireNonNull(tVar);
                dl2Var.c(i15, new wk2(tVar));
            }
            int i16 = this.f15820n + 1;
            this.f15820n = i16;
            int i17 = this.f15813g;
            if (i16 == i17) {
                int i18 = i17 + 1000;
                int[] iArr = new int[i18];
                long[] jArr = new long[i18];
                long[] jArr2 = new long[i18];
                int[] iArr2 = new int[i18];
                int[] iArr3 = new int[i18];
                lp2[] lp2VarArr = new lp2[i18];
                int i19 = this.p;
                int i20 = i17 - i19;
                System.arraycopy(this.f15815i, i19, jArr, 0, i20);
                System.arraycopy(this.f15818l, this.p, jArr2, 0, i20);
                System.arraycopy(this.f15817k, this.p, iArr2, 0, i20);
                System.arraycopy(this.f15816j, this.p, iArr3, 0, i20);
                System.arraycopy(this.f15819m, this.p, lp2VarArr, 0, i20);
                System.arraycopy(this.f15814h, this.p, iArr, 0, i20);
                int i21 = this.p;
                System.arraycopy(this.f15815i, 0, jArr, i20, i21);
                System.arraycopy(this.f15818l, 0, jArr2, i20, i21);
                System.arraycopy(this.f15817k, 0, iArr2, i20, i21);
                System.arraycopy(this.f15816j, 0, iArr3, i20, i21);
                System.arraycopy(this.f15819m, 0, lp2VarArr, i20, i21);
                System.arraycopy(this.f15814h, 0, iArr, i20, i21);
                this.f15815i = jArr;
                this.f15818l = jArr2;
                this.f15817k = iArr2;
                this.f15816j = iArr3;
                this.f15819m = lp2VarArr;
                this.f15814h = iArr;
                this.p = 0;
                this.f15813g = i18;
            }
        }
    }

    @Override // m4.mp2
    public final void f(t tVar) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            this.f15828w = false;
            if (!ls1.f(tVar, this.f15829x)) {
                if (!(this.f15809c.f7546b.size() == 0) && this.f15809c.b().f15039a.equals(tVar)) {
                    tVar = this.f15809c.b().f15039a;
                }
                this.f15829x = tVar;
                this.y = rp.d(tVar.f13871k, tVar.f13868h);
                this.f15830z = false;
                z10 = true;
            }
        }
        xk2 xk2Var = this.f15811e;
        if (xk2Var == null || !z10) {
            return;
        }
        pk2 pk2Var = (pk2) xk2Var;
        pk2Var.E.post(pk2Var.C);
    }

    public final int g(int i10) {
        int i11 = this.p + i10;
        int i12 = this.f15813g;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final long h(int i10) {
        int i11;
        long j3 = this.f15824s;
        long j10 = Long.MIN_VALUE;
        int i12 = 0;
        if (i10 != 0) {
            int g10 = g(i10 - 1);
            for (int i13 = 0; i13 < i10; i13++) {
                j10 = Math.max(j10, this.f15818l[g10]);
                if ((this.f15817k[g10] & 1) != 0) {
                    break;
                }
                g10--;
                if (g10 == -1) {
                    g10 = this.f15813g - 1;
                }
            }
        }
        this.f15824s = Math.max(j3, j10);
        this.f15820n -= i10;
        int i14 = this.f15821o + i10;
        this.f15821o = i14;
        int i15 = this.p + i10;
        this.p = i15;
        int i16 = this.f15813g;
        if (i15 >= i16) {
            this.p = i15 - i16;
        }
        int i17 = this.f15822q - i10;
        this.f15822q = i17;
        if (i17 < 0) {
            this.f15822q = 0;
        }
        dl2<wk2> dl2Var = this.f15809c;
        while (i12 < dl2Var.f7546b.size() - 1) {
            int i18 = i12 + 1;
            if (i14 < dl2Var.f7546b.keyAt(i18)) {
                break;
            }
            zh2 zh2Var = dl2Var.f7546b.valueAt(i12).f15040b;
            int i19 = yh2.f15787a;
            dl2Var.f7546b.removeAt(i12);
            int i20 = dl2Var.f7545a;
            if (i20 > 0) {
                dl2Var.f7545a = i20 - 1;
            }
            i12 = i18;
        }
        if (this.f15820n == 0) {
            int i21 = this.p;
            if (i21 == 0) {
                i21 = this.f15813g;
            }
            return this.f15815i[i21 - 1] + this.f15816j[i11];
        }
        return this.f15815i[this.p];
    }

    public final void i(t tVar, l lVar) {
        t tVar2 = this.f15812f;
        jd0 jd0Var = null;
        il2 il2Var = tVar2 == null ? null : tVar2.f13874n;
        this.f15812f = tVar;
        il2 il2Var2 = tVar.f13874n;
        Objects.requireNonNull((f) this.f15810d);
        int i10 = 1;
        if (tVar.f13874n == null) {
            i10 = 0;
        }
        kq2 kq2Var = new kq2(tVar);
        kq2Var.C = i10;
        lVar.f4818s = new t(kq2Var);
        lVar.f4819t = this.A;
        if (tVar2 == null || !ls1.f(il2Var, il2Var2)) {
            if (tVar.f13874n != null) {
                jd0Var = new jd0(new uh2(new ci2()));
            }
            this.A = jd0Var;
            lVar.f4819t = jd0Var;
        }
    }

    public final boolean j() {
        return this.f15822q != this.f15820n;
    }

    public final void k() {
        long h10;
        vk2 vk2Var = this.f15807a;
        synchronized (this) {
            int i10 = this.f15820n;
            h10 = i10 == 0 ? -1L : h(i10);
        }
        vk2Var.a(h10);
    }

    public final void l(boolean z10) {
        vk2 vk2Var = this.f15807a;
        uk2 uk2Var = vk2Var.f14712b;
        if (uk2Var.f14440c) {
            uk2 uk2Var2 = vk2Var.f14714d;
            int i10 = (((int) (uk2Var2.f14438a - uk2Var.f14438a)) / 65536) + (uk2Var2.f14440c ? 1 : 0);
            bm2[] bm2VarArr = new bm2[i10];
            int i11 = 0;
            while (i11 < i10) {
                bm2VarArr[i11] = uk2Var.f14441d;
                uk2Var.f14441d = null;
                uk2 uk2Var3 = uk2Var.f14442e;
                uk2Var.f14442e = null;
                i11++;
                uk2Var = uk2Var3;
            }
            vk2Var.f14716f.b(bm2VarArr);
        }
        uk2 uk2Var4 = new uk2(0L);
        vk2Var.f14712b = uk2Var4;
        vk2Var.f14713c = uk2Var4;
        vk2Var.f14714d = uk2Var4;
        vk2Var.f14715e = 0L;
        vk2Var.f14716f.d();
        this.f15820n = 0;
        this.f15821o = 0;
        this.p = 0;
        this.f15822q = 0;
        this.f15827v = true;
        this.f15823r = Long.MIN_VALUE;
        this.f15824s = Long.MIN_VALUE;
        this.f15825t = Long.MIN_VALUE;
        this.f15826u = false;
        dl2<wk2> dl2Var = this.f15809c;
        for (int i12 = 0; i12 < dl2Var.f7546b.size(); i12++) {
            zh2 zh2Var = dl2Var.f7546b.valueAt(i12).f15040b;
            int i13 = yh2.f15787a;
        }
        dl2Var.f7545a = -1;
        dl2Var.f7546b.clear();
        if (z10) {
            this.f15829x = null;
            this.f15828w = true;
        }
    }

    public final synchronized boolean m(boolean z10) {
        boolean z11 = false;
        if (j()) {
            if (this.f15809c.a(this.f15821o + this.f15822q).f15039a != this.f15812f) {
                return true;
            }
            int g10 = g(this.f15822q);
            if (this.A != null) {
                int i10 = this.f15817k[g10];
            } else {
                z11 = true;
            }
            return z11;
        }
        if (!z10 && !this.f15826u) {
            t tVar = this.f15829x;
            if (tVar != null) {
                if (tVar == this.f15812f) {
                    return false;
                }
            }
            return z11;
        }
        z11 = true;
        return z11;
    }

    public final synchronized boolean n(long j3, boolean z10) {
        synchronized (this) {
            this.f15822q = 0;
            vk2 vk2Var = this.f15807a;
            vk2Var.f14713c = vk2Var.f14712b;
        }
        int g10 = g(0);
        if (!j() || j3 < this.f15818l[g10] || (j3 > this.f15825t && !z10)) {
            return false;
        }
        int o10 = o(g10, this.f15820n - this.f15822q, j3, true);
        if (o10 == -1) {
            return false;
        }
        this.f15823r = j3;
        this.f15822q += o10;
        return true;
    }

    public final int o(int i10, int i11, long j3, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f15818l[i10] > j3 ? 1 : (this.f15818l[i10] == j3 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f15817k[i10] & 1) != 0) {
                i12 = i13;
                if (i14 == 0) {
                    break;
                }
            }
            i10++;
            if (i10 == this.f15813g) {
                i10 = 0;
            }
        }
        return i12;
    }
}
