package m4;

import androidx.activity.k;

/* loaded from: classes.dex */
public final class zp2 extends yp2 {

    /* renamed from: b */
    public final dd f16307b = new dd(bg1.f6517a);

    /* renamed from: c */
    public final dd f16308c = new dd(4);

    /* renamed from: d */
    public int f16309d;

    /* renamed from: e */
    public boolean f16310e;

    /* renamed from: f */
    public boolean f16311f;

    /* renamed from: g */
    public int f16312g;

    public zp2(mp2 mp2Var) {
        super(mp2Var);
    }

    @Override // m4.yp2
    public final boolean a(dd ddVar) {
        int q10 = ddVar.q();
        int i10 = q10 >> 4;
        int i11 = q10 & 15;
        if (i11 == 7) {
            this.f16312g = i10;
            return i10 != 5;
        }
        throw new xp2(k.a(39, "Video format not supported: ", i11));
    }

    @Override // m4.yp2
    public final boolean b(dd ddVar, long j3) {
        int q10 = ddVar.q();
        byte[] bArr = (byte[]) ddVar.f7311d;
        int i10 = ddVar.f7309b;
        int i11 = i10 + 1;
        ddVar.f7309b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        ddVar.f7309b = i12;
        byte b11 = bArr[i11];
        ddVar.f7309b = i12 + 1;
        long j10 = (((bArr[i12] & 255) | (((b10 & 255) << 24) >> 8) | ((b11 & 255) << 8)) * 1000) + j3;
        if (q10 == 0) {
            if (!this.f16310e) {
                dd ddVar2 = new dd(new byte[ddVar.zza()]);
                ddVar.d((byte[]) ddVar2.f7311d, 0, ddVar.zza());
                ho2 a10 = ho2.a(ddVar2);
                this.f16309d = a10.f9398b;
                kq2 kq2Var = new kq2();
                kq2Var.f10542j = "video/avc";
                kq2Var.f10539g = a10.f9402f;
                kq2Var.f10547o = a10.f9399c;
                kq2Var.p = a10.f9400d;
                kq2Var.f10550s = a10.f9401e;
                kq2Var.f10544l = a10.f9397a;
                this.f15879a.f(new t(kq2Var));
                this.f16310e = true;
                return false;
            }
        } else if (q10 == 1 && this.f16310e) {
            int i13 = this.f16312g == 1 ? 1 : 0;
            if (!this.f16311f && i13 == 0) {
                return false;
            }
            byte[] bArr2 = (byte[]) this.f16308c.f7311d;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i14 = 4 - this.f16309d;
            int i15 = 0;
            while (ddVar.zza() > 0) {
                ddVar.d((byte[]) this.f16308c.f7311d, i14, this.f16309d);
                this.f16308c.h(0);
                int s10 = this.f16308c.s();
                this.f16307b.h(0);
                this.f15879a.b(this.f16307b, 4);
                this.f15879a.b(ddVar, s10);
                i15 = i15 + 4 + s10;
            }
            this.f15879a.e(j10, i13, i15, 0, null);
            this.f16311f = true;
            return true;
        }
        return false;
    }
}
