package m4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class pv1<T> implements Iterator<T> {

    /* renamed from: s */
    public int f12631s;

    /* renamed from: t */
    public int f12632t;

    /* renamed from: u */
    public int f12633u;

    /* renamed from: v */
    public final /* synthetic */ tv1 f12634v;

    public pv1(tv1 tv1Var) {
        this.f12634v = tv1Var;
        this.f12631s = tv1Var.f14184w;
        this.f12632t = tv1Var.isEmpty() ? -1 : 0;
        this.f12633u = -1;
    }

    public abstract T a(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12632t >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.f12634v.f14184w == this.f12631s) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f12632t;
            this.f12633u = i10;
            T a10 = a(i10);
            tv1 tv1Var = this.f12634v;
            int i11 = this.f12632t + 1;
            if (i11 >= tv1Var.f14185x) {
                i11 = -1;
            }
            this.f12632t = i11;
            return a10;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f12634v.f14184w == this.f12631s) {
            hu1.i(this.f12633u >= 0, "no calls to next() since the last call to remove()");
            this.f12631s += 32;
            tv1 tv1Var = this.f12634v;
            tv1Var.remove(tv1.a(tv1Var, this.f12633u));
            this.f12632t--;
            this.f12633u = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
