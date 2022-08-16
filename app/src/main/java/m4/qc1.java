package m4;

import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class qc1 {

    /* renamed from: a */
    public final uc1<am0> f12783a;

    /* renamed from: b */
    public final String f12784b;
    @GuardedBy("this")

    /* renamed from: c */
    public iq f12785c;

    public qc1(uc1<am0> uc1Var, String str) {
        this.f12783a = uc1Var;
        this.f12784b = str;
    }

    public final synchronized void a(jn jnVar, int i10) {
        this.f12785c = null;
        this.f12783a.a(jnVar, this.f12784b, new vc1(i10), new o7(this, 3));
    }
}
