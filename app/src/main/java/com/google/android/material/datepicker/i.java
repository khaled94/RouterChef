package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import l0.c;

/* loaded from: classes.dex */
public final class i extends RecyclerView.l {

    /* renamed from: a */
    public final Calendar f3196a = d0.e(null);

    /* renamed from: b */
    public final Calendar f3197b = d0.e(null);

    /* renamed from: c */
    public final /* synthetic */ h f3198c;

    public i(h hVar) {
        this.f3198c = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (!(recyclerView.getAdapter() instanceof f0) || !(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        f0 f0Var = (f0) recyclerView.getAdapter();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        for (c<Long, Long> cVar : this.f3198c.f3184o0.h()) {
            Long l10 = cVar.f5709a;
            if (l10 != null && cVar.f5710b != null) {
                this.f3196a.setTimeInMillis(l10.longValue());
                this.f3197b.setTimeInMillis(cVar.f5710b.longValue());
                int h10 = f0Var.h(this.f3196a.get(1));
                int h11 = f0Var.h(this.f3197b.get(1));
                View s10 = gridLayoutManager.s(h10);
                View s11 = gridLayoutManager.s(h11);
                int i10 = gridLayoutManager.H;
                int i11 = h10 / i10;
                int i12 = h11 / i10;
                for (int i13 = i11; i13 <= i12; i13++) {
                    View s12 = gridLayoutManager.s(gridLayoutManager.H * i13);
                    if (s12 != null) {
                        int top = s12.getTop() + this.f3198c.f3188s0.f3165d.f3156a.top;
                        int bottom = s12.getBottom() - this.f3198c.f3188s0.f3165d.f3156a.bottom;
                        canvas.drawRect(i13 == i11 ? (s10.getWidth() / 2) + s10.getLeft() : 0, top, i13 == i12 ? (s11.getWidth() / 2) + s11.getLeft() : recyclerView.getWidth(), bottom, this.f3198c.f3188s0.f3169h);
                    }
                }
            }
        }
    }
}
