package m4;

/* loaded from: classes.dex */
public final class gq1 {

    /* renamed from: a */
    public final nq1 f9000a;

    /* renamed from: b */
    public final nq1 f9001b;

    /* renamed from: c */
    public final kq1 f9002c;

    /* renamed from: d */
    public final mq1 f9003d;

    public gq1(kq1 kq1Var, mq1 mq1Var, nq1 nq1Var, nq1 nq1Var2) {
        this.f9002c = kq1Var;
        this.f9003d = mq1Var;
        this.f9000a = nq1Var;
        this.f9001b = nq1Var2;
    }

    public static gq1 a(kq1 kq1Var, mq1 mq1Var, nq1 nq1Var, nq1 nq1Var2) {
        nq1 nq1Var3 = nq1.NATIVE;
        if (nq1Var != nq1.NONE) {
            if (kq1Var == kq1.DEFINED_BY_JAVASCRIPT && nq1Var == nq1Var3) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (mq1Var != mq1.DEFINED_BY_JAVASCRIPT || nq1Var != nq1Var3) {
                return new gq1(kq1Var, mq1Var, nq1Var, nq1Var2);
            }
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        throw new IllegalArgumentException("Impression owner is none");
    }
}
