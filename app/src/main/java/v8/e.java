package v8;

import e9.f;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class e<T> implements Serializable {

    /* loaded from: classes.dex */
    public static final class a implements Serializable {

        /* renamed from: s */
        public final Throwable f19831s;

        public a(Throwable th) {
            f.e(th, "exception");
            this.f19831s = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && f.a(this.f19831s, ((a) obj).f19831s);
        }

        public final int hashCode() {
            return this.f19831s.hashCode();
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("Failure(");
            c10.append(this.f19831s);
            c10.append(')');
            return c10.toString();
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f19831s;
        }
        return null;
    }
}
