package m4;

/* loaded from: classes.dex */
public final class z72 {

    /* renamed from: a */
    public final byte[] f16032a = new byte[256];

    /* renamed from: b */
    public int f16033b;

    /* renamed from: c */
    public int f16034c;

    public z72(byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            this.f16032a[i10] = (byte) i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.f16032a;
            byte b10 = bArr2[i12];
            i11 = (i11 + b10 + bArr[i12 % bArr.length]) & 255;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b10;
        }
        this.f16033b = 0;
        this.f16034c = 0;
    }
}
