package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w implements AdapterView.OnItemClickListener {

    /* renamed from: s */
    public final /* synthetic */ MaterialCalendarGridView f3230s;

    /* renamed from: t */
    public final /* synthetic */ x f3231t;

    public w(x xVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f3231t = xVar;
        this.f3230s = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j3) {
        v adapter2 = this.f3230s.getAdapter2();
        if (i10 >= adapter2.c() && i10 <= adapter2.e()) {
            h.d dVar = (h.d) this.f3231t.f3234e;
            if (!h.this.f3185p0.f3146u.i(this.f3230s.getAdapter2().getItem(i10).longValue())) {
                return;
            }
            h.this.f3184o0.d();
            Iterator it = h.this.f3238m0.iterator();
            while (it.hasNext()) {
                ((y) it.next()).a(h.this.f3184o0.o());
            }
            h.this.f3190u0.getAdapter().d();
            RecyclerView recyclerView = h.this.f3189t0;
            if (recyclerView == null) {
                return;
            }
            recyclerView.getAdapter().d();
        }
    }
}
