package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a */
    public final int f9081a;

    /* renamed from: b */
    public boolean f9082b;

    /* renamed from: c */
    public boolean f9083c;

    /* renamed from: d */
    public byte[] f9084d;

    /* renamed from: e */
    public int f9085e;

    public h2(int i10) {
        this.f9081a = i10;
        byte[] bArr = new byte[131];
        this.f9084d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f9082b) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f9084d;
        int length = bArr2.length;
        int i13 = this.f9085e + i12;
        if (length < i13) {
            this.f9084d = Arrays.copyOf(bArr2, i13 + i13);
        }
        System.arraycopy(bArr, i10, this.f9084d, this.f9085e, i12);
        this.f9085e += i12;
    }

    public final void b() {
        this.f9082b = false;
        this.f9083c = false;
    }

    public final void c(int i10) {
        boolean z10 = true;
        r01.h(!this.f9082b);
        if (i10 != this.f9081a) {
            z10 = false;
        }
        this.f9082b = z10;
        if (z10) {
            this.f9085e = 3;
            this.f9083c = false;
        }
    }

    public final boolean d(int i10) {
        if (!this.f9082b) {
            return false;
        }
        this.f9085e -= i10;
        this.f9082b = false;
        this.f9083c = true;
        return true;
    }
}
