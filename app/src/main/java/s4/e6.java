package s4;

import androidx.activity.k;
import l0.d;

/* loaded from: classes.dex */
public final class e6 extends f6 {

    /* renamed from: v */
    public final int f17849v;

    public e6(byte[] bArr, int i10) {
        super(bArr);
        g6.o(0, i10, bArr.length);
        this.f17849v = i10;
    }

    @Override // s4.f6, s4.g6
    public final byte d(int i10) {
        int i11 = this.f17849v;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(k.a(22, "Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(d.a(40, "Index > length: ", i10, ", ", i11));
        }
        return this.f17863u[i10];
    }

    @Override // s4.f6, s4.g6
    public final byte e(int i10) {
        return this.f17863u[i10];
    }

    @Override // s4.f6, s4.g6
    public final int g() {
        return this.f17849v;
    }

    @Override // s4.f6
    public final void q() {
    }
}
