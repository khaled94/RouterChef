package ca;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface g extends x, WritableByteChannel {
    g F(byte[] bArr);

    g J(i iVar);

    g K();

    f a();

    g e(byte[] bArr, int i10, int i11);

    g f0(String str);

    @Override // ca.x, java.io.Flushable
    void flush();

    g g0(long j3);

    g l(long j3);

    g r(int i10);

    g u(int i10);

    g z(int i10);
}
