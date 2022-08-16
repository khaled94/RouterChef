package com.google.android.material.button;

import a6.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.raouf.routerchef.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import m0.f0;
import m0.g;
import m0.z;
import n0.f;
import u5.n;
import u5.s;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int C = 0;
    public final int A;

    /* renamed from: w */
    public Integer[] f3092w;
    public boolean y;

    /* renamed from: z */
    public boolean f3094z;

    /* renamed from: s */
    public final List<c> f3088s = new ArrayList();

    /* renamed from: t */
    public final e f3089t = new e();

    /* renamed from: u */
    public final LinkedHashSet<d> f3090u = new LinkedHashSet<>();

    /* renamed from: v */
    public final Comparator<MaterialButton> f3091v = new a();

    /* renamed from: x */
    public boolean f3093x = false;
    public Set<Integer> B = new HashSet();

    /* loaded from: classes.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
            MaterialButtonToggleGroup.this = r1;
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
        }
    }

    /* loaded from: classes.dex */
    public class b extends m0.a {
        public b() {
            MaterialButtonToggleGroup.this = r1;
        }

        @Override // m0.a
        public final void d(View view, f fVar) {
            int i10;
            this.f5847a.onInitializeAccessibilityNodeInfo(view, fVar.f16401a);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i11 = MaterialButtonToggleGroup.C;
            Objects.requireNonNull(materialButtonToggleGroup);
            if (view instanceof MaterialButton) {
                i10 = 0;
                for (int i12 = 0; i12 < materialButtonToggleGroup.getChildCount(); i12++) {
                    if (materialButtonToggleGroup.getChildAt(i12) == view) {
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.d(i12)) {
                        i10++;
                    }
                }
            }
            i10 = -1;
            fVar.p(f.c.a(0, 1, i10, 1, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: e */
        public static final a6.a f3097e = new a6.a(0.0f);

        /* renamed from: a */
        public a6.c f3098a;

        /* renamed from: b */
        public a6.c f3099b;

        /* renamed from: c */
        public a6.c f3100c;

        /* renamed from: d */
        public a6.c f3101d;

        public c(a6.c cVar, a6.c cVar2, a6.c cVar3, a6.c cVar4) {
            this.f3098a = cVar;
            this.f3099b = cVar3;
            this.f3100c = cVar4;
            this.f3101d = cVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes.dex */
    public class e implements MaterialButton.b {
        public e() {
            MaterialButtonToggleGroup.this = r1;
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(e6.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131952631), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray d5 = n.d(getContext(), attributeSet, h6.a.E, R.attr.materialButtonToggleGroupStyle, 2131952631, new int[0]);
        setSingleSelection(d5.getBoolean(2, false));
        this.A = d5.getResourceId(0, -1);
        this.f3094z = d5.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        d5.recycle();
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (d(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && d(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            materialButton.setId(z.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f3089t);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton c10 = c(i10);
            int min = Math.min(c10.getStrokeWidth(), c(i10 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = c10.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                g.g(layoutParams2, 0);
                g.h(layoutParams2, -min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                g.h(layoutParams2, 0);
            }
            c10.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            return;
        }
        g.g(layoutParams3, 0);
        g.h(layoutParams3, 0);
        layoutParams3.leftMargin = 0;
        layoutParams3.rightMargin = 0;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$c>, java.util.ArrayList] */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f3088s.add(new c(shapeAppearanceModel.f224e, shapeAppearanceModel.f227h, shapeAppearanceModel.f225f, shapeAppearanceModel.f226g));
        z.p(materialButton, new b());
    }

    public final void b(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MaterialButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.B);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.y && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
            return;
        } else {
            if (!this.f3094z || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        e(hashSet);
    }

    public final MaterialButton c(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final boolean d(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f3091v);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(c(i10), Integer.valueOf(i10));
        }
        this.f3092w = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final void e(Set<Integer> set) {
        ?? r02 = this.B;
        this.B = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = c(i10).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f3093x = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f3093x = false;
            }
            if (r02.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<d> it = this.f3090u.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$c>, java.util.ArrayList] */
    public final void f() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton c10 = c(i10);
            if (c10.getVisibility() != 8) {
                j shapeAppearanceModel = c10.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                j.a aVar = new j.a(shapeAppearanceModel);
                c cVar2 = (c) this.f3088s.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z10 = getOrientation() == 0;
                    if (i10 == firstVisibleChildIndex) {
                        if (z10) {
                            if (s.a(this)) {
                                a6.a aVar2 = c.f3097e;
                                cVar = new c(aVar2, aVar2, cVar2.f3099b, cVar2.f3100c);
                            } else {
                                a6.c cVar3 = cVar2.f3098a;
                                a6.c cVar4 = cVar2.f3101d;
                                a6.a aVar3 = c.f3097e;
                                cVar = new c(cVar3, cVar4, aVar3, aVar3);
                            }
                        } else {
                            a6.c cVar5 = cVar2.f3098a;
                            a6.a aVar4 = c.f3097e;
                            cVar = new c(cVar5, aVar4, cVar2.f3099b, aVar4);
                        }
                    } else if (i10 != lastVisibleChildIndex) {
                        cVar2 = null;
                    } else if (z10) {
                        if (s.a(this)) {
                            a6.c cVar6 = cVar2.f3098a;
                            a6.c cVar7 = cVar2.f3101d;
                            a6.a aVar5 = c.f3097e;
                            cVar = new c(cVar6, cVar7, aVar5, aVar5);
                        } else {
                            a6.a aVar6 = c.f3097e;
                            cVar = new c(aVar6, aVar6, cVar2.f3099b, cVar2.f3100c);
                        }
                    } else {
                        a6.a aVar7 = c.f3097e;
                        cVar = new c(aVar7, cVar2.f3101d, aVar7, cVar2.f3100c);
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVar.e(0.0f);
                    aVar.f(0.0f);
                    aVar.d(0.0f);
                    aVar.c(0.0f);
                } else {
                    aVar.f236e = cVar2.f3098a;
                    aVar.f239h = cVar2.f3101d;
                    aVar.f237f = cVar2.f3099b;
                    aVar.f238g = cVar2.f3100c;
                }
                c10.setShapeAppearanceModel(new j(aVar));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public int getCheckedButtonId() {
        if (!this.y || this.B.isEmpty()) {
            return -1;
        }
        return ((Integer) this.B.iterator().next()).intValue();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = c(i10).getId();
            if (this.B.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f3092w;
        if (numArr == null || i11 >= numArr.length) {
            Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
            return i11;
        }
        return numArr[i11].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.A;
        if (i10 != -1) {
            e(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(1, getVisibleButtonCount(), this.y ? 1 : 2).f16416a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        a();
        super.onMeasure(i10, i11);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$c>, java.util.ArrayList] */
    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f3088s.remove(indexOfChild);
        }
        f();
        a();
    }

    public void setSelectionRequired(boolean z10) {
        this.f3094z = z10;
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        if (this.y != z10) {
            this.y = z10;
            e(new HashSet());
        }
    }
}
