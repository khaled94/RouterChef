package f5;

import a6.g;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ g f4527a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f4528b;

    public a(AppBarLayout appBarLayout, g gVar) {
        this.f4528b = appBarLayout;
        this.f4527a = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f4527a.n(floatValue);
        Drawable drawable = this.f4528b.G;
        if (drawable instanceof g) {
            ((g) drawable).n(floatValue);
        }
        Objects.requireNonNull(this.f4528b);
        throw null;
    }
}
