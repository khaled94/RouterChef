package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class oc {

    /* renamed from: a */
    public final byte[] f12085a;

    public oc(byte[] bArr) {
        this.f12085a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && oc.class == obj.getClass() && Arrays.equals(this.f12085a, ((oc) obj).f12085a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12085a) + 31;
    }
}
