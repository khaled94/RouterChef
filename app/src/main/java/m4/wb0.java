package m4;

import android.media.AudioManager;
import java.util.Objects;
import java.util.concurrent.Callable;
import l3.s;
import s4.c7;
import s4.p0;

/* loaded from: classes.dex */
public final /* synthetic */ class wb0 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f14926a;

    /* renamed from: b */
    public final /* synthetic */ Object f14927b;

    public /* synthetic */ wb0(Object obj, int i10) {
        this.f14926a = i10;
        this.f14927b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14926a) {
            case 0:
                xb0 xb0Var = (xb0) this.f14927b;
                Objects.requireNonNull(xb0Var);
                return Long.valueOf(s.B.f5795i.a(xb0Var.f15286j));
            case 1:
                AudioManager audioManager = (AudioManager) ((de1) this.f14927b).f7345b.getSystemService("audio");
                int mode = audioManager.getMode();
                boolean isMusicActive = audioManager.isMusicActive();
                boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
                int streamVolume = audioManager.getStreamVolume(3);
                int ringerMode = audioManager.getRingerMode();
                int streamVolume2 = audioManager.getStreamVolume(2);
                s sVar = s.B;
                return new ee1(mode, isMusicActive, isSpeakerphoneOn, streamVolume, ringerMode, streamVolume2, sVar.f5794h.a(), sVar.f5794h.c());
            default:
                return new c7(((p0) this.f14927b).f18054c);
        }
    }
}
