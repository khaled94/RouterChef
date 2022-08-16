package m4;

import n9.d;

/* loaded from: classes.dex */
public final class qg {

    /* renamed from: a */
    public byte[] f12837a;

    /* renamed from: b */
    public int f12838b;

    /* renamed from: c */
    public int f12839c;

    /* renamed from: d */
    public int f12840d;

    public qg(byte[] bArr, int i10) {
        this.f12837a = bArr;
        this.f12840d = i10;
    }

    public final int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i10 >> 3;
        boolean z10 = false;
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = this.f12839c;
            if (i18 != 0) {
                byte[] bArr = this.f12837a;
                int i19 = this.f12838b;
                i14 = ((bArr[i19 + 1] & 255) >>> (8 - i18)) | ((bArr[i19] & 255) << i18);
            } else {
                i14 = this.f12837a[this.f12838b];
            }
            i10 -= 8;
            i16 |= (255 & i14) << i10;
            this.f12838b++;
        }
        if (i10 > 0) {
            int i20 = this.f12839c + i10;
            byte b10 = (byte) (255 >> (8 - i10));
            byte[] bArr2 = this.f12837a;
            int i21 = this.f12838b;
            if (i20 > 8) {
                int i22 = i21 + 1;
                i13 = (b10 & (((255 & bArr2[i22]) >> (16 - i20)) | ((bArr2[i21] & 255) << (i20 - 8)))) | i16;
                this.f12838b = i22;
            } else {
                i13 = (b10 & ((255 & bArr2[i21]) >> (8 - i20))) | i16;
                if (i20 == 8) {
                    this.f12838b = i21 + 1;
                }
            }
            i16 = i13;
            this.f12839c = i20 % 8;
        }
        int i23 = this.f12838b;
        if (i23 >= 0 && (i11 = this.f12839c) >= 0 && (i23 < (i12 = this.f12840d) || (i23 == i12 && i11 == 0))) {
            z10 = true;
        }
        d.i(z10);
        return i16;
    }
}
