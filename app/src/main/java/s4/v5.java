package s4;

import androidx.fragment.app.a;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class v5<T> implements Serializable, s5 {

    /* renamed from: s */
    public final T f18149s;

    public v5(T t10) {
        this.f18149s = t10;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof v5) {
            T t10 = this.f18149s;
            T t11 = ((v5) obj).f18149s;
            return t10 == t11 || t10.equals(t11);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18149s});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f18149s);
        return a.b(new StringBuilder(valueOf.length() + 22), "Suppliers.ofInstance(", valueOf, ")");
    }

    @Override // s4.s5
    public final T zza() {
        return this.f18149s;
    }
}
