package a8;

import d8.a;
import x7.h;
import x7.k;
import x7.r;
import x7.v;
import x7.w;
import x7.x;

/* loaded from: classes.dex */
public final class e implements x {

    /* renamed from: s */
    public final z7.e f306s;

    public e(z7.e eVar) {
        this.f306s = eVar;
    }

    @Override // x7.x
    public final <T> w<T> a(h hVar, a<T> aVar) {
        y7.a aVar2 = (y7.a) aVar.f3994a.getAnnotation(y7.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (w<T>) b(this.f306s, hVar, aVar, aVar2);
    }

    public final w<?> b(z7.e eVar, h hVar, a<?> aVar, y7.a aVar2) {
        w<?> wVar;
        Object c10 = eVar.a(new a(aVar2.value())).c();
        if (c10 instanceof w) {
            wVar = (w) c10;
        } else if (c10 instanceof x) {
            wVar = ((x) c10).a(hVar, aVar);
        } else {
            boolean z10 = c10 instanceof r;
            if (!z10 && !(c10 instanceof k)) {
                StringBuilder c11 = androidx.activity.result.a.c("Invalid attempt to bind an instance of ");
                c11.append(c10.getClass().getName());
                c11.append(" as a @JsonAdapter for ");
                c11.append(aVar.toString());
                c11.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(c11.toString());
            }
            k kVar = null;
            r rVar = z10 ? (r) c10 : null;
            if (c10 instanceof k) {
                kVar = (k) c10;
            }
            wVar = new o<>(rVar, kVar, hVar, aVar);
        }
        return (wVar == null || !aVar2.nullSafe()) ? wVar : new v(wVar);
    }
}
