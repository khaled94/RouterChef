package m4;

import android.content.Context;

/* loaded from: classes.dex */
public final class fl0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f8587a;

    /* renamed from: b */
    public final vd2 f8588b;

    /* renamed from: c */
    public final vd2 f8589c;

    /* renamed from: d */
    public final vd2 f8590d;

    public /* synthetic */ fl0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, int i10) {
        this.f8587a = i10;
        this.f8588b = vd2Var;
        this.f8589c = vd2Var2;
        this.f8590d = vd2Var3;
    }

    @Override // m4.vd2
    public final /* synthetic */ Object a() {
        switch (this.f8587a) {
            case 0:
                return true != ((kl0) this.f8588b).a().booleanValue() ? ((jb1) this.f8590d).a() : ((w91) this.f8589c).a();
            default:
                return new fs0((Context) this.f8588b.a(), ((td2) this.f8589c).a(), ((mm0) this.f8590d).b());
        }
    }
}
