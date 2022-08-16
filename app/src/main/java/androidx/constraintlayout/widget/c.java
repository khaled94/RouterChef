package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.util.Objects;
import l0.g;

/* loaded from: classes.dex */
public final class c extends ViewGroup {

    /* renamed from: s */
    public b f1221s;

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.a {
        public float A0;
        public float B0;
        public float C0;
        public float D0;

        /* renamed from: r0 */
        public float f1222r0;

        /* renamed from: s0 */
        public boolean f1223s0;

        /* renamed from: t0 */
        public float f1224t0;

        /* renamed from: u0 */
        public float f1225u0;

        /* renamed from: v0 */
        public float f1226v0;

        /* renamed from: w0 */
        public float f1227w0;
        public float x0;

        /* renamed from: y0 */
        public float f1228y0;

        /* renamed from: z0 */
        public float f1229z0;

        public a() {
            this.f1222r0 = 1.0f;
            this.f1223s0 = false;
            this.f1224t0 = 0.0f;
            this.f1225u0 = 0.0f;
            this.f1226v0 = 0.0f;
            this.f1227w0 = 0.0f;
            this.x0 = 1.0f;
            this.f1228y0 = 1.0f;
            this.f1229z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1222r0 = 1.0f;
            this.f1223s0 = false;
            this.f1224t0 = 0.0f;
            this.f1225u0 = 0.0f;
            this.f1226v0 = 0.0f;
            this.f1227w0 = 0.0f;
            this.x0 = 1.0f;
            this.f1228y0 = 1.0f;
            this.f1229z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f5717v);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 15) {
                    this.f1222r0 = obtainStyledAttributes.getFloat(index, this.f1222r0);
                } else if (index == 28) {
                    this.f1224t0 = obtainStyledAttributes.getFloat(index, this.f1224t0);
                    this.f1223s0 = true;
                } else if (index == 23) {
                    this.f1226v0 = obtainStyledAttributes.getFloat(index, this.f1226v0);
                } else if (index == 24) {
                    this.f1227w0 = obtainStyledAttributes.getFloat(index, this.f1227w0);
                } else if (index == 22) {
                    this.f1225u0 = obtainStyledAttributes.getFloat(index, this.f1225u0);
                } else if (index == 20) {
                    this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == 21) {
                    this.f1228y0 = obtainStyledAttributes.getFloat(index, this.f1228y0);
                } else if (index == 16) {
                    this.f1229z0 = obtainStyledAttributes.getFloat(index, this.f1229z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public b getConstraintSet() {
        if (this.f1221s == null) {
            this.f1221s = new b();
        }
        b bVar = this.f1221s;
        Objects.requireNonNull(bVar);
        int childCount = getChildCount();
        bVar.f1133c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (bVar.f1132b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!bVar.f1133c.containsKey(Integer.valueOf(id))) {
                bVar.f1133c.put(Integer.valueOf(id), new b.a());
            }
            b.a aVar2 = bVar.f1133c.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar3 = (androidx.constraintlayout.widget.a) childAt;
                    aVar2.c(id, aVar);
                    if (aVar3 instanceof Barrier) {
                        b.C0011b c0011b = aVar2.f1137d;
                        c0011b.f1168h0 = 1;
                        Barrier barrier = (Barrier) aVar3;
                        c0011b.f1164f0 = barrier.getType();
                        aVar2.f1137d.f1170i0 = barrier.getReferencedIds();
                        aVar2.f1137d.f1166g0 = barrier.getMargin();
                    }
                }
                aVar2.c(id, aVar);
            }
        }
        return this.f1221s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
