package m4;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l3.s;
import n3.k1;
import z3.l;

/* loaded from: classes.dex */
public final class j21 {

    /* renamed from: f */
    public final Context f9813f;

    /* renamed from: g */
    public final WeakReference<Context> f9814g;

    /* renamed from: h */
    public final h01 f9815h;

    /* renamed from: i */
    public final Executor f9816i;

    /* renamed from: j */
    public final Executor f9817j;

    /* renamed from: k */
    public final ScheduledExecutorService f9818k;

    /* renamed from: l */
    public final m11 f9819l;

    /* renamed from: m */
    public final o90 f9820m;

    /* renamed from: o */
    public final sr0 f9822o;

    /* renamed from: a */
    public boolean f9808a = false;

    /* renamed from: b */
    public boolean f9809b = false;

    /* renamed from: c */
    public boolean f9810c = false;

    /* renamed from: e */
    public final w90<Boolean> f9812e = new w90<>();

    /* renamed from: n */
    public final Map<String, ry> f9821n = new ConcurrentHashMap();
    public boolean p = true;

    /* renamed from: d */
    public final long f9811d = SystemClock.elapsedRealtime();

    public j21(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, h01 h01Var, ScheduledExecutorService scheduledExecutorService, m11 m11Var, o90 o90Var, sr0 sr0Var) {
        this.f9815h = h01Var;
        this.f9813f = context;
        this.f9814g = weakReference;
        this.f9816i = executor2;
        this.f9818k = scheduledExecutorService;
        this.f9817j = executor;
        this.f9819l = m11Var;
        this.f9820m = o90Var;
        this.f9822o = sr0Var;
        Objects.requireNonNull(s.B.f5796j);
        d("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.String, m4.ry>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<java.lang.String, m4.ry>, java.util.concurrent.ConcurrentHashMap] */
    public final List<ry> a() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f9821n.keySet()) {
            ry ryVar = (ry) this.f9821n.get(str);
            arrayList.add(new ry(str, ryVar.f13452t, ryVar.f13453u, ryVar.f13454v));
        }
        return arrayList;
    }

    public final void b() {
        if (!rt.f13427a.e().booleanValue()) {
            int i10 = this.f9820m.f12053u;
            yr<Integer> yrVar = es.f8096g1;
            jo joVar = jo.f10145d;
            if (i10 >= ((Integer) joVar.f10148c.a(yrVar)).intValue() && this.p) {
                if (this.f9808a) {
                    return;
                }
                synchronized (this) {
                    if (this.f9808a) {
                        return;
                    }
                    this.f9819l.d();
                    this.f9822o.M0(rr0.f13422s);
                    this.f9812e.b(new m8(this, 4), this.f9816i);
                    this.f9808a = true;
                    tz1<String> c10 = c();
                    this.f9818k.schedule(new n3.s(this, 4), ((Long) joVar.f10148c.a(es.f8112i1)).longValue(), TimeUnit.SECONDS);
                    mz1.t(c10, new g21(this), this.f9816i);
                    return;
                }
            }
        }
        if (!this.f9808a) {
            d("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.f9812e.a(Boolean.FALSE);
            this.f9808a = true;
            this.f9809b = true;
        }
    }

    public final synchronized tz1<String> c() {
        s sVar = s.B;
        String str = ((k1) sVar.f5793g.c()).e().f14602e;
        if (!TextUtils.isEmpty(str)) {
            return mz1.m(str);
        }
        w90 w90Var = new w90();
        ((k1) sVar.f5793g.c()).z(new l(this, w90Var, 2));
        return w90Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, m4.ry>, java.util.concurrent.ConcurrentHashMap] */
    public final void d(String str, boolean z10, String str2, int i10) {
        this.f9821n.put(str, new ry(str, z10, i10, str2));
    }
}
