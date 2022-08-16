package m4;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;
import java.util.Objects;
import k1.a;
import p2.d;
import q3.f;

/* loaded from: classes.dex */
public final class jf2 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, fo2, qg2, wx1, mf2, rx, f72 {

    /* renamed from: s */
    public final /* synthetic */ lf2 f9956s;

    public /* synthetic */ jf2(lf2 lf2Var) {
        this.f9956s = lf2Var;
    }

    @Override // m4.qg2
    public final void A(Exception exc) {
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 N = eg2Var.N();
        eg2Var.I(N, 1037, new l2(N, exc));
    }

    @Override // m4.rx
    public final /* synthetic */ void A0(s70 s70Var, p80 p80Var) {
    }

    @Override // m4.rx
    public final /* synthetic */ void B0(tf0 tf0Var) {
    }

    @Override // m4.qg2
    public final void C(String str) {
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 N = eg2Var.N();
        eg2Var.I(N, 1013, new s2(N, str));
    }

    @Override // m4.rx
    public final /* synthetic */ void C0(boolean z10) {
    }

    @Override // m4.fo2
    public final void D(String str) {
        eg2 eg2Var = this.f9956s.f10757h;
        eg2Var.I(eg2Var.N(), 1024, new cg2());
    }

    @Override // m4.qg2
    public final void E(long j3) {
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 N = eg2Var.N();
        eg2Var.I(N, 1011, new rc(N));
    }

    @Override // m4.fo2
    public final void F(t tVar, h12 h12Var) {
        Objects.requireNonNull(this.f9956s);
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 N = eg2Var.N();
        eg2Var.I(N, 1022, new uf2(N, tVar, h12Var));
    }

    @Override // m4.rx
    public final /* synthetic */ void M(int i10) {
    }

    @Override // m4.fo2
    public final void a(sg0 sg0Var) {
        Objects.requireNonNull(this.f9956s);
        this.f9956s.f10757h.a(sg0Var);
        Iterator<fy> it = this.f9956s.f10756g.iterator();
        while (it.hasNext()) {
            it.next().a(sg0Var);
        }
    }

    @Override // m4.rx
    public final /* synthetic */ void b(pt ptVar) {
    }

    @Override // m4.qg2
    public final void c(boolean z10) {
        lf2 lf2Var = this.f9956s;
        if (lf2Var.f10768t == z10) {
            return;
        }
        lf2Var.f10768t = z10;
        lf2Var.f10757h.c(z10);
        Iterator<fy> it = lf2Var.f10756g.iterator();
        while (it.hasNext()) {
            it.next().c(lf2Var.f10768t);
        }
    }

    @Override // m4.fo2
    public final void d(long j3, int i10) {
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 L = eg2Var.L();
        eg2Var.I(L, 1026, new fk0(L));
    }

    @Override // m4.f72
    public final /* synthetic */ void e() {
    }

    @Override // m4.qg2
    public final void f(o02 o02Var) {
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 L = eg2Var.L();
        eg2Var.I(L, 1014, new d(L, o02Var));
        Objects.requireNonNull(this.f9956s);
        Objects.requireNonNull(this.f9956s);
    }

    @Override // m4.qg2
    public final void g(Exception exc) {
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 N = eg2Var.N();
        eg2Var.I(N, 1018, new ps(N, exc));
    }

    @Override // m4.fo2
    public final void h(o02 o02Var) {
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 L = eg2Var.L();
        eg2Var.I(L, 1025, new f(L, o02Var, 3));
        Objects.requireNonNull(this.f9956s);
        Objects.requireNonNull(this.f9956s);
    }

    @Override // m4.fo2
    public final void i(int i10, long j3) {
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 L = eg2Var.L();
        eg2Var.I(L, 1023, new sf2(L, i10, j3));
    }

    @Override // m4.qg2
    public final void j(String str, long j3, long j10) {
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 N = eg2Var.N();
        eg2Var.I(N, 1009, new v0(N, str));
    }

    @Override // m4.fo2
    public final void k(Exception exc) {
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 N = eg2Var.N();
        eg2Var.I(N, 1038, new a(N, exc));
    }

    @Override // m4.qg2
    public final void m(t tVar, h12 h12Var) {
        Objects.requireNonNull(this.f9956s);
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 N = eg2Var.N();
        eg2Var.I(N, 1010, new q72(N, tVar, h12Var));
    }

    @Override // m4.rx
    public final /* synthetic */ void o() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        lf2 lf2Var = this.f9956s;
        Surface surface = new Surface(surfaceTexture);
        lf2Var.s(surface);
        lf2Var.f10762m = surface;
        this.f9956s.q(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f9956s.s(null);
        this.f9956s.q(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f9956s.q(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // m4.qg2
    public final void p(int i10, long j3, long j10) {
        eg2 eg2Var = this.f9956s.f10757h;
        eg2Var.I(eg2Var.N(), 1012, new tf2());
    }

    @Override // m4.qg2
    public final void q(o02 o02Var) {
        Objects.requireNonNull(this.f9956s);
        eg2 eg2Var = this.f9956s.f10757h;
        eg2Var.I(eg2Var.N(), 1008, new wf2());
    }

    @Override // m4.rx
    public final void q0(int i10) {
        lf2.n(this.f9956s);
    }

    @Override // m4.f72
    public final void r() {
        lf2.n(this.f9956s);
    }

    @Override // m4.rx
    public final /* synthetic */ void r0(gi giVar, int i10) {
    }

    @Override // m4.rx
    public final /* synthetic */ void s0(lm lmVar) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f9956s.q(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f9956s.q(0, 0);
    }

    @Override // m4.fo2
    public final void t(o02 o02Var) {
        Objects.requireNonNull(this.f9956s);
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 N = eg2Var.N();
        eg2Var.I(N, 1020, new zz(N, o02Var, 2));
    }

    @Override // m4.rx
    public final void t0(boolean z10, int i10) {
        lf2.n(this.f9956s);
    }

    @Override // m4.rx
    public final /* synthetic */ void u0(sw swVar) {
    }

    @Override // m4.rx
    public final /* synthetic */ void v0(int i10) {
    }

    @Override // m4.fo2
    public final void w(String str, long j3, long j10) {
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 N = eg2Var.N();
        eg2Var.I(N, 1021, new b5(N, str));
    }

    @Override // m4.rx
    public final /* synthetic */ void w0(boolean z10, int i10) {
    }

    @Override // m4.rx
    public final /* synthetic */ void x0(sz szVar, sz szVar2, int i10) {
    }

    @Override // m4.fo2
    public final void y(Object obj, long j3) {
        eg2 eg2Var = this.f9956s.f10757h;
        fg2 N = eg2Var.N();
        eg2Var.I(N, 1027, new bg2(N, obj, j3));
        lf2 lf2Var = this.f9956s;
        if (lf2Var.f10761l == obj) {
            Iterator<fy> it = lf2Var.f10756g.iterator();
            while (it.hasNext()) {
                it.next().n();
            }
        }
    }

    @Override // m4.rx
    public final /* synthetic */ void y0(xr xrVar) {
    }

    @Override // m4.rx
    public final void z0(boolean z10) {
    }
}
