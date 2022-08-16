package m4;

import c5.b0;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class wu0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f15111s;

    /* renamed from: t */
    public final /* synthetic */ Object f15112t;

    /* renamed from: u */
    public final /* synthetic */ Object f15113u;

    public /* synthetic */ wu0(Object obj, Object obj2, int i10) {
        this.f15111s = i10;
        this.f15112t = obj;
        this.f15113u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15111s) {
            case 0:
                ((av0) this.f15112t).j((lw0) this.f15113u);
                return;
            default:
                try {
                    ((b0) this.f15112t).r(((Callable) this.f15113u).call());
                    return;
                } catch (Exception e10) {
                    ((b0) this.f15112t).q(e10);
                    return;
                } catch (Throwable th) {
                    ((b0) this.f15112t).q(new RuntimeException(th));
                    return;
                }
        }
    }
}
