package m4;

import android.os.Bundle;
import java.util.Objects;
import y4.f4;

/* loaded from: classes.dex */
public final /* synthetic */ class mz implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f11361s;

    /* renamed from: t */
    public final Object f11362t;

    /* renamed from: u */
    public final Object f11363u;

    public /* synthetic */ mz(Object obj, Object obj2, int i10) {
        this.f11361s = i10;
        this.f11362t = obj;
        this.f11363u = obj2;
    }

    private final void a() {
        pg2 pg2Var = (pg2) this.f11362t;
        o02 o02Var = (o02) this.f11363u;
        Objects.requireNonNull(pg2Var);
        synchronized (o02Var) {
        }
        qg2 qg2Var = pg2Var.f12510b;
        int i10 = ls1.f10971a;
        qg2Var.f(o02Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v13, types: [m4.gw1<java.lang.String>, m4.gx1] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.mz.run():void");
    }

    public final String toString() {
        switch (this.f11361s) {
            case 3:
                fu1 fu1Var = new fu1(mz.class.getSimpleName());
                du1 du1Var = new du1();
                ((du1) fu1Var.f8650d).f7644b = du1Var;
                fu1Var.f8650d = du1Var;
                du1Var.f7643a = (kz1) this.f11363u;
                return fu1Var.toString();
            default:
                return super.toString();
        }
    }

    public mz(f4 f4Var, Bundle bundle) {
        this.f11361s = 5;
        this.f11363u = f4Var;
        this.f11362t = bundle;
    }
}
