package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public static AtomicBoolean f1699a = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static class a extends b {
        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            w.c(activity);
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }
}
