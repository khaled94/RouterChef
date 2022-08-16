package s6;

import androidx.activity.result.a;
import java.util.Objects;
import u6.a0;

/* loaded from: classes.dex */
public final class b extends x {

    /* renamed from: a */
    public final a0 f18231a;

    /* renamed from: b */
    public final String f18232b;

    public b(a0 a0Var, String str) {
        this.f18231a = a0Var;
        Objects.requireNonNull(str, "Null sessionId");
        this.f18232b = str;
    }

    @Override // s6.x
    public final a0 a() {
        return this.f18231a;
    }

    @Override // s6.x
    public final String b() {
        return this.f18232b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f18231a.equals(xVar.a()) && this.f18232b.equals(xVar.b());
    }

    public final int hashCode() {
        return ((this.f18231a.hashCode() ^ 1000003) * 1000003) ^ this.f18232b.hashCode();
    }

    public final String toString() {
        StringBuilder c10 = a.c("CrashlyticsReportWithSessionId{report=");
        c10.append(this.f18231a);
        c10.append(", sessionId=");
        return s.b.b(c10, this.f18232b, "}");
    }
}
