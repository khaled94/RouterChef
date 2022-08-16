package c4;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Objects;
import m4.w70;
import m4.x70;

/* loaded from: classes.dex */
public final class w0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f2751s = 1;

    /* renamed from: t */
    public final /* synthetic */ String f2752t;

    /* renamed from: u */
    public final /* synthetic */ Object f2753u;

    /* renamed from: v */
    public final /* synthetic */ Object f2754v;

    public /* synthetic */ w0(x70 x70Var, w70 w70Var, String str) {
        this.f2753u = x70Var;
        this.f2754v = w70Var;
        this.f2752t = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2751s) {
            case 0:
                x0 x0Var = (x0) this.f2754v;
                if (x0Var.f2758n0 > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) this.f2753u;
                    Bundle bundle = x0Var.f2759o0;
                    lifecycleCallback.c(bundle != null ? bundle.getBundle(this.f2752t) : null);
                }
                if (((x0) this.f2754v).f2758n0 >= 2) {
                    ((LifecycleCallback) this.f2753u).f();
                }
                if (((x0) this.f2754v).f2758n0 >= 3) {
                    ((LifecycleCallback) this.f2753u).d();
                }
                if (((x0) this.f2754v).f2758n0 >= 4) {
                    ((LifecycleCallback) this.f2753u).g();
                }
                if (((x0) this.f2754v).f2758n0 < 5) {
                    return;
                }
                Objects.requireNonNull((LifecycleCallback) this.f2753u);
                return;
            default:
                x70 x70Var = (x70) this.f2753u;
                w70 w70Var = (w70) this.f2754v;
                String str = this.f2752t;
                if (x70Var.f15237j.get() == null) {
                    return;
                }
                try {
                    w70Var.b(x70Var.f15237j.get());
                    return;
                } catch (Exception unused) {
                    x70Var.c(str, false);
                    return;
                }
        }
    }
}
