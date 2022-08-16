package m4;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import k4.a;
import k4.b;
import l3.s;
import n3.g1;
import n3.s0;
import n3.s1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class nw0 implements jv0 {

    /* renamed from: a */
    public final t10 f11922a;

    /* renamed from: b */
    public final cp0 f11923b;

    /* renamed from: c */
    public final ro0 f11924c;

    /* renamed from: d */
    public final hs0 f11925d;

    /* renamed from: e */
    public final Context f11926e;

    /* renamed from: f */
    public final cm1 f11927f;

    /* renamed from: g */
    public final o90 f11928g;

    /* renamed from: h */
    public final om1 f11929h;

    /* renamed from: i */
    public boolean f11930i = false;

    /* renamed from: j */
    public boolean f11931j = false;

    /* renamed from: k */
    public boolean f11932k = true;

    /* renamed from: l */
    public final p10 f11933l;

    /* renamed from: m */
    public final q10 f11934m;

    public nw0(p10 p10Var, q10 q10Var, t10 t10Var, cp0 cp0Var, ro0 ro0Var, hs0 hs0Var, Context context, cm1 cm1Var, o90 o90Var, om1 om1Var) {
        this.f11933l = p10Var;
        this.f11934m = q10Var;
        this.f11922a = t10Var;
        this.f11923b = cp0Var;
        this.f11924c = ro0Var;
        this.f11925d = hs0Var;
        this.f11926e = context;
        this.f11927f = cm1Var;
        this.f11928g = o90Var;
        this.f11929h = om1Var;
    }

    public static final HashMap<String, View> x(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    hashMap.put(entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // m4.jv0
    public final boolean F() {
        return this.f11927f.I;
    }

    @Override // m4.jv0
    public final boolean a(Bundle bundle) {
        return false;
    }

    @Override // m4.jv0
    public final void b(wp wpVar) {
        g1.j("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // m4.jv0
    public final void c(Bundle bundle) {
    }

    @Override // m4.jv0
    public final void d() {
        throw null;
    }

    @Override // m4.jv0
    public final void e() {
    }

    @Override // m4.jv0
    public final void f() {
    }

    @Override // m4.jv0
    public final JSONObject g(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    @Override // m4.jv0
    public final void h(yp ypVar) {
        g1.j("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // m4.jv0
    public final void i(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.f11930i) {
                this.f11930i = s.B.f5799m.i(this.f11926e, this.f11928g.f12051s, this.f11927f.D.toString(), this.f11929h.f12205f);
            }
            if (!this.f11932k) {
                return;
            }
            t10 t10Var = this.f11922a;
            if (t10Var != null && !t10Var.y()) {
                this.f11922a.L();
                this.f11923b.zza();
                return;
            }
            p10 p10Var = this.f11933l;
            boolean z10 = true;
            if (p10Var != null) {
                Parcel c02 = p10Var.c0(13, p10Var.w());
                ClassLoader classLoader = ca.f6747a;
                boolean z11 = c02.readInt() != 0;
                c02.recycle();
                if (!z11) {
                    p10 p10Var2 = this.f11933l;
                    p10Var2.e0(10, p10Var2.w());
                    this.f11923b.zza();
                    return;
                }
            }
            q10 q10Var = this.f11934m;
            if (q10Var == null) {
                return;
            }
            Parcel c03 = q10Var.c0(11, q10Var.w());
            ClassLoader classLoader2 = ca.f6747a;
            if (c03.readInt() == 0) {
                z10 = false;
            }
            c03.recycle();
            if (z10) {
                return;
            }
            q10 q10Var2 = this.f11934m;
            q10Var2.e0(8, q10Var2.w());
            this.f11923b.zza();
        } catch (RemoteException e10) {
            g1.k("Failed to call recordImpression", e10);
        }
    }

    @Override // m4.jv0
    public final void j(Bundle bundle) {
    }

    @Override // m4.jv0
    public final void k() {
    }

    @Override // m4.jv0
    public final void l(String str) {
    }

    @Override // m4.jv0
    public final void m(View view) {
        try {
            b bVar = new b(view);
            t10 t10Var = this.f11922a;
            if (t10Var != null) {
                t10Var.w0(bVar);
                return;
            }
            p10 p10Var = this.f11933l;
            if (p10Var != null) {
                Parcel w10 = p10Var.w();
                ca.d(w10, bVar);
                p10Var.e0(16, w10);
                return;
            }
            q10 q10Var = this.f11934m;
            if (q10Var == null) {
                return;
            }
            Parcel w11 = q10Var.w();
            ca.d(w11, bVar);
            q10Var.e0(14, w11);
        } catch (RemoteException e10) {
            g1.k("Failed to call untrackView", e10);
        }
    }

    @Override // m4.jv0
    public final void n(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        if (!this.f11931j || !this.f11927f.I) {
            w(view);
        }
    }

    @Override // m4.jv0
    public final void o(View view) {
    }

    @Override // m4.jv0
    public final void p(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        String str;
        if (!this.f11931j) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else if (this.f11927f.I) {
            w(view);
            return;
        } else {
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        }
        g1.j(str);
    }

    @Override // m4.jv0
    public final void q(MotionEvent motionEvent, View view) {
    }

    @Override // m4.jv0
    public final void r(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        a j3;
        try {
            b bVar = new b(view);
            JSONObject jSONObject = this.f11927f.f7047h0;
            boolean z10 = true;
            if (((Boolean) jo.f10145d.f10148c.a(es.Z0)).booleanValue() && jSONObject.length() != 0) {
                Map<String, WeakReference<View>> hashMap = map == null ? new HashMap<>() : map;
                Map<String, WeakReference<View>> hashMap2 = map2 == null ? new HashMap<>() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) jo.f10145d.f10148c.a(es.f8051a1)).booleanValue() && next.equals("3010")) {
                                t10 t10Var = this.f11922a;
                                Object obj2 = null;
                                if (t10Var != null) {
                                    try {
                                        j3 = t10Var.j();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    p10 p10Var = this.f11933l;
                                    if (p10Var != null) {
                                        j3 = p10Var.J3();
                                    } else {
                                        q10 q10Var = this.f11934m;
                                        j3 = q10Var != null ? q10Var.x3() : null;
                                    }
                                }
                                if (j3 != null) {
                                    obj2 = b.e0(j3);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                s0.b(optJSONArray, arrayList);
                                s1 s1Var = s.B.f5789c;
                                ClassLoader classLoader = this.f11926e.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z10 = false;
                        break;
                    }
                }
            }
            this.f11932k = z10;
            HashMap<String, View> x10 = x(map);
            HashMap<String, View> x11 = x(map2);
            t10 t10Var2 = this.f11922a;
            if (t10Var2 != null) {
                t10Var2.P0(bVar, new b(x10), new b(x11));
                return;
            }
            p10 p10Var2 = this.f11933l;
            if (p10Var2 != null) {
                b bVar2 = new b(x10);
                b bVar3 = new b(x11);
                Parcel w10 = p10Var2.w();
                ca.d(w10, bVar);
                ca.d(w10, bVar2);
                ca.d(w10, bVar3);
                p10Var2.e0(22, w10);
                p10 p10Var3 = this.f11933l;
                Parcel w11 = p10Var3.w();
                ca.d(w11, bVar);
                p10Var3.e0(12, w11);
                return;
            }
            q10 q10Var2 = this.f11934m;
            if (q10Var2 == null) {
                return;
            }
            b bVar4 = new b(x10);
            b bVar5 = new b(x11);
            Parcel w12 = q10Var2.w();
            ca.d(w12, bVar);
            ca.d(w12, bVar4);
            ca.d(w12, bVar5);
            q10Var2.e0(22, w12);
            q10 q10Var3 = this.f11934m;
            Parcel w13 = q10Var3.w();
            ca.d(w13, bVar);
            q10Var3.e0(10, w13);
        } catch (RemoteException e10) {
            g1.k("Failed to call trackView", e10);
        }
    }

    @Override // m4.jv0
    public final void s() {
    }

    @Override // m4.jv0
    public final void t(bw bwVar) {
    }

    @Override // m4.jv0
    public final JSONObject u(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    @Override // m4.jv0
    public final void v() {
        this.f11931j = true;
    }

    public final void w(View view) {
        try {
            t10 t10Var = this.f11922a;
            if (t10Var != null && !t10Var.C()) {
                this.f11922a.N2(new b(view));
                this.f11924c.N();
                if (!((Boolean) jo.f10145d.f10148c.a(es.C6)).booleanValue()) {
                    return;
                }
                this.f11925d.B0();
                return;
            }
            p10 p10Var = this.f11933l;
            boolean z10 = true;
            if (p10Var != null) {
                Parcel c02 = p10Var.c0(14, p10Var.w());
                ClassLoader classLoader = ca.f6747a;
                boolean z11 = c02.readInt() != 0;
                c02.recycle();
                if (!z11) {
                    p10 p10Var2 = this.f11933l;
                    b bVar = new b(view);
                    Parcel w10 = p10Var2.w();
                    ca.d(w10, bVar);
                    p10Var2.e0(11, w10);
                    this.f11924c.N();
                    if (!((Boolean) jo.f10145d.f10148c.a(es.C6)).booleanValue()) {
                        return;
                    }
                    this.f11925d.B0();
                    return;
                }
            }
            q10 q10Var = this.f11934m;
            if (q10Var == null) {
                return;
            }
            Parcel c03 = q10Var.c0(12, q10Var.w());
            ClassLoader classLoader2 = ca.f6747a;
            if (c03.readInt() == 0) {
                z10 = false;
            }
            c03.recycle();
            if (z10) {
                return;
            }
            q10 q10Var2 = this.f11934m;
            b bVar2 = new b(view);
            Parcel w11 = q10Var2.w();
            ca.d(w11, bVar2);
            q10Var2.e0(9, w11);
            this.f11924c.N();
            if (!((Boolean) jo.f10145d.f10148c.a(es.C6)).booleanValue()) {
                return;
            }
            this.f11925d.B0();
        } catch (RemoteException e10) {
            g1.k("Failed to call handleClick", e10);
        }
    }
}
