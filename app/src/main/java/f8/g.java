package f8;

import com.raouf.routerchef.AccessBlocker;
import com.raouf.routerchef.LimitWifiSpeed;
import com.raouf.routerchef.resModels.LimitWifiInfo;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4601s;

    /* renamed from: t */
    public final /* synthetic */ i8.g f4602t;

    /* renamed from: u */
    public final /* synthetic */ Object f4603u;

    public /* synthetic */ g(i8.g gVar, Object obj, int i10) {
        this.f4601s = i10;
        this.f4602t = gVar;
        this.f4603u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4601s) {
            case 0:
                ((AccessBlocker) this.f4602t).f3494e0.i((ArrayList) this.f4603u);
                return;
            default:
                LimitWifiSpeed limitWifiSpeed = (LimitWifiSpeed) this.f4602t;
                LimitWifiInfo limitWifiInfo = (LimitWifiInfo) this.f4603u;
                int i10 = LimitWifiSpeed.f3540i0;
                Objects.requireNonNull(limitWifiSpeed);
                if (limitWifiInfo.speed.equals("b") || !limitWifiInfo.speed.contains("g")) {
                    limitWifiSpeed.Y.setChecked(true);
                    limitWifiSpeed.X.setChecked(false);
                } else {
                    limitWifiSpeed.Y.setChecked(false);
                    limitWifiSpeed.X.setChecked(true);
                }
                String str = limitWifiInfo.power;
                if (str == null) {
                    return;
                }
                limitWifiSpeed.f3541a0.setProgress(Integer.parseInt(str.substring(0, str.length() - 1)) / limitWifiSpeed.f3545e0);
                return;
        }
    }
}
