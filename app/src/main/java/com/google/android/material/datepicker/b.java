package com.google.android.material.datepicker;

import a6.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import h6.a;
import java.util.WeakHashMap;
import l0.g;
import m0.f0;
import m0.z;
import x5.c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final Rect f3156a;

    /* renamed from: b */
    public final ColorStateList f3157b;

    /* renamed from: c */
    public final ColorStateList f3158c;

    /* renamed from: d */
    public final ColorStateList f3159d;

    /* renamed from: e */
    public final int f3160e;

    /* renamed from: f */
    public final j f3161f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, j jVar, Rect rect) {
        g.c(rect.left);
        g.c(rect.top);
        g.c(rect.right);
        g.c(rect.bottom);
        this.f3156a = rect;
        this.f3157b = colorStateList2;
        this.f3158c = colorStateList;
        this.f3159d = colorStateList3;
        this.f3160e = i10;
        this.f3161f = jVar;
    }

    public static b a(Context context, int i10) {
        g.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, a.G);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 4);
        ColorStateList a11 = c.a(context, obtainStyledAttributes, 9);
        ColorStateList a12 = c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        j a13 = j.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new a6.a(0)).a();
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, a13, rect);
    }

    public final void b(TextView textView) {
        a6.g gVar = new a6.g();
        a6.g gVar2 = new a6.g();
        gVar.setShapeAppearanceModel(this.f3161f);
        gVar2.setShapeAppearanceModel(this.f3161f);
        gVar.o(this.f3158c);
        gVar.r(this.f3160e, this.f3159d);
        textView.setTextColor(this.f3157b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f3157b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f3156a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.q(textView, insetDrawable);
    }
}
