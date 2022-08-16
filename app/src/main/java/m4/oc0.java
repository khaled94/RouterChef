package m4;

/* loaded from: classes.dex */
public class oc0 {

    /* renamed from: a */
    public final int f12086a;

    /* renamed from: b */
    public final int f12087b;

    /* renamed from: c */
    public final boolean f12088c;

    /* renamed from: d */
    public final gw1<String> f12089d;

    /* renamed from: e */
    public final gw1<String> f12090e;

    /* renamed from: f */
    public final gw1<String> f12091f;

    /* renamed from: g */
    public final gw1<String> f12092g;

    /* renamed from: h */
    public final int f12093h;

    /* renamed from: i */
    public final kw1<p60, ub0> f12094i;

    /* renamed from: j */
    public final pw1<Integer> f12095j;

    static {
        pu1 pu1Var = gw1.f9058t;
        gw1<Object> gw1Var = gx1.f9060w;
        int i10 = pw1.f12646u;
        mx1<Object> mx1Var = mx1.B;
    }

    public oc0(ca0 ca0Var) {
        this.f12086a = ca0Var.f6748a;
        this.f12087b = ca0Var.f6749b;
        this.f12088c = ca0Var.f6750c;
        this.f12089d = ca0Var.f6751d;
        this.f12090e = ca0Var.f6752e;
        this.f12091f = ca0Var.f6753f;
        this.f12092g = ca0Var.f6754g;
        this.f12093h = ca0Var.f6755h;
        this.f12094i = ca0Var.f6756i;
        this.f12095j = ca0Var.f6757j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oc0 oc0Var = (oc0) obj;
            if (this.f12088c == oc0Var.f12088c && this.f12086a == oc0Var.f12086a && this.f12087b == oc0Var.f12087b && this.f12089d.equals(oc0Var.f12089d) && this.f12090e.equals(oc0Var.f12090e) && this.f12091f.equals(oc0Var.f12091f) && this.f12092g.equals(oc0Var.f12092g) && this.f12093h == oc0Var.f12093h && this.f12094i.equals(oc0Var.f12094i) && this.f12095j.equals(oc0Var.f12095j)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f12089d.hashCode();
        int hashCode2 = this.f12090e.hashCode();
        int hashCode3 = this.f12091f.hashCode();
        int hashCode4 = this.f12092g.hashCode();
        int hashCode5 = this.f12094i.hashCode();
        return this.f12095j.hashCode() + ((hashCode5 + ((((hashCode4 + ((hashCode3 + ((((((hashCode2 + ((hashCode + (((((((this.f12088c ? 1 : 0) - 1048002209) * 31) + this.f12086a) * 31) + this.f12087b) * 31)) * 31)) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31)) * 31)) * 31) + this.f12093h) * 923521)) * 31);
    }
}
