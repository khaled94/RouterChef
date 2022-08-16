package z7;

import androidx.activity.result.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class g implements m<Object> {

    /* renamed from: s */
    public final /* synthetic */ Constructor f21019s;

    public g(Constructor constructor) {
        this.f21019s = constructor;
    }

    @Override // z7.m
    public final Object c() {
        try {
            return this.f21019s.newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InstantiationException e11) {
            StringBuilder c10 = a.c("Failed to invoke ");
            c10.append(this.f21019s);
            c10.append(" with no args");
            throw new RuntimeException(c10.toString(), e11);
        } catch (InvocationTargetException e12) {
            StringBuilder c11 = a.c("Failed to invoke ");
            c11.append(this.f21019s);
            c11.append(" with no args");
            throw new RuntimeException(c11.toString(), e12.getTargetException());
        }
    }
}
