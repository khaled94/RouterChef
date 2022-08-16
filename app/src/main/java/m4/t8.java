package m4;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class t8 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final Handler E = new Handler(Looper.getMainLooper());
    public d8 A;
    public byte B = -1;
    public int C = -1;
    public long D = -3;

    /* renamed from: s */
    public final Context f13949s;

    /* renamed from: t */
    public Application f13950t;

    /* renamed from: u */
    public final PowerManager f13951u;

    /* renamed from: v */
    public final KeyguardManager f13952v;

    /* renamed from: w */
    public s8 f13953w;

    /* renamed from: x */
    public final g8 f13954x;
    public WeakReference<ViewTreeObserver> y;

    /* renamed from: z */
    public WeakReference<View> f13955z;

    public t8(Context context, g8 g8Var) {
        Context applicationContext = context.getApplicationContext();
        this.f13949s = applicationContext;
        this.f13954x = g8Var;
        this.f13951u = (PowerManager) applicationContext.getSystemService("power");
        this.f13952v = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f13950t = application;
            this.A = new d8(application, this);
        }
        c(null);
    }

    public final long a() {
        if (this.D <= -2 && b() == null) {
            this.D = -3L;
        }
        return this.D;
    }

    public final View b() {
        WeakReference<View> weakReference = this.f13955z;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void c(View view) {
        long j3;
        View b10 = b();
        if (b10 != null) {
            b10.removeOnAttachStateChangeListener(this);
            g(b10);
        }
        this.f13955z = new WeakReference<>(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                f(view);
            }
            view.addOnAttachStateChangeListener(this);
            j3 = -2;
        } else {
            j3 = -3;
        }
        this.D = j3;
    }

    public final void d(Activity activity, int i10) {
        Window window;
        if (this.f13955z == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View b10 = b();
        if (b10 == null || peekDecorView == null || b10.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.C = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0068, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007e, code lost:
        if ((r8.flags & 524288) != 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f13955z
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View r0 = r9.b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L13
            r9.D = r2
            r9.B = r1
            return
        L13:
            int r4 = r0.getVisibility()
            r5 = 0
            if (r4 == 0) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = r5
        L1d:
            boolean r6 = r0.isShown()
            if (r6 != 0) goto L25
            r4 = r4 | 2
        L25:
            android.os.PowerManager r6 = r9.f13951u
            if (r6 == 0) goto L31
            boolean r6 = r6.isScreenOn()
            if (r6 != 0) goto L31
            r4 = r4 | 4
        L31:
            m4.g8 r6 = r9.f13954x
            boolean r6 = r6.f8765a
            if (r6 != 0) goto L82
            android.app.KeyguardManager r6 = r9.f13952v
            if (r6 == 0) goto L80
            boolean r6 = r6.inKeyguardRestrictedInputMode()
            if (r6 == 0) goto L80
            char[] r6 = m4.p8.f12428a
            android.view.View r6 = r0.getRootView()
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r6 = r0
        L4b:
            android.content.Context r6 = r6.getContext()
        L4f:
            boolean r7 = r6 instanceof android.content.ContextWrapper
            r8 = 0
            if (r7 == 0) goto L68
            r7 = 10
            if (r5 >= r7) goto L68
            boolean r7 = r6 instanceof android.app.Activity
            if (r7 == 0) goto L5f
            android.app.Activity r6 = (android.app.Activity) r6
            goto L69
        L5f:
            android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
            android.content.Context r6 = r6.getBaseContext()
            int r5 = r5 + 1
            goto L4f
        L68:
            r6 = r8
        L69:
            if (r6 != 0) goto L6c
            goto L80
        L6c:
            android.view.Window r5 = r6.getWindow()
            if (r5 != 0) goto L73
            goto L77
        L73:
            android.view.WindowManager$LayoutParams r8 = r5.getAttributes()
        L77:
            if (r8 == 0) goto L80
            int r5 = r8.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L82
        L80:
            r4 = r4 | 8
        L82:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L8f
            r4 = r4 | 16
        L8f:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L9c
            r4 = r4 | 32
        L9c:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.C
            if (r5 == r1) goto La5
            r0 = r5
        La5:
            if (r0 == 0) goto La9
            r4 = r4 | 64
        La9:
            byte r0 = r9.B
            if (r0 == r4) goto Lbc
            byte r0 = (byte) r4
            r9.B = r0
            if (r4 != 0) goto Lb7
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lba
        Lb7:
            long r0 = (long) r4
            long r0 = r2 - r0
        Lba:
            r9.D = r0
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.t8.e():void");
    }

    public final void f(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.y = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f13953w == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            s8 s8Var = new s8(this);
            this.f13953w = s8Var;
            this.f13949s.registerReceiver(s8Var, intentFilter);
        }
        Application application = this.f13950t;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.A);
            } catch (Exception unused) {
            }
        }
    }

    public final void g(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.y;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.y = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        s8 s8Var = this.f13953w;
        if (s8Var != null) {
            try {
                this.f13949s.unregisterReceiver(s8Var);
            } catch (Exception unused3) {
            }
            this.f13953w = null;
        }
        Application application = this.f13950t;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.A);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        d(activity, 0);
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        d(activity, 4);
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(activity, 0);
        e();
        E.post(new r8(this, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        d(activity, 0);
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        e();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        e();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.C = -1;
        f(view);
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.C = -1;
        e();
        E.post(new r8(this, 0));
        g(view);
    }
}
