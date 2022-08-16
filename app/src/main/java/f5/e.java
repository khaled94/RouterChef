package f5;

import android.view.View;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final View f4545a;

    /* renamed from: b */
    public int f4546b;

    /* renamed from: c */
    public int f4547c;

    /* renamed from: d */
    public int f4548d;

    /* renamed from: e */
    public int f4549e;

    public e(View view) {
        this.f4545a = view;
    }

    public final void a() {
        View view = this.f4545a;
        int top = this.f4548d - (view.getTop() - this.f4546b);
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        view.offsetTopAndBottom(top);
        View view2 = this.f4545a;
        view2.offsetLeftAndRight(this.f4549e - (view2.getLeft() - this.f4547c));
    }
}
