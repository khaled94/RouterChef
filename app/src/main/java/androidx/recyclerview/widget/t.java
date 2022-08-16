package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class t extends o {

    /* renamed from: q */
    public final /* synthetic */ u f2213q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.f2213q = uVar;
    }

    @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.RecyclerView.w
    public final void c(View view, RecyclerView.w.a aVar) {
        u uVar = this.f2213q;
        int[] a10 = uVar.a(uVar.f2077a.getLayoutManager(), view);
        int i10 = a10[0];
        int i11 = a10[1];
        int ceil = (int) Math.ceil(g(Math.max(Math.abs(i10), Math.abs(i11))) / 0.3356d);
        if (ceil > 0) {
            aVar.b(i10, i11, ceil, this.f2203j);
        }
    }

    @Override // androidx.recyclerview.widget.o
    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o
    public final int g(int i10) {
        return Math.min(100, super.g(i10));
    }
}
