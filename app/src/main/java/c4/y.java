package c4;

import a4.b;
import android.util.Log;
import b4.a;
import d4.h;

/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ b f2760s;

    /* renamed from: t */
    public final /* synthetic */ z f2761t;

    public y(z zVar, b bVar) {
        this.f2761t = zVar;
        this.f2760s = bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        h hVar;
        z zVar = this.f2761t;
        w wVar = (w) zVar.f2767f.B.get(zVar.f2763b);
        if (wVar == null) {
            return;
        }
        if (this.f2760s.t()) {
            z zVar2 = this.f2761t;
            zVar2.f2766e = true;
            if (zVar2.f2762a.l()) {
                z zVar3 = this.f2761t;
                if (!zVar3.f2766e || (hVar = zVar3.f2764c) == null) {
                    return;
                }
                zVar3.f2762a.c(hVar, zVar3.f2765d);
                return;
            }
            try {
                a.e eVar = this.f2761t.f2762a;
                eVar.c(null, eVar.b());
                return;
            } catch (SecurityException e10) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                this.f2761t.f2762a.d("Failed to get service from broker.");
                bVar = new b(10, null, null);
            }
        } else {
            bVar = this.f2760s;
        }
        wVar.q(bVar, null);
    }
}
