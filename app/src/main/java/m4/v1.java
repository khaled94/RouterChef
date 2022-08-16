package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: e */
    public static final byte[] f14549e = {0, 0, 1};

    /* renamed from: a */
    public boolean f14550a;

    /* renamed from: b */
    public int f14551b;

    /* renamed from: c */
    public int f14552c;

    /* renamed from: d */
    public byte[] f14553d = new byte[128];

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f14550a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f14553d;
        int length = bArr2.length;
        int i13 = this.f14551b + i12;
        if (length < i13) {
            this.f14553d = Arrays.copyOf(bArr2, i13 + i13);
        }
        System.arraycopy(bArr, i10, this.f14553d, this.f14551b, i12);
        this.f14551b += i12;
    }
}
