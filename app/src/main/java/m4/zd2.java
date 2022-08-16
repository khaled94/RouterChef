package m4;

/* loaded from: classes.dex */
public final class zd2 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zd2.class == obj.getClass()) {
            zd2 zd2Var = (zd2) obj;
            if (Float.compare(0.0f, 0.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
