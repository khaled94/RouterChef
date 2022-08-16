package da;

import da.c;
import da.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import r9.f;
import r9.f0;
import r9.i0;
import r9.v;
import r9.z;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: b */
    public final f.a f4007b;

    /* renamed from: c */
    public final v f4008c;

    /* renamed from: d */
    public final List<f.a> f4009d;

    /* renamed from: e */
    public final List<c.a> f4010e;
    @Nullable

    /* renamed from: f */
    public final Executor f4011f;

    /* renamed from: a */
    public final Map<Method, c0<?>> f4006a = new ConcurrentHashMap();

    /* renamed from: g */
    public final boolean f4012g = false;

    /* loaded from: classes.dex */
    public class a implements InvocationHandler {

        /* renamed from: a */
        public final x f4013a = x.f4123c;

        /* renamed from: b */
        public final Object[] f4014b = new Object[0];

        /* renamed from: c */
        public final /* synthetic */ Class f4015c;

        public a(Class cls) {
            b0.this = r1;
            this.f4015c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public final Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f4014b;
            }
            return this.f4013a.c(method) ? this.f4013a.b(method, this.f4015c, obj, objArr) : b0.this.c(method).a(objArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final x f4017a;
        @Nullable

        /* renamed from: b */
        public v f4018b;

        /* renamed from: c */
        public final List<f.a> f4019c = new ArrayList();

        /* renamed from: d */
        public final List<c.a> f4020d = new ArrayList();

        public b() {
            x xVar = x.f4123c;
            this.f4017a = xVar;
        }

        public final b a() {
            v.a aVar = new v.a();
            aVar.c(null, "https://mohraouf.github.io/");
            v a10 = aVar.a();
            List<String> list = a10.f17480f;
            if ("".equals(list.get(list.size() - 1))) {
                this.f4018b = a10;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + a10);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<da.f$a>, java.util.ArrayList] */
        public final b0 b() {
            if (this.f4018b != null) {
                z zVar = new z();
                Executor a10 = this.f4017a.a();
                ArrayList arrayList = new ArrayList(this.f4020d);
                x xVar = this.f4017a;
                Objects.requireNonNull(xVar);
                j jVar = new j(a10);
                arrayList.addAll(xVar.f4124a ? Arrays.asList(e.f4021a, jVar) : Collections.singletonList(jVar));
                ArrayList arrayList2 = new ArrayList(this.f4019c.size() + 1 + (this.f4017a.f4124a ? 1 : 0));
                arrayList2.add(new da.a());
                arrayList2.addAll(this.f4019c);
                arrayList2.addAll(this.f4017a.f4124a ? Collections.singletonList(t.f4080a) : Collections.emptyList());
                return new b0(zVar, this.f4018b, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), a10);
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    public b0(f.a aVar, v vVar, List list, List list2, @Nullable Executor executor) {
        this.f4007b = aVar;
        this.f4008c = vVar;
        this.f4009d = list;
        this.f4010e = list2;
        this.f4011f = executor;
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f4010e.indexOf(null) + 1;
        int size = this.f4010e.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            c<?, ?> a10 = this.f4010e.get(i10).a(type, annotationArr);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f4010e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f4010e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> T b(Class<T> cls) {
        Method[] declaredMethods;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<T> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f4012g) {
                x xVar = x.f4123c;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!xVar.c(method) && !Modifier.isStatic(method.getModifiers())) {
                        c(method);
                    }
                }
            }
            return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.reflect.Method, da.c0<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.reflect.Method, da.c0<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<java.lang.reflect.Method, da.c0<?>>, java.util.concurrent.ConcurrentHashMap] */
    public final c0<?> c(Method method) {
        c0<?> c0Var;
        c0<?> c0Var2 = (c0) this.f4006a.get(method);
        if (c0Var2 != null) {
            return c0Var2;
        }
        synchronized (this.f4006a) {
            c0Var = (c0) this.f4006a.get(method);
            if (c0Var == null) {
                c0Var = c0.b(this, method);
                this.f4006a.put(method, c0Var);
            }
        }
        return c0Var;
    }

    public final <T> f<T, f0> d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f4009d.indexOf(null) + 1;
        int size = this.f4009d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<T, f0> a10 = this.f4009d.get(i10).a(type);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f4009d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f4009d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> f<i0, T> e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f4009d.indexOf(null) + 1;
        int size = this.f4009d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<i0, T> fVar = (f<i0, T>) this.f4009d.get(i10).b(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f4009d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f4009d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        int size = this.f4009d.size();
        for (int i10 = 0; i10 < size; i10++) {
            Objects.requireNonNull(this.f4009d.get(i10));
        }
    }
}
