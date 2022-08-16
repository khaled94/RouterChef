package f8;

import android.content.Intent;
import com.raouf.routerchef.Advanced;
import com.raouf.routerchef.Login;
import com.raouf.routerchef.MainFeatures;
import com.raouf.routerchef.PppoeSettings;
import com.raouf.routerchef.R;
import h8.e;
import i8.g;
import r8.b;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4682s;

    /* renamed from: t */
    public final /* synthetic */ g f4683t;

    public /* synthetic */ s(g gVar, int i10) {
        this.f4682s = i10;
        this.f4683t = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4682s) {
            case 0:
                ((Advanced) this.f4683t).f3509e0.b();
                return;
            case 1:
                Login login = (Login) this.f4683t;
                String str = Login.f3556m0;
                b.q(login, login.getString(R.string.loginSuccess));
                e eVar = login.f3567k0;
                if (eVar != null) {
                    eVar.b();
                    return;
                } else {
                    login.startActivity(new Intent(login, MainFeatures.class));
                    return;
                }
            default:
                ((PppoeSettings) this.f4683t).f3609f0.b();
                return;
        }
    }
}
