package u7;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q implements Application.ActivityLifecycleCallbacks {

    /* renamed from: s */
    public final Set<Intent> f19571s = Collections.newSetFromMap(new WeakHashMap());

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "FirebaseMessaging"
            android.os.Bundle r6 = r6.getExtras()     // Catch: java.lang.RuntimeException -> Lf
            if (r6 == 0) goto L15
            java.lang.String r1 = "gcm.n.analytics_data"
            android.os.Bundle r6 = r6.getBundle(r1)     // Catch: java.lang.RuntimeException -> Lf
            goto L16
        Lf:
            r6 = move-exception
            java.lang.String r1 = "Failed trying to get analytics data from Intent extras."
            android.util.Log.w(r0, r1, r6)
        L15:
            r6 = 0
        L16:
            java.lang.String r1 = "1"
            if (r6 != 0) goto L1c
            r2 = 0
            goto L26
        L1c:
            java.lang.String r2 = "google.c.a.e"
            java.lang.String r2 = r6.getString(r2)
            boolean r2 = r1.equals(r2)
        L26:
            if (r2 == 0) goto L90
            if (r6 != 0) goto L2b
            goto L8b
        L2b:
            java.lang.String r2 = "google.c.a.tc"
            java.lang.String r2 = r6.getString(r2)
            boolean r1 = r1.equals(r2)
            r2 = 3
            if (r1 == 0) goto L80
            h6.d r1 = h6.d.c()
            java.lang.Class<j6.a> r3 = j6.a.class
            java.lang.Object r1 = r1.b(r3)
            j6.a r1 = (j6.a) r1
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L4f
            java.lang.String r2 = "Received event with track-conversion=true. Setting user property and reengagement event"
            android.util.Log.d(r0, r2)
        L4f:
            if (r1 == 0) goto L7a
            java.lang.String r0 = "google.c.a.c_id"
            java.lang.String r0 = r6.getString(r0)
            r1.b(r0)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "source"
            java.lang.String r4 = "Firebase"
            r2.putString(r3, r4)
            java.lang.String r3 = "medium"
            java.lang.String r4 = "notification"
            r2.putString(r3, r4)
            java.lang.String r3 = "campaign"
            r2.putString(r3, r0)
            java.lang.String r0 = "fcm"
            java.lang.String r3 = "_cmp"
            r1.c(r0, r3, r2)
            goto L8b
        L7a:
            java.lang.String r1 = "Unable to set user property for conversion tracking:  analytics library is missing"
            android.util.Log.w(r0, r1)
            goto L8b
        L80:
            boolean r1 = android.util.Log.isLoggable(r0, r2)
            if (r1 == 0) goto L8b
            java.lang.String r1 = "Received event with track-conversion=false. Do not set user property"
            android.util.Log.d(r0, r1)
        L8b:
            java.lang.String r0 = "_no"
            u7.y.a(r0, r6)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.q.a(android.content.Intent):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent == null || !this.f19571s.add(intent)) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: u7.p
                @Override // java.lang.Runnable
                public final void run() {
                    q.this.a(intent);
                }
            });
        } else {
            a(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f19571s.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
