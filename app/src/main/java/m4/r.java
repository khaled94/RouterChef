package m4;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class r implements to2 {

    /* renamed from: b0 */
    public static final byte[] f13029b0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c0 */
    public static final byte[] f13030c0 = ls1.j("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d0 */
    public static final byte[] f13031d0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: e0 */
    public static final UUID f13032e0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: f0 */
    public static final Map<String, Integer> f13033f0;
    public dd1 B;
    public dd1 C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public long H;
    public int I;
    public int J;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public byte X;
    public boolean Y;
    public vo2 Z;

    /* renamed from: a0 */
    public final n f13035a0;

    /* renamed from: n */
    public ByteBuffer f13048n;

    /* renamed from: o */
    public long f13049o;

    /* renamed from: t */
    public p f13053t;

    /* renamed from: u */
    public boolean f13054u;

    /* renamed from: v */
    public int f13055v;

    /* renamed from: w */
    public long f13056w;

    /* renamed from: x */
    public boolean f13057x;
    public long p = -1;

    /* renamed from: q */
    public long f13050q = -9223372036854775807L;

    /* renamed from: r */
    public long f13051r = -9223372036854775807L;

    /* renamed from: s */
    public long f13052s = -9223372036854775807L;
    public long y = -1;

    /* renamed from: z */
    public long f13058z = -1;
    public long A = -9223372036854775807L;

    /* renamed from: c */
    public final boolean f13037c = true;

    /* renamed from: a */
    public final u f13034a = new u();

    /* renamed from: b */
    public final SparseArray<p> f13036b = new SparseArray<>();

    /* renamed from: f */
    public final dd f13040f = new dd(4);

    /* renamed from: g */
    public final dd f13041g = new dd(ByteBuffer.allocate(4).putInt(-1).array());

    /* renamed from: h */
    public final dd f13042h = new dd(4);

    /* renamed from: d */
    public final dd f13038d = new dd(bg1.f6517a);

    /* renamed from: e */
    public final dd f13039e = new dd(4);

    /* renamed from: i */
    public final dd f13043i = new dd();

    /* renamed from: j */
    public final dd f13044j = new dd();

    /* renamed from: k */
    public final dd f13045k = new dd(8);

    /* renamed from: l */
    public final dd f13046l = new dd();

    /* renamed from: m */
    public final dd f13047m = new dd();
    public int[] K = new int[1];

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f13033f0 = Collections.unmodifiableMap(hashMap);
    }

    public r() {
        n nVar = new n();
        this.f13035a0 = nVar;
        nVar.f11372d = new o(this);
    }

    public static byte[] o(long j3, String str, long j10) {
        r01.f(j3 != -9223372036854775807L);
        int i10 = (int) (j3 / 3600000000L);
        long j11 = j3 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j11 / 60000000);
        long j12 = j11 - ((i11 * 60) * 1000000);
        int i12 = (int) (j12 / 1000000);
        return ls1.j(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j12 - (i12 * 1000000)) / j10))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0589, code lost:
        if (r0.v() == r5.getLeastSignificantBits()) goto L318;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0a1a  */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v92 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r28) {
        /*
            Method dump skipped, instructions count: 3142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r.a(int):void");
    }

    @RequiresNonNull({"#2.output"})
    public final int b(uo2 uo2Var, p pVar, int i10) {
        int i11;
        if ("S_TEXT/UTF8".equals(pVar.f12320b)) {
            n(uo2Var, f13029b0, i10);
        } else if ("S_TEXT/ASS".equals(pVar.f12320b)) {
            n(uo2Var, f13031d0, i10);
        } else {
            mp2 mp2Var = pVar.X;
            if (!this.T) {
                if (pVar.f12326h) {
                    this.N &= -1073741825;
                    int i12 = 128;
                    if (!this.U) {
                        ((qo2) uo2Var).n((byte[]) this.f13040f.f7311d, 0, 1, false);
                        this.Q++;
                        byte[] bArr = (byte[]) this.f13040f.f7311d;
                        if ((bArr[0] & 128) == 128) {
                            throw mq.a("Extension bit is set in signal byte", null);
                        }
                        this.X = bArr[0];
                        this.U = true;
                    }
                    byte b10 = this.X;
                    if ((b10 & 1) == 1) {
                        int i13 = b10 & 2;
                        this.N |= 1073741824;
                        if (!this.Y) {
                            ((qo2) uo2Var).n((byte[]) this.f13045k.f7311d, 0, 8, false);
                            this.Q += 8;
                            this.Y = true;
                            dd ddVar = this.f13040f;
                            byte[] bArr2 = (byte[]) ddVar.f7311d;
                            if (i13 != 2) {
                                i12 = 0;
                            }
                            bArr2[0] = (byte) (i12 | 8);
                            ddVar.h(0);
                            mp2Var.d(this.f13040f, 1);
                            this.R++;
                            this.f13045k.h(0);
                            mp2Var.d(this.f13045k, 8);
                            this.R += 8;
                        }
                        if (i13 == 2) {
                            if (!this.V) {
                                ((qo2) uo2Var).n((byte[]) this.f13040f.f7311d, 0, 1, false);
                                this.Q++;
                                this.f13040f.h(0);
                                this.W = this.f13040f.q();
                                this.V = true;
                            }
                            int i14 = this.W * 4;
                            this.f13040f.e(i14);
                            ((qo2) uo2Var).n((byte[]) this.f13040f.f7311d, 0, i14, false);
                            this.Q += i14;
                            int i15 = (this.W >> 1) + 1;
                            int i16 = (i15 * 6) + 2;
                            ByteBuffer byteBuffer = this.f13048n;
                            if (byteBuffer == null || byteBuffer.capacity() < i16) {
                                this.f13048n = ByteBuffer.allocate(i16);
                            }
                            this.f13048n.position(0);
                            this.f13048n.putShort((short) i15);
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                i11 = this.W;
                                if (i17 >= i11) {
                                    break;
                                }
                                int s10 = this.f13040f.s();
                                if (i17 % 2 == 0) {
                                    this.f13048n.putShort((short) (s10 - i18));
                                } else {
                                    this.f13048n.putInt(s10 - i18);
                                }
                                i17++;
                                i18 = s10;
                            }
                            int i19 = (i10 - this.Q) - i18;
                            if ((i11 & 1) == 1) {
                                this.f13048n.putInt(i19);
                            } else {
                                this.f13048n.putShort((short) i19);
                                this.f13048n.putInt(0);
                            }
                            this.f13046l.f(this.f13048n.array(), i16);
                            mp2Var.d(this.f13046l, i16);
                            this.R += i16;
                        }
                    }
                } else {
                    byte[] bArr3 = pVar.f12327i;
                    if (bArr3 != null) {
                        this.f13043i.f(bArr3, bArr3.length);
                    }
                }
                if (pVar.f12324f > 0) {
                    this.N |= 268435456;
                    this.f13047m.e(0);
                    this.f13040f.e(4);
                    dd ddVar2 = this.f13040f;
                    byte[] bArr4 = (byte[]) ddVar2.f7311d;
                    bArr4[0] = (byte) ((i10 >> 24) & 255);
                    bArr4[1] = (byte) ((i10 >> 16) & 255);
                    bArr4[2] = (byte) ((i10 >> 8) & 255);
                    bArr4[3] = (byte) (i10 & 255);
                    mp2Var.d(ddVar2, 4);
                    this.R += 4;
                }
                this.T = true;
            }
            int i20 = i10 + this.f13043i.f7310c;
            if (!"V_MPEG4/ISO/AVC".equals(pVar.f12320b) && !"V_MPEGH/ISO/HEVC".equals(pVar.f12320b)) {
                if (pVar.T != null) {
                    r01.h(this.f13043i.f7310c == 0);
                    q qVar = pVar.T;
                    if (!qVar.f12656b) {
                        ((qo2) uo2Var).o(qVar.f12655a, 0, 10, false);
                        uo2Var.i();
                        byte[] bArr5 = qVar.f12655a;
                        if (bArr5[4] == -8 && bArr5[5] == 114 && bArr5[6] == 111 && (bArr5[7] & 254) == 186) {
                            qVar.f12656b = true;
                        }
                    }
                }
                while (true) {
                    int i21 = this.Q;
                    if (i21 >= i20) {
                        break;
                    }
                    int d5 = d(uo2Var, mp2Var, i20 - i21);
                    this.Q += d5;
                    this.R += d5;
                }
            } else {
                byte[] bArr6 = (byte[]) this.f13039e.f7311d;
                bArr6[0] = 0;
                bArr6[1] = 0;
                bArr6[2] = 0;
                int i22 = pVar.Y;
                int i23 = 4 - i22;
                while (this.Q < i20) {
                    int i24 = this.S;
                    if (i24 == 0) {
                        int min = Math.min(i22, this.f13043i.zza());
                        ((qo2) uo2Var).n(bArr6, i23 + min, i22 - min, false);
                        if (min > 0) {
                            this.f13043i.d(bArr6, i23, min);
                        }
                        this.Q += i22;
                        this.f13039e.h(0);
                        this.S = this.f13039e.s();
                        this.f13038d.h(0);
                        mp2Var.d(this.f13038d, 4);
                        this.R += 4;
                    } else {
                        int d10 = d(uo2Var, mp2Var, i24);
                        this.Q += d10;
                        this.R += d10;
                        this.S -= d10;
                    }
                }
            }
            if ("A_VORBIS".equals(pVar.f12320b)) {
                this.f13041g.h(0);
                mp2Var.d(this.f13041g, 4);
                this.R += 4;
            }
        }
        int i25 = this.R;
        m();
        return i25;
    }

    @Override // m4.to2
    public final boolean c(uo2 uo2Var) {
        long a10;
        int i10;
        s sVar = new s();
        long j3 = ((qo2) uo2Var).f12945c;
        int i11 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        long j10 = 1024;
        if (i11 != 0 && j3 <= 1024) {
            j10 = j3;
        }
        int i12 = (int) j10;
        qo2 qo2Var = (qo2) uo2Var;
        qo2Var.o((byte[]) ((dd) sVar.f13474b).f7311d, 0, 4, false);
        sVar.f13473a = 4;
        for (long w10 = ((dd) sVar.f13474b).w(); w10 != 440786851; w10 = ((w10 << 8) & (-256)) | (((byte[]) ((dd) sVar.f13474b).f7311d)[0] & 255)) {
            int i13 = sVar.f13473a + 1;
            sVar.f13473a = i13;
            if (i13 == i12) {
                return false;
            }
            qo2Var.o((byte[]) ((dd) sVar.f13474b).f7311d, 0, 1, false);
        }
        long a11 = sVar.a(uo2Var);
        long j11 = sVar.f13473a;
        if (a11 != Long.MIN_VALUE) {
            if (i11 != 0 && j11 + a11 >= j3) {
                return false;
            }
            while (true) {
                int i14 = (sVar.f13473a > (j11 + a11) ? 1 : (sVar.f13473a == (j11 + a11) ? 0 : -1));
                if (i14 >= 0) {
                    return i14 == 0;
                } else if (sVar.a(uo2Var) == Long.MIN_VALUE || (a10 = sVar.a(uo2Var)) < 0) {
                    return false;
                } else {
                    if (i10 != 0) {
                        int i15 = (int) a10;
                        qo2Var.p(i15, false);
                        sVar.f13473a += i15;
                    }
                }
            }
        } else {
            return false;
        }
    }

    public final int d(uo2 uo2Var, mp2 mp2Var, int i10) {
        int zza = this.f13043i.zza();
        if (zza > 0) {
            int min = Math.min(i10, zza);
            mp2Var.d(this.f13043i, min);
            return min;
        }
        return mp2Var.a(uo2Var, i10, false);
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.Z = vo2Var;
    }

    public final long f(long j3) {
        long j10 = this.f13050q;
        if (j10 != -9223372036854775807L) {
            return ls1.w(j3, j10, 1000L);
        }
        throw mq.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // m4.to2
    public final void g(long j3, long j10) {
        this.A = -9223372036854775807L;
        this.F = 0;
        n nVar = this.f13035a0;
        nVar.f11373e = 0;
        nVar.f11370b.clear();
        u uVar = nVar.f11371c;
        uVar.f14212b = 0;
        uVar.f14213c = 0;
        u uVar2 = this.f13034a;
        uVar2.f14212b = 0;
        uVar2.f14213c = 0;
        m();
        for (int i10 = 0; i10 < this.f13036b.size(); i10++) {
            q qVar = this.f13036b.valueAt(i10).T;
            if (qVar != null) {
                qVar.f12656b = false;
                qVar.f12657c = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x04a7, code lost:
        if ((((byte[]) r13.f13040f.f7311d)[2] & 128) == 128) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r5 == 1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v16, types: [m4.qo2] */
    /* JADX WARN: Type inference failed for: r3v132 */
    /* JADX WARN: Type inference failed for: r3v159 */
    /* JADX WARN: Type inference failed for: r3v16, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r5v107, types: [m4.u] */
    /* JADX WARN: Type inference failed for: r5v109, types: [m4.u] */
    /* JADX WARN: Type inference failed for: r5v86, types: [m4.dd] */
    /* JADX WARN: Type inference failed for: r6v14, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v21, types: [int] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29, types: [m4.u] */
    /* JADX WARN: Type inference failed for: r6v34, types: [m4.dd] */
    /* JADX WARN: Type inference failed for: r6v51, types: [m4.qo2] */
    /* JADX WARN: Type inference failed for: r6v55, types: [m4.qo2] */
    /* JADX WARN: Type inference failed for: r6v68, types: [m4.qo2] */
    /* JADX WARN: Type inference failed for: r6v72, types: [m4.qo2] */
    /* JADX WARN: Type inference failed for: r7v58, types: [m4.qo2] */
    /* JADX WARN: Type inference failed for: r7v63, types: [m4.qo2] */
    /* JADX WARN: Type inference failed for: r7v66, types: [m4.qo2] */
    /* JADX WARN: Type inference failed for: r9v8, types: [m4.qo2] */
    @Override // m4.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(m4.uo2 r29, m4.gp2 r30) {
        /*
            Method dump skipped, instructions count: 2998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r.h(m4.uo2, m4.gp2):int");
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void i(int i10) {
        if (this.B == null || this.C == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i10);
            sb.append(" must be in a Cues");
            throw mq.a(sb.toString(), null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    public final void j(int i10) {
        if (this.f13053t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i10);
        sb.append(" must be in a TrackEntry");
        throw mq.a(sb.toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce A[EDGE_INSN: B:59:0x00ce->B:48:0x00ce ?: BREAK  , SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(m4.p r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.r.k(m4.p, long, int, int, int):void");
    }

    public final void l(uo2 uo2Var, int i10) {
        dd ddVar = this.f13040f;
        if (ddVar.f7310c >= i10) {
            return;
        }
        if (ddVar.a() < i10) {
            dd ddVar2 = this.f13040f;
            int a10 = ddVar2.a();
            ddVar2.D(Math.max(a10 + a10, i10));
        }
        dd ddVar3 = this.f13040f;
        int i11 = ddVar3.f7310c;
        ((qo2) uo2Var).n((byte[]) ddVar3.f7311d, i11, i10 - i11, false);
        this.f13040f.g(i10);
    }

    public final void m() {
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = 0;
        this.X = (byte) 0;
        this.Y = false;
        this.f13043i.e(0);
    }

    public final void n(uo2 uo2Var, byte[] bArr, int i10) {
        int length = bArr.length;
        int i11 = i10 + 32;
        if (this.f13044j.a() < i11) {
            dd ddVar = this.f13044j;
            byte[] copyOf = Arrays.copyOf(bArr, i11 + i10);
            ddVar.f(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, (byte[]) this.f13044j.f7311d, 0, 32);
        }
        ((qo2) uo2Var).n((byte[]) this.f13044j.f7311d, 32, i10, false);
        this.f13044j.h(0);
        this.f13044j.g(i11);
    }
}
