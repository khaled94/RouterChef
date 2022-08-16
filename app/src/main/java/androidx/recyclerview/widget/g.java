package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.a0 f2109a;

    /* renamed from: b */
    public final /* synthetic */ View f2110b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f2111c;

    /* renamed from: d */
    public final /* synthetic */ k f2112d;

    public g(k kVar, RecyclerView.a0 a0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2112d = kVar;
        this.f2109a = a0Var;
        this.f2110b = view;
        this.f2111c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2110b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2111c.setListener(null);
        this.f2112d.c(this.f2109a);
        this.f2112d.f2135o.remove(this.f2109a);
        this.f2112d.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2112d);
    }
}
