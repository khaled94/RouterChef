package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f3259a;

    /* renamed from: b */
    public final /* synthetic */ d.g f3260b;

    /* renamed from: c */
    public final /* synthetic */ d f3261c;

    public c(d dVar, boolean z10, d.g gVar) {
        this.f3261c = dVar;
        this.f3259a = z10;
        this.f3260b = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f3261c;
        dVar.f3276n = 0;
        dVar.f3270h = null;
        d.g gVar = this.f3260b;
        if (gVar != null) {
            ((a) gVar).f3253a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3261c.f3279r.b(0, this.f3259a);
        d dVar = this.f3261c;
        dVar.f3276n = 2;
        dVar.f3270h = animator;
    }
}
