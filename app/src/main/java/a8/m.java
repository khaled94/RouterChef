package a8;

import a8.n;
import d8.a;
import e8.c;
import java.lang.reflect.Field;
import x7.h;
import x7.w;

/* loaded from: classes.dex */
public final class m extends n.b {

    /* renamed from: d */
    public final /* synthetic */ Field f320d;

    /* renamed from: e */
    public final /* synthetic */ boolean f321e;

    /* renamed from: f */
    public final /* synthetic */ w f322f;

    /* renamed from: g */
    public final /* synthetic */ h f323g;

    /* renamed from: h */
    public final /* synthetic */ a f324h;

    /* renamed from: i */
    public final /* synthetic */ boolean f325i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, boolean z10, boolean z11, Field field, boolean z12, w wVar, h hVar, a aVar, boolean z13) {
        super(str, z10, z11);
        this.f320d = field;
        this.f321e = z12;
        this.f322f = wVar;
        this.f323g = hVar;
        this.f324h = aVar;
        this.f325i = z13;
    }

    @Override // a8.n.b
    public final void a(e8.a aVar, Object obj) {
        Object a10 = this.f322f.a(aVar);
        if (a10 != null || !this.f325i) {
            this.f320d.set(obj, a10);
        }
    }

    @Override // a8.n.b
    public final void b(c cVar, Object obj) {
        (this.f321e ? this.f322f : new p(this.f323g, this.f322f, this.f324h.f3995b)).b(cVar, this.f320d.get(obj));
    }

    @Override // a8.n.b
    public final boolean c(Object obj) {
        return this.f333b && this.f320d.get(obj) != obj;
    }
}
