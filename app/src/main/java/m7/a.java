package m7;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a */
    public final String f16375a;

    /* renamed from: b */
    public final List<String> f16376b;

    public a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f16375a = str;
        this.f16376b = list;
    }

    @Override // m7.l
    public final List<String> a() {
        return this.f16376b;
    }

    @Override // m7.l
    public final String b() {
        return this.f16375a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f16375a.equals(lVar.b()) && this.f16376b.equals(lVar.a());
    }

    public final int hashCode() {
        return ((this.f16375a.hashCode() ^ 1000003) * 1000003) ^ this.f16376b.hashCode();
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("HeartBeatResult{userAgent=");
        c10.append(this.f16375a);
        c10.append(", usedDates=");
        c10.append(this.f16376b);
        c10.append("}");
        return c10.toString();
    }
}
