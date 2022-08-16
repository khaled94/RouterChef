package m4;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;
import n3.g1;
import n3.h1;
import n3.s1;

/* loaded from: classes.dex */
public final class dc0 extends wa0 implements ng, te, mh, jb, ka {
    public static final /* synthetic */ int O = 0;
    public na A;
    public ByteBuffer B;
    public boolean C;
    public final WeakReference<fb0> D;
    public va0 E;
    public int F;
    public int G;
    public long H;
    public final String I;
    public final int J;
    @GuardedBy("httpDataSourcesLock")
    public final ArrayList<jg> L;
    public volatile xb0 M;

    /* renamed from: u */
    public final Context f7291u;

    /* renamed from: v */
    public final yb0 f7292v;

    /* renamed from: w */
    public final eh f7293w;

    /* renamed from: x */
    public final ub f7294x;
    public final qf y;

    /* renamed from: z */
    public final eb0 f7295z;
    public final Object K = new Object();
    public final Set<WeakReference<vb0>> N = new HashSet();

    public dc0(Context context, eb0 eb0Var, fb0 fb0Var) {
        this.f7291u = context;
        this.f7295z = eb0Var;
        this.D = new WeakReference<>(fb0Var);
        yb0 yb0Var = new yb0();
        this.f7292v = yb0Var;
        h1 h1Var = s1.f16555i;
        eh ehVar = new eh(context, h1Var, this);
        this.f7293w = ehVar;
        ub ubVar = new ub(h1Var, this);
        this.f7294x = ubVar;
        qf qfVar = new qf();
        this.y = qfVar;
        if (g1.c()) {
            g1.a("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        wa0.f14893s.incrementAndGet();
        int i10 = 0;
        na naVar = new na(new ya[]{ubVar, ehVar}, qfVar, yb0Var);
        this.A = naVar;
        naVar.f11586f.add(this);
        this.F = 0;
        this.H = 0L;
        this.G = 0;
        this.L = new ArrayList<>();
        this.M = null;
        this.I = (fb0Var == null || fb0Var.r() == null) ? "" : fb0Var.r();
        this.J = fb0Var != null ? fb0Var.f() : i10;
        if (((Boolean) jo.f10145d.f10148c.a(es.f8125k)).booleanValue()) {
            this.A.f11585e.Y = true;
        }
        if (fb0Var != null && fb0Var.e() > 0) {
            this.A.f11585e.Z = fb0Var.e();
        }
        if (fb0Var == null || fb0Var.d() <= 0) {
            return;
        }
        this.A.f11585e.f13559a0 = fb0Var.d();
    }

    @Override // m4.wa0
    public final void A(int i10) {
        yb0 yb0Var = this.f7292v;
        synchronized (yb0Var) {
            yb0Var.f15643b = i10 * 1000;
        }
    }

    @Override // m4.wa0
    public final void B(boolean z10) {
        na naVar = this.A;
        if (naVar.f11590j != z10) {
            naVar.f11590j = z10;
            naVar.f11585e.f13565w.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
            Iterator<ka> it = naVar.f11586f.iterator();
            while (it.hasNext()) {
                it.next().j(naVar.f11591k);
            }
        }
    }

    @Override // m4.wa0
    public final void C(boolean z10) {
        if (this.A != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                qf qfVar = this.y;
                boolean z11 = !z10;
                if (qfVar.f14398c.get(i10) != z11) {
                    qfVar.f14398c.put(i10, z11);
                    wf wfVar = qfVar.f14396a;
                    if (wfVar != null) {
                        ((sa) wfVar).f13565w.sendEmptyMessage(10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.ref.WeakReference<m4.vb0>>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashSet, java.util.Set<java.net.Socket>] */
    @Override // m4.wa0
    public final void D(int i10) {
        Iterator it = this.N.iterator();
        while (it.hasNext()) {
            vb0 vb0Var = (vb0) ((WeakReference) it.next()).get();
            if (vb0Var != null) {
                vb0Var.f14657o = i10;
                Iterator it2 = vb0Var.p.iterator();
                while (it2.hasNext()) {
                    Socket socket = (Socket) it2.next();
                    if (!socket.isClosed()) {
                        try {
                            socket.setReceiveBufferSize(vb0Var.f14657o);
                        } catch (SocketException e10) {
                            g1.k("Failed to update receive buffer size.", e10);
                        }
                    }
                }
            }
        }
    }

    @Override // m4.wa0
    public final void E(Surface surface, boolean z10) {
        na naVar = this.A;
        if (naVar == null) {
            return;
        }
        la laVar = new la(this.f7293w, 1, surface);
        if (z10) {
            naVar.a(laVar);
        } else {
            naVar.b(laVar);
        }
    }

    @Override // m4.wa0
    public final void F(float f10) {
        if (this.A == null) {
            return;
        }
        this.A.b(new la(this.f7294x, 2, Float.valueOf(f10)));
    }

    @Override // m4.wa0
    public final void G() {
        this.A.f11585e.f13565w.sendEmptyMessage(5);
    }

    @Override // m4.wa0
    public final boolean H() {
        return this.A != null;
    }

    @Override // m4.wa0
    public final int I() {
        return this.G;
    }

    @Override // m4.wa0
    public final int K() {
        return this.A.f11591k;
    }

    @Override // m4.wa0
    public final long M() {
        na naVar = this.A;
        if (naVar.f11595o.h() || naVar.f11592l > 0) {
            return naVar.f11600u;
        }
        naVar.f11595o.d(naVar.f11599t.f12451a, naVar.f11588h, false);
        return ia.b(naVar.f11599t.f12454d) + ia.b(0L);
    }

    @Override // m4.wa0
    public final long N() {
        return this.F;
    }

    @Override // m4.wa0
    public final long O() {
        if (X() && this.M.f15289m) {
            return Math.min(this.F, this.M.f15291o);
        }
        return 0L;
    }

    @Override // m4.wa0
    public final long P() {
        na naVar = this.A;
        if (naVar.f11595o.h() || naVar.f11592l > 0) {
            return naVar.f11600u;
        }
        naVar.f11595o.d(naVar.f11599t.f12451a, naVar.f11588h, false);
        return ia.b(naVar.f11599t.f12453c) + ia.b(0L);
    }

    @Override // m4.wa0
    public final long Q() {
        na naVar = this.A;
        if (naVar.f11595o.h()) {
            return -9223372036854775807L;
        }
        db dbVar = naVar.f11595o;
        naVar.c();
        return ia.b(dbVar.e(0, naVar.f11587g).f6762a);
    }

    @Override // m4.wa0
    public final long R() {
        if (!X()) {
            return this.F;
        }
        return 0L;
    }

    @Override // m4.wa0
    public final long S() {
        if (X()) {
            xb0 xb0Var = this.M;
            if (xb0Var.f15286j == null) {
                return -1L;
            }
            if (xb0Var.f15292q.get() == -1) {
                synchronized (xb0Var) {
                    if (xb0Var.p == null) {
                        xb0Var.p = u90.f14294a.Z(new wb0(xb0Var, 0));
                    }
                }
                if (xb0Var.p.isDone()) {
                    try {
                        xb0Var.f15292q.compareAndSet(-1L, xb0Var.p.get().longValue());
                    } catch (InterruptedException | ExecutionException unused) {
                        return -1L;
                    }
                }
                return xb0Var.f15292q.get();
            }
            return xb0Var.f15292q.get();
        }
        synchronized (this.K) {
            while (!this.L.isEmpty()) {
                long j3 = this.H;
                Map<String, List<String>> b10 = this.L.remove(0).b();
                long j10 = 0;
                if (b10 != null) {
                    Iterator<Map.Entry<String, List<String>>> it = b10.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, List<String>> next = it.next();
                        if (next != null) {
                            try {
                                if (next.getKey() != null && x90.n(next.getKey()) && next.getValue() != null && next.getValue().get(0) != null) {
                                    j10 = Long.parseLong(next.getValue().get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused2) {
                                continue;
                            }
                        }
                    }
                }
                this.H = j3 + j10;
            }
        }
        return this.H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (((java.lang.Boolean) r1.f10148c.a(m4.es.f8120j1)).booleanValue() == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.ye T(android.net.Uri r10, final java.lang.String r11) {
        /*
            r9 = this;
            m4.ue r8 = new m4.ue
            boolean r0 = r9.C
            if (r0 == 0) goto L22
            java.nio.ByteBuffer r0 = r9.B
            int r0 = r0.limit()
            if (r0 <= 0) goto L22
            java.nio.ByteBuffer r11 = r9.B
            int r11 = r11.limit()
            byte[] r11 = new byte[r11]
            java.nio.ByteBuffer r0 = r9.B
            r0.get(r11)
            m4.np0 r0 = new m4.np0
            r1 = 2
            r0.<init>(r11, r1)
            goto L84
        L22:
            m4.yr<java.lang.Boolean> r0 = m4.es.f8159o1
            m4.jo r1 = m4.jo.f10145d
            m4.ds r2 = r1.f10148c
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L45
            m4.yr<java.lang.Boolean> r0 = m4.es.f8120j1
            m4.ds r1 = r1.f10148c
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4d
        L45:
            m4.eb0 r0 = r9.f7295z
            boolean r0 = r0.f7765i
            if (r0 != 0) goto L4c
            goto L4d
        L4c:
            r2 = 0
        L4d:
            m4.eb0 r0 = r9.f7295z
            int r1 = r0.f7764h
            if (r1 <= 0) goto L59
            m4.ac0 r1 = new m4.ac0
            r1.<init>()
            goto L5e
        L59:
            m4.bc0 r1 = new m4.bc0
            r1.<init>()
        L5e:
            boolean r11 = r0.f7765i
            if (r11 == 0) goto L68
            t3.w r11 = new t3.w
            r11.<init>(r9, r1)
            r1 = r11
        L68:
            java.nio.ByteBuffer r11 = r9.B
            if (r11 == 0) goto L86
            int r11 = r11.limit()
            if (r11 <= 0) goto L86
            java.nio.ByteBuffer r11 = r9.B
            int r11 = r11.limit()
            byte[] r11 = new byte[r11]
            java.nio.ByteBuffer r0 = r9.B
            r0.get(r11)
            m4.zb0 r0 = new m4.zb0
            r0.<init>(r1, r11)
        L84:
            r2 = r0
            goto L87
        L86:
            r2 = r1
        L87:
            m4.yr<java.lang.Boolean> r11 = m4.es.f8118j
            m4.jo r0 = m4.jo.f10145d
            m4.ds r0 = r0.f10148c
            java.lang.Object r11 = r0.a(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L9c
            e1.h r11 = e1.h.f4359u
            goto L9e
        L9c:
            e1.i r11 = e1.i.f4364s
        L9e:
            r3 = r11
            m4.eb0 r11 = r9.f7295z
            int r4 = r11.f7766j
            n3.h1 r5 = n3.s1.f16555i
            int r7 = r11.f7762f
            r0 = r8
            r1 = r10
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.dc0.T(android.net.Uri, java.lang.String):m4.ye");
    }

    public final /* synthetic */ void U(boolean z10, long j3) {
        va0 va0Var = this.E;
        if (va0Var != null) {
            va0Var.d(z10, j3);
        }
    }

    public final void V(int i10) {
        this.F += i10;
    }

    public final void W(bg bgVar) {
        if (bgVar instanceof jg) {
            synchronized (this.K) {
                this.L.add((jg) bgVar);
            }
        } else if (!(bgVar instanceof xb0)) {
        } else {
            this.M = (xb0) bgVar;
            fb0 fb0Var = this.D.get();
            if (!((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue() || fb0Var == null || !this.M.f15287k) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("gcacheHit", String.valueOf(this.M.f15289m));
            hashMap.put("gcacheDownloaded", String.valueOf(this.M.f15290n));
            s1.f16555i.post(new cc0(fb0Var, hashMap));
        }
    }

    public final boolean X() {
        return this.M != null && this.M.f15288l;
    }

    @Override // m4.ka
    public final void a() {
    }

    @Override // m4.ka
    public final void b() {
    }

    @Override // m4.ka
    public final void d() {
    }

    @Override // m4.ka
    public final void e() {
    }

    @Override // m4.ng
    public final /* synthetic */ void f0(int i10) {
        this.F += i10;
    }

    public final void finalize() {
        wa0.f14893s.decrementAndGet();
        if (g1.c()) {
            g1.a("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m4.ng
    public final /* bridge */ /* synthetic */ void g0(Object obj, dg dgVar) {
        W(obj);
    }

    @Override // m4.ka
    public final void j(int i10) {
        va0 va0Var = this.E;
        if (va0Var != null) {
            va0Var.b(i10);
        }
    }

    @Override // m4.ka
    public final void q(ja jaVar) {
        va0 va0Var = this.E;
        if (va0Var != null) {
            va0Var.f("onPlayerError", jaVar);
        }
    }

    @Override // m4.wa0
    public final void r(Uri[] uriArr, String str) {
        s(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // m4.wa0
    public final void s(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        ye yeVar;
        if (this.A == null) {
            return;
        }
        this.B = byteBuffer;
        this.C = z10;
        int length = uriArr.length;
        if (length == 1) {
            yeVar = T(uriArr[0], str);
        } else {
            ye[] yeVarArr = new ye[length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                yeVarArr[i10] = T(uriArr[i10], str);
            }
            yeVar = new cf(yeVarArr);
        }
        na naVar = this.A;
        if (!naVar.f11595o.h() || naVar.p != null) {
            naVar.f11595o = db.f7278a;
            naVar.p = null;
            Iterator<ka> it = naVar.f11586f.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
        if (naVar.f11589i) {
            naVar.f11589i = false;
            naVar.f11596q = lf.f10745d;
            naVar.f11597r = naVar.f11583c;
            Objects.requireNonNull(naVar.f11582b);
            Iterator<ka> it2 = naVar.f11586f.iterator();
            while (it2.hasNext()) {
                it2.next().e();
            }
        }
        naVar.f11593m++;
        naVar.f11585e.f13565w.obtainMessage(0, 1, 0, yeVar).sendToTarget();
        wa0.f14894t.incrementAndGet();
    }

    @Override // m4.wa0
    public final void t() {
        na naVar = this.A;
        if (naVar != null) {
            naVar.f11586f.remove(this);
            na naVar2 = this.A;
            sa saVar = naVar2.f11585e;
            synchronized (saVar) {
                if (!saVar.I) {
                    saVar.f13565w.sendEmptyMessage(6);
                    while (!saVar.I) {
                        try {
                            saVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    saVar.f13566x.quit();
                }
            }
            naVar2.f11584d.removeCallbacksAndMessages(null);
            this.A = null;
            wa0.f14894t.decrementAndGet();
        }
    }

    @Override // m4.wa0
    public final void u(long j3) {
        na naVar = this.A;
        naVar.c();
        if (naVar.f11595o.h() || naVar.f11595o.c() > 0) {
            naVar.f11592l++;
            if (!naVar.f11595o.h()) {
                naVar.f11595o.e(0, naVar.f11587g);
                int i10 = ia.f9568a;
                long j10 = naVar.f11595o.d(0, naVar.f11588h, false).f6436c;
            }
            naVar.f11600u = j3;
            naVar.f11585e.f13565w.obtainMessage(3, new qa(naVar.f11595o, ia.a(j3))).sendToTarget();
            Iterator<ka> it = naVar.f11586f.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            return;
        }
        throw new va();
    }

    @Override // m4.wa0
    public final void v(int i10) {
        yb0 yb0Var = this.f7292v;
        synchronized (yb0Var) {
            yb0Var.f15645d = i10 * 1000;
        }
    }

    @Override // m4.wa0
    public final void x(int i10) {
        yb0 yb0Var = this.f7292v;
        synchronized (yb0Var) {
            yb0Var.f15646e = i10 * 1000;
        }
    }

    @Override // m4.wa0
    public final void y(va0 va0Var) {
        this.E = va0Var;
    }

    @Override // m4.wa0
    public final void z(int i10) {
        yb0 yb0Var = this.f7292v;
        synchronized (yb0Var) {
            yb0Var.f15644c = i10 * 1000;
        }
    }

    @Override // m4.ka
    public final void zza() {
    }
}
