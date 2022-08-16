package u6;

import s.b;
import u6.a0;

/* loaded from: classes.dex */
public final class e extends a0.d {

    /* renamed from: a */
    public final b0<a0.d.a> f19305a;

    /* renamed from: b */
    public final String f19306b;

    public e(b0 b0Var, String str, a aVar) {
        this.f19305a = b0Var;
        this.f19306b = str;
    }

    @Override // u6.a0.d
    public final b0<a0.d.a> a() {
        return this.f19305a;
    }

    @Override // u6.a0.d
    public final String b() {
        return this.f19306b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.d)) {
            return false;
        }
        a0.d dVar = (a0.d) obj;
        if (this.f19305a.equals(dVar.a())) {
            String str = this.f19306b;
            String b10 = dVar.b();
            if (str == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (str.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f19305a.hashCode() ^ 1000003) * 1000003;
        String str = this.f19306b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("FilesPayload{files=");
        c10.append(this.f19305a);
        c10.append(", orgId=");
        return b.b(c10, this.f19306b, "}");
    }
}
