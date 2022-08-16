package n3;

import d4.l;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a */
    public final String f16471a;

    /* renamed from: b */
    public final double f16472b;

    /* renamed from: c */
    public final double f16473c;

    /* renamed from: d */
    public final double f16474d;

    /* renamed from: e */
    public final int f16475e;

    public g0(String str, double d5, double d10, double d11, int i10) {
        this.f16471a = str;
        this.f16473c = d5;
        this.f16472b = d10;
        this.f16474d = d11;
        this.f16475e = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return l.a(this.f16471a, g0Var.f16471a) && this.f16472b == g0Var.f16472b && this.f16473c == g0Var.f16473c && this.f16475e == g0Var.f16475e && Double.compare(this.f16474d, g0Var.f16474d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16471a, Double.valueOf(this.f16472b), Double.valueOf(this.f16473c), Double.valueOf(this.f16474d), Integer.valueOf(this.f16475e)});
    }

    public final String toString() {
        l.a aVar = new l.a(this);
        aVar.a("name", this.f16471a);
        aVar.a("minBound", Double.valueOf(this.f16473c));
        aVar.a("maxBound", Double.valueOf(this.f16472b));
        aVar.a("percent", Double.valueOf(this.f16474d));
        aVar.a("count", Integer.valueOf(this.f16475e));
        return aVar.toString();
    }
}
