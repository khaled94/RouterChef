package s4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class p implements Iterator<n> {

    /* renamed from: s */
    public int f18050s = 0;

    /* renamed from: t */
    public final /* synthetic */ r f18051t;

    public p(r rVar) {
        this.f18051t = rVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18050s < this.f18051t.f18078s.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ n next() {
        if (this.f18050s < this.f18051t.f18078s.length()) {
            int i10 = this.f18050s;
            this.f18050s = i10 + 1;
            return new r(String.valueOf(i10));
        }
        throw new NoSuchElementException();
    }
}
