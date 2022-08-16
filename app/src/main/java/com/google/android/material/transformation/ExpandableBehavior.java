package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a */
    public int f3434a = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: s */
        public final /* synthetic */ View f3435s;

        /* renamed from: t */
        public final /* synthetic */ int f3436t;

        /* renamed from: u */
        public final /* synthetic */ s5.a f3437u;

        public a(View view, int i10, s5.a aVar) {
            ExpandableBehavior.this = r1;
            this.f3435s = view;
            this.f3436t = i10;
            this.f3437u = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.f3435s.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f3434a == this.f3436t) {
                s5.a aVar = this.f3437u;
                expandableBehavior.s((View) aVar, this.f3435s, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean b(View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i10;
        s5.a aVar = (s5.a) view2;
        int i11 = 2;
        if (!aVar.a() ? this.f3434a == 1 : (i10 = this.f3434a) == 0 || i10 == 2) {
            if (aVar.a()) {
                i11 = 1;
            }
            this.f3434a = i11;
            s((View) aVar, view, aVar.a(), true);
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        s5.a aVar;
        int i11;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (!z.g.c(view)) {
            ArrayList arrayList = (ArrayList) coordinatorLayout.d(view);
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) arrayList.get(i12);
                if (b(view, view2)) {
                    aVar = (s5.a) view2;
                    break;
                }
                i12++;
            }
            if (aVar != null) {
                int i13 = 2;
                if (!aVar.a() ? this.f3434a == 1 : (i11 = this.f3434a) == 0 || i11 == 2) {
                    if (aVar.a()) {
                        i13 = 1;
                    }
                    this.f3434a = i13;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i13, aVar));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z10, boolean z11);
}
