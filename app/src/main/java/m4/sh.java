package m4;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Objects;
import l3.s;
import n3.d1;
import n3.g1;
import n3.s1;
import n3.x0;

@TargetApi(14)
/* loaded from: classes.dex */
public final class sh implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final long G = ((Long) jo.f10145d.f10148c.a(es.Q0)).longValue();
    public final x0 A = new x0(G);
    public boolean B = false;
    public int C = -1;
    public final HashSet<rh> D = new HashSet<>();
    public final DisplayMetrics E;
    public final Rect F;

    /* renamed from: s */
    public final Context f13638s;

    /* renamed from: t */
    public Application f13639t;

    /* renamed from: u */
    public final PowerManager f13640u;

    /* renamed from: v */
    public final KeyguardManager f13641v;

    /* renamed from: w */
    public ph f13642w;

    /* renamed from: x */
    public WeakReference<ViewTreeObserver> f13643x;
    public final WeakReference<View> y;

    /* renamed from: z */
    public vh f13644z;

    public sh(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f13638s = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f13640u = (PowerManager) applicationContext.getSystemService("power");
        this.f13641v = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f13639t = application;
            this.f13644z = new vh(application, this);
        }
        this.E = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.F = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.y;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            h(view2);
        }
        this.y = new WeakReference<>(view);
        if (view != null) {
            Objects.requireNonNull(s.B.f5791e);
            if (view.isAttachedToWindow()) {
                g(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        return new Rect(c(rect.left), c(rect.top), c(rect.right), c(rect.bottom));
    }

    public final void b(rh rhVar) {
        this.D.add(rhVar);
        e(3);
    }

    public final int c(int i10) {
        return (int) (i10 / this.E.density);
    }

    public final void d(Activity activity, int i10) {
        Window window;
        if (this.y == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = this.y.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.C = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x010b, code lost:
        if (r11 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011e, code lost:
        if (r11 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
        r3 = true;
        r11 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ee A[LOOP:1: B:102:0x01e8->B:104:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b2  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r24) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.sh.e(int):void");
    }

    public final void f() {
        s1.f16555i.post(new oh(this, 0));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.WeakHashMap, java.util.Map<android.content.BroadcastReceiver, android.content.IntentFilter>] */
    public final void g(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f13643x = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f13642w == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            ph phVar = new ph(this);
            this.f13642w = phVar;
            d1 d1Var = s.B.y;
            Context context = this.f13638s;
            synchronized (d1Var) {
                if (d1Var.f16457d) {
                    d1Var.f16455b.put(phVar, intentFilter);
                } else {
                    context.registerReceiver(phVar, intentFilter);
                }
            }
        }
        Application application = this.f13639t;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f13644z);
            } catch (Exception e10) {
                g1.h("Error registering activity lifecycle callbacks.", e10);
            }
        }
    }

    public final void h(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.f13643x;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f13643x = null;
            }
        } catch (Exception e10) {
            g1.h("Error while unregistering listeners from the last ViewTreeObserver.", e10);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e11) {
            g1.h("Error while unregistering listeners from the ViewTreeObserver.", e11);
        }
        ph phVar = this.f13642w;
        if (phVar != null) {
            try {
                s.B.y.b(this.f13638s, phVar);
            } catch (IllegalStateException e12) {
                g1.h("Failed trying to unregister the receiver", e12);
            } catch (Exception e13) {
                s.B.f5793g.g(e13, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f13642w = null;
        }
        Application application = this.f13639t;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f13644z);
            } catch (Exception e14) {
                g1.h("Error registering activity lifecycle callbacks.", e14);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        d(activity, 0);
        e(3);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        e(3);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        d(activity, 4);
        e(3);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(activity, 0);
        e(3);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e(3);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        d(activity, 0);
        e(3);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        e(3);
        f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        e(2);
        f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        e(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.C = -1;
        g(view);
        e(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.C = -1;
        e(3);
        f();
        h(view);
    }
}
