package t2;

import java.util.Arrays;
import java.util.Objects;
import q2.d;
import t2.r;

/* loaded from: classes.dex */
public final class j extends r {

    /* renamed from: a */
    public final String f18527a;

    /* renamed from: b */
    public final byte[] f18528b;

    /* renamed from: c */
    public final d f18529c;

    /* loaded from: classes.dex */
    public static final class a extends r.a {

        /* renamed from: a */
        public String f18530a;

        /* renamed from: b */
        public byte[] f18531b;

        /* renamed from: c */
        public d f18532c;

        @Override // t2.r.a
        public final r.a a(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f18530a = str;
            return this;
        }

        public final r b() {
            String str = this.f18530a == null ? " backendName" : "";
            if (this.f18532c == null) {
                str = d7.a.c(str, " priority");
            }
            if (str.isEmpty()) {
                return new j(this.f18530a, this.f18531b, this.f18532c);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }
    }

    public j(String str, byte[] bArr, d dVar) {
        this.f18527a = str;
        this.f18528b = bArr;
        this.f18529c = dVar;
    }

    @Override // t2.r
    public final String b() {
        return this.f18527a;
    }

    @Override // t2.r
    public final byte[] c() {
        return this.f18528b;
    }

    @Override // t2.r
    public final d d() {
        return this.f18529c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f18527a.equals(rVar.b())) {
            if (Arrays.equals(this.f18528b, rVar instanceof j ? ((j) rVar).f18528b : rVar.c()) && this.f18529c.equals(rVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f18527a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18528b)) * 1000003) ^ this.f18529c.hashCode();
    }
}
