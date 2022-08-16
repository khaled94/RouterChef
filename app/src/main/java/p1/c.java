package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class c extends b0 {

    /* loaded from: classes.dex */
    public class a extends l {

        /* renamed from: a */
        public final /* synthetic */ View f16890a;

        public a(View view) {
            this.f16890a = view;
        }

        @Override // p1.i.d
        public final void a(i iVar) {
            u.c(this.f16890a, 1.0f);
            Objects.requireNonNull(u.f16943a);
            iVar.w(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f16891a;

        /* renamed from: b */
        public boolean f16892b = false;

        public b(View view) {
            this.f16891a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            u.c(this.f16891a, 1.0f);
            if (this.f16892b) {
                this.f16891a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.f16891a;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            if (!z.d.h(view) || this.f16891a.getLayerType() != 0) {
                return;
            }
            this.f16892b = true;
            this.f16891a.setLayerType(2, null);
        }
    }

    public c() {
    }

    public c(int i10) {
        if ((i10 & (-4)) == 0) {
            this.P = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    @Override // p1.b0
    public final Animator N(View view, p pVar) {
        Float f10;
        Objects.requireNonNull(u.f16943a);
        return O(view, (pVar == null || (f10 = (Float) pVar.f16932a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f10.floatValue(), 0.0f);
    }

    public final Animator O(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        u.c(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, u.f16944b, f11);
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    @Override // p1.i
    public final void g(p pVar) {
        L(pVar);
        pVar.f16932a.put("android:fade:transitionAlpha", Float.valueOf(u.a(pVar.f16933b)));
    }
}
