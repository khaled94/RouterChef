package m4;

import n3.h1;
import n3.s1;

/* loaded from: classes.dex */
public final class hb0 implements Runnable {

    /* renamed from: s */
    public final ta0 f9175s;

    /* renamed from: t */
    public boolean f9176t = false;

    public hb0(ta0 ta0Var) {
        this.f9175s = ta0Var;
    }

    public final void a() {
        this.f9176t = true;
        this.f9175s.k();
    }

    public final void b() {
        this.f9176t = false;
        h1 h1Var = s1.f16555i;
        h1Var.removeCallbacks(this);
        h1Var.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f9176t) {
            this.f9175s.k();
            h1 h1Var = s1.f16555i;
            h1Var.removeCallbacks(this);
            h1Var.postDelayed(this, 250L);
        }
    }
}
