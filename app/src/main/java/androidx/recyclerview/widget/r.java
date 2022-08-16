package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r extends s {
    public r(RecyclerView.m mVar) {
        super(mVar);
    }

    @Override // androidx.recyclerview.widget.s
    public final int b(View view) {
        return this.f2210a.A(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        Objects.requireNonNull(this.f2210a);
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f1977b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        Objects.requireNonNull(this.f2210a);
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f1977b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int e(View view) {
        return this.f2210a.E(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int f() {
        return this.f2210a.f1969q;
    }

    @Override // androidx.recyclerview.widget.s
    public final int g() {
        RecyclerView.m mVar = this.f2210a;
        return mVar.f1969q - mVar.J();
    }

    @Override // androidx.recyclerview.widget.s
    public final int h() {
        return this.f2210a.J();
    }

    @Override // androidx.recyclerview.widget.s
    public final int i() {
        return this.f2210a.f1968o;
    }

    @Override // androidx.recyclerview.widget.s
    public final int j() {
        return this.f2210a.f1967n;
    }

    @Override // androidx.recyclerview.widget.s
    public final int k() {
        return this.f2210a.M();
    }

    @Override // androidx.recyclerview.widget.s
    public final int l() {
        RecyclerView.m mVar = this.f2210a;
        return (mVar.f1969q - mVar.M()) - this.f2210a.J();
    }

    @Override // androidx.recyclerview.widget.s
    public final int n(View view) {
        this.f2210a.Q(view, this.f2212c);
        return this.f2212c.bottom;
    }

    @Override // androidx.recyclerview.widget.s
    public final int o(View view) {
        this.f2210a.Q(view, this.f2212c);
        return this.f2212c.top;
    }

    @Override // androidx.recyclerview.widget.s
    public final void p(int i10) {
        this.f2210a.V(i10);
    }
}
