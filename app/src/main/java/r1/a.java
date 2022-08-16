package r1;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    public final r.a<String, Method> f17216a;

    /* renamed from: b */
    public final r.a<String, Method> f17217b;

    /* renamed from: c */
    public final r.a<String, Class> f17218c;

    public a(r.a<String, Method> aVar, r.a<String, Method> aVar2, r.a<String, Class> aVar3) {
        this.f17216a = aVar;
        this.f17217b = aVar2;
        this.f17218c = aVar3;
    }

    public abstract void a();

    public abstract a b();

    public final Class c(Class<? extends c> cls) {
        Class orDefault = this.f17218c.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f17218c.put(cls.getName(), cls2);
            return cls2;
        }
        return orDefault;
    }

    public final Method d(String str) {
        Method orDefault = this.f17216a.getOrDefault(str, null);
        if (orDefault == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            this.f17216a.put(str, declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public final Method e(Class cls) {
        Method orDefault = this.f17217b.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            Class c10 = c(cls);
            System.currentTimeMillis();
            Method declaredMethod = c10.getDeclaredMethod("write", cls, a.class);
            this.f17217b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public abstract boolean f();

    public abstract byte[] g();

    public abstract CharSequence h();

    public abstract boolean i(int i10);

    public abstract int j();

    public final int k(int i10, int i11) {
        return !i(i11) ? i10 : j();
    }

    public abstract <T extends Parcelable> T l();

    public final <T extends Parcelable> T m(T t10, int i10) {
        return !i(i10) ? t10 : (T) l();
    }

    public abstract String n();

    public final <T extends c> T o() {
        String n10 = n();
        if (n10 == null) {
            return null;
        }
        try {
            return (T) d(n10).invoke(null, b());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (!(e13.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
            throw ((RuntimeException) e13.getCause());
        }
    }

    public abstract void p(int i10);

    public abstract void q(boolean z10);

    public abstract void r(byte[] bArr);

    public abstract void s(CharSequence charSequence);

    public abstract void t(int i10);

    public final void u(int i10, int i11) {
        p(i11);
        t(i10);
    }

    public abstract void v(Parcelable parcelable);

    public final void w(Parcelable parcelable, int i10) {
        p(i10);
        v(parcelable);
    }

    public abstract void x(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(c cVar) {
        if (cVar == null) {
            x(null);
            return;
        }
        try {
            x(c(cVar.getClass()).getName());
            a b10 = b();
            try {
                e(cVar.getClass()).invoke(null, cVar, b10);
                b10.a();
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (!(e13.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
                }
                throw ((RuntimeException) e13.getCause());
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e14);
        }
    }
}
