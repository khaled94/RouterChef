package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ ArrayList f2103s;

    /* renamed from: t */
    public final /* synthetic */ k f2104t;

    public e(k kVar, ArrayList arrayList) {
        this.f2104t = kVar;
        this.f2103s = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f2103s.iterator();
        while (it.hasNext()) {
            RecyclerView.a0 a0Var = (RecyclerView.a0) it.next();
            k kVar = this.f2104t;
            Objects.requireNonNull(kVar);
            View view = a0Var.f1924a;
            ViewPropertyAnimator animate = view.animate();
            kVar.f2135o.add(a0Var);
            animate.alpha(1.0f).setDuration(kVar.f1947c).setListener(new g(kVar, a0Var, view, animate)).start();
        }
        this.f2103s.clear();
        this.f2104t.f2132l.remove(this.f2103s);
    }
}
