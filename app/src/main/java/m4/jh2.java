package m4;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class jh2 extends AudioTrack.StreamEventCallback {

    /* renamed from: a */
    public final /* synthetic */ kh2 f10080a;

    public jh2(kh2 kh2Var) {
        this.f10080a = kh2Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        ef2 ef2Var;
        r01.h(audioTrack == this.f10080a.f10433c.f10855n);
        lh2 lh2Var = this.f10080a.f10433c;
        nh2 nh2Var = lh2Var.f10852k;
        if (nh2Var == null || !lh2Var.G || (ef2Var = nh2Var.f11787a.f12166a1) == null) {
            return;
        }
        ef2Var.a();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        ef2 ef2Var;
        r01.h(audioTrack == this.f10080a.f10433c.f10855n);
        lh2 lh2Var = this.f10080a.f10433c;
        nh2 nh2Var = lh2Var.f10852k;
        if (nh2Var == null || !lh2Var.G || (ef2Var = nh2Var.f11787a.f12166a1) == null) {
            return;
        }
        ef2Var.a();
    }
}
