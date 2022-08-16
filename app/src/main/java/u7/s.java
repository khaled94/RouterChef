package u7;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f19578s;

    /* renamed from: t */
    public final /* synthetic */ Object f19579t;

    public /* synthetic */ s(Object obj, int i10) {
        this.f19578s = i10;
        this.f19579t = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f19578s
            r1 = 1
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto L66
        L7:
            java.lang.Object r0 = r7.f19579t
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            android.content.Context r0 = r0.f3468d
            android.content.Context r2 = r0.getApplicationContext()
            if (r2 != 0) goto L14
            r2 = r0
        L14:
            r3 = 0
            java.lang.String r4 = "com.google.firebase.messaging"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r3)
            java.lang.String r4 = "proxy_notification_initialized"
            boolean r2 = r2.getBoolean(r4, r3)
            if (r2 == 0) goto L24
            goto L65
        L24:
            java.lang.String r2 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r4 = r0.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            android.content.pm.PackageManager r5 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            if (r5 == 0) goto L4d
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r5.getApplicationInfo(r4, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            if (r4 == 0) goto L4d
            android.os.Bundle r5 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            if (r5 == 0) goto L4d
            boolean r5 = r5.containsKey(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            if (r5 == 0) goto L4d
            android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            boolean r2 = r4.getBoolean(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            goto L4e
        L4d:
            r2 = r1
        L4e:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L55
            goto L56
        L55:
            r1 = r3
        L56:
            if (r1 != 0) goto L5d
            r0 = 0
            c5.l.e(r0)
            goto L65
        L5d:
            c5.j r1 = new c5.j
            r1.<init>()
            u7.b0.a(r0, r2, r1)
        L65:
            return
        L66:
            java.lang.Object r0 = r7.f19579t
            com.raouf.routerchef.NewWifiSettings r0 = (com.raouf.routerchef.NewWifiSettings) r0
            android.widget.Button r2 = r0.f3584h0
            r2.setEnabled(r1)
            android.widget.Button r2 = r0.f3585i0
            r2.setEnabled(r1)
            i8.p r1 = r0.f3592p0
            r2 = 2131886290(0x7f1200d2, float:1.9407155E38)
            java.lang.String r2 = r0.getString(r2)
            r1.c(r2)
            i8.p r1 = r0.f3592p0
            r1.b()
            i8.m r0 = r0.P
            i8.m.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.s.run():void");
    }
}
