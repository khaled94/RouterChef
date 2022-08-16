package m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jk2 implements tj2, sj2 {

    /* renamed from: s */
    public final tj2[] f10111s;

    /* renamed from: v */
    public sj2 f10114v;

    /* renamed from: w */
    public s70 f10115w;

    /* renamed from: u */
    public final ArrayList<tj2> f10113u = new ArrayList<>();
    public lq0 y = new lq0(new al2[0]);

    /* renamed from: t */
    public final IdentityHashMap<zk2, Integer> f10112t = new IdentityHashMap<>();

    /* renamed from: x */
    public tj2[] f10116x = new tj2[0];

    public jk2(long[] jArr, tj2... tj2VarArr) {
        this.f10111s = tj2VarArr;
        for (int i10 = 0; i10 < tj2VarArr.length; i10++) {
            long j3 = jArr[i10];
            if (j3 != 0) {
                this.f10111s[i10] = new hk2(tj2VarArr[i10], j3);
            }
        }
    }

    @Override // m4.tj2, m4.al2
    public final long a() {
        return this.y.a();
    }

    @Override // m4.tj2, m4.al2
    public final boolean b(long j3) {
        if (!this.f10113u.isEmpty()) {
            int size = this.f10113u.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f10113u.get(i10).b(j3);
            }
            return false;
        }
        return this.y.b(j3);
    }

    @Override // m4.tj2, m4.al2
    public final long c() {
        return this.y.c();
    }

    @Override // m4.tj2
    public final s70 d() {
        s70 s70Var = this.f10115w;
        Objects.requireNonNull(s70Var);
        return s70Var;
    }

    @Override // m4.tj2, m4.al2
    public final void e(long j3) {
        this.y.e(j3);
    }

    @Override // m4.tj2
    public final long f(long j3, hf2 hf2Var) {
        tj2[] tj2VarArr = this.f10116x;
        return (tj2VarArr.length > 0 ? tj2VarArr[0] : this.f10111s[0]).f(j3, hf2Var);
    }

    @Override // m4.tj2
    public final long g() {
        tj2[] tj2VarArr;
        tj2[] tj2VarArr2;
        long j3 = -9223372036854775807L;
        for (tj2 tj2Var : this.f10116x) {
            long g10 = tj2Var.g();
            if (g10 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (tj2 tj2Var2 : this.f10116x) {
                        if (tj2Var2 == tj2Var) {
                            break;
                        } else if (tj2Var2.j(g10) != g10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = g10;
                } else if (g10 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && tj2Var.j(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override // m4.sj2
    public final void h(tj2 tj2Var) {
        this.f10113u.remove(tj2Var);
        if (!this.f10113u.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (tj2 tj2Var2 : this.f10111s) {
            i10 += tj2Var2.d().f13533a;
        }
        p60[] p60VarArr = new p60[i10];
        int i11 = 0;
        for (tj2 tj2Var3 : this.f10111s) {
            s70 d5 = tj2Var3.d();
            int i12 = d5.f13533a;
            int i13 = 0;
            while (i13 < i12) {
                p60VarArr[i11] = d5.f13534b[i13];
                i13++;
                i11++;
            }
        }
        this.f10115w = new s70(p60VarArr);
        sj2 sj2Var = this.f10114v;
        Objects.requireNonNull(sj2Var);
        sj2Var.h(this);
    }

    @Override // m4.tj2
    public final void i() {
        for (tj2 tj2Var : this.f10111s) {
            tj2Var.i();
        }
    }

    @Override // m4.tj2
    public final long j(long j3) {
        long j10 = this.f10116x[0].j(j3);
        int i10 = 1;
        while (true) {
            tj2[] tj2VarArr = this.f10116x;
            if (i10 < tj2VarArr.length) {
                if (tj2VarArr[i10].j(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
                i10++;
            } else {
                return j10;
            }
        }
    }

    @Override // m4.tj2, m4.al2
    public final boolean k() {
        return this.y.k();
    }

    @Override // m4.sj2
    public final /* bridge */ /* synthetic */ void l(al2 al2Var) {
        tj2 tj2Var = (tj2) al2Var;
        sj2 sj2Var = this.f10114v;
        Objects.requireNonNull(sj2Var);
        sj2Var.l(this);
    }

    @Override // m4.tj2
    public final void m(sj2 sj2Var, long j3) {
        this.f10114v = sj2Var;
        Collections.addAll(this.f10113u, this.f10111s);
        for (tj2 tj2Var : this.f10111s) {
            tj2Var.m(this, j3);
        }
    }

    @Override // m4.tj2
    public final void n(long j3) {
        for (tj2 tj2Var : this.f10116x) {
            tj2Var.n(j3);
        }
    }

    @Override // m4.tj2
    public final long o(kl2[] kl2VarArr, boolean[] zArr, zk2[] zk2VarArr, boolean[] zArr2, long j3) {
        int length;
        int length2 = kl2VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        while (true) {
            length = kl2VarArr.length;
            if (i10 >= length) {
                break;
            }
            zk2 zk2Var = zk2VarArr[i10];
            Integer num = zk2Var == null ? null : this.f10112t.get(zk2Var);
            iArr[i10] = num == null ? -1 : num.intValue();
            iArr2[i10] = -1;
            kl2 kl2Var = kl2VarArr[i10];
            if (kl2Var != null) {
                p60 p60Var = kl2Var.f10479a;
                int i11 = 0;
                while (true) {
                    tj2[] tj2VarArr = this.f10111s;
                    if (i11 < tj2VarArr.length) {
                        s70 d5 = tj2VarArr[i11].d();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= d5.f13533a) {
                                i12 = -1;
                                break;
                            } else if (d5.f13534b[i12] == p60Var) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (i12 != -1) {
                            iArr2[i10] = i11;
                            break;
                        }
                        i11++;
                    }
                }
            }
            i10++;
        }
        this.f10112t.clear();
        zk2[] zk2VarArr2 = new zk2[length];
        zk2[] zk2VarArr3 = new zk2[length];
        kl2[] kl2VarArr2 = new kl2[length];
        ArrayList arrayList = new ArrayList(this.f10111s.length);
        long j10 = j3;
        int i13 = 0;
        while (i13 < this.f10111s.length) {
            for (int i14 = 0; i14 < kl2VarArr.length; i14++) {
                zk2VarArr3[i14] = iArr[i14] == i13 ? zk2VarArr[i14] : null;
                kl2VarArr2[i14] = iArr2[i14] == i13 ? kl2VarArr[i14] : null;
            }
            int i15 = i13;
            ArrayList arrayList2 = arrayList;
            zk2[] zk2VarArr4 = zk2VarArr3;
            kl2[] kl2VarArr3 = kl2VarArr2;
            long o10 = this.f10111s[i13].o(kl2VarArr2, zArr, zk2VarArr3, zArr2, j10);
            if (i15 == 0) {
                j10 = o10;
            } else if (o10 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i16 = 0; i16 < kl2VarArr.length; i16++) {
                boolean z11 = true;
                if (iArr2[i16] == i15) {
                    zk2 zk2Var2 = zk2VarArr4[i16];
                    Objects.requireNonNull(zk2Var2);
                    zk2VarArr2[i16] = zk2Var2;
                    this.f10112t.put(zk2Var2, Integer.valueOf(i15));
                    z10 = true;
                } else if (iArr[i16] == i15) {
                    if (zk2VarArr4[i16] != null) {
                        z11 = false;
                    }
                    r01.h(z11);
                }
            }
            if (z10) {
                arrayList2.add(this.f10111s[i15]);
            }
            i13 = i15 + 1;
            arrayList = arrayList2;
            zk2VarArr3 = zk2VarArr4;
            kl2VarArr2 = kl2VarArr3;
        }
        System.arraycopy(zk2VarArr2, 0, zk2VarArr, 0, length);
        tj2[] tj2VarArr2 = (tj2[]) arrayList.toArray(new tj2[0]);
        this.f10116x = tj2VarArr2;
        this.y = new lq0(tj2VarArr2);
        return j10;
    }
}
