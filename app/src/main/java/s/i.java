package s;

import androidx.activity.result.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i implements Comparable<i> {
    public int A;

    /* renamed from: s */
    public boolean f17584s;

    /* renamed from: w */
    public float f17588w;

    /* renamed from: t */
    public int f17585t = -1;

    /* renamed from: u */
    public int f17586u = -1;

    /* renamed from: v */
    public int f17587v = 0;

    /* renamed from: x */
    public boolean f17589x = false;
    public float[] y = new float[9];

    /* renamed from: z */
    public float[] f17590z = new float[9];
    public c[] B = new c[16];
    public int C = 0;
    public int D = 0;

    public i(int i10) {
        this.A = i10;
    }

    public final void b(c cVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.C;
            if (i10 >= i11) {
                c[] cVarArr = this.B;
                if (i11 >= cVarArr.length) {
                    this.B = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.B;
                int i12 = this.C;
                cVarArr2[i12] = cVar;
                this.C = i12 + 1;
                return;
            } else if (this.B[i10] == cVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(i iVar) {
        return this.f17585t - iVar.f17585t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 >= (r0 - 1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        r5 = r4.B;
        r2 = r1 + 1;
        r5[r1] = r5[r2];
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        r4.C--;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(s.c r5) {
        /*
            r4 = this;
            int r0 = r4.C
            r1 = 0
        L3:
            if (r1 >= r0) goto L23
            s.c[] r2 = r4.B
            r2 = r2[r1]
            if (r2 != r5) goto L20
        Lb:
            int r5 = r0 + (-1)
            if (r1 >= r5) goto L19
            s.c[] r5 = r4.B
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto Lb
        L19:
            int r5 = r4.C
            int r5 = r5 + (-1)
            r4.C = r5
            return
        L20:
            int r1 = r1 + 1
            goto L3
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.i.d(s.c):void");
    }

    public final void e() {
        this.A = 5;
        this.f17587v = 0;
        this.f17585t = -1;
        this.f17586u = -1;
        this.f17588w = 0.0f;
        this.f17589x = false;
        int i10 = this.C;
        for (int i11 = 0; i11 < i10; i11++) {
            this.B[i11] = null;
        }
        this.C = 0;
        this.D = 0;
        this.f17584s = false;
        Arrays.fill(this.f17590z, 0.0f);
    }

    public final void f(e eVar, float f10) {
        this.f17588w = f10;
        this.f17589x = true;
        int i10 = this.C;
        this.f17586u = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.B[i11].j(eVar, this, false);
        }
        this.C = 0;
    }

    public final void g(e eVar, c cVar) {
        int i10 = this.C;
        for (int i11 = 0; i11 < i10; i11++) {
            this.B[i11].k(eVar, cVar, false);
        }
        this.C = 0;
    }

    public final String toString() {
        StringBuilder c10 = a.c("");
        c10.append(this.f17585t);
        return c10.toString();
    }
}
