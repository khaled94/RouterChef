package y4;

import android.text.TextUtils;
import d4.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z2 {
    public long A;
    public long B;
    public String C;
    public boolean D;
    public long E;
    public long F;

    /* renamed from: a */
    public final w2 f20834a;

    /* renamed from: b */
    public final String f20835b;

    /* renamed from: c */
    public String f20836c;

    /* renamed from: d */
    public String f20837d;

    /* renamed from: e */
    public String f20838e;

    /* renamed from: f */
    public String f20839f;

    /* renamed from: g */
    public long f20840g;

    /* renamed from: h */
    public long f20841h;

    /* renamed from: i */
    public long f20842i;

    /* renamed from: j */
    public String f20843j;

    /* renamed from: k */
    public long f20844k;

    /* renamed from: l */
    public String f20845l;

    /* renamed from: m */
    public long f20846m;

    /* renamed from: n */
    public long f20847n;

    /* renamed from: o */
    public boolean f20848o;
    public long p;

    /* renamed from: q */
    public boolean f20849q;

    /* renamed from: r */
    public String f20850r;

    /* renamed from: s */
    public Boolean f20851s;

    /* renamed from: t */
    public long f20852t;

    /* renamed from: u */
    public List<String> f20853u;

    /* renamed from: v */
    public String f20854v;

    /* renamed from: w */
    public long f20855w;

    /* renamed from: x */
    public long f20856x;
    public long y;

    /* renamed from: z */
    public long f20857z;

    public z2(w2 w2Var, String str) {
        Objects.requireNonNull(w2Var, "null reference");
        m.e(str);
        this.f20834a = w2Var;
        this.f20835b = str;
        w2Var.B().g();
    }

    public final boolean A() {
        this.f20834a.B().g();
        return this.f20848o;
    }

    public final long B() {
        this.f20834a.B().g();
        return this.f20844k;
    }

    public final long C() {
        this.f20834a.B().g();
        return this.E;
    }

    public final long D() {
        this.f20834a.B().g();
        return this.f20847n;
    }

    public final long E() {
        this.f20834a.B().g();
        return this.f20852t;
    }

    public final long F() {
        this.f20834a.B().g();
        return this.F;
    }

    public final long G() {
        this.f20834a.B().g();
        return this.f20846m;
    }

    public final long H() {
        this.f20834a.B().g();
        return this.f20842i;
    }

    public final long I() {
        this.f20834a.B().g();
        return this.f20840g;
    }

    public final long J() {
        this.f20834a.B().g();
        return this.f20841h;
    }

    public final String K() {
        this.f20834a.B().g();
        return this.f20850r;
    }

    public final String L() {
        this.f20834a.B().g();
        String str = this.C;
        s(null);
        return str;
    }

    public final String M() {
        this.f20834a.B().g();
        return this.f20835b;
    }

    public final String N() {
        this.f20834a.B().g();
        return this.f20836c;
    }

    public final String O() {
        this.f20834a.B().g();
        return this.f20845l;
    }

    public final String P() {
        this.f20834a.B().g();
        return this.f20843j;
    }

    public final String Q() {
        this.f20834a.B().g();
        return this.f20839f;
    }

    public final String R() {
        this.f20834a.B().g();
        return this.f20854v;
    }

    public final String S() {
        this.f20834a.B().g();
        return this.f20837d;
    }

    public final List<String> a() {
        this.f20834a.B().g();
        return this.f20853u;
    }

    public final void b() {
        this.f20834a.B().g();
        long j3 = this.f20840g + 1;
        if (j3 > 2147483647L) {
            this.f20834a.C().A.b("Bundle index overflow. appId", s1.s(this.f20835b));
            j3 = 0;
        }
        this.D = true;
        this.f20840g = j3;
    }

    public final void c(String str) {
        this.f20834a.B().g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ h6.Z(this.f20850r, str);
        this.f20850r = str;
    }

    public final void d(boolean z10) {
        this.f20834a.B().g();
        this.D |= this.f20849q != z10;
        this.f20849q = z10;
    }

    public final void e(long j3) {
        this.f20834a.B().g();
        this.D |= this.p != j3;
        this.p = j3;
    }

    public final void f(String str) {
        this.f20834a.B().g();
        this.D |= !h6.Z(this.f20836c, str);
        this.f20836c = str;
    }

    public final void g(String str) {
        this.f20834a.B().g();
        this.D |= !h6.Z(this.f20845l, str);
        this.f20845l = str;
    }

    public final void h(String str) {
        this.f20834a.B().g();
        this.D |= !h6.Z(this.f20843j, str);
        this.f20843j = str;
    }

    public final void i(long j3) {
        this.f20834a.B().g();
        this.D |= this.f20844k != j3;
        this.f20844k = j3;
    }

    public final void j(long j3) {
        this.f20834a.B().g();
        this.D |= this.E != j3;
        this.E = j3;
    }

    public final void k(long j3) {
        this.f20834a.B().g();
        this.D |= this.f20847n != j3;
        this.f20847n = j3;
    }

    public final void l(long j3) {
        this.f20834a.B().g();
        this.D |= this.f20852t != j3;
        this.f20852t = j3;
    }

    public final void m(long j3) {
        this.f20834a.B().g();
        this.D |= this.F != j3;
        this.F = j3;
    }

    public final void n(String str) {
        this.f20834a.B().g();
        this.D |= !h6.Z(this.f20839f, str);
        this.f20839f = str;
    }

    public final void o(String str) {
        this.f20834a.B().g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ h6.Z(this.f20854v, str);
        this.f20854v = str;
    }

    public final void p(String str) {
        this.f20834a.B().g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ h6.Z(this.f20837d, str);
        this.f20837d = str;
    }

    public final void q(long j3) {
        this.f20834a.B().g();
        this.D |= this.f20846m != j3;
        this.f20846m = j3;
    }

    public final long r() {
        this.f20834a.B().g();
        return this.p;
    }

    public final void s(String str) {
        this.f20834a.B().g();
        this.D |= !h6.Z(this.C, str);
        this.C = str;
    }

    public final void t(long j3) {
        this.f20834a.B().g();
        this.D |= this.f20842i != j3;
        this.f20842i = j3;
    }

    public final void u(long j3) {
        boolean z10 = true;
        m.a(j3 >= 0);
        this.f20834a.B().g();
        boolean z11 = this.D;
        if (this.f20840g == j3) {
            z10 = false;
        }
        this.D = z11 | z10;
        this.f20840g = j3;
    }

    public final void v(long j3) {
        this.f20834a.B().g();
        this.D |= this.f20841h != j3;
        this.f20841h = j3;
    }

    public final void w(boolean z10) {
        this.f20834a.B().g();
        this.D |= this.f20848o != z10;
        this.f20848o = z10;
    }

    public final void x(String str) {
        this.f20834a.B().g();
        this.D |= !h6.Z(this.f20838e, str);
        this.f20838e = str;
    }

    public final void y(List<String> list) {
        this.f20834a.B().g();
        List<String> list2 = this.f20853u;
        String[] strArr = h6.y;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 != null && list2.equals(list)) {
            return;
        }
        this.D = true;
        this.f20853u = list != null ? new ArrayList(list) : null;
    }

    public final boolean z() {
        this.f20834a.B().g();
        return this.f20849q;
    }
}
