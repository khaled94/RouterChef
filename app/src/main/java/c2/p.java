package c2;

import androidx.work.b;
import t1.h;
import t1.n;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    public String f2635a;

    /* renamed from: b */
    public n f2636b;

    /* renamed from: c */
    public String f2637c;

    /* renamed from: d */
    public String f2638d;

    /* renamed from: e */
    public b f2639e;

    /* renamed from: f */
    public b f2640f;

    /* renamed from: g */
    public long f2641g;

    /* renamed from: h */
    public long f2642h;

    /* renamed from: i */
    public long f2643i;

    /* renamed from: j */
    public t1.b f2644j;

    /* renamed from: k */
    public int f2645k;

    /* renamed from: l */
    public int f2646l;

    /* renamed from: m */
    public long f2647m;

    /* renamed from: n */
    public long f2648n;

    /* renamed from: o */
    public long f2649o;
    public long p;

    /* renamed from: q */
    public boolean f2650q;

    /* renamed from: r */
    public int f2651r;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public String f2652a;

        /* renamed from: b */
        public n f2653b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f2653b == aVar.f2653b) {
                return this.f2652a.equals(aVar.f2652a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f2653b.hashCode() + (this.f2652a.hashCode() * 31);
        }
    }

    static {
        h.e("WorkSpec");
    }

    public p(p pVar) {
        this.f2636b = n.ENQUEUED;
        b bVar = b.f2305c;
        this.f2639e = bVar;
        this.f2640f = bVar;
        this.f2644j = t1.b.f18451i;
        this.f2646l = 1;
        this.f2647m = 30000L;
        this.p = -1L;
        this.f2651r = 1;
        this.f2635a = pVar.f2635a;
        this.f2637c = pVar.f2637c;
        this.f2636b = pVar.f2636b;
        this.f2638d = pVar.f2638d;
        this.f2639e = new b(pVar.f2639e);
        this.f2640f = new b(pVar.f2640f);
        this.f2641g = pVar.f2641g;
        this.f2642h = pVar.f2642h;
        this.f2643i = pVar.f2643i;
        this.f2644j = new t1.b(pVar.f2644j);
        this.f2645k = pVar.f2645k;
        this.f2646l = pVar.f2646l;
        this.f2647m = pVar.f2647m;
        this.f2648n = pVar.f2648n;
        this.f2649o = pVar.f2649o;
        this.p = pVar.p;
        this.f2650q = pVar.f2650q;
        this.f2651r = pVar.f2651r;
    }

    public p(String str, String str2) {
        this.f2636b = n.ENQUEUED;
        b bVar = b.f2305c;
        this.f2639e = bVar;
        this.f2640f = bVar;
        this.f2644j = t1.b.f18451i;
        this.f2646l = 1;
        this.f2647m = 30000L;
        this.p = -1L;
        this.f2651r = 1;
        this.f2635a = str;
        this.f2637c = str2;
    }

    public final long a() {
        long j3;
        long j10;
        long j11;
        boolean z10 = false;
        if (this.f2636b == n.ENQUEUED && this.f2645k > 0) {
            if (this.f2646l == 2) {
                z10 = true;
            }
            long scalb = z10 ? this.f2647m * this.f2645k : Math.scalb((float) j11, this.f2645k - 1);
            j10 = this.f2648n;
            j3 = Math.min(18000000L, scalb);
        } else {
            long j12 = 0;
            if (c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j13 = this.f2648n;
                int i10 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                if (i10 == 0) {
                    j13 = this.f2641g + currentTimeMillis;
                }
                long j14 = this.f2643i;
                long j15 = this.f2642h;
                if (j14 != j15) {
                    z10 = true;
                }
                if (z10) {
                    if (i10 == 0) {
                        j12 = j14 * (-1);
                    }
                    return j13 + j15 + j12;
                }
                if (i10 != 0) {
                    j12 = j15;
                }
                return j13 + j12;
            }
            j3 = this.f2648n;
            if (j3 == 0) {
                j3 = System.currentTimeMillis();
            }
            j10 = this.f2641g;
        }
        return j3 + j10;
    }

    public final boolean b() {
        return !t1.b.f18451i.equals(this.f2644j);
    }

    public final boolean c() {
        return this.f2642h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f2641g != pVar.f2641g || this.f2642h != pVar.f2642h || this.f2643i != pVar.f2643i || this.f2645k != pVar.f2645k || this.f2647m != pVar.f2647m || this.f2648n != pVar.f2648n || this.f2649o != pVar.f2649o || this.p != pVar.p || this.f2650q != pVar.f2650q || !this.f2635a.equals(pVar.f2635a) || this.f2636b != pVar.f2636b || !this.f2637c.equals(pVar.f2637c)) {
            return false;
        }
        String str = this.f2638d;
        if (str == null ? pVar.f2638d != null : !str.equals(pVar.f2638d)) {
            return false;
        }
        return this.f2639e.equals(pVar.f2639e) && this.f2640f.equals(pVar.f2640f) && this.f2644j.equals(pVar.f2644j) && this.f2646l == pVar.f2646l && this.f2651r == pVar.f2651r;
    }

    public final int hashCode() {
        int a10 = androidx.fragment.app.a.a(this.f2637c, (this.f2636b.hashCode() + (this.f2635a.hashCode() * 31)) * 31, 31);
        String str = this.f2638d;
        int hashCode = str != null ? str.hashCode() : 0;
        int hashCode2 = this.f2639e.hashCode();
        int hashCode3 = this.f2640f.hashCode();
        long j3 = this.f2641g;
        long j10 = this.f2642h;
        long j11 = this.f2643i;
        int hashCode4 = this.f2644j.hashCode();
        int b10 = s.h.b(this.f2646l);
        long j12 = this.f2647m;
        long j13 = this.f2648n;
        long j14 = this.f2649o;
        long j15 = this.p;
        return s.h.b(this.f2651r) + ((((((((((((b10 + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((a10 + hashCode) * 31)) * 31)) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f2645k) * 31)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + (this.f2650q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return s.b.b(androidx.activity.result.a.c("{WorkSpec: "), this.f2635a, "}");
    }
}
