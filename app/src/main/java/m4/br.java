package m4;

import android.os.IBinder;
import android.os.IInterface;
import k4.c;

/* loaded from: classes.dex */
public final class br extends c<up> {
    public br() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // k4.c
    public final /* synthetic */ up a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof up ? (up) queryLocalInterface : new up(iBinder);
    }
}
