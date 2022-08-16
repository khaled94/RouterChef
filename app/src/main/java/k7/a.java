package k7;

import java.lang.annotation.Annotation;
import java.util.Objects;
import k7.d;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a */
    public final int f5609a;

    public a(int i10) {
        this.f5609a = i10;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        a aVar = (a) ((d) obj);
        if (this.f5609a == aVar.f5609a) {
            Object obj2 = d.a.DEFAULT;
            Objects.requireNonNull(aVar);
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f5609a ^ 14552422) + (d.a.DEFAULT.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f5609a + "intEncoding=" + d.a.DEFAULT + ')';
    }
}
