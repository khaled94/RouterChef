package a8;

import e8.c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import x7.j;
import x7.l;
import x7.n;
import x7.o;
import x7.q;

/* loaded from: classes.dex */
public final class g extends c {
    public static final a H = new a();
    public static final q I = new q("closed");
    public String F;
    public final List<l> E = new ArrayList();
    public l G = n.f20087a;

    /* loaded from: classes.dex */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public g() {
        super(H);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<x7.l>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<x7.l>, java.util.ArrayList] */
    @Override // e8.c
    public final c H() {
        if (this.E.isEmpty() || this.F != null) {
            throw new IllegalStateException();
        }
        if (!(u0() instanceof j)) {
            throw new IllegalStateException();
        }
        ?? r02 = this.E;
        r02.remove(r02.size() - 1);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<x7.l>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<x7.l>, java.util.ArrayList] */
    @Override // e8.c
    public final c I() {
        if (this.E.isEmpty() || this.F != null) {
            throw new IllegalStateException();
        }
        if (!(u0() instanceof o)) {
            throw new IllegalStateException();
        }
        ?? r02 = this.E;
        r02.remove(r02.size() - 1);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<x7.l>, java.util.ArrayList] */
    @Override // e8.c
    public final c L(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.E.isEmpty() || this.F != null) {
            throw new IllegalStateException();
        }
        if (!(u0() instanceof o)) {
            throw new IllegalStateException();
        }
        this.F = str;
        return this;
    }

    @Override // e8.c
    public final c Z() {
        v0(n.f20087a);
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<x7.l>, java.util.ArrayList] */
    @Override // e8.c
    public final c c() {
        j jVar = new j();
        v0(jVar);
        this.E.add(jVar);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<x7.l>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<x7.l>, java.util.ArrayList] */
    @Override // e8.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.E.isEmpty()) {
            this.E.add(I);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // e8.c, java.io.Flushable
    public final void flush() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<x7.l>, java.util.ArrayList] */
    @Override // e8.c
    public final c j() {
        o oVar = new o();
        v0(oVar);
        this.E.add(oVar);
        return this;
    }

    @Override // e8.c
    public final c o0(long j3) {
        v0(new q(Long.valueOf(j3)));
        return this;
    }

    @Override // e8.c
    public final c p0(Boolean bool) {
        if (bool == null) {
            v0(n.f20087a);
            return this;
        }
        v0(new q(bool));
        return this;
    }

    @Override // e8.c
    public final c q0(Number number) {
        if (number == null) {
            v0(n.f20087a);
            return this;
        }
        if (!this.f4446x) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        v0(new q(number));
        return this;
    }

    @Override // e8.c
    public final c r0(String str) {
        if (str == null) {
            v0(n.f20087a);
            return this;
        }
        v0(new q(str));
        return this;
    }

    @Override // e8.c
    public final c s0(boolean z10) {
        v0(new q(Boolean.valueOf(z10)));
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<x7.l>, java.util.ArrayList] */
    public final l u0() {
        ?? r02 = this.E;
        return (l) r02.get(r02.size() - 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<x7.l>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<x7.l>, java.util.ArrayList] */
    public final void v0(l lVar) {
        if (this.F != null) {
            if (!(lVar instanceof n) || this.A) {
                ((o) u0()).f20088a.put(this.F, lVar);
            }
            this.F = null;
        } else if (this.E.isEmpty()) {
            this.G = lVar;
        } else {
            l u02 = u0();
            if (u02 instanceof j) {
                ((j) u02).f20086s.add(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
