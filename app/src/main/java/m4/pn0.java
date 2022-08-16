package m4;

import d.a;
import java.util.Set;

/* loaded from: classes.dex */
public final class pn0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f12573a = 1;

    /* renamed from: b */
    public final vd2 f12574b;

    /* renamed from: c */
    public final Object f12575c;

    public pn0(qi qiVar, vd2 vd2Var) {
        this.f12575c = qiVar;
        this.f12574b = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f12573a) {
            case 0:
                y01 y01Var = (y01) this.f12574b.a();
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return ((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue() ? new es0((q51) ((vd2) this.f12575c).a(), t90Var) : new es0(y01Var, t90Var);
            default:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                Set e10 = qi.e((r11) this.f12574b.a(), t90Var2);
                a.d(e10);
                return e10;
        }
    }

    public pn0(vd2 vd2Var, vd2 vd2Var2) {
        this.f12574b = vd2Var;
        this.f12575c = vd2Var2;
    }
}
