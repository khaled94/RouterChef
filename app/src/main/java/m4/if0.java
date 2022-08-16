package m4;

import android.content.Context;
import android.content.IntentFilter;
import d.d;
import e5.i;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import n3.g1;
import n3.k1;
import n3.q1;
import n3.r1;
import n3.s1;
import t3.k;
import t3.z;

/* loaded from: classes.dex */
public abstract class if0 implements rh0 {
    @GuardedBy("AppComponent.class")

    /* renamed from: a */
    public static gh0 f9621a;

    @Deprecated
    public static if0 d(Context context, int i10) {
        gh0 gh0Var;
        synchronized (if0.class) {
            gh0 gh0Var2 = f9621a;
            if (gh0Var2 != null) {
                return gh0Var2;
            }
            o90 o90Var = new o90(214106000, i10, true);
            k2 k2Var = new k2();
            synchronized (if0.class) {
                if (f9621a == null) {
                    jf0 jf0Var = new jf0();
                    jf0Var.f9952s = o90Var;
                    jf0Var.f9954u = new WeakReference(context);
                    jf0Var.f9953t = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                    f9621a = new gh0(new kf0(jf0Var), new hh0(k2Var), new eb(), new i(), new eb());
                    es.c(context);
                    s sVar = s.B;
                    sVar.f5793g.e(context, o90Var);
                    sVar.f5795i.d(context);
                    s1 s1Var = sVar.f5789c;
                    if (!s1Var.f16562f) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.intent.action.USER_PRESENT");
                        intentFilter.addAction("android.intent.action.SCREEN_OFF");
                        context.getApplicationContext().registerReceiver(new r1(s1Var), intentFilter);
                        s1Var.f16562f = true;
                    }
                    s1 s1Var2 = sVar.f5789c;
                    if (!s1Var2.f16563g) {
                        IntentFilter intentFilter2 = new IntentFilter();
                        intentFilter2.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
                        context.getApplicationContext().registerReceiver(new q1(), intentFilter2);
                        s1Var2.f16563g = true;
                    }
                    sVar.f5789c.H(context);
                    d.d(context);
                    sVar.f5792f.c(context);
                    sVar.y.a(context);
                    n70.b(context);
                    yr<Boolean> yrVar = es.Z3;
                    jo joVar = jo.f10145d;
                    if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                        if (!((Boolean) joVar.f10148c.a(es.f8134l0)).booleanValue()) {
                            wj wjVar = new wj(new xj(context));
                            f61 f61Var = new f61(new c61(context), f9621a.C());
                            try {
                                f61Var.a(new h21(new r61(context, o90Var, wjVar, f61Var, UUID.randomUUID().toString(), f9621a.B()), ((k1) sVar.f5793g.c()).J()));
                            } catch (Exception e10) {
                                String valueOf = String.valueOf(e10.getMessage());
                                g1.g(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
                            }
                        }
                    }
                }
                gh0Var = f9621a;
            }
            return gh0Var;
        }
    }

    public static if0 e(Context context, f10 f10Var, int i10) {
        if0 d5 = d(context, i10);
        d5.n().f9073b.compareAndSet(null, f10Var);
        return d5;
    }

    public abstract zm1<ty0> A();

    public abstract ep1 B();

    public abstract qp1 a();

    public abstract Executor b();

    public abstract ScheduledExecutorService c();

    public abstract mh0 f();

    public abstract ig0 g();

    public abstract gg0 h();

    public abstract mg0 i();

    public abstract cq0 j();

    public abstract xg0 k();

    public abstract bg0 l();

    public abstract ig0 m();

    public abstract h01 n();

    public abstract ug0 o();

    public abstract x21 p();

    public abstract c71 q();

    public abstract k r();

    public abstract fu1 s();

    public abstract z t();

    public final dg0 u(o50 o50Var, int i10) {
        return v(new s(o50Var, i10));
    }

    public abstract dg0 v(s sVar);

    public abstract fu1 w();

    public abstract og0 x();

    public abstract zg0 y();

    public abstract y20 z();
}
