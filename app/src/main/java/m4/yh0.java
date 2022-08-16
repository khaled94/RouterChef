package m4;

import d.a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class yh0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f15784a;

    /* renamed from: b */
    public final Object f15785b;

    public /* synthetic */ yh0(Object obj, int i10) {
        this.f15784a = i10;
        this.f15785b = obj;
    }

    @Override // m4.vd2
    public final /* synthetic */ Object a() {
        switch (this.f15784a) {
            case 0:
                return new xh0(((dn1) ((vd2) this.f15785b)).a());
            case 1:
                return new rp0(((td2) ((vd2) this.f15785b)).a());
            case 2:
                Set singleton = Collections.singleton(new es0((tt0) ((vd2) this.f15785b).a(), u90.f14299f));
                a.d(singleton);
                return singleton;
            case 3:
                return new lc1((ep1) ((vd2) this.f15785b).a());
            default:
                Set emptySet = Collections.emptySet();
                a.d(emptySet);
                return emptySet;
        }
    }
}
