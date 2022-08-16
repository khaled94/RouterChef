package s;

import java.util.Arrays;
import java.util.Comparator;
import s.c;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: f */
    public i[] f17577f = new i[128];

    /* renamed from: g */
    public i[] f17578g = new i[128];

    /* renamed from: h */
    public int f17579h = 0;

    /* renamed from: i */
    public b f17580i = new b();

    /* loaded from: classes.dex */
    public class a implements Comparator<i> {
        @Override // java.util.Comparator
        public final int compare(i iVar, i iVar2) {
            return iVar.f17585t - iVar2.f17585t;
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        public i f17581a;

        public b() {
            g.this = r1;
        }

        public final String toString() {
            String str = "[ ";
            if (this.f17581a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    StringBuilder c10 = androidx.activity.result.a.c(str);
                    c10.append(this.f17581a.f17590z[i10]);
                    c10.append(" ");
                    str = c10.toString();
                }
            }
            StringBuilder c11 = androidx.fragment.app.a.c(str, "] ");
            c11.append(this.f17581a);
            return c11.toString();
        }
    }

    public g(d dVar) {
        super(dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        if (r9 < r8) goto L25;
     */
    @Override // s.c, s.e.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s.i a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r11.f17579h
            if (r2 >= r4) goto L57
            s.i[] r4 = r11.f17577f
            r5 = r4[r2]
            int r6 = r5.f17585t
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L54
        L13:
            s.g$b r6 = r11.f17580i
            r6.f17581a = r5
            r5 = 8
            r7 = 1
            if (r3 != r0) goto L36
        L1c:
            if (r5 < 0) goto L32
            s.i r4 = r6.f17581a
            float[] r4 = r4.f17590z
            r4 = r4[r5]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2a
            goto L32
        L2a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L2f
            goto L33
        L2f:
            int r5 = r5 + (-1)
            goto L1c
        L32:
            r7 = r1
        L33:
            if (r7 == 0) goto L54
            goto L53
        L36:
            r4 = r4[r3]
        L38:
            if (r5 < 0) goto L50
            float[] r8 = r4.f17590z
            r8 = r8[r5]
            s.i r9 = r6.f17581a
            float[] r9 = r9.f17590z
            r9 = r9[r5]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4b
            int r5 = r5 + (-1)
            goto L38
        L4b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L50
            goto L51
        L50:
            r7 = r1
        L51:
            if (r7 == 0) goto L54
        L53:
            r3 = r2
        L54:
            int r2 = r2 + 1
            goto L4
        L57:
            if (r3 != r0) goto L5b
            r12 = 0
            return r12
        L5b:
            s.i[] r12 = r11.f17577f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: s.g.a(boolean[]):s.i");
    }

    @Override // s.c
    public final boolean g() {
        return this.f17579h == 0;
    }

    @Override // s.c
    public final void k(e eVar, c cVar, boolean z10) {
        i iVar = cVar.f17550a;
        if (iVar == null) {
            return;
        }
        c.a aVar = cVar.f17553d;
        int c10 = aVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            i f10 = aVar.f(i10);
            float a10 = aVar.a(i10);
            b bVar = this.f17580i;
            bVar.f17581a = f10;
            boolean z11 = true;
            if (f10.f17584s) {
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr = bVar.f17581a.f17590z;
                    fArr[i11] = (iVar.f17590z[i11] * a10) + fArr[i11];
                    if (Math.abs(fArr[i11]) < 1.0E-4f) {
                        bVar.f17581a.f17590z[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    g.this.m(bVar.f17581a);
                }
                z11 = false;
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f11 = iVar.f17590z[i12];
                    if (f11 != 0.0f) {
                        float f12 = f11 * a10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        bVar.f17581a.f17590z[i12] = f12;
                    } else {
                        bVar.f17581a.f17590z[i12] = 0.0f;
                    }
                }
            }
            if (z11) {
                l(f10);
            }
            this.f17551b = (cVar.f17551b * a10) + this.f17551b;
        }
        m(iVar);
    }

    public final void l(i iVar) {
        int i10;
        int i11 = this.f17579h + 1;
        i[] iVarArr = this.f17577f;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f17577f = iVarArr2;
            this.f17578g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f17577f;
        int i12 = this.f17579h;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f17579h = i13;
        if (i13 > 1 && iVarArr3[i13 - 1].f17585t > iVar.f17585t) {
            int i14 = 0;
            while (true) {
                i10 = this.f17579h;
                if (i14 >= i10) {
                    break;
                }
                this.f17578g[i14] = this.f17577f[i14];
                i14++;
            }
            Arrays.sort(this.f17578g, 0, i10, new a());
            for (int i15 = 0; i15 < this.f17579h; i15++) {
                this.f17577f[i15] = this.f17578g[i15];
            }
        }
        iVar.f17584s = true;
        iVar.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r5.f17579h = r2 - 1;
        r6.f17584s = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r5.f17579h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r1 >= (r2 - 1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        r2 = r5.f17577f;
        r3 = r1 + 1;
        r2[r1] = r2[r3];
        r1 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(s.i r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.f17579h
            if (r1 >= r2) goto L26
            s.i[] r2 = r5.f17577f
            r2 = r2[r1]
            if (r2 != r6) goto L23
        Lc:
            int r2 = r5.f17579h
            int r3 = r2 + (-1)
            if (r1 >= r3) goto L1c
            s.i[] r2 = r5.f17577f
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto Lc
        L1c:
            int r2 = r2 + (-1)
            r5.f17579h = r2
            r6.f17584s = r0
            return
        L23:
            int r1 = r1 + 1
            goto L2
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.g.m(s.i):void");
    }

    @Override // s.c
    public final String toString() {
        StringBuilder c10 = androidx.fragment.app.a.c("", " goal -> (");
        c10.append(this.f17551b);
        c10.append(") : ");
        String sb = c10.toString();
        for (int i10 = 0; i10 < this.f17579h; i10++) {
            this.f17580i.f17581a = this.f17577f[i10];
            StringBuilder c11 = androidx.activity.result.a.c(sb);
            c11.append(this.f17580i);
            c11.append(" ");
            sb = c11.toString();
        }
        return sb;
    }
}
