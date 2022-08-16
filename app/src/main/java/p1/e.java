package p1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends l {

    /* renamed from: a */
    public final /* synthetic */ Object f16896a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f16897b;

    /* renamed from: c */
    public final /* synthetic */ Object f16898c = null;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f16899d = null;

    /* renamed from: e */
    public final /* synthetic */ Object f16900e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f16901f;

    /* renamed from: g */
    public final /* synthetic */ d f16902g;

    public e(d dVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f16902g = dVar;
        this.f16896a = obj;
        this.f16897b = arrayList;
        this.f16900e = obj2;
        this.f16901f = arrayList2;
    }

    @Override // p1.i.d
    public final void a(i iVar) {
        iVar.w(this);
    }

    @Override // p1.l, p1.i.d
    public final void e(i iVar) {
        Object obj = this.f16896a;
        if (obj != null) {
            this.f16902g.t(obj, this.f16897b, null);
        }
        Object obj2 = this.f16898c;
        if (obj2 != null) {
            this.f16902g.t(obj2, this.f16899d, null);
        }
        Object obj3 = this.f16900e;
        if (obj3 != null) {
            this.f16902g.t(obj3, this.f16901f, null);
        }
    }
}
