package u2;

import java.util.Arrays;
import t2.n;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a */
    public final Iterable<n> f19053a;

    /* renamed from: b */
    public final byte[] f19054b;

    public a(Iterable iterable, byte[] bArr, C0124a c0124a) {
        this.f19053a = iterable;
        this.f19054b = bArr;
    }

    @Override // u2.f
    public final Iterable<n> a() {
        return this.f19053a;
    }

    @Override // u2.f
    public final byte[] b() {
        return this.f19054b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f19053a.equals(fVar.a())) {
            if (Arrays.equals(this.f19054b, fVar instanceof a ? ((a) fVar).f19054b : fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f19053a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19054b);
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("BackendRequest{events=");
        c10.append(this.f19053a);
        c10.append(", extras=");
        c10.append(Arrays.toString(this.f19054b));
        c10.append("}");
        return c10.toString();
    }
}
