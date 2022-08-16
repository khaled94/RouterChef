package s4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c6 extends d6 {

    /* renamed from: s */
    public int f17755s = 0;

    /* renamed from: t */
    public final int f17756t;

    /* renamed from: u */
    public final /* synthetic */ g6 f17757u;

    public c6(g6 g6Var) {
        this.f17757u = g6Var;
        this.f17756t = g6Var.g();
    }

    @Override // s4.d6
    public final byte a() {
        int i10 = this.f17755s;
        if (i10 < this.f17756t) {
            this.f17755s = i10 + 1;
            return this.f17757u.e(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17755s < this.f17756t;
    }
}
