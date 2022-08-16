package ca;

/* loaded from: classes.dex */
public abstract class k implements y {

    /* renamed from: s */
    public final y f2851s;

    public k(y yVar) {
        if (yVar != null) {
            this.f2851s = yVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // ca.y
    public long D(f fVar, long j3) {
        return this.f2851s.D(fVar, 8192L);
    }

    @Override // ca.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2851s.close();
    }

    @Override // ca.y
    public final z d() {
        return this.f2851s.d();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f2851s.toString() + ")";
    }
}
