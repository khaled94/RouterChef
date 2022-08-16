package com.google.android.material.floatingactionbutton;

import a6.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.b1;
import androidx.lifecycle.h0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.raouf.routerchef.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    public j f3263a;

    /* renamed from: b */
    public boolean f3264b;

    /* renamed from: d */
    public float f3266d;

    /* renamed from: e */
    public float f3267e;

    /* renamed from: f */
    public float f3268f;

    /* renamed from: g */
    public final u5.j f3269g;

    /* renamed from: h */
    public Animator f3270h;

    /* renamed from: i */
    public e5.g f3271i;

    /* renamed from: j */
    public e5.g f3272j;

    /* renamed from: k */
    public float f3273k;

    /* renamed from: m */
    public int f3275m;

    /* renamed from: o */
    public ArrayList<Animator.AnimatorListener> f3277o;
    public ArrayList<Animator.AnimatorListener> p;

    /* renamed from: q */
    public ArrayList<f> f3278q;

    /* renamed from: r */
    public final FloatingActionButton f3279r;

    /* renamed from: s */
    public final z5.b f3280s;

    /* renamed from: x */
    public t5.b f3285x;
    public static final z0.a y = e5.a.f4410c;

    /* renamed from: z */
    public static final int[] f3262z = {16842919, 16842910};
    public static final int[] A = {16843623, 16842908, 16842910};
    public static final int[] B = {16842908, 16842910};
    public static final int[] C = {16843623, 16842910};
    public static final int[] D = {16842910};
    public static final int[] E = new int[0];

    /* renamed from: c */
    public boolean f3265c = true;

    /* renamed from: l */
    public float f3274l = 1.0f;

    /* renamed from: n */
    public int f3276n = 0;

    /* renamed from: t */
    public final Rect f3281t = new Rect();

    /* renamed from: u */
    public final RectF f3282u = new RectF();

    /* renamed from: v */
    public final RectF f3283v = new RectF();

    /* renamed from: w */
    public final Matrix f3284w = new Matrix();

    /* loaded from: classes.dex */
    public class a extends e5.f {
        public a() {
            d.this = r1;
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            d.this.f3274l = f10;
            matrix.getValues(this.f4417a);
            matrix2.getValues(this.f4418b);
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f4418b;
                float f11 = fArr[i10];
                float[] fArr2 = this.f4417a;
                fArr[i10] = ((f11 - fArr2[i10]) * f10) + fArr2[i10];
            }
            this.f4419c.setValues(this.f4418b);
            return this.f4419c;
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f3287a;

        /* renamed from: b */
        public final /* synthetic */ float f3288b;

        /* renamed from: c */
        public final /* synthetic */ float f3289c;

        /* renamed from: d */
        public final /* synthetic */ float f3290d;

        /* renamed from: e */
        public final /* synthetic */ float f3291e;

        /* renamed from: f */
        public final /* synthetic */ float f3292f;

        /* renamed from: g */
        public final /* synthetic */ float f3293g;

        /* renamed from: h */
        public final /* synthetic */ Matrix f3294h;

        public b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            d.this = r1;
            this.f3287a = f10;
            this.f3288b = f11;
            this.f3289c = f12;
            this.f3290d = f13;
            this.f3291e = f14;
            this.f3292f = f15;
            this.f3293g = f16;
            this.f3294h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.f3279r.setAlpha(e5.a.a(this.f3287a, this.f3288b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = d.this.f3279r;
            float f10 = this.f3289c;
            floatingActionButton.setScaleX(((this.f3290d - f10) * floatValue) + f10);
            FloatingActionButton floatingActionButton2 = d.this.f3279r;
            float f11 = this.f3291e;
            floatingActionButton2.setScaleY(((this.f3290d - f11) * floatValue) + f11);
            d dVar = d.this;
            float f12 = this.f3292f;
            float f13 = this.f3293g;
            dVar.f3274l = b1.a(f13, f12, floatValue, f12);
            dVar.a(b1.a(f13, f12, floatValue, f12), this.f3294h);
            d.this.f3279r.setImageMatrix(this.f3294h);
        }
    }

    /* loaded from: classes.dex */
    public class c extends i {
        public c(d dVar) {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    /* loaded from: classes.dex */
    public class C0045d extends i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0045d() {
            super();
            d.this = r1;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = d.this;
            return dVar.f3266d + dVar.f3267e;
        }
    }

    /* loaded from: classes.dex */
    public class e extends i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super();
            d.this = r1;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = d.this;
            return dVar.f3266d + dVar.f3268f;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h extends i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h() {
            super();
            d.this = r1;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return d.this.f3266d;
        }
    }

    /* loaded from: classes.dex */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f3299a;

        public i() {
            d.this = r1;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Objects.requireNonNull(d.this);
            this.f3299a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f3299a) {
                Objects.requireNonNull(d.this);
                a();
                this.f3299a = true;
            }
            d dVar = d.this;
            valueAnimator.getAnimatedFraction();
            Objects.requireNonNull(dVar);
        }
    }

    public d(FloatingActionButton floatingActionButton, z5.b bVar) {
        this.f3279r = floatingActionButton;
        this.f3280s = bVar;
        u5.j jVar = new u5.j();
        this.f3269g = jVar;
        jVar.a(f3262z, d(new e()));
        jVar.a(A, d(new C0045d()));
        jVar.a(B, d(new C0045d()));
        jVar.a(C, d(new C0045d()));
        jVar.a(D, d(new h()));
        jVar.a(E, d(new c(this)));
        this.f3273k = floatingActionButton.getRotation();
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f3279r.getDrawable();
        if (drawable == null || this.f3275m == 0) {
            return;
        }
        RectF rectF = this.f3282u;
        RectF rectF2 = this.f3283v;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f3275m;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f3275m;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    public final AnimatorSet b(e5.g gVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f3279r, View.ALPHA, f10);
        gVar.c("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f3279r, View.SCALE_X, f11);
        gVar.c("scale").a(ofFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            ofFloat2.setEvaluator(new t5.a());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f3279r, View.SCALE_Y, f11);
        gVar.c("scale").a(ofFloat3);
        if (i10 == 26) {
            ofFloat3.setEvaluator(new t5.a());
        }
        arrayList.add(ofFloat3);
        a(f12, this.f3284w);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f3279r, new e5.e(), new a(), new Matrix(this.f3284w));
        gVar.c("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        h0.d(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this.f3279r.getAlpha(), f10, this.f3279r.getScaleX(), f11, this.f3279r.getScaleY(), this.f3274l, f12, new Matrix(this.f3284w)));
        arrayList.add(ofFloat);
        h0.d(animatorSet, arrayList);
        Context context = this.f3279r.getContext();
        int integer = this.f3279r.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1);
        TypedValue a10 = x5.b.a(context, R.attr.motionDurationLong1);
        if (a10 != null && a10.type == 16) {
            integer = a10.data;
        }
        animatorSet.setDuration(integer);
        Context context2 = this.f3279r.getContext();
        TimeInterpolator timeInterpolator = e5.a.f4409b;
        TypedValue typedValue = new TypedValue();
        if (context2.getTheme().resolveAttribute(R.attr.motionEasingStandard, typedValue, true)) {
            if (typedValue.type != 3) {
                throw new IllegalArgumentException("Motion easing theme attribute must be a string");
            }
            String valueOf = String.valueOf(typedValue.string);
            if (v5.a.b(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    timeInterpolator = o0.a.b(v5.a.a(split, 0), v5.a.a(split, 1), v5.a.a(split, 2), v5.a.a(split, 3));
                } else {
                    StringBuilder c10 = androidx.activity.result.a.c("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                    c10.append(split.length);
                    throw new IllegalArgumentException(c10.toString());
                }
            } else if (v5.a.b(valueOf, "path")) {
                timeInterpolator = o0.a.c(e0.e.d(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException(d7.a.c("Invalid motion easing type: ", valueOf));
            }
        }
        animatorSet.setInterpolator(timeInterpolator);
        return animatorSet;
    }

    public final ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(y);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int i10 = 0;
        if (this.f3264b) {
            i10 = (0 - this.f3279r.getSizeDimension()) / 2;
        }
        float e10 = this.f3265c ? e() + this.f3268f : 0.0f;
        int max = Math.max(i10, (int) Math.ceil(e10));
        int max2 = Math.max(i10, (int) Math.ceil(e10 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public final boolean g() {
        return this.f3279r.getVisibility() == 0 ? this.f3276n == 1 : this.f3276n != 2;
    }

    public final boolean h() {
        return this.f3279r.getVisibility() != 0 ? this.f3276n == 2 : this.f3276n != 1;
    }

    public void i() {
        throw null;
    }

    public void j() {
        throw null;
    }

    public void k(int[] iArr) {
        throw null;
    }

    public void l(float f10, float f11, float f12) {
        throw null;
    }

    public final void m() {
        ArrayList<f> arrayList = this.f3278q;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public final void n() {
        ArrayList<f> arrayList = this.f3278q;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public final void o(float f10) {
        this.f3274l = f10;
        Matrix matrix = this.f3284w;
        a(f10, matrix);
        this.f3279r.setImageMatrix(matrix);
    }

    public void p() {
        throw null;
    }

    public boolean q() {
        throw null;
    }

    public final boolean r() {
        FloatingActionButton floatingActionButton = this.f3279r;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        return z.g.c(floatingActionButton) && !this.f3279r.isInEditMode();
    }

    public void s() {
        throw null;
    }

    public final void t() {
        Rect rect = this.f3281t;
        f(rect);
        l0.g.e(null, "Didn't initialize content background");
        if (q()) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b bVar = (FloatingActionButton.b) this.f3280s;
            Objects.requireNonNull(bVar);
            d.super.setBackgroundDrawable(insetDrawable);
        } else {
            Objects.requireNonNull(this.f3280s);
        }
        z5.b bVar2 = this.f3280s;
        int i10 = rect.left;
        Objects.requireNonNull(FloatingActionButton.this);
        throw null;
    }
}
