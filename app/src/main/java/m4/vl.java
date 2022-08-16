package m4;

/* loaded from: classes.dex */
public enum vl implements o92 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    

    /* renamed from: s */
    public final int f14723s;

    vl(int i10) {
        this.f14723s = i10;
    }

    public static vl b(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return CONNECTING;
            }
            if (i10 == 2) {
                return CONNECTED;
            }
            if (i10 == 3) {
                return DISCONNECTING;
            }
            if (i10 == 4) {
                return DISCONNECTED;
            }
            if (i10 == 5) {
                return SUSPENDED;
            }
            return null;
        }
        return UNSPECIFIED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14723s);
    }
}
