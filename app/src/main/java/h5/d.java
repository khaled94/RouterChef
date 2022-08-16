package h5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f5087a;

    /* renamed from: b */
    public final /* synthetic */ ActionMenuView f5088b;

    /* renamed from: c */
    public final /* synthetic */ int f5089c;

    /* renamed from: d */
    public final /* synthetic */ boolean f5090d;

    /* renamed from: e */
    public final /* synthetic */ BottomAppBar f5091e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f5091e = bottomAppBar;
        this.f5088b = actionMenuView;
        this.f5089c = i10;
        this.f5090d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f5087a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f5087a) {
            BottomAppBar bottomAppBar = this.f5091e;
            int i10 = bottomAppBar.f3035q0;
            boolean z10 = i10 != 0;
            if (i10 != 0) {
                bottomAppBar.f3035q0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.o(i10);
            }
            BottomAppBar bottomAppBar2 = this.f5091e;
            ActionMenuView actionMenuView = this.f5088b;
            int i11 = this.f5089c;
            boolean z11 = this.f5090d;
            Objects.requireNonNull(bottomAppBar2);
            e eVar = new e(bottomAppBar2, actionMenuView, i11, z11);
            if (z10) {
                actionMenuView.post(eVar);
            } else {
                eVar.run();
            }
        }
    }
}
