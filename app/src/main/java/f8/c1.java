package f8;

import com.raouf.routerchef.Login;
import com.raouf.routerchef.PppoeSettings;
import com.raouf.routerchef.resModels.PPPOEInfo;
import i8.g;
import java.util.Objects;
import r8.b;

/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4572s;

    /* renamed from: t */
    public final /* synthetic */ g f4573t;

    /* renamed from: u */
    public final /* synthetic */ Object f4574u;

    public /* synthetic */ c1(g gVar, Object obj, int i10) {
        this.f4572s = i10;
        this.f4573t = gVar;
        this.f4574u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4572s) {
            case 0:
                Login login = (Login) this.f4573t;
                String str = Login.f3556m0;
                Objects.requireNonNull(login);
                b.q(login, (String) this.f4574u);
                login.P();
                return;
            default:
                PppoeSettings pppoeSettings = (PppoeSettings) this.f4573t;
                PPPOEInfo pPPOEInfo = (PPPOEInfo) this.f4574u;
                pppoeSettings.f3604a0.setText(pPPOEInfo.pppUsername);
                String str2 = pPPOEInfo.pppPassword;
                if (str2 == null) {
                    str2 = "●●●●●●●●";
                }
                pppoeSettings.f3605b0.setText(str2);
                return;
        }
    }
}
