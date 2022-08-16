package m4;

import n9.d;

/* loaded from: classes.dex */
public final class rd {

    /* renamed from: a */
    public final int f13251a;

    /* renamed from: b */
    public final long[] f13252b;

    /* renamed from: c */
    public final int[] f13253c;

    /* renamed from: d */
    public final int f13254d;

    /* renamed from: e */
    public final long[] f13255e;

    /* renamed from: f */
    public final int[] f13256f;

    public rd(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        boolean z10 = true;
        d.g(iArr.length == length);
        int length2 = jArr.length;
        d.g(length2 == length);
        d.g(iArr2.length != length ? false : z10);
        this.f13252b = jArr;
        this.f13253c = iArr;
        this.f13254d = i10;
        this.f13255e = jArr2;
        this.f13256f = iArr2;
        this.f13251a = length2;
    }

    public final int a(long j3) {
        for (int b10 = wg.b(this.f13255e, j3, false); b10 >= 0; b10--) {
            if ((this.f13256f[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }

    public final int b(long j3) {
        for (int a10 = wg.a(this.f13255e, j3, true, false); a10 < this.f13255e.length; a10++) {
            if ((this.f13256f[a10] & 1) != 0) {
                return a10;
            }
        }
        return -1;
    }
}
