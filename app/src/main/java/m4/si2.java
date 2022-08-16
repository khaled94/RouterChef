package m4;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import g1.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class si2 extends sz1 {
    public static final byte[] P0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean B0;
    public boolean C0;
    public final ti2 D;
    public boolean D0;
    public final float E;
    public boolean G0;
    public boolean H0;
    public final ki2 I;
    public boolean I0;
    public o02 J0;
    public int M0;
    public jd0 N0;
    public jd0 O0;
    public t P;
    public t Q;
    public oi2 U;
    public t V;
    public MediaFormat W;
    public boolean X;
    public ArrayDeque<qi2> Z;

    /* renamed from: a0 */
    public ri2 f13667a0;

    /* renamed from: b0 */
    public qi2 f13668b0;

    /* renamed from: d0 */
    public boolean f13670d0;

    /* renamed from: e0 */
    public boolean f13671e0;

    /* renamed from: f0 */
    public boolean f13672f0;

    /* renamed from: g0 */
    public boolean f13673g0;

    /* renamed from: h0 */
    public boolean f13674h0;

    /* renamed from: i0 */
    public boolean f13675i0;

    /* renamed from: j0 */
    public boolean f13676j0;

    /* renamed from: k0 */
    public boolean f13677k0;

    /* renamed from: l0 */
    public boolean f13678l0;

    /* renamed from: m0 */
    public boolean f13679m0;

    /* renamed from: n0 */
    public mi2 f13680n0;

    /* renamed from: r0 */
    public ByteBuffer f13684r0;

    /* renamed from: s0 */
    public boolean f13685s0;

    /* renamed from: t0 */
    public boolean f13686t0;

    /* renamed from: u0 */
    public boolean f13687u0;

    /* renamed from: v0 */
    public boolean f13688v0;

    /* renamed from: w0 */
    public boolean f13689w0;
    public boolean x0;
    public final il0 F = new il0(0);
    public final il0 G = new il0(0);
    public final il0 H = new il0(2);
    public final cd J = new cd(10, 1);
    public final ArrayList<Long> K = new ArrayList<>();
    public final MediaCodec.BufferInfo L = new MediaCodec.BufferInfo();
    public float S = 1.0f;
    public float T = 1.0f;
    public long R = -9223372036854775807L;
    public final long[] M = new long[10];
    public final long[] N = new long[10];
    public final long[] O = new long[10];
    public long K0 = -9223372036854775807L;
    public long L0 = -9223372036854775807L;
    public float Y = -1.0f;

    /* renamed from: c0 */
    public int f13669c0 = 0;

    /* renamed from: y0 */
    public int f13690y0 = 0;

    /* renamed from: p0 */
    public int f13682p0 = -1;

    /* renamed from: q0 */
    public int f13683q0 = -1;

    /* renamed from: o0 */
    public long f13681o0 = -9223372036854775807L;
    public long E0 = -9223372036854775807L;
    public long F0 = -9223372036854775807L;

    /* renamed from: z0 */
    public int f13691z0 = 0;
    public int A0 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si2(int i10, float f10) {
        super(i10);
        zv1 zv1Var = zv1.f16338u;
        this.D = zv1Var;
        this.E = f10;
        ki2 ki2Var = new ki2();
        this.I = ki2Var;
        ki2Var.d(0);
        ki2Var.f9686c.order(ByteOrder.nativeOrder());
    }

    private final void Q() {
        if (this.B0) {
            this.f13691z0 = 1;
            this.A0 = 3;
            return;
        }
        m0();
        k0();
    }

    private final void c0() {
        try {
            this.U.h();
        } finally {
            n0();
        }
    }

    @Override // m4.sz1
    public void A(long j3, boolean z10) {
        int i10;
        this.G0 = false;
        this.H0 = false;
        if (this.f13687u0) {
            this.I.a();
            this.H.a();
            this.f13688v0 = false;
        } else if (p0()) {
            k0();
        }
        cd cdVar = this.J;
        synchronized (cdVar) {
            i10 = cdVar.f6785b;
        }
        if (i10 > 0) {
            this.I0 = true;
        }
        cd cdVar2 = this.J;
        synchronized (cdVar2) {
            cdVar2.f6784a = 0;
            cdVar2.f6785b = 0;
            Arrays.fill((Object[]) cdVar2.f6787d, (Object) null);
        }
        int i11 = this.M0;
        if (i11 != 0) {
            int i12 = i11 - 1;
            this.L0 = this.N[i12];
            this.K0 = this.M[i12];
            this.M0 = 0;
        }
    }

    @Override // m4.sz1
    public final void I(long j3, long j10) {
        boolean z10 = true;
        if (this.L0 == -9223372036854775807L) {
            if (this.K0 != -9223372036854775807L) {
                z10 = false;
            }
            r01.h(z10);
            this.K0 = j3;
            this.L0 = j10;
            return;
        }
        int i10 = this.M0;
        if (i10 == 10) {
            long j11 = this.N[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j11);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.M0 = i10 + 1;
        }
        long[] jArr = this.M;
        int i11 = this.M0 - 1;
        jArr[i11] = j3;
        this.N[i11] = j10;
        this.O[i11] = this.E0;
    }

    @Override // m4.ff2
    public boolean J() {
        return this.H0;
    }

    @Override // m4.ff2
    public boolean K() {
        boolean z10;
        if (this.P != null) {
            if (t()) {
                z10 = this.B;
            } else {
                zk2 zk2Var = this.f13859x;
                Objects.requireNonNull(zk2Var);
                z10 = zk2Var.b();
            }
            if (z10) {
                return true;
            }
            if (this.f13683q0 >= 0) {
                return true;
            }
            if (this.f13681o0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f13681o0) {
                return true;
            }
        }
        return false;
    }

    public abstract float L(float f10, t[] tVarArr);

    public abstract int M(ti2 ti2Var, t tVar);

    public abstract h12 N(qi2 qi2Var, t tVar, t tVar2);

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (t0() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
        if (t0() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
        if (t0() == false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m4.h12 O(g1.l r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.si2.O(g1.l):m4.h12");
    }

    public final void P() {
        this.f13689w0 = false;
        this.I.a();
        this.H.a();
        this.f13688v0 = false;
        this.f13687u0 = false;
    }

    public abstract ee0 R(qi2 qi2Var, t tVar, float f10);

    public abstract List T(ti2 ti2Var, t tVar);

    public abstract void U(Exception exc);

    public abstract void V(String str, long j3, long j10);

    public abstract void W(String str);

    public abstract void X(t tVar, MediaFormat mediaFormat);

    /* JADX WARN: Removed duplicated region for block: B:132:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y() {
        /*
            Method dump skipped, instructions count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.si2.Y():boolean");
    }

    public final boolean Z(int i10) {
        l x10 = x();
        this.F.a();
        int s10 = s(x10, this.F, i10 | 4);
        if (s10 == -5) {
            O(x10);
            return true;
        } else if (s10 != -4 || !this.F.b(4)) {
            return false;
        } else {
            this.G0 = true;
            r0();
            return false;
        }
    }

    public final boolean a0(long j3) {
        return this.R == -9223372036854775807L || SystemClock.elapsedRealtime() - j3 < this.R;
    }

    public final boolean b0(t tVar) {
        if (ls1.f10971a >= 23 && this.U != null && this.A0 != 3 && this.f13858w != 0) {
            float f10 = this.T;
            t[] tVarArr = this.y;
            Objects.requireNonNull(tVarArr);
            float L = L(f10, tVarArr);
            float f11 = this.Y;
            if (f11 == L) {
                return true;
            }
            if (L == -1.0f) {
                Q();
                return false;
            } else if (f11 == -1.0f && L <= this.E) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", L);
                this.U.f(bundle);
                this.Y = L;
            }
        }
        return true;
    }

    public abstract void d0();

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0220, code lost:
        r0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02e8, code lost:
        if (r1.Q != null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x039d, code lost:
        r0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0437, code lost:
        if (r5[r21].getClassName().equals("android.media.MediaCodec") != false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
        r1.H0 = true;
        r13 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03ac A[LOOP:3: B:304:0x0190->B:234:0x03ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03c5 A[Catch: IllegalStateException -> 0x03d0, TryCatch #12 {IllegalStateException -> 0x03d0, blocks: (B:240:0x03bf, B:242:0x03c5, B:244:0x03cb), top: B:316:0x03bf }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0405 A[Catch: IllegalStateException -> 0x0407, DONT_GENERATE, TRY_LEAVE, TryCatch #24 {IllegalStateException -> 0x0407, blocks: (B:263:0x0402, B:264:0x0404, B:265:0x0405), top: B:339:0x0402 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0227 A[EDGE_INSN: B:360:0x0227->B:147:0x0227 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x03cb A[EDGE_INSN: B:372:0x03cb->B:244:0x03cb ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    @Override // m4.ff2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r29, long r31) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.si2.e(long, long):void");
    }

    public abstract void e0(il0 il0Var);

    public void f0() {
    }

    public abstract boolean g0(long j3, long j10, oi2 oi2Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, t tVar);

    public boolean h0(t tVar) {
        return false;
    }

    public pi2 i0(Throwable th, qi2 qi2Var) {
        return new pi2(th, qi2Var);
    }

    public void j0(il0 il0Var) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0284, code lost:
        if ("stvm8".equals(r6) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0294, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L158;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020a A[Catch: Exception -> 0x0385, TryCatch #3 {Exception -> 0x0385, blocks: (B:45:0x00b4, B:48:0x00c0, B:49:0x00cb, B:53:0x00d3, B:56:0x00e3, B:57:0x00e8, B:58:0x00ed, B:60:0x00fa, B:61:0x0108, B:70:0x0122, B:72:0x0128, B:73:0x012d, B:74:0x0133, B:75:0x0140, B:77:0x0147, B:79:0x0153, B:80:0x0158, B:81:0x015e, B:82:0x0168, B:83:0x018b, B:86:0x019f, B:88:0x01a5, B:90:0x01af, B:92:0x01b7, B:94:0x01bf, B:99:0x01cd, B:101:0x01d5, B:103:0x01dd, B:105:0x01e7, B:107:0x01ef, B:109:0x01f7, B:113:0x0202, B:115:0x020a, B:117:0x0212, B:121:0x021d, B:124:0x0227, B:126:0x022f, B:129:0x0239, B:131:0x0243, B:133:0x024b, B:138:0x0255, B:140:0x025b, B:144:0x0266, B:146:0x026a, B:149:0x0274, B:151:0x027e, B:153:0x0286, B:155:0x028e, B:159:0x0299, B:161:0x029d, B:165:0x02a8, B:167:0x02ac, B:169:0x02b4, B:171:0x02be, B:173:0x02c8, B:175:0x02d0, B:177:0x02d8, B:179:0x02e0, B:181:0x02e8, B:185:0x02f3, B:187:0x02f9, B:189:0x02fd, B:193:0x0308, B:195:0x0310, B:199:0x031c, B:202:0x0326, B:204:0x032e, B:206:0x0336, B:208:0x0340, B:210:0x034a, B:214:0x0351, B:216:0x0362, B:217:0x0369, B:219:0x036e, B:220:0x0377, B:232:0x0391, B:233:0x0394), top: B:253:0x00b4, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x025b A[Catch: Exception -> 0x0385, TryCatch #3 {Exception -> 0x0385, blocks: (B:45:0x00b4, B:48:0x00c0, B:49:0x00cb, B:53:0x00d3, B:56:0x00e3, B:57:0x00e8, B:58:0x00ed, B:60:0x00fa, B:61:0x0108, B:70:0x0122, B:72:0x0128, B:73:0x012d, B:74:0x0133, B:75:0x0140, B:77:0x0147, B:79:0x0153, B:80:0x0158, B:81:0x015e, B:82:0x0168, B:83:0x018b, B:86:0x019f, B:88:0x01a5, B:90:0x01af, B:92:0x01b7, B:94:0x01bf, B:99:0x01cd, B:101:0x01d5, B:103:0x01dd, B:105:0x01e7, B:107:0x01ef, B:109:0x01f7, B:113:0x0202, B:115:0x020a, B:117:0x0212, B:121:0x021d, B:124:0x0227, B:126:0x022f, B:129:0x0239, B:131:0x0243, B:133:0x024b, B:138:0x0255, B:140:0x025b, B:144:0x0266, B:146:0x026a, B:149:0x0274, B:151:0x027e, B:153:0x0286, B:155:0x028e, B:159:0x0299, B:161:0x029d, B:165:0x02a8, B:167:0x02ac, B:169:0x02b4, B:171:0x02be, B:173:0x02c8, B:175:0x02d0, B:177:0x02d8, B:179:0x02e0, B:181:0x02e8, B:185:0x02f3, B:187:0x02f9, B:189:0x02fd, B:193:0x0308, B:195:0x0310, B:199:0x031c, B:202:0x0326, B:204:0x032e, B:206:0x0336, B:208:0x0340, B:210:0x034a, B:214:0x0351, B:216:0x0362, B:217:0x0369, B:219:0x036e, B:220:0x0377, B:232:0x0391, B:233:0x0394), top: B:253:0x00b4, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x026a A[Catch: Exception -> 0x0385, TryCatch #3 {Exception -> 0x0385, blocks: (B:45:0x00b4, B:48:0x00c0, B:49:0x00cb, B:53:0x00d3, B:56:0x00e3, B:57:0x00e8, B:58:0x00ed, B:60:0x00fa, B:61:0x0108, B:70:0x0122, B:72:0x0128, B:73:0x012d, B:74:0x0133, B:75:0x0140, B:77:0x0147, B:79:0x0153, B:80:0x0158, B:81:0x015e, B:82:0x0168, B:83:0x018b, B:86:0x019f, B:88:0x01a5, B:90:0x01af, B:92:0x01b7, B:94:0x01bf, B:99:0x01cd, B:101:0x01d5, B:103:0x01dd, B:105:0x01e7, B:107:0x01ef, B:109:0x01f7, B:113:0x0202, B:115:0x020a, B:117:0x0212, B:121:0x021d, B:124:0x0227, B:126:0x022f, B:129:0x0239, B:131:0x0243, B:133:0x024b, B:138:0x0255, B:140:0x025b, B:144:0x0266, B:146:0x026a, B:149:0x0274, B:151:0x027e, B:153:0x0286, B:155:0x028e, B:159:0x0299, B:161:0x029d, B:165:0x02a8, B:167:0x02ac, B:169:0x02b4, B:171:0x02be, B:173:0x02c8, B:175:0x02d0, B:177:0x02d8, B:179:0x02e0, B:181:0x02e8, B:185:0x02f3, B:187:0x02f9, B:189:0x02fd, B:193:0x0308, B:195:0x0310, B:199:0x031c, B:202:0x0326, B:204:0x032e, B:206:0x0336, B:208:0x0340, B:210:0x034a, B:214:0x0351, B:216:0x0362, B:217:0x0369, B:219:0x036e, B:220:0x0377, B:232:0x0391, B:233:0x0394), top: B:253:0x00b4, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0274 A[Catch: Exception -> 0x0385, TryCatch #3 {Exception -> 0x0385, blocks: (B:45:0x00b4, B:48:0x00c0, B:49:0x00cb, B:53:0x00d3, B:56:0x00e3, B:57:0x00e8, B:58:0x00ed, B:60:0x00fa, B:61:0x0108, B:70:0x0122, B:72:0x0128, B:73:0x012d, B:74:0x0133, B:75:0x0140, B:77:0x0147, B:79:0x0153, B:80:0x0158, B:81:0x015e, B:82:0x0168, B:83:0x018b, B:86:0x019f, B:88:0x01a5, B:90:0x01af, B:92:0x01b7, B:94:0x01bf, B:99:0x01cd, B:101:0x01d5, B:103:0x01dd, B:105:0x01e7, B:107:0x01ef, B:109:0x01f7, B:113:0x0202, B:115:0x020a, B:117:0x0212, B:121:0x021d, B:124:0x0227, B:126:0x022f, B:129:0x0239, B:131:0x0243, B:133:0x024b, B:138:0x0255, B:140:0x025b, B:144:0x0266, B:146:0x026a, B:149:0x0274, B:151:0x027e, B:153:0x0286, B:155:0x028e, B:159:0x0299, B:161:0x029d, B:165:0x02a8, B:167:0x02ac, B:169:0x02b4, B:171:0x02be, B:173:0x02c8, B:175:0x02d0, B:177:0x02d8, B:179:0x02e0, B:181:0x02e8, B:185:0x02f3, B:187:0x02f9, B:189:0x02fd, B:193:0x0308, B:195:0x0310, B:199:0x031c, B:202:0x0326, B:204:0x032e, B:206:0x0336, B:208:0x0340, B:210:0x034a, B:214:0x0351, B:216:0x0362, B:217:0x0369, B:219:0x036e, B:220:0x0377, B:232:0x0391, B:233:0x0394), top: B:253:0x00b4, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029d A[Catch: Exception -> 0x0385, TryCatch #3 {Exception -> 0x0385, blocks: (B:45:0x00b4, B:48:0x00c0, B:49:0x00cb, B:53:0x00d3, B:56:0x00e3, B:57:0x00e8, B:58:0x00ed, B:60:0x00fa, B:61:0x0108, B:70:0x0122, B:72:0x0128, B:73:0x012d, B:74:0x0133, B:75:0x0140, B:77:0x0147, B:79:0x0153, B:80:0x0158, B:81:0x015e, B:82:0x0168, B:83:0x018b, B:86:0x019f, B:88:0x01a5, B:90:0x01af, B:92:0x01b7, B:94:0x01bf, B:99:0x01cd, B:101:0x01d5, B:103:0x01dd, B:105:0x01e7, B:107:0x01ef, B:109:0x01f7, B:113:0x0202, B:115:0x020a, B:117:0x0212, B:121:0x021d, B:124:0x0227, B:126:0x022f, B:129:0x0239, B:131:0x0243, B:133:0x024b, B:138:0x0255, B:140:0x025b, B:144:0x0266, B:146:0x026a, B:149:0x0274, B:151:0x027e, B:153:0x0286, B:155:0x028e, B:159:0x0299, B:161:0x029d, B:165:0x02a8, B:167:0x02ac, B:169:0x02b4, B:171:0x02be, B:173:0x02c8, B:175:0x02d0, B:177:0x02d8, B:179:0x02e0, B:181:0x02e8, B:185:0x02f3, B:187:0x02f9, B:189:0x02fd, B:193:0x0308, B:195:0x0310, B:199:0x031c, B:202:0x0326, B:204:0x032e, B:206:0x0336, B:208:0x0340, B:210:0x034a, B:214:0x0351, B:216:0x0362, B:217:0x0369, B:219:0x036e, B:220:0x0377, B:232:0x0391, B:233:0x0394), top: B:253:0x00b4, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ac A[Catch: Exception -> 0x0385, TryCatch #3 {Exception -> 0x0385, blocks: (B:45:0x00b4, B:48:0x00c0, B:49:0x00cb, B:53:0x00d3, B:56:0x00e3, B:57:0x00e8, B:58:0x00ed, B:60:0x00fa, B:61:0x0108, B:70:0x0122, B:72:0x0128, B:73:0x012d, B:74:0x0133, B:75:0x0140, B:77:0x0147, B:79:0x0153, B:80:0x0158, B:81:0x015e, B:82:0x0168, B:83:0x018b, B:86:0x019f, B:88:0x01a5, B:90:0x01af, B:92:0x01b7, B:94:0x01bf, B:99:0x01cd, B:101:0x01d5, B:103:0x01dd, B:105:0x01e7, B:107:0x01ef, B:109:0x01f7, B:113:0x0202, B:115:0x020a, B:117:0x0212, B:121:0x021d, B:124:0x0227, B:126:0x022f, B:129:0x0239, B:131:0x0243, B:133:0x024b, B:138:0x0255, B:140:0x025b, B:144:0x0266, B:146:0x026a, B:149:0x0274, B:151:0x027e, B:153:0x0286, B:155:0x028e, B:159:0x0299, B:161:0x029d, B:165:0x02a8, B:167:0x02ac, B:169:0x02b4, B:171:0x02be, B:173:0x02c8, B:175:0x02d0, B:177:0x02d8, B:179:0x02e0, B:181:0x02e8, B:185:0x02f3, B:187:0x02f9, B:189:0x02fd, B:193:0x0308, B:195:0x0310, B:199:0x031c, B:202:0x0326, B:204:0x032e, B:206:0x0336, B:208:0x0340, B:210:0x034a, B:214:0x0351, B:216:0x0362, B:217:0x0369, B:219:0x036e, B:220:0x0377, B:232:0x0391, B:233:0x0394), top: B:253:0x00b4, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f9 A[Catch: Exception -> 0x0385, TryCatch #3 {Exception -> 0x0385, blocks: (B:45:0x00b4, B:48:0x00c0, B:49:0x00cb, B:53:0x00d3, B:56:0x00e3, B:57:0x00e8, B:58:0x00ed, B:60:0x00fa, B:61:0x0108, B:70:0x0122, B:72:0x0128, B:73:0x012d, B:74:0x0133, B:75:0x0140, B:77:0x0147, B:79:0x0153, B:80:0x0158, B:81:0x015e, B:82:0x0168, B:83:0x018b, B:86:0x019f, B:88:0x01a5, B:90:0x01af, B:92:0x01b7, B:94:0x01bf, B:99:0x01cd, B:101:0x01d5, B:103:0x01dd, B:105:0x01e7, B:107:0x01ef, B:109:0x01f7, B:113:0x0202, B:115:0x020a, B:117:0x0212, B:121:0x021d, B:124:0x0227, B:126:0x022f, B:129:0x0239, B:131:0x0243, B:133:0x024b, B:138:0x0255, B:140:0x025b, B:144:0x0266, B:146:0x026a, B:149:0x0274, B:151:0x027e, B:153:0x0286, B:155:0x028e, B:159:0x0299, B:161:0x029d, B:165:0x02a8, B:167:0x02ac, B:169:0x02b4, B:171:0x02be, B:173:0x02c8, B:175:0x02d0, B:177:0x02d8, B:179:0x02e0, B:181:0x02e8, B:185:0x02f3, B:187:0x02f9, B:189:0x02fd, B:193:0x0308, B:195:0x0310, B:199:0x031c, B:202:0x0326, B:204:0x032e, B:206:0x0336, B:208:0x0340, B:210:0x034a, B:214:0x0351, B:216:0x0362, B:217:0x0369, B:219:0x036e, B:220:0x0377, B:232:0x0391, B:233:0x0394), top: B:253:0x00b4, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0310 A[Catch: Exception -> 0x0385, TryCatch #3 {Exception -> 0x0385, blocks: (B:45:0x00b4, B:48:0x00c0, B:49:0x00cb, B:53:0x00d3, B:56:0x00e3, B:57:0x00e8, B:58:0x00ed, B:60:0x00fa, B:61:0x0108, B:70:0x0122, B:72:0x0128, B:73:0x012d, B:74:0x0133, B:75:0x0140, B:77:0x0147, B:79:0x0153, B:80:0x0158, B:81:0x015e, B:82:0x0168, B:83:0x018b, B:86:0x019f, B:88:0x01a5, B:90:0x01af, B:92:0x01b7, B:94:0x01bf, B:99:0x01cd, B:101:0x01d5, B:103:0x01dd, B:105:0x01e7, B:107:0x01ef, B:109:0x01f7, B:113:0x0202, B:115:0x020a, B:117:0x0212, B:121:0x021d, B:124:0x0227, B:126:0x022f, B:129:0x0239, B:131:0x0243, B:133:0x024b, B:138:0x0255, B:140:0x025b, B:144:0x0266, B:146:0x026a, B:149:0x0274, B:151:0x027e, B:153:0x0286, B:155:0x028e, B:159:0x0299, B:161:0x029d, B:165:0x02a8, B:167:0x02ac, B:169:0x02b4, B:171:0x02be, B:173:0x02c8, B:175:0x02d0, B:177:0x02d8, B:179:0x02e0, B:181:0x02e8, B:185:0x02f3, B:187:0x02f9, B:189:0x02fd, B:193:0x0308, B:195:0x0310, B:199:0x031c, B:202:0x0326, B:204:0x032e, B:206:0x0336, B:208:0x0340, B:210:0x034a, B:214:0x0351, B:216:0x0362, B:217:0x0369, B:219:0x036e, B:220:0x0377, B:232:0x0391, B:233:0x0394), top: B:253:0x00b4, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0362 A[Catch: Exception -> 0x0385, TryCatch #3 {Exception -> 0x0385, blocks: (B:45:0x00b4, B:48:0x00c0, B:49:0x00cb, B:53:0x00d3, B:56:0x00e3, B:57:0x00e8, B:58:0x00ed, B:60:0x00fa, B:61:0x0108, B:70:0x0122, B:72:0x0128, B:73:0x012d, B:74:0x0133, B:75:0x0140, B:77:0x0147, B:79:0x0153, B:80:0x0158, B:81:0x015e, B:82:0x0168, B:83:0x018b, B:86:0x019f, B:88:0x01a5, B:90:0x01af, B:92:0x01b7, B:94:0x01bf, B:99:0x01cd, B:101:0x01d5, B:103:0x01dd, B:105:0x01e7, B:107:0x01ef, B:109:0x01f7, B:113:0x0202, B:115:0x020a, B:117:0x0212, B:121:0x021d, B:124:0x0227, B:126:0x022f, B:129:0x0239, B:131:0x0243, B:133:0x024b, B:138:0x0255, B:140:0x025b, B:144:0x0266, B:146:0x026a, B:149:0x0274, B:151:0x027e, B:153:0x0286, B:155:0x028e, B:159:0x0299, B:161:0x029d, B:165:0x02a8, B:167:0x02ac, B:169:0x02b4, B:171:0x02be, B:173:0x02c8, B:175:0x02d0, B:177:0x02d8, B:179:0x02e0, B:181:0x02e8, B:185:0x02f3, B:187:0x02f9, B:189:0x02fd, B:193:0x0308, B:195:0x0310, B:199:0x031c, B:202:0x0326, B:204:0x032e, B:206:0x0336, B:208:0x0340, B:210:0x034a, B:214:0x0351, B:216:0x0362, B:217:0x0369, B:219:0x036e, B:220:0x0377, B:232:0x0391, B:233:0x0394), top: B:253:0x00b4, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x036e A[Catch: Exception -> 0x0385, TryCatch #3 {Exception -> 0x0385, blocks: (B:45:0x00b4, B:48:0x00c0, B:49:0x00cb, B:53:0x00d3, B:56:0x00e3, B:57:0x00e8, B:58:0x00ed, B:60:0x00fa, B:61:0x0108, B:70:0x0122, B:72:0x0128, B:73:0x012d, B:74:0x0133, B:75:0x0140, B:77:0x0147, B:79:0x0153, B:80:0x0158, B:81:0x015e, B:82:0x0168, B:83:0x018b, B:86:0x019f, B:88:0x01a5, B:90:0x01af, B:92:0x01b7, B:94:0x01bf, B:99:0x01cd, B:101:0x01d5, B:103:0x01dd, B:105:0x01e7, B:107:0x01ef, B:109:0x01f7, B:113:0x0202, B:115:0x020a, B:117:0x0212, B:121:0x021d, B:124:0x0227, B:126:0x022f, B:129:0x0239, B:131:0x0243, B:133:0x024b, B:138:0x0255, B:140:0x025b, B:144:0x0266, B:146:0x026a, B:149:0x0274, B:151:0x027e, B:153:0x0286, B:155:0x028e, B:159:0x0299, B:161:0x029d, B:165:0x02a8, B:167:0x02ac, B:169:0x02b4, B:171:0x02be, B:173:0x02c8, B:175:0x02d0, B:177:0x02d8, B:179:0x02e0, B:181:0x02e8, B:185:0x02f3, B:187:0x02f9, B:189:0x02fd, B:193:0x0308, B:195:0x0310, B:199:0x031c, B:202:0x0326, B:204:0x032e, B:206:0x0336, B:208:0x0340, B:210:0x034a, B:214:0x0351, B:216:0x0362, B:217:0x0369, B:219:0x036e, B:220:0x0377, B:232:0x0391, B:233:0x0394), top: B:253:0x00b4, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0391 A[Catch: Exception -> 0x0385, TryCatch #3 {Exception -> 0x0385, blocks: (B:45:0x00b4, B:48:0x00c0, B:49:0x00cb, B:53:0x00d3, B:56:0x00e3, B:57:0x00e8, B:58:0x00ed, B:60:0x00fa, B:61:0x0108, B:70:0x0122, B:72:0x0128, B:73:0x012d, B:74:0x0133, B:75:0x0140, B:77:0x0147, B:79:0x0153, B:80:0x0158, B:81:0x015e, B:82:0x0168, B:83:0x018b, B:86:0x019f, B:88:0x01a5, B:90:0x01af, B:92:0x01b7, B:94:0x01bf, B:99:0x01cd, B:101:0x01d5, B:103:0x01dd, B:105:0x01e7, B:107:0x01ef, B:109:0x01f7, B:113:0x0202, B:115:0x020a, B:117:0x0212, B:121:0x021d, B:124:0x0227, B:126:0x022f, B:129:0x0239, B:131:0x0243, B:133:0x024b, B:138:0x0255, B:140:0x025b, B:144:0x0266, B:146:0x026a, B:149:0x0274, B:151:0x027e, B:153:0x0286, B:155:0x028e, B:159:0x0299, B:161:0x029d, B:165:0x02a8, B:167:0x02ac, B:169:0x02b4, B:171:0x02be, B:173:0x02c8, B:175:0x02d0, B:177:0x02d8, B:179:0x02e0, B:181:0x02e8, B:185:0x02f3, B:187:0x02f9, B:189:0x02fd, B:193:0x0308, B:195:0x0310, B:199:0x031c, B:202:0x0326, B:204:0x032e, B:206:0x0336, B:208:0x0340, B:210:0x034a, B:214:0x0351, B:216:0x0362, B:217:0x0369, B:219:0x036e, B:220:0x0377, B:232:0x0391, B:233:0x0394), top: B:253:0x00b4, outer: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0() {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.si2.k0():void");
    }

    public void l0(long j3) {
        while (true) {
            int i10 = this.M0;
            if (i10 == 0 || j3 < this.O[0]) {
                return;
            }
            long[] jArr = this.M;
            this.K0 = jArr[0];
            this.L0 = this.N[0];
            int i11 = i10 - 1;
            this.M0 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.N;
            System.arraycopy(jArr2, 1, jArr2, 0, this.M0);
            long[] jArr3 = this.O;
            System.arraycopy(jArr3, 1, jArr3, 0, this.M0);
            d0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.oi2, m4.jd0] */
    public final void m0() {
        try {
            oi2 oi2Var = this.U;
            if (oi2Var != null) {
                oi2Var.l();
                Objects.requireNonNull(this.J0);
                W(this.f13668b0.f12883a);
            }
        } finally {
            this.U = null;
            this.N0 = null;
            o0();
        }
    }

    @Override // m4.sz1, m4.ff2
    public void n(float f10, float f11) {
        this.S = f10;
        this.T = f11;
        b0(this.V);
    }

    public void n0() {
        s0();
        this.f13683q0 = -1;
        this.f13684r0 = null;
        this.f13681o0 = -9223372036854775807L;
        this.C0 = false;
        this.B0 = false;
        this.f13677k0 = false;
        this.f13678l0 = false;
        this.f13685s0 = false;
        this.f13686t0 = false;
        this.K.clear();
        this.E0 = -9223372036854775807L;
        this.F0 = -9223372036854775807L;
        mi2 mi2Var = this.f13680n0;
        if (mi2Var != null) {
            mi2Var.f11215a = 0L;
            mi2Var.f11216b = 0L;
            mi2Var.f11217c = false;
        }
        this.f13691z0 = 0;
        this.A0 = 0;
        this.f13690y0 = this.x0 ? 1 : 0;
    }

    public final void o0() {
        n0();
        this.f13680n0 = null;
        this.Z = null;
        this.f13668b0 = null;
        this.V = null;
        this.W = null;
        this.X = false;
        this.D0 = false;
        this.Y = -1.0f;
        this.f13669c0 = 0;
        this.f13670d0 = false;
        this.f13671e0 = false;
        this.f13672f0 = false;
        this.f13673g0 = false;
        this.f13674h0 = false;
        this.f13675i0 = false;
        this.f13676j0 = false;
        this.f13679m0 = false;
        this.x0 = false;
        this.f13690y0 = 0;
    }

    public final boolean p0() {
        if (this.U == null) {
            return false;
        }
        if (this.A0 == 3 || this.f13671e0 || ((this.f13672f0 && !this.D0) || (this.f13673g0 && this.C0))) {
            m0();
            return true;
        }
        c0();
        return false;
    }

    public boolean q0(qi2 qi2Var) {
        return true;
    }

    @Override // m4.sz1
    public final int r(t tVar) {
        try {
            return M(this.D, tVar);
        } catch (wi2 e10) {
            throw v(e10, tVar, false, 4002);
        }
    }

    @TargetApi(23)
    public final void r0() {
        int i10 = this.A0;
        if (i10 == 1) {
            c0();
        } else if (i10 == 2) {
            c0();
            try {
                throw null;
            } catch (MediaCryptoException e10) {
                throw v(e10, this.P, false, 6006);
            }
        } else if (i10 != 3) {
            this.H0 = true;
            f0();
        } else {
            m0();
            k0();
        }
    }

    public final void s0() {
        this.f13682p0 = -1;
        this.G.f9686c = null;
    }

    @TargetApi(23)
    public final boolean t0() {
        if (!this.B0) {
            try {
                throw null;
            } catch (MediaCryptoException e10) {
                throw v(e10, this.P, false, 6006);
            }
        }
        this.f13691z0 = 1;
        if (this.f13671e0 || this.f13673g0) {
            this.A0 = 3;
            return false;
        }
        this.A0 = 2;
        return true;
    }

    @Override // m4.sz1
    public final int w() {
        return 8;
    }

    @Override // m4.sz1
    public void y() {
        this.P = null;
        this.K0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.M0 = 0;
        p0();
    }
}
