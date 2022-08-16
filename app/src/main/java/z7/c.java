package z7;

import androidx.activity.result.a;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import x5.f;

/* loaded from: classes.dex */
public final class c implements m<Object> {

    /* renamed from: s */
    public final f f21009s;

    /* renamed from: t */
    public final /* synthetic */ Class f21010t;

    public c(Class cls) {
        f fVar;
        this.f21010t = cls;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            fVar = new n(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    fVar = new o(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    fVar = new p(declaredMethod3);
                }
            } catch (Exception unused3) {
                fVar = new q();
            }
        }
        this.f21009s = fVar;
    }

    @Override // z7.m
    public final Object c() {
        try {
            return this.f21009s.b(this.f21010t);
        } catch (Exception e10) {
            StringBuilder c10 = a.c("Unable to create instance of ");
            c10.append(this.f21010t);
            c10.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
            throw new RuntimeException(c10.toString(), e10);
        }
    }
}
