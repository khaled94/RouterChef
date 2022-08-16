package m4;

import android.media.AudioTrack;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class lb {

    /* renamed from: a */
    public AudioTrack f10696a;

    /* renamed from: b */
    public boolean f10697b;

    /* renamed from: c */
    public int f10698c;

    /* renamed from: d */
    public long f10699d;

    /* renamed from: e */
    public long f10700e;

    /* renamed from: f */
    public long f10701f;

    /* renamed from: g */
    public long f10702g;

    /* renamed from: h */
    public long f10703h;

    /* renamed from: i */
    public long f10704i;

    public final long a() {
        if (this.f10702g != -9223372036854775807L) {
            return Math.min(this.f10704i, ((((SystemClock.elapsedRealtime() * 1000) - this.f10702g) * this.f10698c) / 1000000) + this.f10703h);
        }
        int playState = this.f10696a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f10696a.getPlaybackHeadPosition() & 4294967295L;
        if (this.f10697b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f10701f = this.f10699d;
            }
            playbackHeadPosition += this.f10701f;
        }
        if (this.f10699d > playbackHeadPosition) {
            this.f10700e++;
        }
        this.f10699d = playbackHeadPosition;
        return playbackHeadPosition + (this.f10700e << 32);
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    public void d(AudioTrack audioTrack, boolean z10) {
        this.f10696a = audioTrack;
        this.f10697b = z10;
        this.f10702g = -9223372036854775807L;
        this.f10699d = 0L;
        this.f10700e = 0L;
        this.f10701f = 0L;
        if (audioTrack != null) {
            this.f10698c = audioTrack.getSampleRate();
        }
    }

    public boolean e() {
        return false;
    }
}
