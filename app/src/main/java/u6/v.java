package u6;

import androidx.activity.result.a;
import s.b;
import u6.a0;

/* loaded from: classes.dex */
public final class v extends a0.e.f {

    /* renamed from: a */
    public final String f19444a;

    public v(String str) {
        this.f19444a = str;
    }

    @Override // u6.a0.e.f
    public final String a() {
        return this.f19444a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.f)) {
            return false;
        }
        return this.f19444a.equals(((a0.e.f) obj).a());
    }

    public final int hashCode() {
        return this.f19444a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return b.b(a.c("User{identifier="), this.f19444a, "}");
    }
}
