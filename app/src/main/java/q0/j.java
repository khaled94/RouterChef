package q0;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class j {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z10) {
        popupWindow.setOverlapAnchor(z10);
    }

    public static void d(PopupWindow popupWindow, int i10) {
        popupWindow.setWindowLayoutType(i10);
    }
}
