package m4;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.util.regex.Pattern;
import n3.g1;
import t3.i;

/* loaded from: classes.dex */
public final /* synthetic */ class np0 implements ar0, ye0, rk1, v91, kz1, ag, wy1, aj2 {

    /* renamed from: s */
    public final /* synthetic */ int f11880s;

    /* renamed from: t */
    public final Object f11881t;

    public /* synthetic */ np0(Object obj, int i10) {
        this.f11880s = i10;
        this.f11881t = obj;
    }

    @Override // m4.ye0
    public void J(boolean z10) {
        ((v90) this.f11881t).d();
    }

    @Override // m4.kz1
    public /* synthetic */ void a(Object obj) {
        switch (this.f11880s) {
            case 0:
                i iVar = (i) obj;
                g1.e("Initialized webview successfully for SDKCore.");
                return;
            default:
                try {
                    ((l50) this.f11881t).t0((ParcelFileDescriptor) obj);
                    return;
                } catch (RemoteException e10) {
                    g1.b("Service can't call client", e10);
                    return;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[Catch: RemoteException -> 0x0052, TryCatch #0 {RemoteException -> 0x0052, blocks: (B:6:0x0024, B:8:0x0034, B:14:0x0040, B:15:0x0043, B:16:0x0047), top: B:20:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[Catch: RemoteException -> 0x0052, TryCatch #0 {RemoteException -> 0x0052, blocks: (B:6:0x0024, B:8:0x0034, B:14:0x0040, B:15:0x0043, B:16:0x0047), top: B:20:0x0024 }] */
    @Override // m4.kz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(java.lang.Throwable r5) {
        /*
            r4 = this;
            int r0 = r4.f11880s
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L24
        L6:
            l3.s r0 = l3.s.B
            m4.z80 r0 = r0.f5793g
            java.lang.String r1 = "SignalGeneratorImpl.initializeWebViewForSignalCollection"
            r0.g(r5, r1)
            java.lang.Object r0 = r4.f11881t
            t3.z r0 = (t3.z) r0
            java.lang.String r1 = r5.getMessage()
            java.lang.String r2 = "sgf"
            java.lang.String r3 = "sgf_reason"
            t3.z.S3(r0, r2, r3, r1)
            java.lang.String r0 = "Failed to initialize webview for loading SDKCore. "
            n3.g1.h(r0, r5)
            return
        L24:
            java.lang.Object r0 = r4.f11881t     // Catch: android.os.RemoteException -> L52
            m4.l50 r0 = (m4.l50) r0     // Catch: android.os.RemoteException -> L52
            m4.cn r1 = a6.f.i(r5)     // Catch: android.os.RemoteException -> L52
            java.lang.String r2 = r5.getMessage()     // Catch: android.os.RemoteException -> L52
            int r3 = m4.gu1.f9052a     // Catch: android.os.RemoteException -> L52
            if (r2 == 0) goto L3d
            boolean r2 = r2.isEmpty()     // Catch: android.os.RemoteException -> L52
            if (r2 == 0) goto L3b
            goto L3d
        L3b:
            r2 = 0
            goto L3e
        L3d:
            r2 = 1
        L3e:
            if (r2 == 0) goto L43
            java.lang.String r5 = r1.f7068t     // Catch: android.os.RemoteException -> L52
            goto L47
        L43:
            java.lang.String r5 = r5.getMessage()     // Catch: android.os.RemoteException -> L52
        L47:
            n3.d0 r2 = new n3.d0     // Catch: android.os.RemoteException -> L52
            int r1 = r1.f7067s     // Catch: android.os.RemoteException -> L52
            r2.<init>(r5, r1)     // Catch: android.os.RemoteException -> L52
            r0.W0(r2)     // Catch: android.os.RemoteException -> L52
            goto L58
        L52:
            r5 = move-exception
            java.lang.String r0 = "Service can't call client"
            n3.g1.b(r0, r5)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.np0.f(java.lang.Throwable):void");
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public int mo30h(Object obj) {
        t tVar = (t) this.f11881t;
        qi2 qi2Var = (qi2) obj;
        Pattern pattern = bj2.f6548a;
        try {
            return !qi2Var.c(tVar) ? 0 : 1;
        } catch (wi2 unused) {
            return -1;
        }
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        switch (this.f11880s) {
            case 0:
                ((qp0) obj).Q((am0) this.f11881t);
                return;
            default:
                gg2 gg2Var = (gg2) obj;
                return;
        }
    }

    @Override // m4.ag
    /* renamed from: zza */
    public bg mo26zza() {
        return new zf((byte[]) this.f11881t);
    }

    @Override // m4.ag
    /* renamed from: zza */
    public tz1 mo26zza() {
        return mz1.m(null);
    }

    public /* synthetic */ np0(Object obj, Object obj2, int i10) {
        this.f11880s = i10;
        this.f11881t = obj2;
    }

    public /* synthetic */ np0(fg2 fg2Var) {
        this.f11880s = 4;
        this.f11881t = fg2Var;
    }
}
