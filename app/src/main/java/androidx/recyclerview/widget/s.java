package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a */
    public final RecyclerView.m f2210a;

    /* renamed from: b */
    public int f2211b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f2212c = new Rect();

    public s(RecyclerView.m mVar) {
        this.f2210a = mVar;
    }

    public static s a(RecyclerView.m mVar, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return new r(mVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new q(mVar);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.f2211b) {
            return 0;
        }
        return l() - this.f2211b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i10);
}
