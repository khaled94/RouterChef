package b3;

import androidx.activity.result.a;
import java.util.Objects;
import t2.n;
import t2.r;

/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: a */
    public final long f2492a;

    /* renamed from: b */
    public final r f2493b;

    /* renamed from: c */
    public final n f2494c;

    public b(long j3, r rVar, n nVar) {
        this.f2492a = j3;
        Objects.requireNonNull(rVar, "Null transportContext");
        this.f2493b = rVar;
        Objects.requireNonNull(nVar, "Null event");
        this.f2494c = nVar;
    }

    @Override // b3.j
    public final n a() {
        return this.f2494c;
    }

    @Override // b3.j
    public final long b() {
        return this.f2492a;
    }

    @Override // b3.j
    public final r c() {
        return this.f2493b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f2492a == jVar.b() && this.f2493b.equals(jVar.c()) && this.f2494c.equals(jVar.a());
    }

    public final int hashCode() {
        long j3 = this.f2492a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f2493b.hashCode()) * 1000003) ^ this.f2494c.hashCode();
    }

    public final String toString() {
        StringBuilder c10 = a.c("PersistedEvent{id=");
        c10.append(this.f2492a);
        c10.append(", transportContext=");
        c10.append(this.f2493b);
        c10.append(", event=");
        c10.append(this.f2494c);
        c10.append("}");
        return c10.toString();
    }
}
