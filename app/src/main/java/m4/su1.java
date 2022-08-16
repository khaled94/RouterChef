package m4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class su1 implements Iterator<Map.Entry> {

    /* renamed from: s */
    public final Iterator<Map.Entry> f13828s;
    @CheckForNull

    /* renamed from: t */
    public Collection f13829t;

    /* renamed from: u */
    public final /* synthetic */ tu1 f13830u;

    public su1(tu1 tu1Var) {
        this.f13830u = tu1Var;
        this.f13828s = tu1Var.f14168u.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13828s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        Map.Entry next = this.f13828s.next();
        this.f13829t = (Collection) next.getValue();
        return this.f13830u.a(next);
    }

    @Override // java.util.Iterator
    public final void remove() {
        hu1.i(this.f13829t != null, "no calls to next() since the last call to remove()");
        this.f13828s.remove();
        this.f13830u.f14169v.f9055w -= this.f13829t.size();
        this.f13829t.clear();
        this.f13829t = null;
    }
}
