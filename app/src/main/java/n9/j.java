package n9;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class j<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    public final int f16710a;

    /* renamed from: b */
    public final boolean f16711b;

    /* renamed from: c */
    public final int f16712c;

    /* renamed from: d */
    public /* synthetic */ AtomicReferenceArray f16713d;

    /* renamed from: g */
    public static final r f16709g = new r("REMOVE_FROZEN");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16707e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f16708f = AtomicLongFieldUpdater.newUpdater(j.class, "_state");

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f16714a;

        public a(int i10) {
            this.f16714a = i10;
        }
    }

    public j(int i10, boolean z10) {
        this.f16710a = i10;
        this.f16711b = z10;
        int i11 = i10 - 1;
        this.f16712c = i11;
        this.f16713d = new AtomicReferenceArray(i10);
        boolean z11 = false;
        if (i11 <= 1073741823) {
            if (!((i10 & i11) == 0 ? true : z11)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(E r15) {
        /*
            r14 = this;
        L0:
            long r2 = r14._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L15
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r15 == 0) goto L14
            r1 = 2
        L14:
            return r1
        L15:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r11 = r14.f16712c
            int r4 = r10 + 2
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L30
            return r1
        L30:
            boolean r4 = r14.f16711b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r14.f16713d
            r12 = r10 & r11
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r2 = r14.f16710a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r2 >> 1
            if (r0 <= r2) goto L0
        L4e:
            return r1
        L4f:
            int r0 = r10 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = n9.j.f16708f
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r12 = (long) r0
            long r12 = r12 << r9
            long r4 = r4 | r12
            r0 = r1
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f16713d
            r1 = r10 & r11
            r0.set(r1, r15)
            r0 = r14
        L6d:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L77
            goto L9a
        L77:
            n9.j r0 = r0.e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f16713d
            int r2 = r0.f16712c
            r2 = r2 & r10
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof n9.j.a
            if (r2 == 0) goto L97
            n9.j$a r1 = (n9.j.a) r1
            int r1 = r1.f16714a
            if (r1 != r10) goto L97
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f16713d
            int r2 = r0.f16712c
            r2 = r2 & r10
            r1.set(r2, r15)
            goto L98
        L97:
            r0 = 0
        L98:
            if (r0 != 0) goto L6d
        L9a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.j.a(java.lang.Object):int");
    }

    public final boolean b() {
        long j3;
        do {
            j3 = this._state;
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!f16708f.compareAndSet(this, j3, j3 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j3 = this._state;
        return (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j3) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j3 = this._state;
        return ((int) ((1073741823 & j3) >> 0)) == ((int) ((j3 & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<E> e() {
        long j3;
        while (true) {
            j3 = this._state;
            if ((j3 & 1152921504606846976L) == 0) {
                long j10 = j3 | 1152921504606846976L;
                if (f16708f.compareAndSet(this, j3, j10)) {
                    j3 = j10;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            j<E> jVar = (j) this._next;
            if (jVar != null) {
                return jVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16707e;
            j jVar2 = new j(this.f16710a * 2, this.f16711b);
            int i10 = (int) ((1073741823 & j3) >> 0);
            int i11 = (int) ((1152921503533105152L & j3) >> 30);
            while (true) {
                int i12 = this.f16712c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = this.f16713d.get(i13);
                if (obj == null) {
                    obj = new a(i10);
                }
                jVar2.f16713d.set(jVar2.f16712c & i10, obj);
                i10++;
            }
            jVar2._state = (-1152921504606846977L) & j3;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, jVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object f() {
        while (true) {
            long j3 = this._state;
            if ((j3 & 1152921504606846976L) != 0) {
                return f16709g;
            }
            int i10 = (int) ((j3 & 1073741823) >> 0);
            int i11 = this.f16712c;
            if ((((int) ((1152921503533105152L & j3) >> 30)) & i11) == (i10 & i11)) {
                return null;
            }
            Object obj = this.f16713d.get(i11 & i10);
            if (obj == null) {
                if (this.f16711b) {
                    return null;
                }
            } else if (obj instanceof a) {
                return null;
            } else {
                long j10 = ((i10 + 1) & 1073741823) << 0;
                if (f16708f.compareAndSet(this, j3, (j3 & (-1073741824)) | j10)) {
                    this.f16713d.set(this.f16712c & i10, null);
                    return obj;
                } else if (this.f16711b) {
                    j<E> jVar = this;
                    while (true) {
                        long j11 = jVar._state;
                        int i12 = (int) ((j11 & 1073741823) >> 0);
                        if ((j11 & 1152921504606846976L) != 0) {
                            jVar = jVar.e();
                        } else {
                            if (f16708f.compareAndSet(jVar, j11, (j11 & (-1073741824)) | j10)) {
                                jVar.f16713d.set(jVar.f16712c & i12, null);
                                jVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (jVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
