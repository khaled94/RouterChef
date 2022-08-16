package m4;

import android.content.ComponentName;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import y4.d5;
import y4.e;
import y4.e1;
import y4.e5;
import y4.f1;
import y4.f4;
import y4.w2;

/* loaded from: classes.dex */
public final class r3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f13131s;

    /* renamed from: t */
    public final /* synthetic */ Object f13132t;

    /* renamed from: u */
    public final /* synthetic */ Object f13133u;

    public /* synthetic */ r3(Object obj, Object obj2, int i10) {
        this.f13131s = i10;
        this.f13133u = obj;
        this.f13132t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13131s) {
            case 0:
                try {
                    ((s3) this.f13133u).f13502t.put((e4) this.f13132t);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 1:
                synchronized (((AtomicReference) this.f13132t)) {
                    AtomicReference atomicReference = (AtomicReference) this.f13132t;
                    Object obj = this.f13133u;
                    e eVar = ((w2) ((f4) obj).f20505s).y;
                    String l10 = ((w2) ((f4) obj).f20505s).p().l();
                    e1<String> e1Var = f1.L;
                    Objects.requireNonNull(eVar);
                    atomicReference.set(e1Var.a(l10 == null ? null : eVar.f20369u.e(l10, e1Var.f20373a)));
                    ((AtomicReference) this.f13132t).notify();
                }
                return;
            default:
                e5.u(((d5) this.f13133u).f20361c, (ComponentName) this.f13132t);
                return;
        }
    }
}
