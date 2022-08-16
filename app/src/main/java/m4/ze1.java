package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ze1 implements dh1<Bundle> {

    /* renamed from: a */
    public final String f16162a;

    /* renamed from: b */
    public final boolean f16163b;

    public ze1(String str, boolean z10) {
        this.f16162a = str;
        this.f16163b = z10;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.f16162a);
        if (this.f16163b) {
            bundle2.putString("de", "1");
        }
    }
}
