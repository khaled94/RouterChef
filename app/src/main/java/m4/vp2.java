package m4;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class vp2 implements to2 {

    /* renamed from: f */
    public vo2 f14746f;

    /* renamed from: h */
    public boolean f14748h;

    /* renamed from: i */
    public long f14749i;

    /* renamed from: j */
    public int f14750j;

    /* renamed from: k */
    public int f14751k;

    /* renamed from: l */
    public int f14752l;

    /* renamed from: m */
    public long f14753m;

    /* renamed from: n */
    public boolean f14754n;

    /* renamed from: o */
    public up2 f14755o;
    public zp2 p;

    /* renamed from: a */
    public final dd f14741a = new dd(4);

    /* renamed from: b */
    public final dd f14742b = new dd(9);

    /* renamed from: c */
    public final dd f14743c = new dd(11);

    /* renamed from: d */
    public final dd f14744d = new dd();

    /* renamed from: e */
    public final wp2 f14745e = new wp2();

    /* renamed from: g */
    public int f14747g = 1;

    public final dd a(uo2 uo2Var) {
        if (this.f14752l > this.f14744d.a()) {
            dd ddVar = this.f14744d;
            int a10 = ddVar.a();
            ddVar.f(new byte[Math.max(a10 + a10, this.f14752l)], 0);
        } else {
            this.f14744d.h(0);
        }
        this.f14744d.g(this.f14752l);
        ((qo2) uo2Var).n((byte[]) this.f14744d.f7311d, 0, this.f14752l, false);
        return this.f14744d;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void b() {
        if (!this.f14754n) {
            this.f14746f.l(new ip2(-9223372036854775807L, 0L));
            this.f14754n = true;
        }
    }

    @Override // m4.to2
    public final boolean c(uo2 uo2Var) {
        qo2 qo2Var = (qo2) uo2Var;
        qo2Var.o((byte[]) this.f14741a.f7311d, 0, 3, false);
        this.f14741a.h(0);
        if (this.f14741a.r() != 4607062) {
            return false;
        }
        qo2Var.o((byte[]) this.f14741a.f7311d, 0, 2, false);
        this.f14741a.h(0);
        if ((this.f14741a.t() & 250) != 0) {
            return false;
        }
        qo2Var.o((byte[]) this.f14741a.f7311d, 0, 4, false);
        this.f14741a.h(0);
        int l10 = this.f14741a.l();
        ((qo2) uo2Var).f12948f = 0;
        qo2Var.p(l10, false);
        qo2Var.o((byte[]) this.f14741a.f7311d, 0, 4, false);
        this.f14741a.h(0);
        return this.f14741a.l() == 0;
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.f14746f = vo2Var;
    }

    @Override // m4.to2
    public final void g(long j3, long j10) {
        if (j3 == 0) {
            this.f14747g = 1;
            this.f14748h = false;
        } else {
            this.f14747g = 3;
        }
        this.f14750j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0009 A[SYNTHETIC] */
    @Override // m4.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(m4.uo2 r17, m4.gp2 r18) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.vp2.h(m4.uo2, m4.gp2):int");
    }
}
