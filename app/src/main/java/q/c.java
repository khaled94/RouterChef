package q;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c extends Drawable {

    /* renamed from: a */
    public static final double f17025a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z10) {
        if (z10) {
            return (float) (((1.0d - f17025a) * f11) + f10);
        }
        return f10;
    }

    public static float b(float f10, float f11, boolean z10) {
        float f12 = f10 * 1.5f;
        if (z10) {
            return (float) (((1.0d - f17025a) * f11) + f12);
        }
        return f12;
    }
}
