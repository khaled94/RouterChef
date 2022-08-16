package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class if1 implements dh1<Bundle> {

    /* renamed from: a */
    public final String f9622a;

    /* renamed from: b */
    public final boolean f9623b;

    /* renamed from: c */
    public final boolean f9624c;

    public if1(String str, boolean z10, boolean z11) {
        this.f9622a = str;
        this.f9623b = z10;
        this.f9624c = z11;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!this.f9622a.isEmpty()) {
            bundle2.putString("inspector_extras", this.f9622a);
        }
        bundle2.putInt("test_mode", this.f9623b ? 1 : 0);
        bundle2.putInt("linked_device", this.f9624c ? 1 : 0);
    }
}
