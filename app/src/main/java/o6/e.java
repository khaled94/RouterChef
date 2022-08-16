package o6;

import android.os.Bundle;
import android.util.Log;
import j6.a;
import java.util.Locale;
import q6.b;

/* loaded from: classes.dex */
public final class e implements a.b {

    /* renamed from: a */
    public b f16782a;

    /* renamed from: b */
    public b f16783b;

    public final void a(int i10, Bundle bundle) {
        String format = String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", format, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            b bVar = "clx".equals(bundle2.getString("_o")) ? this.f16782a : this.f16783b;
            if (bVar == null) {
                return;
            }
            bVar.b(string, bundle2);
        }
    }
}
