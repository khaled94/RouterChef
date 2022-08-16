package s4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import s4.b7;
import s4.y6;

/* loaded from: classes.dex */
public abstract class b7<MessageType extends b7<MessageType, BuilderType>, BuilderType extends y6<MessageType, BuilderType>> extends x5<MessageType, BuilderType> {
    private static final Map<Object, b7<?, ?>> zza = new ConcurrentHashMap();
    public a9 zzc = a9.f17720f;
    public int zzd = -1;

    public static <E> h7<E> j(h7<E> h7Var) {
        int size = h7Var.size();
        return h7Var.j(size == 0 ? 10 : size + size);
    }

    public static Object k(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (!(cause instanceof Error)) {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((Error) cause);
        }
    }

    public static <T extends b7> void l(Class<T> cls, T t10) {
        zza.put(cls, t10);
    }

    public static <T extends b7> T p(Class<T> cls) {
        Map<Object, b7<?, ?>> map = zza;
        b7<?, ?> b7Var = map.get(cls);
        if (b7Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                b7Var = map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (b7Var == null) {
            b7Var = (b7) ((b7) i9.i(cls)).r(6);
            if (b7Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, b7Var);
        }
        return b7Var;
    }

    public static g7 q(g7 g7Var) {
        s7 s7Var = (s7) g7Var;
        int i10 = s7Var.f18097u;
        return s7Var.j(i10 == 0 ? 10 : i10 + i10);
    }

    @Override // s4.d8
    public final int b() {
        int i10 = this.zzd;
        if (i10 == -1) {
            int h10 = l8.f17974c.a(getClass()).h(this);
            this.zzd = h10;
            return h10;
        }
        return i10;
    }

    @Override // s4.e8
    public final /* bridge */ /* synthetic */ d8 c() {
        return (b7) r(6);
    }

    @Override // s4.d8
    public final /* bridge */ /* synthetic */ w5 d() {
        return (y6) r(5);
    }

    @Override // s4.d8
    public final /* bridge */ /* synthetic */ w5 e() {
        y6 y6Var = (y6) r(5);
        y6Var.k(this);
        return y6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return l8.f17974c.a(getClass()).g(this, (b7) obj);
    }

    @Override // s4.x5
    public final int f() {
        return this.zzd;
    }

    @Override // s4.x5
    public final void h(int i10) {
        this.zzd = i10;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int a10 = l8.f17974c.a(getClass()).a(this);
        this.zzb = a10;
        return a10;
    }

    public final void m(k6 k6Var) {
        o8 a10 = l8.f17974c.a(getClass());
        l6 l6Var = k6Var.f17958x;
        if (l6Var == null) {
            l6Var = new l6(k6Var);
        }
        a10.i(this, l6Var);
    }

    public final <MessageType extends b7<MessageType, BuilderType>, BuilderType extends y6<MessageType, BuilderType>> BuilderType n() {
        return (BuilderType) r(5);
    }

    public final BuilderType o() {
        BuilderType buildertype = (BuilderType) r(5);
        buildertype.k(this);
        return buildertype;
    }

    public abstract Object r(int i10);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        f8.c(this, sb, 0);
        return sb.toString();
    }
}
