package m4;

/* loaded from: classes.dex */
public final class sn1 implements qn1 {

    /* renamed from: a */
    public final String f13771a;

    public sn1(String str) {
        this.f13771a = str;
    }

    @Override // m4.qn1
    public final boolean equals(Object obj) {
        if (!(obj instanceof sn1)) {
            return false;
        }
        return this.f13771a.equals(((sn1) obj).f13771a);
    }

    @Override // m4.qn1
    public final int hashCode() {
        return this.f13771a.hashCode();
    }

    public final String toString() {
        return this.f13771a;
    }
}
