package m4;

import android.view.Surface;

/* loaded from: classes.dex */
public final class un2 {
    public static void a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            x90.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
