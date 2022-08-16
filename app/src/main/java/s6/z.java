package s6;

import android.util.Log;
import c5.j;
import h6.d;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a */
    public final d f18341a;

    /* renamed from: d */
    public boolean f18344d;

    /* renamed from: e */
    public Boolean f18345e;

    /* renamed from: b */
    public final Object f18342b = new Object();

    /* renamed from: c */
    public j<Void> f18343c = new j<>();

    /* renamed from: f */
    public final j<Void> f18346f = new j<>();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z(h6.d r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.f18342b = r0
            c5.j r0 = new c5.j
            r0.<init>()
            r6.f18343c = r0
            r0 = 0
            r6.f18344d = r0
            c5.j r1 = new c5.j
            r1.<init>()
            r6.f18346f = r1
            r7.a()
            android.content.Context r1 = r7.f5112a
            r6.f18341a = r7
            android.content.SharedPreferences r7 = s6.e.h(r1)
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3b
            r6.f18344d = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L3c
        L3b:
            r7 = r5
        L3c:
            if (r7 != 0) goto L82
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            if (r2 == 0) goto L6f
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            if (r1 == 0) goto L6f
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            if (r2 == 0) goto L6f
            boolean r2 = r2.containsKey(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            if (r2 == 0) goto L6f
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            boolean r7 = r1.getBoolean(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            goto L70
        L67:
            r7 = move-exception
            java.lang.String r1 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r1, r2, r7)
        L6f:
            r7 = r5
        L70:
            if (r7 != 0) goto L76
            r6.f18344d = r0
            r7 = r5
            goto L82
        L76:
            r6.f18344d = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L82:
            r6.f18345e = r7
            java.lang.Object r7 = r6.f18342b
            monitor-enter(r7)
            boolean r0 = r6.a()     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L92
            c5.j<java.lang.Void> r0 = r6.f18343c     // Catch: java.lang.Throwable -> L94
            r0.d(r5)     // Catch: java.lang.Throwable -> L94
        L92:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L94
            return
        L94:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L94
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.z.<init>(h6.d):void");
    }

    public final synchronized boolean a() {
        boolean booleanValue;
        Boolean bool = this.f18345e;
        booleanValue = bool != null ? bool.booleanValue() : this.f18341a.g();
        b(booleanValue);
        return booleanValue;
    }

    public final void b(boolean z10) {
        boolean z11 = false;
        String format = String.format("Crashlytics automatic data collection %s by %s.", z10 ? "ENABLED" : "DISABLED", this.f18345e == null ? "global Firebase setting" : this.f18344d ? "firebase_crashlytics_collection_enabled manifest flag" : "API");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            z11 = true;
        }
        if (z11) {
            Log.d("FirebaseCrashlytics", format, null);
        }
    }
}
