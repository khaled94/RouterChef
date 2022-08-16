package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class on2 {

    /* renamed from: a */
    public long f12230a;

    /* renamed from: b */
    public long f12231b;

    /* renamed from: c */
    public long f12232c;

    /* renamed from: d */
    public long f12233d;

    /* renamed from: e */
    public long f12234e;

    /* renamed from: f */
    public long f12235f;

    /* renamed from: g */
    public final boolean[] f12236g = new boolean[15];

    /* renamed from: h */
    public int f12237h;

    public final void a(long j3) {
        int i10;
        long j10 = this.f12233d;
        if (j10 == 0) {
            this.f12230a = j3;
        } else if (j10 == 1) {
            long j11 = j3 - this.f12230a;
            this.f12231b = j11;
            this.f12235f = j11;
            this.f12234e = 1L;
        } else {
            long j12 = j3 - this.f12232c;
            int i11 = (int) (j10 % 15);
            if (Math.abs(j12 - this.f12231b) <= 1000000) {
                this.f12234e++;
                this.f12235f += j12;
                boolean[] zArr = this.f12236g;
                if (zArr[i11]) {
                    zArr[i11] = false;
                    i10 = this.f12237h - 1;
                    this.f12237h = i10;
                }
            } else {
                boolean[] zArr2 = this.f12236g;
                if (!zArr2[i11]) {
                    zArr2[i11] = true;
                    i10 = this.f12237h + 1;
                    this.f12237h = i10;
                }
            }
        }
        this.f12233d++;
        this.f12232c = j3;
    }

    public final void b() {
        this.f12233d = 0L;
        this.f12234e = 0L;
        this.f12235f = 0L;
        this.f12237h = 0;
        Arrays.fill(this.f12236g, false);
    }

    public final boolean c() {
        return this.f12233d > 15 && this.f12237h == 0;
    }
}
