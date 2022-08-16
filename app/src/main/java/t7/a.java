package t7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import c0.a;
import l7.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final c f18696a;

    /* renamed from: b */
    public boolean f18697b;

    public a(Context context, String str, c cVar) {
        boolean z10;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            Object obj = c0.a.f2602a;
            context = i10 >= 24 ? a.d.a(context) : null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f18696a = cVar;
        boolean z11 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z11 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z10 = z11;
        }
        this.f18697b = z10;
    }
}
