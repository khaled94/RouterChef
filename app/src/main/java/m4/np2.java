package m4;

/* loaded from: classes.dex */
public final class np2 {

    /* renamed from: a */
    public final byte[] f11884a;

    /* renamed from: b */
    public final int f11885b;

    /* renamed from: c */
    public int f11886c;

    /* renamed from: d */
    public int f11887d;

    public np2(byte[] bArr) {
        this.f11884a = bArr;
        this.f11885b = bArr.length;
    }

    public final int a(int i10) {
        int i11 = this.f11886c;
        int min = Math.min(i10, 8 - this.f11887d);
        int i12 = i11 + 1;
        int i13 = ((this.f11884a[i11] & 255) >> this.f11887d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f11884a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        b(i10);
        return ((-1) >>> (32 - i10)) & i13;
    }

    public final void b(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f11886c + i12;
        this.f11886c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f11887d;
        this.f11887d = i14;
        if (i14 > 7) {
            i13++;
            this.f11886c = i13;
            i14 -= 8;
            this.f11887d = i14;
        }
        boolean z10 = false;
        if (i13 >= 0 && (i13 < (i11 = this.f11885b) || (i13 == i11 && i14 == 0))) {
            z10 = true;
        }
        r01.h(z10);
    }

    public final boolean c() {
        byte b10 = this.f11884a[this.f11886c];
        int i10 = this.f11887d;
        b(1);
        return 1 == (((b10 & 255) >> i10) & 1);
    }
}
