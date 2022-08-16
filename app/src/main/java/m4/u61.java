package m4;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class u61 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f14260a;

    /* renamed from: b */
    public final /* synthetic */ Object f14261b;

    public /* synthetic */ u61(Object obj, int i10) {
        this.f14260a = i10;
        this.f14261b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14260a) {
            case 0:
                return ((v61) this.f14261b).getWritableDatabase();
            case 1:
                return new of1(((nf1) this.f14261b).f11654b);
            default:
                return ((kh1) this.f14261b).b();
        }
    }
}
