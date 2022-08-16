package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class pm2 {

    /* renamed from: b */
    public int f12569b;

    /* renamed from: c */
    public int f12570c;

    /* renamed from: d */
    public int f12571d = 0;

    /* renamed from: e */
    public bm2[] f12572e = new bm2[100];

    /* renamed from: a */
    public final bm2[] f12568a = new bm2[1];

    public final synchronized int a() {
        return this.f12570c * 65536;
    }

    public final synchronized void b(bm2[] bm2VarArr) {
        int length = this.f12571d + bm2VarArr.length;
        bm2[] bm2VarArr2 = this.f12572e;
        int length2 = bm2VarArr2.length;
        if (length >= length2) {
            this.f12572e = (bm2[]) Arrays.copyOf(bm2VarArr2, Math.max(length2 + length2, length));
        }
        for (bm2 bm2Var : bm2VarArr) {
            bm2[] bm2VarArr3 = this.f12572e;
            int i10 = this.f12571d;
            this.f12571d = i10 + 1;
            bm2VarArr3[i10] = bm2Var;
        }
        this.f12570c -= bm2VarArr.length;
        notifyAll();
    }

    public final synchronized void c(int i10) {
        int i11 = this.f12569b;
        this.f12569b = i10;
        if (i10 < i11) {
            d();
        }
    }

    public final synchronized void d() {
        int i10 = this.f12569b;
        int i11 = ls1.f10971a;
        int max = Math.max(0, (((i10 + 65536) - 1) / 65536) - this.f12570c);
        int i12 = this.f12571d;
        if (max >= i12) {
            return;
        }
        Arrays.fill(this.f12572e, max, i12, (Object) null);
        this.f12571d = max;
    }
}
