package m4;

import android.os.Message;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ho1 implements s61 {

    /* renamed from: a */
    public Message f9396a;

    public ho1() {
    }

    public /* synthetic */ ho1(mz1 mz1Var) {
    }

    public final void a() {
        Message message = this.f9396a;
        Objects.requireNonNull(message);
        message.sendToTarget();
        b();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<m4.ho1>, java.util.ArrayList] */
    public final void b() {
        this.f9396a = null;
        ?? r02 = xo1.f15434b;
        synchronized (r02) {
            if (r02.size() < 50) {
                r02.add(this);
            }
        }
    }
}
