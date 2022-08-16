package s;

import java.util.Arrays;
import java.util.Objects;
import s.c;

/* loaded from: classes.dex */
public final class e {
    public static boolean p = false;

    /* renamed from: q */
    public static int f17559q = 1000;

    /* renamed from: c */
    public g f17562c;

    /* renamed from: f */
    public c[] f17565f;

    /* renamed from: l */
    public final d f17571l;

    /* renamed from: o */
    public c f17574o;

    /* renamed from: a */
    public boolean f17560a = false;

    /* renamed from: b */
    public int f17561b = 0;

    /* renamed from: d */
    public int f17563d = 32;

    /* renamed from: e */
    public int f17564e = 32;

    /* renamed from: g */
    public boolean f17566g = false;

    /* renamed from: h */
    public boolean[] f17567h = new boolean[32];

    /* renamed from: i */
    public int f17568i = 1;

    /* renamed from: j */
    public int f17569j = 0;

    /* renamed from: k */
    public int f17570k = 32;

    /* renamed from: m */
    public i[] f17572m = new i[f17559q];

    /* renamed from: n */
    public int f17573n = 0;

    /* loaded from: classes.dex */
    public interface a {
        i a(boolean[] zArr);
    }

    public e() {
        this.f17565f = null;
        this.f17565f = new c[32];
        t();
        d dVar = new d();
        this.f17571l = dVar;
        this.f17562c = new g(dVar);
        this.f17574o = new c(dVar);
    }

    public final i a(int i10, String str) {
        i iVar = (i) ((f) this.f17571l.f17557c).a();
        if (iVar == null) {
            iVar = new i(i10);
        } else {
            iVar.e();
        }
        iVar.A = i10;
        int i11 = this.f17573n;
        int i12 = f17559q;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            f17559q = i13;
            this.f17572m = (i[]) Arrays.copyOf(this.f17572m, i13);
        }
        i[] iVarArr = this.f17572m;
        int i14 = this.f17573n;
        this.f17573n = i14 + 1;
        iVarArr[i14] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        float f11;
        int i13;
        c m10 = m();
        if (iVar2 == iVar3) {
            m10.f17553d.b(iVar, 1.0f);
            m10.f17553d.b(iVar4, 1.0f);
            m10.f17553d.b(iVar2, -2.0f);
        } else {
            if (f10 == 0.5f) {
                m10.f17553d.b(iVar, 1.0f);
                m10.f17553d.b(iVar2, -1.0f);
                m10.f17553d.b(iVar3, -1.0f);
                m10.f17553d.b(iVar4, 1.0f);
                if (i10 > 0 || i11 > 0) {
                    i13 = (-i10) + i11;
                    f11 = i13;
                }
            } else if (f10 <= 0.0f) {
                m10.f17553d.b(iVar, -1.0f);
                m10.f17553d.b(iVar2, 1.0f);
                f11 = i10;
            } else if (f10 >= 1.0f) {
                m10.f17553d.b(iVar4, -1.0f);
                m10.f17553d.b(iVar3, 1.0f);
                i13 = -i11;
                f11 = i13;
            } else {
                float f12 = 1.0f - f10;
                m10.f17553d.b(iVar, f12 * 1.0f);
                m10.f17553d.b(iVar2, f12 * (-1.0f));
                m10.f17553d.b(iVar3, (-1.0f) * f10);
                m10.f17553d.b(iVar4, 1.0f * f10);
                if (i10 > 0 || i11 > 0) {
                    m10.f17551b = (i11 * f10) + ((-i10) * f12);
                }
            }
            m10.f17551b = f11;
        }
        if (i12 != 8) {
            m10.b(this, i12);
        }
        c(m10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bf, code lost:
        if (r4.D <= 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c8, code lost:
        if (r4.D <= 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e6, code lost:
        if (r4.D <= 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ef, code lost:
        if (r4.D <= 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f2, code lost:
        r14 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(s.c r17) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.c(s.c):void");
    }

    public final c d(i iVar, i iVar2, int i10, int i11) {
        if (i11 == 8 && iVar2.f17589x && iVar.f17586u == -1) {
            iVar.f(this, iVar2.f17588w + i10);
            return null;
        }
        c m10 = m();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            m10.f17551b = i10;
        }
        if (!z10) {
            m10.f17553d.b(iVar, -1.0f);
            m10.f17553d.b(iVar2, 1.0f);
        } else {
            m10.f17553d.b(iVar, 1.0f);
            m10.f17553d.b(iVar2, -1.0f);
        }
        if (i11 != 8) {
            m10.b(this, i11);
        }
        c(m10);
        return m10;
    }

    public final void e(i iVar, int i10) {
        c cVar;
        c.a aVar;
        float f10;
        int i11 = iVar.f17586u;
        if (i11 == -1) {
            iVar.f(this, i10);
            for (int i12 = 0; i12 < this.f17561b + 1; i12++) {
                i iVar2 = ((i[]) this.f17571l.f17558d)[i12];
            }
            return;
        }
        if (i11 != -1) {
            c cVar2 = this.f17565f[i11];
            if (!cVar2.f17554e) {
                if (cVar2.f17553d.c() == 0) {
                    cVar2.f17554e = true;
                } else {
                    cVar = m();
                    if (i10 < 0) {
                        cVar.f17551b = i10 * (-1);
                        aVar = cVar.f17553d;
                        f10 = 1.0f;
                    } else {
                        cVar.f17551b = i10;
                        aVar = cVar.f17553d;
                        f10 = -1.0f;
                    }
                    aVar.b(iVar, f10);
                }
            }
            cVar2.f17551b = i10;
            return;
        }
        cVar = m();
        cVar.f17550a = iVar;
        float f11 = i10;
        iVar.f17588w = f11;
        cVar.f17551b = f11;
        cVar.f17554e = true;
        c(cVar);
    }

    public final void f(i iVar, i iVar2, int i10, int i11) {
        c m10 = m();
        i n10 = n();
        n10.f17587v = 0;
        m10.d(iVar, iVar2, n10, i10);
        if (i11 != 8) {
            m10.f17553d.b(k(i11, null), (int) (m10.f17553d.g(n10) * (-1.0f)));
        }
        c(m10);
    }

    public final void g(i iVar, i iVar2, int i10, int i11) {
        c m10 = m();
        i n10 = n();
        n10.f17587v = 0;
        m10.e(iVar, iVar2, n10, i10);
        if (i11 != 8) {
            m10.f17553d.b(k(i11, null), (int) (m10.f17553d.g(n10) * (-1.0f)));
        }
        c(m10);
    }

    public final void h(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        c m10 = m();
        m10.c(iVar, iVar2, iVar3, iVar4, f10);
        c(m10);
    }

    public final void i(c cVar) {
        int i10;
        if (cVar.f17554e) {
            cVar.f17550a.f(this, cVar.f17551b);
        } else {
            c[] cVarArr = this.f17565f;
            int i11 = this.f17569j;
            cVarArr[i11] = cVar;
            i iVar = cVar.f17550a;
            iVar.f17586u = i11;
            this.f17569j = i11 + 1;
            iVar.g(this, cVar);
        }
        if (this.f17560a) {
            int i12 = 0;
            while (i12 < this.f17569j) {
                if (this.f17565f[i12] == null) {
                    System.out.println("WTF");
                }
                c[] cVarArr2 = this.f17565f;
                if (cVarArr2[i12] != null && cVarArr2[i12].f17554e) {
                    c cVar2 = cVarArr2[i12];
                    cVar2.f17550a.f(this, cVar2.f17551b);
                    ((f) this.f17571l.f17556b).b(cVar2);
                    this.f17565f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f17569j;
                        if (i13 >= i10) {
                            break;
                        }
                        c[] cVarArr3 = this.f17565f;
                        int i15 = i13 - 1;
                        cVarArr3[i15] = cVarArr3[i13];
                        if (cVarArr3[i15].f17550a.f17586u == i13) {
                            cVarArr3[i15].f17550a.f17586u = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f17565f[i14] = null;
                    }
                    this.f17569j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f17560a = false;
        }
    }

    public final void j() {
        for (int i10 = 0; i10 < this.f17569j; i10++) {
            c cVar = this.f17565f[i10];
            cVar.f17550a.f17588w = cVar.f17551b;
        }
    }

    public final i k(int i10, String str) {
        if (this.f17568i + 1 >= this.f17564e) {
            p();
        }
        i a10 = a(4, str);
        int i11 = this.f17561b + 1;
        this.f17561b = i11;
        this.f17568i++;
        a10.f17585t = i11;
        a10.f17587v = i10;
        ((i[]) this.f17571l.f17558d)[i11] = a10;
        g gVar = this.f17562c;
        gVar.f17580i.f17581a = a10;
        Arrays.fill(a10.f17590z, 0.0f);
        a10.f17590z[a10.f17587v] = 1.0f;
        gVar.l(a10);
        return a10;
    }

    public final i l(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f17568i + 1 >= this.f17564e) {
            p();
        }
        if (obj instanceof u.c) {
            u.c cVar = (u.c) obj;
            iVar = cVar.f18924i;
            if (iVar == null) {
                cVar.i();
                iVar = cVar.f18924i;
            }
            int i10 = iVar.f17585t;
            if (i10 == -1 || i10 > this.f17561b || ((i[]) this.f17571l.f17558d)[i10] == null) {
                if (i10 != -1) {
                    iVar.e();
                }
                int i11 = this.f17561b + 1;
                this.f17561b = i11;
                this.f17568i++;
                iVar.f17585t = i11;
                iVar.A = 1;
                ((i[]) this.f17571l.f17558d)[i11] = iVar;
            }
        }
        return iVar;
    }

    public final c m() {
        c cVar = (c) ((f) this.f17571l.f17556b).a();
        if (cVar == null) {
            return new c(this.f17571l);
        }
        cVar.f17550a = null;
        cVar.f17553d.clear();
        cVar.f17551b = 0.0f;
        cVar.f17554e = false;
        return cVar;
    }

    public final i n() {
        if (this.f17568i + 1 >= this.f17564e) {
            p();
        }
        i a10 = a(3, null);
        int i10 = this.f17561b + 1;
        this.f17561b = i10;
        this.f17568i++;
        a10.f17585t = i10;
        ((i[]) this.f17571l.f17558d)[i10] = a10;
        return a10;
    }

    public final int o(Object obj) {
        i iVar = ((u.c) obj).f18924i;
        if (iVar != null) {
            return (int) (iVar.f17588w + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i10 = this.f17563d * 2;
        this.f17563d = i10;
        this.f17565f = (c[]) Arrays.copyOf(this.f17565f, i10);
        d dVar = this.f17571l;
        dVar.f17558d = (i[]) Arrays.copyOf((i[]) dVar.f17558d, this.f17563d);
        int i11 = this.f17563d;
        this.f17567h = new boolean[i11];
        this.f17564e = i11;
        this.f17570k = i11;
    }

    public final void q() {
        g gVar = this.f17562c;
        boolean z10 = true;
        if (gVar.f17579h == 0) {
            j();
            return;
        }
        if (this.f17566g) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f17569j) {
                    break;
                } else if (!this.f17565f[i10].f17554e) {
                    z10 = false;
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                j();
                return;
            }
            gVar = this.f17562c;
        }
        r(gVar);
    }

    public final void r(a aVar) {
        float f10;
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            f10 = 0.0f;
            i10 = 1;
            if (i11 >= this.f17569j) {
                z10 = false;
                break;
            }
            c[] cVarArr = this.f17565f;
            if (cVarArr[i11].f17550a.A != 1 && cVarArr[i11].f17551b < 0.0f) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            boolean z11 = false;
            int i12 = 0;
            while (!z11) {
                i12 += i10;
                float f11 = Float.MAX_VALUE;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                int i16 = 0;
                while (i15 < this.f17569j) {
                    c cVar = this.f17565f[i15];
                    if (cVar.f17550a.A != i10 && !cVar.f17554e && cVar.f17551b < f10) {
                        int c10 = cVar.f17553d.c();
                        int i17 = 0;
                        while (i17 < c10) {
                            i f12 = cVar.f17553d.f(i17);
                            float g10 = cVar.f17553d.g(f12);
                            if (g10 > f10) {
                                for (int i18 = 0; i18 < 9; i18++) {
                                    float f13 = f12.y[i18] / g10;
                                    if ((f13 < f11 && i18 == i16) || i18 > i16) {
                                        i14 = f12.f17585t;
                                        i16 = i18;
                                        f11 = f13;
                                        i13 = i15;
                                    }
                                }
                            }
                            i17++;
                            f10 = 0.0f;
                        }
                    }
                    i15++;
                    f10 = 0.0f;
                    i10 = 1;
                }
                if (i13 != -1) {
                    c cVar2 = this.f17565f[i13];
                    cVar2.f17550a.f17586u = -1;
                    cVar2.i(((i[]) this.f17571l.f17558d)[i14]);
                    i iVar = cVar2.f17550a;
                    iVar.f17586u = i13;
                    iVar.g(this, cVar2);
                } else {
                    z11 = true;
                }
                if (i12 > this.f17568i / 2) {
                    z11 = true;
                }
                f10 = 0.0f;
                i10 = 1;
            }
        }
        s(aVar);
        j();
    }

    public final int s(a aVar) {
        for (int i10 = 0; i10 < this.f17568i; i10++) {
            this.f17567h[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.f17568i * 2) {
                return i11;
            }
            i iVar = ((c) aVar).f17550a;
            if (iVar != null) {
                this.f17567h[iVar.f17585t] = true;
            }
            i a10 = aVar.a(this.f17567h);
            if (a10 != null) {
                boolean[] zArr = this.f17567h;
                int i12 = a10.f17585t;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (a10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f17569j; i14++) {
                    c cVar = this.f17565f[i14];
                    if (cVar.f17550a.A != 1 && !cVar.f17554e && cVar.f17553d.h(a10)) {
                        float g10 = cVar.f17553d.g(a10);
                        if (g10 < 0.0f) {
                            float f11 = (-cVar.f17551b) / g10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    c cVar2 = this.f17565f[i13];
                    cVar2.f17550a.f17586u = -1;
                    cVar2.i(a10);
                    i iVar2 = cVar2.f17550a;
                    iVar2.f17586u = i13;
                    iVar2.g(this, cVar2);
                }
            } else {
                z10 = true;
            }
        }
        return i11;
    }

    public final void t() {
        for (int i10 = 0; i10 < this.f17569j; i10++) {
            c cVar = this.f17565f[i10];
            if (cVar != null) {
                ((f) this.f17571l.f17556b).b(cVar);
            }
            this.f17565f[i10] = null;
        }
    }

    public final void u() {
        d dVar;
        int i10 = 0;
        while (true) {
            dVar = this.f17571l;
            i[] iVarArr = (i[]) dVar.f17558d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.e();
            }
            i10++;
        }
        f fVar = (f) dVar.f17557c;
        i[] iVarArr2 = this.f17572m;
        int i11 = this.f17573n;
        Objects.requireNonNull(fVar);
        if (i11 > iVarArr2.length) {
            i11 = iVarArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            i iVar2 = iVarArr2[i12];
            int i13 = fVar.f17576b;
            Object[] objArr = fVar.f17575a;
            if (i13 < objArr.length) {
                objArr[i13] = iVar2;
                fVar.f17576b = i13 + 1;
            }
        }
        this.f17573n = 0;
        Arrays.fill((i[]) this.f17571l.f17558d, (Object) null);
        this.f17561b = 0;
        g gVar = this.f17562c;
        gVar.f17579h = 0;
        gVar.f17551b = 0.0f;
        this.f17568i = 1;
        for (int i14 = 0; i14 < this.f17569j; i14++) {
            c[] cVarArr = this.f17565f;
            if (cVarArr[i14] != null) {
                Objects.requireNonNull(cVarArr[i14]);
            }
        }
        t();
        this.f17569j = 0;
        this.f17574o = new c(this.f17571l);
    }
}
