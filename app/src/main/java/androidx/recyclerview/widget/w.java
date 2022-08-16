package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes.dex */
public final class w implements a.AbstractC0024a {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f2217a;

    public w(RecyclerView recyclerView) {
        this.f2217a = recyclerView;
    }

    public final void a(a.b bVar) {
        int i10 = bVar.f2073a;
        if (i10 == 1) {
            this.f2217a.E.b0(bVar.f2074b, bVar.f2076d);
        } else if (i10 == 2) {
            this.f2217a.E.e0(bVar.f2074b, bVar.f2076d);
        } else if (i10 == 4) {
            this.f2217a.E.f0(bVar.f2074b, bVar.f2076d);
        } else if (i10 != 8) {
        } else {
            this.f2217a.E.d0(bVar.f2074b, bVar.f2076d);
        }
    }

    public final RecyclerView.a0 b(int i10) {
        RecyclerView recyclerView = this.f2217a;
        int h10 = recyclerView.f1916w.h();
        int i11 = 0;
        RecyclerView.a0 a0Var = null;
        while (true) {
            if (i11 >= h10) {
                break;
            }
            RecyclerView.a0 K = RecyclerView.K(recyclerView.f1916w.g(i11));
            if (K != null && !K.m() && K.f1926c == i10) {
                if (!recyclerView.f1916w.k(K.f1924a)) {
                    a0Var = K;
                    break;
                }
                a0Var = K;
            }
            i11++;
        }
        if (a0Var != null && !this.f2217a.f1916w.k(a0Var.f1924a)) {
            return a0Var;
        }
        return null;
    }

    public final void c(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f2217a;
        int h10 = recyclerView.f1916w.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < h10; i15++) {
            View g10 = recyclerView.f1916w.g(i15);
            RecyclerView.a0 K = RecyclerView.K(g10);
            if (K != null && !K.u() && (i13 = K.f1926c) >= i10 && i13 < i14) {
                K.b(2);
                K.a(obj);
                ((RecyclerView.n) g10.getLayoutParams()).f1978c = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f1910t;
        int size = sVar.f1988c.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f2217a.B0 = true;
                return;
            }
            RecyclerView.a0 a0Var = sVar.f1988c.get(size);
            if (a0Var != null && (i12 = a0Var.f1926c) >= i10 && i12 < i14) {
                a0Var.b(2);
                sVar.f(size);
            }
        }
    }

    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.f2217a;
        int h10 = recyclerView.f1916w.h();
        for (int i12 = 0; i12 < h10; i12++) {
            RecyclerView.a0 K = RecyclerView.K(recyclerView.f1916w.g(i12));
            if (K != null && !K.u() && K.f1926c >= i10) {
                K.q(i11, false);
                recyclerView.x0.f2016f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f1910t;
        int size = sVar.f1988c.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.a0 a0Var = sVar.f1988c.get(i13);
            if (a0Var != null && a0Var.f1926c >= i10) {
                a0Var.q(i11, true);
            }
        }
        recyclerView.requestLayout();
        this.f2217a.A0 = true;
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f2217a;
        int h10 = recyclerView.f1916w.h();
        int i19 = -1;
        if (i10 < i11) {
            i14 = i10;
            i13 = i11;
            i12 = -1;
        } else {
            i13 = i10;
            i14 = i11;
            i12 = 1;
        }
        for (int i20 = 0; i20 < h10; i20++) {
            RecyclerView.a0 K = RecyclerView.K(recyclerView.f1916w.g(i20));
            if (K != null && (i18 = K.f1926c) >= i14 && i18 <= i13) {
                if (i18 == i10) {
                    K.q(i11 - i10, false);
                } else {
                    K.q(i12, false);
                }
                recyclerView.x0.f2016f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f1910t;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = sVar.f1988c.size();
        for (int i21 = 0; i21 < size; i21++) {
            RecyclerView.a0 a0Var = sVar.f1988c.get(i21);
            if (a0Var != null && (i17 = a0Var.f1926c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    a0Var.q(i11 - i10, false);
                } else {
                    a0Var.q(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f2217a.A0 = true;
    }
}
