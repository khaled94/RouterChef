package z8;

import d.b;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import x8.d;
import z8.f;

/* loaded from: classes.dex */
public abstract class a implements d<Object>, d, Serializable {

    /* renamed from: s */
    public final d<Object> f21057s;

    public a(d<Object> dVar) {
        this.f21057s = dVar;
    }

    @Override // z8.d
    public final d a() {
        d<Object> dVar = this.f21057s;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final StackTraceElement b() {
        int i10;
        String str;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v10 = eVar.v();
        if (v10 <= 1) {
            int i11 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i10 = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                i11 = eVar.l()[i10];
            }
            f.a aVar = f.f21062b;
            if (aVar == null) {
                try {
                    f.a aVar2 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    f.f21062b = aVar2;
                    aVar = aVar2;
                } catch (Exception unused2) {
                    aVar = f.f21061a;
                    f.f21062b = aVar;
                }
            }
            if (aVar != f.f21061a) {
                Method method = aVar.f21063a;
                Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
                if (invoke != null) {
                    Method method2 = aVar.f21064b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                    if (invoke2 != null) {
                        Method method3 = aVar.f21065c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (invoke3 instanceof String) {
                            str2 = invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i11);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v10 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object c(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x8.d
    public final void d(Object obj) {
        d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            d dVar2 = aVar.f21057s;
            e9.f.c(dVar2);
            try {
                obj = aVar.c(obj);
                if (obj == y8.a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = b.a(th);
            }
            aVar.e();
            if (!(dVar2 instanceof a)) {
                dVar2.d(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public void e() {
    }

    public String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Continuation at ");
        Object b10 = b();
        if (b10 == null) {
            b10 = getClass().getName();
        }
        c10.append(b10);
        return c10.toString();
    }
}
