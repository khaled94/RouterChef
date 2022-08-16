package m4;

import d.a;
import java.util.Set;

/* loaded from: classes.dex */
public final class qn0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f12935a;

    /* renamed from: b */
    public final vd2 f12936b;

    /* renamed from: c */
    public final vd2 f12937c;

    /* renamed from: d */
    public final Object f12938d;

    public qn0(qi qiVar, vd2 vd2Var) {
        go1 go1Var = eb.f7756v;
        this.f12935a = 2;
        this.f12938d = qiVar;
        this.f12936b = vd2Var;
        this.f12937c = go1Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f12935a) {
            case 0:
                y01 y01Var = (y01) this.f12936b.a();
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return ((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue() ? new es0((q51) ((vd2) this.f12938d).a(), t90Var) : new es0(y01Var, t90Var);
            case 1:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new wf1(t90Var2, ((en1) this.f12937c).b(), (Set) ((vd2) this.f12938d).a());
            default:
                t90 t90Var3 = u90.f14294a;
                a.d(t90Var3);
                Set e10 = qi.e((r11) this.f12936b.a(), t90Var3);
                a.d(e10);
                return e10;
        }
    }

    public /* synthetic */ qn0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, int i10) {
        this.f12935a = i10;
        this.f12936b = vd2Var;
        this.f12937c = vd2Var2;
        this.f12938d = vd2Var3;
    }
}
