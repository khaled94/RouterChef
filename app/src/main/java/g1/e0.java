package g1;

import java.util.concurrent.atomic.AtomicBoolean;
import k1.f;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a */
    public final AtomicBoolean f4799a = new AtomicBoolean(false);

    /* renamed from: b */
    public final z f4800b;

    /* renamed from: c */
    public volatile f f4801c;

    public e0(z zVar) {
        this.f4800b = zVar;
    }

    public final f a() {
        this.f4800b.a();
        if (this.f4799a.compareAndSet(false, true)) {
            if (this.f4801c == null) {
                this.f4801c = b();
            }
            return this.f4801c;
        }
        return b();
    }

    public final f b() {
        String c10 = c();
        z zVar = this.f4800b;
        zVar.a();
        zVar.b();
        return zVar.f4864c.h0().t(c10);
    }

    public abstract String c();

    public final void d(f fVar) {
        if (fVar == this.f4801c) {
            this.f4799a.set(false);
        }
    }
}
