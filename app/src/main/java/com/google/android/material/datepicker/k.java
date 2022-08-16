package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class k extends RecyclerView.q {

    /* renamed from: a */
    public final /* synthetic */ x f3200a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f3201b;

    /* renamed from: c */
    public final /* synthetic */ h f3202c;

    public k(h hVar, x xVar, MaterialButton materialButton) {
        this.f3202c = hVar;
        this.f3200a = xVar;
        this.f3201b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f3201b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        LinearLayoutManager f02 = this.f3202c.f0();
        int S0 = i10 < 0 ? f02.S0() : f02.T0();
        this.f3202c.f3186q0 = this.f3200a.h(S0);
        this.f3201b.setText(this.f3200a.h(S0).n());
    }
}
