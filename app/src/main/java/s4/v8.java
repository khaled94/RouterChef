package s4;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class v8 implements Iterator<Map.Entry> {

    /* renamed from: s */
    public int f18154s = -1;

    /* renamed from: t */
    public boolean f18155t;

    /* renamed from: u */
    public Iterator<Map.Entry> f18156u;

    /* renamed from: v */
    public final /* synthetic */ x8 f18157v;

    public final Iterator<Map.Entry> a() {
        if (this.f18156u == null) {
            this.f18156u = this.f18157v.f18189u.entrySet().iterator();
        }
        return this.f18156u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f18154s + 1 >= this.f18157v.f18188t.size()) {
            return !this.f18157v.f18189u.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        this.f18155t = true;
        int i10 = this.f18154s + 1;
        this.f18154s = i10;
        return (Map.Entry) (i10 < this.f18157v.f18188t.size() ? this.f18157v.f18188t.get(this.f18154s) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f18155t) {
            this.f18155t = false;
            x8 x8Var = this.f18157v;
            int i10 = x8.y;
            x8Var.h();
            if (this.f18154s < this.f18157v.f18188t.size()) {
                x8 x8Var2 = this.f18157v;
                int i11 = this.f18154s;
                this.f18154s = i11 - 1;
                x8Var2.f(i11);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
