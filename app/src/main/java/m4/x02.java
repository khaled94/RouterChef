package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class x02<P> {

    /* renamed from: a */
    public final P f15166a;

    /* renamed from: b */
    public final byte[] f15167b;

    /* renamed from: c */
    public final int f15168c;

    /* renamed from: d */
    public final int f15169d;

    /* JADX WARN: Multi-variable type inference failed */
    public x02(Object obj, byte[] bArr, int i10, int i11) {
        this.f15166a = obj;
        this.f15167b = Arrays.copyOf(bArr, bArr.length);
        this.f15168c = i10;
        this.f15169d = i11;
    }

    public final byte[] a() {
        byte[] bArr = this.f15167b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
