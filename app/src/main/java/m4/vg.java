package m4;

import androidx.activity.k;
import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class vg implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f14674a;

    /* renamed from: b */
    public final Serializable f14675b;

    public vg() {
        this.f14674a = 1;
        this.f14675b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f14674a) {
            case 0:
                return new Thread(runnable, (String) this.f14675b);
            default:
                return new Thread(runnable, k.a(25, "AdWorker(NG) #", ((AtomicInteger) this.f14675b).getAndIncrement()));
        }
    }

    public vg(String str) {
        this.f14674a = 0;
        this.f14675b = "Loader:ExtractorMediaPeriod";
    }
}
