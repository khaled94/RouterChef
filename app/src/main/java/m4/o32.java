package m4;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class o32 extends fa0 {
    public o32() {
        super(y52.class);
    }

    @Override // m4.fa0
    public final /* synthetic */ qa2 a(n82 n82Var) {
        return y52.z(n82Var, z82.a());
    }

    @Override // m4.fa0
    public final Object c(qa2 qa2Var) {
        y52 y52Var = (y52) qa2Var;
        v52 w10 = w52.w();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((w52) w10.f9883t).zze = 0;
        a62 A = y52Var.A();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        w52.D((w52) w10.f9883t, A);
        byte[] a10 = v72.a(y52Var.v());
        n82 D = n82.D(a10, 0, a10.length);
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((w52) w10.f9883t).zzg = D;
        return w10.k();
    }

    @Override // m4.fa0
    public final Map<String, q02<y52>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", p32.j(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", p32.j(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", p32.j(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", p32.j(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", p32.j(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", p32.j(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", p32.j(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", p32.j(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", p32.j(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", p32.j(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // m4.fa0
    public final /* bridge */ /* synthetic */ void e(qa2 qa2Var) {
        y52 y52Var = (y52) qa2Var;
        if (y52Var.v() >= 16) {
            p32.k(y52Var.A());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
