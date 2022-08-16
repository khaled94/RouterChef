package m4;

import d.a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class xk0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f15386a;

    /* renamed from: b */
    public final vd2 f15387b;

    /* renamed from: c */
    public final Object f15388c;

    public /* synthetic */ xk0(Object obj, vd2 vd2Var, int i10) {
        this.f15386a = i10;
        this.f15388c = obj;
        this.f15387b = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f15386a) {
            case 0:
                Set singleton = Collections.singleton(new es0((tl0) this.f15387b.a(), u90.f14299f));
                a.d(singleton);
                return singleton;
            default:
                return new es0((bn0) this.f15387b.a(), u90.f14299f);
        }
    }
}
