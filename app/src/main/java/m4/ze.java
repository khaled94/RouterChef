package m4;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import n9.d;

/* loaded from: classes.dex */
public final class ze implements we, ve {

    /* renamed from: s */
    public final we[] f16156s;

    /* renamed from: t */
    public final IdentityHashMap<re, Integer> f16157t = new IdentityHashMap<>();

    /* renamed from: u */
    public ve f16158u;

    /* renamed from: v */
    public int f16159v;

    /* renamed from: w */
    public lf f16160w;

    /* renamed from: x */
    public we[] f16161x;
    public d7 y;

    public ze(we... weVarArr) {
        this.f16156s = weVarArr;
    }

    @Override // m4.ve
    public final void a(we weVar) {
        int i10 = this.f16159v - 1;
        this.f16159v = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (we weVar2 : this.f16156s) {
            i11 += weVar2.j().f10746a;
        }
        kf[] kfVarArr = new kf[i11];
        int i12 = 0;
        for (we weVar3 : this.f16156s) {
            lf j3 = weVar3.j();
            int i13 = j3.f10746a;
            int i14 = 0;
            while (i14 < i13) {
                kfVarArr[i12] = j3.f10747b[i14];
                i14++;
                i12++;
            }
        }
        this.f16160w = new lf(kfVarArr);
        this.f16158u.a(this);
    }

    @Override // m4.ve
    public final /* bridge */ /* synthetic */ void b(Cif cif) {
        we weVar = (we) cif;
        if (this.f16160w == null) {
            return;
        }
        this.f16158u.b(this);
    }

    @Override // m4.we
    public final long e() {
        long j3 = Long.MAX_VALUE;
        for (we weVar : this.f16161x) {
            long e10 = weVar.e();
            if (e10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, e10);
            }
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // m4.we
    public final long f() {
        we[] weVarArr;
        long f10 = this.f16156s[0].f();
        int i10 = 1;
        while (true) {
            we[] weVarArr2 = this.f16156s;
            if (i10 >= weVarArr2.length) {
                if (f10 != -9223372036854775807L) {
                    for (we weVar : this.f16161x) {
                        if (weVar != this.f16156s[0] && weVar.s(f10) != f10) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return f10;
            } else if (weVarArr2[i10].f() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            } else {
                i10++;
            }
        }
    }

    @Override // m4.we
    public final lf j() {
        return this.f16160w;
    }

    @Override // m4.we
    public final void p() {
        for (we weVar : this.f16156s) {
            weVar.p();
        }
    }

    @Override // m4.we, m4.Cif
    public final boolean q(long j3) {
        return this.y.q(j3);
    }

    @Override // m4.we
    public final void r(long j3) {
        for (we weVar : this.f16161x) {
            weVar.r(j3);
        }
    }

    @Override // m4.we
    public final long s(long j3) {
        long s10 = this.f16161x[0].s(j3);
        int i10 = 1;
        while (true) {
            we[] weVarArr = this.f16161x;
            if (i10 < weVarArr.length) {
                if (weVarArr[i10].s(s10) != s10) {
                    throw new IllegalStateException("Children seeked to different positions");
                }
                i10++;
            } else {
                return s10;
            }
        }
    }

    @Override // m4.we
    public final long t(of[] ofVarArr, boolean[] zArr, re[] reVarArr, boolean[] zArr2, long j3) {
        int length;
        re[] reVarArr2 = reVarArr;
        int length2 = ofVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        while (true) {
            length = ofVarArr.length;
            if (i10 >= length) {
                break;
            }
            re reVar = reVarArr2[i10];
            iArr[i10] = reVar == null ? -1 : this.f16157t.get(reVar).intValue();
            iArr2[i10] = -1;
            of ofVar = ofVarArr[i10];
            if (ofVar != null) {
                kf kfVar = ofVar.f12138a;
                int i11 = 0;
                while (true) {
                    we[] weVarArr = this.f16156s;
                    if (i11 < weVarArr.length) {
                        lf j10 = weVarArr[i11].j();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= j10.f10746a) {
                                i12 = -1;
                                break;
                            } else if (j10.f10747b[i12] == kfVar) {
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
        this.f16157t.clear();
        re[] reVarArr3 = new re[length];
        re[] reVarArr4 = new re[length];
        of[] ofVarArr2 = new of[length];
        ArrayList arrayList = new ArrayList(this.f16156s.length);
        long j11 = j3;
        int i13 = 0;
        while (i13 < this.f16156s.length) {
            for (int i14 = 0; i14 < ofVarArr.length; i14++) {
                of ofVar2 = null;
                reVarArr4[i14] = iArr[i14] == i13 ? reVarArr2[i14] : null;
                if (iArr2[i14] == i13) {
                    ofVar2 = ofVarArr[i14];
                }
                ofVarArr2[i14] = ofVar2;
            }
            int i15 = i13;
            of[] ofVarArr3 = ofVarArr2;
            ArrayList arrayList2 = arrayList;
            long t10 = this.f16156s[i13].t(ofVarArr2, zArr, reVarArr4, zArr2, j11);
            if (i15 == 0) {
                j11 = t10;
            } else if (t10 != j11) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z10 = false;
            for (int i16 = 0; i16 < ofVarArr.length; i16++) {
                boolean z11 = true;
                if (iArr2[i16] == i15) {
                    d.i(reVarArr4[i16] != null);
                    re reVar2 = reVarArr4[i16];
                    reVarArr3[i16] = reVar2;
                    this.f16157t.put(reVar2, Integer.valueOf(i15));
                    z10 = true;
                } else if (iArr[i16] == i15) {
                    if (reVarArr4[i16] != null) {
                        z11 = false;
                    }
                    d.i(z11);
                }
            }
            if (z10) {
                arrayList2.add(this.f16156s[i15]);
            }
            i13 = i15 + 1;
            arrayList = arrayList2;
            ofVarArr2 = ofVarArr3;
            reVarArr2 = reVarArr;
        }
        re[] reVarArr5 = reVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(reVarArr3, 0, reVarArr5, 0, length);
        we[] weVarArr2 = new we[arrayList3.size()];
        this.f16161x = weVarArr2;
        arrayList3.toArray(weVarArr2);
        this.y = new d7(this.f16161x);
        return j11;
    }

    @Override // m4.we
    public final void u(ve veVar, long j3) {
        this.f16158u = veVar;
        we[] weVarArr = this.f16156s;
        this.f16159v = weVarArr.length;
        for (we weVar : weVarArr) {
            weVar.u(this, j3);
        }
    }

    @Override // m4.we, m4.Cif
    public final long zza() {
        return this.y.zza();
    }
}
