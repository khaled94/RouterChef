package m4;

import android.content.Context;
import d.a;

/* loaded from: classes.dex */
public final class io0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f9714a = 0;

    /* renamed from: b */
    public final vd2 f9715b;

    /* renamed from: c */
    public final Object f9716c;

    public io0(ho0 ho0Var, vd2 vd2Var) {
        this.f9716c = ho0Var;
        this.f9715b = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f9714a) {
            case 0:
                ((en1) this.f9715b).b();
                Context context = (Context) ((ho0) this.f9716c).f9392a;
                a.d(context);
                return context;
            default:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new hd1((tz1) this.f9715b.a(), t90Var);
        }
    }

    public io0(vd2 vd2Var) {
        go1 go1Var = eb.f7756v;
        this.f9715b = vd2Var;
        this.f9716c = go1Var;
    }
}
