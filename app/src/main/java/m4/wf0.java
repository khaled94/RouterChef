package m4;

import android.content.Context;
import d.a;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class wf0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f14952a;

    /* renamed from: b */
    public final vd2 f14953b;

    /* renamed from: c */
    public final vd2 f14954c;

    public /* synthetic */ wf0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f14952a = i10;
        this.f14953b = vd2Var;
        this.f14954c = vd2Var2;
    }

    @Override // m4.vd2
    public final /* synthetic */ Object a() {
        switch (this.f14952a) {
            case 0:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new zm1((ry0) this.f14953b.a(), t90Var);
            case 1:
                String str = (String) this.f14954c.a();
                return nt.f11915a.e().booleanValue() ? new v00(str) : new n90(str);
            case 2:
                return new fs0((Context) this.f14953b.a(), new HashSet(), ((mm0) this.f14954c).b());
            default:
                return new mw0(((ov0) this.f14953b).b(), ((ou0) this.f14954c).a());
        }
    }
}
