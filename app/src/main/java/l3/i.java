package l3;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import d.b;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import m4.es;
import m4.g90;
import m4.io;
import m4.jo;
import m4.kt1;
import m4.o90;
import m4.q7;
import m4.s7;
import m4.u7;
import m4.u90;
import m4.v7;
import m4.yr;
import m4.z9;
import m4.zr1;
import n3.g1;
import n3.s1;

/* loaded from: classes.dex */
public final class i implements Runnable, s7 {
    public Context A;
    public final Context B;
    public o90 C;
    public final o90 D;
    public final boolean E;
    public int G;

    /* renamed from: v */
    public boolean f5758v;

    /* renamed from: w */
    public final boolean f5759w;

    /* renamed from: x */
    public final boolean f5760x;
    public final ExecutorService y;

    /* renamed from: z */
    public final zr1 f5761z;

    /* renamed from: s */
    public final List<Object[]> f5755s = new Vector();

    /* renamed from: t */
    public final AtomicReference<s7> f5756t = new AtomicReference<>();

    /* renamed from: u */
    public final AtomicReference<s7> f5757u = new AtomicReference<>();
    public final CountDownLatch F = new CountDownLatch(1);

    public i(Context context, o90 o90Var) {
        this.A = context;
        this.B = context;
        this.C = o90Var;
        this.D = o90Var;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.y = newCachedThreadPool;
        yr<Boolean> yrVar = es.f8206u1;
        jo joVar = jo.f10145d;
        boolean booleanValue = ((Boolean) joVar.f10148c.a(yrVar)).booleanValue();
        this.E = booleanValue;
        this.f5761z = zr1.a(context, newCachedThreadPool, booleanValue);
        this.f5759w = ((Boolean) joVar.f10148c.a(es.f8182r1)).booleanValue();
        this.f5760x = ((Boolean) joVar.f10148c.a(es.f8214v1)).booleanValue();
        if (((Boolean) joVar.f10148c.a(es.f8198t1)).booleanValue()) {
            this.G = 2;
        } else {
            this.G = 1;
        }
        if (!((Boolean) joVar.f10148c.a(es.S1)).booleanValue()) {
            this.f5758v = h();
        }
        if (!((Boolean) joVar.f10148c.a(es.O1)).booleanValue()) {
            g90 g90Var = io.f9708f.f9709a;
            if (!g90.g()) {
                run();
                return;
            }
        }
        u90.f14294a.execute(this);
    }

    public static final Context m(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Vector, java.util.List<java.lang.Object[]>] */
    @Override // m4.s7
    public final void a(MotionEvent motionEvent) {
        s7 j3 = j();
        if (j3 == null) {
            this.f5755s.add(new Object[]{motionEvent});
            return;
        }
        k();
        j3.a(motionEvent);
    }

    @Override // m4.s7
    public final void b(View view) {
        s7 j3 = j();
        if (j3 != null) {
            j3.b(view);
        }
    }

    @Override // m4.s7
    public final String c(Context context) {
        s7 j3;
        if (!i() || (j3 = j()) == null) {
            return "";
        }
        k();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return j3.c(context);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Vector, java.util.List<java.lang.Object[]>] */
    @Override // m4.s7
    public final void d(int i10, int i11, int i12) {
        s7 j3 = j();
        if (j3 == null) {
            this.f5755s.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
            return;
        }
        k();
        j3.d(i10, i11, i12);
    }

    @Override // m4.s7
    public final String e(Context context, View view) {
        yr<Boolean> yrVar = es.f8219v6;
        jo joVar = jo.f10145d;
        if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            s7 j3 = j();
            if (((Boolean) joVar.f10148c.a(es.f8227w6)).booleanValue()) {
                s1 s1Var = s.B.f5789c;
                s1.l(view, 2);
            }
            return j3 != null ? j3.e(context, view) : "";
        } else if (!i()) {
            return "";
        } else {
            s7 j10 = j();
            if (((Boolean) joVar.f10148c.a(es.f8227w6)).booleanValue()) {
                s1 s1Var2 = s.B.f5789c;
                s1.l(view, 2);
            }
            return j10 != null ? j10.e(context, view) : "";
        }
    }

    @Override // m4.s7
    public final String f(Context context, String str, View view) {
        return g(context, str, view, null);
    }

    @Override // m4.s7
    public final String g(Context context, String str, View view, Activity activity) {
        if (i()) {
            s7 j3 = j();
            if (((Boolean) jo.f10145d.f10148c.a(es.f8227w6)).booleanValue()) {
                s1 s1Var = s.B.f5789c;
                s1.l(view, 4);
            }
            if (j3 == null) {
                return "";
            }
            k();
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return j3.g(context, str, view, activity);
        }
        return "";
    }

    public final boolean h() {
        Context context = this.A;
        zr1 zr1Var = this.f5761z;
        h hVar = new h(this);
        kt1 kt1Var = new kt1(this.A, b.i(context, zr1Var), hVar, ((Boolean) jo.f10145d.f10148c.a(es.f8190s1)).booleanValue());
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (kt1.f10572f) {
            z9 h10 = kt1Var.h(1);
            if (h10 == null) {
                kt1Var.g(4025, currentTimeMillis);
            } else {
                File c10 = kt1Var.c(h10.E());
                if (!new File(c10, "pcam.jar").exists()) {
                    kt1Var.g(4026, currentTimeMillis);
                } else if (new File(c10, "pcbc").exists()) {
                    kt1Var.g(5019, currentTimeMillis);
                    return true;
                } else {
                    kt1Var.g(4027, currentTimeMillis);
                }
            }
            return false;
        }
    }

    public final boolean i() {
        try {
            this.F.await();
            return true;
        } catch (InterruptedException e10) {
            g1.k("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    public final s7 j() {
        return (((!this.f5759w || this.f5758v) ? this.G : 1) == 2 ? this.f5757u : this.f5756t).get();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Vector, java.util.List<java.lang.Object[]>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Vector, java.util.List<java.lang.Object[]>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Vector, java.util.List<java.lang.Object[]>] */
    public final void k() {
        s7 j3 = j();
        if (this.f5755s.isEmpty() || j3 == null) {
            return;
        }
        Iterator it = this.f5755s.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            int length = objArr.length;
            if (length == 1) {
                j3.a((MotionEvent) objArr[0]);
            } else if (length == 3) {
                j3.d(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f5755s.clear();
    }

    public final void l(boolean z10) {
        String str = this.C.f12051s;
        Context m10 = m(this.A);
        int i10 = v7.T;
        u7.p(m10, z10);
        this.f5756t.set(new v7(m10, str, z10));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, m4.o90] */
    @Override // java.lang.Runnable
    public final void run() {
        q7 h10;
        boolean z10;
        try {
            yr<Boolean> yrVar = es.S1;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                this.f5758v = h();
            }
            boolean z11 = this.C.f12054v;
            final boolean z12 = false;
            if (!((Boolean) joVar.f10148c.a(es.D0)).booleanValue() && z11) {
                z12 = true;
            }
            if (((!this.f5759w || this.f5758v) ? this.G : 1) == 1) {
                l(z12);
                if (this.G == 2) {
                    this.y.execute(new Runnable() { // from class: l3.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            q7 h11;
                            i iVar = i.this;
                            boolean z13 = z12;
                            Objects.requireNonNull(iVar);
                            long currentTimeMillis = System.currentTimeMillis();
                            try {
                                String str = iVar.D.f12051s;
                                Context m10 = i.m(iVar.B);
                                boolean z14 = iVar.E;
                                synchronized (q7.class) {
                                    h11 = q7.h(str, m10, Executors.newCachedThreadPool(), z13, z14);
                                }
                                h11.k();
                            } catch (NullPointerException e10) {
                                iVar.f5761z.c(2027, System.currentTimeMillis() - currentTimeMillis, e10);
                            }
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    String str = this.C.f12051s;
                    Context m10 = m(this.A);
                    boolean z13 = this.E;
                    synchronized (q7.class) {
                        h10 = q7.h(str, m10, Executors.newCachedThreadPool(), z12, z13);
                    }
                    this.f5757u.set(h10);
                    if (this.f5760x) {
                        synchronized (h10) {
                            z10 = h10.E;
                        }
                        if (!z10) {
                            this.G = 1;
                            l(z12);
                        }
                    }
                } catch (NullPointerException e10) {
                    this.G = 1;
                    l(z12);
                    this.f5761z.c(2031, System.currentTimeMillis() - currentTimeMillis, e10);
                }
            }
        } finally {
            this.F.countDown();
            this.A = null;
            this.C = null;
        }
    }
}
