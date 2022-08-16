package u1;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import e2.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import t1.h;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ c f19035s;

    /* renamed from: t */
    public final /* synthetic */ String f19036t;

    /* renamed from: u */
    public final /* synthetic */ n f19037u;

    public m(n nVar, c cVar, String str) {
        this.f19037u = nVar;
        this.f19035s = cVar;
        this.f19036t = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        Throwable e10;
        try {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.f19035s.get();
                if (aVar == null) {
                    h.c().b(n.L, String.format("%s returned a null result. Treating it as a failure.", this.f19037u.f19042w.f2637c), new Throwable[0]);
                } else {
                    h.c().a(n.L, String.format("%s returned a %s result.", this.f19037u.f19042w.f2637c, aVar), new Throwable[0]);
                    this.f19037u.f19044z = aVar;
                }
            } catch (InterruptedException e11) {
                e10 = e11;
                h.c().b(n.L, String.format("%s failed because it threw an exception/error", this.f19036t), e10);
            } catch (CancellationException e12) {
                h.c().d(n.L, String.format("%s was cancelled", this.f19036t), e12);
            } catch (ExecutionException e13) {
                e10 = e13;
                h.c().b(n.L, String.format("%s failed because it threw an exception/error", this.f19036t), e10);
            }
        } finally {
            this.f19037u.c();
        }
    }
}
