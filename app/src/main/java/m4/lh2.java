package m4;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import s.b;

/* loaded from: classes.dex */
public final class lh2 implements vg2 {
    public ByteBuffer A;
    public byte[] B;
    public int C;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public long K;
    public boolean L;
    public final eh2 M;

    /* renamed from: a */
    public final bh2 f10842a;

    /* renamed from: b */
    public final th2 f10843b;

    /* renamed from: c */
    public final jg2[] f10844c;

    /* renamed from: h */
    public kh2 f10849h;

    /* renamed from: k */
    public nh2 f10852k;

    /* renamed from: l */
    public dh2 f10853l;

    /* renamed from: m */
    public dh2 f10854m;

    /* renamed from: n */
    public AudioTrack f10855n;
    public fh2 p;

    /* renamed from: r */
    public long f10858r;

    /* renamed from: s */
    public long f10859s;

    /* renamed from: t */
    public boolean f10860t;

    /* renamed from: u */
    public boolean f10861u;

    /* renamed from: v */
    public long f10862v;

    /* renamed from: z */
    public ByteBuffer f10865z;

    /* renamed from: e */
    public final ConditionVariable f10846e = new ConditionVariable(true);

    /* renamed from: f */
    public final zg2 f10847f = new zg2(new hh2(this));

    /* renamed from: d */
    public final jg2[] f10845d = {new mh2()};

    /* renamed from: w */
    public float f10863w = 1.0f;

    /* renamed from: o */
    public h22 f10856o = h22.f9088b;
    public int I = 0;
    public zd2 J = new zd2();

    /* renamed from: q */
    public fh2 f10857q = new fh2(pt.f12618d, false, 0, 0);
    public int D = -1;

    /* renamed from: x */
    public jg2[] f10864x = new jg2[0];
    public ByteBuffer[] y = new ByteBuffer[0];

    /* renamed from: g */
    public final ArrayDeque<fh2> f10848g = new ArrayDeque<>();

    /* renamed from: i */
    public final gh2<sg2> f10850i = new gh2<>();

    /* renamed from: j */
    public final gh2<ug2> f10851j = new gh2<>();

    public lh2(jg2[] jg2VarArr) {
        eh2 eh2Var = new eh2(jg2VarArr);
        this.M = eh2Var;
        int i10 = ls1.f10971a;
        bh2 bh2Var = new bh2();
        this.f10842a = bh2Var;
        th2 th2Var = new th2();
        this.f10843b = th2Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ph2(), bh2Var, th2Var);
        Collections.addAll(arrayList, eh2Var.f7966a);
        this.f10844c = (jg2[]) arrayList.toArray(new jg2[0]);
    }

    public static boolean l(AudioTrack audioTrack) {
        return ls1.f10971a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final long a() {
        dh2 dh2Var = this.f10854m;
        Objects.requireNonNull(dh2Var);
        return this.f10859s / dh2Var.f7502c;
    }

    public final fh2 b() {
        fh2 fh2Var = this.p;
        return fh2Var != null ? fh2Var : !this.f10848g.isEmpty() ? this.f10848g.getLast() : this.f10857q;
    }

    public final void c(long j3) {
        pt ptVar;
        final boolean z10;
        final pg2 pg2Var;
        Handler handler;
        if (m()) {
            eh2 eh2Var = this.M;
            ptVar = b().f8554a;
            sh2 sh2Var = eh2Var.f7968c;
            float f10 = ptVar.f12619a;
            if (sh2Var.f13650c != f10) {
                sh2Var.f13650c = f10;
                sh2Var.f13656i = true;
            }
            float f11 = ptVar.f12620b;
            if (sh2Var.f13651d != f11) {
                sh2Var.f13651d = f11;
                sh2Var.f13656i = true;
            }
        } else {
            ptVar = pt.f12618d;
        }
        pt ptVar2 = ptVar;
        if (m()) {
            eh2 eh2Var2 = this.M;
            boolean z11 = b().f8555b;
            eh2Var2.f7967b.f12871j = z11;
            z10 = z11;
        } else {
            z10 = false;
        }
        this.f10848g.add(new fh2(ptVar2, z10, Math.max(0L, j3), this.f10854m.a(a())));
        jg2[] jg2VarArr = this.f10854m.f7507h;
        ArrayList arrayList = new ArrayList();
        for (jg2 jg2Var : jg2VarArr) {
            if (jg2Var.e()) {
                arrayList.add(jg2Var);
            } else {
                jg2Var.c();
            }
        }
        int size = arrayList.size();
        this.f10864x = (jg2[]) arrayList.toArray(new jg2[size]);
        this.y = new ByteBuffer[size];
        d();
        nh2 nh2Var = this.f10852k;
        if (nh2Var == null || (handler = (pg2Var = nh2Var.f11787a.R0).f12509a) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: m4.og2
            @Override // java.lang.Runnable
            public final void run() {
                pg2 pg2Var2 = pg2.this;
                boolean z12 = z10;
                qg2 qg2Var = pg2Var2.f12510b;
                int i10 = ls1.f10971a;
                qg2Var.c(z12);
            }
        });
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            jg2[] jg2VarArr = this.f10864x;
            if (i10 < jg2VarArr.length) {
                jg2 jg2Var = jg2VarArr[i10];
                jg2Var.c();
                this.y[i10] = jg2Var.a();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        if (!this.F) {
            this.F = true;
            zg2 zg2Var = this.f10847f;
            long a10 = a();
            zg2Var.f16226x = zg2Var.c();
            zg2Var.f16224v = SystemClock.elapsedRealtime() * 1000;
            zg2Var.y = a10;
            this.f10855n.stop();
        }
    }

    public final void f(long j3) {
        ByteBuffer byteBuffer;
        int length = this.f10864x.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.y[i10 - 1];
            } else {
                byteBuffer = this.f10865z;
                if (byteBuffer == null) {
                    byteBuffer = jg2.f10060a;
                }
            }
            if (i10 == length) {
                i(byteBuffer);
            } else {
                jg2 jg2Var = this.f10864x[i10];
                if (i10 > this.D) {
                    jg2Var.h(byteBuffer);
                }
                ByteBuffer a10 = jg2Var.a();
                this.y[i10] = a10;
                if (a10.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i10--;
        }
    }

    public final void g(pt ptVar, boolean z10) {
        fh2 b10 = b();
        if (!ptVar.equals(b10.f8554a) || z10 != b10.f8555b) {
            fh2 fh2Var = new fh2(ptVar, z10, -9223372036854775807L, -9223372036854775807L);
            if (k()) {
                this.p = fh2Var;
            } else {
                this.f10857q = fh2Var;
            }
        }
    }

    public final void h() {
        if (!k()) {
            return;
        }
        if (ls1.f10971a >= 21) {
            this.f10855n.setVolume(this.f10863w);
            return;
        }
        AudioTrack audioTrack = this.f10855n;
        float f10 = this.f10863w;
        audioTrack.setStereoVolume(f10, f10);
    }

    public final void i(ByteBuffer byteBuffer) {
        int i10;
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.A;
        boolean z10 = true;
        if (byteBuffer2 != null) {
            r01.f(byteBuffer2 == byteBuffer);
        } else {
            this.A = byteBuffer;
            if (ls1.f10971a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.B;
                if (bArr == null || bArr.length < remaining) {
                    this.B = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.B, 0, remaining);
                byteBuffer.position(position);
                this.C = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        int i11 = ls1.f10971a;
        if (i11 < 21) {
            zg2 zg2Var = this.f10847f;
            int c10 = zg2Var.f16208e - ((int) (this.f10859s - (zg2Var.c() * zg2Var.f16207d)));
            if (c10 > 0) {
                i10 = this.f10855n.write(this.B, this.C, Math.min(remaining2, c10));
                if (i10 > 0) {
                    this.C += i10;
                    byteBuffer.position(byteBuffer.position() + i10);
                }
            } else {
                i10 = 0;
            }
        } else {
            i10 = this.f10855n.write(byteBuffer, remaining2, 1);
        }
        this.K = SystemClock.elapsedRealtime();
        if (i10 < 0) {
            if ((i11 < 24 || i10 != -6) && i10 != -32) {
                z10 = false;
            }
            ug2 ug2Var = new ug2(i10, this.f10854m.f7500a, z10);
            nh2 nh2Var = this.f10852k;
            if (nh2Var != null) {
                nh2Var.a(ug2Var);
            }
            if (ug2Var.f14412s) {
                throw ug2Var;
            }
            this.f10851j.a(ug2Var);
            return;
        }
        this.f10851j.f8932a = null;
        if (l(this.f10855n) && this.G && this.f10852k != null && i10 < remaining2 && !this.L) {
            zg2 zg2Var2 = this.f10847f;
            long c11 = xf2.c(zg2Var2.b(-zg2Var2.c()));
            ef2 ef2Var = this.f10852k.f11787a.f12166a1;
            if (ef2Var != null) {
                ef2Var.c(c11);
            }
        }
        Objects.requireNonNull(this.f10854m);
        this.f10859s += i10;
        if (i10 != remaining2) {
            return;
        }
        this.A = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002a -> B:15:0x002f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j() {
        /*
            r10 = this;
            int r0 = r10.D
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r10.D = r2
            r0 = r10
            goto L2f
        Lb:
            r0 = r10
            r4 = r2
        Ld:
            int r5 = r0.D
            m4.jg2[] r6 = r0.f10864x
            int r7 = r6.length
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 >= r7) goto L31
            r5 = r6[r5]
            if (r4 == 0) goto L20
            r5.g()
        L20:
            r0.f(r8)
            boolean r4 = r5.f()
            if (r4 != 0) goto L2a
            return r2
        L2a:
            int r4 = r0.D
            int r4 = r4 + r1
            r0.D = r4
        L2f:
            r4 = r1
            goto Ld
        L31:
            java.nio.ByteBuffer r4 = r0.A
            if (r4 == 0) goto L3d
            r0.i(r4)
            java.nio.ByteBuffer r4 = r0.A
            if (r4 == 0) goto L3d
            return r2
        L3d:
            r0.D = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.lh2.j():boolean");
    }

    public final boolean k() {
        return this.f10855n != null;
    }

    public final boolean m() {
        if ("audio/raw".equals(this.f10854m.f7500a.f13871k)) {
            int i10 = this.f10854m.f7500a.f13884z;
            return true;
        }
        return false;
    }

    public final int n(t tVar) {
        if (!"audio/raw".equals(tVar.f13871k)) {
            int i10 = ls1.f10971a;
            return 0;
        }
        boolean g10 = ls1.g(tVar.f13884z);
        int i11 = tVar.f13884z;
        if (g10) {
            return i11 != 2 ? 1 : 2;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Invalid PCM encoding: ");
        sb.append(i11);
        Log.w("DefaultAudioSink", sb.toString());
        return 0;
    }

    public final void o(t tVar, int[] iArr) {
        int i10;
        int i11;
        if (!"audio/raw".equals(tVar.f13871k)) {
            int i12 = ls1.f10971a;
            throw new rg2("Unable to configure passthrough for: ".concat(String.valueOf(tVar)), tVar);
        }
        r01.f(ls1.g(tVar.f13884z));
        int t10 = ls1.t(tVar.f13884z, tVar.f13883x);
        jg2[] jg2VarArr = this.f10844c;
        th2 th2Var = this.f10843b;
        int i13 = tVar.A;
        int i14 = tVar.B;
        th2Var.f14057i = i13;
        th2Var.f14058j = i14;
        if (ls1.f10971a < 21 && tVar.f13883x == 8 && iArr == null) {
            int[] iArr2 = new int[6];
            for (int i15 = 0; i15 < 6; i15++) {
                iArr2[i15] = i15;
            }
            iArr = iArr2;
        }
        this.f10842a.f6537i = iArr;
        hg2 hg2Var = new hg2(tVar.y, tVar.f13883x, tVar.f13884z);
        for (jg2 jg2Var : jg2VarArr) {
            try {
                hg2 b10 = jg2Var.b(hg2Var);
                if (true == jg2Var.e()) {
                    hg2Var = b10;
                }
            } catch (ig2 e10) {
                throw new rg2(e10, tVar);
            }
        }
        int i16 = hg2Var.f9332c;
        int i17 = hg2Var.f9330a;
        int i18 = hg2Var.f9331b;
        switch (i18) {
            case 1:
                i11 = 4;
                i10 = i11;
                break;
            case 2:
                i11 = 12;
                i10 = i11;
                break;
            case 3:
                i11 = 28;
                i10 = i11;
                break;
            case 4:
                i11 = 204;
                i10 = i11;
                break;
            case 5:
                i11 = 220;
                i10 = i11;
                break;
            case 6:
                i11 = 252;
                i10 = i11;
                break;
            case 7:
                i11 = 1276;
                i10 = i11;
                break;
            case 8:
                int i19 = ls1.f10971a;
                if (i19 >= 23 || i19 >= 21) {
                    i10 = 6396;
                    break;
                }
            default:
                i10 = 0;
                break;
        }
        int t11 = ls1.t(i16, i18);
        if (i16 == 0) {
            String valueOf = String.valueOf(tVar);
            throw new rg2(b.b(new StringBuilder(valueOf.length() + 48), "Invalid output encoding (mode=0) for: ", valueOf), tVar);
        } else if (i10 == 0) {
            String valueOf2 = String.valueOf(tVar);
            throw new rg2(b.b(new StringBuilder(valueOf2.length() + 54), "Invalid output channel config (mode=0) for: ", valueOf2), tVar);
        } else {
            dh2 dh2Var = new dh2(tVar, t10, t11, i17, i10, i16, jg2VarArr);
            if (k()) {
                this.f10853l = dh2Var;
            } else {
                this.f10854m = dh2Var;
            }
        }
    }

    public final void p() {
        if (k()) {
            this.f10858r = 0L;
            this.f10859s = 0L;
            this.L = false;
            this.f10857q = new fh2(b().f8554a, b().f8555b, 0L, 0L);
            this.f10862v = 0L;
            this.p = null;
            this.f10848g.clear();
            this.f10865z = null;
            this.A = null;
            this.F = false;
            this.E = false;
            this.D = -1;
            this.f10843b.f14063o = 0L;
            d();
            AudioTrack audioTrack = this.f10847f.f16206c;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.f10855n.pause();
            }
            if (l(this.f10855n)) {
                kh2 kh2Var = this.f10849h;
                Objects.requireNonNull(kh2Var);
                kh2Var.a(this.f10855n);
            }
            AudioTrack audioTrack2 = this.f10855n;
            this.f10855n = null;
            if (ls1.f10971a < 21 && !this.H) {
                this.I = 0;
            }
            dh2 dh2Var = this.f10853l;
            if (dh2Var != null) {
                this.f10854m = dh2Var;
                this.f10853l = null;
            }
            zg2 zg2Var = this.f10847f;
            zg2Var.f16214k = 0L;
            zg2Var.f16223u = 0;
            zg2Var.f16222t = 0;
            zg2Var.f16215l = 0L;
            zg2Var.A = 0L;
            zg2Var.D = 0L;
            zg2Var.f16213j = false;
            zg2Var.f16206c = null;
            zg2Var.f16209f = null;
            this.f10846e.close();
            new ch2(this, audioTrack2).start();
        }
        this.f10851j.f8932a = null;
        this.f10850i.f8932a = null;
    }

    public final void q() {
        this.G = true;
        if (k()) {
            yg2 yg2Var = this.f10847f.f16209f;
            Objects.requireNonNull(yg2Var);
            yg2Var.a();
            this.f10855n.play();
        }
    }

    public final void r() {
        p();
        for (jg2 jg2Var : this.f10844c) {
            jg2Var.d();
        }
        jg2[] jg2VarArr = this.f10845d;
        int length = jg2VarArr.length;
        for (int i10 = 0; i10 <= 0; i10++) {
            jg2VarArr[i10].d();
        }
        this.G = false;
    }

    public final boolean s(ByteBuffer byteBuffer, long j3) {
        dh2 dh2Var;
        ByteBuffer byteBuffer2 = this.f10865z;
        r01.f(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f10853l != null) {
            if (!j()) {
                return false;
            }
            dh2 dh2Var2 = this.f10853l;
            dh2 dh2Var3 = this.f10854m;
            Objects.requireNonNull(dh2Var3);
            Objects.requireNonNull(dh2Var2);
            if (dh2Var3.f7505f == dh2Var2.f7505f && dh2Var3.f7503d == dh2Var2.f7503d && dh2Var3.f7504e == dh2Var2.f7504e && dh2Var3.f7502c == dh2Var2.f7502c) {
                this.f10854m = dh2Var2;
                this.f10853l = null;
                if (l(this.f10855n)) {
                    this.f10855n.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f10855n;
                    t tVar = this.f10854m.f7500a;
                    audioTrack.setOffloadDelayPadding(tVar.A, tVar.B);
                    this.L = true;
                }
            } else {
                e();
                if (t()) {
                    return false;
                }
                p();
            }
            c(j3);
        }
        if (!k()) {
            try {
                this.f10846e.block();
                try {
                    dh2 dh2Var4 = this.f10854m;
                    Objects.requireNonNull(dh2Var4);
                    AudioTrack b10 = dh2Var4.b(this.f10856o, this.I);
                    this.f10855n = b10;
                    if (l(b10)) {
                        AudioTrack audioTrack2 = this.f10855n;
                        if (this.f10849h == null) {
                            this.f10849h = new kh2(this);
                        }
                        kh2 kh2Var = this.f10849h;
                        final Handler handler = kh2Var.f10431a;
                        audioTrack2.registerStreamEventCallback(new Executor() { // from class: m4.ih2
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                handler.post(runnable);
                            }
                        }, kh2Var.f10432b);
                        AudioTrack audioTrack3 = this.f10855n;
                        t tVar2 = this.f10854m.f7500a;
                        audioTrack3.setOffloadDelayPadding(tVar2.A, tVar2.B);
                    }
                    this.I = this.f10855n.getAudioSessionId();
                    zg2 zg2Var = this.f10847f;
                    AudioTrack audioTrack4 = this.f10855n;
                    dh2 dh2Var5 = this.f10854m;
                    Objects.requireNonNull(dh2Var5);
                    zg2Var.a(audioTrack4, dh2Var5.f7505f, dh2Var5.f7502c, dh2Var5.f7506g);
                    h();
                    Objects.requireNonNull(this.J);
                    this.f10861u = true;
                } catch (sg2 e10) {
                    nh2 nh2Var = this.f10852k;
                    if (nh2Var != null) {
                        nh2Var.a(e10);
                    }
                    throw e10;
                }
            } catch (sg2 e11) {
                this.f10850i.a(e11);
                return false;
            }
        }
        this.f10850i.f8932a = null;
        if (this.f10861u) {
            this.f10862v = Math.max(0L, j3);
            this.f10860t = false;
            this.f10861u = false;
            c(j3);
            if (this.G) {
                q();
            }
        }
        zg2 zg2Var2 = this.f10847f;
        long a10 = a();
        AudioTrack audioTrack5 = zg2Var2.f16206c;
        Objects.requireNonNull(audioTrack5);
        int playState = audioTrack5.getPlayState();
        boolean z10 = zg2Var2.f16218o;
        boolean z11 = a10 > zg2Var2.c();
        zg2Var2.f16218o = z11;
        if (z10 && !z11 && playState != 1) {
            hh2 hh2Var = zg2Var2.f16204a;
            final int i10 = zg2Var2.f16208e;
            final long c10 = xf2.c(zg2Var2.f16211h);
            if (hh2Var.f9339a.f10852k != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                lh2 lh2Var = hh2Var.f9339a;
                long j10 = lh2Var.K;
                final pg2 pg2Var = lh2Var.f10852k.f11787a.R0;
                final long j11 = elapsedRealtime - j10;
                Handler handler2 = pg2Var.f12509a;
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: m4.kg2
                        @Override // java.lang.Runnable
                        public final void run() {
                            pg2 pg2Var2 = pg2.this;
                            int i11 = i10;
                            long j12 = c10;
                            long j13 = j11;
                            qg2 qg2Var = pg2Var2.f12510b;
                            int i12 = ls1.f10971a;
                            qg2Var.p(i11, j12, j13);
                        }
                    });
                }
            }
        }
        if (this.f10865z == null) {
            r01.f(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            Objects.requireNonNull(this.f10854m);
            if (this.p != null) {
                if (!j()) {
                    return false;
                }
                c(j3);
                this.p = null;
            }
            long j12 = this.f10862v;
            Objects.requireNonNull(this.f10854m);
            long j13 = ((((this.f10858r / dh2Var.f7501b) - this.f10843b.f14063o) * 1000000) / dh2Var.f7500a.y) + j12;
            if (!this.f10860t && Math.abs(j13 - j3) > 200000) {
                this.f10852k.a(new tg2(j3, j13));
                this.f10860t = true;
            }
            if (this.f10860t) {
                if (!j()) {
                    return false;
                }
                long j14 = j3 - j13;
                this.f10862v += j14;
                this.f10860t = false;
                c(j3);
                nh2 nh2Var2 = this.f10852k;
                if (nh2Var2 != null && j14 != 0) {
                    nh2Var2.f11787a.Y0 = true;
                }
            }
            Objects.requireNonNull(this.f10854m);
            this.f10858r += byteBuffer.remaining();
            this.f10865z = byteBuffer;
        }
        f(j3);
        if (!this.f10865z.hasRemaining()) {
            this.f10865z = null;
            return true;
        }
        zg2 zg2Var3 = this.f10847f;
        if (!(zg2Var3.f16225w != -9223372036854775807L && a() > 0 && SystemClock.elapsedRealtime() - zg2Var3.f16225w >= 200)) {
            return false;
        }
        Log.w("DefaultAudioSink", "Resetting stalled audio track");
        p();
        return true;
    }

    public final boolean t() {
        if (k()) {
            if (a() > this.f10847f.c()) {
                return true;
            }
        }
        return false;
    }
}
