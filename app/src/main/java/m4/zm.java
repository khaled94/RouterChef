package m4;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class zm extends ba implements mo {

    /* renamed from: s */
    public final ym f16276s;

    public zm(ym ymVar) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f16276s = ymVar;
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            a();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    @Override // m4.mo
    public final void a() {
        this.f16276s.N();
    }
}
