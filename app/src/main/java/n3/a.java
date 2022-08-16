package n3;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f16435s;

    /* renamed from: t */
    public final /* synthetic */ Object f16436t;

    public /* synthetic */ a(Object obj, int i10) {
        this.f16435s = i10;
        this.f16436t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16435s) {
            case 0:
                Thread.currentThread();
                Objects.requireNonNull((z) this.f16436t);
                ((z) this.f16436t).a();
                return;
            default:
                ((k1) this.f16436t).w();
                return;
        }
    }
}
