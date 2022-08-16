package o2;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import d4.m;
import f3.b;
import g3.c;
import java.util.Objects;
import m4.b20;
import m4.ym;
import n3.g1;

/* loaded from: classes.dex */
public final class h extends b implements c, ym {

    /* renamed from: s */
    public final AbstractAdViewAdapter f16750s;

    /* renamed from: t */
    public final p3.h f16751t;

    public h(AbstractAdViewAdapter abstractAdViewAdapter, p3.h hVar) {
        this.f16750s = abstractAdViewAdapter;
        this.f16751t = hVar;
    }

    @Override // f3.b
    public final void N() {
        b20 b20Var = (b20) this.f16751t;
        Objects.requireNonNull(b20Var);
        m.d("#008 Must be called on the main UI thread.");
        g1.e("Adapter called onAdClicked.");
        try {
            b20Var.f6341a.b();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    @Override // g3.c
    public final void a(String str, String str2) {
        b20 b20Var = (b20) this.f16751t;
        Objects.requireNonNull(b20Var);
        m.d("#008 Must be called on the main UI thread.");
        g1.e("Adapter called onAppEvent.");
        try {
            b20Var.f6341a.P1(str, str2);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    @Override // f3.b
    public final void b() {
        b20 b20Var = (b20) this.f16751t;
        Objects.requireNonNull(b20Var);
        m.d("#008 Must be called on the main UI thread.");
        g1.e("Adapter called onAdClosed.");
        try {
            b20Var.f6341a.d();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    @Override // f3.b
    public final void c(f3.h hVar) {
        ((b20) this.f16751t).c(hVar);
    }

    @Override // f3.b
    public final void e() {
        b20 b20Var = (b20) this.f16751t;
        Objects.requireNonNull(b20Var);
        m.d("#008 Must be called on the main UI thread.");
        g1.e("Adapter called onAdLoaded.");
        try {
            b20Var.f6341a.k();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    @Override // f3.b
    public final void f() {
        b20 b20Var = (b20) this.f16751t;
        Objects.requireNonNull(b20Var);
        m.d("#008 Must be called on the main UI thread.");
        g1.e("Adapter called onAdOpened.");
        try {
            b20Var.f6341a.m();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }
}
