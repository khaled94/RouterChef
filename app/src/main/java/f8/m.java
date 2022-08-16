package f8;

import androidx.appcompat.app.d;
import androidx.lifecycle.g;
import com.raouf.routerchef.AccessControl;
import com.raouf.routerchef.R;
import com.raouf.routerchef.WifiSettings;
import i8.g;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4645s;

    /* renamed from: t */
    public final /* synthetic */ g f4646t;

    public /* synthetic */ m(g gVar, int i10) {
        this.f4645s = i10;
        this.f4646t = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4645s) {
            case 0:
                AccessControl accessControl = (AccessControl) this.f4646t;
                accessControl.Y.setChecked(false);
                if (!accessControl.f387v.f1702b.b(g.c.STARTED)) {
                    return;
                }
                d.a aVar = new d.a(accessControl);
                aVar.f502a.f478f = accessControl.getString(R.string.mustHasMacsNote);
                aVar.c(accessControl.getString(R.string.okTamam), k.f4627s);
                aVar.d();
                return;
            default:
                WifiSettings wifiSettings = (WifiSettings) this.f4646t;
                int i10 = WifiSettings.f3642l0;
                Objects.requireNonNull(wifiSettings);
                d.a aVar2 = new d.a(wifiSettings);
                aVar2.f502a.f478f = wifiSettings.getString(R.string.mustComplexPassword);
                aVar2.c(wifiSettings.getString(R.string.okTamam), p2.f4673s);
                aVar2.d();
                return;
        }
    }
}
