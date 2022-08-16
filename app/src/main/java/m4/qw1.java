package m4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class qw1 extends sx1 {

    /* renamed from: s */
    public boolean f13009s;

    /* renamed from: t */
    public final /* synthetic */ Object f13010t;

    public qw1(Object obj) {
        this.f13010t = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f13009s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f13009s) {
            this.f13009s = true;
            return this.f13010t;
        }
        throw new NoSuchElementException();
    }
}
