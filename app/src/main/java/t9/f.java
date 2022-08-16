package t9;

import ca.j;
import ca.x;
import java.io.IOException;

/* loaded from: classes.dex */
public class f extends j {

    /* renamed from: t */
    public boolean f18895t;

    public f(x xVar) {
        super(xVar);
    }

    public void b() {
        throw null;
    }

    @Override // ca.j, ca.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f18895t) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f18895t = true;
            b();
        }
    }

    @Override // ca.j, ca.x, java.io.Flushable
    public final void flush() {
        if (this.f18895t) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f18895t = true;
            b();
        }
    }

    @Override // ca.j, ca.x
    public final void q(ca.f fVar, long j3) {
        if (this.f18895t) {
            fVar.p(j3);
            return;
        }
        try {
            super.q(fVar, j3);
        } catch (IOException unused) {
            this.f18895t = true;
            b();
        }
    }
}
