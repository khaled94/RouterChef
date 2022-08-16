package a8;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import x7.b;
import x7.c;
import x7.s;
import x7.w;
import x7.x;
import z7.e;
import z7.i;
import z7.m;

/* loaded from: classes.dex */
public final class n implements x {

    /* renamed from: s */
    public final e f326s;

    /* renamed from: t */
    public final c f327t;

    /* renamed from: u */
    public final i f328u;

    /* renamed from: v */
    public final e f329v;

    /* loaded from: classes.dex */
    public static final class a<T> extends w<T> {

        /* renamed from: a */
        public final m<T> f330a;

        /* renamed from: b */
        public final Map<String, b> f331b;

        public a(m<T> mVar, Map<String, b> map) {
            this.f330a = mVar;
            this.f331b = map;
        }

        @Override // x7.w
        public final T a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            T c10 = this.f330a.c();
            try {
                aVar.c();
                while (aVar.d0()) {
                    b bVar = this.f331b.get(aVar.r0());
                    if (bVar != null && bVar.f334c) {
                        bVar.a(aVar, c10);
                    }
                    aVar.C0();
                }
                aVar.I();
                return c10;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new s(e11);
            }
        }

        @Override // x7.w
        public final void b(e8.c cVar, T t10) {
            if (t10 == null) {
                cVar.Z();
                return;
            }
            cVar.j();
            try {
                for (b bVar : this.f331b.values()) {
                    if (bVar.c(t10)) {
                        cVar.L(bVar.f332a);
                        bVar.b(cVar, t10);
                    }
                }
                cVar.I();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a */
        public final String f332a;

        /* renamed from: b */
        public final boolean f333b;

        /* renamed from: c */
        public final boolean f334c;

        public b(String str, boolean z10, boolean z11) {
            this.f332a = str;
            this.f333b = z10;
            this.f334c = z11;
        }

        public abstract void a(e8.a aVar, Object obj);

        public abstract void b(e8.c cVar, Object obj);

        public abstract boolean c(Object obj);
    }

    public n(e eVar, i iVar, e eVar2) {
        b.a aVar = x7.b.f20067s;
        this.f326s = eVar;
        this.f327t = aVar;
        this.f328u = iVar;
        this.f329v = eVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196 A[SYNTHETIC] */
    @Override // x7.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> x7.w<T> a(x7.h r33, d8.a<T> r34) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.n.a(x7.h, d8.a):x7.w");
    }

    public final boolean b(Field field, boolean z10) {
        boolean z11;
        i iVar = this.f328u;
        Class<?> type = field.getType();
        if (!(iVar.c(type) || iVar.b(type, z10))) {
            if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || iVar.c(field.getType())) {
                z11 = true;
                break;
            }
            List<x7.a> list = z10 ? iVar.f21022s : iVar.f21023t;
            if (!list.isEmpty()) {
                Objects.requireNonNull(field);
                for (x7.a aVar : list) {
                    if (aVar.b()) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            return !z11;
        }
        return false;
    }
}
