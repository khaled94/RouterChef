package m4;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class k32 {

    /* renamed from: a */
    public final String f10269a;

    /* renamed from: b */
    public final int f10270b;

    /* renamed from: c */
    public t42 f10271c;

    /* renamed from: d */
    public c42 f10272d;

    /* renamed from: e */
    public int f10273e;

    /* renamed from: f */
    public b52 f10274f;

    public k32(e62 e62Var) {
        String z10 = e62Var.z();
        this.f10269a = z10;
        if (z10.equals(k12.f10242b)) {
            try {
                v42 y = v42.y(e62Var.y(), z82.a());
                this.f10271c = (t42) i12.b(e62Var);
                this.f10270b = y.v();
            } catch (x92 e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        } else if (z10.equals(k12.f10241a)) {
            try {
                e42 x10 = e42.x(e62Var.y(), z82.a());
                this.f10272d = (c42) i12.b(e62Var);
                this.f10273e = x10.y().v();
                this.f10270b = this.f10273e + x10.z().v();
            } catch (x92 e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        } else if (!z10.equals(w22.f14853a)) {
            String valueOf = String.valueOf(z10);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        } else {
            try {
                d52 y3 = d52.y(e62Var.y(), z82.a());
                this.f10274f = (b52) i12.b(e62Var);
                this.f10270b = y3.v();
            } catch (x92 e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        }
    }
}
