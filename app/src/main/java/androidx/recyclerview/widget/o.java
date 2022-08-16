package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class o extends RecyclerView.w {

    /* renamed from: k */
    public PointF f2204k;

    /* renamed from: l */
    public final DisplayMetrics f2205l;

    /* renamed from: n */
    public float f2207n;

    /* renamed from: i */
    public final LinearInterpolator f2202i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f2203j = new DecelerateInterpolator();

    /* renamed from: m */
    public boolean f2206m = false;

    /* renamed from: o */
    public int f2208o = 0;
    public int p = 0;

    public o(Context context) {
        this.f2205l = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w
    public void c(View view, RecyclerView.w.a aVar) {
        int i10;
        int i11;
        int i12;
        PointF pointF = this.f2204k;
        int i13 = 0;
        int i14 = (pointF == null || pointF.x == 0.0f) ? 0 : i12 > 0 ? 1 : -1;
        RecyclerView.m mVar = this.f1998c;
        if (mVar == null || !mVar.e()) {
            i10 = 0;
        } else {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            i10 = e(mVar.C(view) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, mVar.D(view) + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, mVar.K(), mVar.p - mVar.L(), i14);
        }
        PointF pointF2 = this.f2204k;
        int i15 = (pointF2 == null || pointF2.y == 0.0f) ? 0 : i11 > 0 ? 1 : -1;
        RecyclerView.m mVar2 = this.f1998c;
        if (mVar2 != null && mVar2.f()) {
            RecyclerView.n nVar2 = (RecyclerView.n) view.getLayoutParams();
            i13 = e(mVar2.E(view) - ((ViewGroup.MarginLayoutParams) nVar2).topMargin, mVar2.A(view) + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin, mVar2.M(), mVar2.f1969q - mVar2.J(), i15);
        }
        int ceil = (int) Math.ceil(g((int) Math.sqrt((i13 * i13) + (i10 * i10))) / 0.3356d);
        if (ceil > 0) {
            aVar.b(-i10, -i13, ceil, this.f2203j);
        }
    }

    public final int e(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                }
                return i13 - i11;
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 >= 0) {
                return 0;
            }
            return i16;
        }
        return i12 - i10;
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int g(int i10) {
        float abs = Math.abs(i10);
        if (!this.f2206m) {
            this.f2207n = f(this.f2205l);
            this.f2206m = true;
        }
        return (int) Math.ceil(abs * this.f2207n);
    }
}
