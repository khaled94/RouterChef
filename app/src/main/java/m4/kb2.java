package m4;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class kb2 implements Iterator<Map.Entry> {

    /* renamed from: s */
    public int f10325s = -1;

    /* renamed from: t */
    public boolean f10326t;

    /* renamed from: u */
    public Iterator<Map.Entry> f10327u;

    /* renamed from: v */
    public final /* synthetic */ mb2 f10328v;

    public final Iterator<Map.Entry> a() {
        if (this.f10327u == null) {
            this.f10327u = this.f10328v.f11141u.entrySet().iterator();
        }
        return this.f10327u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10325s + 1 >= this.f10328v.f11140t.size()) {
            return !this.f10328v.f11141u.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        this.f10326t = true;
        int i10 = this.f10325s + 1;
        this.f10325s = i10;
        return (Map.Entry) (i10 < this.f10328v.f11140t.size() ? this.f10328v.f11140t.get(this.f10325s) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f10326t) {
            this.f10326t = false;
            mb2 mb2Var = this.f10328v;
            int i10 = mb2.y;
            mb2Var.h();
            if (this.f10325s < this.f10328v.f11140t.size()) {
                mb2 mb2Var2 = this.f10328v;
                int i11 = this.f10325s;
                this.f10325s = i11 - 1;
                mb2Var2.f(i11);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
