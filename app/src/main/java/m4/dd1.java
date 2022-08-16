package m4;

import java.util.Arrays;
import l0.d;

/* loaded from: classes.dex */
public final class dd1 {

    /* renamed from: a */
    public int f7329a;

    /* renamed from: b */
    public long[] f7330b = new long[32];

    public final long a(int i10) {
        if (i10 < 0 || i10 >= this.f7329a) {
            throw new IndexOutOfBoundsException(d.a(46, "Invalid index ", i10, ", size is ", this.f7329a));
        }
        return this.f7330b[i10];
    }

    public final void b(long j3) {
        int i10 = this.f7329a;
        long[] jArr = this.f7330b;
        if (i10 == jArr.length) {
            this.f7330b = Arrays.copyOf(jArr, i10 + i10);
        }
        long[] jArr2 = this.f7330b;
        int i11 = this.f7329a;
        this.f7329a = i11 + 1;
        jArr2[i11] = j3;
    }
}
