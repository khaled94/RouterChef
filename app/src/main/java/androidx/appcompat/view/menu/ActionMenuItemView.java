package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.p0;
import k.f;

/* loaded from: classes.dex */
public class ActionMenuItemView extends h0 implements j.a, View.OnClickListener, ActionMenuView.a {
    public Drawable A;
    public e.b B;
    public a C;
    public b D;
    public boolean F;
    public int G;
    public int I;
    public g y;

    /* renamed from: z */
    public CharSequence f504z;
    public boolean E = g();
    public int H = -1;

    /* loaded from: classes.dex */
    public class a extends p0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(r1);
            ActionMenuItemView.this = r1;
        }

        @Override // androidx.appcompat.widget.p0
        public final f b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.D;
            if (bVar == null || (aVar = c.this.L) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // androidx.appcompat.widget.p0
        public final boolean c() {
            f b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.B;
            return bVar != null && bVar.a(actionMenuItemView.y) && (b10 = b()) != null && b10.b();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a6.f.f186u, 0, 0);
        this.G = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.I = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return c();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        return c() && this.y.getIcon() == null;
    }

    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final void e(g gVar) {
        this.y = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitleCondensed());
        setId(gVar.f577a);
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (!gVar.hasSubMenu() || this.C != null) {
            return;
        }
        this.C = new a();
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.y;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e.b bVar = this.B;
        if (bVar != null) {
            bVar.a(this.y);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.E = g();
        p();
    }

    @Override // androidx.appcompat.widget.h0, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean c10 = c();
        if (c10 && (i12 = this.H) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.G) : this.G;
        if (mode != 1073741824 && this.G > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (c10 || this.A == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.A.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.y.hasSubMenu() || (aVar = this.C) == null || !aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f504z);
        if (this.A != null) {
            if (!((this.y.y & 4) == 4) || (!this.E && !this.F)) {
                z10 = false;
            }
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence = null;
        setText(z12 ? this.f504z : null);
        CharSequence charSequence2 = this.y.f592q;
        if (TextUtils.isEmpty(charSequence2)) {
            charSequence2 = z12 ? null : this.y.f581e;
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.y.f593r;
        if (!TextUtils.isEmpty(charSequence3)) {
            j1.a(this, charSequence3);
            return;
        }
        if (!z12) {
            charSequence = this.y.f581e;
        }
        j1.a(this, charSequence);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            g gVar = this.y;
            if (gVar == null) {
                return;
            }
            gVar.f590n.q();
        }
    }

    public void setIcon(Drawable drawable) {
        this.A = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.I;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        p();
    }

    public void setItemInvoker(e.b bVar) {
        this.B = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.H = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.D = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f504z = charSequence;
        p();
    }
}
