package e0;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final ThreadLocal<double[]> f4309a = new ThreadLocal<>();

    public static int a(double d5, double d10, double d11) {
        double d12 = (((-0.4986d) * d11) + (((-1.5372d) * d10) + (3.2406d * d5))) / 100.0d;
        double d13 = ((0.0415d * d11) + ((1.8758d * d10) + ((-0.9689d) * d5))) / 100.0d;
        double d14 = ((1.057d * d11) + (((-0.204d) * d10) + (0.0557d * d5))) / 100.0d;
        return Color.rgb(d((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d)), d((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d)), d((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d)));
    }

    public static int b(int i10, int i11) {
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int i12 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i12, c(Color.red(i10), alpha2, Color.red(i11), alpha, i12), c(Color.green(i10), alpha2, Color.green(i11), alpha, i12), c(Color.blue(i10), alpha2, Color.blue(i11), alpha, i12));
    }

    public static int c(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((255 - i11) * (i12 * i13)) + ((i10 * 255) * i11)) / (i14 * 255);
    }

    public static int d(int i10) {
        if (i10 < 0) {
            return 0;
        }
        return Math.min(i10, 255);
    }

    public static int e(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
