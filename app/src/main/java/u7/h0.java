package u7;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: e */
    public static h0 f19502e;

    /* renamed from: a */
    public String f19503a = null;

    /* renamed from: b */
    public Boolean f19504b = null;

    /* renamed from: c */
    public Boolean f19505c = null;

    /* renamed from: d */
    public final Queue<Intent> f19506d = new ArrayDeque();

    public static synchronized h0 a() {
        h0 h0Var;
        synchronized (h0.class) {
            if (f19502e == null) {
                f19502e = new h0();
            }
            h0Var = f19502e;
        }
        return h0Var;
    }

    public final boolean b(Context context) {
        if (this.f19505c == null) {
            this.f19505c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f19504b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f19505c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f19504b == null) {
            this.f19504b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f19504b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f19504b.booleanValue();
    }
}
