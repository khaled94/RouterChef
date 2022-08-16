package m4;

import d.a;
import java.util.Set;

/* loaded from: classes.dex */
public final class it0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f9745a;

    /* renamed from: b */
    public final vd2 f9746b;

    /* renamed from: c */
    public final Object f9747c;

    public /* synthetic */ it0(Object obj, vd2 vd2Var, int i10) {
        this.f9745a = i10;
        this.f9747c = obj;
        this.f9746b = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f9745a) {
            case 0:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((ut0) this.f9746b.a(), t90Var);
            default:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                Set e10 = qi.e((r11) this.f9746b.a(), t90Var2);
                a.d(e10);
                return e10;
        }
    }
}
