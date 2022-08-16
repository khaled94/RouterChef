package z3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import h4.f;
import j4.c;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    public final Context f20968a;
    @GuardedBy("this")

    /* renamed from: b */
    public int f20969b;
    @GuardedBy("this")

    /* renamed from: c */
    public int f20970c = 0;

    public u(Context context) {
        this.f20968a = context;
    }

    public final synchronized int a() {
        int i10 = this.f20970c;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f20968a.getPackageManager();
        if (c.a(this.f20968a).a("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!f.a()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f20970c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f20970c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (f.a()) {
            this.f20970c = 2;
            i11 = 2;
        } else {
            this.f20970c = 1;
        }
        return i11;
    }
}
