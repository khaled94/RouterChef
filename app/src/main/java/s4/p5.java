package s4;

import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class p5<T> extends q5<T> {

    /* renamed from: s */
    public static final p5<Object> f18058s = new p5<>();

    @Override // s4.q5
    public final T a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // s4.q5
    public final boolean b() {
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
