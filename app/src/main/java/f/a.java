package f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.v0;
import d0.c;
import d0.g;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {
    public static ColorStateList a(Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        g.c cVar;
        Object obj = c0.a.f2602a;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = g.f3704a;
        g.d dVar = new g.d(resources, theme);
        synchronized (g.f3706c) {
            SparseArray<g.c> sparseArray = g.f3705b.get(dVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (cVar = sparseArray.get(i10)) != null) {
                if (!cVar.f3708b.equals(resources.getConfiguration()) || (!(theme == null && cVar.f3709c == 0) && (theme == null || cVar.f3709c != theme.hashCode()))) {
                    sparseArray.remove(i10);
                } else {
                    colorStateList2 = cVar.f3707a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal2 = g.f3704a;
        TypedValue typedValue = threadLocal2.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal2.set(typedValue);
        }
        boolean z10 = true;
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            z10 = false;
        }
        if (!z10) {
            try {
                colorStateList = c.a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateList != null) {
            synchronized (g.f3706c) {
                WeakHashMap<g.d, SparseArray<g.c>> weakHashMap = g.f3705b;
                SparseArray<g.c> sparseArray2 = weakHashMap.get(dVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(dVar, sparseArray2);
                }
                sparseArray2.append(i10, new g.c(colorStateList, dVar.f3710a.getConfiguration(), theme));
            }
            return colorStateList;
        }
        return g.b.b(resources, i10, theme);
    }

    public static Drawable b(Context context, int i10) {
        return v0.d().f(context, i10);
    }
}
