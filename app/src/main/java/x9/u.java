package x9;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    public int f20238a;

    /* renamed from: b */
    public final int[] f20239b = new int[10];

    public final int a() {
        if ((this.f20238a & 128) != 0) {
            return this.f20239b[7];
        }
        return 65535;
    }

    public final u b(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f20239b;
            if (i10 < iArr.length) {
                this.f20238a = (1 << i10) | this.f20238a;
                iArr[i10] = i11;
            }
        }
        return this;
    }
}
