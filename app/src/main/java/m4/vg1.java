package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class vg1 implements dh1<Bundle> {

    /* renamed from: a */
    public final String f14684a;

    /* renamed from: b */
    public final String f14685b;

    /* renamed from: c */
    public final String f14686c;

    /* renamed from: d */
    public final String f14687d;

    /* renamed from: e */
    public final Long f14688e;

    public vg1(String str, String str2, String str3, String str4, Long l10) {
        this.f14684a = str;
        this.f14685b = str2;
        this.f14686c = str3;
        this.f14687d = str4;
        this.f14688e = l10;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Bundle bundle) {
        Bundle bundle2 = bundle;
        vm1.b(bundle2, "gmp_app_id", this.f14684a);
        vm1.b(bundle2, "fbs_aiid", this.f14685b);
        vm1.b(bundle2, "fbs_aeid", this.f14686c);
        vm1.b(bundle2, "apm_id_origin", this.f14687d);
        Long l10 = this.f14688e;
        if (l10 != null) {
            bundle2.putLong("sai_timeout", l10.longValue());
        }
    }
}
