package s4;

import androidx.fragment.app.a;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class u5<T> implements s5<T> {
    @CheckForNull

    /* renamed from: s */
    public volatile s5<T> f18129s;

    /* renamed from: t */
    public volatile boolean f18130t;
    @CheckForNull

    /* renamed from: u */
    public T f18131u;

    public u5(s5<T> s5Var) {
        this.f18129s = s5Var;
    }

    public final String toString() {
        Object obj = this.f18129s;
        if (obj == null) {
            String valueOf = String.valueOf(this.f18131u);
            obj = a.b(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String valueOf2 = String.valueOf(obj);
        return a.b(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }

    @Override // s4.s5
    public final T zza() {
        if (!this.f18130t) {
            synchronized (this) {
                if (!this.f18130t) {
                    s5<T> s5Var = this.f18129s;
                    Objects.requireNonNull(s5Var);
                    T zza = s5Var.zza();
                    this.f18131u = zza;
                    this.f18130t = true;
                    this.f18129s = null;
                    return zza;
                }
            }
        }
        return this.f18131u;
    }
}
