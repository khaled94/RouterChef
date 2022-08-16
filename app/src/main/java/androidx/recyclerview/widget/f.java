package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.a0 f2105a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f2106b;

    /* renamed from: c */
    public final /* synthetic */ View f2107c;

    /* renamed from: d */
    public final /* synthetic */ k f2108d;

    public f(k kVar, RecyclerView.a0 a0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2108d = kVar;
        this.f2105a = a0Var;
        this.f2106b = viewPropertyAnimator;
        this.f2107c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2106b.setListener(null);
        this.f2107c.setAlpha(1.0f);
        this.f2108d.c(this.f2105a);
        this.f2108d.f2136q.remove(this.f2105a);
        this.f2108d.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2108d);
    }
}
