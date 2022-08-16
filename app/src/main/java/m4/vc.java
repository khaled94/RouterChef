package m4;

/* loaded from: classes.dex */
public final class vc {

    /* renamed from: a */
    public final rg f14658a = new rg(8);

    /* renamed from: b */
    public int f14659b;

    public final long a(hc hcVar) {
        int i10 = 0;
        hcVar.b(this.f14658a.f13267a, 0, 1);
        int i11 = this.f14658a.f13267a[0] & 255;
        if (i11 != 0) {
            int i12 = 128;
            int i13 = 0;
            while ((i11 & i12) == 0) {
                i12 >>= 1;
                i13++;
            }
            int i14 = i11 & (~i12);
            hcVar.b(this.f14658a.f13267a, 1, i13);
            while (i10 < i13) {
                i10++;
                i14 = (this.f14658a.f13267a[i10] & 255) + (i14 << 8);
            }
            this.f14659b = i13 + 1 + this.f14659b;
            return i14;
        }
        return Long.MIN_VALUE;
    }
}
