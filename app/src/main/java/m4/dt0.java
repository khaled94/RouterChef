package m4;

import d.a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class dt0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f7632a;

    /* renamed from: b */
    public final vd2 f7633b;

    /* renamed from: c */
    public final Object f7634c;

    public /* synthetic */ dt0(Object obj, vd2 vd2Var, int i10) {
        this.f7632a = i10;
        this.f7634c = obj;
        this.f7633b = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f7632a) {
            case 0:
                Set singleton = Collections.singleton(new es0((xn0) this.f7633b.a(), u90.f14299f));
                a.d(singleton);
                return singleton;
            default:
                return new es0(new d01(((e01) this.f7633b).f7683a.a()), u90.f14298e);
        }
    }
}
