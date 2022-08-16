package m4;

import n9.d;

/* loaded from: classes.dex */
public final class ad {

    /* renamed from: a */
    public final int f6110a;

    /* renamed from: b */
    public int f6111b;

    /* renamed from: c */
    public int f6112c;

    /* renamed from: d */
    public long f6113d;

    /* renamed from: e */
    public final boolean f6114e;

    /* renamed from: f */
    public final rg f6115f;

    /* renamed from: g */
    public final rg f6116g;

    /* renamed from: h */
    public int f6117h;

    /* renamed from: i */
    public int f6118i;

    public ad(rg rgVar, rg rgVar2, boolean z10) {
        this.f6116g = rgVar;
        this.f6115f = rgVar2;
        this.f6114e = z10;
        rgVar2.n(12);
        this.f6110a = rgVar2.d();
        rgVar.n(12);
        this.f6118i = rgVar.d();
        d.j(rgVar.b() != 1 ? false : true, "first_chunk must be 1");
        this.f6111b = -1;
    }

    public final boolean a() {
        int i10 = this.f6111b + 1;
        this.f6111b = i10;
        if (i10 == this.f6110a) {
            return false;
        }
        this.f6113d = this.f6114e ? this.f6115f.h() : this.f6115f.g();
        if (this.f6111b == this.f6117h) {
            this.f6112c = this.f6116g.d();
            this.f6116g.o(4);
            int i11 = -1;
            int i12 = this.f6118i - 1;
            this.f6118i = i12;
            if (i12 > 0) {
                i11 = (-1) + this.f6116g.d();
            }
            this.f6117h = i11;
        }
        return true;
    }
}
