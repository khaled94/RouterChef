package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ee1 implements dh1<Bundle> {

    /* renamed from: a */
    public final int f7809a;

    /* renamed from: b */
    public final boolean f7810b;

    /* renamed from: c */
    public final boolean f7811c;

    /* renamed from: d */
    public final int f7812d;

    /* renamed from: e */
    public final int f7813e;

    /* renamed from: f */
    public final int f7814f;

    /* renamed from: g */
    public final float f7815g;

    /* renamed from: h */
    public final boolean f7816h;

    public ee1(int i10, boolean z10, boolean z11, int i11, int i12, int i13, float f10, boolean z12) {
        this.f7809a = i10;
        this.f7810b = z10;
        this.f7811c = z11;
        this.f7812d = i11;
        this.f7813e = i12;
        this.f7814f = i13;
        this.f7815g = f10;
        this.f7816h = z12;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("am", this.f7809a);
        bundle2.putBoolean("ma", this.f7810b);
        bundle2.putBoolean("sp", this.f7811c);
        bundle2.putInt("muv", this.f7812d);
        bundle2.putInt("rm", this.f7813e);
        bundle2.putInt("riv", this.f7814f);
        bundle2.putFloat("android_app_volume", this.f7815g);
        bundle2.putBoolean("android_app_muted", this.f7816h);
    }
}
