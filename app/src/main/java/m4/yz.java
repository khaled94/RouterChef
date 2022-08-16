package m4;

import h2.i;
import n3.g1;

/* loaded from: classes.dex */
public final class yz implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ d00 f15922s;

    /* renamed from: t */
    public final /* synthetic */ lz f15923t;

    /* renamed from: u */
    public final /* synthetic */ e00 f15924u;

    public yz(e00 e00Var, d00 d00Var, lz lzVar) {
        this.f15924u = e00Var;
        this.f15922s = d00Var;
        this.f15923t = lzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15924u.f7676a) {
            if (this.f15922s.c() != -1 && this.f15922s.c() != 1) {
                this.f15922s.d();
                u90.f14298e.execute(new i(this.f15923t, 2));
                g1.a("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
