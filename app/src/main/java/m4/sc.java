package m4;

/* loaded from: classes.dex */
public final class sc {

    /* renamed from: a */
    public final long f13585a = -9223372036854775807L;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc)) {
            return false;
        }
        long j3 = ((sc) obj).f13585a;
        return true;
    }

    public final int hashCode() {
        int i10 = (int) (-9223372034707292159L);
        int floatToIntBits = Float.floatToIntBits(-3.4028235E38f);
        return Float.floatToIntBits(-3.4028235E38f) + ((floatToIntBits + (((((i10 * 31) + i10) * 31) + i10) * 31)) * 31);
    }
}
