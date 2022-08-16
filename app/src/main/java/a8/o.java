package a8;

import e8.c;
import j0.d;
import java.lang.reflect.Type;
import x7.h;
import x7.k;
import x7.r;
import x7.w;

/* loaded from: classes.dex */
public final class o<T> extends w<T> {

    /* renamed from: a */
    public final r<T> f335a;

    /* renamed from: b */
    public final k<T> f336b;

    /* renamed from: c */
    public final h f337c;

    /* renamed from: d */
    public final d8.a<T> f338d;

    /* renamed from: e */
    public final o<T>.a f339e = new a();

    /* renamed from: f */
    public volatile w<T> f340f;

    /* loaded from: classes.dex */
    public final class a {
    }

    public o(r rVar, k kVar, h hVar, d8.a aVar) {
        this.f335a = rVar;
        this.f336b = kVar;
        this.f337c = hVar;
        this.f338d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Type inference failed for: r2v0, types: [x7.w<x7.l>, a8.q$t] */
    @Override // x7.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T a(e8.a r4) {
        /*
            r3 = this;
            x7.k<T> r0 = r3.f336b
            r1 = 0
            if (r0 != 0) goto L19
            x7.w<T> r0 = r3.f340f
            if (r0 == 0) goto La
            goto L14
        La:
            x7.h r0 = r3.f337c
            d8.a<T> r2 = r3.f338d
            x7.w r0 = r0.d(r1, r2)
            r3.f340f = r0
        L14:
            java.lang.Object r4 = r0.a(r4)
            return r4
        L19:
            r4.x0()     // Catch: java.lang.NumberFormatException -> L26 java.io.IOException -> L2d e8.d -> L34 java.io.EOFException -> L3b
            r0 = 0
            x7.w<x7.l> r2 = a8.q.V     // Catch: java.io.EOFException -> L24 java.lang.NumberFormatException -> L26 java.io.IOException -> L2d e8.d -> L34
            x7.l r4 = r2.a(r4)     // Catch: java.io.EOFException -> L24 java.lang.NumberFormatException -> L26 java.io.IOException -> L2d e8.d -> L34
            goto L41
        L24:
            r4 = move-exception
            goto L3d
        L26:
            r4 = move-exception
            x7.s r0 = new x7.s
            r0.<init>(r4)
            throw r0
        L2d:
            r4 = move-exception
            x7.m r0 = new x7.m
            r0.<init>(r4)
            throw r0
        L34:
            r4 = move-exception
            x7.s r0 = new x7.s
            r0.<init>(r4)
            throw r0
        L3b:
            r4 = move-exception
            r0 = 1
        L3d:
            if (r0 == 0) goto L54
            x7.n r4 = x7.n.f20087a
        L41:
            java.util.Objects.requireNonNull(r4)
            boolean r4 = r4 instanceof x7.n
            if (r4 == 0) goto L49
            return r1
        L49:
            x7.k<T> r4 = r3.f336b
            d8.a<T> r0 = r3.f338d
            java.lang.reflect.Type r0 = r0.f3995b
            java.lang.Object r4 = r4.a()
            return r4
        L54:
            x7.s r0 = new x7.s
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.o.a(e8.a):java.lang.Object");
    }

    @Override // x7.w
    public final void b(c cVar, T t10) {
        r<T> rVar = this.f335a;
        if (rVar == null) {
            w<T> wVar = this.f340f;
            if (wVar == null) {
                wVar = this.f337c.d(null, this.f338d);
                this.f340f = wVar;
            }
            wVar.b(cVar, t10);
        } else if (t10 == null) {
            cVar.Z();
        } else {
            Type type = this.f338d.f3995b;
            d.d(rVar.a(), cVar);
        }
    }
}
