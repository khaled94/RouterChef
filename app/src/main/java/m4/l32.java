package m4;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l32 extends fa0 {
    public l32() {
        super(x32.class);
    }

    @Override // m4.fa0
    public final /* synthetic */ qa2 a(n82 n82Var) {
        return x32.y(n82Var, z82.a());
    }

    @Override // m4.fa0
    public final Object c(qa2 qa2Var) {
        x32 x32Var = (x32) qa2Var;
        u32 w10 = v32.w();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((v32) w10.f9883t).zze = 0;
        byte[] a10 = v72.a(x32Var.v());
        n82 D = n82.D(a10, 0, a10.length);
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        ((v32) w10.f9883t).zzf = D;
        z32 z10 = x32Var.z();
        if (w10.f9884u) {
            w10.m();
            w10.f9884u = false;
        }
        v32.D((v32) w10.f9883t, z10);
        return w10.k();
    }

    @Override // m4.fa0
    public final Map<String, q02<x32>> d() {
        HashMap hashMap = new HashMap();
        w32 w10 = x32.w();
        w10.n();
        y32 w11 = z32.w();
        w11.n();
        w10.o(w11.k());
        hashMap.put("AES_CMAC", new q02(w10.k(), 1));
        w32 w12 = x32.w();
        w12.n();
        y32 w13 = z32.w();
        w13.n();
        w12.o(w13.k());
        hashMap.put("AES256_CMAC", new q02(w12.k(), 1));
        w32 w14 = x32.w();
        w14.n();
        y32 w15 = z32.w();
        w15.n();
        w14.o(w15.k());
        hashMap.put("AES256_CMAC_RAW", new q02(w14.k(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // m4.fa0
    public final void e(qa2 qa2Var) {
        x32 x32Var = (x32) qa2Var;
        m32.i(x32Var.z());
        if (x32Var.v() == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}
