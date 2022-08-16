package c7;

import android.content.Context;
import android.util.Log;
import s6.e;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: b */
    public static boolean f2814b = false;

    /* renamed from: c */
    public static String f2815c;

    /* renamed from: a */
    public final Context f2816a;

    public a(Context context) {
        this.f2816a = context;
    }

    public final String a() {
        int g10;
        String str;
        Context context = this.f2816a;
        synchronized (a.class) {
            if (!f2814b && (g10 = e.g(context, "com.google.firebase.crashlytics.unity_version", "string")) != 0) {
                f2815c = context.getResources().getString(g10);
                f2814b = true;
                String str2 = "Unity Editor version is: " + f2815c;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", str2, null);
                }
            }
            str = f2815c;
        }
        return str;
    }
}
