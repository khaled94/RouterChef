package z3;

import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Objects;
import l3.s;
import m4.hb;
import m4.me0;
import m4.mh0;
import m4.n90;
import m4.or;
import m4.u90;
import m4.vd0;
import m4.w90;
import m4.y71;
import m4.zp1;
import n3.j0;
import n3.k1;
import n3.t;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f20945s;

    /* renamed from: t */
    public final /* synthetic */ Object f20946t;

    /* renamed from: u */
    public final /* synthetic */ Object f20947u;

    public /* synthetic */ k(Object obj, Object obj2, int i10) {
        this.f20945s = i10;
        this.f20946t = obj;
        this.f20947u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String message;
        switch (this.f20945s) {
            case 0:
                m mVar = (m) this.f20946t;
                IBinder iBinder = (IBinder) this.f20947u;
                synchronized (mVar) {
                    try {
                        if (iBinder == null) {
                            message = "Null service connection";
                        } else {
                            try {
                                mVar.f20953c = new n(iBinder);
                                mVar.f20951a = 2;
                                mVar.f20956f.f20965b.execute(new t(mVar, 1));
                            } catch (RemoteException e10) {
                                message = e10.getMessage();
                            }
                        }
                        mVar.a(0, message);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            case 2:
                ((n90) this.f20946t).b((String) this.f20947u);
                return;
            case 3:
                u90.f14298e.execute(new hb((mh0) this.f20946t, (Runnable) this.f20947u, 1, null));
                return;
            case 4:
                w90 w90Var = (w90) this.f20947u;
                String str = ((k1) s.B.f5793g.c()).e().f14602e;
                if (!TextUtils.isEmpty(str)) {
                    w90Var.a(str);
                    return;
                } else {
                    w90Var.c(new Exception());
                    return;
                }
            case 5:
                y71 y71Var = (y71) this.f20946t;
                vd0 vd0Var = (vd0) this.f20947u;
                Objects.requireNonNull(y71Var);
                vd0Var.t0();
                me0 p = vd0Var.p();
                or orVar = y71Var.f15606d.f12200a;
                if (orVar == null || p == null) {
                    return;
                }
                p.P3(orVar);
                return;
            default:
                ((zp1) this.f20946t).f16306b.b((String) this.f20947u);
                return;
        }
    }

    public k(j0 j0Var, String str) {
        this.f20945s = 1;
        this.f20947u = j0Var;
        this.f20946t = str;
    }
}
