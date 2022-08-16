package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.raouf.routerchef.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f0 extends RecyclerView.e<a> {

    /* renamed from: c */
    public final h<?> f3177c;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.a0 {

        /* renamed from: t */
        public final TextView f3178t;

        public a(TextView textView) {
            super(textView);
            this.f3178t = textView;
        }
    }

    public f0(h<?> hVar) {
        this.f3177c = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int a() {
        return this.f3177c.f3185p0.f3148w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void e(a aVar, int i10) {
        a aVar2 = aVar;
        int i11 = this.f3177c.f3185p0.f3144s.f3220u + i10;
        String string = aVar2.f3178t.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar2.f3178t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        aVar2.f3178t.setContentDescription(String.format(string, Integer.valueOf(i11)));
        c cVar = this.f3177c.f3188s0;
        Calendar d5 = d0.d();
        b bVar = d5.get(1) == i11 ? cVar.f3167f : cVar.f3165d;
        for (Long l10 : this.f3177c.f3184o0.l()) {
            d5.setTimeInMillis(l10.longValue());
            if (d5.get(1) == i11) {
                bVar = cVar.f3166e;
            }
        }
        bVar.b(aVar2.f3178t);
        aVar2.f3178t.setOnClickListener(new e0(this, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final a f(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    public final int h(int i10) {
        return i10 - this.f3177c.f3185p0.f3144s.f3220u;
    }
}
