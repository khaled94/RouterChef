package d6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.s0;
import com.google.android.material.textfield.TextInputLayout;
import com.raouf.routerchef.R;
import e6.a;
import java.util.Locale;

/* loaded from: classes.dex */
public final class n extends e {

    /* renamed from: w */
    public final s0 f3982w;

    /* renamed from: x */
    public final AccessibilityManager f3983x;
    public final Rect y = new Rect();

    /* renamed from: z */
    public final int f3984z;

    public n(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        Context context2 = getContext();
        TypedArray d5 = u5.n.d(context2, attributeSet, h6.a.C, R.attr.autoCompleteTextViewStyle, 2131952366, new int[0]);
        if (d5.hasValue(0) && d5.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f3984z = d5.getResourceId(1, R.layout.mtrl_auto_complete_simple_item);
        this.f3983x = (AccessibilityManager) context2.getSystemService("accessibility");
        s0 s0Var = new s0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f3982w = s0Var;
        s0Var.t();
        s0Var.G = this;
        s0Var.s();
        s0Var.p(getAdapter());
        s0Var.H = new m(this);
        if (d5.hasValue(2)) {
            setSimpleItems(d5.getResourceId(2, 0));
        }
        d5.recycle();
    }

    public static void a(n nVar, Object obj) {
        nVar.setText(nVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b10 = b();
        return (b10 == null || !b10.W) ? super.getHint() : b10.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 == null || !b10.W || super.getHint() != null || !Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            return;
        }
        setHint("");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i12 = 0;
            if (adapter != null && b10 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                s0 s0Var = this.f3982w;
                int min = Math.min(adapter.getCount(), Math.max(0, !s0Var.b() ? -1 : s0Var.f1004u.getSelectedItemPosition()) + 15);
                View view = null;
                int i13 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i12) {
                        view = null;
                        i12 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 = Math.max(i13, view.getMeasuredWidth());
                }
                Drawable f10 = this.f3982w.f();
                if (f10 != null) {
                    f10.getPadding(this.y);
                    Rect rect = this.y;
                    i13 += rect.left + rect.right;
                }
                i12 = b10.getEndIconView().getMeasuredWidth() + i13;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i12), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f3982w.p(getAdapter());
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f3984z, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f3983x;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f3982w.d();
        }
    }
}
