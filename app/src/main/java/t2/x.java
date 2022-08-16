package t2;

import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class x implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((k) this).y.get().close();
    }
}
