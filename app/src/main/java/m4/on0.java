package m4;

import d.a;
import java.util.Set;

/* loaded from: classes.dex */
public final class on0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f12227a = 1;

    /* renamed from: b */
    public final vd2 f12228b;

    /* renamed from: c */
    public final Object f12229c;

    public on0(qi qiVar, vd2 vd2Var) {
        this.f12229c = qiVar;
        this.f12228b = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f12227a) {
            case 0:
                y01 y01Var = (y01) this.f12228b.a();
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return ((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue() ? new es0((q51) ((vd2) this.f12229c).a(), t90Var) : new es0(y01Var, t90Var);
            default:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                Set e10 = qi.e((r11) this.f12228b.a(), t90Var2);
                a.d(e10);
                return e10;
        }
    }

    public on0(vd2 vd2Var, vd2 vd2Var2) {
        this.f12228b = vd2Var;
        this.f12229c = vd2Var2;
    }
}
