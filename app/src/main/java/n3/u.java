package n3;

import java.util.Objects;
import l3.s;
import m4.vd0;
import z3.m;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f16574s;

    /* renamed from: t */
    public final /* synthetic */ Object f16575t;

    public /* synthetic */ u(Object obj, int i10) {
        this.f16574s = i10;
        this.f16575t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16574s) {
            case 0:
                v vVar = (v) this.f16575t;
                Objects.requireNonNull(vVar);
                s.B.f5799m.a(vVar.f16577a);
                return;
            case 1:
                m mVar = (m) this.f16575t;
                synchronized (mVar) {
                    if (mVar.f20951a == 1) {
                        mVar.a(1, "Timed out while binding");
                    }
                }
                return;
            default:
                ((vd0) this.f16575t).a0();
                return;
        }
    }
}
