package s4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements n {

    /* renamed from: s */
    public final Double f17869s;

    public g(Double d5) {
        if (d5 == null) {
            this.f17869s = Double.valueOf(Double.NaN);
        } else {
            this.f17869s = d5;
        }
    }

    @Override // s4.n
    public final Boolean e() {
        boolean z10 = false;
        if (!Double.isNaN(this.f17869s.doubleValue()) && this.f17869s.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f17869s.equals(((g) obj).f17869s);
        }
        return false;
    }

    @Override // s4.n
    public final Double f() {
        return this.f17869s;
    }

    @Override // s4.n
    public final n g() {
        return new g(this.f17869s);
    }

    @Override // s4.n
    public final String h() {
        if (Double.isNaN(this.f17869s.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f17869s.doubleValue())) {
            return this.f17869s.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f17869s.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
    }

    public final int hashCode() {
        return this.f17869s.hashCode();
    }

    @Override // s4.n
    public final n i(String str, a4 a4Var, List<n> list) {
        if ("toString".equals(str)) {
            return new r(h());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", h(), str));
    }

    @Override // s4.n
    public final Iterator<n> l() {
        return null;
    }

    public final String toString() {
        return h();
    }
}
