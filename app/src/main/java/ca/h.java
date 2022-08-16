package ca;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public interface h extends y, ReadableByteChannel {
    long B(x xVar);

    String N(long j3);

    int R(r rVar);

    @Deprecated
    f a();

    void c0(long j3);

    long k0();

    InputStream l0();

    i m(long j3);

    void p(long j3);

    byte readByte();

    int readInt();

    short readShort();

    String w();

    boolean y();
}
