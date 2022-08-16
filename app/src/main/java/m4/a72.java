package m4;

import androidx.activity.k;
import e1.i;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class a72 implements p72 {

    /* renamed from: d */
    public static final ThreadLocal<Cipher> f6063d = new z62();

    /* renamed from: a */
    public final SecretKeySpec f6064a;

    /* renamed from: b */
    public final int f6065b;

    /* renamed from: c */
    public final int f6066c;

    public a72(byte[] bArr, int i10) {
        if (i.d(2)) {
            w72.a(bArr.length);
            this.f6064a = new SecretKeySpec(bArr, "AES");
            int blockSize = f6063d.get().getBlockSize();
            this.f6066c = blockSize;
            if (i10 < 12 || i10 > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f6065b = i10;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // m4.p72
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f6065b;
        int i11 = Integer.MAX_VALUE - i10;
        if (length <= i11) {
            byte[] bArr2 = new byte[i10 + length];
            byte[] a10 = v72.a(i10);
            System.arraycopy(a10, 0, bArr2, 0, this.f6065b);
            int i12 = this.f6065b;
            Cipher cipher = f6063d.get();
            byte[] bArr3 = new byte[this.f6066c];
            System.arraycopy(a10, 0, bArr3, 0, this.f6065b);
            cipher.init(1, this.f6064a, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length, bArr2, i12) != length) {
                throw new GeneralSecurityException("stored output's length does not match input's length");
            }
            return bArr2;
        }
        throw new GeneralSecurityException(k.a(43, "plaintext length can not exceed ", i11));
    }
}
