package m4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jn0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f10135a = 1;

    /* renamed from: b */
    public final vd2 f10136b;

    /* renamed from: c */
    public final Object f10137c;

    public jn0(ct0 ct0Var, vd2 vd2Var) {
        this.f10137c = ct0Var;
        this.f10136b = vd2Var;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f10135a) {
            case 0:
                return new es0((oq0) this.f10136b.a(), (Executor) ((vd2) this.f10137c).a());
            default:
                return new es0((rt0) this.f10136b.a(), u90.f14298e);
        }
    }

    public jn0(vd2 vd2Var, vd2 vd2Var2) {
        this.f10136b = vd2Var;
        this.f10137c = vd2Var2;
    }
}
