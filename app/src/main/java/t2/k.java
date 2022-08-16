package t2;

import a3.f;
import a3.r;
import a3.s;
import a3.v;
import a3.w;
import a3.x;
import android.content.Context;
import b3.b0;
import b3.c0;
import b3.g;
import b3.j0;
import java.util.Objects;
import java.util.concurrent.Executor;
import t2.o;
import u2.m;
import u8.a;
import w2.b;
import z2.c;
import z2.d;

/* loaded from: classes.dex */
public final class k extends x {
    public a<x> A;
    public a<c> B;
    public a<r> C;
    public a<v> D;
    public a<w> E;

    /* renamed from: s */
    public a<Executor> f18533s = w2.a.a(o.a.f18542a);

    /* renamed from: t */
    public a<Context> f18534t;

    /* renamed from: u */
    public u2.k f18535u;

    /* renamed from: v */
    public a f18536v;

    /* renamed from: w */
    public j0 f18537w;

    /* renamed from: x */
    public a<String> f18538x;
    public a<b0> y;

    /* renamed from: z */
    public a<f> f18539z;

    public k(Context context) {
        Objects.requireNonNull(context, "instance cannot be null");
        b bVar = new b(context);
        this.f18534t = bVar;
        u2.k kVar = new u2.k(bVar);
        this.f18535u = kVar;
        this.f18536v = w2.a.a(new m(bVar, kVar));
        a<Context> aVar = this.f18534t;
        j0 j0Var = new j0(aVar);
        this.f18537w = j0Var;
        g gVar = new g(aVar);
        this.f18538x = gVar;
        a<b0> a10 = w2.a.a(new c0(j0Var, gVar));
        this.y = a10;
        z2.f fVar = new z2.f();
        this.f18539z = fVar;
        a<Context> aVar2 = this.f18534t;
        z2.g gVar2 = new z2.g(aVar2, a10, fVar);
        this.A = gVar2;
        a<Executor> aVar3 = this.f18533s;
        a aVar4 = this.f18536v;
        d dVar = new d(aVar3, aVar4, gVar2, a10, a10);
        this.B = dVar;
        s sVar = new s(aVar2, aVar4, a10, gVar2, aVar3, a10, a10);
        this.C = sVar;
        w wVar = new w(aVar3, a10, gVar2, a10);
        this.D = wVar;
        this.E = w2.a.a(new y(dVar, sVar, wVar));
    }
}
