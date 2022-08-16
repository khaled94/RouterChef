package m4;

import android.graphics.drawable.Drawable;
import k4.a;
import k4.b;

/* loaded from: classes.dex */
public final class tu0 extends su {

    /* renamed from: s */
    public final ev0 f14166s;

    /* renamed from: t */
    public a f14167t;

    public tu0(ev0 ev0Var) {
        this.f14166s = ev0Var;
    }

    public static float N3(a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) b.e0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // m4.tu
    public final a h() {
        a aVar = this.f14167t;
        if (aVar != null) {
            return aVar;
        }
        vu n10 = this.f14166s.n();
        if (n10 != null) {
            return n10.d();
        }
        return null;
    }
}
