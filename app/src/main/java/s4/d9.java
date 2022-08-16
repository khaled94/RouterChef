package s4;

import java.util.Iterator;
import y4.n;

/* loaded from: classes.dex */
public final class d9 implements Iterator {

    /* renamed from: s */
    public final /* synthetic */ int f17801s = 0;

    /* renamed from: t */
    public final Iterator f17802t;

    /* renamed from: u */
    public final /* synthetic */ Iterable f17803u;

    public d9(e9 e9Var) {
        this.f17803u = e9Var;
        this.f17802t = e9Var.f17850s.iterator();
    }

    public final String a() {
        return (String) this.f17802t.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f17801s) {
            case 0:
                return this.f17802t.hasNext();
            default:
                return this.f17802t.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f17801s) {
            case 0:
                return (String) this.f17802t.next();
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f17801s) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public d9(n nVar) {
        this.f17803u = nVar;
        this.f17802t = nVar.f20587s.keySet().iterator();
    }
}
