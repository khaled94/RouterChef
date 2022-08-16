package m4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* loaded from: classes.dex */
public final class ww0 implements cu1<b4, Bitmap> {

    /* renamed from: a */
    public final /* synthetic */ double f15124a;

    /* renamed from: b */
    public final /* synthetic */ boolean f15125b;

    /* renamed from: c */
    public final /* synthetic */ xw0 f15126c;

    public ww0(xw0 xw0Var, double d5, boolean z10) {
        this.f15126c = xw0Var;
        this.f15124a = d5;
        this.f15125b = z10;
    }

    @Override // m4.cu1
    public final Bitmap a(b4 b4Var) {
        xw0 xw0Var = this.f15126c;
        byte[] bArr = b4Var.f6356b;
        double d5 = this.f15124a;
        boolean z10 = this.f15125b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d5 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        yr<Boolean> yrVar = es.W3;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            options.inJustDecodeBounds = true;
            xw0Var.a(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) joVar.f10148c.a(es.X3)).intValue())) / 2);
            }
        }
        return xw0Var.a(bArr, options);
    }
}
