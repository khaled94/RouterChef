package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

/* loaded from: classes.dex */
public abstract class z extends RecyclerView.j {

    /* renamed from: g */
    public boolean f2222g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean a(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f1951a;
        int i13 = cVar.f1952b;
        if (a0Var2.u()) {
            int i14 = cVar.f1951a;
            i10 = cVar.f1952b;
            i11 = i14;
        } else {
            i11 = cVar2.f1951a;
            i10 = cVar2.f1952b;
        }
        k kVar = (k) this;
        if (a0Var == a0Var2) {
            return kVar.h(a0Var, i12, i13, i11, i10);
        }
        float translationX = a0Var.f1924a.getTranslationX();
        float translationY = a0Var.f1924a.getTranslationY();
        float alpha = a0Var.f1924a.getAlpha();
        kVar.m(a0Var);
        a0Var.f1924a.setTranslationX(translationX);
        a0Var.f1924a.setTranslationY(translationY);
        a0Var.f1924a.setAlpha(alpha);
        kVar.m(a0Var2);
        a0Var2.f1924a.setTranslationX(-((int) ((i11 - i12) - translationX)));
        a0Var2.f1924a.setTranslationY(-((int) ((i10 - i13) - translationY)));
        a0Var2.f1924a.setAlpha(0.0f);
        kVar.f2131k.add(new k.a(a0Var, a0Var2, i12, i13, i11, i10));
        return true;
    }

    public abstract boolean h(RecyclerView.a0 a0Var, int i10, int i11, int i12, int i13);
}
