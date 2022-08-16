package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.raouf.routerchef.R;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import n0.f;
import u5.g;
import u5.i;
import u5.n;

/* loaded from: classes.dex */
public class ChipGroup extends g {
    public final int A;
    public final e B;

    /* renamed from: w */
    public int f3108w;

    /* renamed from: x */
    public int f3109x;
    public d y;

    /* renamed from: z */
    public final u5.b<Chip> f3110z;

    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a */
        public final /* synthetic */ c f3111a;

        public a(c cVar) {
            ChipGroup.this = r1;
            this.f3111a = cVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public b() {
            super(-2, -2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: s */
        public ViewGroup.OnHierarchyChangeListener f3113s;

        public e() {
            ChipGroup.this = r1;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T extends u5.i<T>>] */
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, f0> weakHashMap = z.f5921a;
                    view2.setId(z.e.a());
                }
                u5.b<Chip> bVar = ChipGroup.this.f3110z;
                Chip chip = (Chip) view2;
                bVar.f19077a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    bVar.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new u5.a(bVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3113s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T extends u5.i<T>>] */
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                u5.b<Chip> bVar = chipGroup.f3110z;
                Chip chip = (Chip) view2;
                Objects.requireNonNull(bVar);
                chip.setInternalOnCheckedChangeListener(null);
                bVar.f19077a.remove(Integer.valueOf(chip.getId()));
                bVar.f19078b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3113s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(e6.a.a(context, attributeSet, R.attr.chipGroupStyle, 2131952617), attributeSet, R.attr.chipGroupStyle);
        u5.b<Chip> bVar = new u5.b<>();
        this.f3110z = bVar;
        e eVar = new e();
        this.B = eVar;
        TypedArray d5 = n.d(getContext(), attributeSet, h6.a.f5102v, R.attr.chipGroupStyle, 2131952617, new int[0]);
        int dimensionPixelOffset = d5.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d5.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d5.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d5.getBoolean(5, false));
        setSingleSelection(d5.getBoolean(6, false));
        setSelectionRequired(d5.getBoolean(4, false));
        this.A = d5.getResourceId(0, -1);
        d5.recycle();
        bVar.f19079c = new com.google.android.material.chip.b(this);
        super.setOnHierarchyChangeListener(eVar);
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.s(this, 1);
    }

    private int getChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                i10++;
            }
        }
        return i10;
    }

    @Override // u5.g
    public final boolean a() {
        return this.f19112u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getCheckedChipId() {
        return this.f3110z.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f3110z.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f3108w;
    }

    public int getChipSpacingVertical() {
        return this.f3109x;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T extends u5.i<T>>] */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.A;
        if (i10 != -1) {
            u5.b<Chip> bVar = this.f3110z;
            i<Chip> iVar = (i) bVar.f19077a.get(Integer.valueOf(i10));
            if (iVar == null || !bVar.a(iVar)) {
                return;
            }
            bVar.d();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(getRowCount(), this.f19112u ? getChipCount() : -1, this.f3110z.f19080d ? 1 : 2).f16416a);
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f3108w != i10) {
            this.f3108w = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f3109x != i10) {
            this.f3109x = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.y = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.B.f3113s = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f3110z.f19081e = z10;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    @Override // u5.g
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T extends u5.i<T>>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public void setSingleSelection(boolean z10) {
        u5.b<Chip> bVar = this.f3110z;
        if (bVar.f19080d != z10) {
            bVar.f19080d = z10;
            boolean z11 = !bVar.f19078b.isEmpty();
            for (i<Chip> iVar : bVar.f19077a.values()) {
                bVar.e(iVar, false);
            }
            if (!z11) {
                return;
            }
            bVar.d();
        }
    }
}
