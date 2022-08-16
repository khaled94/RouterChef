package m4;

/* loaded from: classes.dex */
public final /* synthetic */ class yu0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f15907s;

    /* renamed from: t */
    public final /* synthetic */ Object f15908t;

    public /* synthetic */ yu0(Object obj, int i10) {
        this.f15907s = i10;
        this.f15908t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15907s) {
            case 0:
                ((jv0) this.f15908t).k();
                return;
            default:
                ((of2) this.f15908t).d();
                return;
        }
    }
}
