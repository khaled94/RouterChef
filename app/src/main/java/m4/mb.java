package m4;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* loaded from: classes.dex */
public final class mb extends lb {

    /* renamed from: j */
    public final AudioTimestamp f11127j = new AudioTimestamp();

    /* renamed from: k */
    public long f11128k;

    /* renamed from: l */
    public long f11129l;

    /* renamed from: m */
    public long f11130m;

    @Override // m4.lb
    public final long b() {
        return this.f11130m;
    }

    @Override // m4.lb
    public final long c() {
        return this.f11127j.nanoTime;
    }

    @Override // m4.lb
    public final void d(AudioTrack audioTrack, boolean z10) {
        super.d(audioTrack, z10);
        this.f11128k = 0L;
        this.f11129l = 0L;
        this.f11130m = 0L;
    }

    @Override // m4.lb
    public final boolean e() {
        boolean timestamp = this.f10696a.getTimestamp(this.f11127j);
        if (timestamp) {
            long j3 = this.f11127j.framePosition;
            if (this.f11129l > j3) {
                this.f11128k++;
            }
            this.f11129l = j3;
            this.f11130m = j3 + (this.f11128k << 32);
        }
        return timestamp;
    }
}
