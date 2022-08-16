package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import androidx.fragment.app.b1;
import i4.b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import l3.s;
import m3.h;
import n3.g1;
import n3.s1;

@TargetApi(16)
/* loaded from: classes.dex */
public final class sb0 extends pa0 implements TextureView.SurfaceTextureListener, va0 {
    public String A;
    public String[] B;
    public boolean C;
    public int D = 1;
    public db0 E;
    public final boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public float K;

    /* renamed from: u */
    public final fb0 f13578u;

    /* renamed from: v */
    public final gb0 f13579v;

    /* renamed from: w */
    public final eb0 f13580w;

    /* renamed from: x */
    public oa0 f13581x;
    public Surface y;

    /* renamed from: z */
    public wa0 f13582z;

    public sb0(Context context, gb0 gb0Var, fb0 fb0Var, boolean z10, boolean z11, eb0 eb0Var) {
        super(context);
        this.f13578u = fb0Var;
        this.f13579v = gb0Var;
        this.F = z10;
        this.f13580w = eb0Var;
        setSurfaceTextureListener(this);
        gb0Var.a(this);
    }

    public static String F(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        b1.b(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // m4.pa0
    public final void A(int i10) {
        wa0 wa0Var = this.f13582z;
        if (wa0Var != null) {
            wa0Var.x(i10);
        }
    }

    @Override // m4.pa0
    public final void B(int i10) {
        wa0 wa0Var = this.f13582z;
        if (wa0Var != null) {
            wa0Var.z(i10);
        }
    }

    @Override // m4.pa0
    public final void C(int i10) {
        wa0 wa0Var = this.f13582z;
        if (wa0Var != null) {
            wa0Var.A(i10);
        }
    }

    public final wa0 D() {
        return this.f13580w.f7768l ? new ld0(this.f13578u.getContext(), this.f13580w, this.f13578u) : new dc0(this.f13578u.getContext(), this.f13580w, this.f13578u);
    }

    public final String E() {
        return s.B.f5789c.D(this.f13578u.getContext(), this.f13578u.m().f12051s);
    }

    public final void G() {
        if (this.G) {
            return;
        }
        this.G = true;
        s1.f16555i.post(new h(this, 2));
        j();
        this.f13579v.b();
        if (!this.H) {
            return;
        }
        t();
    }

    public final void H(boolean z10) {
        String str;
        if ((this.f13582z != null && !z10) || this.A == null || this.y == null) {
            return;
        }
        if (z10) {
            if (!O()) {
                str = "No valid ExoPlayerAdapter exists when switch source.";
                g1.j(str);
                return;
            }
            this.f13582z.G();
            J();
        }
        if (this.A.startsWith("cache:")) {
            uc0 s10 = this.f13578u.s(this.A);
            if (s10 instanceof bd0) {
                bd0 bd0Var = (bd0) s10;
                synchronized (bd0Var) {
                    bd0Var.y = true;
                    bd0Var.notify();
                }
                bd0Var.f6452v.y(null);
                wa0 wa0Var = bd0Var.f6452v;
                bd0Var.f6452v = null;
                this.f13582z = wa0Var;
                if (!wa0Var.H()) {
                    str = "Precached video player has been released.";
                    g1.j(str);
                    return;
                }
            } else if (s10 instanceof zc0) {
                zc0 zc0Var = (zc0) s10;
                String E = E();
                synchronized (zc0Var.C) {
                    ByteBuffer byteBuffer = zc0Var.A;
                    if (byteBuffer != null && !zc0Var.B) {
                        byteBuffer.flip();
                        zc0Var.B = true;
                    }
                    zc0Var.f16146x = true;
                }
                ByteBuffer byteBuffer2 = zc0Var.A;
                boolean z11 = zc0Var.F;
                String str2 = zc0Var.f16144v;
                if (str2 == null) {
                    str = "Stream cache URL is null.";
                    g1.j(str);
                    return;
                }
                wa0 D = D();
                this.f13582z = D;
                D.s(new Uri[]{Uri.parse(str2)}, E, byteBuffer2, z11);
            } else {
                String valueOf = String.valueOf(this.A);
                g1.j(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                return;
            }
        } else {
            this.f13582z = D();
            String E2 = E();
            Uri[] uriArr = new Uri[this.B.length];
            int i10 = 0;
            while (true) {
                String[] strArr = this.B;
                if (i10 >= strArr.length) {
                    break;
                }
                uriArr[i10] = Uri.parse(strArr[i10]);
                i10++;
            }
            this.f13582z.r(uriArr, E2);
        }
        this.f13582z.y(this);
        L(this.y, false);
        if (!this.f13582z.H()) {
            return;
        }
        int K = this.f13582z.K();
        this.D = K;
        if (K != 3) {
            return;
        }
        G();
    }

    public final void I() {
        wa0 wa0Var = this.f13582z;
        if (wa0Var != null) {
            wa0Var.C(false);
        }
    }

    public final void J() {
        if (this.f13582z != null) {
            L(null, true);
            wa0 wa0Var = this.f13582z;
            if (wa0Var != null) {
                wa0Var.y(null);
                this.f13582z.t();
                this.f13582z = null;
            }
            this.D = 1;
            this.C = false;
            this.G = false;
            this.H = false;
        }
    }

    public final void K(float f10) {
        wa0 wa0Var = this.f13582z;
        if (wa0Var == null) {
            g1.j("Trying to set volume before player is initialized.");
            return;
        }
        try {
            wa0Var.F(f10);
        } catch (IOException e10) {
            g1.k("", e10);
        }
    }

    public final void L(Surface surface, boolean z10) {
        wa0 wa0Var = this.f13582z;
        if (wa0Var == null) {
            g1.j("Trying to set surface before player is initialized.");
            return;
        }
        try {
            wa0Var.E(surface, z10);
        } catch (IOException e10) {
            g1.k("", e10);
        }
    }

    public final void M() {
        int i10 = this.I;
        int i11 = this.J;
        float f10 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.K != f10) {
            this.K = f10;
            requestLayout();
        }
    }

    public final boolean N() {
        return O() && this.D != 1;
    }

    public final boolean O() {
        wa0 wa0Var = this.f13582z;
        return wa0Var != null && wa0Var.H() && !this.C;
    }

    @Override // m4.pa0
    public final void a(int i10) {
        wa0 wa0Var = this.f13582z;
        if (wa0Var != null) {
            wa0Var.D(i10);
        }
    }

    @Override // m4.va0
    public final void b(int i10) {
        if (this.D != i10) {
            this.D = i10;
            if (i10 == 3) {
                G();
            } else if (i10 != 4) {
            } else {
                if (this.f13580w.f7757a) {
                    I();
                }
                this.f13579v.f8810m = false;
                this.f12456t.a();
                s1.f16555i.post(new kb0(this, 0));
            }
        }
    }

    @Override // m4.va0
    public final void c(Exception exc) {
        String F = F("onLoadException", exc);
        g1.j(F.length() != 0 ? "ExoPlayerAdapter exception: ".concat(F) : new String("ExoPlayerAdapter exception: "));
        s.B.f5793g.f(exc, "AdExoPlayerView.onException");
        s1.f16555i.post(new pe(this, F, 1, null));
    }

    @Override // m4.va0
    public final void d(final boolean z10, final long j3) {
        if (this.f13578u != null) {
            u90.f14298e.execute(new Runnable() { // from class: m4.lb0
                @Override // java.lang.Runnable
                public final void run() {
                    sb0 sb0Var = sb0.this;
                    sb0Var.f13578u.d0(z10, j3);
                }
            });
        }
    }

    @Override // m4.va0
    public final void e(int i10, int i11) {
        this.I = i10;
        this.J = i11;
        M();
    }

    @Override // m4.va0
    public final void f(String str, Exception exc) {
        String F = F(str, exc);
        g1.j(F.length() != 0 ? "ExoPlayerAdapter error: ".concat(F) : new String("ExoPlayerAdapter error: "));
        this.C = true;
        if (this.f13580w.f7757a) {
            I();
        }
        s1.f16555i.post(new rb0(this, F, 0));
        s.B.f5793g.f(exc, "AdExoPlayerView.onError");
    }

    @Override // m4.pa0
    public final void g(String str, String[] strArr) {
        if (str == null) {
            return;
        }
        boolean z10 = true;
        if (strArr == null) {
            this.B = new String[]{str};
        } else {
            this.B = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.A;
        if (!this.f13580w.f7769m || str2 == null || str.equals(str2) || this.D != 4) {
            z10 = false;
        }
        this.A = str;
        H(z10);
    }

    @Override // m4.pa0
    public final int h() {
        if (N()) {
            return (int) this.f13582z.P();
        }
        return 0;
    }

    @Override // m4.pa0
    public final int i() {
        wa0 wa0Var = this.f13582z;
        if (wa0Var != null) {
            return wa0Var.I();
        }
        return -1;
    }

    @Override // m4.pa0, m4.ib0
    public final void j() {
        jb0 jb0Var = this.f12456t;
        float f10 = 0.0f;
        float f11 = jb0Var.f9895e ? 0.0f : jb0Var.f9896f;
        if (jb0Var.f9893c) {
            f10 = f11;
        }
        K(f10);
    }

    @Override // m4.pa0
    public final int k() {
        if (N()) {
            return (int) this.f13582z.Q();
        }
        return 0;
    }

    @Override // m4.pa0
    public final int l() {
        return this.J;
    }

    @Override // m4.pa0
    public final int m() {
        return this.I;
    }

    @Override // m4.pa0
    public final long n() {
        wa0 wa0Var = this.f13582z;
        if (wa0Var != null) {
            return wa0Var.O();
        }
        return -1L;
    }

    @Override // m4.pa0
    public final long o() {
        wa0 wa0Var = this.f13582z;
        if (wa0Var != null) {
            return wa0Var.R();
        }
        return -1L;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.K;
        if (f10 != 0.0f && this.E == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        db0 db0Var = this.E;
        if (db0Var != null) {
            db0Var.a(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        wa0 wa0Var;
        SurfaceTexture surfaceTexture2;
        if (this.F) {
            db0 db0Var = new db0(getContext());
            this.E = db0Var;
            db0Var.E = i10;
            db0Var.D = i11;
            db0Var.G = surfaceTexture;
            db0Var.start();
            db0 db0Var2 = this.E;
            if (db0Var2.G == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    db0Var2.L.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = db0Var2.F;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.E.b();
                this.E = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.y = surface;
        if (this.f13582z == null) {
            H(false);
        } else {
            L(surface, true);
            if (!this.f13580w.f7757a && (wa0Var = this.f13582z) != null) {
                wa0Var.C(true);
            }
        }
        if (this.I == 0 || this.J == 0) {
            float f10 = i11 > 0 ? i10 / i11 : 1.0f;
            if (this.K != f10) {
                this.K = f10;
                requestLayout();
            }
        } else {
            M();
        }
        s1.f16555i.post(new nb0(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        s();
        db0 db0Var = this.E;
        if (db0Var != null) {
            db0Var.b();
            this.E = null;
        }
        if (this.f13582z != null) {
            I();
            Surface surface = this.y;
            if (surface != null) {
                surface.release();
            }
            this.y = null;
            L(null, true);
        }
        s1.f16555i.post(new oh(this, 1));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i10, final int i11) {
        db0 db0Var = this.E;
        if (db0Var != null) {
            db0Var.a(i10, i11);
        }
        s1.f16555i.post(new Runnable() { // from class: m4.qb0
            @Override // java.lang.Runnable
            public final void run() {
                sb0 sb0Var = sb0.this;
                int i12 = i10;
                int i13 = i11;
                oa0 oa0Var = sb0Var.f13581x;
                if (oa0Var != null) {
                    ((ta0) oa0Var).i(i12, i13);
                }
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f13579v.e(this);
        this.f12455s.a(surfaceTexture, this.f13581x);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i10) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i10);
        g1.a(sb.toString());
        s1.f16555i.post(new Runnable() { // from class: m4.pb0
            @Override // java.lang.Runnable
            public final void run() {
                sb0 sb0Var = sb0.this;
                int i11 = i10;
                oa0 oa0Var = sb0Var.f13581x;
                if (oa0Var != null) {
                    ((ta0) oa0Var).onWindowVisibilityChanged(i11);
                }
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // m4.pa0
    public final long p() {
        wa0 wa0Var = this.f13582z;
        if (wa0Var != null) {
            return wa0Var.S();
        }
        return -1L;
    }

    @Override // m4.va0
    public final void q() {
        s1.f16555i.post(new mb0(this, 0));
    }

    @Override // m4.pa0
    public final String r() {
        String str = true != this.F ? "" : " spherical";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // m4.pa0
    public final void s() {
        if (N()) {
            if (this.f13580w.f7757a) {
                I();
            }
            this.f13582z.B(false);
            this.f13579v.f8810m = false;
            this.f12456t.a();
            s1.f16555i.post(new ob0(this, 0));
        }
    }

    @Override // m4.pa0
    public final void t() {
        wa0 wa0Var;
        if (!N()) {
            this.H = true;
            return;
        }
        if (this.f13580w.f7757a && (wa0Var = this.f13582z) != null) {
            wa0Var.C(true);
        }
        this.f13582z.B(true);
        this.f13579v.c();
        jb0 jb0Var = this.f12456t;
        jb0Var.f9894d = true;
        jb0Var.b();
        this.f12455s.f16067c = true;
        s1.f16555i.post(new b(this, 1));
    }

    @Override // m4.pa0
    public final void u(int i10) {
        if (N()) {
            this.f13582z.u(i10);
        }
    }

    @Override // m4.pa0
    public final void v(oa0 oa0Var) {
        this.f13581x = oa0Var;
    }

    @Override // m4.pa0
    public final void w(String str) {
        if (str != null) {
            g(str, null);
        }
    }

    @Override // m4.pa0
    public final void x() {
        if (O()) {
            this.f13582z.G();
            J();
        }
        this.f13579v.f8810m = false;
        this.f12456t.a();
        this.f13579v.d();
    }

    @Override // m4.pa0
    public final void y(float f10, float f11) {
        db0 db0Var = this.E;
        if (db0Var != null) {
            db0Var.c(f10, f11);
        }
    }

    @Override // m4.pa0
    public final void z(int i10) {
        wa0 wa0Var = this.f13582z;
        if (wa0Var != null) {
            wa0Var.v(i10);
        }
    }
}
