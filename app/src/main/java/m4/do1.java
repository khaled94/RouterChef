package m4;

import java.util.Objects;
import javax.annotation.concurrent.GuardedBy;
import m4.am0;
import m4.fo0;

/* loaded from: classes.dex */
public final class do1<R extends fo0<AdT>, AdT extends am0> {

    /* renamed from: a */
    public final wn1<R, AdT> f7576a;

    /* renamed from: b */
    public final tz1<vn1<R, AdT>> f7577b;
    @GuardedBy("this")

    /* renamed from: c */
    public boolean f7578c = false;
    @GuardedBy("this")

    /* renamed from: d */
    public boolean f7579d = false;

    /* JADX WARN: Multi-variable type inference failed */
    public do1(final in1 in1Var, final rb1 rb1Var, final wn1<R, AdT> wn1Var) {
        this.f7576a = wn1Var;
        Objects.requireNonNull(rb1Var);
        jk1 jk1Var = (jk1) wn1Var;
        this.f7577b = (xx1) mz1.j(mz1.p(((hk1) ((dl1) rb1Var.f13243t)).b(jk1Var.f10105b, jk1Var.f10104a, null), new xy1() { // from class: m4.bo1
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                tz1 m10;
                do1 do1Var = do1.this;
                rb1 rb1Var2 = rb1Var;
                in1 in1Var2 = in1Var;
                wn1 wn1Var2 = wn1Var;
                pn1<?, ?> pn1Var = (pn1) obj;
                synchronized (do1Var) {
                    do1Var.f7579d = true;
                    pn1Var.f12576a = ((hk1) ((dl1) rb1Var2.f13243t)).f9368a;
                    if (!do1Var.f7578c) {
                        ((jn1) in1Var2).a(wn1Var2.zza(), pn1Var);
                        m10 = mz1.m(null);
                    } else {
                        m10 = mz1.m(new vn1(pn1Var, wn1Var2));
                    }
                }
                return m10;
            }
        }, wn1Var.a()), Exception.class, new xy1(rb1Var) { // from class: m4.ao1
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                do1 do1Var = do1.this;
                Exception exc = (Exception) obj;
                synchronized (do1Var) {
                    do1Var.f7579d = true;
                    throw exc;
                }
            }
        }, wn1Var.a());
    }

    public final synchronized tz1<vn1<R, AdT>> a(wn1<R, AdT> wn1Var) {
        if (!this.f7579d && !this.f7578c) {
            if (this.f7576a.zza() != null && ((jk1) wn1Var).f10110g != null && this.f7576a.zza().equals(((jk1) wn1Var).f10110g)) {
                this.f7578c = true;
                return this.f7577b;
            }
            return null;
        }
        return null;
    }
}
