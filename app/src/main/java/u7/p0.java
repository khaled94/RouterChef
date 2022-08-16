package u7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import b5.a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a */
    public static final long f19568a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f19569b = new Object();

    /* renamed from: c */
    public static a f19570c;

    public static ComponentName a(Context context, Intent intent) {
        synchronized (f19569b) {
            if (f19570c == null) {
                a aVar = new a(context);
                f19570c = aVar;
                synchronized (aVar.f2574a) {
                    aVar.f2580g = true;
                }
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                f19570c.a(f19568a);
            }
            return startService;
        }
    }
}
