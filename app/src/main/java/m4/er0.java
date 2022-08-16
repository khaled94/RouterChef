package m4;

import d.a;
import java.util.Set;

/* loaded from: classes.dex */
public final class er0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f8042a;

    /* renamed from: b */
    public final vd2 f8043b;

    /* renamed from: c */
    public final Object f8044c;

    public /* synthetic */ er0(Object obj, vd2 vd2Var, int i10) {
        this.f8042a = i10;
        this.f8044c = obj;
        this.f8043b = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f8042a) {
            case 0:
                dr0 dr0Var = (dr0) this.f8044c;
                Set a10 = ((td2) this.f8043b).a();
                if (dr0Var.p == null) {
                    dr0Var.p = new uo0(a10);
                }
                uo0 uo0Var = dr0Var.p;
                a.d(uo0Var);
                return uo0Var;
            default:
                return new es0((rt0) this.f8043b.a(), u90.f14298e);
        }
    }
}
