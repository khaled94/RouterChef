package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.a0 f2113a;

    /* renamed from: b */
    public final /* synthetic */ int f2114b;

    /* renamed from: c */
    public final /* synthetic */ View f2115c;

    /* renamed from: d */
    public final /* synthetic */ int f2116d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f2117e;

    /* renamed from: f */
    public final /* synthetic */ k f2118f;

    public h(k kVar, RecyclerView.a0 a0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2118f = kVar;
        this.f2113a = a0Var;
        this.f2114b = i10;
        this.f2115c = view;
        this.f2116d = i11;
        this.f2117e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f2114b != 0) {
            this.f2115c.setTranslationX(0.0f);
        }
        if (this.f2116d != 0) {
            this.f2115c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2117e.setListener(null);
        this.f2118f.c(this.f2113a);
        this.f2118f.p.remove(this.f2113a);
        this.f2118f.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2118f);
    }
}
