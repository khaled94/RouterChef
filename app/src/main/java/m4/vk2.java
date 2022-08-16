package m4;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vk2 {

    /* renamed from: a */
    public final dd f14711a = new dd(32);

    /* renamed from: b */
    public uk2 f14712b;

    /* renamed from: c */
    public uk2 f14713c;

    /* renamed from: d */
    public uk2 f14714d;

    /* renamed from: e */
    public long f14715e;

    /* renamed from: f */
    public final pm2 f14716f;

    public vk2(pm2 pm2Var) {
        this.f14716f = pm2Var;
        uk2 uk2Var = new uk2(0L);
        this.f14712b = uk2Var;
        this.f14713c = uk2Var;
        this.f14714d = uk2Var;
    }

    public static uk2 c(uk2 uk2Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= uk2Var.f14439b) {
            uk2Var = uk2Var.f14442e;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (uk2Var.f14439b - j3));
            byteBuffer.put(uk2Var.f14441d.f6573a, uk2Var.a(j3), min);
            i10 -= min;
            j3 += min;
            if (j3 == uk2Var.f14439b) {
                uk2Var = uk2Var.f14442e;
            }
        }
        return uk2Var;
    }

    public static uk2 d(uk2 uk2Var, long j3, byte[] bArr, int i10) {
        while (j3 >= uk2Var.f14439b) {
            uk2Var = uk2Var.f14442e;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (uk2Var.f14439b - j3));
            System.arraycopy(uk2Var.f14441d.f6573a, uk2Var.a(j3), bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == uk2Var.f14439b) {
                uk2Var = uk2Var.f14442e;
            }
        }
        return uk2Var;
    }

    public static uk2 e(uk2 uk2Var, il0 il0Var, br1 br1Var, dd ddVar) {
        if (il0Var.b(1073741824)) {
            long j3 = br1Var.f6605b;
            int i10 = 1;
            ddVar.e(1);
            uk2 d5 = d(uk2Var, j3, (byte[]) ddVar.f7311d, 1);
            long j10 = j3 + 1;
            byte b10 = ((byte[]) ddVar.f7311d)[0];
            int i11 = b10 & 128;
            int i12 = b10 & Byte.MAX_VALUE;
            xi0 xi0Var = il0Var.f9685b;
            byte[] bArr = xi0Var.f15361a;
            if (bArr == null) {
                xi0Var.f15361a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            uk2 d10 = d(d5, j10, xi0Var.f15361a, i12);
            long j11 = j10 + i12;
            if (i11 != 0) {
                ddVar.e(2);
                d10 = d(d10, j11, (byte[]) ddVar.f7311d, 2);
                j11 += 2;
                i10 = ddVar.t();
            }
            int[] iArr = xi0Var.f15364d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = xi0Var.f15365e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (i11 != 0) {
                int i13 = i10 * 6;
                ddVar.e(i13);
                d10 = d(d10, j11, (byte[]) ddVar.f7311d, i13);
                j11 += i13;
                ddVar.h(0);
                for (int i14 = 0; i14 < i10; i14++) {
                    iArr[i14] = ddVar.t();
                    iArr2[i14] = ddVar.s();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = br1Var.f6604a - ((int) (j11 - br1Var.f6605b));
            }
            lp2 lp2Var = (lp2) br1Var.f6606c;
            int i15 = ls1.f10971a;
            byte[] bArr2 = lp2Var.f10963b;
            byte[] bArr3 = xi0Var.f15361a;
            int i16 = lp2Var.f10962a;
            int i17 = lp2Var.f10964c;
            int i18 = lp2Var.f10965d;
            xi0Var.f15366f = i10;
            xi0Var.f15364d = iArr;
            xi0Var.f15365e = iArr2;
            xi0Var.f15362b = bArr2;
            xi0Var.f15361a = bArr3;
            xi0Var.f15363c = i16;
            xi0Var.f15367g = i17;
            xi0Var.f15368h = i18;
            uk2Var = d10;
            MediaCodec.CryptoInfo cryptoInfo = xi0Var.f15369i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i16;
            if (i15 >= 24) {
                ci0 ci0Var = xi0Var.f15370j;
                Objects.requireNonNull(ci0Var);
                ci0.a(ci0Var, i17, i18);
            }
            long j12 = br1Var.f6605b;
            int i19 = (int) (j11 - j12);
            br1Var.f6605b = j12 + i19;
            br1Var.f6604a -= i19;
        }
        uk2 uk2Var2 = uk2Var;
        if (!il0Var.b(268435456)) {
            il0Var.d(br1Var.f6604a);
            return c(uk2Var2, br1Var.f6605b, il0Var.f9686c, br1Var.f6604a);
        }
        ddVar.e(4);
        uk2 d11 = d(uk2Var2, br1Var.f6605b, (byte[]) ddVar.f7311d, 4);
        int s10 = ddVar.s();
        br1Var.f6605b += 4;
        br1Var.f6604a -= 4;
        il0Var.d(s10);
        uk2 c10 = c(d11, br1Var.f6605b, il0Var.f9686c, s10);
        br1Var.f6605b += s10;
        int i20 = br1Var.f6604a - s10;
        br1Var.f6604a = i20;
        ByteBuffer byteBuffer = il0Var.f9689f;
        if (byteBuffer == null || byteBuffer.capacity() < i20) {
            il0Var.f9689f = ByteBuffer.allocate(i20);
        } else {
            il0Var.f9689f.clear();
        }
        return c(c10, br1Var.f6605b, il0Var.f9689f, br1Var.f6604a);
    }

    public final void a(long j3) {
        uk2 uk2Var;
        if (j3 != -1) {
            while (true) {
                uk2Var = this.f14712b;
                if (j3 < uk2Var.f14439b) {
                    break;
                }
                pm2 pm2Var = this.f14716f;
                bm2 bm2Var = uk2Var.f14441d;
                synchronized (pm2Var) {
                    bm2[] bm2VarArr = pm2Var.f12568a;
                    bm2VarArr[0] = bm2Var;
                    pm2Var.b(bm2VarArr);
                }
                uk2 uk2Var2 = this.f14712b;
                uk2Var2.f14441d = null;
                uk2 uk2Var3 = uk2Var2.f14442e;
                uk2Var2.f14442e = null;
                this.f14712b = uk2Var3;
            }
            if (this.f14713c.f14438a >= uk2Var.f14438a) {
                return;
            }
            this.f14713c = uk2Var;
        }
    }

    public final int b(int i10) {
        bm2 bm2Var;
        uk2 uk2Var = this.f14714d;
        if (!uk2Var.f14440c) {
            pm2 pm2Var = this.f14716f;
            synchronized (pm2Var) {
                pm2Var.f12570c++;
                int i11 = pm2Var.f12571d;
                if (i11 > 0) {
                    bm2[] bm2VarArr = pm2Var.f12572e;
                    int i12 = i11 - 1;
                    pm2Var.f12571d = i12;
                    bm2Var = bm2VarArr[i12];
                    Objects.requireNonNull(bm2Var);
                    bm2VarArr[i12] = null;
                } else {
                    bm2Var = new bm2(new byte[65536]);
                }
            }
            uk2 uk2Var2 = new uk2(this.f14714d.f14439b);
            uk2Var.f14441d = bm2Var;
            uk2Var.f14442e = uk2Var2;
            uk2Var.f14440c = true;
        }
        return Math.min(i10, (int) (this.f14714d.f14439b - this.f14715e));
    }
}
