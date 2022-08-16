package m4;

import d.a;

/* loaded from: classes.dex */
public final class yk0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f15800a;

    /* renamed from: b */
    public final vd2 f15801b;

    /* renamed from: c */
    public final Object f15802c;

    public /* synthetic */ yk0(Object obj, vd2 vd2Var, int i10) {
        this.f15800a = i10;
        this.f15802c = obj;
        this.f15801b = vd2Var;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f15800a) {
            case 0:
                return new es0((rl0) this.f15801b.a(), u90.f14298e);
            case 1:
                return new es0((bn0) this.f15801b.a(), u90.f14299f);
            default:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((h61) this.f15801b.a(), t90Var);
        }
    }

    public yk0(vd2 vd2Var) {
        go1 go1Var = eb.f7756v;
        this.f15800a = 2;
        this.f15801b = vd2Var;
        this.f15802c = go1Var;
    }
}
