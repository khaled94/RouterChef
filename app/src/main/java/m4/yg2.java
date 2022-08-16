package m4;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class yg2 {

    /* renamed from: a */
    public final xg2 f15775a;

    /* renamed from: b */
    public int f15776b;

    /* renamed from: c */
    public long f15777c;

    /* renamed from: d */
    public long f15778d;

    /* renamed from: e */
    public long f15779e;

    /* renamed from: f */
    public long f15780f;

    public yg2(AudioTrack audioTrack) {
        if (ls1.f10971a >= 19) {
            this.f15775a = new xg2(audioTrack);
            a();
            return;
        }
        this.f15775a = null;
        b(3);
    }

    public final void a() {
        if (this.f15775a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f15776b = i10;
        long j3 = 10000;
        if (i10 == 0) {
            this.f15779e = 0L;
            this.f15780f = -1L;
            this.f15777c = System.nanoTime() / 1000;
        } else if (i10 == 1) {
            this.f15778d = 10000L;
            return;
        } else {
            j3 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.f15778d = j3;
    }
}
