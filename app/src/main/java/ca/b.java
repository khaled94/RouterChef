package ca;

import androidx.activity.result.a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b implements y {

    /* renamed from: s */
    public final /* synthetic */ y f2830s;

    /* renamed from: t */
    public final /* synthetic */ c f2831t;

    public b(c cVar, y yVar) {
        this.f2831t = cVar;
        this.f2830s = yVar;
    }

    @Override // ca.y
    public final long D(f fVar, long j3) {
        this.f2831t.i();
        try {
            try {
                long D = this.f2830s.D(fVar, 8192L);
                this.f2831t.k(true);
                return D;
            } catch (IOException e10) {
                throw this.f2831t.j(e10);
            }
        } catch (Throwable th) {
            this.f2831t.k(false);
            throw th;
        }
    }

    @Override // ca.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2831t.i();
        try {
            try {
                this.f2830s.close();
                this.f2831t.k(true);
            } catch (IOException e10) {
                throw this.f2831t.j(e10);
            }
        } catch (Throwable th) {
            this.f2831t.k(false);
            throw th;
        }
    }

    @Override // ca.y
    public final z d() {
        return this.f2831t;
    }

    public final String toString() {
        StringBuilder c10 = a.c("AsyncTimeout.source(");
        c10.append(this.f2830s);
        c10.append(")");
        return c10.toString();
    }
}
