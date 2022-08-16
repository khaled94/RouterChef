package m4;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dh2 {

    /* renamed from: a */
    public final t f7500a;

    /* renamed from: b */
    public final int f7501b;

    /* renamed from: c */
    public final int f7502c;

    /* renamed from: d */
    public final int f7503d;

    /* renamed from: e */
    public final int f7504e;

    /* renamed from: f */
    public final int f7505f;

    /* renamed from: g */
    public final int f7506g;

    /* renamed from: h */
    public final jg2[] f7507h;

    public dh2(t tVar, int i10, int i11, int i12, int i13, int i14, jg2[] jg2VarArr) {
        this.f7500a = tVar;
        this.f7501b = i10;
        this.f7502c = i11;
        this.f7503d = i12;
        this.f7504e = i13;
        this.f7505f = i14;
        this.f7507h = jg2VarArr;
        int minBufferSize = AudioTrack.getMinBufferSize(i12, i13, i14);
        r01.h(minBufferSize != -2);
        long j3 = i12;
        this.f7506g = ls1.r(minBufferSize * 4, ((int) ((250000 * j3) / 1000000)) * i11, Math.max(minBufferSize, ((int) ((j3 * 750000) / 1000000)) * i11));
    }

    public final long a(long j3) {
        return (j3 * 1000000) / this.f7503d;
    }

    public final AudioTrack b(h22 h22Var, int i10) {
        AudioTrack audioTrack;
        AudioFormat build;
        AudioFormat build2;
        try {
            int i11 = ls1.f10971a;
            if (i11 >= 29) {
                build2 = new AudioFormat.Builder().setSampleRate(this.f7503d).setChannelMask(this.f7504e).setEncoding(this.f7505f).build();
                audioTrack = new AudioTrack.Builder().setAudioAttributes(h22Var.a()).setAudioFormat(build2).setTransferMode(1).setBufferSizeInBytes(this.f7506g).setSessionId(i10).setOffloadedPlayback(false).build();
            } else if (i11 >= 21) {
                AudioAttributes a10 = h22Var.a();
                build = new AudioFormat.Builder().setSampleRate(this.f7503d).setChannelMask(this.f7504e).setEncoding(this.f7505f).build();
                audioTrack = new AudioTrack(a10, build, this.f7506g, 1, i10);
            } else {
                Objects.requireNonNull(h22Var);
                audioTrack = i10 == 0 ? new AudioTrack(3, this.f7503d, this.f7504e, this.f7505f, this.f7506g, 1) : new AudioTrack(3, this.f7503d, this.f7504e, this.f7505f, this.f7506g, 1, i10);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new sg2(state, this.f7503d, this.f7504e, this.f7506g, this.f7500a, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new sg2(0, this.f7503d, this.f7504e, this.f7506g, this.f7500a, e10);
        }
    }
}
