package d4;

import a4.b;
import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class g0 extends p0<Boolean> {

    /* renamed from: d */
    public final int f3876d;

    /* renamed from: e */
    public final Bundle f3877e;

    /* renamed from: f */
    public final /* synthetic */ b f3878f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(b bVar, int i10, Bundle bundle) {
        super(bVar);
        this.f3878f = bVar;
        this.f3876d = i10;
        this.f3877e = bundle;
    }

    @Override // d4.p0
    public final void a() {
        if (this.f3876d != 0) {
            this.f3878f.D(1, null);
            Bundle bundle = this.f3877e;
            d(new b(this.f3876d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
        } else if (e()) {
        } else {
            this.f3878f.D(1, null);
            d(new b(8, null, null));
        }
    }

    @Override // d4.p0
    public final void b() {
    }

    public abstract void d(b bVar);

    public abstract boolean e();
}
