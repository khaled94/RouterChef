package n6;

import androidx.appcompat.widget.e0;
import s.b;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public final Class<?> f16648a;

    /* renamed from: b */
    public final int f16649b;

    /* renamed from: c */
    public final int f16650c;

    public n(Class<?> cls, int i10, int i11) {
        this.f16648a = cls;
        this.f16649b = i10;
        this.f16650c = i11;
    }

    public final boolean a() {
        return this.f16649b == 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f16648a == nVar.f16648a && this.f16649b == nVar.f16649b && this.f16650c == nVar.f16650c;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f16648a.hashCode() ^ 1000003) * 1000003) ^ this.f16649b) * 1000003) ^ this.f16650c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f16648a);
        sb.append(", type=");
        int i10 = this.f16649b;
        sb.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i11 = this.f16650c;
        if (i11 == 0) {
            str = "direct";
        } else if (i11 == 1) {
            str = "provider";
        } else if (i11 != 2) {
            throw new AssertionError(e0.a("Unsupported injection: ", i11));
        } else {
            str = "deferred";
        }
        return b.b(sb, str, "}");
    }
}
