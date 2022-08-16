package da;

import da.f;
import fa.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import r9.f0;
import r9.i0;
import v8.h;

/* loaded from: classes.dex */
public final class a extends f.a {

    /* renamed from: a */
    public boolean f3997a = true;

    /* renamed from: da.a$a */
    /* loaded from: classes.dex */
    public static final class C0057a implements da.f<i0, i0> {

        /* renamed from: s */
        public static final C0057a f3998s = new C0057a();

        @Override // da.f
        public final i0 b(i0 i0Var) {
            i0 i0Var2 = i0Var;
            try {
                return f0.a(i0Var2);
            } finally {
                i0Var2.close();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements da.f<f0, f0> {

        /* renamed from: s */
        public static final b f3999s = new b();

        @Override // da.f
        public final f0 b(f0 f0Var) {
            return f0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements da.f<i0, i0> {

        /* renamed from: s */
        public static final c f4000s = new c();

        @Override // da.f
        public final i0 b(i0 i0Var) {
            return i0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements da.f<Object, String> {

        /* renamed from: s */
        public static final d f4001s = new d();

        @Override // da.f
        public final String b(Object obj) {
            return obj.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements da.f<i0, h> {

        /* renamed from: s */
        public static final e f4002s = new e();

        @Override // da.f
        public final h b(i0 i0Var) {
            i0Var.close();
            return h.f19835a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements da.f<i0, Void> {

        /* renamed from: s */
        public static final f f4003s = new f();

        @Override // da.f
        public final Void b(i0 i0Var) {
            i0Var.close();
            return null;
        }
    }

    @Override // da.f.a
    @Nullable
    public final da.f a(Type type) {
        if (f0.class.isAssignableFrom(f0.f(type))) {
            return b.f3999s;
        }
        return null;
    }

    @Override // da.f.a
    @Nullable
    public final da.f<i0, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        if (type == i0.class) {
            return f0.i(annotationArr, w.class) ? c.f4000s : C0057a.f3998s;
        } else if (type == Void.class) {
            return f.f4003s;
        } else {
            if (!this.f3997a || type != h.class) {
                return null;
            }
            try {
                return e.f4002s;
            } catch (NoClassDefFoundError unused) {
                this.f3997a = false;
                return null;
            }
        }
    }
}
