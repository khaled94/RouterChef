package m4;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.PowerManager;
import android.util.SparseBooleanArray;
import android.view.Surface;
import e.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class lf2 extends te2 {

    /* renamed from: b */
    public final ff2[] f10751b;

    /* renamed from: c */
    public final h21 f10752c = new h21();

    /* renamed from: d */
    public final be2 f10753d;

    /* renamed from: e */
    public final jf2 f10754e;

    /* renamed from: f */
    public final kf2 f10755f;

    /* renamed from: g */
    public final CopyOnWriteArraySet<fy> f10756g;

    /* renamed from: h */
    public final eg2 f10757h;

    /* renamed from: i */
    public final az1 f10758i;

    /* renamed from: j */
    public final of2 f10759j;

    /* renamed from: k */
    public AudioTrack f10760k;

    /* renamed from: l */
    public Object f10761l;

    /* renamed from: m */
    public Surface f10762m;

    /* renamed from: n */
    public int f10763n;

    /* renamed from: o */
    public int f10764o;
    public int p;

    /* renamed from: q */
    public int f10765q;

    /* renamed from: r */
    public h22 f10766r;

    /* renamed from: s */
    public float f10767s;

    /* renamed from: t */
    public boolean f10768t;

    /* renamed from: u */
    public List f10769u;

    /* renamed from: v */
    public boolean f10770v;

    /* renamed from: w */
    public boolean f10771w;

    /* renamed from: x */
    public li2 f10772x;

    public lf2(if2 if2Var) {
        int i10;
        try {
            Context applicationContext = if2Var.f9625a.getApplicationContext();
            this.f10757h = if2Var.f9631g;
            this.f10766r = if2Var.f9633i;
            this.f10763n = 1;
            this.f10768t = false;
            jf2 jf2Var = new jf2(this);
            this.f10754e = jf2Var;
            this.f10755f = new kf2();
            this.f10756g = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(if2Var.f9632h);
            this.f10751b = if2Var.f9636l.e(handler, jf2Var, jf2Var);
            this.f10767s = 1.0f;
            if (ls1.f10971a < 21) {
                AudioTrack audioTrack = this.f10760k;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f10760k.release();
                    this.f10760k = null;
                }
                if (this.f10760k == null) {
                    this.f10760k = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                i10 = this.f10760k.getAudioSessionId();
            } else {
                UUID uuid = xf2.f15321a;
                int i11 = ls1.f10971a;
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                i10 = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            this.f10765q = i10;
            this.f10769u = Collections.emptyList();
            this.f10770v = true;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {20, 21, 22, 23, 24, 25, 26, 27};
            for (int i12 = 0; i12 < 8; i12++) {
                int i13 = iArr[i12];
                r01.h(!false);
                sparseBooleanArray.append(i13, true);
            }
            r01.h(!false);
            be2 be2Var = new be2(this.f10751b, if2Var.f9627c, if2Var.f9628d, if2Var.f9629e, if2Var.f9630f, this.f10757h, if2Var.f9634j, if2Var.f9637m, if2Var.f9626b, if2Var.f9632h, this, new sw(new io2(sparseBooleanArray)));
            this.f10753d = be2Var;
            be2Var.f6488h.a(this.f10754e);
            be2Var.f6489i.add(this.f10754e);
            if2Var.f9625a.getApplicationContext();
            new eu1(handler);
            this.f10758i = new az1(if2Var.f9625a, handler, this.f10754e);
            ls1.f(null, null);
            of2 of2Var = new of2(if2Var.f9625a, handler, this.f10754e);
            this.f10759j = of2Var;
            Objects.requireNonNull(this.f10766r);
            of2Var.b();
            PowerManager powerManager = (PowerManager) if2Var.f9625a.getApplicationContext().getSystemService("power");
            WifiManager wifiManager = (WifiManager) if2Var.f9625a.getApplicationContext().getSystemService("wifi");
            this.f10772x = new li2(of2Var.a(), of2Var.f12148d.getStreamMaxVolume(of2Var.f12150f));
            r(1, 10, Integer.valueOf(this.f10765q));
            r(2, 10, Integer.valueOf(this.f10765q));
            r(1, 3, this.f10766r);
            r(2, 4, Integer.valueOf(this.f10763n));
            r(2, 5, 0);
            r(1, 9, Boolean.valueOf(this.f10768t));
            r(2, 7, this.f10755f);
            r(6, 8, this.f10755f);
            this.f10752c.b();
        } catch (Throwable th) {
            this.f10752c.b();
            throw th;
        }
    }

    public static void n(lf2 lf2Var) {
        int v10 = lf2Var.v();
        if (v10 == 2 || v10 == 3) {
            lf2Var.u();
            boolean z10 = lf2Var.f10753d.f6503x.p;
            lf2Var.o();
            lf2Var.o();
        }
    }

    public static int p(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    @Override // m4.te2
    public final int e() {
        u();
        return this.f10753d.e();
    }

    @Override // m4.te2
    public final int f() {
        u();
        return this.f10753d.f();
    }

    @Override // m4.te2
    public final int g() {
        u();
        return this.f10753d.g();
    }

    @Override // m4.te2
    public final int h() {
        u();
        return this.f10753d.h();
    }

    @Override // m4.te2
    public final long i() {
        u();
        return this.f10753d.i();
    }

    @Override // m4.te2
    public final long j() {
        u();
        return this.f10753d.j();
    }

    @Override // m4.te2
    public final long k() {
        u();
        return xf2.c(this.f10753d.f6503x.f16181r);
    }

    @Override // m4.te2
    public final z40 l() {
        u();
        return this.f10753d.f6503x.f16165a;
    }

    @Override // m4.te2
    public final boolean m() {
        u();
        return this.f10753d.m();
    }

    public final boolean o() {
        u();
        return this.f10753d.f6503x.f16176l;
    }

    public final void q(int i10, int i11) {
        if (i10 == this.f10764o && i11 == this.p) {
            return;
        }
        this.f10764o = i10;
        this.p = i11;
        eg2 eg2Var = this.f10757h;
        fg2 N = eg2Var.N();
        eg2Var.I(N, 1029, new o(N));
        Iterator<fy> it = this.f10756g.iterator();
        while (it.hasNext()) {
            it.next().z(i10, i11);
        }
    }

    public final void r(int i10, int i11, Object obj) {
        ff2[] ff2VarArr = this.f10751b;
        int length = ff2VarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            ff2 ff2Var = ff2VarArr[i12];
            if (ff2Var.a() == i10) {
                cf2 y = this.f10753d.y(ff2Var);
                r01.h(!y.f6823f);
                y.f6820c = i11;
                r01.h(!y.f6823f);
                y.f6821d = obj;
                y.b();
            }
        }
    }

    public final void s(Object obj) {
        ArrayList arrayList = new ArrayList();
        ff2[] ff2VarArr = this.f10751b;
        int length = ff2VarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            ff2 ff2Var = ff2VarArr[i10];
            if (ff2Var.a() == 2) {
                cf2 y = this.f10753d.y(ff2Var);
                r01.h(!y.f6823f);
                y.f6820c = 1;
                r01.h(true ^ y.f6823f);
                y.f6821d = obj;
                y.b();
                arrayList.add(y);
            }
        }
        Object obj2 = this.f10761l;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((cf2) it.next()).d();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.f10761l;
            Surface surface = this.f10762m;
            if (obj3 == surface) {
                surface.release();
                this.f10762m = null;
            }
        }
        this.f10761l = obj;
        if (z10) {
            this.f10753d.n(o62.b(new ke2(3), 1003));
        }
    }

    public final void t(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        be2 be2Var = this.f10753d;
        ze2 ze2Var = be2Var.f6503x;
        if (ze2Var.f16176l == z11 && ze2Var.f16177m == i12) {
            return;
        }
        be2Var.f6497r++;
        ze2 d5 = ze2Var.d(z11, i12);
        xo1 xo1Var = be2Var.f6487g.f9948z;
        Objects.requireNonNull(xo1Var);
        ho1 g10 = xo1.g();
        Handler handler = xo1Var.f15435a;
        int i13 = z11 ? 1 : 0;
        int i14 = z11 ? 1 : 0;
        g10.f9396a = handler.obtainMessage(1, i13, i12);
        g10.a();
        be2Var.u(d5, 0, i11, false, false, 5, -9223372036854775807L, -1);
    }

    public final void u() {
        h21 h21Var = this.f10752c;
        synchronized (h21Var) {
            boolean z10 = false;
            while (!h21Var.f9086s) {
                try {
                    h21Var.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f10753d.f6495o.getThread()) {
            String c10 = ls1.c("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f10753d.f6495o.getThread().getName());
            if (this.f10770v) {
                throw new IllegalStateException(c10);
            }
            x90.k("SimpleExoPlayer", c10, this.f10771w ? null : new IllegalStateException());
            this.f10771w = true;
        }
    }

    public final int v() {
        u();
        return this.f10753d.f6503x.f16169e;
    }
}
