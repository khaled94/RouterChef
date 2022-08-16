package m4;

/* loaded from: classes.dex */
public final class hp1 {

    /* renamed from: a */
    public final String f9406a;

    /* renamed from: b */
    public final String f9407b;

    public hp1(String str, String str2) {
        this.f9406a = str;
        this.f9407b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp1)) {
            return false;
        }
        hp1 hp1Var = (hp1) obj;
        return this.f9406a.equals(hp1Var.f9406a) && this.f9407b.equals(hp1Var.f9407b);
    }

    public final int hashCode() {
        String valueOf = String.valueOf(this.f9406a);
        String valueOf2 = String.valueOf(this.f9407b);
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }
}
