package p1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    public static final y f16943a;

    /* renamed from: b */
    public static final Property<View, Float> f16944b;

    /* loaded from: classes.dex */
    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(u.a(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            u.c(view, f10.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<View, Rect> {
        public b(Class cls) {
            super(cls, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            return z.f.a(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.f.c(view, rect);
        }
    }

    static {
        f16943a = Build.VERSION.SDK_INT >= 29 ? new z() : new y();
        f16944b = new a();
        new b(Rect.class);
    }

    public static float a(View view) {
        return f16943a.d(view);
    }

    public static void b(View view, int i10, int i11, int i12, int i13) {
        f16943a.i(view, i10, i11, i12, i13);
    }

    public static void c(View view, float f10) {
        f16943a.f(view, f10);
    }

    public static void d(View view, int i10) {
        f16943a.a(view, i10);
    }
}
