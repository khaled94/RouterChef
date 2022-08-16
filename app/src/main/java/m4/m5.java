package m4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class m5 extends bd2 {
    public m5(String str) {
        super(str);
    }

    @Override // m4.bd2
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
