package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ ArrayList f2093s;

    /* renamed from: t */
    public final /* synthetic */ k f2094t;

    public c(k kVar, ArrayList arrayList) {
        this.f2094t = kVar;
        this.f2093s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f2093s.iterator();
        while (it.hasNext()) {
            k.b bVar = (k.b) it.next();
            k kVar = this.f2094t;
            RecyclerView.a0 a0Var = bVar.f2144a;
            int i10 = bVar.f2145b;
            int i11 = bVar.f2146c;
            int i12 = bVar.f2147d;
            int i13 = bVar.f2148e;
            Objects.requireNonNull(kVar);
            View view = a0Var.f1924a;
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (i14 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i15 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            kVar.p.add(a0Var);
            animate.setDuration(kVar.f1949e).setListener(new h(kVar, a0Var, i14, view, i15, animate)).start();
        }
        this.f2093s.clear();
        this.f2094t.f2133m.remove(this.f2093s);
    }
}
