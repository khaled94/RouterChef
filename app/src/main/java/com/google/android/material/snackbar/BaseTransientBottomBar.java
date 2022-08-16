package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.raouf.routerchef.R;
import f0.a;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import u5.s;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    public static final /* synthetic */ int f3308a = 0;

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: h */
        public final b f3309h = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            Objects.requireNonNull(this.f3309h);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    synchronized (b6.a.a().f2589a) {
                    }
                }
            } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                synchronized (b6.a.a().f2589a) {
                }
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean s(View view) {
            Objects.requireNonNull(this.f3309h);
            return view instanceof c;
        }
    }

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                Objects.requireNonNull((BaseTransientBottomBar) message.obj);
                throw null;
            } else if (i10 != 1) {
                return false;
            } else {
                Objects.requireNonNull((BaseTransientBottomBar) message.obj);
                throw null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            Objects.requireNonNull(swipeDismissBehavior);
            swipeDismissBehavior.f3019e = SwipeDismissBehavior.t(0.1f);
            swipeDismissBehavior.f3020f = SwipeDismissBehavior.t(0.6f);
            swipeDismissBehavior.f3017c = 0;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends FrameLayout {
        public static final a C = new a();
        public Rect A;
        public boolean B;

        /* renamed from: s */
        public BaseTransientBottomBar<?> f3310s;

        /* renamed from: t */
        public int f3311t;

        /* renamed from: u */
        public final float f3312u;

        /* renamed from: v */
        public final float f3313v;

        /* renamed from: w */
        public final int f3314w;

        /* renamed from: x */
        public final int f3315x;
        public ColorStateList y;

        /* renamed from: z */
        public PorterDuff.Mode f3316z;

        /* loaded from: classes.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public c(Context context, AttributeSet attributeSet) {
            super(e6.a.a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, h6.a.Q);
            if (obtainStyledAttributes.hasValue(6)) {
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                z.i.s(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f3311t = obtainStyledAttributes.getInt(2, 0);
            this.f3312u = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(x5.c.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(s.b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f3313v = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f3314w = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f3315x = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(C);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(h6.a.f(h6.a.b(this, R.attr.colorSurface), h6.a.b(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
                ColorStateList colorStateList = this.y;
                if (colorStateList != null) {
                    a.b.h(gradientDrawable, colorStateList);
                }
                WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
                z.d.q(this, gradientDrawable);
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f3310s = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f3313v;
        }

        public int getAnimationMode() {
            return this.f3311t;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f3312u;
        }

        public int getMaxInlineActionWidth() {
            return this.f3315x;
        }

        public int getMaxWidth() {
            return this.f3314w;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f3310s;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.a();
            }
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.h.c(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f3310s != null) {
                synchronized (b6.a.a().f2589a) {
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f3314w > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f3314w;
                if (measuredWidth <= i12) {
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        public void setAnimationMode(int i10) {
            this.f3311t = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.y != null) {
                drawable = drawable.mutate();
                a.b.h(drawable, this.y);
                a.b.i(drawable, this.f3316z);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.y = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.h(mutate, colorStateList);
                a.b.i(mutate, this.f3316z);
                if (mutate == getBackground()) {
                    return;
                }
                super.setBackgroundDrawable(mutate);
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f3316z = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.i(mutate, mode);
                if (mutate == getBackground()) {
                    return;
                }
                super.setBackgroundDrawable(mutate);
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.B || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.A = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f3310s;
            if (baseTransientBottomBar == null) {
                return;
            }
            int i10 = BaseTransientBottomBar.f3308a;
            Objects.requireNonNull(baseTransientBottomBar);
            throw null;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : C);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        new Handler(Looper.getMainLooper(), new a());
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw null;
    }
}
