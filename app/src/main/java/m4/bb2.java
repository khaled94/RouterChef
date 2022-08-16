package m4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class bb2 extends i82 {

    /* renamed from: s */
    public final cb2 f6438s;

    /* renamed from: t */
    public i82 f6439t = b();

    public bb2(db2 db2Var) {
        this.f6438s = new cb2(db2Var);
    }

    @Override // m4.i82
    public final byte a() {
        i82 i82Var = this.f6439t;
        if (i82Var != null) {
            byte a10 = i82Var.a();
            if (!this.f6439t.hasNext()) {
                this.f6439t = b();
            }
            return a10;
        }
        throw new NoSuchElementException();
    }

    public final i82 b() {
        if (this.f6438s.hasNext()) {
            return new h82(this.f6438s.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6439t != null;
    }
}
