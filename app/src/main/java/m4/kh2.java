package m4;

import android.media.AudioTrack;
import android.os.Handler;

/* loaded from: classes.dex */
public final class kh2 {

    /* renamed from: a */
    public final Handler f10431a = new Handler();

    /* renamed from: b */
    public final jh2 f10432b = new jh2(this);

    /* renamed from: c */
    public final /* synthetic */ lh2 f10433c;

    public kh2(lh2 lh2Var) {
        this.f10433c = lh2Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f10432b);
        this.f10431a.removeCallbacksAndMessages(null);
    }
}
