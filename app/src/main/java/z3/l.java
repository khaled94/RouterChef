package z3;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import m4.al1;
import m4.dc0;
import m4.es;
import m4.fb0;
import m4.j21;
import m4.jb;
import m4.jo;
import m4.qm2;
import m4.rm2;
import m4.ua;
import m4.w90;
import n3.j0;
import y4.a6;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f20948s;

    /* renamed from: t */
    public final /* synthetic */ Object f20949t;

    /* renamed from: u */
    public final /* synthetic */ Object f20950u;

    public /* synthetic */ l(Object obj, Object obj2, int i10) {
        this.f20948s = i10;
        this.f20949t = obj;
        this.f20950u = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<java.lang.Runnable>, java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.f20948s) {
            case 0:
                m mVar = (m) this.f20949t;
                int i11 = ((q) this.f20950u).f20959a;
                synchronized (mVar) {
                    q<?> qVar = mVar.f20955e.get(i11);
                    if (qVar != null) {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Timing out request: ");
                        sb.append(i11);
                        Log.w("MessengerIpcClient", sb.toString());
                        mVar.f20955e.remove(i11);
                        qVar.c(new r("Timed out waiting for response", null));
                        mVar.c();
                    }
                }
                return;
            case 1:
                ua uaVar = (ua) this.f20949t;
                fb0 fb0Var = ((dc0) ((jb) ((j0) this.f20950u).f16490t)).D.get();
                if (!((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue() || fb0Var == null || uaVar == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("audioMime", uaVar.f14311w);
                hashMap.put("audioSampleMime", uaVar.f14312x);
                hashMap.put("audioCodec", uaVar.f14309u);
                fb0Var.a("onMetadataEvent", hashMap);
                return;
            case 2:
                j21 j21Var = (j21) this.f20949t;
                j21Var.f9816i.execute(new k(j21Var, (w90) this.f20950u, 4));
                return;
            case 3:
                al1 al1Var = (al1) this.f20949t;
                qm2 qm2Var = (qm2) this.f20950u;
                synchronized (al1Var.f6188c) {
                    i10 = al1Var.f6189d;
                }
                rm2.a(qm2Var.f12930a, i10);
                return;
            default:
                ((a6) this.f20949t).a();
                a6 a6Var = (a6) this.f20949t;
                Runnable runnable = (Runnable) this.f20950u;
                a6Var.B().g();
                if (a6Var.H == null) {
                    a6Var.H = new ArrayList();
                }
                a6Var.H.add(runnable);
                ((a6) this.f20949t).r();
                return;
        }
    }

    public /* synthetic */ l(al1 al1Var, qm2 qm2Var) {
        this.f20948s = 3;
        this.f20949t = al1Var;
        this.f20950u = qm2Var;
    }

    public l(j0 j0Var, ua uaVar) {
        this.f20948s = 1;
        this.f20950u = j0Var;
        this.f20949t = uaVar;
    }

    public l(a6 a6Var, Runnable runnable) {
        this.f20948s = 4;
        this.f20949t = a6Var;
        this.f20950u = runnable;
    }
}
