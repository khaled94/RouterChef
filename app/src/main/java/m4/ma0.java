package m4;

import android.util.Log;
import c5.j;

/* loaded from: classes.dex */
public final class ma0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f11125s;

    /* renamed from: t */
    public final /* synthetic */ Object f11126t;

    public /* synthetic */ ma0(Object obj, int i10) {
        this.f11125s = i10;
        this.f11126t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11125s) {
            case 0:
                oa0 oa0Var = ((na0) this.f11126t).H;
                if (oa0Var == null) {
                    return;
                }
                ((ta0) oa0Var).e();
                return;
            case 1:
                ((ti0) this.f11126t).a();
                return;
            default:
                rt1 rt1Var = new rt1();
                Log.d("GASS", "Clearcut logging disabled");
                ((j) this.f11126t).b(new nt1(rt1Var));
                return;
        }
    }
}
