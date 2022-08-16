package m4;

/* loaded from: classes.dex */
public final class ld2<T> implements nd2<T> {

    /* renamed from: a */
    public vd2<T> f10734a;

    public static <T> void b(vd2<T> vd2Var, vd2<T> vd2Var2) {
        ld2 ld2Var = (ld2) vd2Var;
        if (ld2Var.f10734a == null) {
            ld2Var.f10734a = vd2Var2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // m4.vd2
    public final T a() {
        vd2<T> vd2Var = this.f10734a;
        if (vd2Var != null) {
            return vd2Var.a();
        }
        throw new IllegalStateException();
    }
}
