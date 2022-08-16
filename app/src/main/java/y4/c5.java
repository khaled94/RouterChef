package y4;

import android.os.RemoteException;
import android.text.TextUtils;
import d4.m;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c5 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ AtomicReference f20343s;

    /* renamed from: t */
    public final /* synthetic */ String f20344t;

    /* renamed from: u */
    public final /* synthetic */ String f20345u;

    /* renamed from: v */
    public final /* synthetic */ k6 f20346v;

    /* renamed from: w */
    public final /* synthetic */ boolean f20347w;

    /* renamed from: x */
    public final /* synthetic */ e5 f20348x;

    public c5(e5 e5Var, AtomicReference atomicReference, String str, String str2, k6 k6Var, boolean z10) {
        this.f20348x = e5Var;
        this.f20343s = atomicReference;
        this.f20344t = str;
        this.f20345u = str2;
        this.f20346v = k6Var;
        this.f20347w = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5 e5Var;
        j1 j1Var;
        List<d6> list;
        AtomicReference atomicReference;
        synchronized (this.f20343s) {
            try {
                e5Var = this.f20348x;
                j1Var = e5Var.f20389v;
            } catch (RemoteException e10) {
                ((w2) this.f20348x.f20505s).C().f20710x.d("(legacy) Failed to get user properties; remote exception", null, this.f20344t, e10);
                this.f20343s.set(Collections.emptyList());
            }
            if (j1Var == null) {
                ((w2) e5Var.f20505s).C().f20710x.d("(legacy) Failed to get user properties; not connected to service", null, this.f20344t, this.f20345u);
                this.f20343s.set(Collections.emptyList());
                this.f20343s.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                m.h(this.f20346v);
                atomicReference = this.f20343s;
                list = j1Var.a2(this.f20344t, this.f20345u, this.f20347w, this.f20346v);
            } else {
                atomicReference = this.f20343s;
                list = j1Var.d1(null, this.f20344t, this.f20345u, this.f20347w);
            }
            atomicReference.set(list);
            this.f20348x.r();
            this.f20343s.notify();
        }
    }
}
