package n3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Process;
import android.telephony.TelephonyManager;
import androidx.lifecycle.h0;

@TargetApi(16)
/* loaded from: classes.dex */
public class e {
    public /* synthetic */ e(h0 h0Var) {
    }

    public static final boolean d() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public boolean a(Activity activity, Configuration configuration) {
        return false;
    }

    public int b(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public void c(Activity activity) {
    }
}
