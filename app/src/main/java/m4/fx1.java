package m4;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class fx1<T> implements Comparator<T> {
    public <S extends T> fx1<S> a() {
        return new ox1(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);
}
