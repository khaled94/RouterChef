package u2;

import androidx.activity.result.a;
import s.h;

/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: a */
    public final int f19055a;

    /* renamed from: b */
    public final long f19056b;

    public b(int i10, long j3) {
        if (i10 != 0) {
            this.f19055a = i10;
            this.f19056b = j3;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // u2.h
    public final long b() {
        return this.f19056b;
    }

    @Override // u2.h
    public final int c() {
        return this.f19055a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return h.a(this.f19055a, hVar.c()) && this.f19056b == hVar.b();
    }

    public final int hashCode() {
        long j3 = this.f19056b;
        return ((h.b(this.f19055a) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder c10 = a.c("BackendResponse{status=");
        c10.append(g.a(this.f19055a));
        c10.append(", nextRequestWaitMillis=");
        c10.append(this.f19056b);
        c10.append("}");
        return c10.toString();
    }
}
