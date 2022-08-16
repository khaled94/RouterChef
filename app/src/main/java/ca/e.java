package ca;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class e extends OutputStream {

    /* renamed from: s */
    public final /* synthetic */ f f2840s;

    public e(f fVar) {
        this.f2840s = fVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return this.f2840s + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f2840s.B0((byte) i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        this.f2840s.z0(bArr, i10, i11);
    }
}
