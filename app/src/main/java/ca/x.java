package ca;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface x extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    z d();

    void flush();

    void q(f fVar, long j3);
}
