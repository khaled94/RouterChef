package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ef1 implements dh1<Bundle> {

    /* renamed from: a */
    public final Boolean f7837a;

    public ef1(Boolean bool) {
        this.f7837a = bool;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Bundle bundle) {
        Bundle bundle2 = bundle;
        Boolean bool = this.f7837a;
        if (bool != null) {
            bundle2.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
