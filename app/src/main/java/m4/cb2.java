package m4;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class cb2 implements Iterator<k82> {

    /* renamed from: s */
    public final ArrayDeque<db2> f6772s;

    /* renamed from: t */
    public k82 f6773t;

    public cb2(n82 n82Var) {
        k82 k82Var;
        if (n82Var instanceof db2) {
            db2 db2Var = (db2) n82Var;
            ArrayDeque<db2> arrayDeque = new ArrayDeque<>(db2Var.y);
            this.f6772s = arrayDeque;
            arrayDeque.push(db2Var);
            n82 n82Var2 = db2Var.f7288v;
            while (n82Var2 instanceof db2) {
                db2 db2Var2 = (db2) n82Var2;
                this.f6772s.push(db2Var2);
                n82Var2 = db2Var2.f7288v;
            }
            k82Var = (k82) n82Var2;
        } else {
            this.f6772s = null;
            k82Var = (k82) n82Var;
        }
        this.f6773t = k82Var;
    }

    /* renamed from: a */
    public final k82 next() {
        k82 k82Var;
        boolean z10;
        k82 k82Var2 = this.f6773t;
        if (k82Var2 != null) {
            do {
                ArrayDeque<db2> arrayDeque = this.f6772s;
                k82Var = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                Object obj = this.f6772s.pop().f7289w;
                while (obj instanceof db2) {
                    db2 db2Var = (db2) obj;
                    this.f6772s.push(db2Var);
                    obj = db2Var.f7288v;
                }
                k82Var = (k82) obj;
                if (k82Var.k() == 0) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
            } while (z10);
            this.f6773t = k82Var;
            return k82Var2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6773t != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
