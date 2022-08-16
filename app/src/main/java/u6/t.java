package u6;

import androidx.activity.result.a;
import s.b;
import u6.a0;

/* loaded from: classes.dex */
public final class t extends a0.e.d.AbstractC0139d {

    /* renamed from: a */
    public final String f19435a;

    public t(String str) {
        this.f19435a = str;
    }

    @Override // u6.a0.e.d.AbstractC0139d
    public final String a() {
        return this.f19435a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.AbstractC0139d)) {
            return false;
        }
        return this.f19435a.equals(((a0.e.d.AbstractC0139d) obj).a());
    }

    public final int hashCode() {
        return this.f19435a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return b.b(a.c("Log{content="), this.f19435a, "}");
    }
}
