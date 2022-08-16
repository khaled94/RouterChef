package i8;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import e.e;
import java.util.Locale;
import r8.b;

/* loaded from: classes.dex */
public class a extends e {
    public Locale L;

    @Override // e.e, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        Locale m10 = b.m(context);
        Locale.setDefault(m10);
        configuration.setLocale(m10);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        Locale m10 = b.m(this);
        if (!m10.equals(this.L)) {
            this.L = m10;
            recreate();
        }
    }

    @Override // e.e, androidx.fragment.app.t, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.L = b.c(this);
    }
}
