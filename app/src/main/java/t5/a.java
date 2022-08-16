package t5;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* loaded from: classes.dex */
public final class a implements TypeEvaluator<Float> {

    /* renamed from: a */
    public FloatEvaluator f18670a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f10, Float f11, Float f12) {
        float floatValue = this.f18670a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
