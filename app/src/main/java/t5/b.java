package t5;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: s */
    public final /* synthetic */ d f18671s;

    public b(d dVar) {
        this.f18671s = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        d dVar = this.f18671s;
        float rotation = dVar.f3279r.getRotation();
        if (dVar.f3273k != rotation) {
            dVar.f3273k = rotation;
            dVar.s();
            return true;
        }
        return true;
    }
}
