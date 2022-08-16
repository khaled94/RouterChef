package m4;

import s3.f;

/* loaded from: classes.dex */
public final class a00 extends aa0 {

    /* renamed from: u */
    public final Object f5991u = new Object();

    /* renamed from: v */
    public final d00 f5992v;

    /* renamed from: w */
    public boolean f5993w;

    public a00(d00 d00Var) {
        this.f5992v = d00Var;
    }

    public final void g() {
        synchronized (this.f5991u) {
            if (this.f5993w) {
                return;
            }
            this.f5993w = true;
            f(new ok1(this), new eb());
            f(new f(this, 1), new e7(this, 1));
        }
    }
}
