package s4;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class z1 implements Runnable {

    /* renamed from: s */
    public final long f18212s = System.currentTimeMillis();

    /* renamed from: t */
    public final long f18213t = SystemClock.elapsedRealtime();

    /* renamed from: u */
    public final boolean f18214u;

    /* renamed from: v */
    public final /* synthetic */ k2 f18215v;

    public z1(k2 k2Var, boolean z10) {
        this.f18215v = k2Var;
        Objects.requireNonNull(k2Var);
        this.f18214u = z10;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18215v.f17954e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f18215v.a(e10, false, this.f18214u);
            b();
        }
    }
}
