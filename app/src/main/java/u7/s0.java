package u7;

import android.util.Log;
import com.raouf.routerchef.PppoeSettings;
import com.raouf.routerchef.R;
import i8.m;
import java.util.Objects;
import u7.t0;

/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f19580s;

    /* renamed from: t */
    public final /* synthetic */ Object f19581t;

    public /* synthetic */ s0(Object obj, int i10) {
        this.f19580s = i10;
        this.f19581t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19580s) {
            case 0:
                t0.a aVar = (t0.a) this.f19581t;
                Objects.requireNonNull(aVar);
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f19589a.getAction() + " App may get closed.");
                aVar.a();
                return;
            default:
                PppoeSettings pppoeSettings = (PppoeSettings) this.f19581t;
                pppoeSettings.Y.setEnabled(true);
                pppoeSettings.Z.setEnabled(true);
                pppoeSettings.X.c(pppoeSettings.getString(R.string.loading));
                pppoeSettings.X.b();
                m.e(pppoeSettings.P);
                return;
        }
    }
}
