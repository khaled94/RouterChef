package ca;

import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements x {

    /* renamed from: s */
    public final /* synthetic */ x f2827s;

    /* renamed from: t */
    public final /* synthetic */ c f2828t;

    public a(c cVar, x xVar) {
        this.f2828t = cVar;
        this.f2827s = xVar;
    }

    @Override // ca.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2828t.i();
        try {
            try {
                this.f2827s.close();
                this.f2828t.k(true);
            } catch (IOException e10) {
                throw this.f2828t.j(e10);
            }
        } catch (Throwable th) {
            this.f2828t.k(false);
            throw th;
        }
    }

    @Override // ca.x
    public final z d() {
        return this.f2828t;
    }

    @Override // ca.x, java.io.Flushable
    public final void flush() {
        this.f2828t.i();
        try {
            try {
                this.f2827s.flush();
                this.f2828t.k(true);
            } catch (IOException e10) {
                throw this.f2828t.j(e10);
            }
        } catch (Throwable th) {
            this.f2828t.k(false);
            throw th;
        }
    }

    @Override // ca.x
    public final void q(f fVar, long j3) {
        a0.a(fVar.f2843t, 0L, j3);
        while (true) {
            long j10 = 0;
            if (j3 > 0) {
                u uVar = fVar.f2842s;
                while (true) {
                    if (j10 >= 65536) {
                        break;
                    }
                    j10 += uVar.f2880c - uVar.f2879b;
                    if (j10 >= j3) {
                        j10 = j3;
                        break;
                    }
                    uVar = uVar.f2883f;
                }
                boolean z10 = false;
                this.f2828t.i();
                try {
                    try {
                        this.f2827s.q(fVar, j10);
                        j3 -= j10;
                        z10 = true;
                    } catch (IOException e10) {
                        throw this.f2828t.j(e10);
                    }
                } finally {
                    this.f2828t.k(z10);
                }
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("AsyncTimeout.sink(");
        c10.append(this.f2827s);
        c10.append(")");
        return c10.toString();
    }
}
