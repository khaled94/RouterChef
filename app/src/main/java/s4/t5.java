package s4;

import androidx.fragment.app.a;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class t5<T> implements Serializable, s5 {

    /* renamed from: s */
    public final s5<T> f18114s;

    /* renamed from: t */
    public volatile transient boolean f18115t;
    @CheckForNull

    /* renamed from: u */
    public transient T f18116u;

    public t5(s5<T> s5Var) {
        this.f18114s = s5Var;
    }

    public final String toString() {
        Object obj;
        if (this.f18115t) {
            String valueOf = String.valueOf(this.f18116u);
            obj = a.b(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.f18114s;
        }
        String valueOf2 = String.valueOf(obj);
        return a.b(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }

    @Override // s4.s5
    public final T zza() {
        if (!this.f18115t) {
            synchronized (this) {
                if (!this.f18115t) {
                    T zza = this.f18114s.zza();
                    this.f18116u = zza;
                    this.f18115t = true;
                    return zza;
                }
            }
        }
        return this.f18116u;
    }
}
