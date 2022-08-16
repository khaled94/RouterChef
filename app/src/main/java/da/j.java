package da;

import da.c;
import da.j;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import r9.c0;

/* loaded from: classes.dex */
public final class j extends c.a {
    @Nullable

    /* renamed from: a */
    public final Executor f4043a;

    /* loaded from: classes.dex */
    public static final class a<T> implements b<T> {

        /* renamed from: s */
        public final Executor f4044s;

        /* renamed from: t */
        public final b<T> f4045t;

        /* renamed from: da.j$a$a */
        /* loaded from: classes.dex */
        public class C0059a implements d<T> {

            /* renamed from: a */
            public final /* synthetic */ d f4046a;

            public C0059a(d dVar) {
                a.this = r1;
                this.f4046a = dVar;
            }

            @Override // da.d
            public final void a(b<T> bVar, final a0<T> a0Var) {
                Executor executor = a.this.f4044s;
                final d dVar = this.f4046a;
                executor.execute(new Runnable() { // from class: da.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.a.C0059a c0059a = j.a.C0059a.this;
                        d dVar2 = dVar;
                        a0 a0Var2 = a0Var;
                        boolean I = j.a.this.f4045t.I();
                        j.a aVar = j.a.this;
                        if (I) {
                            dVar2.b(aVar, new IOException("Canceled"));
                        } else {
                            dVar2.a(aVar, a0Var2);
                        }
                    }
                });
            }

            @Override // da.d
            public final void b(b<T> bVar, final Throwable th) {
                Executor executor = a.this.f4044s;
                final d dVar = this.f4046a;
                executor.execute(new Runnable() { // from class: da.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.a.C0059a c0059a = j.a.C0059a.this;
                        dVar.b(j.a.this, th);
                    }
                });
            }
        }

        public a(Executor executor, b<T> bVar) {
            this.f4044s = executor;
            this.f4045t = bVar;
        }

        @Override // da.b
        public final void G(d<T> dVar) {
            this.f4045t.G(new C0059a(dVar));
        }

        @Override // da.b
        public final c0 H() {
            return this.f4045t.H();
        }

        @Override // da.b
        public final boolean I() {
            return this.f4045t.I();
        }

        @Override // da.b
        public final void cancel() {
            this.f4045t.cancel();
        }

        public final Object clone() {
            return new a(this.f4044s, this.f4045t.j());
        }

        @Override // da.b
        public final b<T> j() {
            return new a(this.f4044s, this.f4045t.j());
        }
    }

    public j(@Nullable Executor executor) {
        this.f4043a = executor;
    }

    @Override // da.c.a
    @Nullable
    public final c a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (f0.f(type) != b.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        Type e10 = f0.e(0, (ParameterizedType) type);
        if (!f0.i(annotationArr, d0.class)) {
            executor = this.f4043a;
        }
        return new g(e10, executor);
    }
}
