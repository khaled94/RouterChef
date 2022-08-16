package w5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.w;
import com.raouf.routerchef.R;
import q0.c;
import u5.n;

/* loaded from: classes.dex */
public final class a extends w {
    public static final int[][] y = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: w */
    public ColorStateList f19924w;

    /* renamed from: x */
    public boolean f19925x;

    public a(Context context, AttributeSet attributeSet) {
        super(e6.a.a(context, attributeSet, R.attr.radioButtonStyle, 2131952624), attributeSet);
        Context context2 = getContext();
        TypedArray d5 = n.d(context2, attributeSet, h6.a.I, R.attr.radioButtonStyle, 2131952624, new int[0]);
        if (d5.hasValue(0)) {
            c.c(this, x5.c.a(context2, d5, 0));
        }
        this.f19925x = d5.getBoolean(1, false);
        d5.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f19924w == null) {
            int b10 = h6.a.b(this, R.attr.colorControlActivated);
            int b11 = h6.a.b(this, R.attr.colorOnSurface);
            int b12 = h6.a.b(this, R.attr.colorSurface);
            this.f19924w = new ColorStateList(y, new int[]{h6.a.f(b12, b10, 1.0f), h6.a.f(b12, b11, 0.54f), h6.a.f(b12, b11, 0.38f), h6.a.f(b12, b11, 0.38f)});
        }
        return this.f19924w;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f19925x || c.a(this) != null) {
            return;
        }
        setUseMaterialThemeColors(true);
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f19925x = z10;
        c.c(this, z10 ? getMaterialThemeColorsTintList() : null);
    }
}
