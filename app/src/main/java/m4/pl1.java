package m4;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final /* synthetic */ class pl1 implements rk1, nu1 {

    /* renamed from: s */
    public final /* synthetic */ int f12559s;

    @Override // m4.rk1
    public void h(Object obj) {
        ((v60) obj).E(this.f12559s);
    }

    @Override // m4.nu1
    /* renamed from: zza */
    public Object mo19zza() {
        return new HandlerThread(fi2.m(this.f12559s, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }
}
