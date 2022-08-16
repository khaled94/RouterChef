package m4;

import e1.i;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class g72 implements l02 {

    /* renamed from: c */
    public static final Collection<Integer> f8761c = Arrays.asList(64);

    /* renamed from: d */
    public static final byte[] f8762d = new byte[16];

    /* renamed from: a */
    public final q72 f8763a;

    /* renamed from: b */
    public final byte[] f8764b;

    public g72(byte[] bArr) {
        if (i.d(1)) {
            Collection<Integer> collection = f8761c;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i10 = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i10);
                this.f8764b = Arrays.copyOfRange(bArr, i10, length);
                this.f8763a = new q72(copyOfRange);
                return;
            }
            StringBuilder sb = new StringBuilder(59);
            sb.append("invalid key size: ");
            sb.append(length);
            sb.append(" bytes; key must have 64 bytes");
            throw new InvalidKeyException(sb.toString());
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // m4.l02
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        if (bArr.length <= 2147483631) {
            Cipher a10 = n72.f11544e.a("AES/CTR/NoPadding");
            byte[][] bArr4 = {bArr2, bArr};
            byte[] a11 = this.f8763a.a(f8762d, 16);
            for (int i10 = 0; i10 <= 0; i10++) {
                byte[] bArr5 = bArr4[i10];
                if (bArr5 == null) {
                    bArr5 = new byte[0];
                }
                a11 = g7.e(i.f(a11), this.f8763a.a(bArr5, 16));
            }
            byte[] bArr6 = bArr4[1];
            int length = bArr6.length;
            if (length >= 16) {
                int length2 = a11.length;
                if (length < length2) {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
                int i11 = length - length2;
                bArr3 = Arrays.copyOf(bArr6, length);
                for (int i12 = 0; i12 < a11.length; i12++) {
                    int i13 = i11 + i12;
                    bArr3[i13] = (byte) (bArr3[i13] ^ a11[i12]);
                }
            } else {
                bArr3 = g7.e(i.e(bArr6), i.f(a11));
            }
            byte[] a12 = this.f8763a.a(bArr3, 16);
            byte[] bArr7 = (byte[]) a12.clone();
            bArr7[8] = (byte) (bArr7[8] & Byte.MAX_VALUE);
            bArr7[12] = (byte) (bArr7[12] & Byte.MAX_VALUE);
            a10.init(1, new SecretKeySpec(this.f8764b, "AES"), new IvParameterSpec(bArr7));
            return g7.d(a12, a10.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
