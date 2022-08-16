package m4;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class r22 implements j02 {

    /* renamed from: b */
    public static final ThreadLocal<Cipher> f13129b = new q22(0);

    /* renamed from: a */
    public final SecretKeySpec f13130a;

    public r22(byte[] bArr) {
        w72.a(bArr.length);
        this.f13130a = new SecretKeySpec(bArr, "AES");
    }

    @Override // m4.j02
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec algorithmParameterSpec;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[length + 28];
            byte[] a10 = v72.a(12);
            System.arraycopy(a10, 0, bArr3, 0, 12);
            int length2 = a10.length;
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, a10, 0, length2);
            } catch (ClassNotFoundException unused) {
                if (!r01.e()) {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
                algorithmParameterSpec = new IvParameterSpec(a10, 0, length2);
            }
            ThreadLocal<Cipher> threadLocal = f13129b;
            threadLocal.get().init(1, this.f13130a, algorithmParameterSpec);
            int doFinal = threadLocal.get().doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal != length + 16) {
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
