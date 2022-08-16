package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class lf1 implements dh1<Bundle> {

    /* renamed from: a */
    public final Bundle f10750a;

    public lf1(Bundle bundle) {
        this.f10750a = bundle;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle a10 = vm1.a(bundle2, "device");
        a10.putBundle("android_mem_info", this.f10750a);
        bundle2.putBundle("device", a10);
    }
}
