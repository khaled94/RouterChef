package s4;

import androidx.fragment.app.a;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class r5<T> extends q5<T> {

    /* renamed from: s */
    public final T f18082s;

    public r5(T t10) {
        this.f18082s = t10;
    }

    @Override // s4.q5
    public final T a() {
        return this.f18082s;
    }

    @Override // s4.q5
    public final boolean b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof r5) {
            return this.f18082s.equals(((r5) obj).f18082s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18082s.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f18082s);
        return a.b(new StringBuilder(valueOf.length() + 13), "Optional.of(", valueOf, ")");
    }
}
