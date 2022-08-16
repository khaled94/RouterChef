package m4;

import android.content.Context;
import d.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class mf0 implements nd2<WeakReference<Context>> {

    /* renamed from: a */
    public final kf0 f11181a;

    public mf0(kf0 kf0Var) {
        this.f11181a = kf0Var;
    }

    @Override // m4.vd2
    public final Object a() {
        WeakReference<Context> weakReference = this.f11181a.f10403c;
        a.d(weakReference);
        return weakReference;
    }
}
