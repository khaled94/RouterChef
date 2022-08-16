package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import g1.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import l4.b;
import n3.m0;
import t3.t;

/* loaded from: classes.dex */
public final class sn2 extends si2 {

    /* renamed from: v1 */
    public static final int[] f13772v1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: w1 */
    public static boolean f13773w1;

    /* renamed from: x1 */
    public static boolean f13774x1;
    public final Context Q0;
    public final yn2 R0;
    public final eo2 S0;
    public rn2 U0;
    public boolean V0;
    public boolean W0;
    public Surface X0;
    public nn2 Y0;
    public boolean Z0;
    public boolean b1;

    /* renamed from: c1 */
    public boolean f13776c1;

    /* renamed from: d1 */
    public boolean f13777d1;

    /* renamed from: e1 */
    public long f13778e1;

    /* renamed from: g1 */
    public long f13779g1;

    /* renamed from: h1 */
    public int f13780h1;

    /* renamed from: i1 */
    public int f13781i1;

    /* renamed from: j1 */
    public int f13782j1;

    /* renamed from: k1 */
    public long f13783k1;

    /* renamed from: l1 */
    public long f13784l1;

    /* renamed from: m1 */
    public long f13785m1;

    /* renamed from: n1 */
    public int f13786n1;

    /* renamed from: q1 */
    public int f13789q1;

    /* renamed from: u1 */
    public tn2 f13793u1;
    public final boolean T0 = "NVIDIA".equals(ls1.f10973c);
    public long f1 = -9223372036854775807L;

    /* renamed from: o1 */
    public int f13787o1 = -1;

    /* renamed from: p1 */
    public int f13788p1 = -1;

    /* renamed from: r1 */
    public float f13790r1 = -1.0f;

    /* renamed from: a1 */
    public int f13775a1 = 1;

    /* renamed from: t1 */
    public int f13792t1 = 0;

    /* renamed from: s1 */
    public sg0 f13791s1 = null;

    public sn2(Context context, Handler handler, fo2 fo2Var) {
        super(2, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.Q0 = applicationContext;
        this.R0 = new yn2(applicationContext);
        this.S0 = new eo2(handler, fo2Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0351, code lost:
        if (r1.equals("602LV") != false) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x074a, code lost:
        if (r7 != 2) goto L486;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean G0(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 2774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.sn2.G0(java.lang.String):boolean");
    }

    public static int u0(qi2 qi2Var, t tVar) {
        if (tVar.f13872l != -1) {
            int size = tVar.f13873m.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += tVar.f13873m.get(i11).length;
            }
            return tVar.f13872l + i10;
        }
        return v0(qi2Var, tVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int v0(qi2 qi2Var, t tVar) {
        boolean z10;
        int i10;
        int intValue;
        int i11 = tVar.p;
        int i12 = tVar.f13876q;
        if (i11 == -1 || i12 == -1) {
            return -1;
        }
        String str = tVar.f13871k;
        int i13 = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> b10 = bj2.b(tVar);
            str = (b10 == null || !((intValue = ((Integer) b10.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    z10 = false;
                    break;
                }
                z10 = true;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            default:
                z10 = true;
                break;
        }
        if (z10 && !z10) {
            if (z10) {
                String str2 = ls1.f10974d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(ls1.f10973c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && qi2Var.f12888f)))) {
                    return -1;
                }
                i10 = (((i12 + 16) - 1) / 16) * (((i11 + 16) - 1) / 16) * 256;
            } else if (!z10) {
                if (!z10 && !z10) {
                    return -1;
                }
                i10 = i11 * i12;
                i13 = 4;
            }
            return (i10 * 3) / (i13 + i13);
        }
        i10 = i11 * i12;
        return (i10 * 3) / (i13 + i13);
    }

    public static List w0(t tVar, boolean z10, boolean z11) {
        Pair<Integer, Integer> b10;
        String str;
        String str2 = tVar.f13871k;
        if (str2 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bj2.d(str2, z10, z11));
        bj2.f(arrayList, new np0(tVar, 5));
        if ("video/dolby-vision".equals(str2) && (b10 = bj2.b(tVar)) != null) {
            int intValue = ((Integer) b10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                str = "video/hevc";
            } else if (intValue == 512) {
                str = "video/avc";
            }
            arrayList.addAll(bj2.d(str, z10, z11));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean z0(long j3) {
        return j3 < -30000;
    }

    @Override // m4.si2, m4.sz1
    public final void A(long j3, boolean z10) {
        super.A(j3, z10);
        this.b1 = false;
        int i10 = ls1.f10971a;
        this.R0.c();
        this.f13783k1 = -9223372036854775807L;
        this.f13778e1 = -9223372036854775807L;
        this.f13781i1 = 0;
        this.f1 = -9223372036854775807L;
    }

    public final boolean A0(qi2 qi2Var) {
        return ls1.f10971a >= 23 && !G0(qi2Var.f12883a) && (!qi2Var.f12888f || nn2.b(this.Q0));
    }

    public final void B0(oi2 oi2Var, int i10) {
        x0();
        b.o("releaseOutputBuffer");
        oi2Var.d(i10, true);
        b.r();
        this.f13784l1 = SystemClock.elapsedRealtime() * 1000;
        Objects.requireNonNull(this.J0);
        this.f13781i1 = 0;
        Q();
    }

    public final void C0(oi2 oi2Var, int i10, long j3) {
        x0();
        b.o("releaseOutputBuffer");
        oi2Var.j(i10, j3);
        b.r();
        this.f13784l1 = SystemClock.elapsedRealtime() * 1000;
        Objects.requireNonNull(this.J0);
        this.f13781i1 = 0;
        Q();
    }

    @Override // m4.ff2
    public final String D() {
        return "MediaCodecVideoRenderer";
    }

    public final void D0(oi2 oi2Var, int i10) {
        b.o("skipVideoBuffer");
        oi2Var.d(i10, false);
        b.r();
        Objects.requireNonNull(this.J0);
    }

    @Override // m4.sz1
    @TargetApi(17)
    public final void E() {
        try {
            P();
            m0();
            this.O0 = null;
            if (this.Y0 == null) {
                return;
            }
            y0();
        } catch (Throwable th) {
            if (this.Y0 != null) {
                y0();
            }
            throw th;
        }
    }

    public final void E0(int i10) {
        o02 o02Var = this.J0;
        Objects.requireNonNull(o02Var);
        this.f13780h1 += i10;
        int i11 = this.f13781i1 + i10;
        this.f13781i1 = i11;
        o02Var.f11972a = Math.max(i11, o02Var.f11972a);
    }

    @Override // m4.sz1
    public final void F() {
        this.f13780h1 = 0;
        this.f13779g1 = SystemClock.elapsedRealtime();
        this.f13784l1 = SystemClock.elapsedRealtime() * 1000;
        this.f13785m1 = 0L;
        this.f13786n1 = 0;
        yn2 yn2Var = this.R0;
        yn2Var.f15857d = true;
        yn2Var.c();
        yn2Var.e(false);
    }

    public final void F0(long j3) {
        Objects.requireNonNull(this.J0);
        this.f13785m1 += j3;
        this.f13786n1++;
    }

    @Override // m4.sz1
    public final void G() {
        this.f1 = -9223372036854775807L;
        if (this.f13780h1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.f13779g1;
            final eo2 eo2Var = this.S0;
            final int i10 = this.f13780h1;
            final long j10 = elapsedRealtime - j3;
            Handler handler = eo2Var.f8029a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m4.zn2
                    @Override // java.lang.Runnable
                    public final void run() {
                        eo2 eo2Var2 = eo2.this;
                        int i11 = i10;
                        long j11 = j10;
                        fo2 fo2Var = eo2Var2.f8030b;
                        int i12 = ls1.f10971a;
                        fo2Var.i(i11, j11);
                    }
                });
            }
            this.f13780h1 = 0;
            this.f13779g1 = elapsedRealtime;
        }
        final int i11 = this.f13786n1;
        if (i11 != 0) {
            final eo2 eo2Var2 = this.S0;
            final long j11 = this.f13785m1;
            Handler handler2 = eo2Var2.f8029a;
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: m4.ao2
                    @Override // java.lang.Runnable
                    public final void run() {
                        eo2 eo2Var3 = eo2.this;
                        long j12 = j11;
                        int i12 = i11;
                        fo2 fo2Var = eo2Var3.f8030b;
                        int i13 = ls1.f10971a;
                        fo2Var.d(j12, i12);
                    }
                });
            }
            this.f13785m1 = 0L;
            this.f13786n1 = 0;
        }
        yn2 yn2Var = this.R0;
        yn2Var.f15857d = false;
        yn2Var.b();
    }

    @Override // m4.si2, m4.ff2
    public final boolean K() {
        nn2 nn2Var;
        if (super.K() && (this.b1 || (((nn2Var = this.Y0) != null && this.X0 == nn2Var) || this.U == null))) {
            this.f1 = -9223372036854775807L;
            return true;
        } else if (this.f1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f1) {
                return true;
            }
            this.f1 = -9223372036854775807L;
            return false;
        }
    }

    @Override // m4.si2
    public final float L(float f10, t[] tVarArr) {
        float f11 = -1.0f;
        for (t tVar : tVarArr) {
            float f12 = tVar.f13877r;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // m4.si2
    public final int M(ti2 ti2Var, t tVar) {
        int i10 = 0;
        if (!rp.f(tVar.f13871k)) {
            return 0;
        }
        boolean z10 = tVar.f13874n != null;
        List w02 = w0(tVar, z10, false);
        if (z10 && w02.isEmpty()) {
            w02 = w0(tVar, false, false);
        }
        if (w02.isEmpty()) {
            return 1;
        }
        if (!(tVar.D == 0)) {
            return 2;
        }
        qi2 qi2Var = (qi2) w02.get(0);
        boolean c10 = qi2Var.c(tVar);
        int i11 = true != qi2Var.d(tVar) ? 8 : 16;
        if (c10) {
            List w03 = w0(tVar, z10, true);
            if (!w03.isEmpty()) {
                qi2 qi2Var2 = (qi2) w03.get(0);
                if (qi2Var2.c(tVar) && qi2Var2.d(tVar)) {
                    i10 = 32;
                }
            }
        }
        return (true != c10 ? 3 : 4) | i11 | i10;
    }

    @Override // m4.si2
    public final h12 N(qi2 qi2Var, t tVar, t tVar2) {
        int i10;
        int i11;
        h12 a10 = qi2Var.a(tVar, tVar2);
        int i12 = a10.f9080e;
        int i13 = tVar2.p;
        rn2 rn2Var = this.U0;
        if (i13 > rn2Var.f13406a || tVar2.f13876q > rn2Var.f13407b) {
            i12 |= 256;
        }
        if (u0(qi2Var, tVar2) > this.U0.f13408c) {
            i12 |= 64;
        }
        String str = qi2Var.f12883a;
        if (i12 != 0) {
            i11 = 0;
            i10 = i12;
        } else {
            i10 = 0;
            i11 = a10.f9079d;
        }
        return new h12(str, tVar, tVar2, i11, i10);
    }

    @Override // m4.si2
    public final h12 O(l lVar) {
        final h12 O = super.O(lVar);
        final eo2 eo2Var = this.S0;
        final t tVar = (t) lVar.f4818s;
        Handler handler = eo2Var.f8029a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: m4.bo2
                @Override // java.lang.Runnable
                public final void run() {
                    eo2 eo2Var2 = eo2.this;
                    t tVar2 = tVar;
                    h12 h12Var = O;
                    Objects.requireNonNull(eo2Var2);
                    int i10 = ls1.f10971a;
                    eo2Var2.f8030b.F(tVar2, h12Var);
                }
            });
        }
        return O;
    }

    public final void Q() {
        this.f13777d1 = true;
        if (!this.b1) {
            this.b1 = true;
            eo2 eo2Var = this.S0;
            Surface surface = this.X0;
            if (eo2Var.f8029a != null) {
                eo2Var.f8029a.post(new co2(eo2Var, surface, SystemClock.elapsedRealtime()));
            }
            this.Z0 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:
        if (r5 > r11) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011f, code lost:
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0121, code lost:
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0122, code lost:
        if (r5 > r11) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0124, code lost:
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0125, code lost:
        r3 = new android.graphics.Point(r9, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
        r22 = r9;
        r21 = r10;
     */
    @Override // m4.si2
    @android.annotation.TargetApi(17)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.ee0 R(m4.qi2 r24, m4.t r25, float r26) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.sn2.R(m4.qi2, m4.t, float):m4.ee0");
    }

    @Override // m4.si2
    public final List T(ti2 ti2Var, t tVar) {
        return w0(tVar, false, false);
    }

    @Override // m4.si2
    public final void U(Exception exc) {
        x90.e("MediaCodecVideoRenderer", "Video codec error", exc);
        eo2 eo2Var = this.S0;
        Handler handler = eo2Var.f8029a;
        if (handler != null) {
            handler.post(new t(eo2Var, exc, 4));
        }
    }

    @Override // m4.si2
    public final void V(final String str, final long j3, final long j10) {
        final eo2 eo2Var = this.S0;
        Handler handler = eo2Var.f8029a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: m4.do2
                @Override // java.lang.Runnable
                public final void run() {
                    eo2 eo2Var2 = eo2.this;
                    String str2 = str;
                    long j11 = j3;
                    long j12 = j10;
                    fo2 fo2Var = eo2Var2.f8030b;
                    int i10 = ls1.f10971a;
                    fo2Var.w(str2, j11, j12);
                }
            });
        }
        this.V0 = G0(str);
        qi2 qi2Var = this.f13668b0;
        Objects.requireNonNull(qi2Var);
        boolean z10 = false;
        if (ls1.f10971a >= 29 && "video/x-vnd.on2.vp9".equals(qi2Var.f12884b)) {
            MediaCodecInfo.CodecProfileLevel[] f10 = qi2Var.f();
            int length = f10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (f10[i10].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.W0 = z10;
    }

    @Override // m4.si2
    public final void W(String str) {
        eo2 eo2Var = this.S0;
        Handler handler = eo2Var.f8029a;
        if (handler != null) {
            handler.post(new an1(eo2Var, str, 1));
        }
    }

    @Override // m4.si2
    public final void X(t tVar, MediaFormat mediaFormat) {
        oi2 oi2Var = this.U;
        if (oi2Var != null) {
            oi2Var.a(this.f13775a1);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.f13787o1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f13788p1 = integer;
        float f10 = tVar.f13879t;
        this.f13790r1 = f10;
        if (ls1.f10971a >= 21) {
            int i10 = tVar.f13878s;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f13787o1;
                this.f13787o1 = integer;
                this.f13788p1 = i11;
                this.f13790r1 = 1.0f / f10;
            }
        } else {
            this.f13789q1 = tVar.f13878s;
        }
        yn2 yn2Var = this.R0;
        yn2Var.f15859f = tVar.f13877r;
        pn2 pn2Var = yn2Var.f15854a;
        pn2Var.f12580a.b();
        pn2Var.f12581b.b();
        pn2Var.f12582c = false;
        pn2Var.f12583d = -9223372036854775807L;
        pn2Var.f12584e = 0;
        yn2Var.d();
    }

    @Override // m4.si2
    public final void d0() {
        this.b1 = false;
        int i10 = ls1.f10971a;
    }

    @Override // m4.si2
    public final void e0(il0 il0Var) {
        this.f13782j1++;
        int i10 = ls1.f10971a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        if ((r8 == 0 ? false : r11.f12236g[(int) ((r8 - 1) % 15)]) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012f, code lost:
        if (r11 > 100000) goto L70;
     */
    @Override // m4.si2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g0(long r24, long r26, m4.oi2 r28, java.nio.ByteBuffer r29, int r30, int r31, int r32, long r33, boolean r35, boolean r36, m4.t r37) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.sn2.g0(long, long, m4.oi2, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, m4.t):boolean");
    }

    @Override // m4.si2
    public final pi2 i0(Throwable th, qi2 qi2Var) {
        return new qn2(th, qi2Var, this.X0);
    }

    @Override // m4.si2
    @TargetApi(29)
    public final void j0(il0 il0Var) {
        if (!this.W0) {
            return;
        }
        ByteBuffer byteBuffer = il0Var.f9689f;
        Objects.requireNonNull(byteBuffer);
        if (byteBuffer.remaining() < 7) {
            return;
        }
        byte b10 = byteBuffer.get();
        short s10 = byteBuffer.getShort();
        short s11 = byteBuffer.getShort();
        byte b11 = byteBuffer.get();
        byte b12 = byteBuffer.get();
        byteBuffer.position(0);
        if (b10 != -75 || s10 != 60 || s11 != 1 || b11 != 4 || b12 != 0) {
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        byteBuffer.position(0);
        oi2 oi2Var = this.U;
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        oi2Var.f(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.view.Surface] */
    @Override // m4.sz1, m4.bf2
    public final void k(int i10, Object obj) {
        eo2 eo2Var;
        Handler handler;
        eo2 eo2Var2;
        Handler handler2;
        if (i10 != 1) {
            if (i10 == 7) {
                this.f13793u1 = (tn2) obj;
                return;
            } else if (i10 == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.f13792t1 == intValue) {
                    return;
                }
                this.f13792t1 = intValue;
                return;
            } else if (i10 == 4) {
                int intValue2 = ((Integer) obj).intValue();
                this.f13775a1 = intValue2;
                oi2 oi2Var = this.U;
                if (oi2Var == null) {
                    return;
                }
                oi2Var.a(intValue2);
                return;
            } else if (i10 != 5) {
                return;
            } else {
                yn2 yn2Var = this.R0;
                int intValue3 = ((Integer) obj).intValue();
                if (yn2Var.f15863j == intValue3) {
                    return;
                }
                yn2Var.f15863j = intValue3;
                yn2Var.e(true);
                return;
            }
        }
        nn2 nn2Var = obj instanceof Surface ? (Surface) obj : null;
        if (nn2Var == null) {
            nn2 nn2Var2 = this.Y0;
            if (nn2Var2 != null) {
                nn2Var = nn2Var2;
            } else {
                qi2 qi2Var = this.f13668b0;
                if (qi2Var != null && A0(qi2Var)) {
                    nn2Var = nn2.a(this.Q0, qi2Var.f12888f);
                    this.Y0 = nn2Var;
                }
            }
        }
        if (this.X0 == nn2Var) {
            if (nn2Var == null || nn2Var == this.Y0) {
                return;
            }
            sg0 sg0Var = this.f13791s1;
            if (sg0Var != null && (handler = (eo2Var = this.S0).f8029a) != null) {
                handler.post(new kd0(eo2Var, sg0Var, 1));
            }
            if (!this.Z0) {
                return;
            }
            eo2 eo2Var3 = this.S0;
            Surface surface = this.X0;
            if (eo2Var3.f8029a == null) {
                return;
            }
            eo2Var3.f8029a.post(new co2(eo2Var3, surface, SystemClock.elapsedRealtime()));
            return;
        }
        this.X0 = nn2Var;
        yn2 yn2Var2 = this.R0;
        Objects.requireNonNull(yn2Var2);
        nn2 nn2Var3 = true == (nn2Var instanceof nn2) ? null : nn2Var;
        if (yn2Var2.f15858e != nn2Var3) {
            yn2Var2.b();
            yn2Var2.f15858e = nn2Var3;
            yn2Var2.e(true);
        }
        this.Z0 = false;
        int i11 = this.f13858w;
        oi2 oi2Var2 = this.U;
        if (oi2Var2 != null) {
            if (ls1.f10971a < 23 || nn2Var == null || this.V0) {
                m0();
                k0();
            } else {
                oi2Var2.g(nn2Var);
            }
        }
        if (nn2Var == null || nn2Var == this.Y0) {
            this.f13791s1 = null;
            this.b1 = false;
            int i12 = ls1.f10971a;
            return;
        }
        sg0 sg0Var2 = this.f13791s1;
        if (sg0Var2 != null && (handler2 = (eo2Var2 = this.S0).f8029a) != null) {
            handler2.post(new kd0(eo2Var2, sg0Var2, 1));
        }
        this.b1 = false;
        int i13 = ls1.f10971a;
        if (i11 != 2) {
            return;
        }
        this.f1 = -9223372036854775807L;
    }

    @Override // m4.si2
    public final void l0(long j3) {
        super.l0(j3);
        this.f13782j1--;
    }

    @Override // m4.si2, m4.sz1, m4.ff2
    public final void n(float f10, float f11) {
        this.S = f10;
        this.T = f11;
        b0(this.V);
        yn2 yn2Var = this.R0;
        yn2Var.f15862i = f10;
        yn2Var.c();
        yn2Var.e(false);
    }

    @Override // m4.si2
    public final void n0() {
        super.n0();
        this.f13782j1 = 0;
    }

    @Override // m4.si2
    public final boolean q0(qi2 qi2Var) {
        return this.X0 != null || A0(qi2Var);
    }

    public final void x0() {
        int i10 = this.f13787o1;
        if (i10 == -1) {
            if (this.f13788p1 == -1) {
                return;
            }
            i10 = -1;
        }
        sg0 sg0Var = this.f13791s1;
        if (sg0Var != null && sg0Var.f13628a == i10 && sg0Var.f13629b == this.f13788p1 && sg0Var.f13630c == this.f13789q1 && sg0Var.f13631d == this.f13790r1) {
            return;
        }
        sg0 sg0Var2 = new sg0(i10, this.f13788p1, this.f13789q1, this.f13790r1);
        this.f13791s1 = sg0Var2;
        eo2 eo2Var = this.S0;
        Handler handler = eo2Var.f8029a;
        if (handler == null) {
            return;
        }
        handler.post(new kd0(eo2Var, sg0Var2, 1));
    }

    @Override // m4.si2, m4.sz1
    public final void y() {
        this.f13791s1 = null;
        this.b1 = false;
        int i10 = ls1.f10971a;
        this.Z0 = false;
        yn2 yn2Var = this.R0;
        vn2 vn2Var = yn2Var.f15855b;
        if (vn2Var != null) {
            vn2Var.zza();
            xn2 xn2Var = yn2Var.f15856c;
            Objects.requireNonNull(xn2Var);
            xn2Var.f15427t.sendEmptyMessage(2);
        }
        try {
            super.y();
            eo2 eo2Var = this.S0;
            o02 o02Var = this.J0;
            Objects.requireNonNull(eo2Var);
            synchronized (o02Var) {
            }
            Handler handler = eo2Var.f8029a;
            if (handler == null) {
                return;
            }
            handler.post(new rb0(eo2Var, o02Var, 2));
        } catch (Throwable th) {
            eo2 eo2Var2 = this.S0;
            o02 o02Var2 = this.J0;
            Objects.requireNonNull(eo2Var2);
            synchronized (o02Var2) {
                Handler handler2 = eo2Var2.f8029a;
                if (handler2 != null) {
                    handler2.post(new rb0(eo2Var2, o02Var2, 2));
                }
                throw th;
            }
        }
    }

    public final void y0() {
        Surface surface = this.X0;
        nn2 nn2Var = this.Y0;
        if (surface == nn2Var) {
            this.X0 = null;
        }
        nn2Var.release();
        this.Y0 = null;
    }

    @Override // m4.sz1
    public final void z(boolean z10) {
        this.J0 = new o02();
        Objects.requireNonNull(this.f13856u);
        eo2 eo2Var = this.S0;
        o02 o02Var = this.J0;
        Handler handler = eo2Var.f8029a;
        if (handler != null) {
            handler.post(new b70(eo2Var, o02Var, 1));
        }
        yn2 yn2Var = this.R0;
        if (yn2Var.f15855b != null) {
            xn2 xn2Var = yn2Var.f15856c;
            Objects.requireNonNull(xn2Var);
            xn2Var.f15427t.sendEmptyMessage(1);
            yn2Var.f15855b.a(new m0(yn2Var));
        }
        this.f13776c1 = z10;
        this.f13777d1 = false;
    }
}
