package z0;

import android.view.animation.Interpolator;
import androidx.fragment.app.b1;

/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a */
    public final float[] f20894a;

    /* renamed from: b */
    public final float f20895b;

    public d(float[] fArr) {
        this.f20894a = fArr;
        this.f20895b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f20894a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f20895b;
        float f12 = (f10 - (min * f11)) / f11;
        float[] fArr2 = this.f20894a;
        return b1.a(fArr2[min + 1], fArr2[min], f12, fArr2[min]);
    }
}
