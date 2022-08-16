package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ k.a f2123a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f2124b;

    /* renamed from: c */
    public final /* synthetic */ View f2125c;

    /* renamed from: d */
    public final /* synthetic */ k f2126d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2126d = kVar;
        this.f2123a = aVar;
        this.f2124b = viewPropertyAnimator;
        this.f2125c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2124b.setListener(null);
        this.f2125c.setAlpha(1.0f);
        this.f2125c.setTranslationX(0.0f);
        this.f2125c.setTranslationY(0.0f);
        this.f2126d.c(this.f2123a.f2139b);
        this.f2126d.f2137r.remove(this.f2123a.f2139b);
        this.f2126d.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        k kVar = this.f2126d;
        RecyclerView.a0 a0Var = this.f2123a.f2139b;
        Objects.requireNonNull(kVar);
    }
}
