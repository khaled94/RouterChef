package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class te1 implements dh1<Bundle> {

    /* renamed from: a */
    public final String f14036a;

    /* renamed from: b */
    public final String f14037b;

    /* renamed from: c */
    public final Bundle f14038c;

    public /* synthetic */ te1(String str, String str2, Bundle bundle) {
        this.f14036a = str;
        this.f14037b = str2;
        this.f14038c = bundle;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("consent_string", this.f14036a);
        bundle2.putString("fc_consent", this.f14037b);
        bundle2.putBundle("iab_consent_info", this.f14038c);
    }
}
