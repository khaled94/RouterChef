package r9;

import androidx.activity.result.a;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a */
    public final a f17422a;

    /* renamed from: b */
    public final Proxy f17423b;

    /* renamed from: c */
    public final InetSocketAddress f17424c;

    public j0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f17422a = aVar;
        this.f17423b = proxy;
        this.f17424c = inetSocketAddress;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (j0Var.f17422a.equals(this.f17422a) && j0Var.f17423b.equals(this.f17423b) && j0Var.f17424c.equals(this.f17424c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f17423b.hashCode();
        return this.f17424c.hashCode() + ((hashCode + ((this.f17422a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder c10 = a.c("Route{");
        c10.append(this.f17424c);
        c10.append("}");
        return c10.toString();
    }
}
