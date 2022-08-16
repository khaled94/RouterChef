package androidx.appcompat.widget;

import a6.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import com.raouf.routerchef.R;
import f0.a;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class a0 extends v {

    /* renamed from: d */
    public final SeekBar f773d;

    /* renamed from: e */
    public Drawable f774e;

    /* renamed from: f */
    public ColorStateList f775f = null;

    /* renamed from: g */
    public PorterDuff.Mode f776g = null;

    /* renamed from: h */
    public boolean f777h = false;

    /* renamed from: i */
    public boolean f778i = false;

    public a0(SeekBar seekBar) {
        super(seekBar);
        this.f773d = seekBar;
    }

    @Override // androidx.appcompat.widget.v
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, R.attr.seekBarStyle);
        Context context = this.f773d.getContext();
        int[] iArr = f.y;
        f1 q10 = f1.q(context, attributeSet, iArr, R.attr.seekBarStyle);
        SeekBar seekBar = this.f773d;
        z.o(seekBar, seekBar.getContext(), iArr, attributeSet, q10.f848b, R.attr.seekBarStyle);
        Drawable h10 = q10.h(0);
        if (h10 != null) {
            this.f773d.setThumb(h10);
        }
        Drawable g10 = q10.g(1);
        Drawable drawable = this.f774e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f774e = g10;
        if (g10 != null) {
            g10.setCallback(this.f773d);
            SeekBar seekBar2 = this.f773d;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            a.c.b(g10, z.e.d(seekBar2));
            if (g10.isStateful()) {
                g10.setState(this.f773d.getDrawableState());
            }
            c();
        }
        this.f773d.invalidate();
        if (q10.o(3)) {
            this.f776g = m0.e(q10.j(3, -1), this.f776g);
            this.f778i = true;
        }
        if (q10.o(2)) {
            this.f775f = q10.c(2);
            this.f777h = true;
        }
        q10.r();
        c();
    }

    public final void c() {
        Drawable drawable = this.f774e;
        if (drawable != null) {
            if (!this.f777h && !this.f778i) {
                return;
            }
            Drawable mutate = drawable.mutate();
            this.f774e = mutate;
            if (this.f777h) {
                a.b.h(mutate, this.f775f);
            }
            if (this.f778i) {
                a.b.i(this.f774e, this.f776g);
            }
            if (!this.f774e.isStateful()) {
                return;
            }
            this.f774e.setState(this.f773d.getDrawableState());
        }
    }

    public final void d(Canvas canvas) {
        if (this.f774e != null) {
            int max = this.f773d.getMax();
            int i10 = 1;
            if (max <= 1) {
                return;
            }
            int intrinsicWidth = this.f774e.getIntrinsicWidth();
            int intrinsicHeight = this.f774e.getIntrinsicHeight();
            int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
            if (intrinsicHeight >= 0) {
                i10 = intrinsicHeight / 2;
            }
            this.f774e.setBounds(-i11, -i10, i11, i10);
            float width = ((this.f773d.getWidth() - this.f773d.getPaddingLeft()) - this.f773d.getPaddingRight()) / max;
            int save = canvas.save();
            canvas.translate(this.f773d.getPaddingLeft(), this.f773d.getHeight() / 2);
            for (int i12 = 0; i12 <= max; i12++) {
                this.f774e.draw(canvas);
                canvas.translate(width, 0.0f);
            }
            canvas.restoreToCount(save);
        }
    }
}
