package m4;

import android.graphics.Bitmap;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class b70 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f6406s;

    /* renamed from: t */
    public final /* synthetic */ Object f6407t;

    /* renamed from: u */
    public final /* synthetic */ Object f6408u;

    public /* synthetic */ b70(Object obj, Object obj2, int i10) {
        this.f6406s = i10;
        this.f6407t = obj;
        this.f6408u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6406s) {
            case 0:
                d70 d70Var = (d70) this.f6407t;
                Objects.requireNonNull(d70Var);
                l82 l82Var = n82.f11571t;
                m82 m82Var = new m82();
                ((Bitmap) this.f6408u).compress(Bitmap.CompressFormat.PNG, 0, m82Var);
                synchronized (d70Var.f7240h) {
                    fc2 fc2Var = d70Var.f7233a;
                    rc2 v10 = tc2.v();
                    n82 b10 = m82Var.b();
                    if (v10.f9884u) {
                        v10.m();
                        v10.f9884u = false;
                    }
                    tc2.y((tc2) v10.f9883t, b10);
                    if (v10.f9884u) {
                        v10.m();
                        v10.f9884u = false;
                    }
                    tc2.x((tc2) v10.f9883t);
                    if (v10.f9884u) {
                        v10.m();
                        v10.f9884u = false;
                    }
                    tc2.z((tc2) v10.f9883t);
                    tc2 k10 = v10.k();
                    if (fc2Var.f9884u) {
                        fc2Var.m();
                        fc2Var.f9884u = false;
                    }
                    ad2.G((ad2) fc2Var.f9883t, k10);
                }
                return;
            default:
                fo2 fo2Var = ((eo2) this.f6407t).f8030b;
                int i10 = ls1.f10971a;
                fo2Var.t((o02) this.f6408u);
                return;
        }
    }
}
