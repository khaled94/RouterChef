package m4;

import android.util.Log;

/* loaded from: classes.dex */
public final class a42 implements le2 {

    /* renamed from: a */
    public final pm2 f6041a;

    /* renamed from: h */
    public boolean f6048h;

    /* renamed from: b */
    public final long f6042b = xf2.b(50000);

    /* renamed from: c */
    public final long f6043c = xf2.b(50000);

    /* renamed from: d */
    public final long f6044d = xf2.b(2500);

    /* renamed from: e */
    public final long f6045e = xf2.b(5000);

    /* renamed from: g */
    public int f6047g = 13107200;

    /* renamed from: f */
    public final long f6046f = xf2.b(0);

    public a42() {
        pm2 pm2Var = new pm2();
        i(2500, 0, "bufferForPlaybackMs", "0");
        i(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        i(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(50000, 50000, "maxBufferMs", "minBufferMs");
        i(0, 0, "backBufferDurationMs", "0");
        this.f6041a = pm2Var;
    }

    public static void i(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 21);
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        r01.g(z10, sb.toString());
    }

    @Override // m4.le2
    public final void a() {
        j(false);
    }

    @Override // m4.le2
    public final void b() {
    }

    @Override // m4.le2
    public final void c() {
        j(true);
    }

    @Override // m4.le2
    public final boolean d(long j3, float f10) {
        int a10 = this.f6041a.a();
        int i10 = this.f6047g;
        long j10 = this.f6042b;
        if (f10 > 1.0f) {
            j10 = Math.min(ls1.v(j10, f10), this.f6043c);
        }
        int i11 = (j3 > Math.max(j10, 500000L) ? 1 : (j3 == Math.max(j10, 500000L) ? 0 : -1));
        boolean z10 = false;
        if (i11 < 0) {
            if (a10 < i10) {
                z10 = true;
            }
            this.f6048h = z10;
            if (!z10 && j3 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= this.f6043c || a10 >= i10) {
            this.f6048h = false;
        }
        return this.f6048h;
    }

    @Override // m4.le2
    public final boolean e(long j3, float f10, boolean z10, long j10) {
        int i10 = ls1.f10971a;
        if (f10 != 1.0f) {
            j3 = Math.round(j3 / f10);
        }
        long j11 = z10 ? this.f6045e : this.f6044d;
        if (j10 != -9223372036854775807L) {
            j11 = Math.min(j10 / 2, j11);
        }
        return j11 <= 0 || j3 >= j11 || this.f6041a.a() >= this.f6047g;
    }

    @Override // m4.le2
    public final pm2 f() {
        return this.f6041a;
    }

    @Override // m4.le2
    public final void g() {
        j(true);
    }

    @Override // m4.le2
    public final void h(ff2[] ff2VarArr, kl2[] kl2VarArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 13107200;
            if (i10 >= 2) {
                int max = Math.max(13107200, i11);
                this.f6047g = max;
                this.f6041a.c(max);
                return;
            }
            if (kl2VarArr[i10] != null) {
                if (ff2VarArr[i10].a() != 1) {
                    i12 = 131072000;
                }
                i11 += i12;
            }
            i10++;
        }
    }

    public final void j(boolean z10) {
        this.f6047g = 13107200;
        this.f6048h = false;
        if (z10) {
            pm2 pm2Var = this.f6041a;
            synchronized (pm2Var) {
                pm2Var.c(0);
            }
        }
    }

    @Override // m4.le2
    public final long zza() {
        return this.f6046f;
    }
}
