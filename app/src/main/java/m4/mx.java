package m4;

import d4.m;
import java.util.Map;

/* loaded from: classes.dex */
public final class mx implements lx<Object> {

    /* renamed from: s */
    public final x21 f11331s;

    public mx(x21 x21Var) {
        m.i(x21Var, "The Inspector Manager must not be null");
        this.f11331s = x21Var;
    }

    @Override // m4.lx
    public final void a(Object obj, Map<String, String> map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j3 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j3 = Long.parseLong(map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        x21 x21Var = this.f11331s;
        String str = map.get("extras");
        synchronized (x21Var) {
            x21Var.f15200h = str;
            x21Var.f15202j = j3;
            x21Var.g();
        }
    }
}
