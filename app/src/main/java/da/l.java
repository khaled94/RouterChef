package da;

import androidx.lifecycle.h0;
import javax.annotation.Nullable;
import r9.f;
import r9.i0;
import x8.d;

/* loaded from: classes.dex */
public abstract class l<ResponseT, ReturnT> extends c0<ReturnT> {

    /* renamed from: a */
    public final z f4048a;

    /* renamed from: b */
    public final f.a f4049b;

    /* renamed from: c */
    public final f<i0, ResponseT> f4050c;

    /* loaded from: classes.dex */
    public static final class a<ResponseT, ReturnT> extends l<ResponseT, ReturnT> {

        /* renamed from: d */
        public final da.c<ResponseT, ReturnT> f4051d;

        public a(z zVar, f.a aVar, f<i0, ResponseT> fVar, da.c<ResponseT, ReturnT> cVar) {
            super(zVar, aVar, fVar);
            this.f4051d = cVar;
        }

        @Override // da.l
        public final ReturnT c(da.b<ResponseT> bVar, Object[] objArr) {
            return this.f4051d.b(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<ResponseT> extends l<ResponseT, Object> {

        /* renamed from: d */
        public final da.c<ResponseT, da.b<ResponseT>> f4052d;

        public b(z zVar, f.a aVar, f fVar, da.c cVar) {
            super(zVar, aVar, fVar);
            this.f4052d = cVar;
        }

        @Override // da.l
        public final Object c(da.b<ResponseT> bVar, Object[] objArr) {
            da.b<ResponseT> b10 = this.f4052d.b(bVar);
            d dVar = (d) objArr[objArr.length - 1];
            try {
                k9.f fVar = new k9.f(h0.b(dVar));
                fVar.q(new n(b10));
                b10.G(new o(fVar));
                return fVar.p();
            } catch (Exception e10) {
                return r.a(e10, dVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c<ResponseT> extends l<ResponseT, Object> {

        /* renamed from: d */
        public final da.c<ResponseT, da.b<ResponseT>> f4053d;

        public c(z zVar, f.a aVar, f<i0, ResponseT> fVar, da.c<ResponseT, da.b<ResponseT>> cVar) {
            super(zVar, aVar, fVar);
            this.f4053d = cVar;
        }

        @Override // da.l
        public final Object c(da.b<ResponseT> bVar, Object[] objArr) {
            da.b<ResponseT> b10 = this.f4053d.b(bVar);
            d dVar = (d) objArr[objArr.length - 1];
            try {
                k9.f fVar = new k9.f(h0.b(dVar));
                fVar.q(new p(b10));
                b10.G(new q(fVar));
                return fVar.p();
            } catch (Exception e10) {
                return r.a(e10, dVar);
            }
        }
    }

    public l(z zVar, f.a aVar, f<i0, ResponseT> fVar) {
        this.f4048a = zVar;
        this.f4049b = aVar;
        this.f4050c = fVar;
    }

    @Override // da.c0
    @Nullable
    public final ReturnT a(Object[] objArr) {
        return c(new s(this.f4048a, objArr, this.f4049b, this.f4050c), objArr);
    }

    @Nullable
    public abstract ReturnT c(da.b<ResponseT> bVar, Object[] objArr);
}
