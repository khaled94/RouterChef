package c4;

import android.os.SystemClock;
import b4.a;
import c5.d;
import c5.i;
import com.google.android.gms.common.api.Status;
import d4.b;
import d4.k;
import d4.n;
import d4.o;
import p4.f;

/* loaded from: classes.dex */
public final class d0<T> implements d<T> {

    /* renamed from: s */
    public final e f2680s;

    /* renamed from: t */
    public final int f2681t;

    /* renamed from: u */
    public final b<?> f2682u;

    /* renamed from: v */
    public final long f2683v;

    /* renamed from: w */
    public final long f2684w;

    public d0(e eVar, int i10, b bVar, long j3, long j10) {
        this.f2680s = eVar;
        this.f2681t = i10;
        this.f2682u = bVar;
        this.f2683v = j3;
        this.f2684w = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
        if (r2 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
        if (r2 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d4.d a(c4.w<?> r7, d4.b<?> r8, int r9) {
        /*
            d4.u0 r8 = r8.f3825v
            r0 = 0
            if (r8 != 0) goto L7
            r8 = r0
            goto L9
        L7:
            d4.d r8 = r8.f3924v
        L9:
            if (r8 == 0) goto L41
            boolean r1 = r8.f3852t
            if (r1 == 0) goto L41
            int[] r1 = r8.f3854v
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2a
            int[] r1 = r8.f3856x
            if (r1 != 0) goto L1a
            goto L3a
        L1a:
            int r4 = r1.length
            r5 = r2
        L1c:
            if (r5 >= r4) goto L27
            r6 = r1[r5]
            if (r6 != r9) goto L24
            r2 = r3
            goto L27
        L24:
            int r5 = r5 + 1
            goto L1c
        L27:
            if (r2 == 0) goto L3a
            goto L41
        L2a:
            int r4 = r1.length
            r5 = r2
        L2c:
            if (r5 >= r4) goto L37
            r6 = r1[r5]
            if (r6 != r9) goto L34
            r2 = r3
            goto L37
        L34:
            int r5 = r5 + 1
            goto L2c
        L37:
            if (r2 != 0) goto L3a
            goto L41
        L3a:
            int r7 = r7.D
            int r9 = r8.f3855w
            if (r7 >= r9) goto L41
            return r8
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.d0.a(c4.w, d4.b, int):d4.d");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    @Override // c5.d
    public final void c(i<T> iVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j3;
        long j10;
        int i16;
        if (!this.f2680s.a()) {
            return;
        }
        o oVar = n.a().f3896a;
        if (oVar != null && !oVar.f3898t) {
            return;
        }
        w wVar = (w) this.f2680s.B.get(this.f2682u);
        if (wVar == null) {
            return;
        }
        a.e eVar = wVar.f2745t;
        if (!(eVar instanceof b)) {
            return;
        }
        b bVar = (b) eVar;
        boolean z10 = true;
        boolean z11 = this.f2683v > 0;
        int i17 = bVar.f3820q;
        if (oVar != null) {
            z11 &= oVar.f3899u;
            int i18 = oVar.f3900v;
            int i19 = oVar.f3901w;
            i12 = oVar.f3897s;
            if ((bVar.f3825v != null) && !bVar.g()) {
                d4.d a10 = a(wVar, bVar, this.f2681t);
                if (a10 == null) {
                    return;
                }
                if (!a10.f3853u || this.f2683v <= 0) {
                    z10 = false;
                }
                i19 = a10.f3855w;
                z11 = z10;
            }
            i11 = i18;
            i10 = i19;
        } else {
            i12 = 0;
            i10 = 100;
            i11 = 5000;
        }
        e eVar2 = this.f2680s;
        if (iVar.n()) {
            i14 = 0;
            i13 = 0;
        } else {
            if (iVar.l()) {
                i16 = 100;
            } else {
                Exception i20 = iVar.i();
                if (i20 instanceof b4.b) {
                    Status status = ((b4.b) i20).f2560s;
                    int i21 = status.f2930t;
                    a4.b bVar2 = status.f2933w;
                    i13 = bVar2 == null ? -1 : bVar2.f116t;
                    i14 = i21;
                } else {
                    i16 = 101;
                }
            }
            i14 = i16;
            i13 = -1;
        }
        if (z11) {
            long j11 = this.f2683v;
            j10 = System.currentTimeMillis();
            j3 = j11;
            i15 = (int) (SystemClock.elapsedRealtime() - this.f2684w);
        } else {
            j10 = 0;
            j3 = 0;
            i15 = -1;
        }
        k kVar = new k(this.f2681t, i14, i13, j3, j10, null, null, i17, i15);
        long j12 = i11;
        f fVar = eVar2.F;
        fVar.sendMessage(fVar.obtainMessage(18, new e0(kVar, i12, j12, i10)));
    }
}
