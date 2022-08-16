package z7;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final Type[] f21001a = new Type[0];

    /* renamed from: z7.a$a */
    /* loaded from: classes.dex */
    public static final class C0155a implements GenericArrayType, Serializable {

        /* renamed from: s */
        public final Type f21002s;

        public C0155a(Type type) {
            this.f21002s = a.a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && a.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f21002s;
        }

        public final int hashCode() {
            return this.f21002s.hashCode();
        }

        public final String toString() {
            return a.j(this.f21002s) + "[]";
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: s */
        public final Type f21003s;

        /* renamed from: t */
        public final Type f21004t;

        /* renamed from: u */
        public final Type[] f21005u;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z10 = true;
                boolean z11 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z11) {
                    z10 = false;
                }
                c4.a.a(z10);
            }
            this.f21003s = type == null ? null : a.a(type);
            this.f21004t = a.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f21005u = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                Objects.requireNonNull(this.f21005u[i10]);
                a.b(this.f21005u[i10]);
                Type[] typeArr3 = this.f21005u;
                typeArr3[i10] = a.a(typeArr3[i10]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && a.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f21005u.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f21003s;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f21004t;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f21005u) ^ this.f21004t.hashCode();
            Type type = this.f21003s;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            int length = this.f21005u.length;
            if (length == 0) {
                return a.j(this.f21004t);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(a.j(this.f21004t));
            sb.append("<");
            sb.append(a.j(this.f21005u[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb.append(", ");
                sb.append(a.j(this.f21005u[i10]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements WildcardType, Serializable {

        /* renamed from: s */
        public final Type f21006s;

        /* renamed from: t */
        public final Type f21007t;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z10 = true;
            c4.a.a(typeArr2.length <= 1);
            c4.a.a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                a.b(typeArr2[0]);
                c4.a.a(typeArr[0] != Object.class ? false : z10);
                this.f21007t = a.a(typeArr2[0]);
                this.f21006s = Object.class;
                return;
            }
            Objects.requireNonNull(typeArr[0]);
            a.b(typeArr[0]);
            this.f21007t = null;
            this.f21006s = a.a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && a.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f21007t;
            return type != null ? new Type[]{type} : a.f21001a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f21006s};
        }

        public final int hashCode() {
            Type type = this.f21007t;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f21006s.hashCode() + 31);
        }

        public final String toString() {
            Type type;
            StringBuilder sb;
            if (this.f21007t != null) {
                sb = androidx.activity.result.a.c("? super ");
                type = this.f21007t;
            } else if (this.f21006s == Object.class) {
                return "?";
            } else {
                sb = androidx.activity.result.a.c("? extends ");
                type = this.f21006s;
            }
            sb.append(a.j(type));
            return sb.toString();
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0155a(a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C0155a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static void b(Type type) {
        c4.a.a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean d(Type type, Type type2) {
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
            return c(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
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
                    return e(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
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
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class<?> f(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            c4.a.a(rawType instanceof Class);
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
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static Type g(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        c4.a.a(cls2.isAssignableFrom(cls));
        return h(type, cls, e(type, cls, cls2));
    }

    public static Type h(Type type, Class<?> cls, Type type2) {
        return i(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0142, code lost:
        if (r1 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0144, code lost:
        r12.put(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0147, code lost:
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0142 A[EDGE_INSN: B:88:0x0142->B:81:0x0142 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [z7.a$c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [z7.a$c] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type i(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.a.i(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    public static String j(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
