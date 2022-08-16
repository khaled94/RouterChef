package m4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public abstract class i72 implements p72 {

    /* renamed from: c */
    public static final int[] f9552c = i(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    public int[] f9553a;

    /* renamed from: b */
    public final int f9554b;

    public i72(byte[] bArr, int i10) {
        if (bArr.length == 32) {
            this.f9553a = i(bArr);
            this.f9554b = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public static void f(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = iArr[i10] + iArr[i11];
        iArr[i10] = i14;
        int i15 = i14 ^ iArr[i13];
        int i16 = (i15 >>> (-16)) | (i15 << 16);
        iArr[i13] = i16;
        int i17 = iArr[i12] + i16;
        iArr[i12] = i17;
        int i18 = iArr[i11] ^ i17;
        int i19 = (i18 >>> (-12)) | (i18 << 12);
        iArr[i11] = i19;
        int i20 = iArr[i10] + i19;
        iArr[i10] = i20;
        int i21 = iArr[i13] ^ i20;
        int i22 = (i21 >>> (-8)) | (i21 << 8);
        iArr[i13] = i22;
        int i23 = iArr[i12] + i22;
        iArr[i12] = i23;
        int i24 = iArr[i11] ^ i23;
        iArr[i11] = (i24 >>> (-7)) | (i24 << 7);
    }

    public static void g(int[] iArr, int[] iArr2) {
        int[] iArr3 = f9552c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void h(int[] iArr) {
        for (int i10 = 0; i10 < 10; i10++) {
            f(iArr, 0, 4, 8, 12);
            f(iArr, 1, 5, 9, 13);
            f(iArr, 2, 6, 10, 14);
            f(iArr, 3, 7, 11, 15);
            f(iArr, 0, 5, 10, 15);
            f(iArr, 1, 6, 11, 12);
            f(iArr, 2, 7, 8, 13);
            f(iArr, 3, 4, 9, 14);
        }
    }

    public static int[] i(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // m4.p72
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        if (length <= Integer.MAX_VALUE - b()) {
            ByteBuffer allocate = ByteBuffer.allocate(b() + length);
            e(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public abstract int b();

    public abstract int[] c(int[] iArr, int i10);

    public final ByteBuffer d(byte[] bArr, int i10) {
        int[] c10 = c(i(bArr), i10);
        int[] iArr = (int[]) c10.clone();
        h(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            c10[i11] = c10[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(c10, 0, 16);
        return order;
    }

    public final void e(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - b() >= bArr.length) {
            byte[] a10 = v72.a(b());
            byteBuffer.put(a10);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i10 = (remaining / 64) + 1;
            for (int i11 = 0; i11 < i10; i11++) {
                ByteBuffer d5 = d(a10, this.f9554b + i11);
                if (i11 == i10 - 1) {
                    g7.c(byteBuffer, wrap, d5, remaining % 64);
                } else {
                    g7.c(byteBuffer, wrap, d5, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
