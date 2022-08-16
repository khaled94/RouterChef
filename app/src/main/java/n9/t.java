package n9;

import d9.p;
import e9.g;
import java.util.Objects;
import k9.y0;
import x8.f;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a */
    public static final r f16720a = new r("NO_THREAD_ELEMENTS");

    /* loaded from: classes.dex */
    public static final class a extends g implements p<Object, f.b, Object> {

        /* renamed from: t */
        public static final a f16721t = new a();

        public a() {
            super(2);
        }

        @Override // d9.p
        public final Object b(Object obj, f.b bVar) {
            f.b bVar2 = bVar;
            if (bVar2 instanceof y0) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num == null ? 1 : num.intValue();
                return intValue == 0 ? bVar2 : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends g implements p<y0<?>, f.b, y0<?>> {

        /* renamed from: t */
        public static final b f16722t = new b();

        public b() {
            super(2);
        }

        @Override // d9.p
        public final y0<?> b(y0<?> y0Var, f.b bVar) {
            y0<?> y0Var2 = y0Var;
            f.b bVar2 = bVar;
            if (y0Var2 != null) {
                return y0Var2;
            }
            if (!(bVar2 instanceof y0)) {
                return null;
            }
            return (y0) bVar2;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends g implements p<w, f.b, w> {

        /* renamed from: t */
        public static final c f16723t = new c();

        public c() {
            super(2);
        }

        @Override // d9.p
        public final w b(w wVar, f.b bVar) {
            w wVar2 = wVar;
            f.b bVar2 = bVar;
            if (bVar2 instanceof y0) {
                y0<Object> y0Var = (y0) bVar2;
                Object j3 = y0Var.j(wVar2.f16725a);
                Object[] objArr = wVar2.f16726b;
                int i10 = wVar2.f16728d;
                objArr[i10] = j3;
                y0<Object>[] y0VarArr = wVar2.f16727c;
                wVar2.f16728d = i10 + 1;
                y0VarArr[i10] = y0Var;
            }
            return wVar2;
        }
    }

    public static final void a(f fVar, Object obj) {
        if (obj == f16720a) {
            return;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            int length = wVar.f16727c.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i10 = length - 1;
                y0<Object> y0Var = wVar.f16727c[length];
                e9.f.c(y0Var);
                y0Var.G(wVar.f16726b[length]);
                if (i10 < 0) {
                    return;
                }
                length = i10;
            }
        } else {
            Object fold = fVar.fold(null, b.f16722t);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((y0) fold).G(obj);
        }
    }

    public static final Object b(f fVar, Object obj) {
        if (obj == null) {
            obj = fVar.fold(0, a.f16721t);
            e9.f.c(obj);
        }
        if (obj == 0) {
            return f16720a;
        }
        return obj instanceof Integer ? fVar.fold(new w(fVar, ((Number) obj).intValue()), c.f16723t) : ((y0) obj).j(fVar);
    }
}
