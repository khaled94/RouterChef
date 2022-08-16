package m4;

import javax.annotation.Nonnull;

/* loaded from: classes.dex */
public final class nb1<T> {
    @Nonnull

    /* renamed from: a */
    public final T f11621a;

    /* renamed from: b */
    public zm2 f11622b = new zm2();

    /* renamed from: c */
    public boolean f11623c;

    /* renamed from: d */
    public boolean f11624d;

    public nb1(@Nonnull T t10) {
        this.f11621a = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nb1.class == obj.getClass()) {
            return this.f11621a.equals(((nb1) obj).f11621a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11621a.hashCode();
    }
}
