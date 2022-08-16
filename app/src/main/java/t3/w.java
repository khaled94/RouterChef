package t3;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k4.b;
import l3.s;
import m4.a3;
import m4.ag;
import m4.bg;
import m4.dc0;
import m4.dd;
import m4.eg2;
import m4.es;
import m4.f80;
import m4.fg2;
import m4.gg2;
import m4.h71;
import m4.io2;
import m4.jo;
import m4.kq2;
import m4.kz1;
import m4.l90;
import m4.mp2;
import m4.pm1;
import m4.pt0;
import m4.qr1;
import m4.qt0;
import m4.r01;
import m4.sa1;
import m4.t;
import m4.vo2;
import m4.xb0;
import m4.y81;
import m4.ym1;
import m4.yr;
import m4.zo0;
import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;
import p1.r;

/* loaded from: classes.dex */
public final class w implements kz1, ag, qt0, sa1 {

    /* renamed from: s */
    public Object f18620s;

    /* renamed from: t */
    public final Object f18621t;

    public /* synthetic */ w(Object obj, Object obj2) {
        this.f18620s = obj;
        this.f18621t = obj2;
    }

    public /* synthetic */ w(List list) {
        this.f18620s = list;
        this.f18621t = new mp2[list.size()];
    }

    public /* synthetic */ w(qr1 qr1Var) {
        this.f18621t = qr1Var;
    }

    public /* synthetic */ w(z zVar, f80 f80Var) {
        this.f18621t = zVar;
        this.f18620s = f80Var;
    }

    @Override // m4.kz1
    public final void a(Object obj) {
        i iVar = (i) obj;
        yr<Boolean> yrVar = es.Y4;
        jo joVar = jo.f10145d;
        if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            try {
                ((f80) this.f18620s).z("QueryInfo generation has been disabled.");
                return;
            } catch (RemoteException e10) {
                g1.g("QueryInfo generation has been disabled.".concat(e10.toString()));
                return;
            }
        }
        try {
            if (iVar == null) {
                ((f80) this.f18620s).K1(null, null, null);
                z.S3((z) this.f18621t, "sgs", "rid", "-1");
                return;
            }
            try {
                String optString = new JSONObject(iVar.f18593b).optString("request_id", "");
                if (TextUtils.isEmpty(optString)) {
                    g1.j("The request ID is empty in request JSON.");
                    ((f80) this.f18620s).z("Internal error: request ID is empty in request JSON.");
                    z.S3((z) this.f18621t, "sgf", "sgf_reason", "rid_missing");
                    return;
                }
                if (((Boolean) joVar.f10148c.a(es.K4)).booleanValue()) {
                    k kVar = ((z) this.f18621t).D;
                    String str = iVar.f18593b;
                    synchronized (kVar) {
                        Map<String, Pair<Long, String>> map = kVar.f18599c;
                        Objects.requireNonNull(s.B.f5796j);
                        map.put(optString, new Pair<>(Long.valueOf(System.currentTimeMillis()), str));
                        kVar.a();
                    }
                }
                Bundle bundle = iVar.f18594c;
                Object obj2 = this.f18621t;
                if (((z) obj2).K && bundle != null && bundle.getInt(((z) obj2).M, -1) == -1) {
                    Object obj3 = this.f18621t;
                    bundle.putInt(((z) obj3).M, ((z) obj3).N.get());
                }
                Object obj4 = this.f18621t;
                if (((z) obj4).J && bundle != null && TextUtils.isEmpty(bundle.getString(((z) obj4).L))) {
                    if (TextUtils.isEmpty(((z) this.f18621t).P)) {
                        Object obj5 = this.f18621t;
                        ((z) obj5).P = s.B.f5789c.D(((z) obj5).f18627u, ((z) obj5).O.f12051s);
                    }
                    Object obj6 = this.f18621t;
                    bundle.putString(((z) obj6).L, ((z) obj6).P);
                }
                ((f80) this.f18620s).K1(iVar.f18592a, iVar.f18593b, bundle);
                z.S3((z) this.f18621t, "sgs", "rid", optString);
            } catch (JSONException e11) {
                g1.j("Failed to create JSON object from the request string.");
                String obj7 = e11.toString();
                StringBuilder sb = new StringBuilder(obj7.length() + 33);
                sb.append("Internal error for request JSON: ");
                sb.append(obj7);
                ((f80) this.f18620s).z(sb.toString());
                z.S3((z) this.f18621t, "sgf", "sgf_reason", "request_invalid");
            }
        } catch (RemoteException e12) {
            g1.h("", e12);
        }
    }

    @Override // m4.sa1
    public final void b(Object obj, io2 io2Var) {
        gg2 gg2Var = (gg2) obj;
        SparseArray<fg2> sparseArray = ((eg2) this.f18620s).f7897v;
        SparseArray sparseArray2 = new SparseArray(io2Var.b());
        for (int i10 = 0; i10 < io2Var.b(); i10++) {
            int a10 = io2Var.a(i10);
            fg2 fg2Var = sparseArray.get(a10);
            Objects.requireNonNull(fg2Var);
            sparseArray2.append(a10, fg2Var);
        }
    }

    @Override // m4.qt0
    public final void c(boolean z10, Context context, zo0 zo0Var) {
        y81 y81Var = (y81) this.f18620s;
        h71 h71Var = (h71) this.f18621t;
        Objects.requireNonNull(y81Var);
        try {
            ((ym1) h71Var.f9129b).b(z10);
            if (y81Var.f15616c.f12053u < ((Integer) jo.f10145d.f10148c.a(es.f8181r0)).intValue()) {
                ym1 ym1Var = (ym1) h71Var.f9129b;
                Objects.requireNonNull(ym1Var);
                ym1Var.f15839a.H();
                return;
            }
            ym1 ym1Var2 = (ym1) h71Var.f9129b;
            Objects.requireNonNull(ym1Var2);
            ym1Var2.f15839a.V2(new b(context));
        } catch (pm1 e10) {
            g1.i("Cannot show interstitial.");
            throw new pt0(e10.getCause());
        }
    }

    public final void d(long j3, dd ddVar) {
        if (ddVar.zza() < 9) {
            return;
        }
        int l10 = ddVar.l();
        int l11 = ddVar.l();
        int q10 = ddVar.q();
        if (l10 != 434 || l11 != 1195456820 || q10 != 3) {
            return;
        }
        l90.d(j3, ddVar, (mp2[]) this.f18621t);
    }

    public final void e(vo2 vo2Var, a3 a3Var) {
        for (int i10 = 0; i10 < ((mp2[]) this.f18621t).length; i10++) {
            a3Var.c();
            mp2 p = vo2Var.p(a3Var.a(), 3);
            t tVar = (t) ((List) this.f18620s).get(i10);
            String str = tVar.f13871k;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            r01.g(z10, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            kq2 kq2Var = new kq2();
            kq2Var.f10533a = a3Var.b();
            kq2Var.f10542j = str;
            kq2Var.f10536d = tVar.f13864d;
            kq2Var.f10535c = tVar.f13863c;
            kq2Var.B = tVar.C;
            kq2Var.f10544l = tVar.f13873m;
            p.f(new t(kq2Var));
            ((mp2[]) this.f18621t)[i10] = p;
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        String message = th.getMessage();
        s.B.f5793g.g(th, "SignalGeneratorImpl.generateSignals");
        z.S3((z) this.f18621t, "sgf", "sgf_reason", message);
        try {
            f80 f80Var = (f80) this.f18620s;
            String valueOf = String.valueOf(message);
            f80Var.z(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e10) {
            g1.h("", e10);
        }
    }

    @Override // m4.ag
    /* renamed from: zza */
    public final bg mo26zza() {
        dc0 dc0Var = (dc0) this.f18620s;
        return new xb0(dc0Var.f7291u, ((ag) this.f18621t).mo26zza(), dc0Var.I, dc0Var.J, dc0Var, new r(dc0Var, 1));
    }
}
