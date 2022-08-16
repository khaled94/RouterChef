package m4;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import d4.m;
import h3.g;
import java.util.Objects;
import n3.g1;
import o2.k;
import p3.l;

/* loaded from: classes.dex */
public final class jw extends vv {

    /* renamed from: s */
    public final g.a f10208s;

    public jw(g.a aVar) {
        this.f10208s = aVar;
    }

    @Override // m4.wv
    public final void M1(ew ewVar) {
        g.a aVar = this.f10208s;
        fw fwVar = new fw(ewVar);
        k kVar = (k) aVar;
        l lVar = kVar.f16757t;
        AbstractAdViewAdapter abstractAdViewAdapter = kVar.f16756s;
        o2.g gVar = new o2.g(fwVar);
        b20 b20Var = (b20) lVar;
        Objects.requireNonNull(b20Var);
        m.d("#008 Must be called on the main UI thread.");
        g1.e("Adapter called onAdLoaded.");
        b20Var.f6342b = gVar;
        if (!(abstractAdViewAdapter instanceof AdMobAdapter)) {
            Object obj = new Object();
            new u10();
            synchronized (obj) {
            }
        }
        try {
            b20Var.f6341a.k();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }
}
