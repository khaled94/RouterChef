package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import com.raouf.routerchef.R;
import java.util.WeakHashMap;
import m0.f0;
import m0.y;
import m0.z;

/* loaded from: classes.dex */
public final class x extends RecyclerView.e<a> {

    /* renamed from: c */
    public final com.google.android.material.datepicker.a f3232c;

    /* renamed from: d */
    public final d<?> f3233d;

    /* renamed from: e */
    public final h.e f3234e;

    /* renamed from: f */
    public final int f3235f;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.a0 {

        /* renamed from: t */
        public final TextView f3236t;

        /* renamed from: u */
        public final MaterialCalendarGridView f3237u;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f3236t = textView;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            new y().e(textView, Boolean.TRUE);
            this.f3237u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    public x(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, h.e eVar) {
        u uVar = aVar.f3144s;
        u uVar2 = aVar.f3145t;
        u uVar3 = aVar.f3147v;
        if (uVar.compareTo(uVar3) <= 0) {
            if (uVar3.compareTo(uVar2) > 0) {
                throw new IllegalArgumentException("currentPage cannot be after lastPage");
            }
            int i10 = v.f3224x;
            int i11 = h.x0;
            this.f3235f = (context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i10) + (p.j0(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
            this.f3232c = aVar;
            this.f3233d = dVar;
            this.f3234e = eVar;
            g(true);
            return;
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int a() {
        return this.f3232c.f3149x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long b(int i10) {
        return this.f3232c.f3144s.r(i10).f3218s.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void e(a aVar, int i10) {
        a aVar2 = aVar;
        u r10 = this.f3232c.f3144s.r(i10);
        aVar2.f3236t.setText(r10.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.f3237u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && r10.equals(materialCalendarGridView.getAdapter2().f3225s)) {
            materialCalendarGridView.invalidate();
            v adapter2 = materialCalendarGridView.getAdapter2();
            for (Long l10 : adapter2.f3227u) {
                adapter2.g(materialCalendarGridView, l10.longValue());
            }
            d<?> dVar = adapter2.f3226t;
            if (dVar != null) {
                for (Long l11 : dVar.l()) {
                    adapter2.g(materialCalendarGridView, l11.longValue());
                }
                adapter2.f3227u = adapter2.f3226t.l();
            }
        } else {
            v vVar = new v(r10, this.f3233d, this.f3232c);
            materialCalendarGridView.setNumColumns(r10.f3221v);
            materialCalendarGridView.setAdapter((ListAdapter) vVar);
        }
        materialCalendarGridView.setOnItemClickListener(new w(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final a f(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (p.j0(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.n(-1, this.f3235f));
            return new a(linearLayout, true);
        }
        return new a(linearLayout, false);
    }

    public final u h(int i10) {
        return this.f3232c.f3144s.r(i10);
    }

    public final int i(u uVar) {
        return this.f3232c.f3144s.s(uVar);
    }
}
