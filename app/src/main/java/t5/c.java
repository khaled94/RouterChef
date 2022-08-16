package t5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.d;
import java.util.ArrayList;
import z5.b;

/* loaded from: classes.dex */
public final class c extends d {
    public c(FloatingActionButton floatingActionButton, b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final float e() {
        return this.f3279r.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void f(Rect rect) {
        if (FloatingActionButton.this.C) {
            super.f(rect);
            return;
        }
        int i10 = 0;
        if (!(!this.f3264b || this.f3279r.getSizeDimension() >= 0)) {
            i10 = (0 - this.f3279r.getSizeDimension()) / 2;
        }
        rect.set(i10, i10, i10, i10);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void i() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void j() {
        t();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void k(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void l(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.f3262z, u(f10, f12));
        stateListAnimator.addState(d.A, u(f10, f11));
        stateListAnimator.addState(d.B, u(f10, f11));
        stateListAnimator.addState(d.C, u(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f3279r, "elevation", f10).setDuration(0L));
        if (i10 <= 24) {
            FloatingActionButton floatingActionButton = this.f3279r;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f3279r, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.y);
        stateListAnimator.addState(d.D, animatorSet);
        stateListAnimator.addState(d.E, u(0.0f, 0.0f));
        this.f3279r.setStateListAnimator(stateListAnimator);
        if (!q()) {
            return;
        }
        t();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void p() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final boolean q() {
        if (!FloatingActionButton.this.C) {
            if (!this.f3264b || this.f3279r.getSizeDimension() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void s() {
    }

    public final Animator u(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f3279r, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f3279r, View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(d.y);
        return animatorSet;
    }
}
