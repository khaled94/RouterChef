package m0;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;
import l0.b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final DisplayCutout f5866a;

    /* loaded from: classes.dex */
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public d(DisplayCutout displayCutout) {
        this.f5866a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return b.a(this.f5866a, ((d) obj).f5866a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f5866a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("DisplayCutoutCompat{");
        c10.append(this.f5866a);
        c10.append("}");
        return c10.toString();
    }
}
