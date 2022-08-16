package m4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h82 extends i82 {

    /* renamed from: s */
    public int f9141s = 0;

    /* renamed from: t */
    public final int f9142t;

    /* renamed from: u */
    public final /* synthetic */ n82 f9143u;

    public h82(n82 n82Var) {
        this.f9143u = n82Var;
        this.f9142t = n82Var.k();
    }

    @Override // m4.i82
    public final byte a() {
        int i10 = this.f9141s;
        if (i10 < this.f9142t) {
            this.f9141s = i10 + 1;
            return this.f9143u.h(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9141s < this.f9142t;
    }
}
