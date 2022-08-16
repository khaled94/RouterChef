package m4;

import android.os.DeadObjectException;
import androidx.activity.k;
import d4.b;

/* loaded from: classes.dex */
public final class oy implements b.a {

    /* renamed from: a */
    public final /* synthetic */ w90 f12306a;

    /* renamed from: b */
    public final /* synthetic */ qy f12307b;

    public oy(qy qyVar, w90 w90Var) {
        this.f12307b = qyVar;
        this.f12306a = w90Var;
    }

    @Override // d4.b.a
    public final void e0() {
        try {
            this.f12306a.a((ly) this.f12307b.f13017a.v());
        } catch (DeadObjectException e10) {
            this.f12306a.c(e10);
        }
    }

    @Override // d4.b.a
    public final void w(int i10) {
        this.f12306a.c(new RuntimeException(k.a(34, "onConnectionSuspended: ", i10)));
    }
}
