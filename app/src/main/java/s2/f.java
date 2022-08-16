package s2;

import java.util.Arrays;
import s2.l;

/* loaded from: classes.dex */
public final class f extends l {

    /* renamed from: a */
    public final long f17648a;

    /* renamed from: b */
    public final Integer f17649b;

    /* renamed from: c */
    public final long f17650c;

    /* renamed from: d */
    public final byte[] f17651d;

    /* renamed from: e */
    public final String f17652e;

    /* renamed from: f */
    public final long f17653f;

    /* renamed from: g */
    public final o f17654g;

    /* loaded from: classes.dex */
    public static final class a extends l.a {

        /* renamed from: a */
        public Long f17655a;

        /* renamed from: b */
        public Integer f17656b;

        /* renamed from: c */
        public Long f17657c;

        /* renamed from: d */
        public byte[] f17658d;

        /* renamed from: e */
        public String f17659e;

        /* renamed from: f */
        public Long f17660f;

        /* renamed from: g */
        public o f17661g;
    }

    public f(long j3, Integer num, long j10, byte[] bArr, String str, long j11, o oVar) {
        this.f17648a = j3;
        this.f17649b = num;
        this.f17650c = j10;
        this.f17651d = bArr;
        this.f17652e = str;
        this.f17653f = j11;
        this.f17654g = oVar;
    }

    @Override // s2.l
    public final Integer a() {
        return this.f17649b;
    }

    @Override // s2.l
    public final long b() {
        return this.f17648a;
    }

    @Override // s2.l
    public final long c() {
        return this.f17650c;
    }

    @Override // s2.l
    public final o d() {
        return this.f17654g;
    }

    @Override // s2.l
    public final byte[] e() {
        return this.f17651d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f17648a == lVar.b() && ((num = this.f17649b) != null ? num.equals(lVar.a()) : lVar.a() == null) && this.f17650c == lVar.c()) {
            if (Arrays.equals(this.f17651d, lVar instanceof f ? ((f) lVar).f17651d : lVar.e()) && ((str = this.f17652e) != null ? str.equals(lVar.f()) : lVar.f() == null) && this.f17653f == lVar.g()) {
                o oVar = this.f17654g;
                o d5 = lVar.d();
                if (oVar == null) {
                    if (d5 == null) {
                        return true;
                    }
                } else if (oVar.equals(d5)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // s2.l
    public final String f() {
        return this.f17652e;
    }

    @Override // s2.l
    public final long g() {
        return this.f17653f;
    }

    public final int hashCode() {
        long j3 = this.f17648a;
        int i10 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f17649b;
        int i11 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j10 = this.f17650c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f17651d)) * 1000003;
        String str = this.f17652e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j11 = this.f17653f;
        int i12 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        o oVar = this.f17654g;
        if (oVar != null) {
            i11 = oVar.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("LogEvent{eventTimeMs=");
        c10.append(this.f17648a);
        c10.append(", eventCode=");
        c10.append(this.f17649b);
        c10.append(", eventUptimeMs=");
        c10.append(this.f17650c);
        c10.append(", sourceExtension=");
        c10.append(Arrays.toString(this.f17651d));
        c10.append(", sourceExtensionJsonProto3=");
        c10.append(this.f17652e);
        c10.append(", timezoneOffsetSeconds=");
        c10.append(this.f17653f);
        c10.append(", networkConnectionInfo=");
        c10.append(this.f17654g);
        c10.append("}");
        return c10.toString();
    }
}
