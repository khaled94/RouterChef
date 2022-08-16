package a3;

import a3.f;
import d3.a;
import java.util.Map;
import java.util.Objects;
import q2.d;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a */
    public final a f37a;

    /* renamed from: b */
    public final Map<d, f.a> f38b;

    public b(a aVar, Map<d, f.a> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f37a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f38b = map;
    }

    @Override // a3.f
    public final a a() {
        return this.f37a;
    }

    @Override // a3.f
    public final Map<d, f.a> c() {
        return this.f38b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f37a.equals(fVar.a()) && this.f38b.equals(fVar.c());
    }

    public final int hashCode() {
        return ((this.f37a.hashCode() ^ 1000003) * 1000003) ^ this.f38b.hashCode();
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("SchedulerConfig{clock=");
        c10.append(this.f37a);
        c10.append(", values=");
        c10.append(this.f38b);
        c10.append("}");
        return c10.toString();
    }
}
