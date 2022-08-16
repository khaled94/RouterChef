package o2;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import d4.m;
import f3.b;
import f3.h;
import h3.e;
import h3.g;
import java.util.Objects;
import m4.b20;
import n3.g1;
import p3.l;

/* loaded from: classes.dex */
public final class k extends b implements g.a, e.b, e.a {

    /* renamed from: s */
    public final AbstractAdViewAdapter f16756s;

    /* renamed from: t */
    public final l f16757t;

    public k(AbstractAdViewAdapter abstractAdViewAdapter, l lVar) {
        this.f16756s = abstractAdViewAdapter;
        this.f16757t = lVar;
    }

    @Override // f3.b
    public final void N() {
        b20 b20Var = (b20) this.f16757t;
        Objects.requireNonNull(b20Var);
        m.d("#008 Must be called on the main UI thread.");
        g gVar = b20Var.f6342b;
        if (b20Var.f6343c == null) {
            if (gVar == null) {
                e = null;
                g1.l("#007 Could not call remote method.", e);
                return;
            } else if (!gVar.f16749n) {
                g1.e("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        g1.e("Adapter called onAdClicked.");
        try {
            b20Var.f6341a.b();
        } catch (RemoteException e10) {
            e = e10;
        }
    }

    @Override // f3.b
    public final void b() {
        b20 b20Var = (b20) this.f16757t;
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
    public final void c(h hVar) {
        ((b20) this.f16757t).e(hVar);
    }

    @Override // f3.b
    public final void d() {
        b20 b20Var = (b20) this.f16757t;
        Objects.requireNonNull(b20Var);
        m.d("#008 Must be called on the main UI thread.");
        g gVar = b20Var.f6342b;
        if (b20Var.f6343c == null) {
            if (gVar == null) {
                e = null;
                g1.l("#007 Could not call remote method.", e);
                return;
            } else if (!gVar.f16748m) {
                g1.e("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        g1.e("Adapter called onAdImpression.");
        try {
            b20Var.f6341a.o();
        } catch (RemoteException e10) {
            e = e10;
        }
    }

    @Override // f3.b
    public final void e() {
    }

    @Override // f3.b
    public final void f() {
        b20 b20Var = (b20) this.f16757t;
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
