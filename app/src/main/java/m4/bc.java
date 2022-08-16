package m4;

import java.nio.ByteBuffer;
import z3.p;

/* loaded from: classes.dex */
public final class bc {

    /* renamed from: a */
    public int f6440a;

    /* renamed from: b */
    public final zb f6441b = new zb();

    /* renamed from: c */
    public ByteBuffer f6442c;

    /* renamed from: d */
    public long f6443d;

    public final void a() {
        this.f6440a = 0;
        ByteBuffer byteBuffer = this.f6442c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final boolean b(int i10) {
        return (this.f6440a & i10) == i10;
    }

    public final ByteBuffer c(int i10) {
        ByteBuffer byteBuffer = this.f6442c;
        StringBuilder a10 = p.a(44, "Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i10);
        a10.append(")");
        throw new IllegalStateException(a10.toString());
    }
}
