package s4;

/* loaded from: classes.dex */
public final class e5 {

    /* renamed from: a */
    public static volatile q5<Boolean> f17847a = p5.f18058s;

    /* renamed from: b */
    public static final Object f17848b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(10:17|(1:19)(7:20|(1:22)(1:23)|24|(2:26|(1:28))|34|35|36)|29|42|30|31|(1:33)|34|35|36) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L2e
            java.lang.String r5 = java.lang.String.valueOf(r6)
            int r5 = r5.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r5 = r5 + 91
            r0.<init>(r5)
            r0.append(r6)
            java.lang.String r5 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r0.append(r5)
            java.lang.String r5 = "PhenotypeClientHelper"
            java.lang.String r6 = r0.toString()
            android.util.Log.e(r5, r6)
            return r1
        L2e:
            s4.q5<java.lang.Boolean> r6 = s4.e5.f17847a
            boolean r6 = r6.b()
            if (r6 == 0) goto L43
        L36:
            s4.q5<java.lang.Boolean> r5 = s4.e5.f17847a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L43:
            java.lang.Object r6 = s4.e5.f17848b
            monitor-enter(r6)
            s4.q5<java.lang.Boolean> r0 = s4.e5.f17847a     // Catch: java.lang.Throwable -> La8
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L5c
            s4.q5<java.lang.Boolean> r5 = s4.e5.f17847a     // Catch: java.lang.Throwable -> La8
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Throwable -> La8
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> La8
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> La8
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La8
            return r5
        L5c:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> La8
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L69
            goto L8a
        L69:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La8
            r4 = 29
            if (r3 >= r4) goto L77
            r3 = r1
            goto L79
        L77:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L79:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L9b
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> La8
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto L8a
            goto L9b
        L8a:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b java.lang.Throwable -> La8
            int r5 = r5.flags     // Catch: java.lang.Throwable -> La8
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L9b
            r1 = 1
        L9b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> La8
            s4.r5 r0 = new s4.r5     // Catch: java.lang.Throwable -> La8
            r0.<init>(r5)     // Catch: java.lang.Throwable -> La8
            s4.e5.f17847a = r0     // Catch: java.lang.Throwable -> La8
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La8
            goto L36
        La8:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La8
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.e5.a(android.content.Context, android.net.Uri):boolean");
    }
}
