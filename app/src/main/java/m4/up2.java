package m4;

import androidx.activity.k;
import e1.h;
import java.util.Collections;

/* loaded from: classes.dex */
public final class up2 extends yp2 {

    /* renamed from: e */
    public static final int[] f14468e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f14469b;

    /* renamed from: c */
    public boolean f14470c;

    /* renamed from: d */
    public int f14471d;

    public up2(mp2 mp2Var) {
        super(mp2Var);
    }

    @Override // m4.yp2
    public final boolean a(dd ddVar) {
        t tVar;
        if (!this.f14469b) {
            int q10 = ddVar.q();
            int i10 = q10 >> 4;
            this.f14471d = i10;
            if (i10 == 2) {
                int i11 = f14468e[(q10 >> 2) & 3];
                kq2 kq2Var = new kq2();
                kq2Var.f10542j = "audio/mpeg";
                kq2Var.f10554w = 1;
                kq2Var.f10555x = i11;
                tVar = new t(kq2Var);
            } else if (i10 == 7 || i10 == 8) {
                String str = i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                kq2 kq2Var2 = new kq2();
                kq2Var2.f10542j = str;
                kq2Var2.f10554w = 1;
                kq2Var2.f10555x = 8000;
                tVar = new t(kq2Var2);
            } else {
                if (i10 != 10) {
                    throw new xp2(k.a(39, "Audio format not supported: ", i10));
                }
                this.f14469b = true;
            }
            this.f15879a.f(tVar);
            this.f14470c = true;
            this.f14469b = true;
        } else {
            ddVar.i(1);
        }
        return true;
    }

    @Override // m4.yp2
    public final boolean b(dd ddVar, long j3) {
        if (this.f14471d == 2) {
            int zza = ddVar.zza();
            this.f15879a.b(ddVar, zza);
            this.f15879a.e(j3, 1, zza, 0, null);
            return true;
        }
        int q10 = ddVar.q();
        if (q10 != 0 || this.f14470c) {
            if (this.f14471d == 10 && q10 != 1) {
                return false;
            }
            int zza2 = ddVar.zza();
            this.f15879a.b(ddVar, zza2);
            this.f15879a.e(j3, 1, zza2, 0, null);
            return true;
        }
        int zza3 = ddVar.zza();
        byte[] bArr = new byte[zza3];
        ddVar.d(bArr, 0, zza3);
        go2 d5 = h.d(bArr);
        kq2 kq2Var = new kq2();
        kq2Var.f10542j = "audio/mp4a-latm";
        kq2Var.f10539g = d5.f8994c;
        kq2Var.f10554w = d5.f8993b;
        kq2Var.f10555x = d5.f8992a;
        kq2Var.f10544l = Collections.singletonList(bArr);
        this.f15879a.f(new t(kq2Var));
        this.f14470c = true;
        return false;
    }
}
