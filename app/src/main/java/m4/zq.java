package m4;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public final class zq extends ContentProvider {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachInfo(android.content.Context r7, android.content.pm.ProviderInfo r8) {
        /*
            r6 = this;
            r0 = 0
            j4.b r1 = j4.c.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.NullPointerException -> L16
            java.lang.String r2 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.NullPointerException -> L16
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.b(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.NullPointerException -> L16
            android.os.Bundle r0 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.NullPointerException -> L16
            goto L1c
        L12:
            r1 = move-exception
            java.lang.String r2 = "Failed to load metadata: Package name not found."
            goto L19
        L16:
            r1 = move-exception
            java.lang.String r2 = "Failed to load metadata: Null pointer exception."
        L19:
            n3.g1.h(r2, r1)
        L1c:
            m4.y00 r1 = m4.y00.f15548b
            if (r1 != 0) goto L27
            m4.y00 r1 = new m4.y00
            r1.<init>()
            m4.y00.f15548b = r1
        L27:
            m4.y00 r1 = m4.y00.f15548b
            if (r0 != 0) goto L32
            java.lang.String r0 = "Metadata was null."
            n3.g1.g(r0)
            goto Lb5
        L32:
            java.lang.String r2 = "com.google.android.gms.ads.APPLICATION_ID"
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.ClassCastException -> Ldc
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.ClassCastException -> Ldc
            java.lang.String r3 = "com.google.android.gms.ads.AD_MANAGER_APP"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.ClassCastException -> Ld3
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.ClassCastException -> Ld3
            java.lang.String r4 = "com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT"
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.ClassCastException -> Lca
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.ClassCastException -> Lca
            java.lang.String r5 = "com.google.android.gms.ads.INTEGRATION_MANAGER"
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.ClassCastException -> Lc1
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.ClassCastException -> Lc1
            if (r2 == 0) goto L8e
            java.lang.String r5 = "^/\\d+~.+$"
            boolean r5 = r2.matches(r5)
            if (r5 != 0) goto L8e
            java.lang.String r0 = "^ca-app-pub-[0-9]{16}~[0-9]{10}$"
            boolean r0 = r2.matches(r0)
            if (r0 == 0) goto L86
            java.lang.String r0 = "Publisher provided Google AdMob App ID in manifest: "
            int r3 = r2.length()
            if (r3 == 0) goto L71
            java.lang.String r0 = r0.concat(r2)
            goto L77
        L71:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            r0 = r3
        L77:
            n3.g1.e(r0)
            if (r4 == 0) goto L82
            boolean r0 = r4.booleanValue()
            if (r0 != 0) goto Lb5
        L82:
            r1.a(r7, r2)
            goto Lb5
        L86:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n******************************************************************************\n\n"
            r7.<init>(r8)
            throw r7
        L8e:
            if (r3 == 0) goto L96
            boolean r1 = r3.booleanValue()
            if (r1 != 0) goto Lb5
        L96:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lb9
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "The Google Mobile Ads SDK is integrated by "
            int r2 = r0.length()
            if (r2 == 0) goto Lad
            java.lang.String r0 = r1.concat(r0)
            goto Lb2
        Lad:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        Lb2:
            n3.g1.e(r0)
        Lb5:
            super.attachInfo(r7, r8)
            return
        Lb9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n"
            r7.<init>(r8)
            throw r7
        Lc1:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value."
            r8.<init>(r0, r7)
            throw r8
        Lca:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value."
            r8.<init>(r0, r7)
            throw r8
        Ld3:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value."
            r8.<init>(r0, r7)
            throw r8
        Ldc:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value."
            r8.<init>(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.zq.attachInfo(android.content.Context, android.content.pm.ProviderInfo):void");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
