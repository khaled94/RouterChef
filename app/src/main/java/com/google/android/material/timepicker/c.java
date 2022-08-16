package com.google.android.material.timepicker;

import a6.g;
import a6.h;
import a6.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.raouf.routerchef.R;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public class c extends ConstraintLayout {
    public final a K;
    public int L;
    public g M;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            c.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.s();
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g gVar = new g();
        this.M = gVar;
        h hVar = new h(0.5f);
        j jVar = gVar.f191s.f199a;
        Objects.requireNonNull(jVar);
        j.a aVar = new j.a(jVar);
        aVar.f236e = hVar;
        aVar.f237f = hVar;
        aVar.f238g = hVar;
        aVar.f239h = hVar;
        gVar.setShapeAppearanceModel(new j(aVar));
        this.M.o(ColorStateList.valueOf(-1));
        g gVar2 = this.M;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.q(this, gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h6.a.N, i10, 0);
        this.L = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.K = new a();
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            view.setId(z.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.K);
            handler.post(this.K);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        s();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.K);
            handler.post(this.K);
        }
    }

    public final void s() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if ("skip".equals(getChildAt(i11).getTag())) {
                i10++;
            }
        }
        b bVar = new b();
        bVar.c(this);
        float f10 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i13 = this.L;
                if (!bVar.f1133c.containsKey(Integer.valueOf(id))) {
                    bVar.f1133c.put(Integer.valueOf(id), new b.a());
                }
                b.C0011b c0011b = bVar.f1133c.get(Integer.valueOf(id)).f1137d;
                c0011b.f1191z = R.id.circle_center;
                c0011b.A = i13;
                c0011b.B = f10;
                f10 = (360.0f / (childCount - i10)) + f10;
            }
        }
        bVar.a(this);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.M.o(ColorStateList.valueOf(i10));
    }
}
