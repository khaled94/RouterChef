package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.raouf.routerchef.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public class ClockHandView extends View {
    public final int B;
    public float C;
    public boolean D;
    public double E;
    public int F;

    /* renamed from: s */
    public ValueAnimator f3420s;

    /* renamed from: t */
    public float f3421t;

    /* renamed from: u */
    public float f3422u;

    /* renamed from: v */
    public int f3423v;

    /* renamed from: x */
    public final int f3425x;
    public final float y;

    /* renamed from: z */
    public final Paint f3426z;

    /* renamed from: w */
    public final List<a> f3424w = new ArrayList();
    public final RectF A = new RectF();

    /* loaded from: classes.dex */
    public interface a {
        void a(float f10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.f3426z = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h6.a.f5104x, R.attr.materialClockStyle, 2131952690);
        this.F = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3425x = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.B = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.y = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        this.f3423v = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(float f10, float f11) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f3420s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f10, false);
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List<com.google.android.material.timepicker.ClockHandView$a>, java.util.ArrayList] */
    public final void c(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.C = f11;
        this.E = Math.toRadians(f11 - 90.0f);
        float cos = (this.F * ((float) Math.cos(this.E))) + (getWidth() / 2);
        float sin = (this.F * ((float) Math.sin(this.E))) + (getHeight() / 2);
        RectF rectF = this.A;
        float f12 = this.f3425x;
        rectF.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.f3424w.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f11);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f10 = height;
        this.f3426z.setStrokeWidth(0.0f);
        canvas.drawCircle((this.F * ((float) Math.cos(this.E))) + width2, (this.F * ((float) Math.sin(this.E))) + f10, this.f3425x, this.f3426z);
        double sin = Math.sin(this.E);
        double cos = Math.cos(this.E);
        this.f3426z.setStrokeWidth(this.B);
        canvas.drawLine(width2, f10, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.f3426z);
        canvas.drawCircle(width2, f10, this.y, this.f3426z);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b(this.C);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked == 0) {
            this.f3421t = x10;
            this.f3422u = y;
            this.D = false;
            z11 = false;
            z10 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z11 = this.D;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
        }
        boolean z13 = this.D;
        float a10 = a(x10, y);
        boolean z14 = this.C != a10;
        if (!z10 || !z14) {
            if (z14 || z11) {
                b(a10);
            }
            this.D = z13 | z12;
            return true;
        }
        z12 = true;
        this.D = z13 | z12;
        return true;
    }
}
