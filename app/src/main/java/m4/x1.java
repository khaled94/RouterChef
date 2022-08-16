package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: f */
    public static final byte[] f15170f = {0, 0, 1};

    /* renamed from: a */
    public boolean f15171a;

    /* renamed from: b */
    public int f15172b;

    /* renamed from: c */
    public int f15173c;

    /* renamed from: d */
    public int f15174d;

    /* renamed from: e */
    public byte[] f15175e = new byte[128];

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f15171a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f15175e;
        int length = bArr2.length;
        int i13 = this.f15173c + i12;
        if (length < i13) {
            this.f15175e = Arrays.copyOf(bArr2, i13 + i13);
        }
        System.arraycopy(bArr, i10, this.f15175e, this.f15173c, i12);
        this.f15173c += i12;
    }

    public final void b() {
        this.f15171a = false;
        this.f15173c = 0;
        this.f15172b = 0;
    }
}
