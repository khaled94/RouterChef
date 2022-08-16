package m4;

import androidx.fragment.app.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class yz1 extends iy1<Void> implements Runnable {

    /* renamed from: z */
    public final Runnable f15932z;

    public yz1(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.f15932z = runnable;
    }

    @Override // m4.my1
    public final String h() {
        String valueOf = String.valueOf(this.f15932z);
        return a.b(new StringBuilder(valueOf.length() + 7), "task=[", valueOf, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f15932z.run();
        } catch (Throwable th) {
            m(th);
            Object obj = ou1.f12294a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw th;
        }
    }
}
