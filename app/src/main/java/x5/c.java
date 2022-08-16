package x5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.f1;
import f.a;

/* loaded from: classes.dex */
public final class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList a10;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a10 = a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : a10;
    }

    public static ColorStateList b(Context context, f1 f1Var, int i10) {
        int l10;
        ColorStateList a10;
        return (!f1Var.o(i10) || (l10 = f1Var.l(i10, 0)) == 0 || (a10 = a.a(context, l10)) == null) ? f1Var.c(i10) : a10;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable b10;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (b10 = a.b(context, resourceId)) == null) ? typedArray.getDrawable(i10) : b10;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
