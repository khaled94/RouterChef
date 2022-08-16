package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.b;

/* loaded from: classes.dex */
public final class v implements b.AbstractC0025b {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f2216a;

    public v(RecyclerView recyclerView) {
        this.f2216a = recyclerView;
    }

    public final View a(int i10) {
        return this.f2216a.getChildAt(i10);
    }

    public final int b() {
        return this.f2216a.getChildCount();
    }

    public final int c(View view) {
        return this.f2216a.indexOfChild(view);
    }

    public final void d(int i10) {
        View childAt = this.f2216a.getChildAt(i10);
        if (childAt != null) {
            this.f2216a.p(childAt);
            childAt.clearAnimation();
        }
        this.f2216a.removeViewAt(i10);
    }
}
