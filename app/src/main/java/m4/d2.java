package m4;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class d2 implements u1 {

    /* renamed from: a */
    public final s2 f7173a;

    /* renamed from: b */
    public String f7174b;

    /* renamed from: c */
    public mp2 f7175c;

    /* renamed from: d */
    public c2 f7176d;

    /* renamed from: e */
    public boolean f7177e;

    /* renamed from: l */
    public long f7184l;

    /* renamed from: f */
    public final boolean[] f7178f = new boolean[3];

    /* renamed from: g */
    public final h2 f7179g = new h2(32);

    /* renamed from: h */
    public final h2 f7180h = new h2(33);

    /* renamed from: i */
    public final h2 f7181i = new h2(34);

    /* renamed from: j */
    public final h2 f7182j = new h2(39);

    /* renamed from: k */
    public final h2 f7183k = new h2(40);

    /* renamed from: m */
    public long f7185m = -9223372036854775807L;

    /* renamed from: n */
    public final dd f7186n = new dd();

    public d2(s2 s2Var) {
        this.f7173a = s2Var;
    }

    @RequiresNonNull({"sampleReader"})
    public final void a(byte[] bArr, int i10, int i11) {
        c2 c2Var = this.f7176d;
        if (c2Var.f6688f) {
            int i12 = c2Var.f6686d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                c2Var.f6689g = (bArr[i13] & 128) != 0;
                c2Var.f6688f = false;
            } else {
                c2Var.f6686d = (i11 - i10) + i12;
            }
        }
        if (!this.f7177e) {
            this.f7179g.a(bArr, i10, i11);
            this.f7180h.a(bArr, i10, i11);
            this.f7181i.a(bArr, i10, i11);
        }
        this.f7182j.a(bArr, i10, i11);
        this.f7183k.a(bArr, i10, i11);
    }

    @Override // m4.u1
    public final void b() {
        this.f7184l = 0L;
        this.f7185m = -9223372036854775807L;
        bg1.e(this.f7178f);
        this.f7179g.b();
        this.f7180h.b();
        this.f7181i.b();
        this.f7182j.b();
        this.f7183k.b();
        c2 c2Var = this.f7176d;
        if (c2Var != null) {
            c2Var.f6688f = false;
            c2Var.f6689g = false;
            c2Var.f6690h = false;
            c2Var.f6691i = false;
            c2Var.f6692j = false;
        }
    }

    @Override // m4.u1
    public final void c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0439 A[SYNTHETIC] */
    @Override // m4.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(m4.dd r34) {
        /*
            Method dump skipped, instructions count: 1111
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.d2.d(m4.dd):void");
    }

    @Override // m4.u1
    public final void e(vo2 vo2Var, a3 a3Var) {
        a3Var.c();
        this.f7174b = a3Var.b();
        mp2 p = vo2Var.p(a3Var.a(), 2);
        this.f7175c = p;
        this.f7176d = new c2(p);
        this.f7173a.b(vo2Var, a3Var);
    }

    @Override // m4.u1
    public final void f(long j3, int i10) {
        if (j3 != -9223372036854775807L) {
            this.f7185m = j3;
        }
    }
}
