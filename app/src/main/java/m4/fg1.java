package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class fg1 implements dh1<Bundle> {

    /* renamed from: a */
    public final String f8486a;

    /* renamed from: b */
    public final String f8487b;

    public fg1(String str, String str2) {
        this.f8486a = str;
        this.f8487b = str2;
    }

    @Override // m4.dh1
    public final void h(Bundle bundle) {
        bundle.putString("request_id", ((Boolean) jo.f10145d.f10148c.a(es.J4)).booleanValue() ? this.f8487b : this.f8486a);
    }
}
