package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import e.s;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a */
    public final WeakReference<View> f5873a;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ g0 f5874a;

        /* renamed from: b */
        public final /* synthetic */ View f5875b;

        public a(g0 g0Var, View view) {
            this.f5874a = g0Var;
            this.f5875b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f5874a.b(this.f5875b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f5874a.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f5874a.d();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public f0(View view) {
        this.f5873a = new WeakReference<>(view);
    }

    public final f0 a(float f10) {
        View view = this.f5873a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public final void b() {
        View view = this.f5873a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final f0 c(long j3) {
        View view = this.f5873a.get();
        if (view != null) {
            view.animate().setDuration(j3);
        }
        return this;
    }

    public final f0 d(g0 g0Var) {
        View view = this.f5873a.get();
        if (view != null) {
            e(view, g0Var);
        }
        return this;
    }

    public final void e(View view, g0 g0Var) {
        if (g0Var != null) {
            view.animate().setListener(new a(g0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public final f0 f(final i0 i0Var) {
        final View view = this.f5873a.get();
        if (view != null) {
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
            if (i0Var != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: m0.e0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((s.c) i0.this).f4304a.f4281d.getParent()).invalidate();
                    }
                };
            }
            b.a(view.animate(), animatorUpdateListener);
        }
        return this;
    }

    public final f0 g(float f10) {
        View view = this.f5873a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
