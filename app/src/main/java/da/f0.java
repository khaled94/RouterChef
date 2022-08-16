package da;

import ca.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.Nullable;
import r9.h0;
import r9.i0;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a */
    public static final Type[] f4028a = new Type[0];

    /* loaded from: classes.dex */
    public static final class a implements GenericArrayType {

        /* renamed from: s */
        public final Type f4029s;

        public a(Type type) {
            this.f4029s = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && f0.c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f4029s;
        }

        public final int hashCode() {
            return this.f4029s.hashCode();
        }

        public final String toString() {
            return f0.o(this.f4029s) + "[]";
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ParameterizedType {
        @Nullable

        /* renamed from: s */
        public final Type f4030s;

        /* renamed from: t */
        public final Type f4031t;

        /* renamed from: u */
        public final Type[] f4032u;

        public b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() != null ? false : true)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                f0.b(type3);
            }
            this.f4030s = type;
            this.f4031t = type2;
            this.f4032u = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && f0.c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f4032u.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public final Type getOwnerType() {
            return this.f4030s;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f4031t;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f4032u) ^ this.f4031t.hashCode();
            Type type = this.f4030s;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f4032u;
            if (typeArr.length == 0) {
                return f0.o(this.f4031t);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(f0.o(this.f4031t));
            sb.append("<");
            sb.append(f0.o(this.f4032u[0]));
            for (int i10 = 1; i10 < this.f4032u.length; i10++) {
                sb.append(", ");
                sb.append(f0.o(this.f4032u[i10]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements WildcardType {

        /* renamed from: s */
        public final Type f4033s;
        @Nullable

        /* renamed from: t */
        public final Type f4034t;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length != 1) {
                    throw new IllegalArgumentException();
                }
                if (typeArr2.length != 1) {
                    Objects.requireNonNull(typeArr[0]);
                    f0.b(typeArr[0]);
                    this.f4034t = null;
                    this.f4033s = typeArr[0];
                    return;
                }
                Objects.requireNonNull(typeArr2[0]);
                f0.b(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    throw new IllegalArgumentException();
                }
                this.f4034t = typeArr2[0];
                this.f4033s = Object.class;
                return;
            }
            throw new IllegalArgumentException();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && f0.c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f4034t;
            return type != null ? new Type[]{type} : f0.f4028a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f4033s};
        }

        public final int hashCode() {
            Type type = this.f4034t;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f4033s.hashCode() + 31);
        }

        public final String toString() {
            Type type;
            StringBuilder sb;
            if (this.f4034t != null) {
                sb = androidx.activity.result.a.c("? super ");
                type = this.f4034t;
            } else if (this.f4033s == Object.class) {
                return "?";
            } else {
                sb = androidx.activity.result.a.c("? extends ");
                type = this.f4033s;
            }
            sb.append(f0.o(type));
            return sb.toString();
        }
    }

    public static i0 a(i0 i0Var) {
        f fVar = new f();
        i0Var.j().B(fVar);
        return new h0(i0Var.c(), i0Var.b(), fVar);
    }

    public static void b(Type type) {
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static boolean c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    public static Type d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (interfaces[i10] == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(interfaces[i10])) {
                    return d(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type e(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i10 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    public static Class<?> f(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (!(rawType instanceof Class)) {
                throw new IllegalArgumentException();
            }
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(f(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return f(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    public static Type g(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m(type, cls, d(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static boolean h(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (h(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return h(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    public static boolean i(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static RuntimeException j(Method method, @Nullable Throwable th, String str, Object... objArr) {
        StringBuilder c10 = androidx.fragment.app.a.c(String.format(str, objArr), "\n    for method ");
        c10.append(method.getDeclaringClass().getSimpleName());
        c10.append(".");
        c10.append(method.getName());
        return new IllegalArgumentException(c10.toString(), th);
    }

    public static RuntimeException k(Method method, int i10, String str, Object... objArr) {
        StringBuilder c10 = androidx.fragment.app.a.c(str, " (parameter #");
        c10.append(i10 + 1);
        c10.append(")");
        return j(method, null, c10.toString(), objArr);
    }

    public static RuntimeException l(Method method, Throwable th, int i10, String str, Object... objArr) {
        StringBuilder c10 = androidx.fragment.app.a.c(str, " (parameter #");
        c10.append(i10 + 1);
        c10.append(")");
        return j(method, th, c10.toString(), objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[LOOP:0: B:2:0x0000->B:23:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type m(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: da.f0.m(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static void n(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (th instanceof ThreadDeath) {
                throw ((ThreadDeath) th);
            }
            if (th instanceof LinkageError) {
                throw ((LinkageError) th);
            }
            return;
        }
        throw ((VirtualMachineError) th);
    }

    public static String o(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
