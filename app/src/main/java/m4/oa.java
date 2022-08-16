package m4;

import android.util.Log;
import java.util.Objects;
import n9.d;

/* loaded from: classes.dex */
public final class oa {

    /* renamed from: a */
    public final we f12058a;

    /* renamed from: b */
    public final Object f12059b;

    /* renamed from: c */
    public final int f12060c;

    /* renamed from: d */
    public final re[] f12061d = new re[2];

    /* renamed from: e */
    public final boolean[] f12062e = new boolean[2];

    /* renamed from: f */
    public final long f12063f;

    /* renamed from: g */
    public int f12064g;

    /* renamed from: h */
    public long f12065h;

    /* renamed from: i */
    public boolean f12066i;

    /* renamed from: j */
    public boolean f12067j;

    /* renamed from: k */
    public boolean f12068k;

    /* renamed from: l */
    public oa f12069l;

    /* renamed from: m */
    public xf f12070m;

    /* renamed from: n */
    public final ya[] f12071n;

    /* renamed from: o */
    public final ha[] f12072o;
    public final uf p;

    /* renamed from: q */
    public final ye f12073q;

    /* renamed from: r */
    public xf f12074r;

    /* renamed from: s */
    public final yb0 f12075s;

    public oa(ya[] yaVarArr, ha[] haVarArr, long j3, uf ufVar, yb0 yb0Var, ye yeVar, Object obj, int i10, int i11, boolean z10, long j10) {
        this.f12071n = yaVarArr;
        this.f12072o = haVarArr;
        this.f12063f = j3;
        this.p = ufVar;
        this.f12075s = yb0Var;
        this.f12073q = yeVar;
        Objects.requireNonNull(obj);
        this.f12059b = obj;
        this.f12060c = i10;
        this.f12064g = i11;
        this.f12066i = z10;
        this.f12065h = j10;
        this.f12058a = yeVar.d(i11, yb0Var.f15642a);
    }

    public final long a(long j3) {
        return b(j3, false, new boolean[2]);
    }

    public final long b(long j3, boolean z10, boolean[] zArr) {
        vf vfVar = this.f12070m.f15316b;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= 2) {
                break;
            }
            boolean[] zArr2 = this.f12062e;
            if (z10 || !this.f12070m.a(this.f12074r, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        long t10 = this.f12058a.t((of[]) vfVar.f14669b.clone(), this.f12062e, this.f12061d, zArr, j3);
        this.f12074r = this.f12070m;
        this.f12068k = false;
        int i11 = 0;
        while (true) {
            re[] reVarArr = this.f12061d;
            if (i11 >= 2) {
                break;
            }
            if (reVarArr[i11] != null) {
                d.i(vfVar.f14669b[i11] != null);
                this.f12068k = true;
            } else {
                d.i(vfVar.f14669b[i11] == null);
            }
            i11++;
        }
        yb0 yb0Var = this.f12075s;
        ya[] yaVarArr = this.f12071n;
        lf lfVar = this.f12070m.f15315a;
        yb0Var.f15647f = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            if (vfVar.f14669b[i12] != null) {
                int i13 = yb0Var.f15647f;
                int c10 = yaVarArr[i12].c();
                int i14 = wg.f14958a;
                yb0Var.f15647f = i13 + (c10 != 1 ? 13107200 : 3538944);
            }
        }
        eg egVar = yb0Var.f15642a;
        int i15 = yb0Var.f15647f;
        synchronized (egVar) {
            int i16 = egVar.f7839b;
            egVar.f7839b = i15;
            if (i15 < i16) {
                egVar.c();
            }
        }
        return t10;
    }

    public final void c() {
        try {
            this.f12073q.a(this.f12058a);
        } catch (RuntimeException e10) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e10);
        }
    }

    public final boolean d() {
        return this.f12067j && (!this.f12068k || this.f12058a.e() == Long.MIN_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a1, code lost:
        if (r11 != (-1)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b1, code lost:
        if (r13 != (-1)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b4, code lost:
        r1 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01be A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            Method dump skipped, instructions count: 826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.oa.e():boolean");
    }
}
