package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import l0.g;
import u0.a;

/* loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* renamed from: t */
    public final g f1330t;

    /* renamed from: s */
    public final Paint.FontMetricsInt f1329s = new Paint.FontMetricsInt();

    /* renamed from: u */
    public float f1331u = 1.0f;

    public i(g gVar) {
        g.e(gVar, "metadata cannot be null");
        this.f1330t = gVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f1329s);
        Paint.FontMetricsInt fontMetricsInt2 = this.f1329s;
        this.f1331u = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f1330t.c();
        this.f1330t.c();
        a e10 = this.f1330t.e();
        int a10 = e10.a(12);
        short s10 = (short) ((a10 != 0 ? e10.f18990b.getShort(a10 + e10.f18989a) : (short) 0) * this.f1331u);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f1329s;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s10;
    }
}
