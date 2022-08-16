package m4;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class v41 implements xy1 {

    /* renamed from: a */
    public final /* synthetic */ int f14585a;

    /* renamed from: b */
    public final /* synthetic */ Object f14586b;

    public /* synthetic */ v41(Object obj, int i10) {
        this.f14585a = i10;
        this.f14586b = obj;
    }

    @Override // m4.xy1
    public final tz1 h(Object obj) {
        byte[] a10;
        switch (this.f14585a) {
            case 0:
                o50 o50Var = (o50) this.f14586b;
                InputStream inputStream = (InputStream) obj;
                int i10 = ux1.f14527a;
                Objects.requireNonNull(inputStream);
                ArrayDeque arrayDeque = new ArrayDeque(20);
                int i11 = 8192;
                int i12 = 0;
                while (true) {
                    if (i12 < 2147483639) {
                        int min = Math.min(i11, 2147483639 - i12);
                        byte[] bArr = new byte[min];
                        arrayDeque.add(bArr);
                        int i13 = 0;
                        while (i13 < min) {
                            int read = inputStream.read(bArr, i13, min - i13);
                            if (read == -1) {
                                a10 = ux1.a(arrayDeque, i12);
                            } else {
                                i13 += read;
                                i12 += read;
                            }
                        }
                        long j3 = i11;
                        long j10 = j3 + j3;
                        i11 = j10 > 2147483647L ? Integer.MAX_VALUE : j10 < -2147483648L ? Integer.MIN_VALUE : (int) j10;
                    } else if (inputStream.read() != -1) {
                        throw new OutOfMemoryError("input is too large to fit in a byte array");
                    } else {
                        a10 = ux1.a(arrayDeque, 2147483639);
                    }
                }
                o50Var.B = new String(a10, bu1.f6617b);
                return mz1.m(o50Var);
            default:
                return (tz1) this.f14586b;
        }
    }
}
