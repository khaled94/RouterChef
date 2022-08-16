package m4;

import android.os.Parcel;
import g3.c;

/* loaded from: classes.dex */
public final class wh extends ba implements ip {

    /* renamed from: t */
    public static final /* synthetic */ int f15021t = 0;

    /* renamed from: s */
    public final c f15022s;

    public wh(c cVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.f15022s = cVar;
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            d2(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    @Override // m4.ip
    public final void d2(String str, String str2) {
        this.f15022s.a(str, str2);
    }
}
