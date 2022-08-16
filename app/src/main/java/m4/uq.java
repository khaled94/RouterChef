package m4;

import android.os.RemoteException;
import f3.b;
import f3.m;
import n3.g1;

/* loaded from: classes.dex */
public final class uq extends b {

    /* renamed from: a */
    public final Object f14472a = new Object();

    /* renamed from: b */
    public b f14473b;

    /* renamed from: c */
    public final /* synthetic */ vq f14474c;

    public uq(vq vqVar) {
        this.f14474c = vqVar;
    }

    @Override // f3.b
    public final void N() {
        synchronized (this.f14472a) {
            b bVar = this.f14473b;
            if (bVar != null) {
                bVar.N();
            }
        }
    }

    @Override // f3.b
    public final void b() {
        synchronized (this.f14472a) {
            b bVar = this.f14473b;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // f3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(f3.h r4) {
        /*
            r3 = this;
            m4.vq r0 = r3.f14474c
            f3.m r1 = r0.f14758c
            m4.dp r0 = r0.f14764i
            if (r0 == 0) goto L13
            m4.lq r0 = r0.l()     // Catch: android.os.RemoteException -> Ld
            goto L14
        Ld:
            r0 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            n3.g1.l(r2, r0)
        L13:
            r0 = 0
        L14:
            r1.a(r0)
            java.lang.Object r0 = r3.f14472a
            monitor-enter(r0)
            f3.b r1 = r3.f14473b     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L21
            r1.c(r4)     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.uq.c(f3.h):void");
    }

    @Override // f3.b
    public final void d() {
        synchronized (this.f14472a) {
            b bVar = this.f14473b;
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    @Override // f3.b
    public final void e() {
        vq vqVar = this.f14474c;
        m mVar = vqVar.f14758c;
        dp dpVar = vqVar.f14764i;
        lq lqVar = null;
        if (dpVar != null) {
            try {
                lqVar = dpVar.l();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
        }
        mVar.a(lqVar);
        synchronized (this.f14472a) {
            b bVar = this.f14473b;
            if (bVar != null) {
                bVar.e();
            }
        }
    }

    @Override // f3.b
    public final void f() {
        synchronized (this.f14472a) {
            b bVar = this.f14473b;
            if (bVar != null) {
                bVar.f();
            }
        }
    }
}
