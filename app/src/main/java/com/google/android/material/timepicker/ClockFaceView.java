package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.raouf.routerchef.R;
import h6.a;
import java.util.Arrays;
import m0.z;
import n0.f;
import x5.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockFaceView extends c implements ClockHandView.a {
    public final ClockHandView N;
    public final SparseArray<TextView> Q;
    public final b R;
    public final int[] S;
    public final int U;
    public final int V;
    public final int W;

    /* renamed from: a0 */
    public final int f3416a0;

    /* renamed from: b0 */
    public String[] f3417b0;

    /* renamed from: c0 */
    public float f3418c0;

    /* renamed from: d0 */
    public final ColorStateList f3419d0;
    public final Rect O = new Rect();
    public final RectF P = new RectF();
    public final float[] T = {0.0f, 0.9f, 1.0f};

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.google.android.material.timepicker.ClockHandView$a>, java.util.ArrayList] */
    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.Q = sparseArray;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f5103w, R.attr.materialClockStyle, 2131952690);
        Resources resources = getResources();
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 1);
        this.f3419d0 = a10;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.N = clockHandView;
        this.U = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.S = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.f3424w.add(this);
        int defaultColor = f.a.a(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a11 = c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.R = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f3417b0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i10 = 0; i10 < Math.max(this.f3417b0.length, size); i10++) {
            TextView textView = this.Q.get(i10);
            if (i10 >= this.f3417b0.length) {
                removeView(textView);
                this.Q.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.Q.put(i10, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f3417b0[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                z.p(textView, this.R);
                textView.setTextColor(this.f3419d0);
            }
        }
        this.V = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.W = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f3416a0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f10) {
        if (Math.abs(this.f3418c0 - f10) > 0.001f) {
            this.f3418c0 = f10;
            t();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(1, this.f3417b0.length, 1).f16416a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f3416a0 / Math.max(Math.max(this.V / displayMetrics.heightPixels, this.W / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void t() {
        RectF rectF = this.N.A;
        for (int i10 = 0; i10 < this.Q.size(); i10++) {
            TextView textView = this.Q.get(i10);
            if (textView != null) {
                textView.getDrawingRect(this.O);
                offsetDescendantRectToMyCoords(textView, this.O);
                textView.setSelected(rectF.contains(this.O.centerX(), this.O.centerY()));
                this.P.set(this.O);
                this.P.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                textView.getPaint().setShader(!RectF.intersects(rectF, this.P) ? null : new RadialGradient(rectF.centerX() - this.P.left, rectF.centerY() - this.P.top, 0.5f * rectF.width(), this.S, this.T, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }
}
