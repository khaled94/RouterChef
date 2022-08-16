package m4;

import android.content.Context;
import android.os.Handler;
import g1.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import n3.k;

/* loaded from: classes.dex */
public final class oh2 extends si2 implements me2 {
    public final Context Q0;
    public final pg2 R0;
    public final vg2 S0;
    public int T0;
    public boolean U0;
    public t V0;
    public long W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;

    /* renamed from: a1 */
    public ef2 f12166a1;

    public oh2(Context context, Handler handler, qg2 qg2Var, vg2 vg2Var) {
        super(1, 44100.0f);
        this.Q0 = context.getApplicationContext();
        this.S0 = vg2Var;
        this.R0 = new pg2(handler, qg2Var);
        ((lh2) vg2Var).f10852k = new nh2(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025a A[Catch: Exception -> 0x0275, TRY_LEAVE, TryCatch #0 {Exception -> 0x0275, blocks: (B:85:0x022f, B:87:0x0235, B:89:0x025a), top: B:163:0x022f }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void s0() {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.oh2.s0():void");
    }

    @Override // m4.si2, m4.sz1
    public final void A(long j3, boolean z10) {
        super.A(j3, z10);
        ((lh2) this.S0).p();
        this.W0 = j3;
        this.X0 = true;
        this.Y0 = true;
    }

    @Override // m4.ff2
    public final String D() {
        return "MediaCodecAudioRenderer";
    }

    @Override // m4.sz1
    public final void E() {
        try {
            P();
            m0();
            this.O0 = null;
            if (!this.Z0) {
                return;
            }
            this.Z0 = false;
            ((lh2) this.S0).r();
        } catch (Throwable th) {
            if (this.Z0) {
                this.Z0 = false;
                ((lh2) this.S0).r();
            }
            throw th;
        }
    }

    @Override // m4.sz1
    public final void F() {
        ((lh2) this.S0).q();
    }

    @Override // m4.sz1
    public final void G() {
        s0();
        lh2 lh2Var = (lh2) this.S0;
        boolean z10 = false;
        lh2Var.G = false;
        if (lh2Var.k()) {
            zg2 zg2Var = lh2Var.f10847f;
            zg2Var.f16214k = 0L;
            zg2Var.f16223u = 0;
            zg2Var.f16222t = 0;
            zg2Var.f16215l = 0L;
            zg2Var.A = 0L;
            zg2Var.D = 0L;
            zg2Var.f16213j = false;
            if (zg2Var.f16224v == -9223372036854775807L) {
                yg2 yg2Var = zg2Var.f16209f;
                Objects.requireNonNull(yg2Var);
                yg2Var.a();
                z10 = true;
            }
            if (!z10) {
                return;
            }
            lh2Var.f10855n.pause();
        }
    }

    @Override // m4.si2, m4.ff2
    public final boolean J() {
        if (this.H0) {
            lh2 lh2Var = (lh2) this.S0;
            if (!lh2Var.k() || (lh2Var.E && !lh2Var.t())) {
                return true;
            }
        }
        return false;
    }

    @Override // m4.si2, m4.ff2
    public final boolean K() {
        return ((lh2) this.S0).t() || super.K();
    }

    @Override // m4.si2
    public final float L(float f10, t[] tVarArr) {
        int i10 = -1;
        for (t tVar : tVarArr) {
            int i11 = tVar.y;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f10;
    }

    @Override // m4.si2
    public final int M(ti2 ti2Var, t tVar) {
        if (!rp.e(tVar.f13871k)) {
            return 0;
        }
        int i10 = ls1.f10971a >= 21 ? 32 : 0;
        int i11 = tVar.D;
        boolean z10 = i11 == 0;
        if (z10) {
            if ((((lh2) this.S0).n(tVar) != 0) && (i11 == 0 || bj2.c() != null)) {
                return i10 | 12;
            }
        }
        if ("audio/raw".equals(tVar.f13871k)) {
            if (!(((lh2) this.S0).n(tVar) != 0)) {
                return 1;
            }
        }
        if (!(((lh2) this.S0).n(ls1.b(2, tVar.f13883x, tVar.y)) != 0)) {
            return 1;
        }
        List T = T(ti2Var, tVar);
        if (T.isEmpty()) {
            return 1;
        }
        if (!z10) {
            return 2;
        }
        qi2 qi2Var = (qi2) T.get(0);
        boolean c10 = qi2Var.c(tVar);
        int i12 = 8;
        if (c10 && qi2Var.d(tVar)) {
            i12 = 16;
        }
        return (true != c10 ? 3 : 4) | i12 | i10;
    }

    @Override // m4.si2
    public final h12 N(qi2 qi2Var, t tVar, t tVar2) {
        int i10;
        int i11;
        h12 a10 = qi2Var.a(tVar, tVar2);
        int i12 = a10.f9080e;
        if (u0(qi2Var, tVar2) > this.T0) {
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
        final pg2 pg2Var = this.R0;
        final t tVar = (t) lVar.f4818s;
        Handler handler = pg2Var.f12509a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: m4.mg2
                @Override // java.lang.Runnable
                public final void run() {
                    pg2 pg2Var2 = pg2.this;
                    t tVar2 = tVar;
                    h12 h12Var = O;
                    Objects.requireNonNull(pg2Var2);
                    int i10 = ls1.f10971a;
                    pg2Var2.f12510b.m(tVar2, h12Var);
                }
            });
        }
        return O;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
        if ("AXON 7 mini".equals(r0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    @Override // m4.si2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.ee0 R(m4.qi2 r9, m4.t r10, float r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.oh2.R(m4.qi2, m4.t, float):m4.ee0");
    }

    @Override // m4.si2
    public final List T(ti2 ti2Var, t tVar) {
        qi2 c10;
        String str = tVar.f13871k;
        if (str == null) {
            return Collections.emptyList();
        }
        if ((((lh2) this.S0).n(tVar) != 0) && (c10 = bj2.c()) != null) {
            return Collections.singletonList(c10);
        }
        ArrayList arrayList = new ArrayList(bj2.d(str, false, false));
        bj2.f(arrayList, new np0(tVar, 5));
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(bj2.d("audio/eac3", false, false));
            arrayList = arrayList2;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // m4.si2
    public final void U(Exception exc) {
        x90.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        pg2 pg2Var = this.R0;
        Handler handler = pg2Var.f12509a;
        if (handler != null) {
            handler.post(new n3.l(pg2Var, exc, 2));
        }
    }

    @Override // m4.si2
    public final void V(final String str, final long j3, final long j10) {
        final pg2 pg2Var = this.R0;
        Handler handler = pg2Var.f12509a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: m4.ng2
                @Override // java.lang.Runnable
                public final void run() {
                    pg2 pg2Var2 = pg2.this;
                    String str2 = str;
                    long j11 = j3;
                    long j12 = j10;
                    qg2 qg2Var = pg2Var2.f12510b;
                    int i10 = ls1.f10971a;
                    qg2Var.j(str2, j11, j12);
                }
            });
        }
    }

    @Override // m4.si2
    public final void W(String str) {
        pg2 pg2Var = this.R0;
        Handler handler = pg2Var.f12509a;
        if (handler != null) {
            handler.post(new pj(pg2Var, str, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[LOOP:0: B:28:0x0080->B:30:0x0084, LOOP_END] */
    @Override // m4.si2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(m4.t r6, android.media.MediaFormat r7) {
        /*
            r5 = this;
            m4.t r0 = r5.V0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L9
            r6 = r0
            goto L8b
        L9:
            m4.oi2 r0 = r5.U
            if (r0 != 0) goto Lf
            goto L8b
        Lf:
            java.lang.String r0 = r6.f13871k
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1a
            goto L46
        L1a:
            int r0 = m4.ls1.f10971a
            r4 = 24
            if (r0 < r4) goto L2d
            java.lang.String r0 = "pcm-encoding"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L2d
            int r0 = r7.getInteger(r0)
            goto L4a
        L2d:
            java.lang.String r0 = "v-bits-per-sample"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L3e
            int r0 = r7.getInteger(r0)
            int r0 = m4.ls1.s(r0)
            goto L4a
        L3e:
            java.lang.String r0 = r6.f13871k
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L49
        L46:
            int r0 = r6.f13884z
            goto L4a
        L49:
            r0 = 2
        L4a:
            m4.kq2 r4 = new m4.kq2
            r4.<init>()
            r4.f10542j = r3
            r4.y = r0
            int r0 = r6.A
            r4.f10556z = r0
            int r0 = r6.B
            r4.A = r0
            java.lang.String r0 = "channel-count"
            int r0 = r7.getInteger(r0)
            r4.f10554w = r0
            java.lang.String r0 = "sample-rate"
            int r7 = r7.getInteger(r0)
            r4.f10555x = r7
            m4.t r7 = new m4.t
            r7.<init>(r4)
            boolean r0 = r5.U0
            if (r0 == 0) goto L8a
            int r0 = r7.f13883x
            r3 = 6
            if (r0 != r3) goto L8a
            int r0 = r6.f13883x
            if (r0 >= r3) goto L8a
            int[] r0 = new int[r0]
            r2 = r1
        L80:
            int r3 = r6.f13883x
            if (r2 >= r3) goto L89
            r0[r2] = r2
            int r2 = r2 + 1
            goto L80
        L89:
            r2 = r0
        L8a:
            r6 = r7
        L8b:
            m4.vg2 r7 = r5.S0     // Catch: m4.rg2 -> L93
            m4.lh2 r7 = (m4.lh2) r7     // Catch: m4.rg2 -> L93
            r7.o(r6, r2)     // Catch: m4.rg2 -> L93
            return
        L93:
            r6 = move-exception
            m4.t r7 = r6.f13329s
            r0 = 5001(0x1389, float:7.008E-42)
            m4.o62 r6 = r5.v(r6, r7, r1, r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.oh2.X(m4.t, android.media.MediaFormat):void");
    }

    @Override // m4.me2
    public final void b(pt ptVar) {
        lh2 lh2Var = (lh2) this.S0;
        Objects.requireNonNull(lh2Var);
        lh2Var.g(new pt(ls1.k(ptVar.f12619a, 0.1f, 8.0f), ls1.k(ptVar.f12620b, 0.1f, 8.0f)), lh2Var.b().f8555b);
    }

    @Override // m4.me2
    public final pt c() {
        return ((lh2) this.S0).b().f8554a;
    }

    @Override // m4.si2
    public final void d0() {
        ((lh2) this.S0).f10860t = true;
    }

    @Override // m4.si2
    public final void e0(il0 il0Var) {
        if (!this.X0 || il0Var.c()) {
            return;
        }
        if (Math.abs(il0Var.f9688e - this.W0) > 500000) {
            this.W0 = il0Var.f9688e;
        }
        this.X0 = false;
    }

    @Override // m4.si2
    public final void f0() {
        try {
            lh2 lh2Var = (lh2) this.S0;
            if (lh2Var.E || !lh2Var.k() || !lh2Var.j()) {
                return;
            }
            lh2Var.e();
            lh2Var.E = true;
        } catch (ug2 e10) {
            throw v(e10, e10.f14413t, e10.f14412s, 5002);
        }
    }

    @Override // m4.si2
    public final boolean g0(long j3, long j10, oi2 oi2Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, t tVar) {
        Objects.requireNonNull(byteBuffer);
        if (this.V0 != null && (i11 & 2) != 0) {
            Objects.requireNonNull(oi2Var);
            oi2Var.d(i10, false);
            return true;
        } else if (z10) {
            if (oi2Var != null) {
                oi2Var.d(i10, false);
            }
            Objects.requireNonNull(this.J0);
            ((lh2) this.S0).f10860t = true;
            return true;
        } else {
            try {
                if (!((lh2) this.S0).s(byteBuffer, j11)) {
                    return false;
                }
                if (oi2Var != null) {
                    oi2Var.d(i10, false);
                }
                Objects.requireNonNull(this.J0);
                return true;
            } catch (sg2 e10) {
                throw v(e10, e10.f13637s, false, 5001);
            } catch (ug2 e11) {
                throw v(e11, tVar, e11.f14412s, 5002);
            }
        }
    }

    @Override // m4.sz1, m4.ff2
    public final me2 h() {
        return this;
    }

    @Override // m4.si2
    public final boolean h0(t tVar) {
        return ((lh2) this.S0).n(tVar) != 0;
    }

    @Override // m4.sz1, m4.bf2
    public final void k(int i10, Object obj) {
        if (i10 == 2) {
            vg2 vg2Var = this.S0;
            float floatValue = ((Float) obj).floatValue();
            lh2 lh2Var = (lh2) vg2Var;
            if (lh2Var.f10863w == floatValue) {
                return;
            }
            lh2Var.f10863w = floatValue;
            lh2Var.h();
        } else if (i10 == 3) {
            h22 h22Var = (h22) obj;
            lh2 lh2Var2 = (lh2) this.S0;
            if (lh2Var2.f10856o.equals(h22Var)) {
                return;
            }
            lh2Var2.f10856o = h22Var;
            lh2Var2.p();
        } else if (i10 != 6) {
            switch (i10) {
                case 9:
                    lh2 lh2Var3 = (lh2) this.S0;
                    lh2Var3.g(lh2Var3.b().f8554a, ((Boolean) obj).booleanValue());
                    return;
                case 10:
                    vg2 vg2Var2 = this.S0;
                    int intValue = ((Integer) obj).intValue();
                    lh2 lh2Var4 = (lh2) vg2Var2;
                    if (lh2Var4.I == intValue) {
                        return;
                    }
                    lh2Var4.I = intValue;
                    lh2Var4.H = intValue != 0;
                    lh2Var4.p();
                    return;
                case 11:
                    this.f12166a1 = (ef2) obj;
                    return;
                default:
                    return;
            }
        } else {
            zd2 zd2Var = (zd2) obj;
            lh2 lh2Var5 = (lh2) this.S0;
            if (lh2Var5.J.equals(zd2Var)) {
                return;
            }
            Objects.requireNonNull(zd2Var);
            if (lh2Var5.f10855n != null) {
                Objects.requireNonNull(lh2Var5.J);
            }
            lh2Var5.J = zd2Var;
        }
    }

    public final int u0(qi2 qi2Var, t tVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(qi2Var.f12883a) || (i10 = ls1.f10971a) >= 24 || (i10 == 23 && ls1.h(this.Q0))) {
            return tVar.f13872l;
        }
        return -1;
    }

    @Override // m4.si2, m4.sz1
    public final void y() {
        this.Z0 = true;
        try {
            ((lh2) this.S0).p();
            try {
                super.y();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.y();
                throw th;
            } finally {
            }
        }
    }

    @Override // m4.sz1
    public final void z(boolean z10) {
        o02 o02Var = new o02();
        this.J0 = o02Var;
        pg2 pg2Var = this.R0;
        Handler handler = pg2Var.f12509a;
        if (handler != null) {
            handler.post(new k(pg2Var, o02Var, 4));
        }
        Objects.requireNonNull(this.f13856u);
    }

    @Override // m4.me2
    public final long zza() {
        if (this.f13858w == 2) {
            s0();
        }
        return this.W0;
    }
}
