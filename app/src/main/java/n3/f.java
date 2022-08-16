package n3;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public boolean f16462a = false;

    /* renamed from: b */
    public float f16463b = 1.0f;

    public static float b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }

    public final synchronized float a() {
        float f10;
        synchronized (this) {
            f10 = this.f16463b;
        }
        if (f10 >= 0.0f) {
            return f10;
        }
        return 1.0f;
    }

    public final synchronized boolean c() {
        return this.f16462a;
    }
}
