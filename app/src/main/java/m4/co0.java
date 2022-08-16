package m4;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public final class co0 {

    /* renamed from: a */
    public final zo1 f7087a;

    /* renamed from: b */
    public final o90 f7088b;

    /* renamed from: c */
    public final ApplicationInfo f7089c;

    /* renamed from: d */
    public final String f7090d;

    /* renamed from: e */
    public final List<String> f7091e;

    /* renamed from: f */
    public final PackageInfo f7092f;

    /* renamed from: g */
    public final jd2<tz1<String>> f7093g;

    /* renamed from: h */
    public final String f7094h;

    /* renamed from: i */
    public final hh1<Bundle> f7095i;

    public co0(zo1 zo1Var, o90 o90Var, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, jd2 jd2Var, String str2, hh1 hh1Var) {
        this.f7087a = zo1Var;
        this.f7088b = o90Var;
        this.f7089c = applicationInfo;
        this.f7090d = str;
        this.f7091e = list;
        this.f7092f = packageInfo;
        this.f7093g = jd2Var;
        this.f7094h = str2;
        this.f7095i = hh1Var;
    }

    public final tz1<Bundle> a() {
        zo1 zo1Var = this.f7087a;
        return qo1.b(this.f7095i.a(new Bundle()), wo1.SIGNALS, zo1Var).a();
    }

    public final tz1<o50> b() {
        tz1<Bundle> a10 = a();
        return this.f7087a.a(wo1.REQUEST_PARCEL, a10, this.f7093g.a()).a(new r70(this, a10, 1)).a();
    }
}
