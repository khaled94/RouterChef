package h2;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import c1.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k4.b;
import l3.s;
import m4.b00;
import m4.cz1;
import m4.es;
import m4.f21;
import m4.g21;
import m4.gw1;
import m4.i21;
import m4.j21;
import m4.jo;
import m4.l10;
import m4.lh;
import m4.mz1;
import m4.pm1;
import m4.pr0;
import m4.pu1;
import m4.sr0;
import m4.tz1;
import m4.w90;
import m4.ym1;
import m4.yy;
import n2.a;
import n3.g1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.d;
import t4.i;
import y4.h3;
import y4.k6;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f5011s;

    /* renamed from: t */
    public final /* synthetic */ Object f5012t;

    /* renamed from: u */
    public final /* synthetic */ Object f5013u;

    public /* synthetic */ n(Object obj, Object obj2, int i10) {
        this.f5011s = i10;
        this.f5012t = obj;
        this.f5013u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        switch (this.f5011s) {
            case 0:
                c cVar = (c) this.f5012t;
                f fVar = (f) this.f5013u;
                if (((z) cVar.f4965d.f4957t).f5048a != null) {
                    ((z) cVar.f4965d.f4957t).f5048a.b(fVar, null);
                    return;
                }
                Objects.requireNonNull((z) cVar.f4965d.f4957t);
                i.f("BillingClient", "No valid listener is set in BroadcastManager");
                return;
            case 1:
                return;
            case 2:
                try {
                    ((l10) ((b00) this.f5013u).f6311t).A(d.b((a) this.f5012t));
                    return;
                } catch (RemoteException e10) {
                    g1.l("#007 Could not call remote method.", e10);
                    return;
                }
            case 3:
                String str = (String) this.f5013u;
                final j21 j21Var = ((g21) this.f5012t).f8718s;
                try {
                    ArrayList arrayList = new ArrayList();
                    JSONObject jSONObject2 = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        final String next = keys.next();
                        final Object obj = new Object();
                        final w90 w90Var = new w90();
                        tz1 q10 = mz1.q(w90Var, ((Long) jo.f10145d.f10148c.a(es.f8104h1)).longValue(), TimeUnit.SECONDS, j21Var.f9818k);
                        j21Var.f9819l.b(next);
                        sr0 sr0Var = j21Var.f9822o;
                        Objects.requireNonNull(sr0Var);
                        sr0Var.M0(new pr0(next));
                        Objects.requireNonNull(s.B.f5796j);
                        final long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator<String> it = keys;
                        q10.b(new Runnable() { // from class: m4.e21
                            @Override // java.lang.Runnable
                            public final void run() {
                                j21 j21Var2 = j21.this;
                                Object obj2 = obj;
                                w90 w90Var2 = w90Var;
                                String str2 = next;
                                long j3 = elapsedRealtime;
                                Objects.requireNonNull(j21Var2);
                                synchronized (obj2) {
                                    try {
                                        if (!w90Var2.isDone()) {
                                            Objects.requireNonNull(s.B.f5796j);
                                            j21Var2.d(str2, false, "Timeout.", (int) (SystemClock.elapsedRealtime() - j3));
                                            j21Var2.f9819l.a(str2, "timeout");
                                            j21Var2.f9822o.e(str2, "timeout");
                                            w90Var2.a(Boolean.FALSE);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }, j21Var.f9816i);
                        arrayList.add(q10);
                        final i21 i21Var = new i21(j21Var, obj, next, elapsedRealtime, w90Var);
                        JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                        final ArrayList arrayList2 = new ArrayList();
                        if (optJSONObject != null) {
                            try {
                                JSONArray jSONArray = optJSONObject.getJSONArray("data");
                                int i10 = 0;
                                while (i10 < jSONArray.length()) {
                                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                                    String optString = jSONObject3.optString("format", "");
                                    JSONObject optJSONObject2 = jSONObject3.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (optJSONObject2 != null) {
                                        Iterator<String> keys2 = optJSONObject2.keys();
                                        while (keys2.hasNext()) {
                                            String next2 = keys2.next();
                                            jSONObject = jSONObject2;
                                            try {
                                                bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                                jSONObject2 = jSONObject;
                                            } catch (JSONException unused) {
                                            }
                                        }
                                    }
                                    JSONObject jSONObject4 = jSONObject2;
                                    arrayList2.add(new yy(optString, bundle));
                                    i10++;
                                    jSONObject2 = jSONObject4;
                                }
                            } catch (JSONException unused2) {
                            }
                        }
                        jSONObject = jSONObject2;
                        j21Var.d(next, false, "", 0);
                        try {
                            try {
                                final ym1 b10 = j21Var.f9815h.b(next, new JSONObject());
                                j21Var.f9817j.execute(new Runnable() { // from class: m4.d21
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        j21 j21Var2 = j21.this;
                                        ym1 ym1Var = b10;
                                        uy uyVar = i21Var;
                                        List<yy> list = arrayList2;
                                        String str2 = next;
                                        Objects.requireNonNull(j21Var2);
                                        try {
                                            try {
                                                Context context = j21Var2.f9814g.get();
                                                if (context == null) {
                                                    context = j21Var2.f9813f;
                                                }
                                                Objects.requireNonNull(ym1Var);
                                                ym1Var.f15839a.m2(new b(context), uyVar, list);
                                            } catch (pm1 unused3) {
                                                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 74);
                                                sb.append("Failed to initialize adapter. ");
                                                sb.append(str2);
                                                sb.append(" does not implement the initialize() method.");
                                                uyVar.P(sb.toString());
                                            }
                                        } catch (RemoteException e11) {
                                            g1.h("", e11);
                                        }
                                    }
                                });
                            } catch (RemoteException e11) {
                                g1.h("", e11);
                            }
                        } catch (pm1 unused3) {
                            i21Var.P("Failed to create Adapter.");
                        }
                        jSONObject2 = jSONObject;
                        keys = it;
                    }
                    pu1 pu1Var = gw1.f9058t;
                    new cz1(gw1.q(arrayList), false, j21Var.f9816i, new f21(j21Var, 0));
                    return;
                } catch (JSONException e12) {
                    g1.b("Malformed CLD response", e12);
                    return;
                }
            default:
                ((h3) this.f5013u).f20483s.a();
                ((h3) this.f5013u).f20483s.n((k6) this.f5012t);
                return;
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, int i10, e eVar) {
        this.f5011s = i10;
        this.f5013u = obj;
        this.f5012t = obj2;
    }

    public n(lh lhVar, String str) {
        this.f5011s = 1;
        this.f5013u = lhVar;
        this.f5012t = str;
    }
}
