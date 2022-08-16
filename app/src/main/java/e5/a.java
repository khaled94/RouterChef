package e5;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.b1;
import z0.b;
import z0.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final LinearInterpolator f4408a = new LinearInterpolator();

    /* renamed from: b */
    public static final b f4409b = new b();

    /* renamed from: c */
    public static final z0.a f4410c = new z0.a();

    /* renamed from: d */
    public static final c f4411d = new c();

    /* renamed from: e */
    public static final DecelerateInterpolator f4412e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12, float f13, float f14) {
        return f14 < f12 ? f10 : f14 > f13 ? f11 : b1.a(f11, f10, (f14 - f12) / (f13 - f12), f10);
    }
}
