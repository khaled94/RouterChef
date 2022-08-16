package m4;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class ch2 extends Thread {

    /* renamed from: s */
    public final /* synthetic */ AudioTrack f6987s;

    /* renamed from: t */
    public final /* synthetic */ lh2 f6988t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch2(lh2 lh2Var, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f6988t = lh2Var;
        this.f6987s = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f6987s.flush();
            this.f6987s.release();
        } finally {
            this.f6988t.f10846e.open();
        }
    }
}
