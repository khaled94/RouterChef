package m4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import d.a;

/* loaded from: classes.dex */
public final class l31 implements nd2<ApplicationInfo> {

    /* renamed from: a */
    public final vd2<Context> f10652a;

    public l31(vd2<Context> vd2Var) {
        this.f10652a = vd2Var;
    }

    /* renamed from: b */
    public final ApplicationInfo a() {
        ApplicationInfo applicationInfo = this.f10652a.a().getApplicationInfo();
        a.d(applicationInfo);
        return applicationInfo;
    }
}
