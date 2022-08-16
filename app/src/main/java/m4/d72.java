package m4;

import e1.i;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class d72 implements j02 {

    /* renamed from: e */
    public static final ThreadLocal<Cipher> f7249e = new b72();

    /* renamed from: f */
    public static final ThreadLocal<Cipher> f7250f = new c72();

    /* renamed from: a */
    public final byte[] f7251a;

    /* renamed from: b */
    public final byte[] f7252b;

    /* renamed from: c */
    public final SecretKeySpec f7253c;

    /* renamed from: d */
    public final int f7254d;

    public d72(byte[] bArr, int i10) {
        if (i.d(1)) {
            if (i10 != 12 && i10 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.f7254d = i10;
            w72.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f7253c = secretKeySpec;
            Cipher cipher = f7249e.get();
            cipher.init(1, secretKeySpec);
            byte[] a10 = a(cipher.doFinal(new byte[16]));
            this.f7251a = a10;
            this.f7252b = a(a10);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            byte b10 = bArr[i10];
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((b10 + b10) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        byte b11 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b11 + b11));
        return bArr2;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    @Override // m4.j02
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f7254d;
        if (length <= (Integer.MAX_VALUE - i10) - 16) {
            byte[] bArr3 = new byte[i10 + length + 16];
            byte[] a10 = v72.a(i10);
            System.arraycopy(a10, 0, bArr3, 0, this.f7254d);
            Cipher cipher = f7249e.get();
            cipher.init(1, this.f7253c);
            byte[] c10 = c(cipher, 0, a10, 0, a10.length);
            byte[] c11 = c(cipher, 1, bArr2, 0, 0);
            Cipher cipher2 = f7250f.get();
            cipher2.init(1, this.f7253c, new IvParameterSpec(c10));
            cipher2.doFinal(bArr, 0, length, bArr3, this.f7254d);
            byte[] c12 = c(cipher, 2, bArr3, this.f7254d, length);
            int i11 = length + this.f7254d;
            for (int i12 = 0; i12 < 16; i12++) {
                bArr3[i11 + i12] = (byte) ((c11[i12] ^ c10[i12]) ^ c12[i12]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] c(Cipher cipher, int i10, byte[] bArr, int i11, int i12) {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i10;
        if (i12 == 0) {
            return cipher.doFinal(d(bArr3, this.f7251a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i13 = 0;
        int i14 = 0;
        while (i12 - i14 > 16) {
            for (int i15 = 0; i15 < 16; i15++) {
                doFinal[i15] = (byte) (doFinal[i15] ^ bArr[(i11 + i14) + i15]);
            }
            doFinal = cipher.doFinal(doFinal);
            i14 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i14 + i11, i11 + i12);
        if (copyOfRange.length == 16) {
            bArr2 = d(copyOfRange, this.f7251a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f7252b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i13 >= length) {
                    break;
                }
                copyOf[i13] = (byte) (copyOf[i13] ^ copyOfRange[i13]);
                i13++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(d(doFinal, bArr2));
    }
}
