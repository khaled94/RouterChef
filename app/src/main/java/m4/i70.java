package m4;

import android.content.Context;
import d.a;
import java.util.Set;
import n3.i1;

/* loaded from: classes.dex */
public final class i70 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f9547a = 1;

    /* renamed from: b */
    public final vd2 f9548b;

    /* renamed from: c */
    public final vd2 f9549c;

    /* renamed from: d */
    public final Object f9550d;

    public i70(qi qiVar, vd2 vd2Var) {
        go1 go1Var = eb.f7756v;
        this.f9550d = qiVar;
        this.f9548b = vd2Var;
        this.f9549c = go1Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f9547a) {
            case 0:
                return new h70((Context) this.f9548b.a(), (i1) this.f9549c.a(), (x70) ((vd2) this.f9550d).a());
            default:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                Set e10 = qi.e((r11) this.f9548b.a(), t90Var);
                a.d(e10);
                return e10;
        }
    }

    public i70(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3) {
        this.f9548b = vd2Var;
        this.f9549c = vd2Var2;
        this.f9550d = vd2Var3;
    }
}
