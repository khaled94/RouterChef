package e5;

import android.animation.TypeEvaluator;
import androidx.fragment.app.b1;

/* loaded from: classes.dex */
public final class b implements TypeEvaluator<Integer> {

    /* renamed from: a */
    public static final b f4413a = new b();

    @Override // android.animation.TypeEvaluator
    public final Integer evaluate(float f10, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f11 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float a10 = b1.a(((intValue2 >> 24) & 255) / 255.0f, f11, f10, f11);
        float a11 = b1.a(pow4, pow, f10, pow);
        float a12 = b1.a((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f10, pow2);
        float a13 = b1.a((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f10, pow3);
        int round = Math.round(((float) Math.pow(a11, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(a13, 0.45454545454545453d)) * 255.0f) | round | (Math.round(a10 * 255.0f) << 24) | (Math.round(((float) Math.pow(a12, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
