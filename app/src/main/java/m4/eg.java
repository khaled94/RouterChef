package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class eg {

    /* renamed from: b */
    public int f7839b;

    /* renamed from: c */
    public int f7840c;

    /* renamed from: d */
    public int f7841d = 0;

    /* renamed from: e */
    public yf[] f7842e = new yf[100];

    /* renamed from: a */
    public final yf[] f7838a = new yf[1];

    public final synchronized void a(yf yfVar) {
        yf[] yfVarArr = this.f7838a;
        yfVarArr[0] = yfVar;
        b(yfVarArr);
    }

    public final synchronized void b(yf[] yfVarArr) {
        int length = this.f7841d + yfVarArr.length;
        yf[] yfVarArr2 = this.f7842e;
        int length2 = yfVarArr2.length;
        if (length >= length2) {
            this.f7842e = (yf[]) Arrays.copyOf(yfVarArr2, Math.max(length2 + length2, length));
        }
        for (yf yfVar : yfVarArr) {
            byte[] bArr = yfVar.f15672a;
            yf[] yfVarArr3 = this.f7842e;
            int i10 = this.f7841d;
            this.f7841d = i10 + 1;
            yfVarArr3[i10] = yfVar;
        }
        this.f7840c -= yfVarArr.length;
        notifyAll();
    }

    public final synchronized void c() {
        int i10 = this.f7839b;
        int i11 = wg.f14958a;
        int max = Math.max(0, (((i10 + 65536) - 1) / 65536) - this.f7840c);
        int i12 = this.f7841d;
        if (max >= i12) {
            return;
        }
        Arrays.fill(this.f7842e, max, i12, (Object) null);
        this.f7841d = max;
    }
}
