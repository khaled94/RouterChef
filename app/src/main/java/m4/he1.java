package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class he1 implements dh1<Bundle> {

    /* renamed from: a */
    public final double f9204a;

    /* renamed from: b */
    public final boolean f9205b;

    public he1(double d5, boolean z10) {
        this.f9204a = d5;
        this.f9205b = z10;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle a10 = vm1.a(bundle2, "device");
        bundle2.putBundle("device", a10);
        Bundle a11 = vm1.a(a10, "battery");
        a10.putBundle("battery", a11);
        a11.putBoolean("is_charging", this.f9205b);
        a11.putDouble("battery_level", this.f9204a);
    }
}
