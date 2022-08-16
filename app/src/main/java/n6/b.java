package n6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class b<T> {

    /* renamed from: a */
    public final Set<Class<? super T>> f16616a;

    /* renamed from: b */
    public final Set<n> f16617b;

    /* renamed from: c */
    public final int f16618c;

    /* renamed from: d */
    public final int f16619d;

    /* renamed from: e */
    public final e<T> f16620e;

    /* renamed from: f */
    public final Set<Class<?>> f16621f;

    /* renamed from: n6.b$b */
    /* loaded from: classes.dex */
    public static class C0097b<T> {

        /* renamed from: a */
        public final Set<Class<? super T>> f16622a;

        /* renamed from: e */
        public e<T> f16626e;

        /* renamed from: b */
        public final Set<n> f16623b = new HashSet();

        /* renamed from: c */
        public int f16624c = 0;

        /* renamed from: d */
        public int f16625d = 0;

        /* renamed from: f */
        public Set<Class<?>> f16627f = new HashSet();

        public C0097b(Class cls, Class[] clsArr, a aVar) {
            HashSet hashSet = new HashSet();
            this.f16622a = hashSet;
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                Objects.requireNonNull(cls2, "Null interface");
            }
            Collections.addAll(this.f16622a, clsArr);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashSet, java.util.Set<n6.n>] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.lang.Class<? super T>>] */
        public final C0097b<T> a(n nVar) {
            if (!this.f16622a.contains(nVar.f16648a)) {
                this.f16623b.add(nVar);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final b<T> b() {
            if (this.f16626e != null) {
                return new b<>(new HashSet(this.f16622a), new HashSet(this.f16623b), this.f16624c, this.f16625d, this.f16626e, this.f16627f, null);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final C0097b<T> c() {
            if (this.f16624c == 0) {
                this.f16624c = 2;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public b(Set set, Set set2, int i10, int i11, e eVar, Set set3, a aVar) {
        this.f16616a = Collections.unmodifiableSet(set);
        this.f16617b = Collections.unmodifiableSet(set2);
        this.f16618c = i10;
        this.f16619d = i11;
        this.f16620e = eVar;
        this.f16621f = Collections.unmodifiableSet(set3);
    }

    public static <T> C0097b<T> a(Class<T> cls) {
        return new C0097b<>(cls, new Class[0], null);
    }

    @SafeVarargs
    public static <T> b<T> c(T t10, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cls);
        for (Class<? super T> cls2 : clsArr) {
            Objects.requireNonNull(cls2, "Null interface");
        }
        Collections.addAll(hashSet, clsArr);
        return new b<>(new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new n6.a(t10), hashSet3, null);
    }

    public final boolean b() {
        return this.f16619d == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f16616a.toArray()) + ">{" + this.f16618c + ", type=" + this.f16619d + ", deps=" + Arrays.toString(this.f16617b.toArray()) + "}";
    }
}
