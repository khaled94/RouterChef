package c5;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class y<TResult> {

    /* renamed from: a */
    public final Object f2810a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    public Queue<x<TResult>> f2811b;
    @GuardedBy("mLock")

    /* renamed from: c */
    public boolean f2812c;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Queue<c5.x<TResult>>, java.util.ArrayDeque] */
    public final void a(x<TResult> xVar) {
        synchronized (this.f2810a) {
            if (this.f2811b == null) {
                this.f2811b = new ArrayDeque();
            }
            this.f2811b.add(xVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Queue<c5.x<TResult>>, java.util.ArrayDeque] */
    public final void b(i<TResult> iVar) {
        x xVar;
        synchronized (this.f2810a) {
            if (this.f2811b != null && !this.f2812c) {
                this.f2812c = true;
                while (true) {
                    synchronized (this.f2810a) {
                        xVar = (x) this.f2811b.poll();
                        if (xVar == null) {
                            this.f2812c = false;
                            return;
                        }
                    }
                    xVar.a(iVar);
                }
            }
        }
    }
}
