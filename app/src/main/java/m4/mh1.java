package m4;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class mh1 implements dh1<Bundle> {

    /* renamed from: a */
    public final String f11205a;

    /* renamed from: b */
    public final int f11206b;

    /* renamed from: c */
    public final int f11207c;

    /* renamed from: d */
    public final int f11208d;

    /* renamed from: e */
    public final boolean f11209e;

    /* renamed from: f */
    public final int f11210f;

    public mh1(String str, int i10, int i11, int i12, boolean z10, int i13) {
        this.f11205a = str;
        this.f11206b = i10;
        this.f11207c = i11;
        this.f11208d = i12;
        this.f11209e = z10;
        this.f11210f = i13;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.f11205a;
        boolean z10 = true;
        vm1.f(bundle2, "carrier", str, !TextUtils.isEmpty(str));
        Integer valueOf = Integer.valueOf(this.f11206b);
        if (this.f11206b == -2) {
            z10 = false;
        }
        vm1.e(bundle2, "cnt", valueOf, z10);
        bundle2.putInt("gnt", this.f11207c);
        bundle2.putInt("pt", this.f11208d);
        Bundle a10 = vm1.a(bundle2, "device");
        bundle2.putBundle("device", a10);
        Bundle a11 = vm1.a(a10, "network");
        a10.putBundle("network", a11);
        a11.putInt("active_network_state", this.f11210f);
        a11.putBoolean("active_network_metered", this.f11209e);
    }
}
