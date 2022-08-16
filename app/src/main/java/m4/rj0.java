package m4;

import d.a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class rj0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f13368a;

    /* renamed from: b */
    public final vd2 f13369b;

    /* renamed from: c */
    public final Object f13370c;

    public /* synthetic */ rj0(Object obj, vd2 vd2Var, int i10) {
        this.f13368a = i10;
        this.f13370c = obj;
        this.f13369b = vd2Var;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f13368a) {
            case 0:
                Set singleton = Collections.singleton(new es0((tl0) this.f13369b.a(), u90.f14299f));
                a.d(singleton);
                return singleton;
            case 1:
                return new es0((qm0) this.f13369b.a(), u90.f14299f);
            default:
                Set<es0<to0>> a10 = ((ct0) this.f13370c).a((xn0) this.f13369b.a());
                a.d(a10);
                return a10;
        }
    }
}
