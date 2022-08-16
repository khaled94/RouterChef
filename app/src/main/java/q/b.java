package q;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: a */
    public float f17014a;

    /* renamed from: e */
    public float f17018e;

    /* renamed from: h */
    public ColorStateList f17021h;

    /* renamed from: i */
    public PorterDuffColorFilter f17022i;

    /* renamed from: j */
    public ColorStateList f17023j;

    /* renamed from: f */
    public boolean f17019f = false;

    /* renamed from: g */
    public boolean f17020g = true;

    /* renamed from: k */
    public PorterDuff.Mode f17024k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public final Paint f17015b = new Paint(5);

    /* renamed from: c */
    public final RectF f17016c = new RectF();

    /* renamed from: d */
    public final Rect f17017d = new Rect();

    public b(ColorStateList colorStateList, float f10) {
        this.f17014a = f10;
        b(colorStateList);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f17021h = colorStateList;
        this.f17015b.setColor(colorStateList.getColorForState(getState(), this.f17021h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f17016c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f17017d.set(rect);
        if (this.f17019f) {
            float b10 = c.b(this.f17018e, this.f17014a, this.f17020g);
            this.f17017d.inset((int) Math.ceil(c.a(this.f17018e, this.f17014a, this.f17020g)), (int) Math.ceil(b10));
            this.f17016c.set(this.f17017d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f17015b;
        if (this.f17022i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f17022i);
            z10 = true;
        }
        RectF rectF = this.f17016c;
        float f10 = this.f17014a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f17017d, this.f17014a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f17023j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f17021h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f17021h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f17015b.getColor();
        if (z10) {
            this.f17015b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f17023j;
        if (colorStateList2 == null || (mode = this.f17024k) == null) {
            return z10;
        }
        this.f17022i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f17015b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17015b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f17023j = colorStateList;
        this.f17022i = a(colorStateList, this.f17024k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f17024k = mode;
        this.f17022i = a(this.f17023j, mode);
        invalidateSelf();
    }
}
