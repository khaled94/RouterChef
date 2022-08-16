package u1;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import d.b;
import i0.e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import k9.u;
import m4.ac1;
import m4.bu1;
import m4.cc1;
import m4.cl;
import m4.cu1;
import m4.dd;
import m4.es;
import m4.gw1;
import m4.gx1;
import m4.gz1;
import m4.ig1;
import m4.jo;
import m4.k7;
import m4.kk;
import m4.kq2;
import m4.kw1;
import m4.lc1;
import m4.lg1;
import m4.lx1;
import m4.mz1;
import m4.nq0;
import m4.pu1;
import m4.qn;
import m4.t;
import m4.tz1;
import m4.vj;
import m4.wy1;
import m4.yr;
import m4.z2;
import m4.zb1;
import n3.g1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements nq0, vj, wy1, q6.a {

    /* renamed from: s */
    public final Object f18993s;

    public a() {
        Handler handler;
        Handler handler2;
        Throwable e10;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler2 = e.a(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e11) {
                e10 = e11;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e10);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f18993s = handler2;
            } catch (InstantiationException e12) {
                e10 = e12;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e10);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f18993s = handler2;
            } catch (NoSuchMethodException e13) {
                e10 = e13;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e10);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f18993s = handler2;
            } catch (InvocationTargetException e14) {
                Throwable cause = e14.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(cause);
                }
                throw ((Error) cause);
            }
            handler2 = handler;
        }
        this.f18993s = handler2;
    }

    @Override // q6.a
    public final void a(Bundle bundle) {
        ((j6.a) this.f18993s).c("clx", "_ae", bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    public final List b(z2 z2Var) {
        String str;
        int i10;
        dd ddVar = new dd(z2Var.f15979b);
        ArrayList arrayList = (List) this.f18993s;
        while (ddVar.zza() > 0) {
            int q10 = ddVar.q();
            int q11 = ddVar.f7309b + ddVar.q();
            if (q10 == 134) {
                arrayList = new ArrayList();
                int q12 = ddVar.q() & 31;
                for (int i11 = 0; i11 < q12; i11++) {
                    String B = ddVar.B(3, bu1.f6617b);
                    int q13 = ddVar.q();
                    int i12 = q13 & 128;
                    if (i12 != 0) {
                        i10 = q13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte q14 = (byte) ddVar.q();
                    ddVar.i(1);
                    List<byte[]> singletonList = i12 != 0 ? Collections.singletonList((q14 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    kq2 kq2Var = new kq2();
                    kq2Var.f10542j = str;
                    kq2Var.f10535c = B;
                    kq2Var.B = i10;
                    kq2Var.f10544l = singletonList;
                    arrayList.add(new t(kq2Var));
                }
            }
            ddVar.h(q11);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // m4.vj
    public final void c(cl clVar) {
        clVar.p((kk) this.f18993s);
    }

    @Override // m4.nq0
    /* renamed from: h */
    public final void mo21h(Object obj) {
        b.h(((lc1) obj).f10716u, new k7((qn) this.f18993s, 2));
    }

    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<m4.ac1>>>] */
    @Override // m4.wy1
    public final tz1 zza() {
        kw1<Object, Object> kw1Var;
        kw1 c10;
        Map map;
        final lg1 lg1Var = (lg1) this.f18993s;
        yr<Boolean> yrVar = es.F6;
        jo joVar = jo.f10145d;
        String lowerCase = ((Boolean) joVar.f10148c.a(yrVar)).booleanValue() ? lg1Var.f10831e.f12205f.toLowerCase(Locale.ROOT) : lg1Var.f10831e.f12205f;
        zb1 zb1Var = lg1Var.f10829c;
        String str = lg1Var.f10834h;
        synchronized (zb1Var) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(lowerCase) && (map = (Map) zb1Var.f16084c.get(str)) != null) {
                List<ac1> list = (List) map.get(lowerCase);
                if (list == null) {
                    String e10 = u.e(zb1Var.f16086e, lowerCase, str);
                    if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                        e10 = e10.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(e10);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (ac1 ac1Var : list) {
                        String str2 = ac1Var.f6108a;
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        ((List) hashMap.get(str2)).add(ac1Var.f6109b);
                    }
                    kw1Var = kw1.c(hashMap);
                }
            }
            kw1Var = lx1.y;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Object, Object>> it = kw1Var.entrySet().iterator();
        while (true) {
            final Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Object, Object> next = it.next();
            final String str3 = (String) next.getKey();
            final List list2 = (List) next.getValue();
            Bundle bundle2 = lg1Var.f10831e.f12203d.E;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str3);
            }
            arrayList.add(mz1.i((gz1) mz1.q(gz1.r(mz1.n(new wy1() { // from class: m4.jg1
                @Override // m4.wy1
                public final tz1 zza() {
                    return lg1.this.b(str3, list2, bundle, true, true);
                }
            }, lg1Var.f10827a)), ((Long) jo.f10145d.f10148c.a(es.V0)).longValue(), TimeUnit.MILLISECONDS, lg1Var.f10828b), Throwable.class, new cu1() { // from class: m4.gg1
                @Override // m4.cu1
                public final Object a(Object obj) {
                    Throwable th = (Throwable) obj;
                    String valueOf = String.valueOf(str3);
                    g1.g(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, lg1Var.f10827a));
        }
        zb1 zb1Var2 = lg1Var.f10829c;
        synchronized (zb1Var2) {
            c10 = kw1.c(zb1Var2.f16083b);
        }
        for (Map.Entry entry : c10.entrySet()) {
            cc1 cc1Var = (cc1) entry.getValue();
            final String str4 = cc1Var.f6777a;
            Bundle bundle3 = lg1Var.f10831e.f12203d.E;
            arrayList.add(mz1.i((gz1) mz1.q(gz1.r(mz1.n(new ig1(lg1Var, str4, cc1Var, bundle3 != null ? bundle3.getBundle(str4) : null), lg1Var.f10827a)), ((Long) jo.f10145d.f10148c.a(es.V0)).longValue(), TimeUnit.MILLISECONDS, lg1Var.f10828b), Throwable.class, new cu1() { // from class: m4.hg1
                @Override // m4.cu1
                public final Object a(Object obj) {
                    Throwable th = (Throwable) obj;
                    String valueOf = String.valueOf(str4);
                    g1.g(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, lg1Var.f10827a));
        }
        return mz1.e(arrayList).a(new Callable() { // from class: m4.kg1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<tz1> list3 = arrayList;
                JSONArray jSONArray = new JSONArray();
                for (tz1 tz1Var : list3) {
                    if (((JSONObject) tz1Var.get()) != null) {
                        jSONArray.put(tz1Var.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new mg1(jSONArray.toString());
            }
        }, lg1Var.f10827a);
    }

    public a(int i10) {
        pu1 pu1Var = gw1.f9058t;
        this.f18993s = gx1.f9060w;
    }

    public /* synthetic */ a(Object obj) {
        this.f18993s = obj;
    }
}
