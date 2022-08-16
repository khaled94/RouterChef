package androidx.fragment.app;

import androidx.fragment.app.o;
import e0.d;
import r.g;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a */
    public static final g<ClassLoader, g<String, Class<?>>> f1600a = new g<>();

    public static Class<?> b(ClassLoader classLoader, String str) {
        g<ClassLoader, g<String, Class<?>>> gVar = f1600a;
        g<String, Class<?>> orDefault = gVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new g<>();
            gVar.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 == null) {
            Class<?> cls = Class.forName(str, false, classLoader);
            orDefault.put(str, cls);
            return cls;
        }
        return orDefault2;
    }

    public static Class<? extends o> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new o.d(d.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new o.d(d.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public o a(ClassLoader classLoader, String str) {
        throw null;
    }
}
