package m4;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ex1 extends fx1<Comparable<?>> implements Serializable {

    /* renamed from: s */
    public static final ex1 f8300s = new ex1();

    @Override // m4.fx1
    public final <S extends Comparable> fx1<S> a() {
        return nx1.f11953s;
    }

    @Override // m4.fx1, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
