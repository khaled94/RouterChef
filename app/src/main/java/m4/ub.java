package m4;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Objects;
import n3.j0;
import z3.k;
import z3.l;

@TargetApi(16)
/* loaded from: classes.dex */
public final class ub extends ud implements pg {
    public final j0 Q;
    public final rb R = new rb(new gb[0], new tb(this));
    public boolean S;
    public int T;
    public int U;
    public long V;
    public boolean W;

    public ub(Handler handler, jb jbVar) {
        super(1);
        this.Q = new j0(handler, jbVar);
    }

    @Override // m4.ud
    public final boolean A(long j3, long j10, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, long j11, boolean z10) {
        if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            Objects.requireNonNull(this.O);
            rb rbVar = this.R;
            if (rbVar.E == 1) {
                rbVar.E = 2;
            }
            return true;
        }
        try {
            if (!this.R.e(byteBuffer, j11)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i10, false);
            Objects.requireNonNull(this.O);
            return true;
        } catch (ob | qb e10) {
            throw new ja(e10);
        }
    }

    @Override // m4.ud, m4.ya
    public final boolean B() {
        if (this.M) {
            rb rbVar = this.R;
            if (!rbVar.n() || (rbVar.Q && !rbVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // m4.pg
    public final xa D() {
        return this.R.f13230q;
    }

    @Override // m4.pg
    public final long E() {
        long j3;
        long j10;
        long j11;
        long j12;
        String str;
        StringBuilder sb;
        String str2;
        rb rbVar = this.R;
        boolean B = B();
        if (!rbVar.n() || rbVar.E == 0) {
            j10 = Long.MIN_VALUE;
            j3 = Long.MIN_VALUE;
        } else {
            if (rbVar.f13223i.getPlayState() == 3) {
                lb lbVar = rbVar.f13221g;
                long a10 = (lbVar.a() * 1000000) / lbVar.f10698c;
                if (a10 != 0) {
                    long nanoTime = System.nanoTime() / 1000;
                    if (nanoTime - rbVar.f13236w >= 30000) {
                        long[] jArr = rbVar.f13220f;
                        int i10 = rbVar.f13233t;
                        jArr[i10] = a10 - nanoTime;
                        rbVar.f13233t = (i10 + 1) % 10;
                        int i11 = rbVar.f13234u;
                        if (i11 < 10) {
                            rbVar.f13234u = i11 + 1;
                        }
                        rbVar.f13236w = nanoTime;
                        rbVar.f13235v = 0L;
                        int i12 = 0;
                        while (true) {
                            int i13 = rbVar.f13234u;
                            if (i12 >= i13) {
                                break;
                            }
                            rbVar.f13235v = (rbVar.f13220f[i12] / i13) + rbVar.f13235v;
                            i12++;
                        }
                    }
                    if (!rbVar.o() && nanoTime - rbVar.y >= 500000) {
                        boolean e10 = rbVar.f13221g.e();
                        rbVar.f13237x = e10;
                        if (e10) {
                            long c10 = rbVar.f13221g.c() / 1000;
                            long b10 = rbVar.f13221g.b();
                            if (c10 < rbVar.G) {
                                str = "AudioTrack";
                            } else {
                                if (Math.abs(c10 - nanoTime) > 5000000) {
                                    sb = new StringBuilder(136);
                                    str2 = "Spurious audio timestamp (system clock mismatch): ";
                                } else if (Math.abs(rbVar.h(b10) - a10) > 5000000) {
                                    sb = new StringBuilder(138);
                                    str2 = "Spurious audio timestamp (frame position mismatch): ";
                                } else {
                                    str = "AudioTrack";
                                }
                                sb.append(str2);
                                sb.append(b10);
                                sb.append(", ");
                                sb.append(c10);
                                sb.append(", ");
                                sb.append(nanoTime);
                                sb.append(", ");
                                sb.append(a10);
                                String sb2 = sb.toString();
                                str = "AudioTrack";
                                Log.w(str, sb2);
                            }
                            rbVar.f13237x = false;
                        } else {
                            str = "AudioTrack";
                        }
                        Method method = rbVar.f13238z;
                        if (method != null) {
                            try {
                                long intValue = (((Integer) method.invoke(rbVar.f13223i, null)).intValue() * 1000) - rbVar.f13229o;
                                rbVar.H = intValue;
                                long max = Math.max(intValue, 0L);
                                rbVar.H = max;
                                if (max > 5000000) {
                                    StringBuilder sb3 = new StringBuilder(61);
                                    sb3.append("Ignoring impossibly large audio latency: ");
                                    sb3.append(max);
                                    Log.w(str, sb3.toString());
                                    rbVar.H = 0L;
                                }
                            } catch (Exception unused) {
                                rbVar.f13238z = null;
                            }
                        }
                        rbVar.y = nanoTime;
                    }
                }
            }
            long nanoTime2 = System.nanoTime() / 1000;
            if (rbVar.f13237x) {
                j11 = rbVar.h(rbVar.f13221g.b() + rbVar.g(nanoTime2 - (rbVar.f13221g.c() / 1000)));
            } else {
                if (rbVar.f13234u == 0) {
                    lb lbVar2 = rbVar.f13221g;
                    j11 = (lbVar2.a() * 1000000) / lbVar2.f10698c;
                } else {
                    j11 = nanoTime2 + rbVar.f13235v;
                }
                if (!B) {
                    j11 -= rbVar.H;
                }
            }
            long j13 = rbVar.F;
            while (!rbVar.f13222h.isEmpty() && j11 >= rbVar.f13222h.getFirst().f12460c) {
                pb remove = rbVar.f13222h.remove();
                rbVar.f13230q = remove.f12458a;
                rbVar.f13232s = remove.f12460c;
                rbVar.f13231r = remove.f12459b - rbVar.F;
            }
            if (rbVar.f13230q.f15259a == 1.0f) {
                j12 = (j11 + rbVar.f13231r) - rbVar.f13232s;
            } else {
                if (rbVar.f13222h.isEmpty()) {
                    xb xbVar = rbVar.f13216b;
                    long j14 = xbVar.f15275k;
                    if (j14 >= 1024) {
                        j12 = wg.f(j11 - rbVar.f13232s, xbVar.f15274j, j14) + rbVar.f13231r;
                    }
                }
                j12 = ((long) (rbVar.f13230q.f15259a * (j11 - rbVar.f13232s))) + rbVar.f13231r;
            }
            j3 = j13 + j12;
            j10 = Long.MIN_VALUE;
        }
        if (j3 != j10) {
            if (!this.W) {
                j3 = Math.max(this.V, j3);
            }
            this.V = j3;
            this.W = false;
        }
        return this.V;
    }

    @Override // m4.pg
    public final xa J(xa xaVar) {
        return this.R.a(xaVar);
    }

    @Override // m4.ya
    public final void L(int i10, Object obj) {
        if (i10 != 2) {
            return;
        }
        rb rbVar = this.R;
        float floatValue = ((Float) obj).floatValue();
        if (rbVar.I == floatValue) {
            return;
        }
        rbVar.I = floatValue;
        rbVar.l();
    }

    /* JADX WARN: Finally extract failed */
    @Override // m4.ud, m4.ha
    public final void e() {
        try {
            rb rbVar = this.R;
            rbVar.d();
            gb[] gbVarArr = rbVar.f13217c;
            for (int i10 = 0; i10 < 3; i10++) {
                gbVarArr[i10].e();
            }
            rbVar.S = 0;
            rbVar.R = false;
            try {
                super.e();
                synchronized (this.O) {
                }
                this.Q.a(this.O);
            } catch (Throwable th) {
                synchronized (this.O) {
                    this.Q.a(this.O);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                super.e();
                synchronized (this.O) {
                    this.Q.a(this.O);
                    throw th2;
                }
            } catch (Throwable th3) {
                synchronized (this.O) {
                    this.Q.a(this.O);
                    throw th3;
                }
            }
        }
    }

    @Override // m4.ha
    public final void g() {
        ac acVar = new ac();
        this.O = acVar;
        j0 j0Var = this.Q;
        ((Handler) j0Var.f16489s).post(new hb(j0Var, acVar, 0));
        Objects.requireNonNull(this.f9153b);
    }

    @Override // m4.ha, m4.ya
    public final pg h() {
        return this;
    }

    @Override // m4.ud, m4.ha
    public final void j(long j3, boolean z10) {
        super.j(j3, z10);
        this.R.d();
        this.V = j3;
        this.W = true;
    }

    @Override // m4.ha
    public final void k() {
        this.R.c();
    }

    @Override // m4.ha
    public final void l() {
        rb rbVar = this.R;
        rbVar.R = false;
        if (rbVar.n()) {
            rbVar.f13235v = 0L;
            rbVar.f13234u = 0;
            rbVar.f13233t = 0;
            rbVar.f13236w = 0L;
            rbVar.f13237x = false;
            rbVar.y = 0L;
            lb lbVar = rbVar.f13221g;
            if (lbVar.f10702g != -9223372036854775807L) {
                return;
            }
            lbVar.f10696a.pause();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
        if (r1 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
        if (r2 == false) goto L43;
     */
    @Override // m4.ud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(m4.ua r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.f14312x
            boolean r1 = m4.mz1.b(r0)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = m4.wg.f14958a
            r3 = 21
            if (r1 < r3) goto L13
            r4 = 16
            goto L14
        L13:
            r4 = r2
        L14:
            m4.sd r0 = m4.be.a(r0, r2)
            r5 = 1
            if (r0 != 0) goto L1c
            return r5
        L1c:
            r6 = 2
            r7 = 3
            if (r1 < r3) goto L74
            int r1 = r11.K
            r3 = -1
            if (r1 == r3) goto L4b
            android.media.MediaCodecInfo$CodecCapabilities r8 = r0.f13599f
            if (r8 != 0) goto L2c
            java.lang.String r1 = "sampleRate.caps"
            goto L43
        L2c:
            android.media.MediaCodecInfo$AudioCapabilities r8 = r8.getAudioCapabilities()
            if (r8 != 0) goto L35
            java.lang.String r1 = "sampleRate.aCaps"
            goto L43
        L35:
            boolean r8 = r8.isSampleRateSupported(r1)
            if (r8 != 0) goto L48
            r8 = 31
            java.lang.String r9 = "sampleRate.support, "
            java.lang.String r1 = androidx.activity.k.a(r8, r9, r1)
        L43:
            r0.a(r1)
            r1 = r2
            goto L49
        L48:
            r1 = r5
        L49:
            if (r1 == 0) goto L75
        L4b:
            int r11 = r11.J
            if (r11 == r3) goto L74
            android.media.MediaCodecInfo$CodecCapabilities r1 = r0.f13599f
            if (r1 != 0) goto L56
            java.lang.String r11 = "channelCount.caps"
            goto L6d
        L56:
            android.media.MediaCodecInfo$AudioCapabilities r1 = r1.getAudioCapabilities()
            if (r1 != 0) goto L5f
            java.lang.String r11 = "channelCount.aCaps"
            goto L6d
        L5f:
            int r1 = r1.getMaxInputChannelCount()
            if (r1 >= r11) goto L71
            r1 = 33
            java.lang.String r3 = "channelCount.support, "
            java.lang.String r11 = androidx.activity.k.a(r1, r3, r11)
        L6d:
            r0.a(r11)
            goto L72
        L71:
            r2 = r5
        L72:
            if (r2 == 0) goto L75
        L74:
            r6 = r7
        L75:
            r11 = r4 | 4
            r11 = r11 | r6
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ub.n(m4.ua):int");
    }

    @Override // m4.ud
    public final sd r(ua uaVar) {
        return be.a(uaVar.f14312x, false);
    }

    @Override // m4.ud
    public final void s(sd sdVar, MediaCodec mediaCodec, ua uaVar) {
        boolean z10;
        String str = sdVar.f13594a;
        if (wg.f14958a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(wg.f14960c)) {
            String str2 = wg.f14959b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z10 = true;
                this.S = z10;
                mediaCodec.configure(uaVar.b(), (Surface) null, (MediaCrypto) null, 0);
            }
        }
        z10 = false;
        this.S = z10;
        mediaCodec.configure(uaVar.b(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // m4.ud, m4.ya
    public final boolean t() {
        return this.R.f() || super.t();
    }

    @Override // m4.ud
    public final void v(String str, long j3, long j10) {
        j0 j0Var = this.Q;
        ((Handler) j0Var.f16489s).post(new k(j0Var, str));
    }

    @Override // m4.ud
    public final void w(ua uaVar) {
        super.w(uaVar);
        j0 j0Var = this.Q;
        ((Handler) j0Var.f16489s).post(new l(j0Var, uaVar));
        this.T = "audio/raw".equals(uaVar.f14312x) ? uaVar.L : 2;
        this.U = uaVar.J;
    }

    @Override // m4.ud
    public final void x(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        int[] iArr = null;
        if (this.S && integer == 6) {
            int i10 = this.U;
            if (i10 < 6) {
                int[] iArr2 = new int[i10];
                for (int i11 = 0; i11 < this.U; i11++) {
                    iArr2[i11] = i11;
                }
                iArr = iArr2;
            }
            integer = 6;
        }
        try {
            this.R.b(integer, integer2, this.T, iArr);
        } catch (nb e10) {
            throw new ja(e10);
        }
    }

    @Override // m4.ud
    public final void z() {
        try {
            rb rbVar = this.R;
            if (rbVar.Q || !rbVar.n() || !rbVar.m()) {
                return;
            }
            lb lbVar = rbVar.f13221g;
            long i10 = rbVar.i();
            lbVar.f10703h = lbVar.a();
            lbVar.f10702g = SystemClock.elapsedRealtime() * 1000;
            lbVar.f10704i = i10;
            lbVar.f10696a.stop();
            rbVar.Q = true;
        } catch (qb e10) {
            throw ja.a(e10, this.f9154c);
        }
    }
}
