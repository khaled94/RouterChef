package m4;

import e1.i;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class e72 implements j02 {

    /* renamed from: b */
    public static final ThreadLocal<Cipher> f7737b = new q22(1);

    /* renamed from: a */
    public final SecretKeySpec f7738a;

    public e72(byte[] bArr) {
        if (i.d(2)) {
            w72.a(bArr.length);
            this.f7738a = new SecretKeySpec(bArr, "AES");
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    @Override // m4.j02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] b(byte[] r10, byte[] r11) {
        /*
            r9 = this;
            int r11 = r10.length
            r0 = 2147483619(0x7fffffe3, float:NaN)
            if (r11 > r0) goto L80
            int r0 = r11 + 28
            byte[] r6 = new byte[r0]
            r0 = 12
            byte[] r1 = m4.v72.a(r0)
            r7 = 0
            java.lang.System.arraycopy(r1, r7, r6, r7, r0)
            int r0 = r1.length
            boolean r2 = m4.r01.e()
            if (r2 == 0) goto L38
            java.lang.String r2 = "android.os.Build$VERSION"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "SDK_INT"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            int r2 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L2d
            goto L2e
        L2d:
            r2 = -1
        L2e:
            r3 = 19
            if (r2 > r3) goto L38
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r1, r7, r0)
            goto L3f
        L38:
            javax.crypto.spec.GCMParameterSpec r2 = new javax.crypto.spec.GCMParameterSpec
            r3 = 128(0x80, float:1.794E-43)
            r2.<init>(r3, r1, r7, r0)
        L3f:
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = m4.e72.f7737b
            java.lang.Object r1 = r0.get()
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            javax.crypto.spec.SecretKeySpec r3 = r9.f7738a
            r8 = 1
            r1.init(r8, r3, r2)
            java.lang.Object r0 = r0.get()
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            r2 = 0
            r5 = 12
            r1 = r10
            r3 = r11
            r4 = r6
            int r10 = r0.doFinal(r1, r2, r3, r4, r5)
            int r0 = r11 + 16
            if (r10 != r0) goto L62
            return r6
        L62:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r7] = r2
            int r10 = r10 - r11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r8] = r10
            java.lang.String r10 = "encryption failed; GCM tag must be %s bytes, but got only %s bytes"
            java.lang.String r10 = java.lang.String.format(r10, r1)
            r0.<init>(r10)
            throw r0
        L80:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "plaintext too long"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.e72.b(byte[], byte[]):byte[]");
    }
}
