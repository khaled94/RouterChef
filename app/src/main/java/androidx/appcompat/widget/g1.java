package androidx.appcompat.widget;

import androidx.appcompat.app.d;
import com.google.android.gms.ads.AdView;
import com.raouf.routerchef.AccessBlocker;
import com.raouf.routerchef.NewWifiSettings;
import com.raouf.routerchef.R;
import com.raouf.routerchef.SpeedTest;
import d7.a;
import f8.m1;
import i8.m;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f856s;

    /* renamed from: t */
    public final /* synthetic */ Object f857t;

    public /* synthetic */ g1(Object obj, int i10) {
        this.f856s = i10;
        this.f857t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f856s) {
            case 0:
                ((Toolbar) this.f857t).p();
                return;
            case 1:
                AccessBlocker accessBlocker = (AccessBlocker) this.f857t;
                accessBlocker.Y.setEnabled(true);
                accessBlocker.X.b();
                m.e(accessBlocker.P);
                return;
            case 2:
                NewWifiSettings newWifiSettings = (NewWifiSettings) this.f857t;
                int i10 = NewWifiSettings.f3576r0;
                Objects.requireNonNull(newWifiSettings);
                d.a aVar = new d.a(newWifiSettings);
                aVar.f502a.f478f = newWifiSettings.getString(R.string.mustComplexPassword);
                aVar.c(newWifiSettings.getString(R.string.okTamam), m1.f4650s);
                aVar.d();
                return;
            case 3:
                SpeedTest speedTest = (SpeedTest) this.f857t;
                String charSequence = speedTest.M.getText().toString();
                String str = "...";
                String c10 = charSequence.contains(".") ? a.c(charSequence, ".") : str;
                String charSequence2 = speedTest.L.getText().toString();
                if (charSequence2.contains(".")) {
                    str = a.c(charSequence2, ".");
                }
                speedTest.M.setText(c10);
                speedTest.L.setText(str);
                return;
            default:
                ((AdView) this.f857t).setVisibility(0);
                return;
        }
    }
}
