package m4;

import android.content.Context;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.appcompat.widget.d;
import androidx.fragment.app.b1;
import e1.h;
import h2.q;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;
import m3.a;
import n3.g1;
import n3.s1;

/* loaded from: classes.dex */
public final class ld0 extends wa0 implements i01, gg2 {
    public static final /* synthetic */ int N = 0;
    public lf2 A;
    public ByteBuffer B;
    public boolean C;
    public va0 D;
    public int E;
    public int F;
    public long G;
    public final String H;
    public final int I;
    @GuardedBy("httpDataSourcesLock")
    public final ArrayList<vy0> K;
    public volatile fd0 L;

    /* renamed from: u */
    public final Context f10725u;

    /* renamed from: v */
    public final ed0 f10726v;

    /* renamed from: w */
    public final ul2 f10727w;

    /* renamed from: x */
    public final eb0 f10728x;
    public final WeakReference<fb0> y;

    /* renamed from: z */
    public final sk2 f10729z;
    public final Object J = new Object();
    public final Set<WeakReference<dd0>> M = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0106, code lost:
        if (((java.lang.Boolean) r1.f10148c.a(m4.es.f8120j1)).booleanValue() == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ld0(android.content.Context r9, m4.eb0 r10, m4.fb0 r11) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ld0.<init>(android.content.Context, m4.eb0, m4.fb0):void");
    }

    @Override // m4.wa0
    public final void A(int i10) {
        ed0 ed0Var = this.f10726v;
        synchronized (ed0Var) {
            ed0Var.f7794b = i10 * 1000;
        }
    }

    @Override // m4.wa0
    public final void B(boolean z10) {
        lf2 lf2Var = this.A;
        lf2Var.u();
        az1 az1Var = lf2Var.f10758i;
        lf2Var.v();
        int a10 = az1Var.a(z10);
        lf2Var.t(z10, a10, lf2.p(z10, a10));
    }

    @Override // m4.wa0
    public final void C(boolean z10) {
        zl2 zl2Var;
        if (this.A != null) {
            int i10 = 0;
            while (true) {
                lf2 lf2Var = this.A;
                lf2Var.u();
                int length = lf2Var.f10753d.f6484d.length;
                if (i10 >= 2) {
                    return;
                }
                ul2 ul2Var = this.f10727w;
                ql2 ql2Var = new ql2(ul2Var.f14452c.get());
                boolean z11 = !z10;
                if (ql2Var.f12923q.get(i10) != z11) {
                    if (z11) {
                        ql2Var.f12923q.put(i10, true);
                    } else {
                        ql2Var.f12923q.delete(i10);
                    }
                }
                pl2 pl2Var = new pl2(ql2Var);
                if (!ul2Var.f14452c.getAndSet(pl2Var).equals(pl2Var) && (zl2Var = ul2Var.f15837a) != null) {
                    ((je2) zl2Var).f9948z.e(10);
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.ref.WeakReference<m4.dd0>>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashSet, java.util.Set<java.net.Socket>] */
    @Override // m4.wa0
    public final void D(int i10) {
        Iterator it = this.M.iterator();
        while (it.hasNext()) {
            dd0 dd0Var = (dd0) ((WeakReference) it.next()).get();
            if (dd0Var != null) {
                dd0Var.f7327s = i10;
                Iterator it2 = dd0Var.f7328t.iterator();
                while (it2.hasNext()) {
                    Socket socket = (Socket) it2.next();
                    if (!socket.isClosed()) {
                        try {
                            socket.setReceiveBufferSize(dd0Var.f7327s);
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
        lf2 lf2Var = this.A;
        if (lf2Var == null) {
            return;
        }
        lf2Var.u();
        lf2Var.s(surface);
        int i10 = surface == null ? 0 : -1;
        lf2Var.q(i10, i10);
    }

    @Override // m4.wa0
    public final void F(float f10) {
        lf2 lf2Var = this.A;
        if (lf2Var == null) {
            return;
        }
        lf2Var.u();
        float k10 = ls1.k(f10, 0.0f, 1.0f);
        if (lf2Var.f10767s == k10) {
            return;
        }
        lf2Var.f10767s = k10;
        lf2Var.r(1, 2, Float.valueOf(lf2Var.f10758i.f6305e * k10));
        eg2 eg2Var = lf2Var.f10757h;
        fg2 N2 = eg2Var.N();
        eg2Var.I(N2, 1019, new tf2(N2, k10));
        Iterator<fy> it = lf2Var.f10756g.iterator();
        while (it.hasNext()) {
            it.next().x(k10);
        }
    }

    @Override // m4.wa0
    public final void G() {
        lf2 lf2Var = this.A;
        lf2Var.u();
        lf2Var.f10758i.a(lf2Var.o());
        lf2Var.f10753d.n(null);
        lf2Var.f10769u = Collections.emptyList();
    }

    @Override // m4.wa0
    public final boolean H() {
        return this.A != null;
    }

    @Override // m4.wa0
    public final int I() {
        return this.F;
    }

    @Override // m4.wa0
    public final int K() {
        return this.A.v();
    }

    @Override // m4.wa0
    public final long M() {
        long j3;
        lf2 lf2Var = this.A;
        lf2Var.u();
        be2 be2Var = lf2Var.f10753d;
        if (be2Var.m()) {
            ze2 ze2Var = be2Var.f6503x;
            if (!ze2Var.f16175k.equals(ze2Var.f16166b)) {
                return be2Var.x();
            }
            j3 = be2Var.f6503x.f16180q;
        } else if (be2Var.f6503x.f16165a.o()) {
            return be2Var.f6504z;
        } else {
            ze2 ze2Var2 = be2Var.f6503x;
            long j10 = 0;
            if (ze2Var2.f16175k.f8976d == ze2Var2.f16166b.f8976d) {
                long j11 = ze2Var2.f16180q;
                if (be2Var.f6503x.f16175k.a()) {
                    ze2 ze2Var3 = be2Var.f6503x;
                    ze2Var3.f16165a.n(ze2Var3.f16175k.f8973a, be2Var.f6490j).c(be2Var.f6503x.f16175k.f8974b);
                } else {
                    j10 = j11;
                }
                ze2 ze2Var4 = be2Var.f6503x;
                be2Var.r(ze2Var4.f16165a, ze2Var4.f16175k, j10);
                return xf2.c(j10);
            }
            j3 = ze2Var2.f16165a.e(be2Var.g(), be2Var.f14039a, 0L).f9845k;
        }
        return xf2.c(j3);
    }

    @Override // m4.wa0
    public final long N() {
        return this.E;
    }

    @Override // m4.wa0
    public final long O() {
        if (V() && this.L.p) {
            return Math.min(this.E, this.L.f8423r);
        }
        return 0L;
    }

    @Override // m4.wa0
    public final long P() {
        return this.A.j();
    }

    @Override // m4.wa0
    public final long Q() {
        lf2 lf2Var = this.A;
        lf2Var.u();
        return lf2Var.f10753d.x();
    }

    @Override // m4.wa0
    public final long R() {
        if (!V()) {
            return this.E;
        }
        return 0L;
    }

    @Override // m4.wa0
    public final long S() {
        if (V()) {
            fd0 fd0Var = this.L;
            if (fd0Var.f8419m == null) {
                return -1L;
            }
            if (fd0Var.f8425t.get() == -1) {
                synchronized (fd0Var) {
                    if (fd0Var.f8424s == null) {
                        fd0Var.f8424s = u90.f14294a.Z(new q(fd0Var, 1));
                    }
                }
                if (fd0Var.f8424s.isDone()) {
                    try {
                        fd0Var.f8425t.compareAndSet(-1L, fd0Var.f8424s.get().longValue());
                    } catch (InterruptedException | ExecutionException unused) {
                        return -1L;
                    }
                }
                return fd0Var.f8425t.get();
            }
            return fd0Var.f8425t.get();
        }
        synchronized (this.J) {
            while (!this.K.isEmpty()) {
                long j3 = this.G;
                Map<String, List<String>> zza = this.K.remove(0).zza();
                long j10 = 0;
                if (zza != null) {
                    Iterator<Map.Entry<String, List<String>>> it = zza.entrySet().iterator();
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
                this.G = j3 + j10;
            }
        }
        return this.G;
    }

    public final xj2 T(Uri uri) {
        a aVar = new a();
        pu1 pu1Var = gw1.f9058t;
        fg fgVar = uri != null ? new fg(uri, Collections.emptyList(), gx1.f9060w) : null;
        j7 j7Var = new j7(aVar, null);
        sc scVar = new sc();
        lm lmVar = lm.f10918s;
        gi giVar = new gi("", j7Var, fgVar, scVar);
        sk2 sk2Var = this.f10729z;
        sk2Var.f13723b = this.f10728x.f7762f;
        Objects.requireNonNull(giVar.f8935b);
        return new tk2(giVar, sk2Var.f13722a, sk2Var.f13724c, sk2Var.f13725d, sk2Var.f13723b);
    }

    public final /* synthetic */ void U(boolean z10, long j3) {
        va0 va0Var = this.D;
        if (va0Var != null) {
            va0Var.d(z10, j3);
        }
    }

    public final boolean V() {
        return this.L != null && this.L.f8421o;
    }

    @Override // m4.i01
    public final void c() {
    }

    @Override // m4.gg2
    public final void f(t tVar) {
        fb0 fb0Var = this.y.get();
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue() || fb0Var == null || tVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(tVar.f13877r));
        hashMap.put("bitRate", String.valueOf(tVar.f13867g));
        int i10 = tVar.p;
        int i11 = tVar.f13876q;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i10);
        sb.append("x");
        sb.append(i11);
        hashMap.put("resolution", sb.toString());
        hashMap.put("videoMime", tVar.f13870j);
        hashMap.put("videoSampleMime", tVar.f13871k);
        hashMap.put("videoCodec", tVar.f13868h);
        fb0Var.a("onMetadataEvent", hashMap);
    }

    public final void finalize() {
        wa0.f14893s.decrementAndGet();
        if (g1.c()) {
            g1.a("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // m4.gg2
    public final void g(sg0 sg0Var) {
        va0 va0Var = this.D;
        if (va0Var != null) {
            va0Var.e(sg0Var.f13628a, sg0Var.f13629b);
        }
    }

    @Override // m4.i01
    public final void h(kq0 kq0Var, gs0 gs0Var, boolean z10) {
        if (kq0Var instanceof vy0) {
            synchronized (this.J) {
                this.K.add((vy0) kq0Var);
            }
        } else if (!(kq0Var instanceof fd0)) {
        } else {
            this.L = (fd0) kq0Var;
            fb0 fb0Var = this.y.get();
            if (!((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue() || fb0Var == null || !this.L.f8420n) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("gcacheHit", String.valueOf(this.L.p));
            hashMap.put("gcacheDownloaded", String.valueOf(this.L.f8422q));
            s1.f16555i.post(new kd0(fb0Var, hashMap, 0));
        }
    }

    @Override // m4.gg2
    public final void i() {
        va0 va0Var = this.D;
        if (va0Var != null) {
            va0Var.q();
        }
    }

    @Override // m4.i01
    public final void k(gs0 gs0Var, boolean z10, int i10) {
        this.E += i10;
    }

    @Override // m4.gg2
    public final void l(IOException iOException) {
        va0 va0Var = this.D;
        if (va0Var != null) {
            if (this.f10728x.f7767k) {
                va0Var.c(iOException);
            } else {
                va0Var.f("onLoadError", iOException);
            }
        }
    }

    @Override // m4.i01
    public final void m(gs0 gs0Var, boolean z10) {
    }

    @Override // m4.gg2
    public final void n(xr xrVar) {
        va0 va0Var = this.D;
        if (va0Var != null) {
            va0Var.f("onPlayerError", xrVar);
        }
    }

    @Override // m4.gg2
    public final void o(int i10) {
        va0 va0Var = this.D;
        if (va0Var != null) {
            va0Var.b(i10);
        }
    }

    @Override // m4.gg2
    public final void p(t tVar) {
        fb0 fb0Var = this.y.get();
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue() || fb0Var == null || tVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", tVar.f13870j);
        hashMap.put("audioSampleMime", tVar.f13871k);
        hashMap.put("audioCodec", tVar.f13868h);
        fb0Var.a("onMetadataEvent", hashMap);
    }

    @Override // m4.wa0
    public final void r(Uri[] uriArr, String str) {
        s(uriArr, str, ByteBuffer.allocate(0), false);
    }

    /* JADX WARN: Type inference failed for: r2v31, types: [java.util.List<m4.ae2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List<m4.ae2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List<m4.ae2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List<m4.ae2>, java.util.ArrayList] */
    @Override // m4.wa0
    public final void s(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        xj2 xj2Var;
        if (this.A == null) {
            return;
        }
        this.B = byteBuffer;
        this.C = z10;
        int length = uriArr.length;
        if (length == 1) {
            xj2Var = T(uriArr[0]);
        } else {
            xj2[] xj2VarArr = new xj2[length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                xj2VarArr[i10] = T(uriArr[i10]);
            }
            xj2Var = new kk2(xj2VarArr);
        }
        lf2 lf2Var = this.A;
        lf2Var.u();
        be2 be2Var = lf2Var.f10753d;
        List singletonList = Collections.singletonList(xj2Var);
        be2Var.o();
        be2Var.j();
        be2Var.f6497r++;
        if (!be2Var.f6491k.isEmpty()) {
            int size = be2Var.f6491k.size();
            for (int i11 = size - 1; i11 >= 0; i11--) {
                be2Var.f6491k.remove(i11);
            }
            bl2 bl2Var = be2Var.B;
            int[] iArr = new int[bl2Var.f6566b.length - size];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int[] iArr2 = bl2Var.f6566b;
                if (i12 >= iArr2.length) {
                    break;
                }
                int i14 = iArr2[i12];
                if (i14 < 0 || i14 >= size) {
                    int i15 = i12 - i13;
                    if (i14 >= 0) {
                        i14 -= size;
                    }
                    iArr[i15] = i14;
                } else {
                    i13++;
                }
                i12++;
            }
            be2Var.B = new bl2(iArr, new Random(bl2Var.f6565a.nextLong()));
        }
        ArrayList arrayList = new ArrayList();
        for (int i16 = 0; i16 < singletonList.size(); i16++) {
            we2 we2Var = new we2((xj2) singletonList.get(i16), be2Var.f6492l);
            arrayList.add(we2Var);
            be2Var.f6491k.add(i16, new ae2(we2Var.f14948b, we2Var.f14947a.f13376n));
        }
        bl2 a10 = be2Var.B.a(arrayList.size());
        be2Var.B = a10;
        df2 df2Var = new df2(be2Var.f6491k, a10);
        if (!df2Var.o() && df2Var.f7357d < 0) {
            throw new q0();
        }
        int g10 = df2Var.g(false);
        ze2 t10 = be2Var.t(be2Var.f6503x, df2Var, be2Var.s(df2Var, g10, -9223372036854775807L));
        int i17 = t10.f16169e;
        if (g10 != -1 && i17 != 1) {
            i17 = (df2Var.o() || g10 >= df2Var.f7357d) ? 4 : 2;
        }
        ze2 f10 = t10.f(i17);
        ((ho1) be2Var.f6487g.f9948z.b(17, new ee2(arrayList, be2Var.B, g10, xf2.b(-9223372036854775807L)))).a();
        be2Var.u(f10, 0, 1, false, !be2Var.f6503x.f16166b.f8973a.equals(f10.f16166b.f8973a) && !be2Var.f6503x.f16165a.o(), 4, be2Var.p(f10), -1);
        lf2 lf2Var2 = this.A;
        lf2Var2.u();
        boolean o10 = lf2Var2.o();
        int a11 = lf2Var2.f10758i.a(o10);
        lf2Var2.t(o10, a11, lf2.p(o10, a11));
        be2 be2Var2 = lf2Var2.f10753d;
        ze2 ze2Var = be2Var2.f6503x;
        if (ze2Var.f16169e == 1) {
            ze2 e10 = ze2Var.e(null);
            ze2 f11 = e10.f(true != e10.f16165a.o() ? 2 : 4);
            be2Var2.f6497r++;
            ((ho1) be2Var2.f6487g.f9948z.a(0)).a();
            be2Var2.u(f11, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
        wa0.f14894t.incrementAndGet();
    }

    @Override // m4.wa0
    public final void t() {
        String str;
        boolean z10;
        AudioTrack audioTrack;
        lf2 lf2Var = this.A;
        if (lf2Var != null) {
            ec1<gg2> ec1Var = lf2Var.f10757h.f7898w;
            Iterator<nb1<gg2>> it = ec1Var.f7783d.iterator();
            while (it.hasNext()) {
                nb1<gg2> next = it.next();
                if (next.f11621a.equals(this)) {
                    sa1<gg2> sa1Var = ec1Var.f7782c;
                    next.f11624d = true;
                    if (next.f11623c) {
                        sa1Var.b(next.f11621a, next.f11622b.b());
                    }
                    ec1Var.f7783d.remove(next);
                }
            }
            lf2 lf2Var2 = this.A;
            lf2Var2.u();
            if (ls1.f10971a < 21 && (audioTrack = lf2Var2.f10760k) != null) {
                audioTrack.release();
                lf2Var2.f10760k = null;
            }
            of2 of2Var = lf2Var2.f10759j;
            nf2 nf2Var = of2Var.f12149e;
            if (nf2Var != null) {
                try {
                    of2Var.f12145a.unregisterReceiver(nf2Var);
                } catch (RuntimeException e10) {
                    x90.k("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
                }
                of2Var.f12149e = null;
            }
            az1 az1Var = lf2Var2.f10758i;
            az1Var.f6303c = null;
            az1Var.b();
            be2 be2Var = lf2Var2.f10753d;
            Objects.requireNonNull(be2Var);
            String hexString = Integer.toHexString(System.identityHashCode(be2Var));
            String str2 = ls1.f10975e;
            String str3 = em2.f8012a;
            synchronized (em2.class) {
                str = em2.f8012a;
            }
            StringBuilder sb = new StringBuilder(d.a(String.valueOf(hexString).length(), 36, String.valueOf(str2).length(), String.valueOf(str).length()));
            b1.b(sb, "Release ", hexString, " [ExoPlayerLib/2.15.1] [", str2);
            sb.append("] [");
            sb.append(str);
            sb.append("]");
            Log.i("ExoPlayerImpl", sb.toString());
            je2 je2Var = be2Var.f6487g;
            synchronized (je2Var) {
                if (!je2Var.N && je2Var.A.isAlive()) {
                    je2Var.f9948z.e(7);
                    synchronized (je2Var) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
                        boolean z11 = false;
                        for (long j3 = 500; !Boolean.valueOf(je2Var.N).booleanValue() && j3 > 0; j3 = elapsedRealtime - SystemClock.elapsedRealtime()) {
                            try {
                                je2Var.wait(j3);
                            } catch (InterruptedException unused) {
                                z11 = true;
                            }
                        }
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                        z10 = je2Var.N;
                    }
                }
                z10 = true;
            }
            if (!z10) {
                ec1<rx> ec1Var2 = be2Var.f6488h;
                ec1Var2.c(10, h.f4361w);
                ec1Var2.b();
            }
            be2Var.f6488h.d();
            be2Var.f6486f.f15435a.removeCallbacksAndMessages(null);
            eg2 eg2Var = be2Var.f6494n;
            if (eg2Var != null) {
                ((rm2) be2Var.p).f13396t.a(eg2Var);
            }
            ze2 f10 = be2Var.f6503x.f(1);
            be2Var.f6503x = f10;
            ze2 a10 = f10.a(f10.f16166b);
            be2Var.f6503x = a10;
            a10.f16180q = a10.f16182s;
            be2Var.f6503x.f16181r = 0L;
            eg2 eg2Var2 = lf2Var2.f10757h;
            xo1 xo1Var = eg2Var2.y;
            r01.d(xo1Var);
            xo1Var.d(new ir1(eg2Var2, 1));
            Surface surface = lf2Var2.f10762m;
            if (surface != null) {
                surface.release();
                lf2Var2.f10762m = null;
            }
            lf2Var2.f10769u = Collections.emptyList();
            this.A = null;
            wa0.f14894t.decrementAndGet();
        }
    }

    @Override // m4.wa0
    public final void u(long j3) {
        lf2 lf2Var = this.A;
        int g10 = lf2Var.g();
        lf2Var.u();
        eg2 eg2Var = lf2Var.f10757h;
        if (!eg2Var.f7900z) {
            fg2 G = eg2Var.G();
            eg2Var.f7900z = true;
            eg2Var.I(G, -1, new pf2(0));
        }
        lf2Var.f10753d.w(g10, j3);
    }

    @Override // m4.wa0
    public final void v(int i10) {
        ed0 ed0Var = this.f10726v;
        synchronized (ed0Var) {
            ed0Var.f7796d = i10 * 1000;
        }
    }

    @Override // m4.gg2
    public final void w(int i10) {
        this.F += i10;
    }

    @Override // m4.wa0
    public final void x(int i10) {
        ed0 ed0Var = this.f10726v;
        synchronized (ed0Var) {
            ed0Var.f7797e = i10 * 1000;
        }
    }

    @Override // m4.wa0
    public final void y(va0 va0Var) {
        this.D = va0Var;
    }

    @Override // m4.wa0
    public final void z(int i10) {
        ed0 ed0Var = this.f10726v;
        synchronized (ed0Var) {
            ed0Var.f7795c = i10 * 1000;
        }
    }
}
