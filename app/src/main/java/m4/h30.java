package m4;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import d.d;
import l3.s;
import s4.v0;

/* loaded from: classes.dex */
public final class h30 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f9092s;

    /* renamed from: t */
    public final /* synthetic */ Object f9093t;

    /* renamed from: u */
    public final /* synthetic */ Object f9094u;

    public /* synthetic */ h30(Object obj, Object obj2, int i10) {
        this.f9092s = i10;
        this.f9094u = obj;
        this.f9093t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9092s) {
            case 0:
                d dVar = s.B.f5788b;
                d.e(((zzcaf) this.f9094u).f2961a, (AdOverlayInfoParcel) this.f9093t, true);
                return;
            default:
                ((AppMeasurementDynamiteService) this.f9094u).f2969s.z().A((v0) this.f9093t, ((AppMeasurementDynamiteService) this.f9094u).f2969s.e());
                return;
        }
    }
}
