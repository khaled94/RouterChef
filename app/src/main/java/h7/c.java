package h7;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final String f5135a;

    /* renamed from: b */
    public final Map<Class<?>, Object> f5136b;

    public c(String str, Map<Class<?>, Object> map) {
        this.f5135a = str;
        this.f5136b = map;
    }

    public c(String str, Map map, a aVar) {
        this.f5135a = str;
        this.f5136b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5135a.equals(cVar.f5135a) && this.f5136b.equals(cVar.f5136b);
    }

    public final int hashCode() {
        return this.f5136b.hashCode() + (this.f5135a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("FieldDescriptor{name=");
        c10.append(this.f5135a);
        c10.append(", properties=");
        c10.append(this.f5136b.values());
        c10.append("}");
        return c10.toString();
    }
}
