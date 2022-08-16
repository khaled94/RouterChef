package k9;

import n9.m;
import o9.c;

/* loaded from: classes.dex */
public abstract class t0 extends q {
    public abstract t0 o0();

    public final String p0() {
        t0 t0Var;
        c cVar = b0.f5640a;
        t0 t0Var2 = m.f16715a;
        if (this == t0Var2) {
            return "Dispatchers.Main";
        }
        try {
            t0Var = t0Var2.o0();
        } catch (UnsupportedOperationException unused) {
            t0Var = null;
        }
        if (this != t0Var) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // k9.q
    public String toString() {
        String p02 = p0();
        if (p02 == null) {
            return getClass().getSimpleName() + '@' + u.b(this);
        }
        return p02;
    }
}
