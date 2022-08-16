package y4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import d4.m;
import g4.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e5 extends f2 {
    public final x4 A;

    /* renamed from: v */
    public j1 f20389v;

    /* renamed from: w */
    public volatile Boolean f20390w;

    /* renamed from: x */
    public final v4 f20391x;
    public final r5 y;

    /* renamed from: z */
    public final List<Runnable> f20392z = new ArrayList();

    /* renamed from: u */
    public final d5 f20388u = new d5(this);

    public e5(w2 w2Var) {
        super(w2Var);
        this.y = new r5(w2Var.F);
        this.f20391x = new v4(this, w2Var);
        this.A = new x4(this, w2Var);
    }

    public static void u(e5 e5Var, ComponentName componentName) {
        e5Var.g();
        if (e5Var.f20389v != null) {
            e5Var.f20389v = null;
            ((w2) e5Var.f20505s).C().F.b("Disconnected from device MeasurementService", componentName);
            e5Var.g();
            e5Var.v();
        }
    }

    @Override // y4.f2
    public final boolean j() {
        return false;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0272 A[Catch: all -> 0x02d9, TRY_ENTER, TryCatch #37 {all -> 0x02d9, blocks: (B:34:0x00d8, B:36:0x00de, B:38:0x00eb, B:40:0x00f1, B:44:0x0107, B:51:0x0125, B:52:0x012a, B:53:0x012d, B:56:0x0133, B:58:0x0147, B:61:0x015c, B:64:0x0163, B:65:0x0166, B:67:0x0169, B:69:0x017d, B:72:0x0192, B:74:0x0198, B:75:0x019c, B:76:0x019f, B:79:0x01a3, B:80:0x01b0, B:81:0x01bc, B:90:0x01d6, B:92:0x01e2, B:94:0x01f2, B:95:0x0201, B:135:0x0272, B:137:0x0278, B:138:0x027b, B:145:0x029d, B:152:0x02b2), top: B:220:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x030c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(y4.j1 r28, e4.a r29, y4.k6 r30) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.e5.k(y4.j1, e4.a, y4.k6):void");
    }

    public final void l(b bVar) {
        boolean z10;
        g();
        h();
        Objects.requireNonNull((w2) this.f20505s);
        m1 q10 = ((w2) this.f20505s).q();
        byte[] b02 = ((w2) q10.f20505s).z().b0(bVar);
        if (b02.length > 131072) {
            ((w2) q10.f20505s).C().y.a("Conditional user property too long for local database. Sending directly to service");
            z10 = false;
        } else {
            z10 = q10.o(2, b02);
        }
        s(new z4(this, p(true), z10, new b(bVar)));
    }

    public final boolean m() {
        g();
        h();
        return this.f20389v != null;
    }

    public final boolean n() {
        g();
        h();
        return !o() || ((w2) this.f20505s).z().m0() >= f1.f20424n0.a(null).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.e5.o():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0187 -> B:43:0x0196). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y4.k6 p(boolean r38) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.e5.p(boolean):y4.k6");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<java.lang.Runnable>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<java.lang.Runnable>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<java.lang.Runnable>, java.util.ArrayList] */
    public final void q() {
        g();
        ((w2) this.f20505s).C().F.b("Processing queued up service tasks", Integer.valueOf(this.f20392z.size()));
        Iterator it = this.f20392z.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                ((w2) this.f20505s).C().f20710x.b("Task exception while flushing queue", e10);
            }
        }
        this.f20392z.clear();
        this.A.a();
    }

    public final void r() {
        g();
        r5 r5Var = this.y;
        r5Var.f20702b = r5Var.f20701a.b();
        v4 v4Var = this.f20391x;
        Objects.requireNonNull((w2) this.f20505s);
        v4Var.c(f1.J.a(null).longValue());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<java.lang.Runnable>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<java.lang.Runnable>, java.util.ArrayList] */
    public final void s(Runnable runnable) {
        g();
        if (m()) {
            runnable.run();
            return;
        }
        int size = this.f20392z.size();
        Objects.requireNonNull((w2) this.f20505s);
        if (size >= 1000) {
            ((w2) this.f20505s).C().f20710x.a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f20392z.add(runnable);
        this.A.c(60000L);
        v();
    }

    public final void t() {
        Objects.requireNonNull((w2) this.f20505s);
    }

    public final void v() {
        q1 q1Var;
        String str;
        g();
        h();
        if (m()) {
            return;
        }
        if (!o()) {
            if (((w2) this.f20505s).y.x()) {
                return;
            }
            Objects.requireNonNull((w2) this.f20505s);
            List<ResolveInfo> queryIntentServices = ((w2) this.f20505s).f20786s.getPackageManager().queryIntentServices(new Intent().setClassName(((w2) this.f20505s).f20786s, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                w2 w2Var = (w2) this.f20505s;
                Context context = w2Var.f20786s;
                Objects.requireNonNull(w2Var);
                intent.setComponent(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                d5 d5Var = this.f20388u;
                d5Var.f20361c.g();
                Context context2 = ((w2) d5Var.f20361c.f20505s).f20786s;
                a b10 = a.b();
                synchronized (d5Var) {
                    if (d5Var.f20359a) {
                        ((w2) d5Var.f20361c.f20505s).C().F.a("Connection attempt already in progress");
                    } else {
                        ((w2) d5Var.f20361c.f20505s).C().F.a("Using local app measurement service");
                        d5Var.f20359a = true;
                        b10.a(context2, intent, d5Var.f20361c.f20388u, 129);
                    }
                }
                return;
            }
            ((w2) this.f20505s).C().f20710x.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        d5 d5Var2 = this.f20388u;
        d5Var2.f20361c.g();
        Context context3 = ((w2) d5Var2.f20361c.f20505s).f20786s;
        synchronized (d5Var2) {
            if (d5Var2.f20359a) {
                q1Var = ((w2) d5Var2.f20361c.f20505s).C().F;
                str = "Connection attempt already in progress";
            } else if (d5Var2.f20360b != null && (d5Var2.f20360b.g() || d5Var2.f20360b.a())) {
                q1Var = ((w2) d5Var2.f20361c.f20505s).C().F;
                str = "Already awaiting connection attempt";
            } else {
                d5Var2.f20360b = new o1(context3, Looper.getMainLooper(), d5Var2, d5Var2);
                ((w2) d5Var2.f20361c.f20505s).C().F.a("Connecting to remote service");
                d5Var2.f20359a = true;
                m.h(d5Var2.f20360b);
                d5Var2.f20360b.n();
            }
            q1Var.a(str);
        }
    }

    public final void w() {
        g();
        h();
        d5 d5Var = this.f20388u;
        if (d5Var.f20360b != null && (d5Var.f20360b.a() || d5Var.f20360b.g())) {
            d5Var.f20360b.p();
        }
        d5Var.f20360b = null;
        try {
            a.b().c(((w2) this.f20505s).f20786s, this.f20388u);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f20389v = null;
    }

    public final void x(AtomicReference<String> atomicReference) {
        g();
        h();
        s(new s4(this, atomicReference, p(false)));
    }
}
