package s2;

import androidx.activity.result.a;

/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: a */
    public final long f17669a;

    public h(long j3) {
        this.f17669a = j3;
    }

    @Override // s2.n
    public final long b() {
        return this.f17669a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f17669a == ((n) obj).b();
    }

    public final int hashCode() {
        long j3 = this.f17669a;
        return ((int) (j3 ^ (j3 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        StringBuilder c10 = a.c("LogResponse{nextRequestWaitMillis=");
        c10.append(this.f17669a);
        c10.append("}");
        return c10.toString();
    }
}
