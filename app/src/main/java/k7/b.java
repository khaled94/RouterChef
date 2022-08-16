package k7;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: s */
    public long f5610s = 0;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f5610s++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f5610s += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f5610s += i11;
    }
}
