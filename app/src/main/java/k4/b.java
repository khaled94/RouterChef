package k4;

import android.os.IBinder;
import androidx.activity.k;
import d4.m;
import java.lang.reflect.Field;
import k4.a;

/* loaded from: classes.dex */
public final class b<T> extends a.AbstractBinderC0085a {

    /* renamed from: s */
    public final T f5595s;

    public b(T t10) {
        this.f5595s = t10;
    }

    public static <T> a E1(T t10) {
        return new b(t10);
    }

    public static <T> T e0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f5595s;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException(k.a(64, "Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        m.h(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}
