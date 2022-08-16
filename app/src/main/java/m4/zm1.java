package m4;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class zm1<T> {
    @GuardedBy("this")

    /* renamed from: a */
    public final Deque<tz1<T>> f16280a = new LinkedBlockingDeque();

    /* renamed from: b */
    public final Callable<T> f16281b;

    /* renamed from: c */
    public final uz1 f16282c;

    public zm1(Callable<T> callable, uz1 uz1Var) {
        this.f16281b = callable;
        this.f16282c = uz1Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Deque<m4.tz1<T>>, java.util.concurrent.LinkedBlockingDeque] */
    public final synchronized tz1<T> a() {
        b(1);
        return (tz1) this.f16280a.poll();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Deque<m4.tz1<T>>, java.util.concurrent.LinkedBlockingDeque] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Deque<m4.tz1<T>>, java.util.concurrent.LinkedBlockingDeque] */
    public final synchronized void b(int i10) {
        int size = i10 - this.f16280a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f16280a.add(this.f16282c.Z(this.f16281b));
        }
    }
}
