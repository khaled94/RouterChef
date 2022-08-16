package m4;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m4.j92;
import m4.m92;

/* loaded from: classes.dex */
public abstract class m92<MessageType extends m92<MessageType, BuilderType>, BuilderType extends j92<MessageType, BuilderType>> extends b82<MessageType, BuilderType> {
    private static final Map<Object, m92<?, ?>> zzb = new ConcurrentHashMap();
    public qb2 zzc = qb2.f12763f;
    public int zzd = -1;

    public static <T extends m92<T, ?>> T j(T t10) {
        if (t10.p()) {
            return t10;
        }
        throw new x92(new ob2().getMessage());
    }

    public static m92 k(m92 m92Var, byte[] bArr, int i10, z82 z82Var) {
        m92 m92Var2 = (m92) m92Var.u(4, null);
        try {
            eb2 a10 = ya2.f15637c.a(m92Var2.getClass());
            a10.e(m92Var2, bArr, 0, i10, new e82(z82Var));
            a10.c(m92Var2);
            if (m92Var2.zza == 0) {
                return m92Var2;
            }
            throw new RuntimeException();
        } catch (IndexOutOfBoundsException unused) {
            throw x92.h();
        } catch (x92 e10) {
            if (!e10.f15257s) {
                throw e10;
            }
            throw new x92(e10);
        } catch (IOException e11) {
            if (!(e11.getCause() instanceof x92)) {
                throw new x92(e11);
            }
            throw ((x92) e11.getCause());
        }
    }

    public static <E> u92<E> l(u92<E> u92Var) {
        int size = u92Var.size();
        return u92Var.j(size == 0 ? 10 : size + size);
    }

    public static Object m(Method method, Object obj, Object... objArr) {
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

    public static <T extends m92> void n(Class<T> cls, T t10) {
        zzb.put(cls, t10);
    }

    public static <T extends m92> T s(Class<T> cls) {
        Map<Object, m92<?, ?>> map = zzb;
        m92<?, ?> m92Var = map.get(cls);
        if (m92Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                m92Var = map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (m92Var == null) {
            m92Var = (m92) ((m92) zb2.k(cls)).u(6, null);
            if (m92Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, m92Var);
        }
        return m92Var;
    }

    public static <T extends m92<T, ?>> T t(T t10, n82 n82Var, z82 z82Var) {
        try {
            r82 t11 = n82Var.t();
            T t12 = (T) t10.u(4, null);
            try {
                try {
                    eb2 a10 = ya2.f15637c.a(t12.getClass());
                    s82 s82Var = t11.f13198b;
                    if (s82Var == null) {
                        s82Var = new s82(t11);
                    }
                    a10.g(t12, s82Var, z82Var);
                    a10.c(t12);
                    try {
                        t11.A(0);
                        j(t12);
                        return t12;
                    } catch (x92 e10) {
                        throw e10;
                    }
                } catch (x92 e11) {
                    if (!e11.f15257s) {
                        throw e11;
                    }
                    throw new x92(e11);
                }
            } catch (IOException e12) {
                if (!(e12.getCause() instanceof x92)) {
                    throw new x92(e12);
                }
                throw ((x92) e12.getCause());
            } catch (RuntimeException e13) {
                if (!(e13.getCause() instanceof x92)) {
                    throw e13;
                }
                throw ((x92) e13.getCause());
            }
        } catch (x92 e14) {
            throw e14;
        }
    }

    @Override // m4.ra2
    public final /* synthetic */ qa2 a() {
        return (m92) u(6, null);
    }

    @Override // m4.qa2
    public final /* synthetic */ a82 c() {
        return (j92) u(5, null);
    }

    @Override // m4.qa2
    public final int e() {
        int i10 = this.zzd;
        if (i10 == -1) {
            int h10 = ya2.f15637c.a(getClass()).h(this);
            this.zzd = h10;
            return h10;
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ya2.f15637c.a(getClass()).i(this, (m92) obj);
    }

    @Override // m4.qa2
    public final /* synthetic */ a82 f() {
        j92 j92Var = (j92) u(5, null);
        j92Var.h(this);
        return j92Var;
    }

    @Override // m4.b82
    public final int g() {
        return this.zzd;
    }

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int a10 = ya2.f15637c.a(getClass()).a(this);
        this.zza = a10;
        return a10;
    }

    @Override // m4.b82
    public final void i(int i10) {
        this.zzd = i10;
    }

    public final void o(v82 v82Var) {
        eb2 a10 = ya2.f15637c.a(getClass());
        w82 w82Var = v82Var.f14615x;
        if (w82Var == null) {
            w82Var = new w82(v82Var);
        }
        a10.f(this, w82Var);
    }

    public final boolean p() {
        m92<MessageType, BuilderType> m92Var = null;
        byte byteValue = ((Byte) u(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean j3 = ya2.f15637c.a(getClass()).j(this);
        if (true == j3) {
            m92Var = this;
        }
        u(2, m92Var);
        return j3;
    }

    public final <MessageType extends m92<MessageType, BuilderType>, BuilderType extends j92<MessageType, BuilderType>> BuilderType q() {
        return (BuilderType) u(5, null);
    }

    public final BuilderType r() {
        BuilderType buildertype = (BuilderType) u(5, null);
        buildertype.h(this);
        return buildertype;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        sa2.c(this, sb, 0);
        return sb.toString();
    }

    public abstract Object u(int i10, Object obj);
}
