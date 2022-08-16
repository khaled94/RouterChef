package m4;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import n.a;

/* loaded from: classes.dex */
public final class b8 {

    /* renamed from: a */
    public static Cipher f6412a;

    /* renamed from: b */
    public static final Object f6413b = new Object();

    /* renamed from: c */
    public static final Object f6414c = new Object();

    public static final Cipher c() {
        Cipher cipher;
        synchronized (f6414c) {
            if (f6412a == null) {
                f6412a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f6412a;
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f6413b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return a.d(bArr3, false);
        } catch (InvalidKeyException e10) {
            throw new a8(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new a8(e11);
        } catch (BadPaddingException e12) {
            throw new a8(e12);
        } catch (IllegalBlockSizeException e13) {
            throw new a8(e13);
        } catch (NoSuchPaddingException e14) {
            throw new a8(e14);
        }
    }

    public final byte[] b(byte[] bArr, String str) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] e10 = a.e(str, false);
            int length2 = e10.length;
            if (length2 <= 16) {
                throw new a8();
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(e10);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f6413b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = c().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e11) {
            throw new a8(e11);
        } catch (InvalidAlgorithmParameterException e12) {
            throw new a8(e12);
        } catch (InvalidKeyException e13) {
            throw new a8(e13);
        } catch (NoSuchAlgorithmException e14) {
            throw new a8(e14);
        } catch (BadPaddingException e15) {
            throw new a8(e15);
        } catch (IllegalBlockSizeException e16) {
            throw new a8(e16);
        } catch (NoSuchPaddingException e17) {
            throw new a8(e17);
        }
    }
}
