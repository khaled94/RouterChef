package m4;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class kx {

    /* renamed from: a */
    public static final lx<vd0> f10595a = new cx();

    /* renamed from: b */
    public static final lx<vd0> f10596b = new dx();

    /* renamed from: c */
    public static final lx<Object> f10597c = new ex(0);

    /* renamed from: d */
    public static final lx<vd0> f10598d = new fx();

    /* renamed from: e */
    public static final lx<vd0> f10599e = new gx();

    /* renamed from: f */
    public static final lx<vd0> f10600f = new hx();

    /* renamed from: g */
    public static final lx<fb0> f10601g = new jc0();

    /* renamed from: h */
    public static final lx<fb0> f10602h = new ow(1);

    /* renamed from: i */
    public static final lx<vd0> f10603i = new ow(0);

    /* renamed from: j */
    public static final zx f10604j = new zx();

    /* renamed from: k */
    public static final lx<vd0> f10605k = new ix();

    /* renamed from: l */
    public static final lx<vd0> f10606l = new jx();

    /* renamed from: m */
    public static final lx<vd0> f10607m = new zw();

    /* renamed from: n */
    public static final lx<vd0> f10608n = new ax();

    /* renamed from: o */
    public static final lx<vd0> f10609o = new bx();

    public static tz1<String> a(vd0 vd0Var, String str) {
        final String str2;
        String f10;
        Uri parse = Uri.parse(str);
        try {
            w7 G = vd0Var.G();
            if (G != null && G.c(parse)) {
                parse = G.a(parse, vd0Var.getContext(), vd0Var.A(), vd0Var.n());
            }
        } catch (x7 unused) {
            g1.j(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        Context context = vd0Var.getContext();
        s sVar = s.B;
        if (sVar.f5809x.l(context) && (f10 = sVar.f5809x.f(context)) != null) {
            yr<String> yrVar = es.W;
            jo joVar = jo.f10145d;
            String str3 = (String) joVar.f10148c.a(yrVar);
            String uri = parse.toString();
            if (((Boolean) joVar.f10148c.a(es.V)).booleanValue() && uri.contains(str3)) {
                sVar.f5809x.i(context, f10);
                str2 = y70.c(uri, context).replace(str3, f10);
            } else if (!TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid"))) {
                str2 = uri;
            } else {
                String uri2 = y70.a(y70.c(uri, context), "fbs_aeid", f10).toString();
                sVar.f5809x.i(context, f10);
                str2 = uri2;
            }
        } else {
            str2 = parse.toString();
        }
        long longValue = lt.f10986e.e().longValue();
        if (longValue <= 0 || longValue > 214106404) {
            return mz1.m(str2);
        }
        gz1 r10 = gz1.r(vd0Var.h0());
        yw ywVar = yw.f15913a;
        t90 t90Var = u90.f14299f;
        return mz1.i(mz1.o(mz1.i(r10, Throwable.class, ywVar, t90Var), new ww(str2, 0), t90Var), Throwable.class, new cu1() { // from class: m4.xw
            @Override // m4.cu1
            public final Object a(Object obj) {
                String str4 = str2;
                Throwable th = (Throwable) obj;
                lx<vd0> lxVar = kx.f10595a;
                if (lt.f10989h.e().booleanValue()) {
                    s.B.f5793g.g(th, "prepareClickUrl.attestation2");
                }
                return str4;
            }
        }, t90Var);
    }

    public static void b(Map<String, String> map, js0 js0Var) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.B6)).booleanValue() || !map.containsKey("sc") || !map.get("sc").equals("1") || js0Var == null) {
            return;
        }
        js0Var.B0();
    }
}
