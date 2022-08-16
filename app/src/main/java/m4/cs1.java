package m4;

/* loaded from: classes.dex */
public final class cs1 extends as1 {

    /* renamed from: a */
    public final String f7134a;

    /* renamed from: b */
    public final boolean f7135b;

    /* renamed from: c */
    public final boolean f7136c;

    public /* synthetic */ cs1(String str, boolean z10, boolean z11) {
        this.f7134a = str;
        this.f7135b = z10;
        this.f7136c = z11;
    }

    @Override // m4.as1
    public final String a() {
        return this.f7134a;
    }

    @Override // m4.as1
    public final boolean b() {
        return this.f7136c;
    }

    @Override // m4.as1
    public final boolean c() {
        return this.f7135b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof as1) {
            as1 as1Var = (as1) obj;
            if (this.f7134a.equals(as1Var.a()) && this.f7135b == as1Var.c() && this.f7136c == as1Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1237;
        int hashCode = (((this.f7134a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f7135b ? 1237 : 1231)) * 1000003;
        if (true == this.f7136c) {
            i10 = 1231;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        String str = this.f7134a;
        boolean z10 = this.f7135b;
        boolean z11 = this.f7136c;
        StringBuilder sb = new StringBuilder(str.length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z10);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z11);
        sb.append("}");
        return sb.toString();
    }
}
