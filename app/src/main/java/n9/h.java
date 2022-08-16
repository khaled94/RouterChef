package n9;

import e9.f;
import e9.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k9.u;

/* loaded from: classes.dex */
public class h {

    /* renamed from: s */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16701s = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_next");

    /* renamed from: t */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16702t = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_prev");

    /* renamed from: u */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16703u = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_removedRef");
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* loaded from: classes.dex */
    public static abstract class a extends n9.b<h> {

        /* renamed from: b */
        public final h f16704b;

        /* renamed from: c */
        public h f16705c;

        public a(h hVar) {
            this.f16704b = hVar;
        }

        @Override // n9.b
        public final void b(h hVar, Object obj) {
            h hVar2 = hVar;
            boolean z10 = true;
            boolean z11 = obj == null;
            h hVar3 = z11 ? this.f16704b : this.f16705c;
            if (hVar3 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f16701s;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar2, this, hVar3)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(hVar2) != this) {
                        z10 = false;
                        break;
                    }
                }
                if (!z10 || !z11) {
                    return;
                }
                h hVar4 = this.f16704b;
                h hVar5 = this.f16705c;
                f.c(hVar5);
                hVar4.f(hVar5);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
        r7 = n9.h.f16701s;
        r4 = ((n9.o) r4).f16716a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
        if (r7.compareAndSet(r3, r2, r4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
        if (r7.get(r3) == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
        if (r5 != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n9.h a() {
        /*
            r10 = this;
        L0:
            java.lang.Object r0 = r10._prev
            n9.h r0 = (n9.h) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            r5 = 0
            r6 = 1
            if (r4 != r10) goto L24
            if (r0 != r2) goto L10
            return r2
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = n9.h.f16702t
        L12:
            boolean r1 = r7.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L1a
            r5 = r6
            goto L20
        L1a:
            java.lang.Object r1 = r7.get(r10)
            if (r1 == r0) goto L12
        L20:
            if (r5 != 0) goto L23
            goto L0
        L23:
            return r2
        L24:
            boolean r7 = r10.k()
            if (r7 == 0) goto L2b
            return r1
        L2b:
            if (r4 != 0) goto L2e
            return r2
        L2e:
            boolean r7 = r4 instanceof n9.n
            if (r7 == 0) goto L38
            n9.n r4 = (n9.n) r4
            r4.a(r2)
            goto L0
        L38:
            boolean r7 = r4 instanceof n9.o
            if (r7 == 0) goto L5c
            if (r3 == 0) goto L57
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = n9.h.f16701s
            n9.o r4 = (n9.o) r4
            n9.h r4 = r4.f16716a
        L44:
            boolean r8 = r7.compareAndSet(r3, r2, r4)
            if (r8 == 0) goto L4c
            r5 = r6
            goto L52
        L4c:
            java.lang.Object r8 = r7.get(r3)
            if (r8 == r2) goto L44
        L52:
            if (r5 != 0) goto L55
            goto L0
        L55:
            r2 = r3
            goto L6
        L57:
            java.lang.Object r2 = r2._prev
            n9.h r2 = (n9.h) r2
            goto L7
        L5c:
            r3 = r4
            n9.h r3 = (n9.h) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.h.a():n9.h");
    }

    public final void f(h hVar) {
        boolean z10;
        do {
            h hVar2 = (h) hVar._prev;
            if (h() == hVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16702t;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(hVar, hVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != hVar2) {
                            z10 = false;
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z10);
        if (k()) {
            hVar.a();
        }
    }

    public final Object h() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public final h i() {
        Object h10 = h();
        h hVar = null;
        o oVar = h10 instanceof o ? (o) h10 : null;
        if (oVar != null) {
            hVar = oVar.f16716a;
        }
        return hVar == null ? (h) h10 : hVar;
    }

    public final h j() {
        h a10 = a();
        if (a10 == null) {
            Object obj = this._prev;
            while (true) {
                a10 = (h) obj;
                if (!a10.k()) {
                    break;
                }
                obj = a10._prev;
            }
        }
        return a10;
    }

    public boolean k() {
        return h() instanceof o;
    }

    public final boolean l() {
        h hVar;
        boolean z10;
        while (true) {
            Object h10 = h();
            if (!(h10 instanceof o)) {
                if (h10 != this) {
                    h hVar2 = (h) h10;
                    o oVar = (o) hVar2._removedRef;
                    if (oVar == null) {
                        oVar = new o(hVar2);
                        f16703u.lazySet(hVar2, oVar);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16701s;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, h10, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != h10) {
                                z10 = false;
                                continue;
                                break;
                            }
                        } else {
                            z10 = true;
                            continue;
                            break;
                        }
                    }
                    if (z10) {
                        hVar = null;
                        hVar2.a();
                        break;
                    }
                } else {
                    hVar = (h) h10;
                    break;
                }
            } else {
                hVar = ((o) h10).f16716a;
                break;
            }
        }
        return hVar == null;
    }

    public String toString() {
        return new i(this) { // from class: n9.h.b
        } + '@' + u.b(this);
    }
}
