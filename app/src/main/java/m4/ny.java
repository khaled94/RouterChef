package m4;

import a6.f;
import android.os.Bundle;
import android.os.Parcel;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l3.s;
import n3.g1;
import n3.o0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ny implements xy1 {

    /* renamed from: a */
    public final /* synthetic */ int f11954a;

    /* renamed from: b */
    public final /* synthetic */ Object f11955b;

    public /* synthetic */ ny(Object obj, int i10) {
        this.f11954a = i10;
        this.f11955b = obj;
    }

    @Override // m4.xy1
    public final tz1 h(Object obj) {
        wc2 wc2Var;
        tz1 o10;
        switch (this.f11954a) {
            case 0:
                ly lyVar = (ly) obj;
                w90 w90Var = new w90();
                my myVar = new my(w90Var);
                Parcel w10 = lyVar.w();
                ca.b(w10, (gy) this.f11955b);
                ca.d(w10, myVar);
                try {
                    lyVar.f6085s.transact(2, w10, null, 1);
                    return w90Var;
                } finally {
                    w10.recycle();
                }
            case 1:
                d70 d70Var = (d70) this.f11955b;
                Map map = (Map) obj;
                Objects.requireNonNull(d70Var);
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (optJSONArray != null) {
                                synchronized (d70Var.f7240h) {
                                    int length = optJSONArray.length();
                                    synchronized (d70Var.f7240h) {
                                        wc2Var = d70Var.f7234b.get(str);
                                    }
                                    if (wc2Var == null) {
                                        String valueOf = String.valueOf(str);
                                        f.k(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                                    } else {
                                        for (int i10 = 0; i10 < length; i10++) {
                                            String string = optJSONArray.getJSONObject(i10).getString("threat_type");
                                            if (wc2Var.f9884u) {
                                                wc2Var.m();
                                                wc2Var.f9884u = false;
                                            }
                                            xc2.C((xc2) wc2Var.f9883t, string);
                                        }
                                        d70Var.f7238f |= length > 0;
                                    }
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        if (tt.f14163a.e().booleanValue()) {
                            g1.f("Failed to get SafeBrowsing metadata", e10);
                        }
                        return new nz1(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (d70Var.f7238f) {
                    synchronized (d70Var.f7240h) {
                        fc2 fc2Var = d70Var.f7233a;
                        if (fc2Var.f9884u) {
                            fc2Var.m();
                            fc2Var.f9884u = false;
                        }
                        ad2.K((ad2) fc2Var.f9883t, 10);
                    }
                }
                boolean z10 = d70Var.f7238f;
                if ((!z10 || !d70Var.f7239g.y) && ((!d70Var.f7243k || !d70Var.f7239g.f7735x) && (z10 || !d70Var.f7239g.f7733v))) {
                    return mz1.m(null);
                }
                synchronized (d70Var.f7240h) {
                    for (wc2 wc2Var2 : d70Var.f7234b.values()) {
                        fc2 fc2Var2 = d70Var.f7233a;
                        xc2 k10 = wc2Var2.k();
                        if (fc2Var2.f9884u) {
                            fc2Var2.m();
                            fc2Var2.f9884u = false;
                        }
                        ad2.D((ad2) fc2Var2.f9883t, k10);
                    }
                    fc2 fc2Var3 = d70Var.f7233a;
                    List<String> list = d70Var.f7235c;
                    if (fc2Var3.f9884u) {
                        fc2Var3.m();
                        fc2Var3.f9884u = false;
                    }
                    ad2.I((ad2) fc2Var3.f9883t, list);
                    fc2 fc2Var4 = d70Var.f7233a;
                    List<String> list2 = d70Var.f7236d;
                    if (fc2Var4.f9884u) {
                        fc2Var4.m();
                        fc2Var4.f9884u = false;
                    }
                    ad2.J((ad2) fc2Var4.f9883t, list2);
                    if (tt.f14163a.e().booleanValue()) {
                        String y = ((ad2) d70Var.f7233a.f9883t).y();
                        String x10 = ((ad2) d70Var.f7233a.f9883t).x();
                        StringBuilder sb = new StringBuilder(String.valueOf(y).length() + 53 + String.valueOf(x10).length());
                        sb.append("Sending SB report\n  url: ");
                        sb.append(y);
                        sb.append("\n  clickUrl: ");
                        sb.append(x10);
                        sb.append("\n  resources: \n");
                        StringBuilder sb2 = new StringBuilder(sb.toString());
                        for (xc2 xc2Var : Collections.unmodifiableList(((ad2) d70Var.f7233a.f9883t).z())) {
                            sb2.append("    [");
                            sb2.append(xc2Var.v());
                            sb2.append("] ");
                            sb2.append(xc2Var.y());
                        }
                        f.k(sb2.toString());
                    }
                    tz1<String> a10 = new o0(d70Var.f7237e).a(1, d70Var.f7239g.f7731t, null, d70Var.f7233a.k().b());
                    if (tt.f14163a.e().booleanValue()) {
                        ((w90) a10).b(c70.f6730s, u90.f14294a);
                    }
                    o10 = mz1.o(a10, a70.f6056a, u90.f14299f);
                }
                return o10;
            case 2:
                ((kz1) this.f11955b).f((Throwable) obj);
                return mz1.m(null);
            default:
                return ((hh1) this.f11955b).a(s.B.f5789c.E((Bundle) obj));
        }
    }

    public ny(gy gyVar) {
        this.f11954a = 0;
        this.f11955b = gyVar;
    }
}
