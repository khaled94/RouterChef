package m4;

/* loaded from: classes.dex */
public final class k0 implements h0 {

    /* renamed from: a */
    public final dd f10222a;

    /* renamed from: b */
    public final int f10223b;

    /* renamed from: c */
    public final int f10224c;

    /* renamed from: d */
    public int f10225d;

    /* renamed from: e */
    public int f10226e;

    public k0(e0 e0Var) {
        dd ddVar = e0Var.f7675b;
        this.f10222a = ddVar;
        ddVar.h(12);
        this.f10224c = ddVar.s() & 255;
        this.f10223b = ddVar.s();
    }

    @Override // m4.h0
    public final int a() {
        return this.f10223b;
    }

    @Override // m4.h0
    public final int c() {
        int i10 = this.f10224c;
        if (i10 == 8) {
            return this.f10222a.q();
        }
        if (i10 == 16) {
            return this.f10222a.t();
        }
        int i11 = this.f10225d;
        this.f10225d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f10226e & 15;
        }
        int q10 = this.f10222a.q();
        this.f10226e = q10;
        return (q10 & 240) >> 4;
    }

    @Override // m4.h0
    public final int zza() {
        return -1;
    }
}
