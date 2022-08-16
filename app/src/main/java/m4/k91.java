package m4;

import h4.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k91 implements e91<av0> {

    /* renamed from: a */
    public final cu0 f10305a;

    /* renamed from: b */
    public final uz1 f10306b;

    /* renamed from: c */
    public final bx0 f10307c;

    /* renamed from: d */
    public final zm1<ty0> f10308d;

    /* renamed from: e */
    public final az0 f10309e;

    public k91(cu0 cu0Var, uz1 uz1Var, bx0 bx0Var, zm1<ty0> zm1Var, az0 az0Var) {
        this.f10305a = cu0Var;
        this.f10306b = uz1Var;
        this.f10307c = bx0Var;
        this.f10308d = zm1Var;
        this.f10309e = az0Var;
    }

    @Override // m4.e71
    public final boolean a(km1 km1Var, cm1 cm1Var) {
        gm1 gm1Var = cm1Var.f7061t;
        return (gm1Var == null || gm1Var.f8968c == null) ? false : true;
    }

    @Override // m4.e71
    public final tz1<List<tz1<av0>>> b(final km1 km1Var, final cm1 cm1Var) {
        return mz1.p(mz1.p(this.f10308d.a(), new xy1() { // from class: m4.h91
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                final k91 k91Var = k91.this;
                cm1 cm1Var2 = cm1Var;
                final ty0 ty0Var = (ty0) obj;
                Objects.requireNonNull(k91Var);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isNonagon", true);
                if (((Boolean) jo.f10145d.f10148c.a(es.F5)).booleanValue() && f.c()) {
                    jSONObject.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("response", cm1Var2.f7061t.f8968c);
                jSONObject2.put("sdk_params", jSONObject);
                return mz1.p(ty0Var.a("google.afma.nativeAds.preProcessJson", jSONObject2), new xy1() { // from class: m4.g91
                    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Deque<m4.tz1<T>>, java.util.concurrent.LinkedBlockingDeque] */
                    @Override // m4.xy1
                    public final tz1 h(Object obj2) {
                        k91 k91Var2 = k91.this;
                        ty0 ty0Var2 = ty0Var;
                        JSONObject jSONObject3 = (JSONObject) obj2;
                        zm1<ty0> zm1Var = k91Var2.f10308d;
                        tz1 m10 = mz1.m(ty0Var2);
                        synchronized (zm1Var) {
                            zm1Var.f16280a.addFirst(m10);
                        }
                        if (jSONObject3.optBoolean("success")) {
                            return mz1.m(jSONObject3.getJSONObject("json").getJSONArray("ads"));
                        }
                        throw new h00("process json failed");
                    }
                }, k91Var.f10306b);
            }
        }, this.f10306b), new xy1() { // from class: m4.i91
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                k91 k91Var = k91.this;
                km1 km1Var2 = km1Var;
                cm1 cm1Var2 = cm1Var;
                JSONArray jSONArray = (JSONArray) obj;
                Objects.requireNonNull(k91Var);
                if (jSONArray.length() == 0) {
                    return new nz1(new c31(3));
                }
                if (((om1) km1Var2.f10488a.f8363t).f12210k <= 1) {
                    return mz1.o(k91Var.c(km1Var2, cm1Var2, jSONArray.getJSONObject(0)), f91.f8373a, k91Var.f10306b);
                }
                int length = jSONArray.length();
                k91Var.f10308d.b(Math.min(length, ((om1) km1Var2.f10488a.f8363t).f12210k));
                ArrayList arrayList = new ArrayList(((om1) km1Var2.f10488a.f8363t).f12210k);
                for (int i10 = 0; i10 < ((om1) km1Var2.f10488a.f8363t).f12210k; i10++) {
                    if (i10 < length) {
                        arrayList.add(k91Var.c(km1Var2, cm1Var2, jSONArray.getJSONObject(i10)));
                    } else {
                        arrayList.add(new nz1(new c31(3)));
                    }
                }
                return mz1.m(arrayList);
            }
        }, this.f10306b);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m4.tz1<m4.av0> c(final m4.km1 r25, final m4.cm1 r26, final org.json.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.k91.c(m4.km1, m4.cm1, org.json.JSONObject):m4.tz1");
    }
}
