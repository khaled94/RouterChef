package u7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import h4.f;
import h6.d;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a */
    public final Context f19603a;

    /* renamed from: b */
    public String f19604b;

    /* renamed from: c */
    public String f19605c;

    /* renamed from: d */
    public int f19606d;

    /* renamed from: e */
    public int f19607e = 0;

    public z(Context context) {
        this.f19603a = context;
    }

    public static String b(d dVar) {
        dVar.a();
        String str = dVar.f5114c.f5132e;
        if (str != null) {
            return str;
        }
        dVar.a();
        String str2 = dVar.f5114c.f5129b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (!str3.isEmpty()) {
            return str3;
        }
        return null;
    }

    public final synchronized String a() {
        if (this.f19604b == null) {
            e();
        }
        return this.f19604b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.f19603a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public final boolean d() {
        int i10;
        synchronized (this) {
            int i11 = this.f19607e;
            if (i11 == 0) {
                PackageManager packageManager = this.f19603a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    if (!f.a()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f19607e = 1;
                            i10 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    i10 = 2;
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (f.a()) {
                            this.f19607e = 2;
                        } else {
                            this.f19607e = 1;
                        }
                        i11 = this.f19607e;
                    } else {
                        this.f19607e = 2;
                    }
                }
            }
            i10 = i11;
        }
        return i10 != 0;
    }

    public final synchronized void e() {
        PackageInfo c10 = c(this.f19603a.getPackageName());
        if (c10 != null) {
            this.f19604b = Integer.toString(c10.versionCode);
            this.f19605c = c10.versionName;
        }
    }
}
