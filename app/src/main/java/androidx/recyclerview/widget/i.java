package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ k.a f2119a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f2120b;

    /* renamed from: c */
    public final /* synthetic */ View f2121c;

    /* renamed from: d */
    public final /* synthetic */ k f2122d;

    public i(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2122d = kVar;
        this.f2119a = aVar;
        this.f2120b = viewPropertyAnimator;
        this.f2121c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2120b.setListener(null);
        this.f2121c.setAlpha(1.0f);
        this.f2121c.setTranslationX(0.0f);
        this.f2121c.setTranslationY(0.0f);
        this.f2122d.c(this.f2119a.f2138a);
        this.f2122d.f2137r.remove(this.f2119a.f2138a);
        this.f2122d.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        k kVar = this.f2122d;
        RecyclerView.a0 a0Var = this.f2119a.f2138a;
        Objects.requireNonNull(kVar);
    }
}
