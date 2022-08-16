package m4;

import android.content.Context;
import android.os.RemoteException;
import n3.g1;

/* loaded from: classes.dex */
public final class gc1 extends vo {

    /* renamed from: s */
    public final qc1 f8822s;

    public gc1(Context context, if0 if0Var, nm1 nm1Var, lv0 lv0Var, po poVar) {
        sc1 sc1Var = new sc1(lv0Var, if0Var.B());
        sc1Var.f13591b.b(poVar);
        this.f8822s = new qc1(new xc1(if0Var, context, sc1Var, nm1Var), nm1Var.f11841c);
    }

    @Override // m4.wo
    public final void D1(jn jnVar) {
        this.f8822s.a(jnVar, 1);
    }

    @Override // m4.wo
    public final synchronized String b() {
        String str;
        qc1 qc1Var = this.f8822s;
        synchronized (qc1Var) {
            str = null;
            try {
                iq iqVar = qc1Var.f12785c;
                if (iqVar != null) {
                    str = iqVar.b();
                }
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
        }
        return str;
    }

    @Override // m4.wo
    public final synchronized String d() {
        String str;
        qc1 qc1Var = this.f8822s;
        synchronized (qc1Var) {
            str = null;
            try {
                iq iqVar = qc1Var.f12785c;
                if (iqVar != null) {
                    str = iqVar.b();
                }
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
        }
        return str;
    }

    @Override // m4.wo
    public final synchronized boolean h() {
        boolean zza;
        qc1 qc1Var = this.f8822s;
        synchronized (qc1Var) {
            zza = qc1Var.f12783a.zza();
        }
        return zza;
    }

    @Override // m4.wo
    public final synchronized void y1(jn jnVar, int i10) {
        this.f8822s.a(jnVar, i10);
    }
}
