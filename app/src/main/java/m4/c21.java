package m4;

import android.content.Context;
import android.os.RemoteException;
import d4.m;
import java.util.Objects;
import k4.b;
import n3.g1;

/* loaded from: classes.dex */
public final class c21 implements s11 {

    /* renamed from: a */
    public final long f6698a;

    /* renamed from: b */
    public final fk0 f6699b;

    /* renamed from: c */
    public final yl1 f6700c;

    public c21(long j3, Context context, fk0 fk0Var, if0 if0Var, String str) {
        this.f6698a = j3;
        this.f6699b = fk0Var;
        y20 z10 = if0Var.z();
        Objects.requireNonNull(context);
        z10.f15574t = context;
        z10.f15575u = str;
        this.f6700c = z10.d().f6535h.a();
    }

    @Override // m4.s11
    public final void a(jn jnVar) {
        try {
            yl1 yl1Var = this.f6700c;
            a21 a21Var = new a21(this);
            synchronized (yl1Var) {
                yl1Var.R3(jnVar, a21Var, 2);
            }
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    @Override // m4.s11
    public final void c() {
        try {
            yl1 yl1Var = this.f6700c;
            b21 b21Var = new b21(this);
            Objects.requireNonNull(yl1Var);
            m.d("#008 Must be called on the main UI thread.");
            yl1Var.f15832t.f13734v.set(b21Var);
            yl1 yl1Var2 = this.f6700c;
            b bVar = new b(null);
            synchronized (yl1Var2) {
                yl1Var2.Q3(bVar, yl1Var2.y);
            }
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    @Override // m4.s11
    public final void zza() {
    }
}
