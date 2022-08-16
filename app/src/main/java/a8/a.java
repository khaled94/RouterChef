package a8;

import e8.c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import x7.h;
import x7.w;
import x7.x;

/* loaded from: classes.dex */
public final class a<E> extends w<Object> {

    /* renamed from: c */
    public static final C0003a f298c = new C0003a();

    /* renamed from: a */
    public final Class<E> f299a;

    /* renamed from: b */
    public final w<E> f300b;

    /* renamed from: a8.a$a */
    /* loaded from: classes.dex */
    public class C0003a implements x {
        @Override // x7.x
        public final <T> w<T> a(h hVar, d8.a<T> aVar) {
            Type type = aVar.f3995b;
            boolean z10 = type instanceof GenericArrayType;
            if (z10 || ((type instanceof Class) && ((Class) type).isArray())) {
                Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new a(hVar, hVar.c(new d8.a<>(genericComponentType)), z7.a.f(genericComponentType));
            }
            return null;
        }
    }

    public a(h hVar, w<E> wVar, Class<E> cls) {
        this.f300b = new p(hVar, wVar, cls);
        this.f299a = cls;
    }

    @Override // x7.w
    public final Object a(e8.a aVar) {
        if (aVar.x0() == 9) {
            aVar.t0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.d0()) {
            arrayList.add(this.f300b.a(aVar));
        }
        aVar.H();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f299a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x7.w
    public final void b(c cVar, Object obj) {
        if (obj == null) {
            cVar.Z();
            return;
        }
        cVar.c();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f300b.b(cVar, Array.get(obj, i10));
        }
        cVar.H();
    }
}
