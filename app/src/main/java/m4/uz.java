package m4;

/* loaded from: classes.dex */
public final /* synthetic */ class uz implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f14535s;

    /* renamed from: t */
    public final /* synthetic */ Object f14536t;

    public /* synthetic */ uz(Object obj, int i10) {
        this.f14535s = i10;
        this.f14536t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14535s) {
            case 0:
                ((lz) this.f14536t).c();
                return;
            default:
                ((pa0) this.f14536t).x();
                return;
        }
    }
}
