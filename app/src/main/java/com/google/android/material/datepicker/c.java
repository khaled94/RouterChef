package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.raouf.routerchef.R;
import h6.a;
import x5.b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final b f3162a;

    /* renamed from: b */
    public final b f3163b;

    /* renamed from: c */
    public final b f3164c;

    /* renamed from: d */
    public final b f3165d;

    /* renamed from: e */
    public final b f3166e;

    /* renamed from: f */
    public final b f3167f;

    /* renamed from: g */
    public final b f3168g;

    /* renamed from: h */
    public final Paint f3169h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.b(context, R.attr.materialCalendarStyle, h.class.getCanonicalName()), a.F);
        this.f3162a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f3168g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f3163b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f3164c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a10 = x5.c.a(context, obtainStyledAttributes, 6);
        this.f3165d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f3166e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f3167f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f3169h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
