package m4;

import android.os.IBinder;
import android.os.IInterface;
import k4.c;

/* loaded from: classes.dex */
public final class b40 extends c<h40> {
    public b40() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // k4.c
    public final /* synthetic */ h40 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof h40 ? (h40) queryLocalInterface : new f40(iBinder);
    }
}
