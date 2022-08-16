package m4;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class u12 extends fa0 {
    public u12() {
        super(o42.class);
    }

    @Override // m4.fa0
    public final /* synthetic */ qa2 a(n82 n82Var) {
        return o42.y(n82Var, z82.a());
    }

    @Override // m4.fa0
    public final Object c(qa2 qa2Var) {
        o42 o42Var = (o42) qa2Var;
        l42 w10 = m42.w();
        byte[] a10 = v72.a(o42Var.v());
        n82 D = n82.D(a10, 0, a10.length);
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((m42) w10.f9883t).zzg = D;
        q42 z10 = o42Var.z();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        m42.C((m42) w10.f9883t, z10);
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((m42) w10.f9883t).zze = 0;
        return w10.k();
    }

    @Override // m4.fa0
    public final Map<String, q02<o42>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", v12.i(16, 1));
        hashMap.put("AES128_EAX_RAW", v12.i(16, 3));
        hashMap.put("AES256_EAX", v12.i(32, 1));
        hashMap.put("AES256_EAX_RAW", v12.i(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // m4.fa0
    public final /* bridge */ /* synthetic */ void e(qa2 qa2Var) {
        o42 o42Var = (o42) qa2Var;
        w72.a(o42Var.v());
        if (o42Var.z().v() == 12 || o42Var.z().v() == 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }
}
