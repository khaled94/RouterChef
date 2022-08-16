package t9;

import ca.f;
import ca.g;
import ca.h;
import ca.y;
import ca.z;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import r9.d;
import s9.e;

/* loaded from: classes.dex */
public final class a implements y {

    /* renamed from: s */
    public boolean f18862s;

    /* renamed from: t */
    public final /* synthetic */ h f18863t;

    /* renamed from: u */
    public final /* synthetic */ c f18864u;

    /* renamed from: v */
    public final /* synthetic */ g f18865v;

    public a(h hVar, c cVar, g gVar) {
        this.f18863t = hVar;
        this.f18864u = cVar;
        this.f18865v = gVar;
    }

    @Override // ca.y
    public final long D(f fVar, long j3) {
        try {
            long D = this.f18863t.D(fVar, 8192L);
            if (D != -1) {
                fVar.L(this.f18865v.a(), fVar.f2843t - D, D);
                this.f18865v.K();
                return D;
            }
            if (!this.f18862s) {
                this.f18862s = true;
                this.f18865v.close();
            }
            return -1L;
        } catch (IOException e10) {
            if (!this.f18862s) {
                this.f18862s = true;
                ((d.b) this.f18864u).a();
            }
            throw e10;
        }
    }

    @Override // ca.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f18862s) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!e.i(this)) {
                this.f18862s = true;
                ((d.b) this.f18864u).a();
            }
        }
        this.f18863t.close();
    }

    @Override // ca.y
    public final z d() {
        return this.f18863t.d();
    }
}
