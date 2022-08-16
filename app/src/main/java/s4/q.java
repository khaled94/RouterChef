package s4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class q implements Iterator<n> {

    /* renamed from: s */
    public int f18066s = 0;

    /* renamed from: t */
    public final /* synthetic */ r f18067t;

    public q(r rVar) {
        this.f18067t = rVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18066s < this.f18067t.f18078s.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ n next() {
        if (this.f18066s < this.f18067t.f18078s.length()) {
            String str = this.f18067t.f18078s;
            int i10 = this.f18066s;
            this.f18066s = i10 + 1;
            return new r(String.valueOf(str.charAt(i10)));
        }
        throw new NoSuchElementException();
    }
}
