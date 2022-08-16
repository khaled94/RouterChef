package m4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d22 extends fa0 {
    public d22() {
        super(h52.class);
    }

    @Override // m4.fa0
    public final /* synthetic */ qa2 a(n82 n82Var) {
        return h52.x(n82Var, z82.a());
    }

    @Override // m4.fa0
    public final Object c(qa2 qa2Var) {
        h52 h52Var = (h52) qa2Var;
        e52 w10 = f52.w();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((f52) w10.f9883t).zze = 0;
        byte[] a10 = v72.a(32);
        n82 D = n82.D(a10, 0, a10.length);
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((f52) w10.f9883t).zzf = D;
        return w10.k();
    }

    @Override // m4.fa0
    public final Map<String, q02<h52>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new q02(h52.w(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new q02(h52.w(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // m4.fa0
    public final /* bridge */ /* synthetic */ void e(qa2 qa2Var) {
        h52 h52Var = (h52) qa2Var;
    }
}
