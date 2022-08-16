package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import c1.f;
import com.raouf.routerchef.R;
import q.b;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: s */
    public boolean f1055s;

    /* renamed from: t */
    public boolean f1056t;

    /* renamed from: u */
    public int f1057u;

    /* renamed from: v */
    public int f1058v;

    /* renamed from: w */
    public final Rect f1059w;

    /* renamed from: x */
    public final Rect f1060x = new Rect();
    public final a y;

    /* renamed from: z */
    public static final int[] f1054z = {16842801};
    public static final a0.a A = new a0.a();

    /* loaded from: classes.dex */
    public class a implements q.a {

        /* renamed from: a */
        public Drawable f1061a;

        public a() {
            CardView.this = r1;
        }

        public final boolean a() {
            return CardView.this.getPreventCornerOverlap();
        }

        public final void b(int i10, int i11, int i12, int i13) {
            CardView.this.f1060x.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1059w;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cardViewStyle);
        ColorStateList colorStateList;
        Resources resources;
        int i10;
        Rect rect = new Rect();
        this.f1059w = rect;
        a aVar = new a();
        this.y = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f2608s, R.attr.cardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            colorStateList = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1054z);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i10 = R.color.cardview_light_background;
            } else {
                resources = getResources();
                i10 = R.color.cardview_dark_background;
            }
            colorStateList = ColorStateList.valueOf(resources.getColor(i10));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f1055s = obtainStyledAttributes.getBoolean(7, false);
        this.f1056t = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1057u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1058v = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        a0.a aVar2 = A;
        b bVar = new b(colorStateList, dimension);
        aVar.f1061a = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        aVar2.f(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return A.c(this.y).f17021h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1059w.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1059w.left;
    }

    public int getContentPaddingRight() {
        return this.f1059w.right;
    }

    public int getContentPaddingTop() {
        return this.f1059w.top;
    }

    public float getMaxCardElevation() {
        return A.d(this.y);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1056t;
    }

    public float getRadius() {
        return A.e(this.y);
    }

    public boolean getUseCompatPadding() {
        return this.f1055s;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        a0.a aVar = A;
        a aVar2 = this.y;
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        b c10 = aVar.c(aVar2);
        c10.b(valueOf);
        c10.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        CardView.this.setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        A.f(this.y, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f1058v = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f1057u = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1056t) {
            this.f1056t = z10;
            a0.a aVar = A;
            a aVar2 = this.y;
            aVar.f(aVar2, aVar.d(aVar2));
        }
    }

    public void setRadius(float f10) {
        b c10 = A.c(this.y);
        if (f10 == c10.f17014a) {
            return;
        }
        c10.f17014a = f10;
        c10.c(null);
        c10.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1055s != z10) {
            this.f1055s = z10;
            a0.a aVar = A;
            a aVar2 = this.y;
            aVar.f(aVar2, aVar.d(aVar2));
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b c10 = A.c(this.y);
        c10.b(colorStateList);
        c10.invalidateSelf();
    }
}
