package ca;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l extends z {

    /* renamed from: e */
    public z f2852e;

    public l(z zVar) {
        if (zVar != null) {
            this.f2852e = zVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // ca.z
    public final z a() {
        return this.f2852e.a();
    }

    @Override // ca.z
    public final z b() {
        return this.f2852e.b();
    }

    @Override // ca.z
    public final long c() {
        return this.f2852e.c();
    }

    @Override // ca.z
    public final z d(long j3) {
        return this.f2852e.d(j3);
    }

    @Override // ca.z
    public final boolean e() {
        return this.f2852e.e();
    }

    @Override // ca.z
    public final void f() {
        this.f2852e.f();
    }

    @Override // ca.z
    public final z g(long j3) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return this.f2852e.g(j3);
    }
}
