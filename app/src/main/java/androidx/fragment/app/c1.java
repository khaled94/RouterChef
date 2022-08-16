package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.e0;

/* loaded from: classes.dex */
public final /* synthetic */ class c1 {
    public static final void a(int i10, View view) {
        int i11;
        if (i10 != 0) {
            int i12 = i10 - 1;
            if (i12 == 0) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup == null) {
                    return;
                }
                if (g0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            if (i12 == 1) {
                if (g0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                }
                i11 = 0;
            } else if (i12 == 2) {
                if (g0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                i11 = 8;
            } else if (i12 != 3) {
                return;
            } else {
                if (g0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                i11 = 4;
            }
            view.setVisibility(i11);
            return;
        }
        throw null;
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 4) {
                return 4;
            }
            if (i10 != 8) {
                throw new IllegalArgumentException(e0.a("Unknown visibility ", i10));
            }
            return 3;
        }
        return 2;
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static /* synthetic */ String d(int i10) {
        return i10 == 1 ? "REMOVED" : i10 == 2 ? "VISIBLE" : i10 == 3 ? "GONE" : i10 == 4 ? "INVISIBLE" : "null";
    }

    public static /* synthetic */ String e(int i10) {
        return i10 == 1 ? "UNKNOWN" : i10 == 2 ? "HORIZONTAL_DIMENSION" : i10 == 3 ? "VERTICAL_DIMENSION" : i10 == 4 ? "LEFT" : i10 == 5 ? "RIGHT" : i10 == 6 ? "TOP" : i10 == 7 ? "BOTTOM" : i10 == 8 ? "BASELINE" : "null";
    }
}
