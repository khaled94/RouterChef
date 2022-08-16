package c2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public final String f2620a;

    /* renamed from: b */
    public final int f2621b;

    public g(String str, int i10) {
        this.f2620a = str;
        this.f2621b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f2621b == gVar.f2621b) {
            return this.f2620a.equals(gVar.f2620a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2620a.hashCode() * 31) + this.f2621b;
    }
}
