package j4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import h4.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final Context f5450a;

    public b(Context context) {
        this.f5450a = context;
    }

    public final int a(String str, String str2) {
        return this.f5450a.getPackageManager().checkPermission(str, str2);
    }

    public final ApplicationInfo b(String str, int i10) {
        return this.f5450a.getPackageManager().getApplicationInfo(str, i10);
    }

    public final CharSequence c(String str) {
        return this.f5450a.getPackageManager().getApplicationLabel(this.f5450a.getPackageManager().getApplicationInfo(str, 0));
    }

    public final PackageInfo d(String str, int i10) {
        return this.f5450a.getPackageManager().getPackageInfo(str, i10);
    }

    public final boolean e() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f5450a);
        }
        if (f.a() && (nameForUid = this.f5450a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            return this.f5450a.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
