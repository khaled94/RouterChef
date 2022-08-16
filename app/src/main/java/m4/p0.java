package m4;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a */
    public final mp2 f12343a;

    /* renamed from: d */
    public z0 f12346d;

    /* renamed from: e */
    public m0 f12347e;

    /* renamed from: f */
    public int f12348f;

    /* renamed from: g */
    public int f12349g;

    /* renamed from: h */
    public int f12350h;

    /* renamed from: i */
    public int f12351i;

    /* renamed from: l */
    public boolean f12354l;

    /* renamed from: b */
    public final y0 f12344b = new y0();

    /* renamed from: c */
    public final dd f12345c = new dd();

    /* renamed from: j */
    public final dd f12352j = new dd(1);

    /* renamed from: k */
    public final dd f12353k = new dd();

    public p0(mp2 mp2Var, z0 z0Var, m0 m0Var) {
        this.f12343a = mp2Var;
        this.f12346d = z0Var;
        this.f12347e = m0Var;
        this.f12346d = z0Var;
        this.f12347e = m0Var;
        mp2Var.f(z0Var.f15933a.f14810f);
        d();
    }

    public final int a(int i10, int i11) {
        dd ddVar;
        x0 c10 = c();
        if (c10 == null) {
            return 0;
        }
        int i12 = c10.f15160d;
        if (i12 != 0) {
            ddVar = this.f12344b.f15545o;
        } else {
            byte[] bArr = c10.f15161e;
            int i13 = ls1.f10971a;
            dd ddVar2 = this.f12353k;
            int length = bArr.length;
            ddVar2.f(bArr, length);
            ddVar = this.f12353k;
            i12 = length;
        }
        y0 y0Var = this.f12344b;
        boolean z10 = y0Var.f15542l && y0Var.f15543m[this.f12348f];
        boolean z11 = z10 || i11 != 0;
        dd ddVar3 = this.f12352j;
        ((byte[]) ddVar3.f7311d)[0] = (byte) ((true != z11 ? 0 : 128) | i12);
        ddVar3.h(0);
        this.f12343a.d(this.f12352j, 1);
        this.f12343a.d(ddVar, i12);
        if (!z11) {
            return i12 + 1;
        }
        if (!z10) {
            this.f12345c.e(8);
            dd ddVar4 = this.f12345c;
            byte[] bArr2 = (byte[]) ddVar4.f7311d;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i11;
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            this.f12343a.d(ddVar4, 8);
            return i12 + 9;
        }
        dd ddVar5 = this.f12344b.f15545o;
        int t10 = ddVar5.t();
        ddVar5.i(-2);
        int i14 = (t10 * 6) + 2;
        if (i11 != 0) {
            this.f12345c.e(i14);
            byte[] bArr3 = (byte[]) this.f12345c.f7311d;
            ddVar5.d(bArr3, 0, i14);
            int i15 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i15 >> 8) & 255);
            bArr3[3] = (byte) (i15 & 255);
            ddVar5 = this.f12345c;
        }
        this.f12343a.d(ddVar5, i14);
        return i12 + 1 + i14;
    }

    public final long b() {
        return !this.f12354l ? this.f12346d.f15935c[this.f12348f] : this.f12344b.f15536f[this.f12350h];
    }

    public final x0 c() {
        if (!this.f12354l) {
            return null;
        }
        y0 y0Var = this.f12344b;
        m0 m0Var = y0Var.f15531a;
        int i10 = ls1.f10971a;
        int i11 = m0Var.f11056a;
        x0 x0Var = y0Var.f15544n;
        if (x0Var == null) {
            x0Var = this.f12346d.f15933a.a(i11);
        }
        if (x0Var != null && x0Var.f15157a) {
            return x0Var;
        }
        return null;
    }

    public final void d() {
        y0 y0Var = this.f12344b;
        y0Var.f15534d = 0;
        y0Var.f15546q = 0L;
        y0Var.f15547r = false;
        y0Var.f15542l = false;
        y0Var.p = false;
        y0Var.f15544n = null;
        this.f12348f = 0;
        this.f12350h = 0;
        this.f12349g = 0;
        this.f12351i = 0;
        this.f12354l = false;
    }

    public final boolean e() {
        this.f12348f++;
        if (!this.f12354l) {
            return false;
        }
        int i10 = this.f12349g + 1;
        this.f12349g = i10;
        int[] iArr = this.f12344b.f15537g;
        int i11 = this.f12350h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f12350h = i11 + 1;
        this.f12349g = 0;
        return false;
    }
}
