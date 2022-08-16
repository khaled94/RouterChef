package m4;

import android.net.NetworkCapabilities;
import c5.i;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h8 {

    /* renamed from: a */
    public final as1 f9131a;

    /* renamed from: b */
    public final ms1 f9132b;

    /* renamed from: c */
    public final t8 f9133c;

    /* renamed from: d */
    public final g8 f9134d;

    /* renamed from: e */
    public final z7 f9135e;

    public h8(as1 as1Var, ms1 ms1Var, t8 t8Var, g8 g8Var, z7 z7Var) {
        this.f9131a = as1Var;
        this.f9132b = ms1Var;
        this.f9133c = t8Var;
        this.f9134d = g8Var;
        this.f9135e = z7Var;
    }

    public final Map<String, Object> a() {
        long j3;
        Map<String, Object> b10 = b();
        ms1 ms1Var = this.f9132b;
        i<k6> iVar = ms1Var.f11292f;
        Objects.requireNonNull(ms1Var.f11290d);
        k6 k6Var = js1.f10182a;
        if (iVar.n()) {
            k6Var = iVar.j();
        }
        HashMap hashMap = (HashMap) b10;
        hashMap.put("gai", Boolean.valueOf(this.f9131a.c()));
        hashMap.put("did", k6Var.n0());
        hashMap.put("dst", Integer.valueOf(k6Var.c0() - 1));
        hashMap.put("doo", Boolean.valueOf(k6Var.Z()));
        z7 z7Var = this.f9135e;
        if (z7Var != null) {
            synchronized (z7.class) {
                NetworkCapabilities networkCapabilities = z7Var.f16023a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        j3 = 2;
                    } else if (z7Var.f16023a.hasTransport(1)) {
                        j3 = 1;
                    } else if (z7Var.f16023a.hasTransport(0)) {
                        j3 = 0;
                    }
                }
                j3 = -1;
            }
            hashMap.put("nt", Long.valueOf(j3));
        }
        return b10;
    }

    public final Map<String, Object> b() {
        HashMap hashMap = new HashMap();
        ms1 ms1Var = this.f9132b;
        i<k6> iVar = ms1Var.f11293g;
        Objects.requireNonNull(ms1Var.f11291e);
        k6 k6Var = ks1.f10559a;
        if (iVar.n()) {
            k6Var = iVar.j();
        }
        hashMap.put("v", this.f9131a.a());
        hashMap.put("gms", Boolean.valueOf(this.f9131a.b()));
        hashMap.put("int", k6Var.o0());
        hashMap.put("up", Boolean.valueOf(this.f9134d.f8765a));
        hashMap.put("t", new Throwable());
        return hashMap;
    }
}
