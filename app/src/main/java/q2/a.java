package q2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a<T> extends c<T> {

    /* renamed from: a */
    public final T f17137a;

    /* renamed from: b */
    public final d f17138b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Object obj, d dVar) {
        Objects.requireNonNull(obj, "Null payload");
        this.f17137a = obj;
        Objects.requireNonNull(dVar, "Null priority");
        this.f17138b = dVar;
    }

    @Override // q2.c
    public final Integer a() {
        return null;
    }

    @Override // q2.c
    public final T b() {
        return this.f17137a;
    }

    @Override // q2.c
    public final d c() {
        return this.f17138b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.a() == null && this.f17137a.equals(cVar.b()) && this.f17138b.equals(cVar.c());
    }

    public final int hashCode() {
        return this.f17138b.hashCode() ^ (((-721379959) ^ this.f17137a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=" + ((Object) null) + ", payload=" + this.f17137a + ", priority=" + this.f17138b + "}";
    }
}
