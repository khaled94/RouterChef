package da;

import da.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* loaded from: classes.dex */
public final class e extends c.a {

    /* renamed from: a */
    public static final e f4021a = new e();

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    public static final class a<R> implements da.c<R, CompletableFuture<R>> {

        /* renamed from: a */
        public final Type f4022a;

        @IgnoreJRERequirement
        /* renamed from: da.e$a$a */
        /* loaded from: classes.dex */
        public class C0058a implements d<R> {

            /* renamed from: a */
            public final CompletableFuture<R> f4023a;

            public C0058a(CompletableFuture<R> completableFuture) {
                this.f4023a = completableFuture;
            }

            @Override // da.d
            public final void a(da.b<R> bVar, a0<R> a0Var) {
                if (a0Var.a()) {
                    this.f4023a.complete(a0Var.f4005b);
                } else {
                    this.f4023a.completeExceptionally(new k(a0Var));
                }
            }

            @Override // da.d
            public final void b(da.b<R> bVar, Throwable th) {
                this.f4023a.completeExceptionally(th);
            }
        }

        public a(Type type) {
            this.f4022a = type;
        }

        @Override // da.c
        public final Type a() {
            return this.f4022a;
        }

        @Override // da.c
        public final Object b(da.b bVar) {
            b bVar2 = new b(bVar);
            ((s) bVar).G(new C0058a(bVar2));
            return bVar2;
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: s */
        public final da.b<?> f4024s;

        public b(da.b<?> bVar) {
            this.f4024s = bVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            if (z10) {
                this.f4024s.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    public static final class c<R> implements da.c<R, CompletableFuture<a0<R>>> {

        /* renamed from: a */
        public final Type f4025a;

        @IgnoreJRERequirement
        /* loaded from: classes.dex */
        public class a implements d<R> {

            /* renamed from: a */
            public final CompletableFuture<a0<R>> f4026a;

            public a(CompletableFuture<a0<R>> completableFuture) {
                this.f4026a = completableFuture;
            }

            @Override // da.d
            public final void a(da.b<R> bVar, a0<R> a0Var) {
                this.f4026a.complete(a0Var);
            }

            @Override // da.d
            public final void b(da.b<R> bVar, Throwable th) {
                this.f4026a.completeExceptionally(th);
            }
        }

        public c(Type type) {
            this.f4025a = type;
        }

        @Override // da.c
        public final Type a() {
            return this.f4025a;
        }

        @Override // da.c
        public final Object b(da.b bVar) {
            b bVar2 = new b(bVar);
            ((s) bVar).G(new a(bVar2));
            return bVar2;
        }
    }

    @Override // da.c.a
    @Nullable
    public final da.c a(Type type, Annotation[] annotationArr) {
        if (f0.f(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type e10 = f0.e(0, (ParameterizedType) type);
        if (f0.f(e10) != a0.class) {
            return new a(e10);
        }
        if (!(e10 instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new c(f0.e(0, (ParameterizedType) e10));
    }
}
