package m4;

import androidx.fragment.app.a;
import i0.b;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public abstract class qy1<I, O, F, T> extends fz1<O> implements Runnable {
    public static final /* synthetic */ int B = 0;
    @CheckForNull
    public F A;
    @CheckForNull

    /* renamed from: z */
    public tz1<? extends I> f13026z;

    public qy1(tz1<? extends I> tz1Var, F f10) {
        Objects.requireNonNull(tz1Var);
        this.f13026z = tz1Var;
        Objects.requireNonNull(f10);
        this.A = f10;
    }

    @Override // m4.my1
    @CheckForNull
    public final String h() {
        String str;
        tz1<? extends I> tz1Var = this.f13026z;
        F f10 = this.A;
        String h10 = super.h();
        if (tz1Var != null) {
            String obj = tz1Var.toString();
            str = a.b(new StringBuilder(obj.length() + 16), "inputFuture=[", obj, "], ");
        } else {
            str = "";
        }
        if (f10 != null) {
            String obj2 = f10.toString();
            return b.a(new StringBuilder(obj2.length() + str.length() + 11), str, "function=[", obj2, "]");
        } else if (h10 == null) {
            return null;
        } else {
            return h10.length() != 0 ? str.concat(h10) : new String(str);
        }
    }

    @Override // m4.my1
    public final void i() {
        k(this.f13026z);
        this.f13026z = null;
        this.A = null;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        tz1<? extends I> tz1Var = this.f13026z;
        F f10 = this.A;
        boolean z10 = true;
        boolean z11 = (this.f11358s instanceof by1) | (tz1Var == null);
        if (f10 != null) {
            z10 = false;
        }
        if (z11 || z10) {
            return;
        }
        this.f13026z = null;
        if (tz1Var.isCancelled()) {
            n(tz1Var);
            return;
        }
        try {
            try {
                Object s10 = s(f10, mz1.r(tz1Var));
                this.A = null;
                t(s10);
            } catch (Throwable th) {
                try {
                    m(th);
                    this.A = null;
                } catch (Throwable th2) {
                    this.A = null;
                    throw th2;
                }
            }
        } catch (Error e10) {
            m(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e11) {
            m(e11);
        } catch (ExecutionException e12) {
            m(e12.getCause());
        }
    }

    public abstract T s(F f10, I i10);

    public abstract void t(T t10);
}
