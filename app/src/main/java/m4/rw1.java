package m4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class rw1 extends Enum<rw1> implements Iterator<Object> {

    /* renamed from: s */
    public static final rw1 f13446s;

    /* renamed from: t */
    public static final /* synthetic */ rw1[] f13447t;

    static {
        rw1 rw1Var = new rw1();
        f13446s = rw1Var;
        f13447t = new rw1[]{rw1Var};
    }

    public static rw1[] values() {
        return (rw1[]) f13447t.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        hu1.i(false, "no calls to next() since the last call to remove()");
    }
}
