package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ ArrayList f2101s;

    /* renamed from: t */
    public final /* synthetic */ k f2102t;

    public d(k kVar, ArrayList arrayList) {
        this.f2102t = kVar;
        this.f2101s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f2101s.iterator();
        while (it.hasNext()) {
            k.a aVar = (k.a) it.next();
            k kVar = this.f2102t;
            Objects.requireNonNull(kVar);
            RecyclerView.a0 a0Var = aVar.f2138a;
            View view = null;
            View view2 = a0Var == null ? null : a0Var.f1924a;
            RecyclerView.a0 a0Var2 = aVar.f2139b;
            if (a0Var2 != null) {
                view = a0Var2.f1924a;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(kVar.f1950f);
                kVar.f2137r.add(aVar.f2138a);
                duration.translationX(aVar.f2142e - aVar.f2140c);
                duration.translationY(aVar.f2143f - aVar.f2141d);
                duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                kVar.f2137r.add(aVar.f2139b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f1950f).alpha(1.0f).setListener(new j(kVar, aVar, animate, view)).start();
            }
        }
        this.f2101s.clear();
        this.f2102t.f2134n.remove(this.f2101s);
    }
}
