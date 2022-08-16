package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.raouf.routerchef.R;
import e5.g;
import e5.i;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    public Map<View, Integer> f3455i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final FabTransformationBehavior.b A(Context context, boolean z10) {
        int i10 = z10 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f3449a = g.a(context, i10);
        bVar.f3450b = new i();
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map<android.view.View, java.lang.Integer>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Map<android.view.View, java.lang.Integer>, java.util.HashMap] */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void s(View view, View view2, boolean z10, boolean z11) {
        int i10;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f3455i = new HashMap(childCount);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                boolean z12 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f1242a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z12) {
                    ?? r52 = this.f3455i;
                    if (z10) {
                        r52.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        i10 = 4;
                    } else if (r52 != 0 && r52.containsKey(childAt)) {
                        i10 = ((Integer) this.f3455i.get(childAt)).intValue();
                    }
                    WeakHashMap<View, f0> weakHashMap = z.f5921a;
                    z.d.s(childAt, i10);
                }
            }
            if (!z10) {
                this.f3455i = null;
            }
        }
        super.s(view, view2, z10, z11);
    }
}
