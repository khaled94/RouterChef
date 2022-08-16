package m4;

/* loaded from: classes.dex */
public final class kp2 {

    /* renamed from: c */
    public static final kp2 f10524c = new kp2(0, 0);

    /* renamed from: a */
    public final long f10525a;

    /* renamed from: b */
    public final long f10526b;

    public kp2(long j3, long j10) {
        this.f10525a = j3;
        this.f10526b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kp2.class == obj.getClass()) {
            kp2 kp2Var = (kp2) obj;
            if (this.f10525a == kp2Var.f10525a && this.f10526b == kp2Var.f10526b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f10525a) * 31) + ((int) this.f10526b);
    }

    public final String toString() {
        long j3 = this.f10525a;
        long j10 = this.f10526b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j3);
        sb.append(", position=");
        sb.append(j10);
        sb.append("]");
        return sb.toString();
    }
}
