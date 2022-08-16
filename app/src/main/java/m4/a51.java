package m4;

import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import l3.s;
import n3.s1;

/* loaded from: classes.dex */
public final class a51 {

    /* renamed from: a */
    public final uz1 f6049a;

    /* renamed from: b */
    public final j41 f6050b;

    /* renamed from: c */
    public final jd2<k51> f6051c;

    public a51(uz1 uz1Var, j41 j41Var, jd2<k51> jd2Var) {
        this.f6049a = uz1Var;
        this.f6050b = j41Var;
        this.f6051c = jd2Var;
    }

    public final <RetT> tz1<RetT> a(final o50 o50Var, z41<InputStream> z41Var, final z41<InputStream> z41Var2, final xy1<InputStream, RetT> xy1Var) {
        tz1 tz1Var;
        String str = o50Var.f11998v;
        s1 s1Var = s.B.f5789c;
        if (s1.f(str)) {
            tz1Var = new nz1(new t41(1));
        } else {
            tz1Var = mz1.j(z41Var.e(o50Var), ExecutionException.class, y41.f15590a, this.f6049a);
        }
        return mz1.j(mz1.p(gz1.r(tz1Var), xy1Var, this.f6049a), t41.class, new xy1() { // from class: m4.w41
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                a51 a51Var = a51.this;
                z41 z41Var3 = z41Var2;
                o50 o50Var2 = o50Var;
                xy1 xy1Var2 = xy1Var;
                t41 t41Var = (t41) obj;
                Objects.requireNonNull(a51Var);
                return mz1.p(z41Var3.e(o50Var2), xy1Var2, a51Var.f6049a);
            }
        }, this.f6049a);
    }
}
