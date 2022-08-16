package m4;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zd1 implements dh1<Bundle> {

    /* renamed from: a */
    public final String f16154a;

    /* renamed from: b */
    public final int f16155b;

    public zd1(String str, int i10) {
        this.f16154a = str;
        this.f16155b = i10;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (TextUtils.isEmpty(this.f16154a) || this.f16155b == -1) {
            return;
        }
        Bundle a10 = vm1.a(bundle2, "pii");
        bundle2.putBundle("pii", a10);
        a10.putString("pvid", this.f16154a);
        a10.putInt("pvid_s", this.f16155b);
    }
}
