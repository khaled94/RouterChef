package m4;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class u22 extends fa0 {
    public u22() {
        super(d52.class);
    }

    @Override // m4.fa0
    public final /* synthetic */ qa2 a(n82 n82Var) {
        return d52.y(n82Var, z82.a());
    }

    @Override // m4.fa0
    public final Object c(qa2 qa2Var) {
        a52 w10 = b52.w();
        byte[] a10 = v72.a(((d52) qa2Var).v());
        n82 D = n82.D(a10, 0, a10.length);
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((b52) w10.f9883t).zzf = D;
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((b52) w10.f9883t).zze = 0;
        return w10.k();
    }

    @Override // m4.fa0
    public final Map<String, q02<d52>> d() {
        HashMap hashMap = new HashMap();
        c52 w10 = d52.w();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((d52) w10.f9883t).zze = 64;
        hashMap.put("AES256_SIV", new q02(w10.k(), 1));
        c52 w11 = d52.w();
        if (w11.f9884u) {
            w11.m();
            w11.f9884u = false;
        }
        ((d52) w11.f9883t).zze = 64;
        hashMap.put("AES256_SIV_RAW", new q02(w11.k(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // m4.fa0
    public final /* bridge */ /* synthetic */ void e(qa2 qa2Var) {
        d52 d52Var = (d52) qa2Var;
        if (d52Var.v() == 64) {
            return;
        }
        int v10 = d52Var.v();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(v10);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidAlgorithmParameterException(sb.toString());
    }
}
