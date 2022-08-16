package m4;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class fc0 implements Closeable {

    /* renamed from: s */
    public final ByteBuffer f8397s;

    public fc0(ByteBuffer byteBuffer) {
        this.f8397s = byteBuffer.duplicate();
    }

    public final void G(long j3) {
        this.f8397s.position((int) j3);
    }

    public final int b(ByteBuffer byteBuffer) {
        if (this.f8397s.remaining() != 0 || byteBuffer.remaining() <= 0) {
            int min = Math.min(byteBuffer.remaining(), this.f8397s.remaining());
            byte[] bArr = new byte[min];
            this.f8397s.get(bArr);
            byteBuffer.put(bArr);
            return min;
        }
        return -1;
    }

    public final long c() {
        return this.f8397s.position();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final ByteBuffer j(long j3, long j10) {
        int position = this.f8397s.position();
        this.f8397s.position((int) j3);
        ByteBuffer slice = this.f8397s.slice();
        slice.limit((int) j10);
        this.f8397s.position(position);
        return slice;
    }
}
