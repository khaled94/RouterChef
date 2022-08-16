package m4;

import e1.h;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ch {

    /* renamed from: a */
    public final List<byte[]> f6930a;

    /* renamed from: b */
    public final int f6931b;

    public ch(List<byte[]> list, int i10) {
        this.f6930a = list;
        this.f6931b = i10;
    }

    public static ch a(rg rgVar) {
        try {
            rgVar.o(21);
            int c10 = rgVar.c() & 3;
            int c11 = rgVar.c();
            int i10 = rgVar.f13268b;
            int i11 = 0;
            for (int i12 = 0; i12 < c11; i12++) {
                rgVar.o(1);
                int e10 = rgVar.e();
                for (int i13 = 0; i13 < e10; i13++) {
                    int e11 = rgVar.e();
                    i11 += e11 + 4;
                    rgVar.o(e11);
                }
            }
            rgVar.n(i10);
            byte[] bArr = new byte[i11];
            int i14 = 0;
            for (int i15 = 0; i15 < c11; i15++) {
                rgVar.o(1);
                int e12 = rgVar.e();
                for (int i16 = 0; i16 < e12; i16++) {
                    int e13 = rgVar.e();
                    System.arraycopy(h.f4357s, 0, bArr, i14, 4);
                    int i17 = i14 + 4;
                    System.arraycopy(rgVar.f13267a, rgVar.f13268b, bArr, i17, e13);
                    i14 = i17 + e13;
                    rgVar.o(e13);
                }
            }
            return new ch(i11 == 0 ? null : Collections.singletonList(bArr), c10 + 1);
        } catch (ArrayIndexOutOfBoundsException e14) {
            throw new wa("Error parsing HEVC config", e14);
        }
    }
}
