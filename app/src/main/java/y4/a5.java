package y4;

import android.os.RemoteException;
import android.text.TextUtils;
import d4.m;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a5 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ AtomicReference f20287s;

    /* renamed from: t */
    public final /* synthetic */ String f20288t;

    /* renamed from: u */
    public final /* synthetic */ String f20289u;

    /* renamed from: v */
    public final /* synthetic */ k6 f20290v;

    /* renamed from: w */
    public final /* synthetic */ e5 f20291w;

    public a5(e5 e5Var, AtomicReference atomicReference, String str, String str2, k6 k6Var) {
        this.f20291w = e5Var;
        this.f20287s = atomicReference;
        this.f20288t = str;
        this.f20289u = str2;
        this.f20290v = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5 e5Var;
        j1 j1Var;
        List<b> list;
        AtomicReference atomicReference;
        synchronized (this.f20287s) {
            try {
                e5Var = this.f20291w;
                j1Var = e5Var.f20389v;
            } catch (RemoteException e10) {
                ((w2) this.f20291w.f20505s).C().f20710x.d("(legacy) Failed to get conditional properties; remote exception", null, this.f20288t, e10);
                this.f20287s.set(Collections.emptyList());
            }
            if (j1Var == null) {
                ((w2) e5Var.f20505s).C().f20710x.d("(legacy) Failed to get conditional properties; not connected to service", null, this.f20288t, this.f20289u);
                this.f20287s.set(Collections.emptyList());
                this.f20287s.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                m.h(this.f20290v);
                atomicReference = this.f20287s;
                list = j1Var.K3(this.f20288t, this.f20289u, this.f20290v);
            } else {
                atomicReference = this.f20287s;
                list = j1Var.V1(null, this.f20288t, this.f20289u);
            }
            atomicReference.set(list);
            this.f20291w.r();
            this.f20287s.notify();
        }
    }
}
