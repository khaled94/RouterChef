package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.g;

/* loaded from: classes.dex */
public final class v extends b {
    public final /* synthetic */ u this$0;

    /* loaded from: classes.dex */
    public class a extends b {
        public a() {
            v.this = r1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            v.this.this$0.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            v.this.this$0.e();
        }
    }

    public v(u uVar) {
        this.this$0 = uVar;
    }

    @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = w.f1725t;
            ((w) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f1726s = this.this$0.f1722z;
        }
    }

    @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        u uVar = this.this$0;
        int i10 = uVar.f1717t - 1;
        uVar.f1717t = i10;
        if (i10 == 0) {
            uVar.f1720w.postDelayed(uVar.y, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a());
    }

    @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        u uVar = this.this$0;
        int i10 = uVar.f1716s - 1;
        uVar.f1716s = i10;
        if (i10 != 0 || !uVar.f1718u) {
            return;
        }
        uVar.f1721x.f(g.b.ON_STOP);
        uVar.f1719v = true;
    }
}
