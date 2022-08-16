package m4;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m72 implements j02 {

    /* renamed from: a */
    public final p72 f11101a;

    /* renamed from: b */
    public final v02 f11102b;

    public m72(p72 p72Var, v02 v02Var) {
        this.f11101a = p72Var;
        this.f11102b = v02Var;
    }

    @Override // m4.j02
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] a10 = this.f11101a.a(bArr);
        return g7.d(a10, this.f11102b.a(g7.d(bArr2, a10, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
