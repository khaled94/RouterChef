package b0;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a */
    public q f2454a;

    public void a(Bundle bundle) {
        String c10 = c();
        if (c10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
        }
    }

    public abstract void b(m mVar);

    public abstract String c();
}
