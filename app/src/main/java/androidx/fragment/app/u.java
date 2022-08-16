package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import m0.t;

/* loaded from: classes.dex */
public final class u {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Animation f1586a;

        /* renamed from: b */
        public final Animator f1587b;

        public a(Animator animator) {
            this.f1586a = null;
            this.f1587b = animator;
        }

        public a(Animation animation) {
            this.f1586a = animation;
            this.f1587b = null;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: s */
        public final ViewGroup f1588s;

        /* renamed from: t */
        public final View f1589t;

        /* renamed from: u */
        public boolean f1590u;

        /* renamed from: v */
        public boolean f1591v;

        /* renamed from: w */
        public boolean f1592w = true;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1588s = viewGroup;
            this.f1589t = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j3, Transformation transformation) {
            this.f1592w = true;
            if (this.f1590u) {
                return !this.f1591v;
            }
            if (!super.getTransformation(j3, transformation)) {
                this.f1590u = true;
                t.a(this.f1588s, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j3, Transformation transformation, float f10) {
            this.f1592w = true;
            if (this.f1590u) {
                return !this.f1591v;
            }
            if (!super.getTransformation(j3, transformation, f10)) {
                this.f1590u = true;
                t.a(this.f1588s, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f1590u || !this.f1592w) {
                this.f1588s.endViewTransition(this.f1589t);
                this.f1591v = true;
                return;
            }
            this.f1592w = false;
            this.f1588s.post(this);
        }
    }

    public static int a(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
