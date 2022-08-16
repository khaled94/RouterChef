package h2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import t4.i;
import t4.j;
import t4.k;
import t4.l;

/* loaded from: classes.dex */
public final class s implements ServiceConnection {

    /* renamed from: a */
    public final Object f5022a = new Object();

    /* renamed from: b */
    public boolean f5023b = false;

    /* renamed from: c */
    public d f5024c;

    /* renamed from: d */
    public final /* synthetic */ c f5025d;

    public /* synthetic */ s(c cVar, d dVar) {
        this.f5025d = cVar;
        this.f5024c = dVar;
    }

    public final void a(f fVar) {
        synchronized (this.f5022a) {
            d dVar = this.f5024c;
            if (dVar != null) {
                dVar.a(fVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l lVar;
        i.e("BillingClient", "Billing service connected.");
        c cVar = this.f5025d;
        int i10 = k.f18652s;
        if (iBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            lVar = queryLocalInterface instanceof l ? (l) queryLocalInterface : new j(iBinder);
        }
        cVar.f4967f = lVar;
        c cVar2 = this.f5025d;
        if (cVar2.h(new q(this, 0), 30000L, new Runnable() { // from class: h2.r
            @Override // java.lang.Runnable
            public final void run() {
                s sVar = s.this;
                sVar.f5025d.f4962a = 0;
                sVar.f5025d.f4967f = null;
                sVar.a(t.f5037l);
            }
        }, cVar2.d()) == null) {
            a(this.f5025d.f());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i.f("BillingClient", "Billing service disconnected.");
        this.f5025d.f4967f = null;
        this.f5025d.f4962a = 0;
        synchronized (this.f5022a) {
            d dVar = this.f5024c;
            if (dVar != null) {
                dVar.b();
            }
        }
    }
}
