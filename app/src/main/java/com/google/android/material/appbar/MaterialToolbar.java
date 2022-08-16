package com.google.android.material.appbar;

import a6.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.raouf.routerchef.R;
import e6.a;
import f0.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import u5.n;
import u5.o;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: p0 */
    public static final ImageView.ScaleType[] f2994p0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: k0 */
    public Integer f2995k0;

    /* renamed from: l0 */
    public boolean f2996l0;

    /* renamed from: m0 */
    public boolean f2997m0;

    /* renamed from: n0 */
    public ImageView.ScaleType f2998n0;

    /* renamed from: o0 */
    public Boolean f2999o0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, 2131952698), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        int i10 = 0;
        TypedArray d5 = n.d(context2, attributeSet, h6.a.M, R.attr.toolbarStyle, 2131952698, new int[0]);
        if (d5.hasValue(2)) {
            setNavigationIconTint(d5.getColor(2, -1));
        }
        this.f2996l0 = d5.getBoolean(4, false);
        this.f2997m0 = d5.getBoolean(3, false);
        int i11 = d5.getInt(1, -1);
        if (i11 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f2994p0;
            if (i11 < scaleTypeArr.length) {
                this.f2998n0 = scaleTypeArr[i11];
            }
        }
        if (d5.hasValue(0)) {
            this.f2999o0 = Boolean.valueOf(d5.getBoolean(0, false));
        }
        d5.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.o(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i10));
            gVar.m(context2);
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            gVar.n(z.i.i(this));
            z.d.q(this, gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2998n0;
    }

    public Integer getNavigationIconTint() {
        return this.f2995k0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            n.a.b(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        ImageView imageView2 = null;
        if (this.f2996l0 || this.f2997m0) {
            List<TextView> a10 = o.a(this, getTitle());
            TextView textView = ((ArrayList) a10).isEmpty() ? null : (TextView) Collections.min(a10, o.f19142a);
            List<TextView> a11 = o.a(this, getSubtitle());
            TextView textView2 = ((ArrayList) a11).isEmpty() ? null : (TextView) Collections.max(a11, o.f19142a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f2996l0 && textView != null) {
                    y(textView, pair);
                }
                if (this.f2997m0 && textView2 != null) {
                    y(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i14 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i14++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f2999o0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f2998n0;
            if (scaleType == null) {
                return;
            }
            imageView2.setScaleType(scaleType);
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).n(f10);
        }
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f2999o0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f2999o0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f2998n0 != scaleType) {
            this.f2998n0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f2995k0 != null) {
            drawable = drawable.mutate();
            a.b.g(drawable, this.f2995k0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f2995k0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f2997m0 != z10) {
            this.f2997m0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f2996l0 != z10) {
            this.f2996l0 = z10;
            requestLayout();
        }
    }

    public final void y(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }
}
