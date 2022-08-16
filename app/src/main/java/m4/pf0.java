package m4;

import d.a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class pf0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f12497a;

    /* renamed from: b */
    public final vd2 f12498b;

    /* renamed from: c */
    public final vd2 f12499c;

    public /* synthetic */ pf0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f12497a = i10;
        this.f12498b = vd2Var;
        this.f12499c = vd2Var2;
    }

    @Override // m4.vd2
    public final Object a() {
        Set set;
        switch (this.f12497a) {
            case 0:
                u51 u51Var = (u51) this.f12498b.a();
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                yr<Boolean> yrVar = es.f8166p1;
                jo joVar = jo.f10145d;
                if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                    if (((Boolean) joVar.f10148c.a(es.I5)).booleanValue()) {
                        set = Collections.singleton(new es0(u51Var, t90Var));
                        a.d(set);
                        return set;
                    }
                }
                set = Collections.emptySet();
                a.d(set);
                return set;
            case 1:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new es0((ti0) this.f12498b.a(), t90Var2);
            case 2:
                return new a11((d11) this.f12498b.a(), (j11) this.f12499c.a());
            default:
                t90 t90Var3 = u90.f14294a;
                a.d(t90Var3);
                return new zp1(t90Var3, (n90) this.f12499c.a());
        }
    }
}
