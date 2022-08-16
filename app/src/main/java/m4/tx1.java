package m4;

import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tx1 extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr);
    }
}
