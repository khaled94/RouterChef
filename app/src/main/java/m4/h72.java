package m4;

/* loaded from: classes.dex */
public final class h72 extends i72 {
    public h72(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // m4.i72
    public final int b() {
        return 12;
    }

    @Override // m4.i72
    public final int[] c(int[] iArr, int i10) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            i72.g(iArr2, this.f9553a);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
