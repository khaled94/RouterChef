package c5;

import java.util.Objects;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ i f2799s;

    /* renamed from: t */
    public final /* synthetic */ u f2800t;

    public t(u uVar, i iVar) {
        this.f2800t = uVar;
        this.f2799s = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2800t.f2802t) {
            try {
                e eVar = this.f2800t.f2803u;
                if (eVar != null) {
                    Exception i10 = this.f2799s.i();
                    Objects.requireNonNull(i10, "null reference");
                    eVar.e(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
