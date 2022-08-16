package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f3255a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3256b;

    /* renamed from: c */
    public final /* synthetic */ d.g f3257c;

    /* renamed from: d */
    public final /* synthetic */ d f3258d;

    public b(d dVar, boolean z10, d.g gVar) {
        this.f3258d = dVar;
        this.f3256b = z10;
        this.f3257c = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3255a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f3258d;
        dVar.f3276n = 0;
        dVar.f3270h = null;
        if (!this.f3255a) {
            FloatingActionButton floatingActionButton = dVar.f3279r;
            boolean z10 = this.f3256b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            d.g gVar = this.f3257c;
            if (gVar == null) {
                return;
            }
            a aVar = (a) gVar;
            aVar.f3253a.a(aVar.f3254b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3258d.f3279r.b(0, this.f3256b);
        d dVar = this.f3258d;
        dVar.f3276n = 1;
        dVar.f3270h = animator;
        this.f3255a = false;
    }
}
