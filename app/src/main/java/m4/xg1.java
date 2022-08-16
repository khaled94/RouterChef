package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class xg1 implements dh1<Bundle> {

    /* renamed from: a */
    public final boolean f15332a;

    /* renamed from: b */
    public final boolean f15333b;

    /* renamed from: c */
    public final String f15334c;

    /* renamed from: d */
    public final boolean f15335d;

    /* renamed from: e */
    public final int f15336e;

    /* renamed from: f */
    public final int f15337f;

    /* renamed from: g */
    public final int f15338g;

    public xg1(boolean z10, boolean z11, String str, boolean z12, int i10, int i11, int i12) {
        this.f15332a = z10;
        this.f15333b = z11;
        this.f15334c = str;
        this.f15335d = z12;
        this.f15336e = i10;
        this.f15337f = i11;
        this.f15338g = i12;
    }

    @Override // m4.dh1
    public final void h(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.f15334c);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) jo.f10145d.f10148c.a(es.f8052a2));
        bundle2.putInt("target_api", this.f15336e);
        bundle2.putInt("dv", this.f15337f);
        bundle2.putInt("lv", this.f15338g);
        Bundle a10 = vm1.a(bundle2, "sdk_env");
        a10.putBoolean("mf", mt.f11294a.e().booleanValue());
        a10.putBoolean("instant_app", this.f15332a);
        a10.putBoolean("lite", this.f15333b);
        a10.putBoolean("is_privileged_process", this.f15335d);
        bundle2.putBundle("sdk_env", a10);
        Bundle a11 = vm1.a(a10, "build_meta");
        a11.putString("cl", "428884702");
        a11.putString("rapid_rc", "dev");
        a11.putString("rapid_rollup", "HEAD");
        a10.putBundle("build_meta", a11);
    }
}
