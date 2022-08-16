package m4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import j4.c;

/* loaded from: classes.dex */
public final class o31 implements nd2<PackageInfo> {

    /* renamed from: a */
    public final vd2<Context> f11988a;

    /* renamed from: b */
    public final vd2<ApplicationInfo> f11989b;

    public o31(vd2<Context> vd2Var, vd2<ApplicationInfo> vd2Var2) {
        this.f11988a = vd2Var;
        this.f11989b = vd2Var2;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        try {
            return c.a(this.f11988a.a()).d(((l31) this.f11989b).a().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
