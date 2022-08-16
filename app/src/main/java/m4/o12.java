package m4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class o12 extends fa0 {
    public o12() {
        super(e42.class);
    }

    @Override // m4.fa0
    public final /* synthetic */ qa2 a(n82 n82Var) {
        return e42.x(n82Var, z82.a());
    }

    @Override // m4.fa0
    public final Object c(qa2 qa2Var) {
        e42 e42Var = (e42) qa2Var;
        new s12();
        g42 f10 = r12.f(e42Var.y());
        Object c10 = new p32().a().c(e42Var.z());
        b42 w10 = c42.w();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((c42) w10.f9883t).zzf = f10;
        w52 w52Var = (w52) c10;
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        c42.D((c42) w10.f9883t, w52Var);
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((c42) w10.f9883t).zze = 0;
        return w10.k();
    }

    @Override // m4.fa0
    public final Map<String, q02<e42>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", p12.i(16, 16, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", p12.i(16, 16, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", p12.i(32, 32, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", p12.i(32, 32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // m4.fa0
    public final void e(qa2 qa2Var) {
        e42 e42Var = (e42) qa2Var;
        new s12();
        i42 y = e42Var.y();
        w72.a(y.v());
        s12.j(y.A());
        new p32().a().e(e42Var.z());
        w72.a(e42Var.y().v());
    }
}
