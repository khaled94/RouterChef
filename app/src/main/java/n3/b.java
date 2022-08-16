package n3;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import l3.s;

@TargetApi(26)
/* loaded from: classes.dex */
public class b extends y1 {
    @Override // n3.e
    public final int b(Context context, TelephonyManager telephonyManager) {
        s1 s1Var = s.B.f5789c;
        return (!s1.e(context, "android.permission.ACCESS_NETWORK_STATE") || !telephonyManager.isDataEnabled()) ? 1 : 2;
    }
}
