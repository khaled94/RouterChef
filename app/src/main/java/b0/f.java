package b0;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static final Class<?> f2404a;

    /* renamed from: b */
    public static final Field f2405b;

    /* renamed from: c */
    public static final Field f2406c;

    /* renamed from: d */
    public static final Method f2407d;

    /* renamed from: e */
    public static final Method f2408e;

    /* renamed from: f */
    public static final Method f2409f;

    /* renamed from: g */
    public static final Handler f2410g = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: s */
        public Object f2411s;

        /* renamed from: t */
        public Activity f2412t;

        /* renamed from: u */
        public final int f2413u;

        /* renamed from: v */
        public boolean f2414v = false;

        /* renamed from: w */
        public boolean f2415w = false;

        /* renamed from: x */
        public boolean f2416x = false;

        public a(Activity activity) {
            this.f2412t = activity;
            this.f2413u = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f2412t == activity) {
                this.f2412t = null;
                this.f2415w = true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
            r5.f2416x = true;
            r5.f2411s = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
            return;
         */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onActivityPaused(android.app.Activity r6) {
            /*
                r5 = this;
                boolean r0 = r5.f2415w
                if (r0 == 0) goto L42
                boolean r0 = r5.f2416x
                if (r0 != 0) goto L42
                boolean r0 = r5.f2414v
                if (r0 != 0) goto L42
                java.lang.Object r0 = r5.f2411s
                int r1 = r5.f2413u
                r2 = 0
                r3 = 1
                java.lang.reflect.Field r4 = b0.f.f2406c     // Catch: java.lang.Throwable -> L33
                java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L33
                if (r4 != r0) goto L3b
                int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L33
                if (r0 == r1) goto L21
                goto L3b
            L21:
                java.lang.reflect.Field r0 = b0.f.f2405b     // Catch: java.lang.Throwable -> L33
                java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L33
                android.os.Handler r0 = b0.f.f2410g     // Catch: java.lang.Throwable -> L33
                b0.e r1 = new b0.e     // Catch: java.lang.Throwable -> L33
                r1.<init>(r6, r4)     // Catch: java.lang.Throwable -> L33
                r0.postAtFrontOfQueue(r1)     // Catch: java.lang.Throwable -> L33
                r2 = r3
                goto L3b
            L33:
                r6 = move-exception
                java.lang.String r0 = "ActivityRecreator"
                java.lang.String r1 = "Exception while fetching field values"
                android.util.Log.e(r0, r1, r6)
            L3b:
                if (r2 == 0) goto L42
                r5.f2416x = r3
                r6 = 0
                r5.f2411s = r6
            L42:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.f.a.onActivityPaused(android.app.Activity):void");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f2412t == activity) {
                this.f2414v = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            b0.f.f2410g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            b0.f.f2404a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            b0.f.f2405b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            b0.f.f2406c = r0
            java.lang.Class<?> r0 = b0.f.f2404a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L3e
        L3c:
            r0 = r1
            goto L53
        L3e:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3c
            r7[r2] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L3c
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L3c
        L53:
            b0.f.f2407d = r0
            java.lang.Class<?> r0 = b0.f.f2404a
            if (r0 != 0) goto L5b
        L59:
            r0 = r1
            goto L6c
        L5b:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L59
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L59
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L59
            r7[r2] = r8     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L59
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L59
        L6c:
            b0.f.f2408e = r0
            java.lang.Class<?> r0 = b0.f.f2404a
            boolean r4 = a()
            if (r4 == 0) goto Lad
            if (r0 != 0) goto L79
            goto Lad
        L79:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch: java.lang.Throwable -> Lad
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lad
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lad
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lad
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lad
            r3 = 7
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 8
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> Lad
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lad
            r1 = r0
        Lad:
            b0.f.f2409f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f.<clinit>():void");
    }

    public static boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }
}
