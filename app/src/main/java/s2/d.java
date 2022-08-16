package s2;

import androidx.activity.result.a;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: a */
    public final List<m> f17645a;

    public d(List<m> list) {
        this.f17645a = list;
    }

    @Override // s2.j
    public final List<m> a() {
        return this.f17645a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return this.f17645a.equals(((j) obj).a());
    }

    public final int hashCode() {
        return this.f17645a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder c10 = a.c("BatchedLogRequest{logRequests=");
        c10.append(this.f17645a);
        c10.append("}");
        return c10.toString();
    }
}
