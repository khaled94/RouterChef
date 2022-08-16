package m4;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final /* synthetic */ class rf2 implements v91, nu1 {

    /* renamed from: s */
    public final /* synthetic */ int f13266s;

    @Override // m4.v91
    public void h(Object obj) {
        switch (this.f13266s) {
            case 0:
                gg2 gg2Var = (gg2) obj;
                return;
            default:
                gg2 gg2Var2 = (gg2) obj;
                return;
        }
    }

    @Override // m4.nu1
    /* renamed from: zza */
    public Object mo19zza() {
        return new HandlerThread(fi2.m(this.f13266s, "ExoPlayer:MediaCodecQueueingThread:"));
    }
}
