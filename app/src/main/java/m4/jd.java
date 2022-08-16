package m4;

import android.util.SparseArray;
import e1.h;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import l0.d;

/* loaded from: classes.dex */
public final class jd implements ic {

    /* renamed from: v */
    public static final int f9906v = wg.c("seig");

    /* renamed from: w */
    public static final byte[] f9907w = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: i */
    public int f9916i;

    /* renamed from: j */
    public int f9917j;

    /* renamed from: k */
    public long f9918k;

    /* renamed from: l */
    public int f9919l;

    /* renamed from: m */
    public rg f9920m;

    /* renamed from: n */
    public long f9921n;
    public id p;

    /* renamed from: q */
    public int f9923q;

    /* renamed from: r */
    public int f9924r;

    /* renamed from: s */
    public int f9925s;

    /* renamed from: t */
    public se f9926t;

    /* renamed from: u */
    public boolean f9927u;

    /* renamed from: e */
    public final rg f9912e = new rg(16);

    /* renamed from: b */
    public final rg f9909b = new rg(h.f4357s);

    /* renamed from: c */
    public final rg f9910c = new rg(5);

    /* renamed from: d */
    public final rg f9911d = new rg(1);

    /* renamed from: f */
    public final byte[] f9913f = new byte[16];

    /* renamed from: g */
    public final Stack<xc> f9914g = new Stack<>();

    /* renamed from: h */
    public final LinkedList<hd> f9915h = new LinkedList<>();

    /* renamed from: a */
    public final SparseArray<id> f9908a = new SparseArray<>();

    /* renamed from: o */
    public long f9922o = -9223372036854775807L;

    public jd() {
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m4.fc a(java.util.List<m4.yc> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L8:
            if (r3 >= r0) goto Lb7
            java.lang.Object r5 = r14.get(r3)
            m4.yc r5 = (m4.yc) r5
            int r6 = r5.f16143a
            int r7 = m4.zc.V
            if (r6 != r7) goto Lb3
            if (r4 != 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1d:
            m4.rg r5 = r5.P0
            byte[] r5 = r5.f13267a
            m4.rg r6 = new m4.rg
            r6.<init>(r5)
            int r8 = r6.f13269c
            r9 = 32
            if (r8 >= r9) goto L2d
            goto L8c
        L2d:
            r6.n(r1)
            int r8 = r6.b()
            int r9 = r6.f13269c
            int r10 = r6.f13268b
            int r9 = r9 - r10
            int r9 = r9 + 4
            if (r8 == r9) goto L3e
            goto L8c
        L3e:
            int r8 = r6.b()
            if (r8 == r7) goto L45
            goto L8c
        L45:
            int r7 = r6.b()
            int r7 = r7 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1
            if (r7 <= r8) goto L69
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 37
            r6.<init>(r8)
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L8c
        L69:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.f()
            long r12 = r6.f()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L81
            int r7 = r6.d()
            int r7 = r7 * 16
            r6.o(r7)
        L81:
            int r7 = r6.d()
            int r8 = r6.f13269c
            int r10 = r6.f13268b
            int r8 = r8 - r10
            if (r7 == r8) goto L8e
        L8c:
            r6 = r2
            goto L97
        L8e:
            byte[] r8 = new byte[r7]
            r6.j(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L97:
            if (r6 != 0) goto L9b
            r6 = r2
            goto L9f
        L9b:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L9f:
            if (r6 != 0) goto La9
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lb3
        La9:
            m4.ec r7 = new m4.ec
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        Lb3:
            int r3 = r3 + 1
            goto L8
        Lb7:
            if (r4 != 0) goto Lba
            return r2
        Lba:
            m4.fc r14 = new m4.fc
            int r0 = r4.size()
            m4.ec[] r0 = new m4.ec[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            m4.ec[] r0 = (m4.ec[]) r0
            r14.<init>(r1, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.jd.a(java.util.List):m4.fc");
    }

    public static void g(rg rgVar, int i10, qd qdVar) {
        rgVar.n(i10 + 8);
        int b10 = rgVar.b();
        int i11 = zc.f16096b;
        int i12 = b10 & 16777215;
        if ((i12 & 1) == 0) {
            boolean z10 = (i12 & 2) != 0;
            int d5 = rgVar.d();
            int i13 = qdVar.f12790e;
            if (d5 == i13) {
                Arrays.fill(qdVar.f12798m, 0, d5, z10);
                qdVar.a(rgVar.f13269c - rgVar.f13268b);
                rgVar.j(qdVar.p.f13267a, 0, qdVar.f12800o);
                qdVar.p.n(0);
                qdVar.f12801q = false;
                return;
            }
            throw new wa(d.a(41, "Length mismatch: ", d5, ", ", i13));
        }
        throw new wa("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override // m4.ic
    public final void b(long j3, long j10) {
        int size = this.f9908a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f9908a.valueAt(i10).b();
        }
        this.f9915h.clear();
        this.f9914g.clear();
        c();
    }

    public final void c() {
        this.f9916i = 0;
        this.f9919l = 0;
    }

    @Override // m4.ic
    public final void d(se seVar) {
        this.f9926t = seVar;
    }

    @Override // m4.ic
    public final boolean e(hc hcVar) {
        return nd.a(hcVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
        r2 = r24.p;
        r6 = r2.f9585a;
        r7 = r6.f12793h;
        r8 = r2.f9589e;
        r7 = r7[r8];
        r24.f9923q = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (r6.f12797l == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
        r7 = r6.p;
        r10 = r6.f12786a.f8823a;
        r11 = r6.f12799n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
        if (r11 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
        r11 = r2.f9587c.f12110h[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
        r10 = r11.f12483a;
        r6 = r6.f12798m[r8];
        r8 = r24.f9911d;
        r11 = r8.f13267a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
        if (true == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
        r11[0] = (byte) (r12 | r10);
        r8.n(0);
        r2 = r2.f9586b;
        r2.b(r24.f9911d, 1);
        r2.b(r7, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
        if (r6 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
        r6 = r7.e();
        r7.o(-2);
        r6 = (r6 * 6) + 2;
        r2.b(r7, r6);
        r10 = (r10 + 1) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
        r24.f9924r = r10;
        r7 = r24.f9923q + r10;
        r24.f9923q = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d8, code lost:
        r24.f9924r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
        if (r24.p.f9587c.f12109g != 1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
        r24.f9923q = r7 - 8;
        r25.d(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e9, code lost:
        r24.f9916i = 4;
        r24.f9925s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
        r2 = r24.p;
        r4 = r2.f9585a;
        r6 = r2.f9587c;
        r10 = r2.f9586b;
        r2 = r2.f9589e;
        r7 = r6.f12113k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fa, code lost:
        if (r7 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fc, code lost:
        r3 = r24.f9924r;
        r7 = r24.f9923q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        if (r3 >= r7) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:
        r24.f9924r += r10.d(r25, r7 - r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010d, code lost:
        r8 = r24.f9910c.f13267a;
        r8[0] = 0;
        r8[1] = 0;
        r8[2] = 0;
        r3 = r7 + 1;
        r7 = 4 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
        if (r24.f9924r >= r24.f9923q) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
        r11 = r24.f9925s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0124, code lost:
        if (r11 != 0) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0126, code lost:
        r25.c(r8, r7, r3, false);
        r24.f9910c.n(0);
        r24.f9925s = r24.f9910c.d() - 1;
        r24.f9909b.n(0);
        r10.b(r24.f9909b, 4);
        r10.b(r24.f9910c, 1);
        r24.f9924r += 5;
        r24.f9923q += r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0154, code lost:
        r11 = r10.d(r25, r11);
        r24.f9924r += r11;
        r24.f9925s -= r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0163, code lost:
        r11 = 1000 * (r4.f12795j[r2] + r4.f12794i[r2]);
        r1 = r4.f12797l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0172, code lost:
        if (true == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0174, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0176, code lost:
        r3 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
        r13 = r3 | (r4.f12796k[r2] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017e, code lost:
        if (r1 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0180, code lost:
        r1 = r4.f12799n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0182, code lost:
        if (r1 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0184, code lost:
        r1 = r6.f12110h[r4.f12786a.f8823a];
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018c, code lost:
        r2 = r24.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0190, code lost:
        if (r1 == r2.f9593i) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
        r2 = new m4.oc(r1.f12484b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019a, code lost:
        r2 = r2.f9592h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019c, code lost:
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019e, code lost:
        r1 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a0, code lost:
        r2 = r24.p;
        r2.f9592h = r15;
        r2.f9593i = r1;
        r10.c(r11, r13, r24.f9923q, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b1, code lost:
        if (r24.f9915h.isEmpty() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b3, code lost:
        r1 = r24.p;
        r1.f9589e++;
        r2 = r1.f9590f + 1;
        r1.f9590f = r2;
        r3 = r4.f12792g;
        r4 = r1.f9591g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c5, code lost:
        if (r2 != r3[r4]) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c7, code lost:
        r1.f9591g = r4 + 1;
        r1.f9590f = 0;
        r24.p = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
        r24.f9916i = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d2, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d3, code lost:
        java.util.Objects.requireNonNull(r24.f9915h.removeFirst());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01df, code lost:
        throw null;
     */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.List<m4.yc>, java.util.ArrayList] */
    @Override // m4.ic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(m4.hc r25, m4.lc r26) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.jd.f(m4.hc, m4.lc):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x067b, code lost:
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x067e, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0574  */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List<m4.yc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<m4.xc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.List<m4.yc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List<m4.xc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List<m4.xc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List, java.util.List<m4.yc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.List<m4.xc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List<m4.yc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List<m4.xc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List<m4.yc>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r49) {
        /*
            Method dump skipped, instructions count: 1663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.jd.h(long):void");
    }
}
