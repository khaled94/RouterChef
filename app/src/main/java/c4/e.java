package c4;

import a4.b;
import a4.i;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b4.j;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import d4.a0;
import d4.g;
import d4.k;
import d4.m;
import d4.n;
import d4.o;
import d4.q;
import e1.h;
import f4.d;
import j4.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p4.f;
import r.c;
import r.f;

/* loaded from: classes.dex */
public final class e implements Handler.Callback {
    public static final Status H = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status I = new Status(4, "The user must be signed in to make this API call.");
    public static final Object J = new Object();
    @GuardedBy("lock")
    public static e K;
    @NotOnlyInitialized
    public final f F;
    public volatile boolean G;

    /* renamed from: u */
    public q f2687u;

    /* renamed from: v */
    public d f2688v;

    /* renamed from: w */
    public final Context f2689w;

    /* renamed from: x */
    public final a4.e f2690x;

    /* renamed from: s */
    public long f2685s = 10000;

    /* renamed from: t */
    public boolean f2686t = false;

    /* renamed from: z */
    public final AtomicInteger f2691z = new AtomicInteger(1);
    public final AtomicInteger A = new AtomicInteger(0);
    public final Map<b<?>, w<?>> B = new ConcurrentHashMap(5, 0.75f, 1);
    @GuardedBy("lock")
    public n C = null;
    @GuardedBy("lock")
    public final Set<b<?>> D = new c(0);
    public final Set<b<?>> E = new c(0);
    public final a0 y = new a0();

    public e(Context context, Looper looper) {
        a4.e eVar = a4.e.f130d;
        boolean z10 = true;
        this.G = true;
        this.f2689w = context;
        f fVar = new f(looper, this);
        this.F = fVar;
        this.f2690x = eVar;
        PackageManager packageManager = context.getPackageManager();
        if (h4.d.f5077e == null) {
            h4.d.f5077e = Boolean.valueOf((!h4.f.a() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z10);
        }
        if (h4.d.f5077e.booleanValue()) {
            this.G = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    public static Status c(b<?> bVar, b bVar2) {
        String str = bVar.f2670b.f2558b;
        String valueOf = String.valueOf(bVar2);
        return new Status(1, 17, i0.b.a(new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), bVar2.f117u, bVar2);
    }

    public static e f(Context context) {
        e eVar;
        synchronized (J) {
            if (K == null) {
                Looper looper = g.b().getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = a4.e.f129c;
                a4.e eVar2 = a4.e.f130d;
                K = new e(applicationContext, looper);
            }
            eVar = K;
        }
        return eVar;
    }

    public final boolean a() {
        if (this.f2686t) {
            return false;
        }
        o oVar = n.a().f3896a;
        if (oVar != null && !oVar.f3898t) {
            return false;
        }
        int i10 = this.y.f3801a.get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    public final boolean b(b bVar, int i10) {
        a4.e eVar = this.f2690x;
        Context context = this.f2689w;
        Objects.requireNonNull(eVar);
        if (a.a(context)) {
            return false;
        }
        PendingIntent pendingIntent = null;
        if (bVar.s()) {
            pendingIntent = bVar.f117u;
        } else {
            Intent b10 = eVar.b(context, bVar.f116t, null);
            if (b10 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, b10, r4.d.f17254a | 134217728);
            }
        }
        if (pendingIntent == null) {
            return false;
        }
        eVar.h(context, bVar.f116t, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntent, i10, true), 134217728 | p4.e.f16952a));
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    public final w<?> d(b4.c<?> cVar) {
        b<?> bVar = cVar.f2565e;
        w<?> wVar = (w) this.B.get(bVar);
        if (wVar == null) {
            wVar = new w<>(this, cVar);
            this.B.put(bVar, wVar);
        }
        if (wVar.s()) {
            this.E.add(bVar);
        }
        wVar.o();
        return wVar;
    }

    public final void e() {
        q qVar = this.f2687u;
        if (qVar != null) {
            if (qVar.f3908s > 0 || a()) {
                if (this.f2688v == null) {
                    this.f2688v = new d(this.f2689w);
                }
                this.f2688v.c(qVar);
            }
            this.f2687u = null;
        }
    }

    public final void g(b bVar, int i10) {
        if (!b(bVar, i10)) {
            f fVar = this.F;
            fVar.sendMessage(fVar.obtainMessage(5, i10, 0, bVar));
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.List<c4.x>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.util.List<c4.x>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.Queue<c4.o0>, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Queue<c4.o0>, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r9v50, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r9v52, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        a4.d[] g10;
        int i10 = message.what;
        long j3 = 300000;
        w wVar = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j3 = 10000;
                }
                this.f2685s = j3;
                this.F.removeMessages(12);
                for (b bVar : this.B.keySet()) {
                    f fVar = this.F;
                    fVar.sendMessageDelayed(fVar.obtainMessage(12, bVar), this.f2685s);
                }
                break;
            case 2:
                Objects.requireNonNull((p0) message.obj);
                throw null;
            case 3:
                for (w wVar2 : this.B.values()) {
                    wVar2.n();
                    wVar2.o();
                }
                break;
            case 4:
            case 8:
            case 13:
                f0 f0Var = (f0) message.obj;
                w<?> wVar3 = (w) this.B.get(f0Var.f2698c.f2565e);
                if (wVar3 == null) {
                    wVar3 = d(f0Var.f2698c);
                }
                if (!wVar3.s() || this.A.get() == f0Var.f2697b) {
                    wVar3.p(f0Var.f2696a);
                    break;
                } else {
                    f0Var.f2696a.a(H);
                    wVar3.r();
                    break;
                }
                break;
            case 5:
                int i11 = message.arg1;
                b bVar2 = (b) message.obj;
                Iterator it = this.B.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        w wVar4 = (w) it.next();
                        if (wVar4.y == i11) {
                            wVar = wVar4;
                        }
                    }
                }
                if (wVar != null) {
                    if (bVar2.f116t == 13) {
                        a4.e eVar = this.f2690x;
                        int i12 = bVar2.f116t;
                        Objects.requireNonNull(eVar);
                        AtomicBoolean atomicBoolean = i.f139a;
                        String u10 = b.u(i12);
                        String str = bVar2.f118v;
                        wVar.c(new Status(17, i0.b.a(new StringBuilder(String.valueOf(u10).length() + 69 + String.valueOf(str).length()), "Error resolution was canceled by the user, original error message: ", u10, ": ", str)));
                        break;
                    } else {
                        wVar.c(c(wVar.f2746u, bVar2));
                        break;
                    }
                } else {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i11);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f2689w.getApplicationContext() instanceof Application) {
                    c.a((Application) this.f2689w.getApplicationContext());
                    c cVar = c.f2675w;
                    r rVar = new r(this);
                    Objects.requireNonNull(cVar);
                    synchronized (cVar) {
                        cVar.f2678u.add(rVar);
                    }
                    if (!cVar.f2677t.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!cVar.f2677t.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            cVar.f2676s.set(true);
                        }
                    }
                    if (!cVar.f2676s.get()) {
                        this.f2685s = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                d((b4.c) message.obj);
                break;
            case 9:
                if (this.B.containsKey(message.obj)) {
                    w wVar5 = (w) this.B.get(message.obj);
                    m.c(wVar5.E.F);
                    if (wVar5.A) {
                        wVar5.o();
                        break;
                    }
                }
                break;
            case 10:
                Iterator<b<?>> it2 = this.E.iterator();
                while (true) {
                    f.a aVar = (f.a) it2;
                    if (!aVar.hasNext()) {
                        this.E.clear();
                        break;
                    } else {
                        w wVar6 = (w) this.B.remove((b) aVar.next());
                        if (wVar6 != null) {
                            wVar6.r();
                        }
                    }
                }
            case 11:
                if (this.B.containsKey(message.obj)) {
                    w wVar7 = (w) this.B.get(message.obj);
                    m.c(wVar7.E.F);
                    if (wVar7.A) {
                        wVar7.j();
                        e eVar2 = wVar7.E;
                        wVar7.c(eVar2.f2690x.d(eVar2.f2689w) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
                        wVar7.f2745t.d("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (this.B.containsKey(message.obj)) {
                    ((w) this.B.get(message.obj)).m(true);
                    break;
                }
                break;
            case 14:
                Objects.requireNonNull((o) message.obj);
                if (!this.B.containsKey(null)) {
                    throw null;
                }
                ((w) this.B.get(null)).m(false);
                throw null;
            case 15:
                x xVar = (x) message.obj;
                if (this.B.containsKey(xVar.f2755a)) {
                    w wVar8 = (w) this.B.get(xVar.f2755a);
                    if (wVar8.B.contains(xVar) && !wVar8.A) {
                        if (!wVar8.f2745t.a()) {
                            wVar8.o();
                            break;
                        } else {
                            wVar8.e();
                            break;
                        }
                    }
                }
                break;
            case 16:
                x xVar2 = (x) message.obj;
                if (this.B.containsKey(xVar2.f2755a)) {
                    w<?> wVar9 = (w) this.B.get(xVar2.f2755a);
                    if (wVar9.B.remove(xVar2)) {
                        wVar9.E.F.removeMessages(15, xVar2);
                        wVar9.E.F.removeMessages(16, xVar2);
                        a4.d dVar = xVar2.f2756b;
                        ArrayList arrayList = new ArrayList(wVar9.f2744s.size());
                        for (o0 o0Var : wVar9.f2744s) {
                            if ((o0Var instanceof c0) && (g10 = ((c0) o0Var).g(wVar9)) != null && h.a(g10, dVar)) {
                                arrayList.add(o0Var);
                            }
                        }
                        int size = arrayList.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            o0 o0Var2 = (o0) arrayList.get(i13);
                            wVar9.f2744s.remove(o0Var2);
                            o0Var2.b(new j(dVar));
                        }
                        break;
                    }
                }
                break;
            case 17:
                e();
                break;
            case 18:
                e0 e0Var = (e0) message.obj;
                if (e0Var.f2694c == 0) {
                    q qVar = new q(e0Var.f2693b, Arrays.asList(e0Var.f2692a));
                    if (this.f2688v == null) {
                        this.f2688v = new d(this.f2689w);
                    }
                    this.f2688v.c(qVar);
                    break;
                } else {
                    q qVar2 = this.f2687u;
                    if (qVar2 != null) {
                        List<k> list = qVar2.f3909t;
                        if (qVar2.f3908s == e0Var.f2693b && (list == null || list.size() < e0Var.f2695d)) {
                            q qVar3 = this.f2687u;
                            k kVar = e0Var.f2692a;
                            if (qVar3.f3909t == null) {
                                qVar3.f3909t = new ArrayList();
                            }
                            qVar3.f3909t.add(kVar);
                        } else {
                            this.F.removeMessages(17);
                            e();
                        }
                    }
                    if (this.f2687u == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(e0Var.f2692a);
                        this.f2687u = new q(e0Var.f2693b, arrayList2);
                        p4.f fVar2 = this.F;
                        fVar2.sendMessageDelayed(fVar2.obtainMessage(17), e0Var.f2694c);
                        break;
                    }
                }
                break;
            case 19:
                this.f2686t = false;
                break;
            default:
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Unknown message id: ");
                sb2.append(i10);
                Log.w("GoogleApiManager", sb2.toString());
                return false;
        }
        return true;
    }
}
