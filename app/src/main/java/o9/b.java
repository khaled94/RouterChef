package o9;

import b7.c;
import e9.f;
import java.util.Objects;
import java.util.concurrent.Executor;
import k9.h0;
import n9.e;
import n9.s;
import x8.g;

/* loaded from: classes.dex */
public final class b extends h0 implements Executor {

    /* renamed from: t */
    public static final b f16826t = new b();

    /* renamed from: u */
    public static final e f16827u;

    static {
        l lVar = l.f16842t;
        int i10 = s.f16719a;
        if (64 >= i10) {
            i10 = 64;
        }
        boolean z10 = false;
        int h10 = c.h("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12);
        Objects.requireNonNull(lVar);
        if (h10 >= 1) {
            z10 = true;
        }
        if (z10) {
            f16827u = new e(lVar, h10);
            return;
        }
        throw new IllegalArgumentException(f.j("Expected positive parallelism level, but got ", Integer.valueOf(h10)).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m0(g.f20104s, runnable);
    }

    @Override // k9.q
    public final void m0(x8.f fVar, Runnable runnable) {
        f16827u.m0(fVar, runnable);
    }

    @Override // k9.q
    public final String toString() {
        return "Dispatchers.IO";
    }
}
