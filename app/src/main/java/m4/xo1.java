package m4;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xo1 implements k71 {

    /* renamed from: b */
    public static final List<ho1> f15434b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f15435a;

    public xo1(Handler handler) {
        this.f15435a = handler;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<m4.ho1>, java.util.ArrayList] */
    public static ho1 g() {
        ho1 ho1Var;
        ?? r02 = f15434b;
        synchronized (r02) {
            ho1Var = r02.isEmpty() ? new ho1(null) : (ho1) r02.remove(r02.size() - 1);
        }
        return ho1Var;
    }

    public final s61 a(int i10) {
        ho1 g10 = g();
        g10.f9396a = this.f15435a.obtainMessage(i10);
        return g10;
    }

    public final s61 b(int i10, Object obj) {
        ho1 g10 = g();
        g10.f9396a = this.f15435a.obtainMessage(i10, obj);
        return g10;
    }

    public final void c() {
        this.f15435a.removeMessages(2);
    }

    public final boolean d(Runnable runnable) {
        return this.f15435a.post(runnable);
    }

    public final boolean e(int i10) {
        return this.f15435a.sendEmptyMessage(i10);
    }

    public final boolean f(s61 s61Var) {
        Handler handler = this.f15435a;
        ho1 ho1Var = (ho1) s61Var;
        Message message = ho1Var.f9396a;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        ho1Var.b();
        return sendMessageAtFrontOfQueue;
    }
}
