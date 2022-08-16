package y4;

/* loaded from: classes.dex */
public final class s3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ String f20716s;

    /* renamed from: t */
    public final /* synthetic */ String f20717t;

    /* renamed from: u */
    public final /* synthetic */ Object f20718u;

    /* renamed from: v */
    public final /* synthetic */ long f20719v;

    /* renamed from: w */
    public final /* synthetic */ f4 f20720w;

    public s3(f4 f4Var, String str, String str2, Object obj, long j3) {
        this.f20720w = f4Var;
        this.f20716s = str;
        this.f20717t = str2;
        this.f20718u = obj;
        this.f20719v = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20720w.D(this.f20716s, this.f20717t, this.f20718u, this.f20719v);
    }
}
