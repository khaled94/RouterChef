package v8;

import e9.f;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class d<A, B> implements Serializable {

    /* renamed from: s */
    public final A f19829s;

    /* renamed from: t */
    public final B f19830t;

    public d(A a10, B b10) {
        this.f19829s = a10;
        this.f19830t = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.a(this.f19829s, dVar.f19829s) && f.a(this.f19830t, dVar.f19830t);
    }

    public final int hashCode() {
        A a10 = this.f19829s;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f19830t;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return '(' + this.f19829s + ", " + this.f19830t + ')';
    }
}
