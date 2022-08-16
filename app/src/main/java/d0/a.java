package d0;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final float f3674a;

    /* renamed from: b */
    public final float f3675b;

    /* renamed from: c */
    public final float f3676c;

    /* renamed from: d */
    public final float f3677d;

    /* renamed from: e */
    public final float f3678e;

    /* renamed from: f */
    public final float f3679f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f3674a = f10;
        this.f3675b = f11;
        this.f3676c = f12;
        this.f3677d = f13;
        this.f3678e = f14;
        this.f3679f = f15;
    }

    public static a a(int i10) {
        float pow;
        m mVar = m.f3719k;
        float b10 = b.b(Color.red(i10));
        float b11 = b.b(Color.green(i10));
        float b12 = b.b(Color.blue(i10));
        float[][] fArr = b.f3683v;
        float[] fArr2 = {(fArr[0][2] * b12) + (fArr[0][1] * b11) + (fArr[0][0] * b10), (fArr[1][2] * b12) + (fArr[1][1] * b11) + (fArr[1][0] * b10), (b12 * fArr[2][2]) + (b11 * fArr[2][1]) + (b10 * fArr[2][0])};
        float[][] fArr3 = b.f3680s;
        float f10 = (fArr2[2] * fArr3[0][2]) + (fArr2[1] * fArr3[0][1]) + (fArr2[0] * fArr3[0][0]);
        float f11 = (fArr2[2] * fArr3[1][2]) + (fArr2[1] * fArr3[1][1]) + (fArr2[0] * fArr3[1][0]);
        float f12 = fArr2[0] * fArr3[2][0];
        float f13 = fArr2[2] * fArr3[2][2];
        float[] fArr4 = mVar.f3726g;
        float f14 = fArr4[0] * f10;
        float f15 = fArr4[1] * f11;
        float f16 = fArr4[2] * (f13 + (fArr2[1] * fArr3[2][1]) + f12);
        float pow2 = (float) Math.pow((Math.abs(f14) * mVar.f3727h) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f15) * mVar.f3727h) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f16) * mVar.f3727h) / 100.0d, 0.42d);
        float signum = ((Math.signum(f14) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d5 = signum3;
        float f17 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d5)) / 11.0f;
        float f18 = ((float) ((signum + signum2) - (d5 * 2.0d))) / 9.0f;
        float f19 = signum2 * 20.0f;
        float f20 = ((21.0f * signum3) + ((signum * 20.0f) + f19)) / 20.0f;
        float f21 = (((signum * 40.0f) + f19) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f18, f17)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f22 = atan2;
        float f23 = (3.1415927f * f22) / 180.0f;
        float pow5 = ((float) Math.pow((f21 * mVar.f3721b) / mVar.f3720a, mVar.f3723d * mVar.f3729j)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f3725f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f22) < 20.14d ? 360.0f + f22 : f22) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f3724e) * mVar.f3722c) * ((float) Math.sqrt((f18 * f18) + (f17 * f17)))) / (f20 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * mVar.f3723d) / (mVar.f3720a + 4.0f));
        float f24 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((mVar.f3728i * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f23;
        return new a(f22, pow6, pow5, f24, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static a b(float f10, float f11, float f12) {
        m mVar;
        double d5;
        float f13 = m.f3719k.f3723d;
        Math.sqrt(f10 / 100.0d);
        Math.sqrt(((f11 / ((float) Math.sqrt(d5))) * mVar.f3723d) / (mVar.f3720a + 4.0f));
        float f14 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((mVar.f3728i * f11 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f14, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public final int c(m mVar) {
        float f10;
        float f11 = this.f3675b;
        if (f11 != 0.0d) {
            double d5 = this.f3676c;
            if (d5 != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d5 / 100.0d));
                float pow = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, mVar.f3725f), 0.73d), 1.1111111111111112d);
                double d10 = (this.f3674a * 3.1415927f) / 180.0f;
                float pow2 = mVar.f3720a * ((float) Math.pow(this.f3676c / 100.0d, (1.0d / mVar.f3723d) / mVar.f3729j));
                float cos = ((float) (Math.cos(2.0d + d10) + 3.8d)) * 0.25f * 3846.1538f * mVar.f3724e * mVar.f3722c;
                float f12 = pow2 / mVar.f3721b;
                float sin = (float) Math.sin(d10);
                float cos2 = (float) Math.cos(d10);
                float f13 = (((0.305f + f12) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f14 = cos2 * f13;
                float f15 = f13 * sin;
                float f16 = f12 * 460.0f;
                float f17 = ((288.0f * f15) + ((451.0f * f14) + f16)) / 1403.0f;
                float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
                float f19 = ((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f;
                float signum = (100.0f / mVar.f3727h) * Math.signum(f17) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17))), 2.380952380952381d));
                float signum2 = (100.0f / mVar.f3727h) * Math.signum(f18) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
                float signum3 = Math.signum(f19);
                float[] fArr = mVar.f3726g;
                float f20 = signum / fArr[0];
                float f21 = signum2 / fArr[1];
                float pow3 = (((100.0f / mVar.f3727h) * signum3) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = b.f3681t;
                float f22 = (fArr2[0][2] * pow3) + (fArr2[0][1] * f21) + (fArr2[0][0] * f20);
                float f23 = (fArr2[1][2] * pow3) + (fArr2[1][1] * f21) + (fArr2[1][0] * f20);
                float f24 = f20 * fArr2[2][0];
                return e0.a.a(f22, f23, (pow3 * fArr2[2][2]) + (f21 * fArr2[2][1]) + f24);
            }
        }
        f10 = 0.0f;
        float pow4 = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, mVar.f3725f), 0.73d), 1.1111111111111112d);
        double d102 = (this.f3674a * 3.1415927f) / 180.0f;
        float pow22 = mVar.f3720a * ((float) Math.pow(this.f3676c / 100.0d, (1.0d / mVar.f3723d) / mVar.f3729j));
        float cos3 = ((float) (Math.cos(2.0d + d102) + 3.8d)) * 0.25f * 3846.1538f * mVar.f3724e * mVar.f3722c;
        float f122 = pow22 / mVar.f3721b;
        float sin2 = (float) Math.sin(d102);
        float cos22 = (float) Math.cos(d102);
        float f132 = (((0.305f + f122) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (cos3 * 23.0f)));
        float f142 = cos22 * f132;
        float f152 = f132 * sin2;
        float f162 = f122 * 460.0f;
        float f172 = ((288.0f * f152) + ((451.0f * f142) + f162)) / 1403.0f;
        float f182 = ((f162 - (891.0f * f142)) - (261.0f * f152)) / 1403.0f;
        float f192 = ((f162 - (f142 * 220.0f)) - (f152 * 6300.0f)) / 1403.0f;
        float signum4 = (100.0f / mVar.f3727h) * Math.signum(f172) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f172) * 27.13d) / (400.0d - Math.abs(f172))), 2.380952380952381d));
        float signum22 = (100.0f / mVar.f3727h) * Math.signum(f182) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182))), 2.380952380952381d));
        float signum32 = Math.signum(f192);
        float[] fArr3 = mVar.f3726g;
        float f202 = signum4 / fArr3[0];
        float f212 = signum22 / fArr3[1];
        float pow32 = (((100.0f / mVar.f3727h) * signum32) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d))) / fArr3[2];
        float[][] fArr22 = b.f3681t;
        float f222 = (fArr22[0][2] * pow32) + (fArr22[0][1] * f212) + (fArr22[0][0] * f202);
        float f232 = (fArr22[1][2] * pow32) + (fArr22[1][1] * f212) + (fArr22[1][0] * f202);
        float f242 = f202 * fArr22[2][0];
        return e0.a.a(f222, f232, (pow32 * fArr22[2][2]) + (f212 * fArr22[2][1]) + f242);
    }
}
