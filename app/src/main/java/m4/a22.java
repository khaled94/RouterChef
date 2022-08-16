package m4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a22 extends fa0 {
    public a22() {
        super(z42.class);
    }

    @Override // m4.fa0
    public final /* synthetic */ qa2 a(n82 n82Var) {
        return z42.y(n82Var, z82.a());
    }

    @Override // m4.fa0
    public final Object c(qa2 qa2Var) {
        w42 w10 = x42.w();
        byte[] a10 = v72.a(((z42) qa2Var).v());
        n82 D = n82.D(a10, 0, a10.length);
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((x42) w10.f9883t).zzf = D;
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((x42) w10.f9883t).zze = 0;
        return w10.k();
    }

    @Override // m4.fa0
    public final Map<String, q02<z42>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", b22.i(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", b22.i(16, 3));
        hashMap.put("AES256_GCM_SIV", b22.i(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", b22.i(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // m4.fa0
    public final /* synthetic */ void e(qa2 qa2Var) {
        w72.a(((z42) qa2Var).v());
    }
}
