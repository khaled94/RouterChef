package u5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public final ArrayList<b> f19114a = new ArrayList<>();

    /* renamed from: b */
    public b f19115b = null;

    /* renamed from: c */
    public ValueAnimator f19116c = null;

    /* renamed from: d */
    public final a f19117d = new a();

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
            j.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            j jVar = j.this;
            if (jVar.f19116c == animator) {
                jVar.f19116c = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final int[] f19119a;

        /* renamed from: b */
        public final ValueAnimator f19120b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f19119a = iArr;
            this.f19120b = valueAnimator;
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f19117d);
        this.f19114a.add(bVar);
    }
}
