package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import c2.p;
import d2.m;
import d2.r;
import java.util.Collections;
import java.util.List;
import t1.h;
import u1.b;
import y1.d;

/* loaded from: classes.dex */
public final class c implements y1.c, b, r.b {
    public static final String B = h.e("DelayMetCommandHandler");

    /* renamed from: s */
    public final Context f2345s;

    /* renamed from: t */
    public final int f2346t;

    /* renamed from: u */
    public final String f2347u;

    /* renamed from: v */
    public final d f2348v;

    /* renamed from: w */
    public final d f2349w;

    /* renamed from: z */
    public PowerManager.WakeLock f2351z;
    public boolean A = false;
    public int y = 0;

    /* renamed from: x */
    public final Object f2350x = new Object();

    public c(Context context, int i10, String str, d dVar) {
        this.f2345s = context;
        this.f2346t = i10;
        this.f2348v = dVar;
        this.f2347u = str;
        this.f2349w = new d(context, dVar.f2353t, this);
    }

    @Override // u1.b
    public final void a(String str, boolean z10) {
        h.c().a(B, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        e();
        if (z10) {
            Intent d5 = a.d(this.f2345s, this.f2347u);
            d dVar = this.f2348v;
            dVar.e(new d.b(dVar, d5, this.f2346t));
        }
        if (this.A) {
            Intent b10 = a.b(this.f2345s);
            d dVar2 = this.f2348v;
            dVar2.e(new d.b(dVar2, b10, this.f2346t));
        }
    }

    @Override // d2.r.b
    public final void b(String str) {
        h.c().a(B, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // y1.c
    public final void c(List<String> list) {
        g();
    }

    @Override // y1.c
    public final void d(List<String> list) {
        if (!list.contains(this.f2347u)) {
            return;
        }
        synchronized (this.f2350x) {
            if (this.y == 0) {
                this.y = 1;
                h.c().a(B, String.format("onAllConstraintsMet for %s", this.f2347u), new Throwable[0]);
                if (this.f2348v.f2355v.g(this.f2347u, null)) {
                    this.f2348v.f2354u.a(this.f2347u, this);
                } else {
                    e();
                }
            } else {
                h.c().a(B, String.format("Already started work for %s", this.f2347u), new Throwable[0]);
            }
        }
    }

    public final void e() {
        synchronized (this.f2350x) {
            this.f2349w.c();
            this.f2348v.f2354u.b(this.f2347u);
            PowerManager.WakeLock wakeLock = this.f2351z;
            if (wakeLock != null && wakeLock.isHeld()) {
                h.c().a(B, String.format("Releasing wakelock %s for WorkSpec %s", this.f2351z, this.f2347u), new Throwable[0]);
                this.f2351z.release();
            }
        }
    }

    public final void f() {
        this.f2351z = m.a(this.f2345s, String.format("%s (%s)", this.f2347u, Integer.valueOf(this.f2346t)));
        h c10 = h.c();
        String str = B;
        c10.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f2351z, this.f2347u), new Throwable[0]);
        this.f2351z.acquire();
        p i10 = ((c2.r) this.f2348v.f2356w.f19025c.v()).i(this.f2347u);
        if (i10 == null) {
            g();
            return;
        }
        boolean b10 = i10.b();
        this.A = b10;
        if (b10) {
            this.f2349w.b(Collections.singletonList(i10));
            return;
        }
        h.c().a(str, String.format("No constraints for %s", this.f2347u), new Throwable[0]);
        d(Collections.singletonList(this.f2347u));
    }

    public final void g() {
        synchronized (this.f2350x) {
            if (this.y < 2) {
                this.y = 2;
                h c10 = h.c();
                String str = B;
                c10.a(str, String.format("Stopping work for WorkSpec %s", this.f2347u), new Throwable[0]);
                Context context = this.f2345s;
                String str2 = this.f2347u;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                d dVar = this.f2348v;
                dVar.e(new d.b(dVar, intent, this.f2346t));
                if (this.f2348v.f2355v.d(this.f2347u)) {
                    h.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f2347u), new Throwable[0]);
                    Intent d5 = a.d(this.f2345s, this.f2347u);
                    d dVar2 = this.f2348v;
                    dVar2.e(new d.b(dVar2, d5, this.f2346t));
                } else {
                    h.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f2347u), new Throwable[0]);
                }
            } else {
                h.c().a(B, String.format("Already stopped work for %s", this.f2347u), new Throwable[0]);
            }
        }
    }
}
