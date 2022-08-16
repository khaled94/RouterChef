package m4;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class ag1 implements eh1, dh1 {

    /* renamed from: a */
    public final ApplicationInfo f6139a;

    /* renamed from: b */
    public final PackageInfo f6140b;

    public ag1(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f6139a = applicationInfo;
        this.f6140b = packageInfo;
    }

    @Override // m4.eh1
    public final tz1<dh1<Bundle>> a() {
        return mz1.m(this);
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f6139a.packageName;
        PackageInfo packageInfo = this.f6140b;
        String str2 = null;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        PackageInfo packageInfo2 = this.f6140b;
        if (packageInfo2 != null) {
            str2 = packageInfo2.versionName;
        }
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }
}
