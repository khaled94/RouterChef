package m4;

import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m82 extends OutputStream {

    /* renamed from: x */
    public static final byte[] f11114x = new byte[0];

    /* renamed from: u */
    public int f11117u;

    /* renamed from: w */
    public int f11119w;

    /* renamed from: s */
    public final int f11115s = 128;

    /* renamed from: t */
    public final ArrayList<n82> f11116t = new ArrayList<>();

    /* renamed from: v */
    public byte[] f11118v = new byte[128];

    public final synchronized n82 b() {
        int i10 = this.f11119w;
        byte[] bArr = this.f11118v;
        int length = bArr.length;
        if (i10 >= length) {
            this.f11116t.add(new l82(bArr));
            this.f11118v = f11114x;
        } else if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, i10));
            this.f11116t.add(new l82(bArr2));
        }
        this.f11117u += this.f11119w;
        this.f11119w = 0;
        return n82.B(this.f11116t);
    }

    public final void c(int i10) {
        this.f11116t.add(new l82(this.f11118v));
        int length = this.f11117u + this.f11118v.length;
        this.f11117u = length;
        this.f11118v = new byte[Math.max(this.f11115s, Math.max(i10, length >>> 1))];
        this.f11119w = 0;
    }

    public final String toString() {
        int i10;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i10 = this.f11117u + this.f11119w;
        }
        objArr[1] = Integer.valueOf(i10);
        return String.format("<ByteString.Output@%s size=%d>", objArr);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        if (this.f11119w == this.f11118v.length) {
            c(1);
        }
        byte[] bArr = this.f11118v;
        int i11 = this.f11119w;
        this.f11119w = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f11118v;
        int length = bArr2.length;
        int i12 = this.f11119w;
        int i13 = length - i12;
        if (i11 <= i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f11119w += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i13);
        int i14 = i11 - i13;
        c(i14);
        System.arraycopy(bArr, i10 + i13, this.f11118v, 0, i14);
        this.f11119w = i14;
    }
}
