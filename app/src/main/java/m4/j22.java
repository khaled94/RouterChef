package m4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class j22 implements j02 {

    /* renamed from: c */
    public static final byte[] f9823c = new byte[0];

    /* renamed from: a */
    public final e62 f9824a;

    /* renamed from: b */
    public final j02 f9825b;

    public j22(e62 e62Var, j02 j02Var) {
        this.f9824a = e62Var;
        this.f9825b = j02Var;
    }

    @Override // m4.j02
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] b10 = i12.b(this.f9824a).b();
        byte[] b11 = this.f9825b.b(b10, f9823c);
        String z10 = this.f9824a.z();
        l82 l82Var = n82.f11571t;
        byte[] b12 = ((j02) i12.j(z10, n82.D(b10, 0, b10.length), j02.class)).b(bArr, bArr2);
        int length = b11.length;
        return ByteBuffer.allocate(length + 4 + b12.length).putInt(length).put(b11).put(b12).array();
    }
}
