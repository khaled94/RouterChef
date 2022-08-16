package m4;

import d.a;

/* loaded from: classes.dex */
public final class aq0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f6230a;

    /* renamed from: b */
    public final vd2 f6231b;

    /* renamed from: c */
    public final Object f6232c;

    public /* synthetic */ aq0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f6230a = i10;
        this.f6231b = vd2Var;
        this.f6232c = vd2Var2;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f6230a) {
            case 0:
                return new zp0(((td2) this.f6231b).a(), ((mm0) ((vd2) this.f6232c)).b());
            case 1:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((p01) this.f6231b.a(), t90Var);
            default:
                return new es0((ao0) this.f6231b.a(), u90.f14299f);
        }
    }

    public aq0(wo2 wo2Var, vd2 vd2Var) {
        this.f6230a = 2;
        this.f6232c = wo2Var;
        this.f6231b = vd2Var;
    }
}
