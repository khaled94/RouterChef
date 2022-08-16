package l5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.h;
import com.raouf.routerchef.R;
import f0.a;
import q0.c;
import q0.d;
import u5.n;
import u5.s;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: z */
    public static final int[][] f5817z = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: w */
    public ColorStateList f5818w;

    /* renamed from: x */
    public boolean f5819x;
    public boolean y;

    public a(Context context, AttributeSet attributeSet) {
        super(e6.a.a(context, attributeSet, R.attr.checkboxStyle, 2131952623), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray d5 = n.d(context2, attributeSet, h6.a.H, R.attr.checkboxStyle, 2131952623, new int[0]);
        if (d5.hasValue(0)) {
            c.c(this, x5.c.a(context2, d5, 0));
        }
        this.f5819x = d5.getBoolean(2, false);
        this.y = d5.getBoolean(1, true);
        d5.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5818w == null) {
            int[][] iArr = f5817z;
            int b10 = h6.a.b(this, R.attr.colorControlActivated);
            int b11 = h6.a.b(this, R.attr.colorSurface);
            int b12 = h6.a.b(this, R.attr.colorOnSurface);
            this.f5818w = new ColorStateList(iArr, new int[]{h6.a.f(b11, b10, 1.0f), h6.a.f(b11, b12, 0.54f), h6.a.f(b11, b12, 0.38f), h6.a.f(b11, b12, 0.38f)});
        }
        return this.f5818w;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f5819x || c.a(this) != null) {
            return;
        }
        setUseMaterialThemeColors(true);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a10;
        if (this.y && TextUtils.isEmpty(getText()) && (a10 = d.a(this)) != null) {
            int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * (s.a(this) ? -1 : 1);
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() == null) {
                return;
            }
            Rect bounds = a10.getBounds();
            a.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
            return;
        }
        super.onDraw(canvas);
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.y = z10;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f5819x = z10;
        c.c(this, z10 ? getMaterialThemeColorsTintList() : null);
    }
}
