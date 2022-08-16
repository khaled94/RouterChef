package m4;

import a4.f;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import l3.s;
import n3.s1;

/* loaded from: classes.dex */
public final class qp1 implements Runnable {

    /* renamed from: z */
    public static Boolean f12950z;

    /* renamed from: s */
    public final Context f12951s;

    /* renamed from: t */
    public final o90 f12952t;

    /* renamed from: v */
    public String f12954v;

    /* renamed from: w */
    public int f12955w;
    public final r01 y;

    /* renamed from: u */
    public final tp1 f12953u = wp1.w();

    /* renamed from: x */
    public boolean f12956x = false;

    public qp1(Context context, o90 o90Var, r01 r01Var) {
        this.f12951s = context;
        this.f12952t = o90Var;
        this.y = r01Var;
    }

    public static synchronized boolean b() {
        boolean booleanValue;
        Boolean valueOf;
        synchronized (qp1.class) {
            if (f12950z == null) {
                if (!gt.f9029b.e().booleanValue()) {
                    valueOf = Boolean.FALSE;
                } else {
                    valueOf = Boolean.valueOf(Math.random() < gt.f9028a.e().doubleValue());
                }
                f12950z = valueOf;
            }
            booleanValue = f12950z.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized void a(pp1 pp1Var) {
        if (!this.f12956x) {
            c();
        }
        if (!b()) {
            return;
        }
        if (pp1Var == null) {
            return;
        }
        tp1 tp1Var = this.f12953u;
        up1 v10 = vp1.v();
        rp1 v11 = sp1.v();
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        ((sp1) v11.f9883t).zze = 5;
        boolean z10 = pp1Var.f12598b;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        ((sp1) v11.f9883t).zzf = z10;
        long j3 = pp1Var.f12597a;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        ((sp1) v11.f9883t).zzg = j3;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        ((sp1) v11.f9883t).zzh = 1;
        String str = this.f12952t.f12051s;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        sp1.x((sp1) v11.f9883t, str);
        String str2 = this.f12954v;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        sp1.y((sp1) v11.f9883t, str2);
        String str3 = Build.VERSION.RELEASE;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        sp1.z((sp1) v11.f9883t);
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        ((sp1) v11.f9883t).zzl = Build.VERSION.SDK_INT;
        int i10 = pp1Var.f12605i;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        sp1.L((sp1) v11.f9883t, i10);
        int i11 = pp1Var.f12599c;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        ((sp1) v11.f9883t).zzn = i11;
        long j10 = this.f12955w;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        ((sp1) v11.f9883t).zzo = j10;
        int i12 = pp1Var.f12604h;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        sp1.M((sp1) v11.f9883t, i12);
        String str4 = pp1Var.f12600d;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        sp1.D((sp1) v11.f9883t, str4);
        String str5 = pp1Var.f12601e;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        sp1.E((sp1) v11.f9883t, str5);
        String str6 = pp1Var.f12602f;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        sp1.F((sp1) v11.f9883t, str6);
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        ((sp1) v11.f9883t).zzt = "";
        String str7 = pp1Var.f12603g;
        if (v11.f9884u) {
            v11.m();
            v11.f9884u = false;
        }
        sp1.I((sp1) v11.f9883t, str7);
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        vp1.x((vp1) v10.f9883t, v11.k());
        if (tp1Var.f9884u) {
            tp1Var.m();
            tp1Var.f9884u = false;
        }
        wp1.z((wp1) tp1Var.f9883t, v10.k());
    }

    public final synchronized void c() {
        if (this.f12956x) {
            return;
        }
        this.f12956x = true;
        if (!b()) {
            return;
        }
        s1 s1Var = s.B.f5789c;
        this.f12954v = s1.L(this.f12951s);
        this.f12955w = f.f133b.a(this.f12951s);
        long intValue = ((Integer) jo.f10145d.f10148c.a(es.N5)).intValue();
        u90.f14297d.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
    }

    public final synchronized void d() {
        try {
            m51 m51Var = new m51((String) jo.f10145d.f10148c.a(es.M5), 60000, new HashMap(), this.f12953u.k().b(), "application/x-protobuf");
            Context context = this.f12951s;
            String str = this.f12952t.f12051s;
            Binder.getCallingUid();
            new o51(context, str).mo30h(m51Var);
        } catch (Exception e10) {
            if ((e10 instanceof c31) && ((c31) e10).f6719s == 3) {
                tp1 tp1Var = this.f12953u;
                if (tp1Var.f9884u) {
                    tp1Var.m();
                    tp1Var.f9884u = false;
                }
                wp1.y((wp1) tp1Var.f9883t);
                return;
            }
            s.B.f5793g.f(e10, "CuiMonitor.sendCuiPing");
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (!b()) {
            return;
        }
        if (((wp1) this.f12953u.f9883t).v() == 0) {
            return;
        }
        d();
    }
}
