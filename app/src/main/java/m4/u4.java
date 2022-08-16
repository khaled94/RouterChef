package m4;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class u4 extends FilterInputStream {

    /* renamed from: s */
    public final long f14248s;

    /* renamed from: t */
    public long f14249t;

    public u4(InputStream inputStream, long j3) {
        super(inputStream);
        this.f14248s = j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f14249t++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int read = super.read(bArr, i10, i11);
        if (read != -1) {
            this.f14249t += read;
        }
        return read;
    }
}
