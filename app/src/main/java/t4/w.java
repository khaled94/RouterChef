package t4;

import java.util.Set;
import javax.annotation.CheckForNull;
import n9.d;

/* loaded from: classes.dex */
public abstract class w extends q implements Set {
    @CheckForNull

    /* renamed from: t */
    public transient t f18669t;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return d.b(this);
    }

    public t i() {
        t tVar = this.f18669t;
        if (tVar == null) {
            t k10 = k();
            this.f18669t = k10;
            return k10;
        }
        return tVar;
    }

    public t k() {
        Object[] array = toArray();
        r rVar = t.f18662t;
        return t.k(array, array.length);
    }
}
