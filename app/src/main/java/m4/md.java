package m4;

import e1.h;
import java.util.Stack;
import n9.d;

/* loaded from: classes.dex */
public final class md implements ic, nc {
    public static final int p = wg.c("qt  ");

    /* renamed from: e */
    public int f11152e;

    /* renamed from: f */
    public int f11153f;

    /* renamed from: g */
    public long f11154g;

    /* renamed from: h */
    public int f11155h;

    /* renamed from: i */
    public rg f11156i;

    /* renamed from: j */
    public int f11157j;

    /* renamed from: k */
    public int f11158k;

    /* renamed from: l */
    public se f11159l;

    /* renamed from: m */
    public ld[] f11160m;

    /* renamed from: n */
    public long f11161n;

    /* renamed from: o */
    public boolean f11162o;

    /* renamed from: c */
    public final rg f11150c = new rg(16);

    /* renamed from: d */
    public final Stack<xc> f11151d = new Stack<>();

    /* renamed from: a */
    public final rg f11148a = new rg(h.f4357s);

    /* renamed from: b */
    public final rg f11149b = new rg(4);

    @Override // m4.nc
    public final long a(long j3) {
        long j10 = Long.MAX_VALUE;
        for (ld ldVar : this.f11160m) {
            rd rdVar = ldVar.f10722b;
            int a10 = rdVar.a(j3);
            if (a10 == -1) {
                a10 = rdVar.b(j3);
            }
            long j11 = rdVar.f13252b[a10];
            if (j11 < j10) {
                j10 = j11;
            }
        }
        return j10;
    }

    @Override // m4.ic
    public final void b(long j3, long j10) {
        this.f11151d.clear();
        this.f11155h = 0;
        this.f11157j = 0;
        this.f11158k = 0;
        if (j3 == 0) {
            g();
            return;
        }
        ld[] ldVarArr = this.f11160m;
        if (ldVarArr == null) {
            return;
        }
        for (ld ldVar : ldVarArr) {
            rd rdVar = ldVar.f10722b;
            int a10 = rdVar.a(j10);
            if (a10 == -1) {
                a10 = rdVar.b(j10);
            }
            ldVar.f10724d = a10;
        }
    }

    @Override // m4.nc
    public final boolean c() {
        return true;
    }

    @Override // m4.ic
    public final void d(se seVar) {
        this.f11159l = seVar;
    }

    @Override // m4.ic
    public final boolean e(hc hcVar) {
        return nd.a(hcVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.List<m4.yc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // m4.ic
    public final int f(hc hcVar, lc lcVar) {
        ld[] ldVarArr;
        boolean z10;
        boolean z11;
        while (true) {
            int i10 = this.f11152e;
            if (i10 == 0) {
                if (this.f11155h == 0) {
                    if (!hcVar.c(this.f11150c.f13267a, 0, 8, true)) {
                        return -1;
                    }
                    this.f11155h = 8;
                    this.f11150c.n(0);
                    this.f11154g = this.f11150c.g();
                    this.f11153f = this.f11150c.b();
                }
                if (this.f11154g == 1) {
                    hcVar.c(this.f11150c.f13267a, 8, 8, false);
                    this.f11155h += 8;
                    this.f11154g = this.f11150c.h();
                }
                int i11 = this.f11153f;
                if (i11 == zc.C || i11 == zc.E || i11 == zc.F || i11 == zc.G || i11 == zc.H || i11 == zc.Q) {
                    long j3 = (hcVar.f9183c + this.f11154g) - this.f11155h;
                    this.f11151d.add(new xc(this.f11153f, j3));
                    if (this.f11154g == this.f11155h) {
                        h(j3);
                    } else {
                        g();
                    }
                } else {
                    if (i11 == zc.S || i11 == zc.D || i11 == zc.T || i11 == zc.U || i11 == zc.f16119m0 || i11 == zc.f16121n0 || i11 == zc.f16123o0 || i11 == zc.R || i11 == zc.f16124p0 || i11 == zc.f16126q0 || i11 == zc.f16128r0 || i11 == zc.f16130s0 || i11 == zc.f16132t0 || i11 == zc.P || i11 == zc.f16096b || i11 == zc.A0) {
                        d.i(this.f11155h == 8);
                        d.i(this.f11154g <= 2147483647L);
                        rg rgVar = new rg((int) this.f11154g);
                        this.f11156i = rgVar;
                        System.arraycopy(this.f11150c.f13267a, 0, rgVar.f13267a, 0, 8);
                    } else {
                        this.f11156i = null;
                    }
                    this.f11152e = 1;
                }
            } else if (i10 != 1) {
                long j10 = Long.MAX_VALUE;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    ldVarArr = this.f11160m;
                    if (i13 >= ldVarArr.length) {
                        break;
                    }
                    ld ldVar = ldVarArr[i13];
                    int i14 = ldVar.f10724d;
                    rd rdVar = ldVar.f10722b;
                    if (i14 != rdVar.f13251a) {
                        long j11 = rdVar.f13252b[i14];
                        if (j11 < j10) {
                            i12 = i13;
                            j10 = j11;
                        }
                    }
                    i13++;
                }
                if (i12 == -1) {
                    return -1;
                }
                ld ldVar2 = ldVarArr[i12];
                hf hfVar = ldVar2.f10723c;
                int i15 = ldVar2.f10724d;
                rd rdVar2 = ldVar2.f10722b;
                long j12 = rdVar2.f13252b[i15];
                int i16 = rdVar2.f13253c[i15];
                if (ldVar2.f10721a.f12109g == 1) {
                    j12 += 8;
                    i16 -= 8;
                }
                long j13 = (j12 - hcVar.f9183c) + this.f11157j;
                if (j13 < 0 || j13 >= 262144) {
                    lcVar.f10709a = j12;
                    return 1;
                }
                hcVar.d((int) j13);
                int i17 = ldVar2.f10721a.f12113k;
                if (i17 == 0) {
                    while (true) {
                        int i18 = this.f11157j;
                        if (i18 >= i16) {
                            break;
                        }
                        int d5 = hfVar.d(hcVar, i16 - i18);
                        this.f11157j += d5;
                        this.f11158k -= d5;
                    }
                } else {
                    byte[] bArr = this.f11149b.f13267a;
                    ?? r72 = 0;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i19 = 4 - i17;
                    while (this.f11157j < i16) {
                        int i20 = this.f11158k;
                        if (i20 == 0) {
                            hcVar.c(this.f11149b.f13267a, i19, i17, r72);
                            rg rgVar2 = this.f11149b;
                            int i21 = r72 == true ? 1 : 0;
                            int i22 = r72 == true ? 1 : 0;
                            rgVar2.n(i21);
                            this.f11158k = this.f11149b.d();
                            this.f11148a.n(r72);
                            hfVar.b(this.f11148a, 4);
                            this.f11157j += 4;
                            i16 += i19;
                        } else {
                            int d10 = hfVar.d(hcVar, i20);
                            this.f11157j += d10;
                            this.f11158k -= d10;
                        }
                        r72 = 0;
                    }
                }
                int i23 = i16;
                rd rdVar3 = ldVar2.f10722b;
                hfVar.c(rdVar3.f13255e[i15], rdVar3.f13256f[i15], i23, null);
                ldVar2.f10724d++;
                this.f11157j = 0;
                this.f11158k = 0;
                return 0;
            } else {
                long j14 = this.f11154g;
                int i24 = this.f11155h;
                long j15 = j14 - i24;
                long j16 = hcVar.f9183c + j15;
                rg rgVar3 = this.f11156i;
                if (rgVar3 != null) {
                    hcVar.c(rgVar3.f13267a, i24, (int) j15, false);
                    if (this.f11153f == zc.f16096b) {
                        rg rgVar4 = this.f11156i;
                        rgVar4.n(8);
                        if (rgVar4.b() == p) {
                            z11 = true;
                            break;
                        }
                        rgVar4.o(4);
                        while (rgVar4.f13269c - rgVar4.f13268b > 0) {
                            if (rgVar4.b() == p) {
                                z11 = true;
                                break;
                            }
                        }
                        z11 = false;
                        this.f11162o = z11;
                    } else if (!this.f11151d.isEmpty()) {
                        this.f11151d.peek().Q0.add(new yc(this.f11153f, this.f11156i));
                    }
                } else if (j15 < 262144) {
                    hcVar.d((int) j15);
                } else {
                    lcVar.f10709a = j16;
                    z10 = true;
                    h(j16);
                    if (z10 && this.f11152e != 2) {
                        return 1;
                    }
                }
                z10 = false;
                h(j16);
                if (z10) {
                    return 1;
                }
                continue;
            }
        }
    }

    public final void g() {
        this.f11152e = 0;
        this.f11155h = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x0333, code lost:
        r3.f10330a = r7;
        r3.f10331b = r6;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a2 A[Catch: all -> 0x02cd, TryCatch #1 {all -> 0x02cd, blocks: (B:28:0x009e, B:30:0x00a2, B:32:0x00a8, B:34:0x00af, B:37:0x00b7, B:39:0x00c1, B:42:0x00c8, B:45:0x00ce, B:47:0x00d6, B:49:0x00da, B:51:0x00e2, B:54:0x00ea, B:56:0x00ef, B:58:0x00fb, B:65:0x0115, B:66:0x0129, B:68:0x013b, B:69:0x0142, B:72:0x0149, B:75:0x0150, B:78:0x0157, B:81:0x015e, B:84:0x0165, B:87:0x016c, B:90:0x0177, B:91:0x017d, B:93:0x0181, B:94:0x018a, B:97:0x0191, B:101:0x019b, B:104:0x01a3, B:106:0x01a7, B:108:0x01b8, B:109:0x01c0, B:111:0x01c4, B:112:0x01cc, B:118:0x01d5, B:120:0x01de, B:122:0x01e8, B:127:0x01f2, B:129:0x020b, B:131:0x0215, B:133:0x0221, B:134:0x0233, B:136:0x023f, B:137:0x0244, B:138:0x024a, B:140:0x0250, B:142:0x0254, B:145:0x025a, B:147:0x025e, B:150:0x0263, B:153:0x026a, B:156:0x0271, B:159:0x0278, B:162:0x027f, B:165:0x0286, B:167:0x028a, B:168:0x028f, B:171:0x0296, B:173:0x02a2, B:174:0x02a7, B:175:0x02ad, B:179:0x02ba), top: B:472:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02a7 A[Catch: all -> 0x02cd, TryCatch #1 {all -> 0x02cd, blocks: (B:28:0x009e, B:30:0x00a2, B:32:0x00a8, B:34:0x00af, B:37:0x00b7, B:39:0x00c1, B:42:0x00c8, B:45:0x00ce, B:47:0x00d6, B:49:0x00da, B:51:0x00e2, B:54:0x00ea, B:56:0x00ef, B:58:0x00fb, B:65:0x0115, B:66:0x0129, B:68:0x013b, B:69:0x0142, B:72:0x0149, B:75:0x0150, B:78:0x0157, B:81:0x015e, B:84:0x0165, B:87:0x016c, B:90:0x0177, B:91:0x017d, B:93:0x0181, B:94:0x018a, B:97:0x0191, B:101:0x019b, B:104:0x01a3, B:106:0x01a7, B:108:0x01b8, B:109:0x01c0, B:111:0x01c4, B:112:0x01cc, B:118:0x01d5, B:120:0x01de, B:122:0x01e8, B:127:0x01f2, B:129:0x020b, B:131:0x0215, B:133:0x0221, B:134:0x0233, B:136:0x023f, B:137:0x0244, B:138:0x024a, B:140:0x0250, B:142:0x0254, B:145:0x025a, B:147:0x025e, B:150:0x0263, B:153:0x026a, B:156:0x0271, B:159:0x0278, B:162:0x027f, B:165:0x0286, B:167:0x028a, B:168:0x028f, B:171:0x0296, B:173:0x02a2, B:174:0x02a7, B:175:0x02ad, B:179:0x02ba), top: B:472:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0555 A[LOOP:12: B:277:0x0555->B:278:0x0557, LOOP_START, PHI: r8 r9 r23 r27 
      PHI: (r8v26 int) = (r8v22 int), (r8v31 int) binds: [B:276:0x0553, B:278:0x0557] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v17 int) = (r9v14 int), (r9v21 int) binds: [B:276:0x0553, B:278:0x0557] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r23v7 long) = (r23v6 long), (r23v10 long) binds: [B:276:0x0553, B:278:0x0557] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r27v8 int) = (r27v4 int), (r27v10 int) binds: [B:276:0x0553, B:278:0x0557] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[Catch: all -> 0x02cd, TryCatch #1 {all -> 0x02cd, blocks: (B:28:0x009e, B:30:0x00a2, B:32:0x00a8, B:34:0x00af, B:37:0x00b7, B:39:0x00c1, B:42:0x00c8, B:45:0x00ce, B:47:0x00d6, B:49:0x00da, B:51:0x00e2, B:54:0x00ea, B:56:0x00ef, B:58:0x00fb, B:65:0x0115, B:66:0x0129, B:68:0x013b, B:69:0x0142, B:72:0x0149, B:75:0x0150, B:78:0x0157, B:81:0x015e, B:84:0x0165, B:87:0x016c, B:90:0x0177, B:91:0x017d, B:93:0x0181, B:94:0x018a, B:97:0x0191, B:101:0x019b, B:104:0x01a3, B:106:0x01a7, B:108:0x01b8, B:109:0x01c0, B:111:0x01c4, B:112:0x01cc, B:118:0x01d5, B:120:0x01de, B:122:0x01e8, B:127:0x01f2, B:129:0x020b, B:131:0x0215, B:133:0x0221, B:134:0x0233, B:136:0x023f, B:137:0x0244, B:138:0x024a, B:140:0x0250, B:142:0x0254, B:145:0x025a, B:147:0x025e, B:150:0x0263, B:153:0x026a, B:156:0x0271, B:159:0x0278, B:162:0x027f, B:165:0x0286, B:167:0x028a, B:168:0x028f, B:171:0x0296, B:173:0x02a2, B:174:0x02a7, B:175:0x02ad, B:179:0x02ba), top: B:472:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0897  */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.util.List<m4.xc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List<m4.xc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List<m4.xc>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r72) {
        /*
            Method dump skipped, instructions count: 2735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.md.h(long):void");
    }

    @Override // m4.nc
    public final long zza() {
        return this.f11161n;
    }
}
