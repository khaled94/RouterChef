package m4;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class mg {

    /* renamed from: a */
    public final ExecutorService f11182a = Executors.newSingleThreadExecutor(new vg("Loader:ExtractorMediaPeriod"));

    /* renamed from: b */
    public kg<? extends qe> f11183b;

    /* renamed from: c */
    public IOException f11184c;

    public mg() {
        int i10 = wg.f14958a;
    }

    public final void a() {
        IOException iOException = this.f11184c;
        if (iOException == null) {
            kg<? extends qe> kgVar = this.f11183b;
            if (kgVar == null) {
                return;
            }
            int i10 = kgVar.f10407u;
            IOException iOException2 = kgVar.f10409w;
            if (iOException2 != null && kgVar.f10410x > i10) {
                throw iOException2;
            }
            return;
        }
        throw iOException;
    }

    public final boolean b() {
        return this.f11183b != null;
    }
}
