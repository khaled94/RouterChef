package d4;

import b4.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r implements a.c {

    /* renamed from: c */
    public static final r f3912c = new r();

    /* renamed from: b */
    public final String f3913b = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            return l.a(this.f3913b, ((r) obj).f3913b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3913b});
    }
}
