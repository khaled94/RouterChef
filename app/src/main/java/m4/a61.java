package m4;

import android.content.Context;
import d.a;

/* loaded from: classes.dex */
public final class a61 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f6053a;

    /* renamed from: b */
    public final vd2 f6054b;

    /* renamed from: c */
    public final vd2 f6055c;

    public /* synthetic */ a61(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f6053a = i10;
        this.f6054b = vd2Var;
        this.f6055c = vd2Var2;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f6053a) {
            case 0:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((h61) this.f6054b.a(), t90Var);
            case 1:
                Context b10 = ((en1) this.f6054b).b();
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new ue1(b10, t90Var2);
            default:
                return new np1(new mp1(), ((lp1) this.f6055c).a());
        }
    }
}
