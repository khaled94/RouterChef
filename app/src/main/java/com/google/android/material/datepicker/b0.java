package com.google.android.material.datepicker;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class b0 extends LinearLayoutManager {
    public b0(Context context, int i10) {
        super(i10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void F0(RecyclerView recyclerView, int i10) {
        a0 a0Var = new a0(recyclerView.getContext());
        a0Var.f1996a = i10;
        G0(a0Var);
    }
}
