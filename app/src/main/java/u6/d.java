package u6;

import androidx.activity.result.a;
import s.b;
import u6.a0;

/* loaded from: classes.dex */
public final class d extends a0.c {

    /* renamed from: a */
    public final String f19303a;

    /* renamed from: b */
    public final String f19304b;

    public d(String str, String str2) {
        this.f19303a = str;
        this.f19304b = str2;
    }

    @Override // u6.a0.c
    public final String a() {
        return this.f19303a;
    }

    @Override // u6.a0.c
    public final String b() {
        return this.f19304b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.c)) {
            return false;
        }
        a0.c cVar = (a0.c) obj;
        return this.f19303a.equals(cVar.a()) && this.f19304b.equals(cVar.b());
    }

    public final int hashCode() {
        return ((this.f19303a.hashCode() ^ 1000003) * 1000003) ^ this.f19304b.hashCode();
    }

    public final String toString() {
        StringBuilder c10 = a.c("CustomAttribute{key=");
        c10.append(this.f19303a);
        c10.append(", value=");
        return b.b(c10, this.f19304b, "}");
    }
}
