package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import l0.g;
import u.a;

/* loaded from: classes.dex */
public class Barrier extends a {
    public int A;
    public int B;
    public a C;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.C.f18897u0;
    }

    public int getMargin() {
        return this.C.f18898v0;
    }

    public int getType() {
        return this.A;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.C = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f5715t);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.C.f18897u0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.C.f18898v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1124v = this.C;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r0 == 6) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r0 == 6) goto L10;
     */
    @Override // androidx.constraintlayout.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(u.d r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.A
            r3.B = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto Le
            if (r0 != r2) goto Lb
            goto L16
        Lb:
            if (r0 != r1) goto L18
            goto L10
        Le:
            if (r0 != r2) goto L14
        L10:
            r5 = 0
        L11:
            r3.B = r5
            goto L18
        L14:
            if (r0 != r1) goto L18
        L16:
            r5 = 1
            goto L11
        L18:
            boolean r5 = r4 instanceof u.a
            if (r5 == 0) goto L22
            u.a r4 = (u.a) r4
            int r5 = r3.B
            r4.f18896t0 = r5
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.j(u.d, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.C.f18897u0 = z10;
    }

    public void setDpMargin(int i10) {
        this.C.f18898v0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.C.f18898v0 = i10;
    }

    public void setType(int i10) {
        this.A = i10;
    }
}
