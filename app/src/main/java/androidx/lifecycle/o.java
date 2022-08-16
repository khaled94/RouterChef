package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.g;

/* loaded from: classes.dex */
public class o extends Service implements l {

    /* renamed from: s */
    public final d0 f1711s = new d0(this);

    @Override // androidx.lifecycle.l
    public final g a() {
        return this.f1711s.f1668a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.f1711s.a(g.b.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f1711s.a(g.b.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        d0 d0Var = this.f1711s;
        d0Var.a(g.b.ON_STOP);
        d0Var.a(g.b.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        this.f1711s.a(g.b.ON_START);
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
