package m4;

import android.os.Handler;

/* loaded from: classes.dex */
public final class nh2 {

    /* renamed from: a */
    public final /* synthetic */ oh2 f11787a;

    public final void a(Exception exc) {
        x90.e("MediaCodecAudioRenderer", "Audio sink error", exc);
        pg2 pg2Var = this.f11787a.R0;
        Handler handler = pg2Var.f12509a;
        if (handler != null) {
            handler.post(new nz(pg2Var, exc, 3));
        }
    }
}
