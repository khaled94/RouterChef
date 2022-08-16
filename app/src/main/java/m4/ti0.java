package m4;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import n3.g1;
import n3.s1;

/* loaded from: classes.dex */
public final class ti0 implements to0, mp0, ep0, ym, bp0 {
    public final w7 A;
    public final ys B;
    public final WeakReference<View> C;
    @GuardedBy("this")
    public boolean D;
    public final AtomicBoolean E = new AtomicBoolean();

    /* renamed from: s */
    public final Context f14067s;

    /* renamed from: t */
    public final Executor f14068t;

    /* renamed from: u */
    public final Executor f14069u;

    /* renamed from: v */
    public final ScheduledExecutorService f14070v;

    /* renamed from: w */
    public final km1 f14071w;

    /* renamed from: x */
    public final cm1 f14072x;
    public final xp1 y;

    /* renamed from: z */
    public final tm1 f14073z;

    public ti0(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, km1 km1Var, cm1 cm1Var, xp1 xp1Var, tm1 tm1Var, View view, w7 w7Var, ys ysVar) {
        this.f14067s = context;
        this.f14068t = executor;
        this.f14069u = executor2;
        this.f14070v = scheduledExecutorService;
        this.f14071w = km1Var;
        this.f14072x = cm1Var;
        this.y = xp1Var;
        this.f14073z = tm1Var;
        this.A = w7Var;
        this.C = new WeakReference<>(view);
        this.B = ysVar;
    }

    @Override // m4.ym
    public final void N() {
        int i10 = 2;
        if ((!((Boolean) jo.f10145d.f10148c.a(es.f8088f0)).booleanValue() || !this.f14071w.f10489b.f10126b.f8009g) && lt.f10985d.e().booleanValue()) {
            mz1.t(mz1.i(gz1.r(this.B.a()), Throwable.class, qi0.f12881a, u90.f14299f), new q(this, 2), this.f14068t);
            return;
        }
        tm1 tm1Var = this.f14073z;
        xp1 xp1Var = this.y;
        km1 km1Var = this.f14071w;
        cm1 cm1Var = this.f14072x;
        List<String> a10 = xp1Var.a(km1Var, cm1Var, cm1Var.f7036c);
        s1 s1Var = s.B.f5789c;
        if (true != s1.h(this.f14067s)) {
            i10 = 1;
        }
        tm1Var.c(a10, i10);
    }

    public final void a() {
        yr<Boolean> yrVar = es.V1;
        jo joVar = jo.f10145d;
        String e10 = ((Boolean) joVar.f10148c.a(yrVar)).booleanValue() ? this.A.f14875b.e(this.f14067s, this.C.get()) : null;
        if ((!((Boolean) joVar.f10148c.a(es.f8088f0)).booleanValue() || !this.f14071w.f10489b.f10126b.f8009g) && lt.f10988g.e().booleanValue()) {
            mz1.t((gz1) mz1.q(gz1.r(mz1.m(null)), ((Long) joVar.f10148c.a(es.C0)).longValue(), TimeUnit.MILLISECONDS, this.f14070v), new z10(this, e10), this.f14068t);
            return;
        }
        tm1 tm1Var = this.f14073z;
        xp1 xp1Var = this.y;
        km1 km1Var = this.f14071w;
        cm1 cm1Var = this.f14072x;
        tm1Var.a(xp1Var.b(km1Var, cm1Var, false, e10, null, cm1Var.f7038d));
    }

    public final void b(final int i10, final int i11) {
        View view;
        if (i10 <= 0 || !((view = this.C.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            a();
        } else {
            this.f14070v.schedule(new Runnable() { // from class: m4.si0
                @Override // java.lang.Runnable
                public final void run() {
                    final ti0 ti0Var = ti0.this;
                    final int i12 = i10;
                    final int i13 = i11;
                    ti0Var.f14068t.execute(new Runnable() { // from class: m4.ri0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ti0.this.b(i12 - 1, i13);
                        }
                    });
                }
            }, i11, TimeUnit.MILLISECONDS);
        }
    }

    @Override // m4.bp0
    public final void d0(cn cnVar) {
        if (((Boolean) jo.f10145d.f10148c.a(es.X0)).booleanValue()) {
            int i10 = cnVar.f7067s;
            List<String> list = this.f14072x.p;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                StringBuilder sb = new StringBuilder(23);
                sb.append("2.");
                sb.append(i10);
                arrayList.add(xp1.c(str, "@gw_mpe@", sb.toString()));
            }
            this.f14073z.a(this.y.a(this.f14071w, this.f14072x, arrayList));
        }
    }

    @Override // m4.to0
    public final void e() {
        tm1 tm1Var = this.f14073z;
        xp1 xp1Var = this.y;
        km1 km1Var = this.f14071w;
        cm1 cm1Var = this.f14072x;
        tm1Var.a(xp1Var.a(km1Var, cm1Var, cm1Var.f7050j));
    }

    @Override // m4.to0
    public final void i() {
    }

    @Override // m4.mp0
    public final synchronized void j() {
        List<String> list;
        tm1 tm1Var;
        if (this.D) {
            ArrayList arrayList = new ArrayList(this.f14072x.f7038d);
            arrayList.addAll(this.f14072x.f7044g);
            tm1Var = this.f14073z;
            list = this.y.b(this.f14071w, this.f14072x, true, null, null, arrayList);
        } else {
            tm1 tm1Var2 = this.f14073z;
            xp1 xp1Var = this.y;
            km1 km1Var = this.f14071w;
            cm1 cm1Var = this.f14072x;
            tm1Var2.a(xp1Var.a(km1Var, cm1Var, cm1Var.f7056n));
            tm1Var = this.f14073z;
            xp1 xp1Var2 = this.y;
            km1 km1Var2 = this.f14071w;
            cm1 cm1Var2 = this.f14072x;
            list = xp1Var2.a(km1Var2, cm1Var2, cm1Var2.f7044g);
        }
        tm1Var.a(list);
        this.D = true;
    }

    @Override // m4.to0
    public final void k() {
    }

    @Override // m4.ep0
    public final void l() {
        if (!this.E.compareAndSet(false, true)) {
            return;
        }
        yr<Integer> yrVar = es.Y1;
        jo joVar = jo.f10145d;
        int intValue = ((Integer) joVar.f10148c.a(yrVar)).intValue();
        if (intValue > 0) {
            b(intValue, ((Integer) joVar.f10148c.a(es.Z1)).intValue());
            return;
        }
        if (((Boolean) joVar.f10148c.a(es.X1)).booleanValue()) {
            this.f14069u.execute(new la0(this, 1));
        } else {
            a();
        }
    }

    @Override // m4.to0
    public final void o() {
    }

    @Override // m4.to0
    public final void u(a60 a60Var, String str, String str2) {
        String str3;
        tm1 tm1Var = this.f14073z;
        xp1 xp1Var = this.y;
        cm1 cm1Var = this.f14072x;
        List<String> list = cm1Var.f7048i;
        Objects.requireNonNull(xp1Var);
        ArrayList arrayList = new ArrayList();
        long a10 = xp1Var.f15445g.a();
        try {
            String str4 = ((y50) a60Var).f15591s;
            String num = Integer.toString(((y50) a60Var).f15592t);
            mm1 mm1Var = xp1Var.f15444f;
            String str5 = "";
            if (mm1Var == null) {
                str3 = str5;
            } else {
                str3 = mm1Var.f11248a;
                if (!TextUtils.isEmpty(str3) && k90.d()) {
                    str3 = "fakeForAdDebugLog";
                }
            }
            mm1 mm1Var2 = xp1Var.f15444f;
            if (mm1Var2 != null) {
                str5 = mm1Var2.f11249b;
                if (!TextUtils.isEmpty(str5) && k90.d()) {
                    str5 = "fakeForAdDebugLog";
                }
            }
            for (String str6 : list) {
                arrayList.add(y70.b(xp1.c(xp1.c(xp1.c(xp1.c(xp1.c(xp1.c(str6, "@gw_rwd_userid@", Uri.encode(str3)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(a10)), "@gw_rwd_itm@", Uri.encode(str4)), "@gw_rwd_amt@", num), "@gw_sdkver@", xp1Var.f15440b), xp1Var.f15443e, cm1Var.T));
            }
        } catch (RemoteException e10) {
            g1.h("Unable to determine award type and amount.", e10);
        }
        tm1Var.a(arrayList);
    }

    @Override // m4.to0
    public final void x() {
        tm1 tm1Var = this.f14073z;
        xp1 xp1Var = this.y;
        km1 km1Var = this.f14071w;
        cm1 cm1Var = this.f14072x;
        tm1Var.a(xp1Var.a(km1Var, cm1Var, cm1Var.f7046h));
    }
}
