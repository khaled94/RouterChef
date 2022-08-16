package m4;

import n9.d;

/* loaded from: classes.dex */
public final class ef {

    /* renamed from: i */
    public int f7829i;

    /* renamed from: j */
    public int f7830j;

    /* renamed from: k */
    public int f7831k;

    /* renamed from: l */
    public int f7832l;

    /* renamed from: q */
    public ua f7836q;

    /* renamed from: a */
    public int f7821a = 1000;

    /* renamed from: b */
    public int[] f7822b = new int[1000];

    /* renamed from: c */
    public long[] f7823c = new long[1000];

    /* renamed from: f */
    public long[] f7826f = new long[1000];

    /* renamed from: e */
    public int[] f7825e = new int[1000];

    /* renamed from: d */
    public int[] f7824d = new int[1000];

    /* renamed from: g */
    public oc[] f7827g = new oc[1000];

    /* renamed from: h */
    public ua[] f7828h = new ua[1000];

    /* renamed from: m */
    public long f7833m = Long.MIN_VALUE;

    /* renamed from: n */
    public long f7834n = Long.MIN_VALUE;
    public boolean p = true;

    /* renamed from: o */
    public boolean f7835o = true;

    public final synchronized void a(long j3, int i10, long j10, int i11, oc ocVar) {
        if (this.f7835o) {
            if ((i10 & 1) == 0) {
                return;
            }
            this.f7835o = false;
        }
        d.i(!this.p);
        synchronized (this) {
            this.f7834n = Math.max(this.f7834n, j3);
            long[] jArr = this.f7826f;
            int i12 = this.f7832l;
            jArr[i12] = j3;
            long[] jArr2 = this.f7823c;
            jArr2[i12] = j10;
            this.f7824d[i12] = i11;
            this.f7825e[i12] = i10;
            this.f7827g[i12] = ocVar;
            this.f7828h[i12] = this.f7836q;
            this.f7822b[i12] = 0;
            int i13 = this.f7829i + 1;
            this.f7829i = i13;
            int i14 = this.f7821a;
            if (i13 != i14) {
                int i15 = i12 + 1;
                this.f7832l = i15;
                if (i15 != i14) {
                    return;
                }
                this.f7832l = 0;
                return;
            }
            int i16 = i14 + 1000;
            int[] iArr = new int[i16];
            long[] jArr3 = new long[i16];
            long[] jArr4 = new long[i16];
            int[] iArr2 = new int[i16];
            int[] iArr3 = new int[i16];
            oc[] ocVarArr = new oc[i16];
            ua[] uaVarArr = new ua[i16];
            int i17 = this.f7831k;
            int i18 = i14 - i17;
            System.arraycopy(jArr2, i17, jArr3, 0, i18);
            System.arraycopy(this.f7826f, this.f7831k, jArr4, 0, i18);
            System.arraycopy(this.f7825e, this.f7831k, iArr2, 0, i18);
            System.arraycopy(this.f7824d, this.f7831k, iArr3, 0, i18);
            System.arraycopy(this.f7827g, this.f7831k, ocVarArr, 0, i18);
            System.arraycopy(this.f7828h, this.f7831k, uaVarArr, 0, i18);
            System.arraycopy(this.f7822b, this.f7831k, iArr, 0, i18);
            int i19 = this.f7831k;
            System.arraycopy(this.f7823c, 0, jArr3, i18, i19);
            System.arraycopy(this.f7826f, 0, jArr4, i18, i19);
            System.arraycopy(this.f7825e, 0, iArr2, i18, i19);
            System.arraycopy(this.f7824d, 0, iArr3, i18, i19);
            System.arraycopy(this.f7827g, 0, ocVarArr, i18, i19);
            System.arraycopy(this.f7828h, 0, uaVarArr, i18, i19);
            System.arraycopy(this.f7822b, 0, iArr, i18, i19);
            this.f7823c = jArr3;
            this.f7826f = jArr4;
            this.f7825e = iArr2;
            this.f7824d = iArr3;
            this.f7827g = ocVarArr;
            this.f7828h = uaVarArr;
            this.f7822b = iArr;
            this.f7831k = 0;
            int i20 = this.f7821a;
            this.f7832l = i20;
            this.f7829i = i20;
            this.f7821a = i16;
        }
    }

    public final synchronized boolean b() {
        return this.f7829i != 0;
    }
}
