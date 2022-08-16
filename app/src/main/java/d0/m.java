package d0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: k */
    public static final m f3719k;

    /* renamed from: a */
    public final float f3720a;

    /* renamed from: b */
    public final float f3721b;

    /* renamed from: c */
    public final float f3722c;

    /* renamed from: d */
    public final float f3723d;

    /* renamed from: e */
    public final float f3724e;

    /* renamed from: f */
    public final float f3725f;

    /* renamed from: g */
    public final float[] f3726g;

    /* renamed from: h */
    public final float f3727h;

    /* renamed from: i */
    public final float f3728i;

    /* renamed from: j */
    public final float f3729j;

    static {
        float[] fArr = b.f3682u;
        float c10 = (float) ((b.c() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f3680s;
        float f10 = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f11 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f12 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f13 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-c10) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d5 = exp;
        if (d5 > 1.0d) {
            exp = 1.0f;
        } else if (d5 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp, (((100.0f / f12) * exp) + 1.0f) - exp};
        float f14 = 1.0f / ((5.0f * c10) + 1.0f);
        float f15 = f14 * f14 * f14 * f14;
        float f16 = 1.0f - f15;
        float cbrt = (0.1f * f16 * f16 * ((float) Math.cbrt(c10 * 5.0d))) + (f15 * c10);
        float c11 = b.c() / fArr[1];
        double d10 = c11;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f11) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f12) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        f3719k = new m(c11, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * pow, pow, pow, f13, 1.0f, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public m(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f3725f = f10;
        this.f3720a = f11;
        this.f3721b = f12;
        this.f3722c = f13;
        this.f3723d = f14;
        this.f3724e = f15;
        this.f3726g = fArr;
        this.f3727h = f16;
        this.f3728i = f17;
        this.f3729j = f18;
    }
}
