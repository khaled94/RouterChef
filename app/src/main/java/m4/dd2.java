package m4;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class dd2 implements Iterator<i5>, Closeable, j5 {
    public static final cd2 y = new cd2();

    /* renamed from: s */
    public g5 f7331s;

    /* renamed from: t */
    public fc0 f7332t;

    /* renamed from: u */
    public i5 f7333u = null;

    /* renamed from: v */
    public long f7334v = 0;

    /* renamed from: w */
    public long f7335w = 0;

    /* renamed from: x */
    public final List<i5> f7336x = new ArrayList();

    static {
        x50.e(dd2.class);
    }

    public final List<i5> G() {
        return (this.f7332t == null || this.f7333u == y) ? this.f7336x : new hd2(this.f7336x, this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        i5 i5Var = this.f7333u;
        if (i5Var == y) {
            return false;
        }
        if (i5Var != null) {
            return true;
        }
        try {
            this.f7333u = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f7333u = y;
            return false;
        }
    }

    /* renamed from: j */
    public final i5 next() {
        i5 b10;
        i5 i5Var = this.f7333u;
        if (i5Var != null && i5Var != y) {
            this.f7333u = null;
            return i5Var;
        }
        fc0 fc0Var = this.f7332t;
        if (fc0Var == null || this.f7334v >= this.f7335w) {
            this.f7333u = y;
            throw new NoSuchElementException();
        }
        try {
            synchronized (fc0Var) {
                this.f7332t.G(this.f7334v);
                b10 = ((f5) this.f7331s).b(this.f7332t, this);
                this.f7334v = this.f7332t.c();
            }
            return b10;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<m4.i5>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<m4.i5>, java.util.ArrayList] */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i10 = 0; i10 < this.f7336x.size(); i10++) {
            if (i10 > 0) {
                sb.append(";");
            }
            sb.append(((i5) this.f7336x.get(i10)).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
