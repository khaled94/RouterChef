package z7;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class k extends Number {

    /* renamed from: s */
    public final String f21031s;

    public k(String str) {
        this.f21031s = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f21031s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        String str = this.f21031s;
        String str2 = ((k) obj).f21031s;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f21031s);
    }

    public final int hashCode() {
        return this.f21031s.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f21031s);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f21031s);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f21031s).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f21031s);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f21031s).longValue();
        }
    }

    public final String toString() {
        return this.f21031s;
    }
}
