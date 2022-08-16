package m4;

import java.util.HashMap;
import java.util.Map;
import n3.i1;

/* loaded from: classes.dex */
public final class xh0 implements th0 {

    /* renamed from: a */
    public final i1 f15360a;

    public xh0(i1 i1Var) {
        this.f15360a = i1Var;
    }

    @Override // m4.th0
    public final void a(Map<String, String> map) {
        this.f15360a.o(Boolean.parseBoolean((String) ((HashMap) map).get("content_vertical_opted_out")));
    }
}
