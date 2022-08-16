package m4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class o22 extends fa0 {
    public o22() {
        super(y62.class);
    }

    @Override // m4.fa0
    public final /* synthetic */ qa2 a(n82 n82Var) {
        return y62.x(n82Var, z82.a());
    }

    @Override // m4.fa0
    public final Object c(qa2 qa2Var) {
        y62 y62Var = (y62) qa2Var;
        w62 w10 = x62.w();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((x62) w10.f9883t).zze = 0;
        byte[] a10 = v72.a(32);
        n82 D = n82.D(a10, 0, a10.length);
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((x62) w10.f9883t).zzf = D;
        return w10.k();
    }

    @Override // m4.fa0
    public final Map<String, q02<y62>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new q02(y62.w(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new q02(y62.w(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // m4.fa0
    public final /* bridge */ /* synthetic */ void e(qa2 qa2Var) {
        y62 y62Var = (y62) qa2Var;
    }
}
