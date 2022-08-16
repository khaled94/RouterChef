package m4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l3.s;
import l4.b;

/* loaded from: classes.dex */
public final class dp1 {

    /* renamed from: a */
    public final HashMap<String, String> f7586a;

    /* renamed from: b */
    public final ip1 f7587b = new ip1(s.B.f5796j);

    public dp1() {
        HashMap<String, String> hashMap = new HashMap<>();
        this.f7586a = hashMap;
        hashMap.put("new_csi", "1");
    }

    public static dp1 b(String str) {
        dp1 dp1Var = new dp1();
        dp1Var.f7586a.put("action", str);
        return dp1Var;
    }

    public final dp1 a(String str, String str2) {
        this.f7586a.put(str, str2);
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.String, java.lang.Long>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map<java.lang.String, java.lang.Long>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<java.lang.String, java.lang.Long>, java.util.HashMap] */
    public final dp1 c(String str) {
        ip1 ip1Var = this.f7587b;
        if (ip1Var.f9720c.containsKey(str)) {
            long b10 = ip1Var.f9718a.b();
            long longValue = ((Long) ip1Var.f9720c.remove(str)).longValue();
            StringBuilder sb = new StringBuilder(20);
            sb.append(b10 - longValue);
            ip1Var.a(str, sb.toString());
        } else {
            ip1Var.f9720c.put(str, Long.valueOf(ip1Var.f9718a.b()));
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.String, java.lang.Long>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<java.lang.String, java.lang.Long>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Map<java.lang.String, java.lang.Long>, java.util.HashMap] */
    public final dp1 d(String str, String str2) {
        ip1 ip1Var = this.f7587b;
        if (ip1Var.f9720c.containsKey(str)) {
            long b10 = ip1Var.f9718a.b();
            long longValue = ((Long) ip1Var.f9720c.remove(str)).longValue();
            StringBuilder sb = new StringBuilder(str2.length() + 20);
            sb.append(str2);
            sb.append(b10 - longValue);
            ip1Var.a(str, sb.toString());
        } else {
            ip1Var.f9720c.put(str, Long.valueOf(ip1Var.f9718a.b()));
        }
        return this;
    }

    public final dp1 e(em1 em1Var) {
        if (!TextUtils.isEmpty(em1Var.f8004b)) {
            this.f7586a.put("gqi", em1Var.f8004b);
        }
        return this;
    }

    public final dp1 f(km1 km1Var, d90 d90Var) {
        HashMap<String, String> hashMap;
        String str;
        jm1 jm1Var = km1Var.f10489b;
        e(jm1Var.f10126b);
        if (!jm1Var.f10125a.isEmpty()) {
            switch (jm1Var.f10125a.get(0).f7034b) {
                case 1:
                    hashMap = this.f7586a;
                    str = "banner";
                    hashMap.put("ad_format", str);
                    break;
                case 2:
                    hashMap = this.f7586a;
                    str = "interstitial";
                    hashMap.put("ad_format", str);
                    break;
                case 3:
                    hashMap = this.f7586a;
                    str = "native_express";
                    hashMap.put("ad_format", str);
                    break;
                case 4:
                    hashMap = this.f7586a;
                    str = "native_advanced";
                    hashMap.put("ad_format", str);
                    break;
                case 5:
                    hashMap = this.f7586a;
                    str = "rewarded";
                    hashMap.put("ad_format", str);
                    break;
                case 6:
                    this.f7586a.put("ad_format", "app_open_ad");
                    if (d90Var != null) {
                        this.f7586a.put("as", true != d90Var.f7270g ? "0" : "1");
                        break;
                    }
                    break;
                default:
                    hashMap = this.f7586a;
                    str = "unknown";
                    hashMap.put("ad_format", str);
                    break;
            }
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.N4)).booleanValue()) {
            boolean u10 = b.u(km1Var);
            this.f7586a.put("scar", String.valueOf(u10));
            if (u10) {
                String q10 = b.q(km1Var);
                if (!TextUtils.isEmpty(q10)) {
                    this.f7586a.put("ragent", q10);
                }
                String m10 = b.m(km1Var);
                if (!TextUtils.isEmpty(m10)) {
                    this.f7586a.put("rtype", m10);
                }
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map<java.lang.String, java.util.List<java.lang.String>>, java.util.HashMap] */
    public final Map<String, String> g() {
        HashMap hashMap = new HashMap(this.f7586a);
        ip1 ip1Var = this.f7587b;
        Objects.requireNonNull(ip1Var);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ip1Var.f9719b.entrySet()) {
            int i10 = 0;
            if (((List) entry.getValue()).size() > 1) {
                for (String str : (List) entry.getValue()) {
                    String str2 = (String) entry.getKey();
                    i10++;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                    sb.append(str2);
                    sb.append(".");
                    sb.append(i10);
                    arrayList.add(new hp1(sb.toString(), str));
                }
            } else {
                arrayList.add(new hp1((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hp1 hp1Var = (hp1) it.next();
            hashMap.put(hp1Var.f9406a, hp1Var.f9407b);
        }
        return hashMap;
    }
}
