package s4;

import android.database.ContentObserver;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w4 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ x4 f18163a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(x4 x4Var) {
        super(null);
        this.f18163a = x4Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<s4.y4>, java.util.ArrayList] */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        x4 x4Var = this.f18163a;
        synchronized (x4Var.f18182d) {
            x4Var.f18183e = null;
            n5.f18020h.incrementAndGet();
        }
        synchronized (x4Var) {
            Iterator it = x4Var.f18184f.iterator();
            while (it.hasNext()) {
                ((y4) it.next()).zza();
            }
        }
    }
}
