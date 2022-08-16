package g5;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import n0.j;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a */
    public final /* synthetic */ SwipeDismissBehavior f4892a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4892a = swipeDismissBehavior;
    }

    @Override // n0.j
    public final boolean a(View view) {
        boolean z10 = false;
        if (this.f4892a.s(view)) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            boolean z11 = z.e.d(view) == 1;
            int i10 = this.f4892a.f3017c;
            if ((i10 == 0 && z11) || (i10 == 1 && !z11)) {
                z10 = true;
            }
            int width = view.getWidth();
            if (z10) {
                width = -width;
            }
            view.offsetLeftAndRight(width);
            view.setAlpha(0.0f);
            Objects.requireNonNull(this.f4892a);
            return true;
        }
        return false;
    }
}
