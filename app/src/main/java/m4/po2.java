package m4;

import androidx.fragment.app.a;
import androidx.fragment.app.b1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class po2 implements jp2 {

    /* renamed from: a */
    public final int f12590a;

    /* renamed from: b */
    public final int[] f12591b;

    /* renamed from: c */
    public final long[] f12592c;

    /* renamed from: d */
    public final long[] f12593d;

    /* renamed from: e */
    public final long[] f12594e;

    /* renamed from: f */
    public final long f12595f;

    public po2(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f12591b = iArr;
        this.f12592c = jArr;
        this.f12593d = jArr2;
        this.f12594e = jArr3;
        int length = iArr.length;
        this.f12590a = length;
        if (length <= 0) {
            this.f12595f = 0L;
            return;
        }
        int i10 = length - 1;
        this.f12595f = jArr2[i10] + jArr3[i10];
    }

    @Override // m4.jp2
    public final long b() {
        return this.f12595f;
    }

    @Override // m4.jp2
    public final hp2 d(long j3) {
        int p = ls1.p(this.f12594e, j3, true);
        long[] jArr = this.f12594e;
        long j10 = jArr[p];
        long[] jArr2 = this.f12592c;
        kp2 kp2Var = new kp2(j10, jArr2[p]);
        if (j10 >= j3 || p == this.f12590a - 1) {
            return new hp2(kp2Var, kp2Var);
        }
        int i10 = p + 1;
        return new hp2(kp2Var, new kp2(jArr[i10], jArr2[i10]));
    }

    @Override // m4.jp2
    public final boolean f() {
        return true;
    }

    public final String toString() {
        int i10 = this.f12590a;
        String arrays = Arrays.toString(this.f12591b);
        String arrays2 = Arrays.toString(this.f12592c);
        String arrays3 = Arrays.toString(this.f12594e);
        String arrays4 = Arrays.toString(this.f12593d);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i10);
        sb.append(", sizes=");
        sb.append(arrays);
        b1.b(sb, ", offsets=", arrays2, ", timeUs=", arrays3);
        return a.b(sb, ", durationsUs=", arrays4, ")");
    }
}
