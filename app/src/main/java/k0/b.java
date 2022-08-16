package k0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b implements Spannable {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final TextPaint f5554a;

        /* renamed from: b */
        public final TextDirectionHeuristic f5555b;

        /* renamed from: c */
        public final int f5556c;

        /* renamed from: d */
        public final int f5557d;

        public a(PrecomputedText.Params params) {
            this.f5554a = params.getTextPaint();
            this.f5555b = params.getTextDirection();
            this.f5556c = params.getBreakStrategy();
            this.f5557d = params.getHyphenationFrequency();
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            }
            this.f5554a = textPaint;
            this.f5555b = textDirectionHeuristic;
            this.f5556c = i10;
            this.f5557d = i11;
        }

        public final boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (this.f5556c == aVar.f5556c && this.f5557d == aVar.f5557d && this.f5554a.getTextSize() == aVar.f5554a.getTextSize() && this.f5554a.getTextScaleX() == aVar.f5554a.getTextScaleX() && this.f5554a.getTextSkewX() == aVar.f5554a.getTextSkewX() && this.f5554a.getLetterSpacing() == aVar.f5554a.getLetterSpacing() && TextUtils.equals(this.f5554a.getFontFeatureSettings(), aVar.f5554a.getFontFeatureSettings()) && this.f5554a.getFlags() == aVar.f5554a.getFlags()) {
                if (i10 >= 24) {
                    if (!this.f5554a.getTextLocales().equals(aVar.f5554a.getTextLocales())) {
                        return false;
                    }
                } else if (!this.f5554a.getTextLocale().equals(aVar.f5554a.getTextLocale())) {
                    return false;
                }
                return this.f5554a.getTypeface() == null ? aVar.f5554a.getTypeface() == null : this.f5554a.getTypeface().equals(aVar.f5554a.getTypeface());
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f5555b == aVar.f5555b;
        }

        public final int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return l0.b.b(Float.valueOf(this.f5554a.getTextSize()), Float.valueOf(this.f5554a.getTextScaleX()), Float.valueOf(this.f5554a.getTextSkewX()), Float.valueOf(this.f5554a.getLetterSpacing()), Integer.valueOf(this.f5554a.getFlags()), this.f5554a.getTextLocales(), this.f5554a.getTypeface(), Boolean.valueOf(this.f5554a.isElegantTextHeight()), this.f5555b, Integer.valueOf(this.f5556c), Integer.valueOf(this.f5557d));
            }
            return l0.b.b(Float.valueOf(this.f5554a.getTextSize()), Float.valueOf(this.f5554a.getTextScaleX()), Float.valueOf(this.f5554a.getTextSkewX()), Float.valueOf(this.f5554a.getLetterSpacing()), Integer.valueOf(this.f5554a.getFlags()), this.f5554a.getTextLocale(), this.f5554a.getTypeface(), Boolean.valueOf(this.f5554a.isElegantTextHeight()), this.f5555b, Integer.valueOf(this.f5556c), Integer.valueOf(this.f5557d));
        }

        public final String toString() {
            Object obj;
            StringBuilder sb;
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder c10 = androidx.activity.result.a.c("textSize=");
            c10.append(this.f5554a.getTextSize());
            sb2.append(c10.toString());
            sb2.append(", textScaleX=" + this.f5554a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f5554a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            StringBuilder c11 = androidx.activity.result.a.c(", letterSpacing=");
            c11.append(this.f5554a.getLetterSpacing());
            sb2.append(c11.toString());
            sb2.append(", elegantTextHeight=" + this.f5554a.isElegantTextHeight());
            if (i10 >= 24) {
                sb = androidx.activity.result.a.c(", textLocale=");
                obj = this.f5554a.getTextLocales();
            } else {
                sb = androidx.activity.result.a.c(", textLocale=");
                obj = this.f5554a.getTextLocale();
            }
            sb.append(obj);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.f5554a.getTypeface());
            if (i10 >= 26) {
                StringBuilder c12 = androidx.activity.result.a.c(", variationSettings=");
                c12.append(this.f5554a.getFontVariationSettings());
                sb2.append(c12.toString());
            }
            StringBuilder c13 = androidx.activity.result.a.c(", textDir=");
            c13.append(this.f5555b);
            sb2.append(c13.toString());
            sb2.append(", breakStrategy=" + this.f5556c);
            sb2.append(", hyphenationFrequency=" + this.f5557d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i10 = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (!(obj instanceof MetricAffectingSpan)) {
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }
}
