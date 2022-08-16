package m4;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class kb extends Thread {

    /* renamed from: s */
    public final /* synthetic */ AudioTrack f10314s;

    /* renamed from: t */
    public final /* synthetic */ rb f10315t;

    public kb(rb rbVar, AudioTrack audioTrack) {
        this.f10315t = rbVar;
        this.f10314s = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f10314s.flush();
            this.f10314s.release();
        } finally {
            this.f10315t.f13219e.open();
        }
    }
}
