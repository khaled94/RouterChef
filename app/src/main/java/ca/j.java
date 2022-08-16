package ca;

/* loaded from: classes.dex */
public abstract class j implements x {

    /* renamed from: s */
    public final x f2850s;

    public j(x xVar) {
        if (xVar != null) {
            this.f2850s = xVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // ca.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2850s.close();
    }

    @Override // ca.x
    public final z d() {
        return this.f2850s.d();
    }

    @Override // ca.x, java.io.Flushable
    public void flush() {
        this.f2850s.flush();
    }

    @Override // ca.x
    public void q(f fVar, long j3) {
        this.f2850s.q(fVar, j3);
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f2850s.toString() + ")";
    }
}
