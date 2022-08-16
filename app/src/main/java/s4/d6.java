package s4;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class d6 implements Iterator {
    public abstract byte a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
