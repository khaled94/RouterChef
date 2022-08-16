package a3;

import c3.b;
import com.raouf.routerchef.LimitWifiSpeed;
import com.raouf.routerchef.SpeedTest;
import t2.r;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f99s;

    /* renamed from: t */
    public final /* synthetic */ Object f100t;

    public /* synthetic */ u(Object obj, int i10) {
        this.f99s = i10;
        this.f100t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f99s) {
            case 0:
                final v vVar = (v) this.f100t;
                vVar.f104d.b(new b.a() { // from class: a3.t
                    @Override // c3.b.a
                    public final Object a() {
                        v vVar2 = v.this;
                        for (r rVar : vVar2.f102b.E()) {
                            vVar2.f103c.a(rVar, 1);
                        }
                        return null;
                    }
                });
                return;
            case 1:
                ((LimitWifiSpeed) this.f100t).f3548h0.b();
                return;
            default:
                SpeedTest speedTest = (SpeedTest) this.f100t;
                speedTest.U.n(0.0f, 1000L);
                speedTest.U.setMaxSpeed(100.0f);
                speedTest.U.setWithTremble(false);
                return;
        }
    }
}
