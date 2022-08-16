package m4;

/* loaded from: classes.dex */
public final class ia0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ String f9570s;

    /* renamed from: t */
    public final /* synthetic */ String f9571t;

    /* renamed from: u */
    public final /* synthetic */ na0 f9572u;

    public ia0(na0 na0Var, String str, String str2) {
        this.f9572u = na0Var;
        this.f9570s = str;
        this.f9571t = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oa0 oa0Var = this.f9572u.H;
        if (oa0Var != null) {
            ((ta0) oa0Var).d(this.f9570s, this.f9571t);
        }
    }
}
