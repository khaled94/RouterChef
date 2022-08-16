package androidx.appcompat.view.menu;

import a6.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.f1;
import com.raouf.routerchef.R;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {
    public LinearLayout A;
    public Drawable B;
    public int C;
    public Context D;
    public boolean E;
    public Drawable F;
    public boolean G;
    public LayoutInflater H;
    public boolean I;

    /* renamed from: s */
    public g f507s;

    /* renamed from: t */
    public ImageView f508t;

    /* renamed from: u */
    public RadioButton f509u;

    /* renamed from: v */
    public TextView f510v;

    /* renamed from: w */
    public CheckBox f511w;

    /* renamed from: x */
    public TextView f512x;
    public ImageView y;

    /* renamed from: z */
    public ImageView f513z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f1 q10 = f1.q(getContext(), attributeSet, f.J, R.attr.listMenuViewStyle);
        this.B = q10.g(5);
        this.C = q10.l(1, -1);
        this.E = q10.a(7, false);
        this.D = context;
        this.F = q10.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.G = obtainStyledAttributes.hasValue(0);
        q10.r();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.H == null) {
            this.H = LayoutInflater.from(getContext());
        }
        return this.H;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f511w = checkBox;
        LinearLayout linearLayout = this.A;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f513z;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f513z.getLayoutParams();
        rect.top = this.f513z.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f509u = radioButton;
        LinearLayout linearLayout = this.A;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        if ((r0.f590n.p() && r0.e() != 0) != false) goto L22;
     */
    @Override // androidx.appcompat.view.menu.j.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(androidx.appcompat.view.menu.g r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.e(androidx.appcompat.view.menu.g):void");
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f507s;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.B;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.q(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f510v = textView;
        int i10 = this.C;
        if (i10 != -1) {
            textView.setTextAppearance(this.D, i10);
        }
        this.f512x = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.y = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.F);
        }
        this.f513z = (ImageView) findViewById(R.id.group_divider);
        this.A = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f508t != null && this.E) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f508t.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        View view;
        CompoundButton compoundButton;
        if (!z10 && this.f509u == null && this.f511w == null) {
            return;
        }
        if (this.f507s.h()) {
            if (this.f509u == null) {
                b();
            }
            compoundButton = this.f509u;
            view = this.f511w;
        } else {
            if (this.f511w == null) {
                a();
            }
            compoundButton = this.f511w;
            view = this.f509u;
        }
        if (z10) {
            compoundButton.setChecked(this.f507s.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f511w;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f509u;
        if (radioButton == null) {
            return;
        }
        radioButton.setVisibility(8);
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f507s.h()) {
            if (this.f509u == null) {
                b();
            }
            compoundButton = this.f509u;
        } else {
            if (this.f511w == null) {
                a();
            }
            compoundButton = this.f511w;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.I = z10;
        this.E = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f513z;
        if (imageView != null) {
            imageView.setVisibility((this.G || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f507s.f590n);
        boolean z10 = this.I;
        if (z10 || this.E) {
            ImageView imageView = this.f508t;
            if (imageView == null && drawable == null && !this.E) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f508t = imageView2;
                LinearLayout linearLayout = this.A;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.E) {
                this.f508t.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f508t;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f508t.getVisibility() == 0) {
                return;
            }
            this.f508t.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i10;
        if (charSequence != null) {
            this.f510v.setText(charSequence);
            if (this.f510v.getVisibility() == 0) {
                return;
            }
            textView = this.f510v;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f510v.getVisibility() == 8) {
                return;
            }
            textView = this.f510v;
        }
        textView.setVisibility(i10);
    }
}
