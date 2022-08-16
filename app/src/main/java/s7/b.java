package s7;

import s.h;
import s7.f;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a */
    public final String f18352a;

    /* renamed from: b */
    public final long f18353b;

    /* renamed from: c */
    public final int f18354c;

    /* loaded from: classes.dex */
    public static final class a extends f.a {

        /* renamed from: a */
        public String f18355a;

        /* renamed from: b */
        public Long f18356b;

        /* renamed from: c */
        public int f18357c;

        @Override // s7.f.a
        public final f a() {
            String str = this.f18356b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(this.f18355a, this.f18356b.longValue(), this.f18357c);
            }
            throw new IllegalStateException(d7.a.c("Missing required properties:", str));
        }

        @Override // s7.f.a
        public final f.a b(long j3) {
            this.f18356b = Long.valueOf(j3);
            return this;
        }
    }

    public b(String str, long j3, int i10) {
        this.f18352a = str;
        this.f18353b = j3;
        this.f18354c = i10;
    }

    @Override // s7.f
    public final int b() {
        return this.f18354c;
    }

    @Override // s7.f
    public final String c() {
        return this.f18352a;
    }

    @Override // s7.f
    public final long d() {
        return this.f18353b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f18352a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f18353b == fVar.d()) {
                int i10 = this.f18354c;
                int b10 = fVar.b();
                if (i10 == 0) {
                    if (b10 == 0) {
                        return true;
                    }
                } else if (h.a(i10, b10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18352a;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j3 = this.f18353b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        int i12 = this.f18354c;
        if (i12 != 0) {
            i10 = h.b(i12);
        }
        return i11 ^ i10;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("TokenResult{token=");
        c10.append(this.f18352a);
        c10.append(", tokenExpirationTimestamp=");
        c10.append(this.f18353b);
        c10.append(", responseCode=");
        c10.append(g.a(this.f18354c));
        c10.append("}");
        return c10.toString();
    }
}
