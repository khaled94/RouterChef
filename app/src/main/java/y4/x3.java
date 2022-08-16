package y4;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class x3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ AtomicReference f20808s;

    /* renamed from: t */
    public final /* synthetic */ f4 f20809t;

    public x3(f4 f4Var, AtomicReference atomicReference) {
        this.f20809t = f4Var;
        this.f20808s = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        double d5;
        synchronized (this.f20808s) {
            AtomicReference atomicReference = this.f20808s;
            k3 k3Var = this.f20809t.f20505s;
            e eVar = ((w2) k3Var).y;
            String l10 = ((w2) k3Var).p().l();
            e1<Double> e1Var = f1.O;
            Objects.requireNonNull(eVar);
            if (l10 != null) {
                String e10 = eVar.f20369u.e(l10, e1Var.f20373a);
                if (!TextUtils.isEmpty(e10)) {
                    try {
                        d5 = e1Var.a(Double.valueOf(Double.parseDouble(e10))).doubleValue();
                    } catch (NumberFormatException unused) {
                    }
                    atomicReference.set(Double.valueOf(d5));
                    this.f20808s.notify();
                }
            }
            d5 = e1Var.a(null).doubleValue();
            atomicReference.set(Double.valueOf(d5));
            this.f20808s.notify();
        }
    }
}
