package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.b1;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e5.g;
import e5.h;
import e5.i;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f3440c;

    /* renamed from: d */
    public final RectF f3441d;

    /* renamed from: e */
    public final RectF f3442e;

    /* renamed from: f */
    public final int[] f3443f;

    /* renamed from: g */
    public float f3444g;

    /* renamed from: h */
    public float f3445h;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f3446a;

        /* renamed from: b */
        public final /* synthetic */ View f3447b;

        /* renamed from: c */
        public final /* synthetic */ View f3448c;

        public a(boolean z10, View view, View view2) {
            this.f3446a = z10;
            this.f3447b = view;
            this.f3448c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f3446a) {
                this.f3447b.setVisibility(4);
                this.f3448c.setAlpha(1.0f);
                this.f3448c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f3446a) {
                this.f3447b.setVisibility(0);
                this.f3448c.setAlpha(0.0f);
                this.f3448c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public g f3449a;

        /* renamed from: b */
        public i f3450b;
    }

    public FabTransformationBehavior() {
        this.f3440c = new Rect();
        this.f3441d = new RectF();
        this.f3442e = new RectF();
        this.f3443f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3440c = new Rect();
        this.f3441d = new RectF();
        this.f3442e = new RectF();
        this.f3443f = new int[2];
    }

    public abstract b A(Context context, boolean z10);

    public final ViewGroup B(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean b(View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        if (fVar.f1249h == 0) {
            fVar.f1249h = 80;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03cf A[LOOP:1: B:111:0x03cd->B:112:0x03cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0350  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.AnimatorSet t(android.view.View r27, android.view.View r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.t(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final void u(View view, RectF rectF) {
        z(view, rectF);
        rectF.offset(this.f3444g, this.f3445h);
    }

    public final Pair<h, h> v(float f10, float f11, boolean z10, b bVar) {
        String str;
        g gVar;
        h hVar;
        int i10;
        if (f10 == 0.0f || f11 == 0.0f) {
            hVar = bVar.f3449a.c("translationXLinear");
            gVar = bVar.f3449a;
            str = "translationYLinear";
        } else if ((!z10 || f11 >= 0.0f) && (z10 || i10 <= 0)) {
            hVar = bVar.f3449a.c("translationXCurveDownwards");
            gVar = bVar.f3449a;
            str = "translationYCurveDownwards";
        } else {
            hVar = bVar.f3449a.c("translationXCurveUpwards");
            gVar = bVar.f3449a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(hVar, gVar.c(str));
    }

    public final float w(View view, View view2, i iVar) {
        RectF rectF = this.f3441d;
        RectF rectF2 = this.f3442e;
        u(view, rectF);
        z(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float x(View view, View view2, i iVar) {
        RectF rectF = this.f3441d;
        RectF rectF2 = this.f3442e;
        u(view, rectF);
        z(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float y(b bVar, h hVar, float f10) {
        long j3 = hVar.f4422a;
        long j10 = hVar.f4423b;
        h c10 = bVar.f3449a.c("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((c10.f4422a + c10.f4423b) + 17) - j3)) / ((float) j10));
        LinearInterpolator linearInterpolator = e5.a.f4408a;
        return b1.a(0.0f, f10, interpolation, f10);
    }

    public final void z(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f3443f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }
}
