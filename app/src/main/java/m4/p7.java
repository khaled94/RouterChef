package m4;

import k4.a;
import l3.s;

/* loaded from: classes.dex */
public final class p7 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f12417s;

    /* renamed from: t */
    public final /* synthetic */ Object f12418t;

    public /* synthetic */ p7(Object obj, int i10) {
        this.f12417s = i10;
        this.f12418t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12417s) {
            case 0:
                synchronized (((q7) this.f12418t).C) {
                    if (((q7) this.f12418t).D) {
                        return;
                    }
                    ((q7) this.f12418t).D = true;
                    try {
                        q7.i((q7) this.f12418t);
                    } catch (Exception e10) {
                        ((q7) this.f12418t).f12721x.c(2023, -1L, e10);
                    }
                    synchronized (((q7) this.f12418t).C) {
                        ((q7) this.f12418t).D = false;
                    }
                    return;
                }
            case 1:
                s.B.f5807v.a().zze((a) this.f12418t);
                return;
            default:
                ((zj1) this.f12418t).N3(5);
                return;
        }
    }
}
