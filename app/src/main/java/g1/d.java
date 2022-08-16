package g1;

import java.io.IOException;
import java.util.Objects;
import k1.b;
import k1.c;

/* loaded from: classes.dex */
public final class d implements c, g {

    /* renamed from: s */
    public final c f4792s;

    /* renamed from: t */
    public final a f4793t;

    /* loaded from: classes.dex */
    public static final class a implements b {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    @Override // g1.g
    public final c b() {
        return this.f4792s;
    }

    @Override // k1.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f4793t.close();
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // k1.c
    public final String getDatabaseName() {
        return this.f4792s.getDatabaseName();
    }

    @Override // k1.c
    public final b h0() {
        Objects.requireNonNull(this.f4793t);
        throw null;
    }

    @Override // k1.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        this.f4792s.setWriteAheadLoggingEnabled(z10);
    }
}
