package m4;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import l4.b;

/* loaded from: classes.dex */
public final class a11 implements gq0, mp0, vo0, jq0 {

    /* renamed from: s */
    public final d11 f6009s;

    /* renamed from: t */
    public final j11 f6010t;

    public a11(d11 d11Var, j11 j11Var) {
        this.f6009s = d11Var;
        this.f6010t = j11Var;
    }

    @Override // m4.vo0
    public final void d(cn cnVar) {
        this.f6009s.f7170a.put("action", "ftl");
        this.f6009s.f7170a.put("ftl", String.valueOf(cnVar.f7067s));
        this.f6009s.f7170a.put("ed", cnVar.f7069u);
        this.f6010t.a(this.f6009s.f7170a);
    }

    @Override // m4.jq0
    public final void h() {
        if (((Boolean) jo.f10145d.f10148c.a(es.N4)).booleanValue()) {
            this.f6009s.f7170a.put("scar", "true");
        }
    }

    @Override // m4.mp0
    public final void j() {
        this.f6009s.f7170a.put("action", "loaded");
        this.f6010t.a(this.f6009s.f7170a);
    }

    @Override // m4.gq0
    public final void l0(km1 km1Var) {
        String str;
        ConcurrentHashMap<String, String> concurrentHashMap;
        d11 d11Var = this.f6009s;
        Objects.requireNonNull(d11Var);
        if (km1Var.f10489b.f10125a.size() > 0) {
            switch (km1Var.f10489b.f10125a.get(0).f7034b) {
                case 1:
                    concurrentHashMap = d11Var.f7170a;
                    str = "banner";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 2:
                    concurrentHashMap = d11Var.f7170a;
                    str = "interstitial";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 3:
                    concurrentHashMap = d11Var.f7170a;
                    str = "native_express";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 4:
                    concurrentHashMap = d11Var.f7170a;
                    str = "native_advanced";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 5:
                    concurrentHashMap = d11Var.f7170a;
                    str = "rewarded";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 6:
                    d11Var.f7170a.put("ad_format", "app_open_ad");
                    d11Var.f7170a.put("as", true != d11Var.f7171b.f7270g ? "0" : "1");
                    break;
                default:
                    concurrentHashMap = d11Var.f7170a;
                    str = "unknown";
                    concurrentHashMap.put("ad_format", str);
                    break;
            }
        }
        if (!TextUtils.isEmpty(km1Var.f10489b.f10126b.f8004b)) {
            d11Var.f7170a.put("gqi", km1Var.f10489b.f10126b.f8004b);
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.N4)).booleanValue()) {
            boolean u10 = b.u(km1Var);
            d11Var.f7170a.put("scar", String.valueOf(u10));
            if (!u10) {
                return;
            }
            String q10 = b.q(km1Var);
            if (!TextUtils.isEmpty(q10)) {
                d11Var.f7170a.put("ragent", q10);
            }
            String m10 = b.m(km1Var);
            if (TextUtils.isEmpty(m10)) {
                return;
            }
            d11Var.f7170a.put("rtype", m10);
        }
    }

    @Override // m4.gq0
    public final void v0(o50 o50Var) {
        d11 d11Var = this.f6009s;
        Bundle bundle = o50Var.f11995s;
        Objects.requireNonNull(d11Var);
        if (bundle.containsKey("cnt")) {
            d11Var.f7170a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            d11Var.f7170a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
