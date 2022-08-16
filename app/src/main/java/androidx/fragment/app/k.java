package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ u0 f1462s;

    /* renamed from: t */
    public final /* synthetic */ View f1463t;

    /* renamed from: u */
    public final /* synthetic */ Rect f1464u;

    public k(u0 u0Var, View view, Rect rect) {
        this.f1462s = u0Var;
        this.f1463t = view;
        this.f1464u = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1462s.g(this.f1463t, this.f1464u);
    }
}
