package x5;

import android.graphics.Typeface;
import androidx.activity.result.a;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public abstract class f {
    public static void a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder c10 = a.c("Interface can't be instantiated! Interface name: ");
            c10.append(cls.getName());
            throw new UnsupportedOperationException(c10.toString());
        } else if (!Modifier.isAbstract(modifiers)) {
        } else {
            StringBuilder c11 = a.c("Abstract class can't be instantiated! Class name: ");
            c11.append(cls.getName());
            throw new UnsupportedOperationException(c11.toString());
        }
    }

    public abstract Object b(Class cls);

    public abstract void c(int i10);

    public abstract void d(Typeface typeface, boolean z10);
}
