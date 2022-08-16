package u;

import a0.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import s.b;
import s.e;
import u.c;
import v.c;
import v.f;
import v.l;
import v.n;

/* loaded from: classes.dex */
public class d {
    public boolean F;
    public c J;
    public c K;
    public c L;
    public c M;
    public c N;
    public c Q;
    public c[] R;
    public ArrayList<c> S;

    /* renamed from: b */
    public c f18934b;

    /* renamed from: c */
    public c f18936c;

    /* renamed from: d0 */
    public int f18939d0;

    /* renamed from: e0 */
    public int f18941e0;

    /* renamed from: h0 */
    public Object f18947h0;

    /* renamed from: j */
    public String f18950j;

    /* renamed from: a */
    public boolean f18932a = false;

    /* renamed from: d */
    public l f18938d = null;

    /* renamed from: e */
    public n f18940e = null;

    /* renamed from: f */
    public boolean[] f18942f = {true, true};

    /* renamed from: g */
    public boolean f18944g = true;

    /* renamed from: h */
    public int f18946h = -1;

    /* renamed from: i */
    public int f18948i = -1;

    /* renamed from: k */
    public boolean f18952k = false;

    /* renamed from: l */
    public boolean f18954l = false;

    /* renamed from: m */
    public boolean f18956m = false;

    /* renamed from: n */
    public boolean f18958n = false;

    /* renamed from: o */
    public int f18960o = -1;
    public int p = -1;

    /* renamed from: q */
    public int f18963q = 0;

    /* renamed from: r */
    public int f18965r = 0;

    /* renamed from: s */
    public int f18966s = 0;

    /* renamed from: t */
    public int[] f18967t = new int[2];

    /* renamed from: u */
    public int f18968u = 0;

    /* renamed from: v */
    public int f18969v = 0;

    /* renamed from: w */
    public float f18970w = 1.0f;

    /* renamed from: x */
    public int f18971x = 0;
    public int y = 0;

    /* renamed from: z */
    public float f18972z = 1.0f;
    public int A = -1;
    public float B = 1.0f;
    public int[] C = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float D = 0.0f;
    public boolean E = false;
    public boolean G = false;
    public int H = 0;
    public int I = 0;
    public c O = new c(this, c.a.CENTER_X);
    public c P = new c(this, c.a.CENTER_Y);
    public boolean[] T = new boolean[2];
    public int[] U = {1, 1};
    public d V = null;
    public int W = 0;
    public int X = 0;
    public float Y = 0.0f;
    public int Z = -1;

    /* renamed from: a0 */
    public int f18933a0 = 0;

    /* renamed from: b0 */
    public int f18935b0 = 0;

    /* renamed from: c0 */
    public int f18937c0 = 0;

    /* renamed from: f0 */
    public float f18943f0 = 0.5f;

    /* renamed from: g0 */
    public float f18945g0 = 0.5f;

    /* renamed from: i0 */
    public int f18949i0 = 0;

    /* renamed from: j0 */
    public String f18951j0 = null;

    /* renamed from: k0 */
    public int f18953k0 = 0;

    /* renamed from: l0 */
    public int f18955l0 = 0;

    /* renamed from: m0 */
    public float[] f18957m0 = {-1.0f, -1.0f};

    /* renamed from: n0 */
    public d[] f18959n0 = {null, null};

    /* renamed from: o0 */
    public d[] f18961o0 = {null, null};

    /* renamed from: p0 */
    public int f18962p0 = -1;

    /* renamed from: q0 */
    public int f18964q0 = -1;

    public d() {
        new HashMap();
        c cVar = new c(this, c.a.LEFT);
        this.J = cVar;
        c cVar2 = new c(this, c.a.TOP);
        this.K = cVar2;
        c cVar3 = new c(this, c.a.RIGHT);
        this.L = cVar3;
        c cVar4 = new c(this, c.a.BOTTOM);
        this.M = cVar4;
        c cVar5 = new c(this, c.a.BASELINE);
        this.N = cVar5;
        c cVar6 = new c(this, c.a.CENTER);
        this.Q = cVar6;
        this.R = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar6};
        ArrayList<c> arrayList = new ArrayList<>();
        this.S = arrayList;
        arrayList.add(this.J);
        this.S.add(this.K);
        this.S.add(this.L);
        this.S.add(this.M);
        this.S.add(this.O);
        this.S.add(this.P);
        this.S.add(this.Q);
        this.S.add(this.N);
    }

    public final boolean A() {
        return this.f18944g && this.f18949i0 != 8;
    }

    public boolean B() {
        return this.f18952k || (this.J.f18918c && this.L.f18918c);
    }

    public boolean C() {
        return this.f18954l || (this.K.f18918c && this.M.f18918c);
    }

    public void D() {
        this.J.h();
        this.K.h();
        this.L.h();
        this.M.h();
        this.N.h();
        this.O.h();
        this.P.h();
        this.Q.h();
        this.V = null;
        this.D = 0.0f;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f18933a0 = 0;
        this.f18935b0 = 0;
        this.f18937c0 = 0;
        this.f18939d0 = 0;
        this.f18941e0 = 0;
        this.f18943f0 = 0.5f;
        this.f18945g0 = 0.5f;
        int[] iArr = this.U;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f18947h0 = null;
        this.f18949i0 = 0;
        this.f18953k0 = 0;
        this.f18955l0 = 0;
        float[] fArr = this.f18957m0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f18960o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f18965r = 0;
        this.f18966s = 0;
        this.f18970w = 1.0f;
        this.f18972z = 1.0f;
        this.f18969v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.f18968u = 0;
        this.f18971x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f18942f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f18944g = true;
        int[] iArr3 = this.f18967t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f18946h = -1;
        this.f18948i = -1;
    }

    public final void E() {
        this.f18952k = false;
        this.f18954l = false;
        this.f18956m = false;
        this.f18958n = false;
        int size = this.S.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.S.get(i10);
            cVar.f18918c = false;
            cVar.f18917b = 0;
        }
    }

    public void F(s.d dVar) {
        this.J.i();
        this.K.i();
        this.L.i();
        this.M.i();
        this.N.i();
        this.Q.i();
        this.O.i();
        this.P.i();
    }

    public final void G(StringBuilder sb, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f10);
        sb.append(",\n");
    }

    public final void H(StringBuilder sb, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i10);
        sb.append(",\n");
    }

    public final void I(int i10) {
        this.f18937c0 = i10;
        this.E = i10 > 0;
    }

    public final void J(int i10, int i11) {
        if (this.f18952k) {
            return;
        }
        this.J.j(i10);
        this.L.j(i11);
        this.f18933a0 = i10;
        this.W = i11 - i10;
        this.f18952k = true;
    }

    public final void K(int i10, int i11) {
        if (this.f18954l) {
            return;
        }
        this.K.j(i10);
        this.M.j(i11);
        this.f18935b0 = i10;
        this.X = i11 - i10;
        if (this.E) {
            this.N.j(i10 + this.f18937c0);
        }
        this.f18954l = true;
    }

    public final void L(int i10) {
        this.X = i10;
        int i11 = this.f18941e0;
        if (i10 < i11) {
            this.X = i11;
        }
    }

    public final void M(int i10) {
        this.U[0] = i10;
    }

    public final void N(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f18941e0 = i10;
    }

    public final void O(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f18939d0 = i10;
    }

    public final void P(int i10) {
        this.U[1] = i10;
    }

    public final void Q(int i10) {
        this.W = i10;
        int i11 = this.f18939d0;
        if (i10 < i11) {
            this.W = i11;
        }
    }

    public void R(boolean z10, boolean z11) {
        int i10;
        int i11;
        l lVar = this.f18938d;
        boolean z12 = z10 & lVar.f19741g;
        n nVar = this.f18940e;
        boolean z13 = z11 & nVar.f19741g;
        int i12 = lVar.f19742h.f19716g;
        int i13 = nVar.f19742h.f19716g;
        int i14 = lVar.f19743i.f19716g;
        int i15 = nVar.f19743i.f19716g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.f18933a0 = i12;
        }
        if (z13) {
            this.f18935b0 = i13;
        }
        if (this.f18949i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (z12) {
            if (this.U[0] == 1 && i17 < (i11 = this.W)) {
                i17 = i11;
            }
            this.W = i17;
            int i19 = this.f18939d0;
            if (i17 < i19) {
                this.W = i19;
            }
        }
        if (!z13) {
            return;
        }
        if (this.U[1] == 1 && i18 < (i10 = this.X)) {
            i18 = i10;
        }
        this.X = i18;
        int i20 = this.f18941e0;
        if (i18 >= i20) {
            return;
        }
        this.X = i20;
    }

    public void S(e eVar, boolean z10) {
        int i10;
        int i11;
        n nVar;
        l lVar;
        int o10 = eVar.o(this.J);
        int o11 = eVar.o(this.K);
        int o12 = eVar.o(this.L);
        int o13 = eVar.o(this.M);
        if (z10 && (lVar = this.f18938d) != null) {
            f fVar = lVar.f19742h;
            if (fVar.f19719j) {
                f fVar2 = lVar.f19743i;
                if (fVar2.f19719j) {
                    o10 = fVar.f19716g;
                    o12 = fVar2.f19716g;
                }
            }
        }
        if (z10 && (nVar = this.f18940e) != null) {
            f fVar3 = nVar.f19742h;
            if (fVar3.f19719j) {
                f fVar4 = nVar.f19743i;
                if (fVar4.f19719j) {
                    o11 = fVar3.f19716g;
                    o13 = fVar4.f19716g;
                }
            }
        }
        int i12 = o13 - o11;
        if (o12 - o10 < 0 || i12 < 0 || o10 == Integer.MIN_VALUE || o10 == Integer.MAX_VALUE || o11 == Integer.MIN_VALUE || o11 == Integer.MAX_VALUE || o12 == Integer.MIN_VALUE || o12 == Integer.MAX_VALUE || o13 == Integer.MIN_VALUE || o13 == Integer.MAX_VALUE) {
            o13 = 0;
            o10 = 0;
            o11 = 0;
            o12 = 0;
        }
        int i13 = o12 - o10;
        int i14 = o13 - o11;
        this.f18933a0 = o10;
        this.f18935b0 = o11;
        if (this.f18949i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        int[] iArr = this.U;
        if (iArr[0] == 1 && i13 < (i11 = this.W)) {
            i13 = i11;
        }
        if (iArr[1] == 1 && i14 < (i10 = this.X)) {
            i14 = i10;
        }
        this.W = i13;
        this.X = i14;
        int i15 = this.f18941e0;
        if (i14 < i15) {
            this.X = i15;
        }
        int i16 = this.f18939d0;
        if (i13 < i16) {
            this.W = i16;
        }
        int i17 = this.f18969v;
        if (i17 > 0 && iArr[0] == 3) {
            this.W = Math.min(this.W, i17);
        }
        int i18 = this.y;
        if (i18 > 0 && this.U[1] == 3) {
            this.X = Math.min(this.X, i18);
        }
        int i19 = this.W;
        if (i13 != i19) {
            this.f18946h = i19;
        }
        int i20 = this.X;
        if (i14 == i20) {
            return;
        }
        this.f18948i = i20;
    }

    public final void a(e eVar, e eVar2, HashSet<d> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            a.a(eVar, eVar2, this);
            hashSet.remove(this);
            c(eVar2, eVar.d0(64));
        }
        if (i10 == 0) {
            HashSet<c> hashSet2 = this.J.f18916a;
            if (hashSet2 != null) {
                Iterator<c> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f18919d.a(eVar, eVar2, hashSet, i10, true);
                }
            }
            HashSet<c> hashSet3 = this.L.f18916a;
            if (hashSet3 == null) {
                return;
            }
            Iterator<c> it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                it2.next().f18919d.a(eVar, eVar2, hashSet, i10, true);
            }
            return;
        }
        HashSet<c> hashSet4 = this.K.f18916a;
        if (hashSet4 != null) {
            Iterator<c> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f18919d.a(eVar, eVar2, hashSet, i10, true);
            }
        }
        HashSet<c> hashSet5 = this.M.f18916a;
        if (hashSet5 != null) {
            Iterator<c> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f18919d.a(eVar, eVar2, hashSet, i10, true);
            }
        }
        HashSet<c> hashSet6 = this.N.f18916a;
        if (hashSet6 == null) {
            return;
        }
        Iterator<c> it5 = hashSet6.iterator();
        while (it5.hasNext()) {
            it5.next().f18919d.a(eVar, eVar2, hashSet, i10, true);
        }
    }

    public final boolean b() {
        return (this instanceof i) || (this instanceof f);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(s.e r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.d.c(s.e, boolean):void");
    }

    public boolean d() {
        return this.f18949i0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x046b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0492 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:348:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(s.e r28, boolean r29, boolean r30, boolean r31, boolean r32, s.i r33, s.i r34, int r35, boolean r36, u.c r37, u.c r38, int r39, int r40, int r41, int r42, float r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, int r49, int r50, int r51, int r52, float r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.d.e(s.e, boolean, boolean, boolean, boolean, s.i, s.i, int, boolean, u.c, u.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void f(e eVar) {
        eVar.l(this.J);
        eVar.l(this.K);
        eVar.l(this.L);
        eVar.l(this.M);
        if (this.f18937c0 > 0) {
            eVar.l(this.N);
        }
    }

    public final void g() {
        if (this.f18938d == null) {
            this.f18938d = new l(this);
        }
        if (this.f18940e == null) {
            this.f18940e = new n(this);
        }
    }

    public c h(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final int i() {
        return t() + this.X;
    }

    public final int j(int i10) {
        if (i10 == 0) {
            return this.U[0];
        }
        if (i10 != 1) {
            return 0;
        }
        return this.U[1];
    }

    public final int k() {
        if (this.f18949i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final d l(int i10) {
        c cVar;
        c cVar2;
        if (i10 != 0) {
            if (i10 != 1 || (cVar2 = (cVar = this.M).f18921f) == null || cVar2.f18921f != cVar) {
                return null;
            }
            return cVar2.f18919d;
        }
        c cVar3 = this.L;
        c cVar4 = cVar3.f18921f;
        if (cVar4 != null && cVar4.f18921f == cVar3) {
            return cVar4.f18919d;
        }
        return null;
    }

    public final d m(int i10) {
        c cVar;
        c cVar2;
        if (i10 != 0) {
            if (i10 != 1 || (cVar2 = (cVar = this.K).f18921f) == null || cVar2.f18921f != cVar) {
                return null;
            }
            return cVar2.f18919d;
        }
        c cVar3 = this.J;
        c cVar4 = cVar3.f18921f;
        if (cVar4 != null && cVar4.f18921f == cVar3) {
            return cVar4.f18919d;
        }
        return null;
    }

    public final int n() {
        return s() + this.W;
    }

    public void o(StringBuilder sb) {
        StringBuilder c10 = androidx.activity.result.a.c("  ");
        c10.append(this.f18950j);
        c10.append(":{\n");
        sb.append(c10.toString());
        sb.append("    actualWidth:" + this.W);
        sb.append("\n");
        sb.append("    actualHeight:" + this.X);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f18933a0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f18935b0);
        sb.append("\n");
        q(sb, "left", this.J);
        q(sb, "top", this.K);
        q(sb, "right", this.L);
        q(sb, "bottom", this.M);
        q(sb, "baseline", this.N);
        q(sb, "centerX", this.O);
        q(sb, "centerY", this.P);
        int i10 = this.W;
        int i11 = this.f18939d0;
        int i12 = this.C[0];
        int i13 = this.f18968u;
        int i14 = this.f18965r;
        float f10 = this.f18970w;
        float f11 = this.f18957m0[0];
        p(sb, "    width", i10, i11, i12, i13, i14, f10);
        int i15 = this.X;
        int i16 = this.f18941e0;
        int i17 = this.C[1];
        int i18 = this.f18971x;
        int i19 = this.f18966s;
        float f12 = this.f18972z;
        float f13 = this.f18957m0[1];
        p(sb, "    height", i15, i16, i17, i18, i19, f12);
        float f14 = this.Y;
        int i20 = this.Z;
        if (f14 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f14);
            sb.append(",");
            sb.append(i20);
            sb.append("");
            sb.append("],\n");
        }
        G(sb, "    horizontalBias", this.f18943f0, 0.5f);
        G(sb, "    verticalBias", this.f18945g0, 0.5f);
        H(sb, "    horizontalChainStyle", this.f18953k0, 0);
        H(sb, "    verticalChainStyle", this.f18955l0, 0);
        sb.append("  }");
    }

    public final void p(StringBuilder sb, String str, int i10, int i11, int i12, int i13, int i14, float f10) {
        sb.append(str);
        sb.append(" :  {\n");
        H(sb, "      size", i10, 0);
        H(sb, "      min", i11, 0);
        H(sb, "      max", i12, Integer.MAX_VALUE);
        H(sb, "      matchMin", i13, 0);
        H(sb, "      matchDef", i14, 0);
        G(sb, "      matchPercent", f10, 1.0f);
        sb.append("    },\n");
    }

    public final void q(StringBuilder sb, String str, c cVar) {
        if (cVar.f18921f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f18921f);
        sb.append("'");
        if (cVar.f18923h != Integer.MIN_VALUE || cVar.f18922g != 0) {
            sb.append(",");
            sb.append(cVar.f18922g);
            if (cVar.f18923h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.f18923h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final int r() {
        if (this.f18949i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final int s() {
        d dVar = this.V;
        return (dVar == null || !(dVar instanceof e)) ? this.f18933a0 : ((e) dVar).f18978y0 + this.f18933a0;
    }

    public final int t() {
        d dVar = this.V;
        return (dVar == null || !(dVar instanceof e)) ? this.f18935b0 : ((e) dVar).f18979z0 + this.f18935b0;
    }

    public String toString() {
        String str = "";
        StringBuilder c10 = androidx.activity.result.a.c(str);
        if (this.f18951j0 != null) {
            str = b.b(androidx.activity.result.a.c("id: "), this.f18951j0, " ");
        }
        c10.append(str);
        c10.append("(");
        c10.append(this.f18933a0);
        c10.append(", ");
        c10.append(this.f18935b0);
        c10.append(") - (");
        c10.append(this.W);
        c10.append(" x ");
        c10.append(this.X);
        c10.append(")");
        return c10.toString();
    }

    public final boolean u(int i10) {
        if (i10 == 0) {
            return (this.J.f18921f != null ? 1 : 0) + (this.L.f18921f != null ? 1 : 0) < 2;
        }
        return ((this.K.f18921f != null ? 1 : 0) + (this.M.f18921f != null ? 1 : 0)) + (this.N.f18921f != null ? 1 : 0) < 2;
    }

    public final boolean v(int i10, int i11) {
        c cVar;
        c cVar2;
        if (i10 == 0) {
            c cVar3 = this.J.f18921f;
            if (cVar3 != null && cVar3.f18918c && (cVar2 = this.L.f18921f) != null && cVar2.f18918c) {
                return (cVar2.c() - this.L.d()) - (this.J.d() + this.J.f18921f.c()) >= i11;
            }
        } else {
            c cVar4 = this.K.f18921f;
            if (cVar4 != null && cVar4.f18918c && (cVar = this.M.f18921f) != null && cVar.f18918c) {
                return (cVar.c() - this.M.d()) - (this.K.d() + this.K.f18921f.c()) >= i11;
            }
        }
        return false;
    }

    public final void w(c.a aVar, d dVar, c.a aVar2, int i10, int i11) {
        h(aVar).a(dVar.h(aVar2), i10, i11);
    }

    public final boolean x(int i10) {
        int i11 = i10 * 2;
        c[] cVarArr = this.R;
        if (cVarArr[i11].f18921f != null && cVarArr[i11].f18921f.f18921f != cVarArr[i11]) {
            int i12 = i11 + 1;
            if (cVarArr[i12].f18921f != null && cVarArr[i12].f18921f.f18921f == cVarArr[i12]) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        c cVar = this.J;
        c cVar2 = cVar.f18921f;
        if (cVar2 == null || cVar2.f18921f != cVar) {
            c cVar3 = this.L;
            c cVar4 = cVar3.f18921f;
            return cVar4 != null && cVar4.f18921f == cVar3;
        }
        return true;
    }

    public final boolean z() {
        c cVar = this.K;
        c cVar2 = cVar.f18921f;
        if (cVar2 == null || cVar2.f18921f != cVar) {
            c cVar3 = this.M;
            c cVar4 = cVar3.f18921f;
            return cVar4 != null && cVar4.f18921f == cVar3;
        }
        return true;
    }
}
