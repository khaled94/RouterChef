package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q extends s {
    public q(RecyclerView.m mVar) {
        super(mVar);
    }

    @Override // androidx.recyclerview.widget.s
    public final int b(View view) {
        return this.f2210a.D(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        Objects.requireNonNull(this.f2210a);
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f1977b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        Objects.requireNonNull(this.f2210a);
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f1977b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int e(View view) {
        return this.f2210a.C(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int f() {
        return this.f2210a.p;
    }

    @Override // androidx.recyclerview.widget.s
    public final int g() {
        RecyclerView.m mVar = this.f2210a;
        return mVar.p - mVar.L();
    }

    @Override // androidx.recyclerview.widget.s
    public final int h() {
        return this.f2210a.L();
    }

    @Override // androidx.recyclerview.widget.s
    public final int i() {
        return this.f2210a.f1967n;
    }

    @Override // androidx.recyclerview.widget.s
    public final int j() {
        return this.f2210a.f1968o;
    }

    @Override // androidx.recyclerview.widget.s
    public final int k() {
        return this.f2210a.K();
    }

    @Override // androidx.recyclerview.widget.s
    public final int l() {
        RecyclerView.m mVar = this.f2210a;
        return (mVar.p - mVar.K()) - this.f2210a.L();
    }

    @Override // androidx.recyclerview.widget.s
    public final int n(View view) {
        this.f2210a.Q(view, this.f2212c);
        return this.f2212c.right;
    }

    @Override // androidx.recyclerview.widget.s
    public final int o(View view) {
        this.f2210a.Q(view, this.f2212c);
        return this.f2212c.left;
    }

    @Override // androidx.recyclerview.widget.s
    public final void p(int i10) {
        this.f2210a.U(i10);
    }
}
