package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import h2.m;
import h2.n;
import java.util.Objects;
import n9.d;

@TargetApi(16)
/* loaded from: classes.dex */
public final class eh extends ud {
    public final Context Q;
    public final gh R;
    public final lh S;
    public final boolean T;
    public final long[] U;
    public ua[] V;
    public dh W;
    public Surface X;
    public bh Y;
    public boolean Z;

    /* renamed from: a0 */
    public long f7901a0;

    /* renamed from: b0 */
    public long f7902b0;

    /* renamed from: c0 */
    public int f7903c0;

    /* renamed from: d0 */
    public int f7904d0;

    /* renamed from: e0 */
    public int f7905e0;

    /* renamed from: f0 */
    public float f7906f0;

    /* renamed from: g0 */
    public int f7907g0;

    /* renamed from: h0 */
    public int f7908h0;

    /* renamed from: i0 */
    public int f7909i0;

    /* renamed from: j0 */
    public float f7910j0;

    /* renamed from: k0 */
    public int f7911k0;

    /* renamed from: l0 */
    public int f7912l0;

    /* renamed from: m0 */
    public int f7913m0;

    /* renamed from: n0 */
    public float f7914n0;

    /* renamed from: o0 */
    public long f7915o0;

    /* renamed from: p0 */
    public int f7916p0;

    public eh(Context context, Handler handler, mh mhVar) {
        super(2);
        this.Q = context.getApplicationContext();
        this.R = new gh(context);
        this.S = new lh(handler, mhVar);
        this.T = wg.f14958a <= 22 && "foster".equals(wg.f14959b) && "NVIDIA".equals(wg.f14960c);
        this.U = new long[10];
        this.f7915o0 = -9223372036854775807L;
        this.f7901a0 = -9223372036854775807L;
        this.f7907g0 = -1;
        this.f7908h0 = -1;
        this.f7910j0 = -1.0f;
        this.f7906f0 = -1.0f;
        V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
        if (r5.a(r6, r8) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    @Override // m4.ud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A(long r22, long r24, android.media.MediaCodec r26, java.nio.ByteBuffer r27, int r28, long r29, boolean r31) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.eh.A(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, long, boolean):boolean");
    }

    @Override // m4.ya
    public final void L(int i10, Object obj) {
        if (i10 == 1) {
            Surface surface = (Surface) obj;
            bh bhVar = surface;
            if (surface == null) {
                bh bhVar2 = this.Y;
                if (bhVar2 != null) {
                    bhVar = bhVar2;
                } else {
                    sd sdVar = this.f14369q;
                    bhVar = surface;
                    if (sdVar != null) {
                        bhVar = surface;
                        if (Z(sdVar.f13597d)) {
                            bh a10 = bh.a(this.Q, sdVar.f13597d);
                            this.Y = a10;
                            bhVar = a10;
                        }
                    }
                }
            }
            if (this.X == bhVar) {
                if (bhVar == null || bhVar == this.Y) {
                    return;
                }
                Y();
                if (!this.Z) {
                    return;
                }
                lh lhVar = this.S;
                ((Handler) lhVar.f10838b).post(new jh(lhVar, this.X, 0));
                return;
            }
            this.X = bhVar;
            int i11 = this.f9155d;
            if (i11 == 1 || i11 == 2) {
                MediaCodec mediaCodec = this.p;
                if (wg.f14958a < 23 || mediaCodec == null || bhVar == null) {
                    P();
                    N();
                } else {
                    mediaCodec.setOutputSurface(bhVar);
                }
            }
            if (bhVar == null || bhVar == this.Y) {
                V();
                this.Z = false;
                int i12 = wg.f14958a;
                return;
            }
            Y();
            this.Z = false;
            int i13 = wg.f14958a;
            if (i11 != 2) {
                return;
            }
            this.f7901a0 = -9223372036854775807L;
        }
    }

    @Override // m4.ud
    public final void O() {
        int i10 = wg.f14958a;
    }

    @Override // m4.ud
    public final void P() {
        try {
            super.P();
        } finally {
            bh bhVar = this.Y;
            if (bhVar != null) {
                if (this.X == bhVar) {
                    this.X = null;
                }
                bhVar.release();
                this.Y = null;
            }
        }
    }

    @Override // m4.ud
    public final boolean Q(boolean z10, ua uaVar, ua uaVar2) {
        if (uaVar.f14312x.equals(uaVar2.f14312x)) {
            int i10 = uaVar.E;
            if (i10 == -1) {
                i10 = 0;
            }
            int i11 = uaVar2.E;
            if (i11 == -1) {
                i11 = 0;
            }
            if (i10 == i11 && (z10 || (uaVar.B == uaVar2.B && uaVar.C == uaVar2.C))) {
                int i12 = uaVar2.B;
                dh dhVar = this.W;
                if (i12 <= dhVar.f7398a && uaVar2.C <= dhVar.f7399b && uaVar2.y <= dhVar.f7400c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // m4.ud
    public final boolean R(sd sdVar) {
        return this.X != null || Z(sdVar.f13597d);
    }

    public final void S(MediaCodec mediaCodec, int i10) {
        X();
        wo2.c("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        wo2.e();
        Objects.requireNonNull(this.O);
        this.f7904d0 = 0;
        p();
    }

    @TargetApi(21)
    public final void T(MediaCodec mediaCodec, int i10, long j3) {
        X();
        wo2.c("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, j3);
        wo2.e();
        Objects.requireNonNull(this.O);
        this.f7904d0 = 0;
        p();
    }

    public final void U(MediaCodec mediaCodec, int i10) {
        wo2.c("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        wo2.e();
        Objects.requireNonNull(this.O);
    }

    public final void V() {
        this.f7911k0 = -1;
        this.f7912l0 = -1;
        this.f7914n0 = -1.0f;
        this.f7913m0 = -1;
    }

    public final void W() {
        if (this.f7903c0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.f7902b0;
            lh lhVar = this.S;
            ((Handler) lhVar.f10838b).post(new hh(lhVar, this.f7903c0, elapsedRealtime - j3));
            this.f7903c0 = 0;
            this.f7902b0 = elapsedRealtime;
        }
    }

    public final void X() {
        int i10 = this.f7911k0;
        int i11 = this.f7907g0;
        if (i10 == i11 && this.f7912l0 == this.f7908h0 && this.f7913m0 == this.f7909i0 && this.f7914n0 == this.f7910j0) {
            return;
        }
        lh lhVar = this.S;
        ((Handler) lhVar.f10838b).post(new ih(lhVar, i11, this.f7908h0, this.f7909i0, this.f7910j0));
        this.f7911k0 = this.f7907g0;
        this.f7912l0 = this.f7908h0;
        this.f7913m0 = this.f7909i0;
        this.f7914n0 = this.f7910j0;
    }

    public final void Y() {
        if (this.f7911k0 == -1 && this.f7912l0 == -1) {
            return;
        }
        lh lhVar = this.S;
        ((Handler) lhVar.f10838b).post(new ih(lhVar, this.f7907g0, this.f7908h0, this.f7909i0, this.f7910j0));
    }

    public final boolean Z(boolean z10) {
        return wg.f14958a >= 23 && (!z10 || bh.b(this.Q));
    }

    /* JADX WARN: Finally extract failed */
    @Override // m4.ud, m4.ha
    public final void e() {
        this.f7907g0 = -1;
        this.f7908h0 = -1;
        this.f7910j0 = -1.0f;
        this.f7906f0 = -1.0f;
        this.f7915o0 = -9223372036854775807L;
        this.f7916p0 = 0;
        V();
        this.Z = false;
        int i10 = wg.f14958a;
        gh ghVar = this.R;
        if (ghVar.f8872b) {
            ghVar.f8871a.f8500t.sendEmptyMessage(2);
        }
        try {
            super.e();
            synchronized (this.O) {
            }
            lh lhVar = this.S;
            ((Handler) lhVar.f10838b).post(new kh(lhVar, this.O, 0));
        } catch (Throwable th) {
            synchronized (this.O) {
                lh lhVar2 = this.S;
                ((Handler) lhVar2.f10838b).post(new kh(lhVar2, this.O, 0));
                throw th;
            }
        }
    }

    @Override // m4.ha
    public final void g() {
        this.O = new ac();
        Objects.requireNonNull(this.f9153b);
        lh lhVar = this.S;
        ((Handler) lhVar.f10838b).post(new m(lhVar, this.O, 2));
        gh ghVar = this.R;
        ghVar.f8878h = false;
        if (ghVar.f8872b) {
            ghVar.f8871a.f8500t.sendEmptyMessage(1);
        }
    }

    @Override // m4.ud, m4.ha
    public final void j(long j3, boolean z10) {
        super.j(j3, z10);
        this.Z = false;
        int i10 = wg.f14958a;
        this.f7904d0 = 0;
        int i11 = this.f7916p0;
        if (i11 != 0) {
            this.f7915o0 = this.U[i11 - 1];
            this.f7916p0 = 0;
        }
        this.f7901a0 = -9223372036854775807L;
    }

    @Override // m4.ha
    public final void k() {
        this.f7903c0 = 0;
        this.f7902b0 = SystemClock.elapsedRealtime();
        this.f7901a0 = -9223372036854775807L;
    }

    @Override // m4.ha
    public final void l() {
        W();
    }

    @Override // m4.ha
    public final void m(ua[] uaVarArr, long j3) {
        this.V = uaVarArr;
        if (this.f7915o0 == -9223372036854775807L) {
            this.f7915o0 = j3;
            return;
        }
        int i10 = this.f7916p0;
        if (i10 == 10) {
            long j10 = this.U[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j10);
            Log.w("MediaCodecVideoRenderer", sb.toString());
        } else {
            this.f7916p0 = i10 + 1;
        }
        this.U[this.f7916p0 - 1] = j3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0442  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    @Override // m4.ud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(m4.ua r23) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.eh.n(m4.ua):int");
    }

    public final void p() {
        if (!this.Z) {
            this.Z = true;
            lh lhVar = this.S;
            ((Handler) lhVar.f10838b).post(new jh(lhVar, this.X, 0));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // m4.ud
    public final void s(sd sdVar, MediaCodec mediaCodec, ua uaVar) {
        char c10;
        int i10;
        int i11;
        ua[] uaVarArr = this.V;
        int i12 = uaVar.B;
        int i13 = uaVar.C;
        int i14 = uaVar.y;
        if (i14 == -1) {
            String str = uaVar.f14312x;
            if (i12 != -1 && i13 != -1) {
                Objects.requireNonNull(str);
                int i15 = 2;
                switch (str.hashCode()) {
                    case -1664118616:
                        if (str.equals("video/3gpp")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1187890754:
                        if (str.equals("video/mp4v-es")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1599127256:
                        if (str.equals("video/x-vnd.on2.vp8")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1599127257:
                        if (str.equals("video/x-vnd.on2.vp9")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                    case 2:
                    case 4:
                        i11 = i12 * i13;
                        i10 = i11;
                        i14 = (i10 * 3) / (i15 + i15);
                        break;
                    case 1:
                    case 5:
                        i10 = i12 * i13;
                        i15 = 4;
                        i14 = (i10 * 3) / (i15 + i15);
                        break;
                    case 3:
                        if (!"BRAVIA 4K 2015".equals(wg.f14961d)) {
                            i11 = (((i13 + 16) - 1) / 16) * (((i12 + 16) - 1) / 16) * 256;
                            i10 = i11;
                            i14 = (i10 * 3) / (i15 + i15);
                            break;
                        }
                    default:
                        i14 = -1;
                        break;
                }
            }
            i14 = -1;
        }
        int length = uaVarArr.length;
        this.W = new dh(i12, i13, i14);
        boolean z10 = this.T;
        MediaFormat b10 = uaVar.b();
        b10.setInteger("max-width", i12);
        b10.setInteger("max-height", i13);
        if (i14 != -1) {
            b10.setInteger("max-input-size", i14);
        }
        if (z10) {
            b10.setInteger("auto-frc", 0);
        }
        if (this.X == null) {
            d.i(Z(sdVar.f13597d));
            if (this.Y == null) {
                this.Y = bh.a(this.Q, sdVar.f13597d);
            }
            this.X = this.Y;
        }
        mediaCodec.configure(b10, this.X, (MediaCrypto) null, 0);
        int i16 = wg.f14958a;
    }

    @Override // m4.ud, m4.ya
    public final boolean t() {
        bh bhVar;
        if (super.t() && (this.Z || (((bhVar = this.Y) != null && this.X == bhVar) || this.p == null))) {
            this.f7901a0 = -9223372036854775807L;
            return true;
        } else if (this.f7901a0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f7901a0) {
                return true;
            }
            this.f7901a0 = -9223372036854775807L;
            return false;
        }
    }

    @Override // m4.ud
    public final void v(String str, long j3, long j10) {
        lh lhVar = this.S;
        ((Handler) lhVar.f10838b).post(new n(lhVar, str));
    }

    @Override // m4.ud
    public final void w(ua uaVar) {
        super.w(uaVar);
        lh lhVar = this.S;
        ((Handler) lhVar.f10838b).post(new oe(lhVar, uaVar, 1));
        float f10 = uaVar.F;
        if (f10 == -1.0f) {
            f10 = 1.0f;
        }
        this.f7906f0 = f10;
        int i10 = uaVar.E;
        if (i10 == -1) {
            i10 = 0;
        }
        this.f7905e0 = i10;
    }

    @Override // m4.ud
    public final void x(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z10 = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z10 = true;
        }
        this.f7907g0 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f7908h0 = integer;
        float f10 = this.f7906f0;
        this.f7910j0 = f10;
        if (wg.f14958a >= 21) {
            int i10 = this.f7905e0;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f7907g0;
                this.f7907g0 = integer;
                this.f7908h0 = i11;
                this.f7910j0 = 1.0f / f10;
            }
        } else {
            this.f7909i0 = this.f7905e0;
        }
        mediaCodec.setVideoScalingMode(1);
    }
}
