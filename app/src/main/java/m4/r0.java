package m4;

import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import l0.d;
import m3.a;

/* loaded from: classes.dex */
public final class r0 implements to2 {
    public static final byte[] E = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final t F;
    public boolean D;

    /* renamed from: f */
    public final byte[] f13064f;

    /* renamed from: g */
    public final dd f13065g;

    /* renamed from: l */
    public int f13070l;

    /* renamed from: m */
    public int f13071m;

    /* renamed from: n */
    public long f13072n;

    /* renamed from: o */
    public int f13073o;
    public dd p;

    /* renamed from: q */
    public long f13074q;

    /* renamed from: r */
    public int f13075r;

    /* renamed from: v */
    public p0 f13079v;

    /* renamed from: w */
    public int f13080w;

    /* renamed from: x */
    public int f13081x;
    public int y;

    /* renamed from: z */
    public boolean f13082z;

    /* renamed from: a */
    public final List<t> f13059a = Collections.unmodifiableList(Collections.emptyList());

    /* renamed from: h */
    public final p70 f13066h = new p70();

    /* renamed from: i */
    public final dd f13067i = new dd(16);

    /* renamed from: c */
    public final dd f13061c = new dd(bg1.f6517a);

    /* renamed from: d */
    public final dd f13062d = new dd(5);

    /* renamed from: e */
    public final dd f13063e = new dd();

    /* renamed from: j */
    public final ArrayDeque<d0> f13068j = new ArrayDeque<>();

    /* renamed from: k */
    public final ArrayDeque<o0> f13069k = new ArrayDeque<>();

    /* renamed from: b */
    public final SparseArray<p0> f13060b = new SparseArray<>();

    /* renamed from: t */
    public long f13077t = -9223372036854775807L;

    /* renamed from: s */
    public long f13076s = -9223372036854775807L;

    /* renamed from: u */
    public long f13078u = -9223372036854775807L;
    public vo2 A = vo2.f14739e;
    public mp2[] B = new mp2[0];
    public mp2[] C = new mp2[0];

    static {
        kq2 kq2Var = new kq2();
        kq2Var.f10542j = "application/x-emsg";
        F = new t(kq2Var);
    }

    public r0() {
        byte[] bArr = new byte[16];
        this.f13064f = bArr;
        this.f13065g = new dd(bArr);
    }

    public static int a(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i10);
        throw mq.a(sb.toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m4.il2 b(java.util.List<m4.e0> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L8:
            if (r3 >= r0) goto Lb9
            java.lang.Object r5 = r14.get(r3)
            m4.e0 r5 = (m4.e0) r5
            int r6 = r5.f8307a
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lb5
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            m4.dd r5 = r5.f7675b
            java.lang.Object r5 = r5.f7311d
            byte[] r5 = (byte[]) r5
            m4.dd r6 = new m4.dd
            r6.<init>(r5)
            int r8 = r6.f7310c
            r9 = 32
            if (r8 >= r9) goto L30
            goto L8d
        L30:
            r6.h(r1)
            int r8 = r6.l()
            int r9 = r6.zza()
            int r9 = r9 + 4
            if (r8 == r9) goto L40
            goto L8d
        L40:
            int r8 = r6.l()
            if (r8 == r7) goto L47
            goto L8d
        L47:
            int r7 = r6.l()
            int r7 = r7 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1
            if (r7 <= r8) goto L6b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 37
            r6.<init>(r8)
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L8d
        L6b:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.v()
            long r12 = r6.v()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L83
            int r7 = r6.s()
            int r7 = r7 * 16
            r6.i(r7)
        L83:
            int r7 = r6.s()
            int r8 = r6.zza()
            if (r7 == r8) goto L8f
        L8d:
            r6 = r2
            goto L99
        L8f:
            byte[] r8 = new byte[r7]
            r6.d(r8, r1, r7)
            m4.v0 r6 = new m4.v0
            r6.<init>(r9, r8)
        L99:
            if (r6 != 0) goto L9d
            r6 = r2
            goto La1
        L9d:
            java.lang.Object r6 = r6.f14544s
            java.util.UUID r6 = (java.util.UUID) r6
        La1:
            if (r6 != 0) goto Lab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lb5
        Lab:
            m4.qk2 r7 = new m4.qk2
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        Lb5:
            int r3 = r3 + 1
            goto L8
        Lb9:
            if (r4 != 0) goto Lbc
            return r2
        Lbc:
            m4.il2 r14 = new m4.il2
            m4.qk2[] r0 = new m4.qk2[r1]
            java.lang.Object[] r0 = r4.toArray(r0)
            m4.qk2[] r0 = (m4.qk2[]) r0
            r14.<init>(r2, r1, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r0.b(java.util.List):m4.il2");
    }

    public static void f(dd ddVar, int i10, y0 y0Var) {
        ddVar.h(i10 + 8);
        int l10 = ddVar.l() & 16777215;
        if ((l10 & 1) == 0) {
            boolean z10 = (l10 & 2) != 0;
            int s10 = ddVar.s();
            if (s10 == 0) {
                Arrays.fill(y0Var.f15543m, 0, y0Var.f15535e, false);
                return;
            }
            int i11 = y0Var.f15535e;
            if (s10 == i11) {
                Arrays.fill(y0Var.f15543m, 0, s10, z10);
                y0Var.f15545o.e(ddVar.zza());
                y0Var.f15542l = true;
                y0Var.p = true;
                dd ddVar2 = y0Var.f15545o;
                ddVar.d((byte[]) ddVar2.f7311d, 0, ddVar2.f7310c);
                y0Var.f15545o.h(0);
                y0Var.p = false;
                return;
            }
            throw mq.a(d.a(80, "Senc sample count ", s10, " is different from fragment sample count", i11), null);
        }
        throw mq.b("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static final m0 j(SparseArray<m0> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        m0 m0Var = sparseArray.get(i10);
        Objects.requireNonNull(m0Var);
        return m0Var;
    }

    @Override // m4.to2
    public final boolean c(uo2 uo2Var) {
        return a.g(uo2Var, true);
    }

    public final void d() {
        this.f13070l = 0;
        this.f13073o = 0;
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.A = vo2Var;
        d();
        mp2[] mp2VarArr = new mp2[2];
        this.B = mp2VarArr;
        int i10 = 0;
        mp2[] mp2VarArr2 = (mp2[]) ls1.l(mp2VarArr, 0);
        this.B = mp2VarArr2;
        for (mp2 mp2Var : mp2VarArr2) {
            mp2Var.f(F);
        }
        this.C = new mp2[this.f13059a.size()];
        int i11 = 100;
        while (i10 < this.C.length) {
            int i12 = i11 + 1;
            mp2 p = this.A.p(i11, 3);
            p.f(this.f13059a.get(i10));
            this.C[i10] = p;
            i10++;
            i11 = i12;
        }
    }

    @Override // m4.to2
    public final void g(long j3, long j10) {
        int size = this.f13060b.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f13060b.valueAt(i10).d();
        }
        this.f13069k.clear();
        this.f13075r = 0;
        this.f13076s = j10;
        this.f13068j.clear();
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024a, code lost:
        r1.f13081x += r4;
        r1.y -= r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0254, code lost:
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025b, code lost:
        if (r2.f12354l != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x025d, code lost:
        r0 = r2.f12346d.f15939g[r2.f12348f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026e, code lost:
        if (r2.f12344b.f15541k[r2.f12348f] == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0270, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0272, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0277, code lost:
        if (r2.c() == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0279, code lost:
        r0 = r0 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027c, code lost:
        r12 = r0;
        r0 = r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0281, code lost:
        if (r0 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0283, code lost:
        r0 = r0.f15159c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0286, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0287, code lost:
        r9.e(r14, r12, r1.f13080w, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0297, code lost:
        if (r1.f13069k.isEmpty() != false) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0299, code lost:
        r0 = r1.f13069k.removeFirst();
        r1.f13075r -= r0.f11967b;
        r6 = r0.f11966a + r14;
        r3 = r1.B;
        r15 = r3.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02b0, code lost:
        if (r14 >= r15) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b2, code lost:
        r3[r14].e(r6, 1, r0.f11967b, r1.f13075r, null);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02ca, code lost:
        if (r2.e() != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02cc, code lost:
        r1.f13079v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02cf, code lost:
        r1.f13070l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02d2, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0783, code lost:
        if (r7.f13072n == r7.f13073o) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
        if (r1.f13070l != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
        if (r2.f12354l != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
        r3 = r2.f12346d.f15936d[r2.f12348f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
        r3 = r2.f12344b.f15538h[r2.f12348f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
        r1.f13080w = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
        if (r2.f12348f >= r2.f12351i) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
        ((m4.qo2) r0).q(r3);
        r0 = r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
        if (r0 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
        r3 = r2.f12344b.f15545o;
        r0 = r0.f15160d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
        if (r0 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
        r3.i(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
        r0 = r2.f12344b;
        r6 = r2.f12348f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
        if (r0.f15542l == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
        if (r0.f15543m[r6] == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
        if (r8 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dc, code lost:
        r3.i(r3.t() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
        if (r2.e() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:
        r1.f13079v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ec, code lost:
        r1.f13070l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f6, code lost:
        if (r2.f12346d.f15933a.f14811g != 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f8, code lost:
        r1.f13080w = r3 - 8;
        ((m4.qo2) r0).q(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0112, code lost:
        if ("audio/ac4".equals(r2.f12346d.f15933a.f14810f.f13871k) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0114, code lost:
        r1.f13081x = r2.a(r1.f13080w, 7);
        e1.j.c(r1.f13080w, r1.f13065g);
        r2.f12343a.d(r1.f13065g, 7);
        r3 = r1.f13081x + 7;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0130, code lost:
        r5 = 0;
        r3 = r2.a(r1.f13080w, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0137, code lost:
        r1.f13081x = r3;
        r1.f13080w += r3;
        r1.f13070l = 4;
        r1.y = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
        r3 = r2.f12346d;
        r5 = r3.f15933a;
        r9 = r2.f12343a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
        if (r2.f12354l != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014d, code lost:
        r10 = r3.f15938f[r2.f12348f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0154, code lost:
        r3 = r2.f12344b;
        r10 = r3.f15539i[r6] + r3.f15540j[r2.f12348f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0163, code lost:
        r14 = r10;
        r3 = r5.f14814j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0166, code lost:
        if (r3 != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0168, code lost:
        r3 = r1.f13081x;
        r4 = r1.f13080w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016c, code lost:
        if (r3 >= r4) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016e, code lost:
        r1.f13081x += r9.a(r0, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017a, code lost:
        r10 = (byte[]) r1.f13062d.f7311d;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r6 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0190, code lost:
        if (r1.f13081x >= r1.f13080w) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0192, code lost:
        r11 = r1.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0196, code lost:
        if (r11 != 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0198, code lost:
        ((m4.qo2) r0).n(r10, r3, r6, false);
        r1.f13062d.h(0);
        r11 = r1.f13062d.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01aa, code lost:
        if (r11 <= 0) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ac, code lost:
        r1.y = r11 - 1;
        r1.f13061c.h(0);
        r9.d(r1.f13061c, 4);
        r11 = r1.f13062d;
        r8 = r8 == 1 ? 1 : 0;
        r8 = r8 == 1 ? 1 : 0;
        r8 = r8 == 1 ? 1 : 0;
        r8 = r8 == 1 ? 1 : 0;
        r9.d(r11, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c3, code lost:
        if (r1.C.length <= 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c5, code lost:
        r11 = r5.f14810f.f13871k;
        r13 = r10[4];
        r16 = m4.bg1.f6517a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d3, code lost:
        if ("video/avc".equals(r11) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d5, code lost:
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d7, code lost:
        if ((r13 & 31) == r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01dd, code lost:
        if ("video/hevc".equals(r11) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01df, code lost:
        r4 = (r13 & 126) >> r8;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e4, code lost:
        if (r4 != 39) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e7, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e8, code lost:
        r1.f13082z = r8;
        r1.f13081x += 5;
        r1.f13080w += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01fd, code lost:
        throw m4.mq.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0200, code lost:
        if (r1.f13082z == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0202, code lost:
        r1.f13063e.e(r11);
        ((m4.qo2) r0).n((byte[]) r1.f13063e.f7311d, 0, r1.y, false);
        r9.d(r1.f13063e, r1.y);
        r4 = r1.y;
        r7 = r1.f13063e;
        r7 = m4.bg1.b((byte[]) r7.f7311d, r7.f7310c);
        r1.f13063e.h("video/hevc".equals(r5.f14810f.f13871k) ? 1 : 0);
        r1.f13063e.g(r7);
        m4.l90.b(r14, r1.f13063e, r1.C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0245, code lost:
        r4 = r9.a(r0, r11, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x078f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.util.List<m4.e0>, java.util.ArrayList] */
    @Override // m4.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(m4.uo2 r26, m4.gp2 r27) {
        /*
            Method dump skipped, instructions count: 1942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r0.h(m4.uo2, m4.gp2):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x033f  */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List<m4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List<m4.d0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List<m4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.List<m4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<m4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.List<m4.d0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.List<m4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.util.List<m4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.List<m4.d0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.util.List<m4.e0>, java.util.List, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(long r48) {
        /*
            Method dump skipped, instructions count: 1807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r0.i(long):void");
    }
}
