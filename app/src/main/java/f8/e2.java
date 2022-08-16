package f8;

import android.content.Intent;
import android.widget.EditText;
import com.raouf.routerchef.Login;
import com.raouf.routerchef.R;
import com.raouf.routerchef.SeparatedWifiSettings;
import com.raouf.routerchef.resModels.BasicWifiInfo;
import i8.g;
import java.util.Objects;
import r8.b;

/* loaded from: classes.dex */
public final /* synthetic */ class e2 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f4592s;

    /* renamed from: t */
    public final /* synthetic */ g f4593t;

    /* renamed from: u */
    public final /* synthetic */ Object f4594u;

    public /* synthetic */ e2(g gVar, Object obj, int i10) {
        this.f4592s = i10;
        this.f4593t = gVar;
        this.f4594u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        EditText editText;
        switch (this.f4592s) {
            case 0:
                SeparatedWifiSettings separatedWifiSettings = (SeparatedWifiSettings) this.f4593t;
                BasicWifiInfo basicWifiInfo = (BasicWifiInfo) this.f4594u;
                int i10 = SeparatedWifiSettings.f3626n0;
                Objects.requireNonNull(separatedWifiSettings);
                if (basicWifiInfo.safe != null) {
                    separatedWifiSettings.f3629c0.setChecked(basicWifiInfo.b());
                    separatedWifiSettings.f3630d0.setChecked(!basicWifiInfo.b());
                }
                String str2 = basicWifiInfo.password;
                if (str2 == null || str2.isEmpty()) {
                    editText = separatedWifiSettings.Y;
                    str = "●●●●●●●●";
                } else {
                    editText = separatedWifiSettings.Y;
                    str = basicWifiInfo.password;
                }
                editText.setText(str);
                return;
            default:
                g gVar = this.f4593t;
                String str3 = (String) this.f4594u;
                Objects.requireNonNull(gVar);
                b.q(gVar, str3);
                if (str3.equals(gVar.getString(R.string.mayLogin))) {
                    return;
                }
                gVar.startActivity(new Intent(gVar, Login.class));
                gVar.finish();
                return;
        }
    }
}
