package m4;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class ff implements me2 {

    /* renamed from: s */
    public boolean f8431s;

    /* renamed from: t */
    public long f8432t;

    /* renamed from: u */
    public long f8433u;

    /* renamed from: v */
    public Object f8434v;

    /* renamed from: w */
    public Object f8435w;

    public /* synthetic */ ff(long j3) {
        this.f8432t = j3;
        this.f8433u = j3 + 65536;
    }

    public /* synthetic */ ff(g11 g11Var) {
        this.f8434v = g11Var;
        this.f8435w = pt.f12618d;
    }

    public final void a(long j3) {
        this.f8432t = j3;
        if (this.f8431s) {
            this.f8433u = SystemClock.elapsedRealtime();
        }
    }

    @Override // m4.me2
    public final void b(pt ptVar) {
        if (this.f8431s) {
            a(zza());
        }
        this.f8435w = ptVar;
    }

    @Override // m4.me2
    public final pt c() {
        return (pt) this.f8435w;
    }

    public final void d() {
        if (!this.f8431s) {
            this.f8433u = SystemClock.elapsedRealtime();
            this.f8431s = true;
        }
    }

    @Override // m4.me2
    public final long zza() {
        long j3 = this.f8432t;
        if (this.f8431s) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8433u;
            pt ptVar = (pt) this.f8435w;
            return j3 + (ptVar.f12619a == 1.0f ? xf2.b(elapsedRealtime) : elapsedRealtime * ptVar.f12621c);
        }
        return j3;
    }
}
