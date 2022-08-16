package m4;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class mj2 implements kq0 {

    /* renamed from: a */
    public final kq0 f11221a;

    /* renamed from: b */
    public final int f11222b;

    /* renamed from: c */
    public final lk2 f11223c;

    /* renamed from: d */
    public final byte[] f11224d;

    /* renamed from: e */
    public int f11225e;

    public mj2(kq0 kq0Var, int i10, lk2 lk2Var) {
        r01.f(i10 > 0);
        this.f11221a = kq0Var;
        this.f11222b = i10;
        this.f11223c = lk2Var;
        this.f11224d = new byte[1];
        this.f11225e = i10;
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        long j3;
        int i12 = this.f11225e;
        if (i12 == 0) {
            int i13 = 0;
            if (this.f11221a.d(this.f11224d, 0, 1) != -1) {
                int i14 = (this.f11224d[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr2 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int d5 = this.f11221a.d(bArr2, i13, i15);
                        if (d5 != -1) {
                            i13 += d5;
                            i15 -= d5;
                        }
                    }
                    while (i14 > 0) {
                        int i16 = i14 - 1;
                        if (bArr2[i16] != 0) {
                            break;
                        }
                        i14 = i16;
                    }
                    if (i14 > 0) {
                        lk2 lk2Var = this.f11223c;
                        dd ddVar = new dd(bArr2, i14);
                        if (!lk2Var.f10904n) {
                            j3 = lk2Var.f10900j;
                        } else {
                            pk2 pk2Var = lk2Var.f10905o;
                            Map<String, String> map = pk2.f12543c0;
                            j3 = Math.max(pk2Var.t(), lk2Var.f10900j);
                        }
                        int zza = ddVar.zza();
                        mp2 mp2Var = lk2Var.f10903m;
                        Objects.requireNonNull(mp2Var);
                        mp2Var.d(ddVar, zza);
                        mp2Var.e(j3, 1, zza, 0, null);
                        lk2Var.f10904n = true;
                    }
                }
                i12 = this.f11222b;
                this.f11225e = i12;
            }
            return -1;
        }
        int d10 = this.f11221a.d(bArr, i10, Math.min(i12, i11));
        if (d10 != -1) {
            this.f11225e -= d10;
        }
        return d10;
    }

    @Override // m4.kq0
    public final void f(i01 i01Var) {
        Objects.requireNonNull(i01Var);
        this.f11221a.f(i01Var);
    }

    @Override // m4.kq0
    public final Uri h() {
        return this.f11221a.h();
    }

    @Override // m4.kq0
    public final void i() {
        throw new UnsupportedOperationException();
    }

    @Override // m4.kq0
    public final long k(gs0 gs0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // m4.kq0, m4.vy0
    public final Map<String, List<String>> zza() {
        return this.f11221a.zza();
    }
}
