package m4;

import d.c;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a32 extends fa0 {
    public a32() {
        super(m52.class);
    }

    @Override // m4.fa0
    public final /* synthetic */ qa2 a(n82 n82Var) {
        return m52.x(n82Var, z82.a());
    }

    @Override // m4.fa0
    public final Object c(qa2 qa2Var) {
        m52 m52Var = (m52) qa2Var;
        ECParameterSpec i10 = zv1.i(c.k(m52Var.y().z().A()));
        KeyPairGenerator a10 = n72.f11547h.a("EC");
        a10.initialize(i10);
        KeyPair generateKeyPair = a10.generateKeyPair();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        ECPoint w10 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
        r52 x10 = s52.x();
        if (x10.f9884u) {
            x10.m();
            x10.f9884u = false;
        }
        ((s52) x10.f9883t).zze = 0;
        o52 y = m52Var.y();
        if (x10.f9884u) {
            x10.m();
            x10.f9884u = false;
        }
        s52.E((s52) x10.f9883t, y);
        n82 C = n82.C(w10.getAffineX().toByteArray());
        if (x10.f9884u) {
            x10.m();
            x10.f9884u = false;
        }
        ((s52) x10.f9883t).zzg = C;
        n82 C2 = n82.C(w10.getAffineY().toByteArray());
        if (x10.f9884u) {
            x10.m();
            x10.f9884u = false;
        }
        ((s52) x10.f9883t).zzh = C2;
        s52 k10 = x10.k();
        p52 w11 = q52.w();
        if (w11.f9884u) {
            w11.m();
            w11.f9884u = false;
        }
        ((q52) w11.f9883t).zze = 0;
        if (w11.f9884u) {
            w11.m();
            w11.f9884u = false;
        }
        ((q52) w11.f9883t).zzf = k10;
        n82 C3 = n82.C(eCPrivateKey.getS().toByteArray());
        if (w11.f9884u) {
            w11.m();
            w11.f9884u = false;
        }
        ((q52) w11.f9883t).zzg = C3;
        return w11.k();
    }

    @Override // m4.fa0
    public final Map<String, q02<m52>> d() {
        HashMap hashMap = new HashMap();
        p02 b10 = g7.b("AES128_GCM");
        byte[] bArr = b32.f6354d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", b32.i(3, b10, bArr, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", b32.i(3, g7.b("AES128_GCM"), bArr, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", b32.i(4, g7.b("AES128_GCM"), bArr, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", b32.i(4, g7.b("AES128_GCM"), bArr, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", b32.i(4, g7.b("AES128_GCM"), bArr, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", b32.i(3, g7.b("AES128_CTR_HMAC_SHA256"), bArr, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", b32.i(3, g7.b("AES128_CTR_HMAC_SHA256"), bArr, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", b32.i(4, g7.b("AES128_CTR_HMAC_SHA256"), bArr, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", b32.i(4, g7.b("AES128_CTR_HMAC_SHA256"), bArr, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // m4.fa0
    public final /* synthetic */ void e(qa2 qa2Var) {
        c.i(((m52) qa2Var).y());
    }
}
