package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import d0.g;
import f.a;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a */
    public final Context f847a;

    /* renamed from: b */
    public final TypedArray f848b;

    /* renamed from: c */
    public TypedValue f849c;

    public f1(Context context, TypedArray typedArray) {
        this.f847a = context;
        this.f848b = typedArray;
    }

    public static f1 p(Context context, AttributeSet attributeSet, int[] iArr) {
        return new f1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static f1 q(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new f1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public final boolean a(int i10, boolean z10) {
        return this.f848b.getBoolean(i10, z10);
    }

    public final int b() {
        return this.f848b.getColor(14, 0);
    }

    public final ColorStateList c(int i10) {
        int resourceId;
        ColorStateList a10;
        return (!this.f848b.hasValue(i10) || (resourceId = this.f848b.getResourceId(i10, 0)) == 0 || (a10 = a.a(this.f847a, resourceId)) == null) ? this.f848b.getColorStateList(i10) : a10;
    }

    public final float d(int i10) {
        return this.f848b.getDimension(i10, -1.0f);
    }

    public final int e(int i10, int i11) {
        return this.f848b.getDimensionPixelOffset(i10, i11);
    }

    public final int f(int i10, int i11) {
        return this.f848b.getDimensionPixelSize(i10, i11);
    }

    public final Drawable g(int i10) {
        int resourceId;
        return (!this.f848b.hasValue(i10) || (resourceId = this.f848b.getResourceId(i10, 0)) == 0) ? this.f848b.getDrawable(i10) : a.b(this.f847a, resourceId);
    }

    public final Drawable h(int i10) {
        int resourceId;
        Drawable g10;
        if (!this.f848b.hasValue(i10) || (resourceId = this.f848b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        l a10 = l.a();
        Context context = this.f847a;
        synchronized (a10) {
            g10 = a10.f932a.g(context, resourceId, true);
        }
        return g10;
    }

    public final Typeface i(int i10, int i11, g.e eVar) {
        int resourceId = this.f848b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f849c == null) {
            this.f849c = new TypedValue();
        }
        Context context = this.f847a;
        TypedValue typedValue = this.f849c;
        ThreadLocal<TypedValue> threadLocal = g.f3704a;
        if (!context.isRestricted()) {
            return g.b(context, resourceId, typedValue, i11, eVar, true, false);
        }
        return null;
    }

    public final int j(int i10, int i11) {
        return this.f848b.getInt(i10, i11);
    }

    public final int k(int i10, int i11) {
        return this.f848b.getLayoutDimension(i10, i11);
    }

    public final int l(int i10, int i11) {
        return this.f848b.getResourceId(i10, i11);
    }

    public final String m(int i10) {
        return this.f848b.getString(i10);
    }

    public final CharSequence n(int i10) {
        return this.f848b.getText(i10);
    }

    public final boolean o(int i10) {
        return this.f848b.hasValue(i10);
    }

    public final void r() {
        this.f848b.recycle();
    }
}
