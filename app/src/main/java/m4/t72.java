package m4;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class t72 implements v02 {

    /* renamed from: a */
    public final t32 f13947a;

    /* renamed from: b */
    public final int f13948b;

    public t72(t32 t32Var, int i10) {
        this.f13947a = t32Var;
        this.f13948b = i10;
        if (i10 >= 10) {
            t32Var.a(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // m4.v02
    public final byte[] a(byte[] bArr) {
        return this.f13947a.a(bArr, this.f13948b);
    }
}
