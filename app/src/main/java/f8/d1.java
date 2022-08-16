package f8;

import android.view.View;
import android.widget.TextView;
import com.raouf.routerchef.Login;
import com.raouf.routerchef.RouterDevices;
import i8.m;

/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4581s;

    /* renamed from: t */
    public final /* synthetic */ Object f4582t;

    public /* synthetic */ d1(Object obj, int i10) {
        this.f4581s = i10;
        this.f4582t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4581s) {
            case 0:
                Login login = (Login) this.f4582t;
                login.X.setEnabled(true);
                login.f3563g0.b();
                m.e(login.P);
                login.P = null;
                return;
            case 1:
                RouterDevices routerDevices = (RouterDevices) this.f4582t;
                routerDevices.Y.setEnabled(false);
                routerDevices.X.d();
                return;
            default:
                ((TextView) ((View) this.f4582t)).setTextColor(-7829368);
                return;
        }
    }
}
