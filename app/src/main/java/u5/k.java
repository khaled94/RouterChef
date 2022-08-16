package u5;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public CharSequence f19121a;

    /* renamed from: b */
    public final TextPaint f19122b;

    /* renamed from: c */
    public final int f19123c;

    /* renamed from: d */
    public int f19124d;

    /* renamed from: k */
    public boolean f19131k;

    /* renamed from: e */
    public Layout.Alignment f19125e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f19126f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f19127g = 0.0f;

    /* renamed from: h */
    public float f19128h = 1.0f;

    /* renamed from: i */
    public int f19129i = 1;

    /* renamed from: j */
    public boolean f19130j = true;

    /* renamed from: l */
    public TextUtils.TruncateAt f19132l = null;

    /* loaded from: classes.dex */
    public static class a extends Exception {
    }

    public k(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f19121a = charSequence;
        this.f19122b = textPaint;
        this.f19123c = i10;
        this.f19124d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f19121a == null) {
            this.f19121a = "";
        }
        int max = Math.max(0, this.f19123c);
        CharSequence charSequence = this.f19121a;
        if (this.f19126f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f19122b, max, this.f19132l);
        }
        int min = Math.min(charSequence.length(), this.f19124d);
        this.f19124d = min;
        if (this.f19131k && this.f19126f == 1) {
            this.f19125e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f19122b, max);
        obtain.setAlignment(this.f19125e);
        obtain.setIncludePad(this.f19130j);
        obtain.setTextDirection(this.f19131k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f19132l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f19126f);
        float f10 = this.f19127g;
        if (f10 != 0.0f || this.f19128h != 1.0f) {
            obtain.setLineSpacing(f10, this.f19128h);
        }
        if (this.f19126f > 1) {
            obtain.setHyphenationFrequency(this.f19129i);
        }
        return obtain.build();
    }
}
