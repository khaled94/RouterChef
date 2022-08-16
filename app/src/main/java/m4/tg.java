package m4;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class tg implements pg {

    /* renamed from: a */
    public boolean f14047a;

    /* renamed from: b */
    public long f14048b;

    /* renamed from: c */
    public long f14049c;

    /* renamed from: d */
    public xa f14050d = xa.f15258c;

    @Override // m4.pg
    public final xa D() {
        throw null;
    }

    @Override // m4.pg
    public final long E() {
        long j3 = this.f14048b;
        if (this.f14047a) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f14049c;
            xa xaVar = this.f14050d;
            return j3 + (xaVar.f15259a == 1.0f ? ia.a(elapsedRealtime) : elapsedRealtime * xaVar.f15260b);
        }
        return j3;
    }

    @Override // m4.pg
    public final xa J(xa xaVar) {
        if (this.f14047a) {
            a(E());
        }
        this.f14050d = xaVar;
        return xaVar;
    }

    public final void a(long j3) {
        this.f14048b = j3;
        if (this.f14047a) {
            this.f14049c = SystemClock.elapsedRealtime();
        }
    }

    public final void b(pg pgVar) {
        a(pgVar.E());
        this.f14050d = pgVar.D();
    }
}
