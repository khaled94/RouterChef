package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class u extends a0 {

    /* renamed from: c */
    public r f2214c;

    /* renamed from: d */
    public q f2215d;

    @Override // androidx.recyclerview.widget.a0
    public final int[] a(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.e()) {
            iArr[0] = c(view, e(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.f()) {
            iArr[1] = c(view, f(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int c(View view, s sVar) {
        return ((sVar.c(view) / 2) + sVar.e(view)) - ((sVar.l() / 2) + sVar.k());
    }

    public final View d(RecyclerView.m mVar, s sVar) {
        int x10 = mVar.x();
        View view = null;
        if (x10 == 0) {
            return null;
        }
        int l10 = (sVar.l() / 2) + sVar.k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < x10; i11++) {
            View w10 = mVar.w(i11);
            int abs = Math.abs(((sVar.c(w10) / 2) + sVar.e(w10)) - l10);
            if (abs < i10) {
                view = w10;
                i10 = abs;
            }
        }
        return view;
    }

    public final s e(RecyclerView.m mVar) {
        q qVar = this.f2215d;
        if (qVar == null || qVar.f2210a != mVar) {
            this.f2215d = new q(mVar);
        }
        return this.f2215d;
    }

    public final s f(RecyclerView.m mVar) {
        r rVar = this.f2214c;
        if (rVar == null || rVar.f2210a != mVar) {
            this.f2214c = new r(mVar);
        }
        return this.f2214c;
    }
}
