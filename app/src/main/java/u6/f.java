package u6;

import java.util.Arrays;
import java.util.Objects;
import u6.a0;

/* loaded from: classes.dex */
public final class f extends a0.d.a {

    /* renamed from: a */
    public final String f19307a;

    /* renamed from: b */
    public final byte[] f19308b;

    /* loaded from: classes.dex */
    public static final class a extends a0.d.a.AbstractC0127a {

        /* renamed from: a */
        public String f19309a;

        /* renamed from: b */
        public byte[] f19310b;

        public final a0.d.a a() {
            String str = this.f19309a == null ? " filename" : "";
            if (this.f19310b == null) {
                str = d7.a.c(str, " contents");
            }
            if (str.isEmpty()) {
                return new f(this.f19309a, this.f19310b);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }

        public final a0.d.a.AbstractC0127a b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f19310b = bArr;
            return this;
        }

        public final a0.d.a.AbstractC0127a c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f19309a = str;
            return this;
        }
    }

    public f(String str, byte[] bArr) {
        this.f19307a = str;
        this.f19308b = bArr;
    }

    @Override // u6.a0.d.a
    public final byte[] a() {
        return this.f19308b;
    }

    @Override // u6.a0.d.a
    public final String b() {
        return this.f19307a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.d.a)) {
            return false;
        }
        a0.d.a aVar = (a0.d.a) obj;
        if (this.f19307a.equals(aVar.b())) {
            if (Arrays.equals(this.f19308b, aVar instanceof f ? ((f) aVar).f19308b : aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f19307a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19308b);
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("File{filename=");
        c10.append(this.f19307a);
        c10.append(", contents=");
        c10.append(Arrays.toString(this.f19308b));
        c10.append("}");
        return c10.toString();
    }
}
