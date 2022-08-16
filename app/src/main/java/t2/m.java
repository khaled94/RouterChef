package t2;

import androidx.activity.result.a;
import java.util.Arrays;
import java.util.Objects;
import q2.b;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public final b f18540a;

    /* renamed from: b */
    public final byte[] f18541b;

    public m(b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f18540a = bVar;
        this.f18541b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f18540a.equals(mVar.f18540a)) {
            return Arrays.equals(this.f18541b, mVar.f18541b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18540a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18541b);
    }

    public final String toString() {
        StringBuilder c10 = a.c("EncodedPayload{encoding=");
        c10.append(this.f18540a);
        c10.append(", bytes=[...]}");
        return c10.toString();
    }
}
