package e9;

import d9.a;
import d9.d;
import d9.e;
import d9.f;
import d9.g;
import d9.h;
import d9.i;
import d9.j;
import d9.k;
import d9.l;
import d9.m;
import d9.n;
import d9.o;
import d9.p;
import d9.q;
import d9.r;
import d9.s;
import d9.t;
import d9.u;
import d9.v;
import d9.w;
import h9.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements b<Object>, b {

    /* renamed from: b */
    public static final Map<Class<Object>, Integer> f4455b;

    /* renamed from: a */
    public final Class<?> f4456a;

    static {
        int i10 = 0;
        List asList = Arrays.asList(a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, d9.b.class, d9.c.class, d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        f.d(asList, "asList(this)");
        ArrayList arrayList = new ArrayList(asList.size());
        for (Object obj : asList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                l4.b.k();
                throw null;
            } else {
                arrayList.add(new v8.d((Class) obj, Integer.valueOf(i10)));
                i10 = i11;
            }
        }
        f4455b = w8.j.m(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        f.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            f.d(str, "kotlinName");
            sb.append(j9.d.t(str));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            hashMap3.put(sb2, str + ".Companion");
        }
        for (Map.Entry<Class<Object>, Integer> entry : f4455b.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d.c.c(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), j9.d.t((String) entry2.getValue()));
        }
    }

    public c(Class<?> cls) {
        f.e(cls, "jClass");
        this.f4456a = cls;
    }

    @Override // e9.b
    public final Class<?> a() {
        return this.f4456a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && f.a(d.g(this), d.g((b) obj));
    }

    public final int hashCode() {
        return d.g(this).hashCode();
    }

    public final String toString() {
        return this.f4456a.toString() + " (Kotlin reflection is not available)";
    }
}
