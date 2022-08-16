package k9;

import androidx.activity.result.a;
import d9.l;
import e9.f;
import v8.h;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public final Object f5673a;

    /* renamed from: b */
    public final l<Throwable, h> f5674b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Object obj, l<? super Throwable, h> lVar) {
        this.f5673a = obj;
        this.f5674b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return f.a(this.f5673a, nVar.f5673a) && f.a(this.f5674b, nVar.f5674b);
    }

    public final int hashCode() {
        Object obj = this.f5673a;
        return this.f5674b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder c10 = a.c("CompletedWithCancellation(result=");
        c10.append(this.f5673a);
        c10.append(", onCancellation=");
        c10.append(this.f5674b);
        c10.append(')');
        return c10.toString();
    }
}
