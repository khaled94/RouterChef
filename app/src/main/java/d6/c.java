package d6;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;

/* loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ a f3946a;

    public c(a aVar) {
        this.f3946a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f3946a.f3953c.setScaleX(floatValue);
        this.f3946a.f3953c.setScaleY(floatValue);
    }
}
