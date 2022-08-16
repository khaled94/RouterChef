package m4;

import android.os.IBinder;
import android.os.IInterface;
import k4.c;

/* loaded from: classes.dex */
public final class hn extends c<ap> {
    public hn() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // k4.c
    public final /* synthetic */ ap a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof ap ? (ap) queryLocalInterface : new ap(iBinder);
    }
}
