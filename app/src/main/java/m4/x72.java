package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class x72 extends i72 {
    public x72(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // m4.i72
    public final int b() {
        return 24;
    }

    @Override // m4.i72
    public final int[] c(int[] iArr, int i10) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            i72.g(r0, this.f9553a);
            int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
            i72.h(iArr3);
            i72.g(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i10;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
