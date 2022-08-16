package m4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import f3.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l3.a;
import l3.b;
import n3.n0;
import n3.o0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mx0 {

    /* renamed from: a */
    public final Context f11332a;

    /* renamed from: b */
    public final xw0 f11333b;

    /* renamed from: c */
    public final w7 f11334c;

    /* renamed from: d */
    public final o90 f11335d;

    /* renamed from: e */
    public final a f11336e;

    /* renamed from: f */
    public final wj f11337f;

    /* renamed from: g */
    public final Executor f11338g;

    /* renamed from: h */
    public final lu f11339h;

    /* renamed from: i */
    public final by0 f11340i;

    /* renamed from: j */
    public final yz0 f11341j;

    /* renamed from: k */
    public final ScheduledExecutorService f11342k;

    /* renamed from: l */
    public final az0 f11343l;

    /* renamed from: m */
    public final f11 f11344m;

    /* renamed from: n */
    public final ep1 f11345n;

    /* renamed from: o */
    public final zp1 f11346o;
    public final v61 p;

    public mx0(Context context, xw0 xw0Var, w7 w7Var, o90 o90Var, a aVar, wj wjVar, Executor executor, om1 om1Var, by0 by0Var, yz0 yz0Var, ScheduledExecutorService scheduledExecutorService, f11 f11Var, ep1 ep1Var, zp1 zp1Var, v61 v61Var, az0 az0Var) {
        this.f11332a = context;
        this.f11333b = xw0Var;
        this.f11334c = w7Var;
        this.f11335d = o90Var;
        this.f11336e = aVar;
        this.f11337f = wjVar;
        this.f11338g = executor;
        this.f11339h = om1Var.f12208i;
        this.f11340i = by0Var;
        this.f11341j = yz0Var;
        this.f11342k = scheduledExecutorService;
        this.f11344m = f11Var;
        this.f11345n = ep1Var;
        this.f11346o = zp1Var;
        this.p = v61Var;
        this.f11343l = az0Var;
    }

    public static tz1 c(boolean z10, final tz1 tz1Var) {
        return z10 ? mz1.p(tz1Var, new xy1() { // from class: m4.ix0
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                return obj != null ? tz1.this : new nz1(new ea1(1, "Retrieve required value in native ad response failed."));
            }
        }, u90.f14299f) : mz1.j(tz1Var, Exception.class, new dx0(), u90.f14299f);
    }

    public static Integer g(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final ar h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            return new ar(optString, optString2);
        }
        return null;
    }

    public final tz1<ju> a(JSONObject jSONObject, String str) {
        return d(jSONObject.optJSONObject(str), this.f11339h.f10994t);
    }

    public final on b(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return on.s();
            }
            i10 = 0;
        }
        return new on(this.f11332a, new e(i10, i11));
    }

    public final tz1<ju> d(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return mz1.m(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return mz1.m(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z10) {
            return mz1.m(new ju(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        xw0 xw0Var = this.f11333b;
        Objects.requireNonNull(xw0Var.f15483a);
        w90 w90Var = new w90();
        o0.f16541a.a(new n0(optString, w90Var));
        return c(jSONObject.optBoolean("require"), mz1.o(mz1.o(w90Var, new ww0(xw0Var, optDouble, optBoolean), xw0Var.f15485c), new cu1() { // from class: m4.fx0
            @Override // m4.cu1
            public final Object a(Object obj) {
                String str = optString;
                return new ju(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), optDouble, optInt, optInt2);
            }
        }, this.f11338g));
    }

    public final tz1<List<ju>> e(JSONArray jSONArray, boolean z10, boolean z11) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return mz1.m(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z11 ? jSONArray.length() : 1;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(d(jSONArray.optJSONObject(i10), z10));
        }
        pu1 pu1Var = gw1.f9058t;
        return mz1.o(new yy1(gw1.q(arrayList)), gx0.f9059a, this.f11338g);
    }

    public final tz1<vd0> f(JSONObject jSONObject, final cm1 cm1Var, final em1 em1Var) {
        final String optString = jSONObject.optString("base_url");
        final String optString2 = jSONObject.optString("html");
        final on b10 = b(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
        final by0 by0Var = this.f11340i;
        Objects.requireNonNull(by0Var);
        final tz1 p = mz1.p(mz1.m(null), new xy1() { // from class: m4.wx0
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                final by0 by0Var2 = by0.this;
                on onVar = b10;
                cm1 cm1Var2 = cm1Var;
                em1 em1Var2 = em1Var;
                String str = optString;
                String str2 = optString2;
                final vd0 a10 = by0Var2.f6647c.a(onVar, cm1Var2, em1Var2);
                final v90 v90Var = new v90(a10);
                if (by0Var2.f6645a.f12201b != null) {
                    by0Var2.a(a10);
                    ((he0) a10).J0(new cf0(5, 0, 0));
                } else {
                    xy0 xy0Var = by0Var2.f6648d.f6300a;
                    ((ce0) ((he0) a10).q0()).c(xy0Var, xy0Var, xy0Var, xy0Var, xy0Var, false, null, new b(by0Var2.f6649e, null), null, null, by0Var2.f6653i, by0Var2.f6652h, by0Var2.f6650f, by0Var2.f6651g, null, xy0Var);
                    by0.b(a10);
                }
                he0 he0Var = (he0) a10;
                ((ce0) he0Var.q0()).y = new ye0() { // from class: m4.ux0
                    @Override // m4.ye0
                    public final void J(boolean z10) {
                        by0 by0Var3 = by0.this;
                        vd0 vd0Var = a10;
                        v90 v90Var2 = v90Var;
                        Objects.requireNonNull(by0Var3);
                        if (!z10) {
                            v90Var2.c(new ea1(1, "Html video Web View failed to load."));
                            return;
                        }
                        if (by0Var3.f6645a.f12200a != null && vd0Var.p() != null) {
                            vd0Var.p().P3(by0Var3.f6645a.f12200a);
                        }
                        v90Var2.d();
                    }
                };
                he0Var.C0(str, str2);
                return v90Var;
            }
        }, by0Var.f6646b);
        return mz1.p(p, new xy1() { // from class: m4.lx0
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                tz1 tz1Var = tz1.this;
                vd0 vd0Var = (vd0) obj;
                if (vd0Var == null || vd0Var.p() == null) {
                    throw new ea1(1, "Retrieve video view in html5 ad response failed.");
                }
                return tz1Var;
            }
        }, u90.f14299f);
    }
}
