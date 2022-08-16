package m4;

import n9.d;

/* loaded from: classes.dex */
public final class sg {

    /* renamed from: a */
    public final byte[] f13624a;

    /* renamed from: b */
    public final int f13625b;

    /* renamed from: c */
    public int f13626c;

    /* renamed from: d */
    public int f13627d = 0;

    public sg(byte[] bArr, int i10, int i11) {
        this.f13624a = bArr;
        this.f13626c = i10;
        this.f13625b = i11;
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r0 == 8) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(int r9) {
        /*
            r8 = this;
            int r0 = r9 >> 3
            r1 = 0
            r2 = r1
        L4:
            r3 = 255(0xff, float:3.57E-43)
            if (r1 >= r0) goto L40
            int r4 = r8.f13626c
            int r4 = r4 + 1
            boolean r4 = r8.g(r4)
            if (r4 == 0) goto L17
            int r4 = r8.f13626c
            int r4 = r4 + 2
            goto L1b
        L17:
            int r4 = r8.f13626c
            int r4 = r4 + 1
        L1b:
            int r5 = r8.f13627d
            if (r5 == 0) goto L30
            byte[] r6 = r8.f13624a
            int r7 = r8.f13626c
            r7 = r6[r7]
            r7 = r7 & r3
            int r7 = r7 << r5
            r6 = r6[r4]
            r6 = r6 & r3
            int r5 = 8 - r5
            int r5 = r6 >>> r5
            r5 = r5 | r7
            goto L36
        L30:
            byte[] r5 = r8.f13624a
            int r6 = r8.f13626c
            r5 = r5[r6]
        L36:
            int r9 = r9 + (-8)
            r3 = r3 & r5
            int r3 = r3 << r9
            r2 = r2 | r3
            r8.f13626c = r4
            int r1 = r1 + 1
            goto L4
        L40:
            if (r9 <= 0) goto L86
            int r0 = r8.f13627d
            int r0 = r0 + r9
            r1 = 8
            int r9 = 8 - r9
            int r9 = r3 >> r9
            byte r9 = (byte) r9
            int r4 = r8.f13626c
            int r4 = r4 + 1
            boolean r4 = r8.g(r4)
            if (r4 == 0) goto L5b
            int r4 = r8.f13626c
            int r4 = r4 + 2
            goto L5f
        L5b:
            int r4 = r8.f13626c
            int r4 = r4 + 1
        L5f:
            byte[] r5 = r8.f13624a
            int r6 = r8.f13626c
            if (r0 <= r1) goto L78
            r6 = r5[r6]
            r6 = r6 & r3
            int r7 = r0 + (-8)
            int r6 = r6 << r7
            r5 = r5[r4]
            r3 = r3 & r5
            int r5 = 16 - r0
            int r3 = r3 >> r5
            r3 = r3 | r6
            r9 = r9 & r3
            r9 = r9 | r2
        L74:
            r8.f13626c = r4
        L76:
            r2 = r9
            goto L83
        L78:
            r5 = r5[r6]
            r3 = r3 & r5
            int r5 = 8 - r0
            int r3 = r3 >> r5
            r9 = r9 & r3
            r9 = r9 | r2
            if (r0 != r1) goto L76
            goto L74
        L83:
            int r0 = r0 % r1
            r8.f13627d = r0
        L86:
            r8.f()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.sg.a(int):int");
    }

    public final int b() {
        int e10 = e();
        return ((e10 + 1) / 2) * (e10 % 2 == 0 ? -1 : 1);
    }

    public final void c(int i10) {
        int i11 = this.f13626c;
        int i12 = (i10 >> 3) + i11;
        this.f13626c = i12;
        int i13 = this.f13627d + (i10 & 7);
        this.f13627d = i13;
        if (i13 > 7) {
            this.f13626c = i12 + 1;
            this.f13627d = i13 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f13626c) {
                f();
                return;
            } else if (g(i11)) {
                this.f13626c++;
                i11 += 2;
            }
        }
    }

    public final boolean d() {
        return a(1) == 1;
    }

    public final int e() {
        int i10 = 0;
        int i11 = 0;
        while (!d()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = a(i11);
        }
        return i12 + i10;
    }

    public final void f() {
        int i10;
        int i11;
        int i12 = this.f13626c;
        boolean z10 = true;
        if (i12 < 0 || (i10 = this.f13627d) < 0 || i10 >= 8 || (i12 >= (i11 = this.f13625b) && (i12 != i11 || i10 != 0))) {
            z10 = false;
        }
        d.i(z10);
    }

    public final boolean g(int i10) {
        if (i10 < 2 || i10 >= this.f13625b) {
            return false;
        }
        byte[] bArr = this.f13624a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 + (-1)] == 0;
    }
}
