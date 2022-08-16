package y4;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class s2<V> extends FutureTask<V> implements Comparable<s2<V>> {

    /* renamed from: s */
    public final long f20712s;

    /* renamed from: t */
    public final boolean f20713t;

    /* renamed from: u */
    public final String f20714u;

    /* renamed from: v */
    public final /* synthetic */ u2 f20715v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(u2 u2Var, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.f20715v = u2Var;
        long andIncrement = u2.C.getAndIncrement();
        this.f20712s = andIncrement;
        this.f20714u = str;
        this.f20713t = z10;
        if (andIncrement == Long.MAX_VALUE) {
            ((w2) u2Var.f20505s).C().f20710x.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s2 s2Var = (s2) obj;
        boolean z10 = this.f20713t;
        if (z10 == s2Var.f20713t) {
            int i10 = (this.f20712s > s2Var.f20712s ? 1 : (this.f20712s == s2Var.f20712s ? 0 : -1));
            if (i10 < 0) {
                return -1;
            }
            if (i10 <= 0) {
                ((w2) this.f20715v.f20505s).C().y.b("Two tasks share the same index. index", Long.valueOf(this.f20712s));
                return 0;
            }
        } else if (z10) {
            return -1;
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        ((w2) this.f20715v.f20505s).C().f20710x.b(this.f20714u, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(u2 u2Var, Callable callable, boolean z10) {
        super(callable);
        this.f20715v = u2Var;
        long andIncrement = u2.C.getAndIncrement();
        this.f20712s = andIncrement;
        this.f20714u = "Task exception on worker thread";
        this.f20713t = z10;
        if (andIncrement == Long.MAX_VALUE) {
            ((w2) u2Var.f20505s).C().f20710x.a("Tasks index overflow");
        }
    }
}
