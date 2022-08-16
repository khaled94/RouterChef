package s;

import java.util.Arrays;
import s.c;

/* loaded from: classes.dex */
public final class a implements c.a {

    /* renamed from: b */
    public final c f17540b;

    /* renamed from: c */
    public final d f17541c;

    /* renamed from: a */
    public int f17539a = 0;

    /* renamed from: d */
    public int f17542d = 8;

    /* renamed from: e */
    public int[] f17543e = new int[8];

    /* renamed from: f */
    public int[] f17544f = new int[8];

    /* renamed from: g */
    public float[] f17545g = new float[8];

    /* renamed from: h */
    public int f17546h = -1;

    /* renamed from: i */
    public int f17547i = -1;

    /* renamed from: j */
    public boolean f17548j = false;

    public a(c cVar, d dVar) {
        this.f17540b = cVar;
        this.f17541c = dVar;
    }

    @Override // s.c.a
    public final float a(int i10) {
        int i11 = this.f17546h;
        for (int i12 = 0; i11 != -1 && i12 < this.f17539a; i12++) {
            if (i12 == i10) {
                return this.f17545g[i11];
            }
            i11 = this.f17544f[i11];
        }
        return 0.0f;
    }

    @Override // s.c.a
    public final void b(i iVar, float f10) {
        if (f10 == 0.0f) {
            e(iVar, true);
            return;
        }
        int i10 = this.f17546h;
        if (i10 == -1) {
            this.f17546h = 0;
            this.f17545g[0] = f10;
            this.f17543e[0] = iVar.f17585t;
            this.f17544f[0] = -1;
            iVar.D++;
            iVar.b(this.f17540b);
            this.f17539a++;
            if (this.f17548j) {
                return;
            }
            int i11 = this.f17547i + 1;
            this.f17547i = i11;
            int[] iArr = this.f17543e;
            if (i11 < iArr.length) {
                return;
            }
            this.f17548j = true;
            this.f17547i = iArr.length - 1;
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f17539a; i13++) {
            int[] iArr2 = this.f17543e;
            int i14 = iArr2[i10];
            int i15 = iVar.f17585t;
            if (i14 == i15) {
                this.f17545g[i10] = f10;
                return;
            }
            if (iArr2[i10] < i15) {
                i12 = i10;
            }
            i10 = this.f17544f[i10];
        }
        int i16 = this.f17547i;
        int i17 = i16 + 1;
        if (this.f17548j) {
            int[] iArr3 = this.f17543e;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f17543e;
        if (i16 >= iArr4.length && this.f17539a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f17543e;
                if (i18 >= iArr5.length) {
                    break;
                } else if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr6 = this.f17543e;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f17542d * 2;
            this.f17542d = i19;
            this.f17548j = false;
            this.f17547i = i16 - 1;
            this.f17545g = Arrays.copyOf(this.f17545g, i19);
            this.f17543e = Arrays.copyOf(this.f17543e, this.f17542d);
            this.f17544f = Arrays.copyOf(this.f17544f, this.f17542d);
        }
        this.f17543e[i16] = iVar.f17585t;
        this.f17545g[i16] = f10;
        int[] iArr7 = this.f17544f;
        if (i12 != -1) {
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            iArr7[i16] = this.f17546h;
            this.f17546h = i16;
        }
        iVar.D++;
        iVar.b(this.f17540b);
        int i20 = this.f17539a + 1;
        this.f17539a = i20;
        if (!this.f17548j) {
            this.f17547i++;
        }
        int[] iArr8 = this.f17543e;
        if (i20 >= iArr8.length) {
            this.f17548j = true;
        }
        if (this.f17547i < iArr8.length) {
            return;
        }
        this.f17548j = true;
        this.f17547i = iArr8.length - 1;
    }

    @Override // s.c.a
    public final int c() {
        return this.f17539a;
    }

    @Override // s.c.a
    public final void clear() {
        int i10 = this.f17546h;
        for (int i11 = 0; i10 != -1 && i11 < this.f17539a; i11++) {
            i iVar = ((i[]) this.f17541c.f17558d)[this.f17543e[i10]];
            if (iVar != null) {
                iVar.d(this.f17540b);
            }
            i10 = this.f17544f[i10];
        }
        this.f17546h = -1;
        this.f17547i = -1;
        this.f17548j = false;
        this.f17539a = 0;
    }

    @Override // s.c.a
    public final float d(c cVar, boolean z10) {
        float g10 = g(cVar.f17550a);
        e(cVar.f17550a, z10);
        c.a aVar = cVar.f17553d;
        int c10 = aVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            i f10 = aVar.f(i10);
            j(f10, aVar.g(f10) * g10, z10);
        }
        return g10;
    }

    @Override // s.c.a
    public final float e(i iVar, boolean z10) {
        int i10 = this.f17546h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f17539a) {
            if (this.f17543e[i10] == iVar.f17585t) {
                if (i10 == this.f17546h) {
                    this.f17546h = this.f17544f[i10];
                } else {
                    int[] iArr = this.f17544f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.d(this.f17540b);
                }
                iVar.D--;
                this.f17539a--;
                this.f17543e[i10] = -1;
                if (this.f17548j) {
                    this.f17547i = i10;
                }
                return this.f17545g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f17544f[i10];
        }
        return 0.0f;
    }

    @Override // s.c.a
    public final i f(int i10) {
        int i11 = this.f17546h;
        for (int i12 = 0; i11 != -1 && i12 < this.f17539a; i12++) {
            if (i12 == i10) {
                return ((i[]) this.f17541c.f17558d)[this.f17543e[i11]];
            }
            i11 = this.f17544f[i11];
        }
        return null;
    }

    @Override // s.c.a
    public final float g(i iVar) {
        int i10 = this.f17546h;
        for (int i11 = 0; i10 != -1 && i11 < this.f17539a; i11++) {
            if (this.f17543e[i10] == iVar.f17585t) {
                return this.f17545g[i10];
            }
            i10 = this.f17544f[i10];
        }
        return 0.0f;
    }

    @Override // s.c.a
    public final boolean h(i iVar) {
        int i10 = this.f17546h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f17539a; i11++) {
            if (this.f17543e[i10] == iVar.f17585t) {
                return true;
            }
            i10 = this.f17544f[i10];
        }
        return false;
    }

    @Override // s.c.a
    public final void i(float f10) {
        int i10 = this.f17546h;
        for (int i11 = 0; i10 != -1 && i11 < this.f17539a; i11++) {
            float[] fArr = this.f17545g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f17544f[i10];
        }
    }

    @Override // s.c.a
    public final void j(i iVar, float f10, boolean z10) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f17546h;
            if (i10 == -1) {
                this.f17546h = 0;
                this.f17545g[0] = f10;
                this.f17543e[0] = iVar.f17585t;
                this.f17544f[0] = -1;
                iVar.D++;
                iVar.b(this.f17540b);
                this.f17539a++;
                if (this.f17548j) {
                    return;
                }
                int i11 = this.f17547i + 1;
                this.f17547i = i11;
                int[] iArr = this.f17543e;
                if (i11 < iArr.length) {
                    return;
                }
                this.f17548j = true;
                this.f17547i = iArr.length - 1;
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f17539a; i13++) {
                int[] iArr2 = this.f17543e;
                int i14 = iArr2[i10];
                int i15 = iVar.f17585t;
                if (i14 == i15) {
                    float[] fArr = this.f17545g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 != 0.0f) {
                        return;
                    }
                    if (i10 == this.f17546h) {
                        this.f17546h = this.f17544f[i10];
                    } else {
                        int[] iArr3 = this.f17544f;
                        iArr3[i12] = iArr3[i10];
                    }
                    if (z10) {
                        iVar.d(this.f17540b);
                    }
                    if (this.f17548j) {
                        this.f17547i = i10;
                    }
                    iVar.D--;
                    this.f17539a--;
                    return;
                }
                if (iArr2[i10] < i15) {
                    i12 = i10;
                }
                i10 = this.f17544f[i10];
            }
            int i16 = this.f17547i;
            int i17 = i16 + 1;
            if (this.f17548j) {
                int[] iArr4 = this.f17543e;
                if (iArr4[i16] != -1) {
                    i16 = iArr4.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr5 = this.f17543e;
            if (i16 >= iArr5.length && this.f17539a < iArr5.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr6 = this.f17543e;
                    if (i18 >= iArr6.length) {
                        break;
                    } else if (iArr6[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr7 = this.f17543e;
            if (i16 >= iArr7.length) {
                i16 = iArr7.length;
                int i19 = this.f17542d * 2;
                this.f17542d = i19;
                this.f17548j = false;
                this.f17547i = i16 - 1;
                this.f17545g = Arrays.copyOf(this.f17545g, i19);
                this.f17543e = Arrays.copyOf(this.f17543e, this.f17542d);
                this.f17544f = Arrays.copyOf(this.f17544f, this.f17542d);
            }
            this.f17543e[i16] = iVar.f17585t;
            this.f17545g[i16] = f10;
            int[] iArr8 = this.f17544f;
            if (i12 != -1) {
                iArr8[i16] = iArr8[i12];
                iArr8[i12] = i16;
            } else {
                iArr8[i16] = this.f17546h;
                this.f17546h = i16;
            }
            iVar.D++;
            iVar.b(this.f17540b);
            this.f17539a++;
            if (!this.f17548j) {
                this.f17547i++;
            }
            int i20 = this.f17547i;
            int[] iArr9 = this.f17543e;
            if (i20 < iArr9.length) {
                return;
            }
            this.f17548j = true;
            this.f17547i = iArr9.length - 1;
        }
    }

    @Override // s.c.a
    public final void k() {
        int i10 = this.f17546h;
        for (int i11 = 0; i10 != -1 && i11 < this.f17539a; i11++) {
            float[] fArr = this.f17545g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f17544f[i10];
        }
    }

    public final String toString() {
        int i10 = this.f17546h;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f17539a; i11++) {
            StringBuilder c10 = androidx.activity.result.a.c(d7.a.c(str, " -> "));
            c10.append(this.f17545g[i10]);
            c10.append(" : ");
            StringBuilder c11 = androidx.activity.result.a.c(c10.toString());
            c11.append(((i[]) this.f17541c.f17558d)[this.f17543e[i10]]);
            str = c11.toString();
            i10 = this.f17544f[i10];
        }
        return str;
    }
}
