package o9;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16843b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16844c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16845d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16846e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* renamed from: a */
    public final AtomicReferenceArray<g> f16847a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final g a(g gVar, boolean z10) {
        if (z10) {
            return b(gVar);
        }
        g gVar2 = (g) f16843b.getAndSet(this, gVar);
        if (gVar2 != null) {
            return b(gVar2);
        }
        return null;
    }

    public final g b(g gVar) {
        boolean z10 = true;
        if (gVar.f16832t.b() != 1) {
            z10 = false;
        }
        if (z10) {
            f16846e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return gVar;
        }
        int i10 = this.producerIndex & 127;
        while (this.f16847a.get(i10) != null) {
            Thread.yield();
        }
        this.f16847a.lazySet(i10, gVar);
        f16844c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final g d() {
        g gVar = (g) f16843b.getAndSet(this, null);
        return gVar == null ? e() : gVar;
    }

    public final g e() {
        g andSet;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f16845d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f16847a.getAndSet(i11, null)) != null) {
                boolean z10 = true;
                if (andSet.f16832t.b() != 1) {
                    z10 = false;
                }
                if (z10) {
                    f16846e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long f(m mVar) {
        int i10 = mVar.consumerIndex;
        int i11 = mVar.producerIndex;
        AtomicReferenceArray<g> atomicReferenceArray = mVar.f16847a;
        while (true) {
            boolean z10 = true;
            if (i10 == i11) {
                break;
            }
            int i12 = i10 & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            g gVar = atomicReferenceArray.get(i12);
            if (gVar != null) {
                if (gVar.f16832t.b() != 1) {
                    z10 = false;
                }
                if (z10 && atomicReferenceArray.compareAndSet(i12, gVar, null)) {
                    f16846e.decrementAndGet(mVar);
                    a(gVar, false);
                    return -1L;
                }
            }
            i10++;
        }
        return g(mVar, true);
    }

    public final long g(m mVar, boolean z10) {
        g gVar;
        boolean z11;
        do {
            gVar = (g) mVar.lastScheduledTask;
            if (gVar == null) {
                return -2L;
            }
            z11 = true;
            if (z10) {
                if (!(gVar.f16832t.b() == 1)) {
                    return -2L;
                }
            }
            Objects.requireNonNull(k.f16839e);
            long nanoTime = System.nanoTime() - gVar.f16831s;
            long j3 = k.f16835a;
            if (nanoTime < j3) {
                return j3 - nanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16843b;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(mVar, gVar, null)) {
                    if (atomicReferenceFieldUpdater.get(mVar) != gVar) {
                        z11 = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z11);
        a(gVar, false);
        return -1L;
    }
}
