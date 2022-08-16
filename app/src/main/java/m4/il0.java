package m4;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public class il0 {

    /* renamed from: a */
    public int f9684a;

    /* renamed from: b */
    public final xi0 f9685b = new xi0();

    /* renamed from: c */
    public ByteBuffer f9686c;

    /* renamed from: d */
    public boolean f9687d;

    /* renamed from: e */
    public long f9688e;

    /* renamed from: f */
    public ByteBuffer f9689f;

    /* renamed from: g */
    public final int f9690g;

    public il0(int i10) {
        this.f9690g = i10;
    }

    public void a() {
        this.f9684a = 0;
        ByteBuffer byteBuffer = this.f9686c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f9689f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f9687d = false;
    }

    public final boolean b(int i10) {
        return (this.f9684a & i10) == i10;
    }

    public final boolean c() {
        return b(Integer.MIN_VALUE);
    }

    @EnsuresNonNull({"data"})
    public final void d(int i10) {
        ByteBuffer byteBuffer = this.f9686c;
        if (byteBuffer == null) {
            this.f9686c = f(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.f9686c = byteBuffer;
            return;
        }
        ByteBuffer f10 = f(i11);
        f10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            f10.put(byteBuffer);
        }
        this.f9686c = f10;
    }

    public final void e() {
        ByteBuffer byteBuffer = this.f9686c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f9689f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer f(int i10) {
        int i11 = this.f9690g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f9686c;
        throw new mk0(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }
}
