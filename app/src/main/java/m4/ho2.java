package m4;

import j0.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ho2 {

    /* renamed from: a */
    public final List<byte[]> f9397a;

    /* renamed from: b */
    public final int f9398b;

    /* renamed from: c */
    public final int f9399c;

    /* renamed from: d */
    public final int f9400d;

    /* renamed from: e */
    public final float f9401e;

    /* renamed from: f */
    public final String f9402f;

    public ho2(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f9397a = list;
        this.f9398b = i10;
        this.f9399c = i11;
        this.f9400d = i12;
        this.f9401e = f10;
        this.f9402f = str;
    }

    public static ho2 a(dd ddVar) {
        String str;
        float f10;
        int i10;
        int i11;
        try {
            ddVar.i(4);
            int q10 = (ddVar.q() & 3) + 1;
            if (q10 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int q11 = ddVar.q() & 31;
            for (int i12 = 0; i12 < q11; i12++) {
                arrayList.add(b(ddVar));
            }
            int q12 = ddVar.q();
            for (int i13 = 0; i13 < q12; i13++) {
                arrayList.add(b(ddVar));
            }
            if (q11 > 0) {
                gf1 d5 = bg1.d((byte[]) arrayList.get(0), q10 + 1, ((byte[]) arrayList.get(0)).length);
                int i14 = d5.f8846e;
                int i15 = d5.f8847f;
                float f11 = d5.f8848g;
                str = d.f(d5.f8842a, d5.f8843b, d5.f8844c);
                i11 = i14;
                i10 = i15;
                f10 = f11;
            } else {
                i11 = -1;
                i10 = -1;
                f10 = 1.0f;
                str = null;
            }
            return new ho2(arrayList, q10, i11, i10, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw mq.a("Error parsing AVC config", e10);
        }
    }

    public static byte[] b(dd ddVar) {
        int t10 = ddVar.t();
        int i10 = ddVar.f7309b;
        ddVar.i(t10);
        byte[] bArr = new byte[t10 + 4];
        System.arraycopy(d.f5388w, 0, bArr, 0, 4);
        System.arraycopy((byte[]) ddVar.f7311d, i10, bArr, 4, t10);
        return bArr;
    }
}
