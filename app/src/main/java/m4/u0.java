package m4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import m3.a;

/* loaded from: classes.dex */
public final class u0 implements to2, jp2 {

    /* renamed from: v */
    public static final /* synthetic */ int f14214v = 0;

    /* renamed from: h */
    public int f14222h;

    /* renamed from: i */
    public long f14223i;

    /* renamed from: j */
    public int f14224j;

    /* renamed from: k */
    public dd f14225k;

    /* renamed from: m */
    public int f14227m;

    /* renamed from: n */
    public int f14228n;

    /* renamed from: o */
    public int f14229o;
    public vo2 p;

    /* renamed from: q */
    public t0[] f14230q;

    /* renamed from: r */
    public long[][] f14231r;

    /* renamed from: s */
    public int f14232s;

    /* renamed from: t */
    public long f14233t;

    /* renamed from: u */
    public int f14234u;

    /* renamed from: g */
    public int f14221g = 0;

    /* renamed from: f */
    public final List<ym0> f14220f = new ArrayList();

    /* renamed from: d */
    public final dd f14218d = new dd(16);

    /* renamed from: e */
    public final ArrayDeque<d0> f14219e = new ArrayDeque<>();

    /* renamed from: a */
    public final dd f14215a = new dd(bg1.f6517a);

    /* renamed from: b */
    public final dd f14216b = new dd(4);

    /* renamed from: c */
    public final dd f14217c = new dd();

    /* renamed from: l */
    public int f14226l = -1;

    public u0() {
        new ArrayList();
    }

    public static long j(z0 z0Var, long j3, long j10) {
        int a10 = z0Var.a(j3);
        if (a10 == -1) {
            a10 = z0Var.b(j3);
        }
        return a10 == -1 ? j10 : Math.min(z0Var.f15935c[a10], j10);
    }

    @Override // m4.jp2
    public final long b() {
        return this.f14233t;
    }

    @Override // m4.to2
    public final boolean c(uo2 uo2Var) {
        return a.g(uo2Var, false);
    }

    @Override // m4.jp2
    public final hp2 d(long j3) {
        long j10;
        long j11;
        long j12;
        long j13;
        int b10;
        t0[] t0VarArr = this.f14230q;
        Objects.requireNonNull(t0VarArr);
        if (t0VarArr.length == 0) {
            kp2 kp2Var = kp2.f10524c;
            return new hp2(kp2Var, kp2Var);
        }
        int i10 = this.f14232s;
        if (i10 != -1) {
            z0 z0Var = t0VarArr[i10].f13886b;
            int a10 = z0Var.a(j3);
            if (a10 == -1) {
                a10 = z0Var.b(j3);
            }
            if (a10 == -1) {
                kp2 kp2Var2 = kp2.f10524c;
                return new hp2(kp2Var2, kp2Var2);
            }
            long j14 = z0Var.f15938f[a10];
            j10 = z0Var.f15935c[a10];
            if (j14 >= j3 || a10 >= z0Var.f15934b - 1 || (b10 = z0Var.b(j3)) == -1 || b10 == a10) {
                j13 = -1;
                j12 = -9223372036854775807L;
            } else {
                j12 = z0Var.f15938f[b10];
                j13 = z0Var.f15935c[b10];
            }
            j11 = j13;
            j3 = j14;
        } else {
            j10 = Long.MAX_VALUE;
            j11 = -1;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            t0[] t0VarArr2 = this.f14230q;
            if (i11 >= t0VarArr2.length) {
                break;
            }
            if (i11 != this.f14232s) {
                z0 z0Var2 = t0VarArr2[i11].f13886b;
                long j15 = j(z0Var2, j3, j10);
                if (j12 != -9223372036854775807L) {
                    j11 = j(z0Var2, j12, j11);
                }
                j10 = j15;
            }
            i11++;
        }
        kp2 kp2Var3 = new kp2(j3, j10);
        return j12 == -9223372036854775807L ? new hp2(kp2Var3, kp2Var3) : new hp2(kp2Var3, new kp2(j12, j11));
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.p = vo2Var;
    }

    @Override // m4.jp2
    public final boolean f() {
        return true;
    }

    @Override // m4.to2
    public final void g(long j3, long j10) {
        this.f14219e.clear();
        this.f14224j = 0;
        this.f14226l = -1;
        this.f14227m = 0;
        this.f14228n = 0;
        this.f14229o = 0;
        if (j3 == 0) {
            k();
            return;
        }
        t0[] t0VarArr = this.f14230q;
        if (t0VarArr == null) {
            return;
        }
        for (t0 t0Var : t0VarArr) {
            z0 z0Var = t0Var.f13886b;
            int a10 = z0Var.a(j10);
            if (a10 == -1) {
                a10 = z0Var.b(j10);
            }
            t0Var.f13888d = a10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.List<m4.e0>, java.util.ArrayList] */
    @Override // m4.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(m4.uo2 r32, m4.gp2 r33) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.u0.h(m4.uo2, m4.gp2):int");
    }

    public final void k() {
        this.f14221g = 0;
        this.f14224j = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bb, code lost:
        if (r6 != 1936683886) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bd, code lost:
        r2 = "TVSHOWSORT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c0, code lost:
        r14 = 1953919848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c3, code lost:
        if (r6 != 1953919848) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c5, code lost:
        r2 = "TVSHOW";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c7, code lost:
        r6 = m4.js.i(r14, r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d0, code lost:
        if (r6 != 757935405) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d2, code lost:
        r14 = -1;
        r9 = -1;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d7, code lost:
        r15 = r4.f7309b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d9, code lost:
        if (r15 >= r7) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01db, code lost:
        r16 = r4.l();
        r15 = r4.l();
        r4.i(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ec, code lost:
        if (r15 != 1835360622) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ee, code lost:
        r2 = r4.A(r16 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f9, code lost:
        if (r15 != 1851878757) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01fb, code lost:
        r6 = r4.A(r16 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0206, code lost:
        if (r15 != 1684108385) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0208, code lost:
        r14 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x020a, code lost:
        if (r15 == 1684108385) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x020d, code lost:
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x020f, code lost:
        r4.i(r16 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0217, code lost:
        if (r2 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0219, code lost:
        if (r6 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x021c, code lost:
        if (r9 != (-1)) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x021f, code lost:
        r4.h(r9);
        r4.i(16);
        r6 = new m4.gr2(r2, r6, r4.A(r14 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0235, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0239, code lost:
        r2 = null;
        r1 = r6 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x023f, code lost:
        if (r1 != 6516084) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0241, code lost:
        r1 = r4.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x024c, code lost:
        if (r4.l() != 1684108385) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x024e, code lost:
        r4.i(8);
        r1 = r4.A(r1 - 16);
        r6 = new m4.yq2("und", r1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0262, code lost:
        r6 = m4.f0.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x026c, code lost:
        if (r6.length() == 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x026e, code lost:
        r1 = "Failed to parse comment attribute: ".concat(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0273, code lost:
        r1 = new java.lang.String("Failed to parse comment attribute: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0279, code lost:
        android.util.Log.w("MetadataUtil", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0284, code lost:
        if (r1 == 7233901) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0289, code lost:
        if (r1 != 7631467) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0290, code lost:
        if (r1 == 6516589) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0295, code lost:
        if (r1 != 7828084) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x029b, code lost:
        if (r1 != 6578553) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x029d, code lost:
        r15 = "TDRC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02a3, code lost:
        if (r1 != 4280916) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02a5, code lost:
        r15 = "TPE1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ab, code lost:
        if (r1 != 7630703) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02ad, code lost:
        r15 = "TSSE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02b3, code lost:
        if (r1 != 6384738) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02b5, code lost:
        r15 = "TALB";
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02bb, code lost:
        if (r1 != 7108978) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02bd, code lost:
        r15 = "USLT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02c3, code lost:
        if (r1 != 6776174) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02c9, code lost:
        if (r1 != 6779504) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02cb, code lost:
        r15 = "TIT1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02ce, code lost:
        r6 = m4.f0.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02d8, code lost:
        if (r6.length() == 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02da, code lost:
        r1 = "Skipped unknown metadata entry: ".concat(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02df, code lost:
        r1 = new java.lang.String("Skipped unknown metadata entry: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02e5, code lost:
        android.util.Log.d("MetadataUtil", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02e8, code lost:
        r4.h(r7);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02ec, code lost:
        r15 = "TCOM";
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02ef, code lost:
        r15 = "TIT2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02f1, code lost:
        r6 = m4.js.i(r6, r15, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02f5, code lost:
        r4.h(r7);
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02f9, code lost:
        if (r2 == null) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02fb, code lost:
        r5.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02fe, code lost:
        r9 = r18;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0306, code lost:
        r4.h(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0309, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x030a, code lost:
        r19 = r2;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0311, code lost:
        if (r5.isEmpty() == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0314, code lost:
        r1 = new m4.ln0(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0366, code lost:
        if (r2 != 13) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x038b, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        r4.h(r9);
        r9 = r9 + r14;
        r4.i(r7);
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
        r6 = r4.f7309b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
        if (r6 >= r9) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
        r7 = r4.l() + r6;
        r6 = r4.l();
        r14 = (r6 >> 24) & 255;
        r15 = "TCON";
        r18 = r9;
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (r14 == 169) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
        if (r14 != 253) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
        if (r6 != 1735291493) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
        r2 = m4.js.d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
        if (r2 <= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
        if (r2 > 192) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
        r2 = m4.js.f10177s[r2 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
        r6 = new m4.c(r15, null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
        r2 = "Failed to parse standard genre code";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d8, code lost:
        r2 = 1684632427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
        if (r6 != 1684632427) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
        r6 = "TPOS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r2 = 1953655662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
        if (r6 != 1953655662) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
        r6 = "TRCK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e7, code lost:
        r6 = m4.js.g(r2, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f0, code lost:
        if (r6 != 1953329263) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
        r6 = m4.js.f(1953329263, "TBPM", r4, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
        r2 = 1668311404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ff, code lost:
        if (r6 != 1668311404) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
        r6 = "TCMP";
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
        if (r6 != 1668249202) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010b, code lost:
        r2 = r4.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0116, code lost:
        if (r4.l() != 1684108385) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0118, code lost:
        r6 = r4.l() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0120, code lost:
        if (r6 != 13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0122, code lost:
        r14 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
        if (r6 != 14) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0129, code lost:
        r14 = "image/png";
        r6 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012e, code lost:
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012f, code lost:
        if (r14 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0131, code lost:
        r2 = new java.lang.StringBuilder(41);
        r2.append("Unrecognized cover art flags: ");
        r2.append(r6);
        r2 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0144, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0146, code lost:
        r4.i(4);
        r2 = r2 - 16;
        r6 = new byte[r2];
        r4.d(r6, 0, r2);
        r2 = new m4.qq2(r14, null, 3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0159, code lost:
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015c, code lost:
        r6 = null;
        r2 = "Failed to parse cover art attribute";
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0164, code lost:
        android.util.Log.w("MetadataUtil", r2);
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0169, code lost:
        r2 = null;
        r2 = null;
        r14 = 1631670868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016d, code lost:
        if (r6 != 1631670868) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016f, code lost:
        r2 = "TPE2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0172, code lost:
        r14 = 1936682605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0175, code lost:
        if (r6 != 1936682605) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0177, code lost:
        r2 = "TSOT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017a, code lost:
        r14 = 1936679276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017d, code lost:
        if (r6 != 1936679276) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017f, code lost:
        r2 = "TSO2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0182, code lost:
        r14 = 1936679282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0185, code lost:
        if (r6 != 1936679282) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0187, code lost:
        r2 = "TSOA";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018a, code lost:
        r14 = 1936679265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018d, code lost:
        if (r6 != 1936679265) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018f, code lost:
        r2 = "TSOP";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0192, code lost:
        r14 = 1936679791;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0195, code lost:
        if (r6 != 1936679791) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0197, code lost:
        r2 = "TSOC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019d, code lost:
        if (r6 != 1920233063) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019f, code lost:
        r6 = "ITUNESADVISORY";
        r9 = false;
        r2 = 1920233063;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a3, code lost:
        r6 = m4.js.f(r2, r6, r4, r9, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ac, code lost:
        if (r6 != 1885823344) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ae, code lost:
        r6 = m4.js.f(1885823344, "ITUNESGAPLESS", r4, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b8, code lost:
        r14 = 1936683886;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x062f A[LOOP:12: B:322:0x062c->B:324:0x062f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x064d  */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.List<m4.ym0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List<m4.d0>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(long r26) {
        /*
            Method dump skipped, instructions count: 1727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.u0.l(long):void");
    }
}
