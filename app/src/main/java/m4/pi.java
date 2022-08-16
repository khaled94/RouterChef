package m4;

/* loaded from: classes.dex */
public final class pi {

    /* renamed from: a */
    public final long f12515a;

    /* renamed from: b */
    public final String f12516b;

    /* renamed from: c */
    public final int f12517c;

    public pi(long j3, String str, int i10) {
        this.f12515a = j3;
        this.f12516b = str;
        this.f12517c = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof pi)) {
            pi piVar = (pi) obj;
            if (piVar.f12515a == this.f12515a && piVar.f12517c == this.f12517c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f12515a;
    }
}
