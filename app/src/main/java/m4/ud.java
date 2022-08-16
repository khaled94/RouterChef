package m4;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l3.h;
import n9.d;

@TargetApi(19)
/* loaded from: classes.dex */
public abstract class ud extends ha {
    public static final byte[] P;
    public ByteBuffer[] A;
    public ByteBuffer[] B;
    public long C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public ac O;

    /* renamed from: i */
    public final vd f14362i;

    /* renamed from: j */
    public final bc f14363j;

    /* renamed from: k */
    public final bc f14364k;

    /* renamed from: l */
    public final h f14365l;

    /* renamed from: m */
    public final List<Long> f14366m;

    /* renamed from: n */
    public final MediaCodec.BufferInfo f14367n;

    /* renamed from: o */
    public ua f14368o;
    public MediaCodec p;

    /* renamed from: q */
    public sd f14369q;

    /* renamed from: r */
    public boolean f14370r;

    /* renamed from: s */
    public boolean f14371s;

    /* renamed from: t */
    public boolean f14372t;

    /* renamed from: u */
    public boolean f14373u;

    /* renamed from: v */
    public boolean f14374v;

    /* renamed from: w */
    public boolean f14375w;

    /* renamed from: x */
    public boolean f14376x;
    public boolean y;

    /* renamed from: z */
    public boolean f14377z;

    static {
        int i10 = wg.f14958a;
        byte[] bArr = new byte[38];
        for (int i11 = 0; i11 < 38; i11++) {
            int i12 = i11 + i11;
            bArr[i11] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12), 16) << 4));
        }
        P = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(int i10) {
        super(i10);
        wo2 wo2Var = vd.f14662b;
        d.i(wg.f14958a >= 16);
        this.f14362i = wo2Var;
        this.f14363j = new bc();
        this.f14364k = new bc();
        this.f14365l = new h();
        this.f14366m = new ArrayList();
        this.f14367n = new MediaCodec.BufferInfo();
        this.H = 0;
        this.I = 0;
    }

    private final void p() {
        if (this.I == 2) {
            P();
            N();
            return;
        }
        this.M = true;
        z();
    }

    public abstract boolean A(long j3, long j10, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, long j11, boolean z10);

    @Override // m4.ya
    public boolean B() {
        return this.M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03a6 A[LOOP:2: B:83:0x019d->B:186:0x03a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0433 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03a1 A[EDGE_INSN: B:251:0x03a1->B:185:0x03a1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c9  */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List<java.lang.Long>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.util.List<java.lang.Long>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List<java.lang.Long>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List<java.lang.Long>, java.util.ArrayList] */
    @Override // m4.ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(long r29, long r31) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ud.H(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0150 A[Catch: Exception -> 0x01c1, TryCatch #1 {Exception -> 0x01c1, blocks: (B:93:0x0140, B:95:0x0150, B:96:0x0155, B:97:0x015b), top: B:110:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0155 A[Catch: Exception -> 0x01c1, TryCatch #1 {Exception -> 0x01c1, blocks: (B:93:0x0140, B:95:0x0150, B:96:0x0155, B:97:0x015b), top: B:110:0x0140 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ud.N():void");
    }

    public void O() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<java.lang.Long>, java.util.ArrayList] */
    public void P() {
        this.C = -9223372036854775807L;
        this.D = -1;
        this.E = -1;
        this.F = false;
        this.f14366m.clear();
        this.A = null;
        this.B = null;
        this.f14369q = null;
        this.G = false;
        this.J = false;
        this.f14370r = false;
        this.f14371s = false;
        this.f14372t = false;
        this.f14373u = false;
        this.f14374v = false;
        this.f14376x = false;
        this.y = false;
        this.f14377z = false;
        this.K = false;
        this.H = 0;
        this.I = 0;
        this.f14363j.f6442c = null;
        MediaCodec mediaCodec = this.p;
        if (mediaCodec != null) {
            Objects.requireNonNull(this.O);
            try {
                mediaCodec.stop();
                try {
                    this.p.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.p.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    public boolean Q(boolean z10, ua uaVar, ua uaVar2) {
        return false;
    }

    public boolean R(sd sdVar) {
        return true;
    }

    @Override // m4.ha
    public void e() {
        this.f14368o = null;
        P();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<java.lang.Long>, java.util.ArrayList] */
    @Override // m4.ha
    public void j(long j3, boolean z10) {
        this.L = false;
        this.M = false;
        if (this.p != null) {
            this.C = -9223372036854775807L;
            this.D = -1;
            this.E = -1;
            this.N = true;
            this.F = false;
            this.f14366m.clear();
            this.y = false;
            this.f14377z = false;
            if (this.f14371s || ((this.f14374v && this.K) || this.I != 0)) {
                P();
                N();
            } else {
                this.p.flush();
                this.J = false;
            }
            if (!this.G || this.f14368o == null) {
                return;
            }
            this.H = 1;
        }
    }

    public abstract int n(ua uaVar);

    public sd r(ua uaVar) {
        return be.a(uaVar.f14312x, false);
    }

    public abstract void s(sd sdVar, MediaCodec mediaCodec, ua uaVar);

    @Override // m4.ya
    public boolean t() {
        boolean z10;
        if (this.f14368o != null) {
            if (this.f9158g) {
                z10 = this.f9159h;
            } else {
                re reVar = this.f9156e;
                se seVar = reVar.f13260b;
                z10 = seVar.W || (!seVar.g() && ((hf) seVar.F.valueAt(reVar.f13259a)).f9213a.b());
            }
            if (z10 || this.E >= 0) {
                return true;
            }
            if (this.C != -9223372036854775807L && SystemClock.elapsedRealtime() < this.C) {
                return true;
            }
        }
        return false;
    }

    public abstract void v(String str, long j3, long j10);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r6.C == r0.C) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(m4.ua r6) {
        /*
            r5 = this;
            m4.ua r0 = r5.f14368o
            r5.f14368o = r6
            m4.fc r6 = r6.A
            if (r0 != 0) goto La
            r1 = 0
            goto Lc
        La:
            m4.fc r1 = r0.A
        Lc:
            boolean r6 = m4.wg.h(r6, r1)
            if (r6 != 0) goto L26
            m4.ua r6 = r5.f14368o
            m4.fc r6 = r6.A
            if (r6 != 0) goto L19
            goto L26
        L19:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            m4.ja r0 = new m4.ja
            r0.<init>(r6)
            throw r0
        L26:
            android.media.MediaCodec r6 = r5.p
            r1 = 1
            if (r6 == 0) goto L53
            m4.sd r6 = r5.f14369q
            boolean r6 = r6.f13595b
            m4.ua r2 = r5.f14368o
            boolean r6 = r5.Q(r6, r0, r2)
            if (r6 == 0) goto L53
            r5.G = r1
            r5.H = r1
            boolean r6 = r5.f14372t
            r2 = 0
            if (r6 == 0) goto L4f
            m4.ua r6 = r5.f14368o
            int r3 = r6.B
            int r4 = r0.B
            if (r3 != r4) goto L4f
            int r6 = r6.C
            int r0 = r0.C
            if (r6 != r0) goto L4f
            goto L50
        L4f:
            r1 = r2
        L50:
            r5.y = r1
            return
        L53:
            boolean r6 = r5.J
            if (r6 == 0) goto L5a
            r5.I = r1
            return
        L5a:
            r5.P()
            r5.N()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ud.w(m4.ua):void");
    }

    public abstract void x(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public void z() {
    }
}
