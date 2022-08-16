package m4;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public final byte[] f11369a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque<m> f11370b = new ArrayDeque<>();

    /* renamed from: c */
    public final u f11371c = new u();

    /* renamed from: d */
    public o f11372d;

    /* renamed from: e */
    public int f11373e;

    /* renamed from: f */
    public int f11374f;

    /* renamed from: g */
    public long f11375g;

    public final long a(uo2 uo2Var, int i10) {
        ((qo2) uo2Var).n(this.f11369a, 0, i10, false);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (this.f11369a[i11] & 255);
        }
        return j3;
    }
}
