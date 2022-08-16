package m4;

/* loaded from: classes.dex */
public final class gl2 {

    /* renamed from: a */
    public final long f8963a;

    /* renamed from: b */
    public final long f8964b;

    public gl2(long j3, long j10) {
        this.f8963a = j3;
        this.f8964b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl2)) {
            return false;
        }
        gl2 gl2Var = (gl2) obj;
        return this.f8963a == gl2Var.f8963a && this.f8964b == gl2Var.f8964b;
    }

    public final int hashCode() {
        return (((int) this.f8963a) * 31) + ((int) this.f8964b);
    }
}
