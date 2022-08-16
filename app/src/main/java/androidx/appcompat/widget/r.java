package androidx.appcompat.widget;

import a6.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import f.a;
import m0.z;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a */
    public final ImageView f995a;

    /* renamed from: b */
    public d1 f996b;

    /* renamed from: c */
    public int f997c = 0;

    public r(ImageView imageView) {
        this.f995a = imageView;
    }

    public final void a() {
        d1 d1Var;
        Drawable drawable = this.f995a.getDrawable();
        if (drawable != null) {
            m0.b(drawable);
        }
        if (drawable == null || (d1Var = this.f996b) == null) {
            return;
        }
        l.f(drawable, d1Var, this.f995a.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i10) {
        int l10;
        Context context = this.f995a.getContext();
        int[] iArr = f.f189x;
        f1 q10 = f1.q(context, attributeSet, iArr, i10);
        ImageView imageView = this.f995a;
        z.o(imageView, imageView.getContext(), iArr, attributeSet, q10.f848b, i10);
        try {
            Drawable drawable = this.f995a.getDrawable();
            if (drawable == null && (l10 = q10.l(1, -1)) != -1 && (drawable = a.b(this.f995a.getContext(), l10)) != null) {
                this.f995a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                m0.b(drawable);
            }
            if (q10.o(2)) {
                q0.f.c(this.f995a, q10.c(2));
            }
            if (q10.o(3)) {
                q0.f.d(this.f995a, m0.e(q10.j(3, -1), null));
            }
        } finally {
            q10.r();
        }
    }

    public final void c(int i10) {
        if (i10 != 0) {
            Drawable b10 = a.b(this.f995a.getContext(), i10);
            if (b10 != null) {
                m0.b(b10);
            }
            this.f995a.setImageDrawable(b10);
        } else {
            this.f995a.setImageDrawable(null);
        }
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (this.f996b == null) {
            this.f996b = new d1();
        }
        d1 d1Var = this.f996b;
        d1Var.f816a = colorStateList;
        d1Var.f819d = true;
        a();
    }

    public final void e(PorterDuff.Mode mode) {
        if (this.f996b == null) {
            this.f996b = new d1();
        }
        d1 d1Var = this.f996b;
        d1Var.f817b = mode;
        d1Var.f818c = true;
        a();
    }
}
