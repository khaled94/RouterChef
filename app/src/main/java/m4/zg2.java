package m4;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zg2 {
    public long A;
    public boolean B;
    public long C;
    public long D;

    /* renamed from: a */
    public final hh2 f16204a;

    /* renamed from: b */
    public final long[] f16205b;

    /* renamed from: c */
    public AudioTrack f16206c;

    /* renamed from: d */
    public int f16207d;

    /* renamed from: e */
    public int f16208e;

    /* renamed from: f */
    public yg2 f16209f;

    /* renamed from: g */
    public int f16210g;

    /* renamed from: h */
    public long f16211h;

    /* renamed from: i */
    public float f16212i;

    /* renamed from: j */
    public boolean f16213j;

    /* renamed from: k */
    public long f16214k;

    /* renamed from: l */
    public long f16215l;

    /* renamed from: m */
    public Method f16216m;

    /* renamed from: n */
    public long f16217n;

    /* renamed from: o */
    public boolean f16218o;
    public boolean p;

    /* renamed from: q */
    public long f16219q;

    /* renamed from: r */
    public long f16220r;

    /* renamed from: s */
    public long f16221s;

    /* renamed from: t */
    public int f16222t;

    /* renamed from: u */
    public int f16223u;

    /* renamed from: v */
    public long f16224v;

    /* renamed from: w */
    public long f16225w;

    /* renamed from: x */
    public long f16226x;
    public long y;

    /* renamed from: z */
    public long f16227z;

    public zg2(hh2 hh2Var) {
        this.f16204a = hh2Var;
        if (ls1.f10971a >= 18) {
            try {
                this.f16216m = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f16205b = new long[10];
    }

    public final void a(AudioTrack audioTrack, int i10, int i11, int i12) {
        this.f16206c = audioTrack;
        this.f16207d = i11;
        this.f16208e = i12;
        this.f16209f = new yg2(audioTrack);
        this.f16210g = audioTrack.getSampleRate();
        boolean g10 = ls1.g(i10);
        this.p = g10;
        this.f16211h = g10 ? b(i12 / i11) : -9223372036854775807L;
        this.f16220r = 0L;
        this.f16221s = 0L;
        this.f16218o = false;
        this.f16224v = -9223372036854775807L;
        this.f16225w = -9223372036854775807L;
        this.f16219q = 0L;
        this.f16217n = 0L;
        this.f16212i = 1.0f;
    }

    public final long b(long j3) {
        return (j3 * 1000000) / this.f16210g;
    }

    public final long c() {
        AudioTrack audioTrack = this.f16206c;
        Objects.requireNonNull(audioTrack);
        if (this.f16224v != -9223372036854775807L) {
            return Math.min(this.y, ((((SystemClock.elapsedRealtime() * 1000) - this.f16224v) * this.f16210g) / 1000000) + this.f16226x);
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (ls1.f10971a <= 29) {
            if (playbackHeadPosition == 0 && this.f16220r > 0 && playState == 3) {
                if (this.f16225w == -9223372036854775807L) {
                    this.f16225w = SystemClock.elapsedRealtime();
                }
                return this.f16220r;
            }
            this.f16225w = -9223372036854775807L;
        }
        if (this.f16220r > playbackHeadPosition) {
            this.f16221s++;
        }
        this.f16220r = playbackHeadPosition;
        return playbackHeadPosition + (this.f16221s << 32);
    }
}
