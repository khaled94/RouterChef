package u3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import f3.b;
import f3.e;
import n3.g1;

/* loaded from: classes.dex */
public final class a extends ViewGroup {
    @RecentlyNonNull
    public b getAdListener() {
        throw null;
    }

    @RecentlyNullable
    public e getAdSize() {
        throw null;
    }

    @RecentlyNonNull
    public String getAdUnitId() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i14 = ((i12 - i10) - measuredWidth) / 2;
        int i15 = ((i13 - i11) - measuredHeight) / 2;
        childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        e eVar;
        int i12;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                eVar = getAdSize();
            } catch (NullPointerException e10) {
                g1.h("Unable to retrieve ad size.", e10);
                eVar = null;
            }
            if (eVar != null) {
                Context context = getContext();
                int b10 = eVar.b(context);
                i12 = eVar.a(context);
                i13 = b10;
            } else {
                i12 = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            i13 = childAt.getMeasuredWidth();
            i12 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }

    public void setAdListener(@RecentlyNonNull b bVar) {
        throw null;
    }

    public void setAdSize(@RecentlyNonNull e eVar) {
        throw null;
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        throw null;
    }
}
