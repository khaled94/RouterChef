package m4;

import java.util.Map;

/* loaded from: classes.dex */
public final class wi0 implements lx<Object> {

    /* renamed from: s */
    public final /* synthetic */ yi0 f15029s;

    public wi0(yi0 yi0Var) {
        this.f15029s = yi0Var;
    }

    @Override // m4.lx
    public final void a(Object obj, Map<String, String> map) {
        if (!yi0.b(this.f15029s, map)) {
            return;
        }
        this.f15029s.f15790c.execute(new ya0(this));
    }
}
