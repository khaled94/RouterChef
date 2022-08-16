package y4;

/* loaded from: classes.dex */
public final class g3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ String f20472s;

    /* renamed from: t */
    public final /* synthetic */ String f20473t;

    /* renamed from: u */
    public final /* synthetic */ h3 f20474u;

    public g3(h3 h3Var, String str, String str2, String str3, long j3) {
        this.f20474u = h3Var;
        this.f20472s = str;
        this.f20473t = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20472s == null) {
            this.f20474u.f20483s.D.w().q(this.f20473t);
            return;
        }
        p4 w10 = this.f20474u.f20483s.D.w();
        String str = this.f20473t;
        w10.g();
        synchronized (w10) {
            String str2 = w10.E;
            if (str2 != null) {
                str2.equals(str);
            }
            w10.E = str;
        }
    }
}
