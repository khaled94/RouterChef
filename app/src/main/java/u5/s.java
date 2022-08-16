package u5;

import android.graphics.PorterDuff;
import android.view.View;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class s {

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f19146a;

        /* renamed from: b */
        public int f19147b;

        /* renamed from: c */
        public int f19148c;

        public b(int i10, int i11, int i12, int i13) {
            this.f19146a = i10;
            this.f19147b = i12;
            this.f19148c = i13;
        }
    }

    public static boolean a(View view) {
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        return z.e.d(view) == 1;
    }

    public static PorterDuff.Mode b(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 == 5) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (i10 == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i10) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
