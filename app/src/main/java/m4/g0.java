package m4;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a */
    public final int f8685a;

    /* renamed from: b */
    public int f8686b;

    /* renamed from: c */
    public int f8687c;

    /* renamed from: d */
    public long f8688d;

    /* renamed from: e */
    public final boolean f8689e;

    /* renamed from: f */
    public final dd f8690f;

    /* renamed from: g */
    public final dd f8691g;

    /* renamed from: h */
    public int f8692h;

    /* renamed from: i */
    public int f8693i;

    public g0(dd ddVar, dd ddVar2, boolean z10) {
        this.f8691g = ddVar;
        this.f8690f = ddVar2;
        this.f8689e = z10;
        ddVar2.h(12);
        this.f8685a = ddVar2.s();
        ddVar.h(12);
        this.f8693i = ddVar.s();
        wo2.f(ddVar.l() != 1 ? false : true, "first_chunk must be 1");
        this.f8686b = -1;
    }

    public final boolean a() {
        int i10 = this.f8686b + 1;
        this.f8686b = i10;
        if (i10 == this.f8685a) {
            return false;
        }
        this.f8688d = this.f8689e ? this.f8690f.x() : this.f8690f.w();
        if (this.f8686b == this.f8692h) {
            this.f8687c = this.f8691g.s();
            this.f8691g.i(4);
            int i11 = -1;
            int i12 = this.f8693i - 1;
            this.f8693i = i12;
            if (i12 > 0) {
                i11 = (-1) + this.f8691g.s();
            }
            this.f8692h = i11;
        }
        return true;
    }
}
