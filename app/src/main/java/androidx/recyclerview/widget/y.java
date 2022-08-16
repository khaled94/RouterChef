package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class y {
    public static int a(RecyclerView.x xVar, s sVar, View view, View view2, RecyclerView.m mVar, boolean z10) {
        if (mVar.x() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(mVar.N(view) - mVar.N(view2)) + 1;
        }
        return Math.min(sVar.l(), sVar.b(view2) - sVar.e(view));
    }

    public static int b(RecyclerView.x xVar, s sVar, View view, View view2, RecyclerView.m mVar, boolean z10, boolean z11) {
        if (mVar.x() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z11 ? Math.max(0, (xVar.b() - Math.max(mVar.N(view), mVar.N(view2))) - 1) : Math.max(0, Math.min(mVar.N(view), mVar.N(view2)));
        if (!z10) {
            return max;
        }
        return Math.round((max * (Math.abs(sVar.b(view2) - sVar.e(view)) / (Math.abs(mVar.N(view) - mVar.N(view2)) + 1))) + (sVar.k() - sVar.e(view)));
    }

    public static int c(RecyclerView.x xVar, s sVar, View view, View view2, RecyclerView.m mVar, boolean z10) {
        if (mVar.x() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return xVar.b();
        }
        return (int) (((sVar.b(view2) - sVar.e(view)) / (Math.abs(mVar.N(view) - mVar.N(view2)) + 1)) * xVar.b());
    }
}
