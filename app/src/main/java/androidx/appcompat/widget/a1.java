package androidx.appcompat.widget;

import a6.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import e0.a;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f779a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f780b = {-16842910};

    /* renamed from: c */
    public static final int[] f781c = {16842908};

    /* renamed from: d */
    public static final int[] f782d = {16842919};

    /* renamed from: e */
    public static final int[] f783e = {16842912};

    /* renamed from: f */
    public static final int[] f784f = new int[0];

    /* renamed from: g */
    public static final int[] f785g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f.B);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList d5 = d(context, i10);
        if (d5 == null || !d5.isStateful()) {
            ThreadLocal<TypedValue> threadLocal = f779a;
            TypedValue typedValue = threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            context.getTheme().resolveAttribute(16842803, typedValue, true);
            float f10 = typedValue.getFloat();
            int c10 = c(context, i10);
            return a.e(c10, Math.round(Color.alpha(c10) * f10));
        }
        return d5.getColorForState(f780b, d5.getDefaultColor());
    }

    public static int c(Context context, int i10) {
        int[] iArr = f785g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i10) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f785g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = f.a.a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
