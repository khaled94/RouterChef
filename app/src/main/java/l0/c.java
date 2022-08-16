package l0;

import androidx.activity.result.a;

/* loaded from: classes.dex */
public final class c<F, S> {

    /* renamed from: a */
    public final F f5709a;

    /* renamed from: b */
    public final S f5710b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return b.a(cVar.f5709a, this.f5709a) && b.a(cVar.f5710b, this.f5710b);
    }

    public final int hashCode() {
        F f10 = this.f5709a;
        int i10 = 0;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f5710b;
        if (s10 != null) {
            i10 = s10.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder c10 = a.c("Pair{");
        c10.append(this.f5709a);
        c10.append(" ");
        c10.append(this.f5710b);
        c10.append("}");
        return c10.toString();
    }
}
