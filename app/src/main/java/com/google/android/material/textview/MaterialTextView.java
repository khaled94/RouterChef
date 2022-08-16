package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.h0;
import com.raouf.routerchef.R;
import e6.a;
import x5.b;

/* loaded from: classes.dex */
public class MaterialTextView extends h0 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        if (g(context2)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = h6.a.L;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int p = p(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (p != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId == -1) {
                return;
            }
            c(theme, resourceId);
        }
    }

    public static boolean g(Context context) {
        TypedValue a10 = b.a(context, R.attr.textAppearanceLineHeightEnabled);
        return (a10 != null && a10.type == 18 && a10.data == 0) ? false : true;
    }

    public static int p(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            int i12 = iArr[i11];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i12, typedValue) || typedValue.type != 2) {
                i10 = typedArray.getDimensionPixelSize(i12, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i10 = dimensionPixelSize;
            }
        }
        return i10;
    }

    public final void c(Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, h6.a.K);
        int p = p(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (p >= 0) {
            setLineHeight(p);
        }
    }

    @Override // androidx.appcompat.widget.h0, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (g(context)) {
            c(context.getTheme(), i10);
        }
    }
}
