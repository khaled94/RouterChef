package m4;

import android.net.Uri;

/* loaded from: classes.dex */
public final class ec0 implements bg {

    /* renamed from: a */
    public final bg f7775a;

    /* renamed from: b */
    public final long f7776b;

    /* renamed from: c */
    public final bg f7777c;

    /* renamed from: d */
    public long f7778d;

    /* renamed from: e */
    public Uri f7779e;

    public ec0(bg bgVar, int i10, bg bgVar2) {
        this.f7775a = bgVar;
        this.f7776b = i10;
        this.f7777c = bgVar2;
    }

    @Override // m4.bg
    public final Uri c() {
        return this.f7779e;
    }

    @Override // m4.bg
    public final int e(byte[] bArr, int i10, int i11) {
        int i12;
        long j3 = this.f7778d;
        long j10 = this.f7776b;
        if (j3 < j10) {
            int e10 = this.f7775a.e(bArr, i10, (int) Math.min(i11, j10 - j3));
            long j11 = this.f7778d + e10;
            this.f7778d = j11;
            i12 = e10;
            j3 = j11;
        } else {
            i12 = 0;
        }
        if (j3 >= this.f7776b) {
            int e11 = this.f7777c.e(bArr, i10 + i12, i11 - i12);
            this.f7778d += e11;
            return i12 + e11;
        }
        return i12;
    }

    @Override // m4.bg
    public final long f(dg dgVar) {
        dg dgVar2;
        this.f7779e = dgVar.f7364a;
        long j3 = dgVar.f7366c;
        long j10 = this.f7776b;
        dg dgVar3 = null;
        if (j3 >= j10) {
            dgVar2 = null;
        } else {
            long j11 = dgVar.f7367d;
            long j12 = j10 - j3;
            if (j11 != -1) {
                j12 = Math.min(j11, j12);
            }
            dgVar2 = new dg(dgVar.f7364a, j3, j3, j12);
        }
        long j13 = dgVar.f7367d;
        if (j13 == -1 || dgVar.f7366c + j13 > this.f7776b) {
            long max = Math.max(this.f7776b, dgVar.f7366c);
            long j14 = dgVar.f7367d;
            dgVar3 = new dg(dgVar.f7364a, max, max, j14 != -1 ? Math.min(j14, (dgVar.f7366c + j14) - this.f7776b) : -1L);
        }
        long j15 = 0;
        long f10 = dgVar2 != null ? this.f7775a.f(dgVar2) : 0L;
        if (dgVar3 != null) {
            j15 = this.f7777c.f(dgVar3);
        }
        this.f7778d = dgVar.f7366c;
        if (j15 == -1) {
            return -1L;
        }
        return f10 + j15;
    }

    @Override // m4.bg
    public final void g() {
        this.f7775a.g();
        this.f7777c.g();
    }
}
