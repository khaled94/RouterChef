package m4;

import d.a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class gz0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f9069a;

    /* renamed from: b */
    public final vd2 f9070b;

    /* renamed from: c */
    public final vd2 f9071c;

    public /* synthetic */ gz0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f9069a = i10;
        this.f9070b = vd2Var;
        this.f9071c = vd2Var2;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f9069a) {
            case 0:
                return new fz0((ip0) this.f9070b.a(), ((mm0) this.f9071c).b());
            case 1:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                Set singleton = ((Boolean) jo.f10145d.f10148c.a(es.f8053a3)).booleanValue() ? Collections.singleton(new es0(((x01) this.f9071c).a(), t90Var)) : Collections.emptySet();
                a.d(singleton);
                return singleton;
            case 2:
                l41 a10 = ((n41) this.f9070b).a();
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new es0(a10, t90Var2);
            default:
                return new eg1((String) this.f9070b.a(), (String) this.f9071c.a());
        }
    }
}
