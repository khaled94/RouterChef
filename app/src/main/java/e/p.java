package e;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    public static Field f4260a;

    /* renamed from: b */
    public static boolean f4261b;

    /* renamed from: c */
    public static Class<?> f4262c;

    /* renamed from: d */
    public static boolean f4263d;

    /* renamed from: e */
    public static Field f4264e;

    /* renamed from: f */
    public static boolean f4265f;

    /* renamed from: g */
    public static Field f4266g;

    /* renamed from: h */
    public static boolean f4267h;

    public static void a(Object obj) {
        if (!f4263d) {
            try {
                f4262c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f4263d = true;
        }
        Class<?> cls = f4262c;
        if (cls == null) {
            return;
        }
        if (!f4265f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f4264e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f4265f = true;
        }
        Field field = f4264e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
        }
        if (longSparseArray == null) {
            return;
        }
        longSparseArray.clear();
    }
}
