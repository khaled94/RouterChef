package m4;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class c5 extends ByteArrayOutputStream {

    /* renamed from: s */
    public final s4 f6728s;

    public c5(s4 s4Var, int i10) {
        this.f6728s = s4Var;
        ((ByteArrayOutputStream) this).buf = s4Var.b(Math.max(i10, 256));
    }

    public final void b(int i10) {
        int i11 = ((ByteArrayOutputStream) this).count;
        if (i11 + i10 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i12 = i11 + i10;
        byte[] b10 = this.f6728s.b(i12 + i12);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, b10, 0, ((ByteArrayOutputStream) this).count);
        this.f6728s.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = b10;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6728s.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f6728s.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i10) {
        b(1);
        super.write(i10);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        b(i11);
        super.write(bArr, i10, i11);
    }
}
