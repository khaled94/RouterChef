package m4;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a */
    public final mp2 f15558a;

    /* renamed from: b */
    public boolean f15559b;

    /* renamed from: c */
    public boolean f15560c;

    /* renamed from: d */
    public boolean f15561d;

    /* renamed from: e */
    public int f15562e;

    /* renamed from: f */
    public int f15563f;

    /* renamed from: g */
    public long f15564g;

    /* renamed from: h */
    public long f15565h;

    public y1(mp2 mp2Var) {
        this.f15558a = mp2Var;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f15560c) {
            int i12 = this.f15563f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f15563f = (i11 - i10) + i12;
                return;
            }
            this.f15561d = ((bArr[i13] & 192) >> 6) == 0;
            this.f15560c = false;
        }
    }
}
