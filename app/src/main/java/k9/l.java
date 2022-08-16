package k9;

import androidx.activity.result.a;
import e9.f;
import java.util.Objects;
import v8.h;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    public final Object f5663a;

    /* renamed from: b */
    public final d f5664b;

    /* renamed from: c */
    public final d9.l<Throwable, h> f5665c;

    /* renamed from: d */
    public final Object f5666d;

    /* renamed from: e */
    public final Throwable f5667e;

    /* JADX WARN: Multi-variable type inference failed */
    public l(Object obj, d dVar, d9.l<? super Throwable, h> lVar, Object obj2, Throwable th) {
        this.f5663a = obj;
        this.f5664b = dVar;
        this.f5665c = lVar;
        this.f5666d = obj2;
        this.f5667e = th;
    }

    public l(Object obj, d dVar, d9.l lVar, Throwable th, int i10) {
        dVar = (i10 & 2) != 0 ? null : dVar;
        lVar = (i10 & 4) != 0 ? null : lVar;
        th = (i10 & 16) != 0 ? null : th;
        this.f5663a = obj;
        this.f5664b = dVar;
        this.f5665c = lVar;
        this.f5666d = null;
        this.f5667e = th;
    }

    public static l a(l lVar, d dVar, Throwable th, int i10) {
        Object obj = null;
        Object obj2 = (i10 & 1) != 0 ? lVar.f5663a : null;
        if ((i10 & 2) != 0) {
            dVar = lVar.f5664b;
        }
        d dVar2 = dVar;
        d9.l<Throwable, h> lVar2 = (i10 & 4) != 0 ? lVar.f5665c : null;
        if ((i10 & 8) != 0) {
            obj = lVar.f5666d;
        }
        Object obj3 = obj;
        if ((i10 & 16) != 0) {
            th = lVar.f5667e;
        }
        Objects.requireNonNull(lVar);
        return new l(obj2, dVar2, lVar2, obj3, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return f.a(this.f5663a, lVar.f5663a) && f.a(this.f5664b, lVar.f5664b) && f.a(this.f5665c, lVar.f5665c) && f.a(this.f5666d, lVar.f5666d) && f.a(this.f5667e, lVar.f5667e);
    }

    public final int hashCode() {
        Object obj = this.f5663a;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        d dVar = this.f5664b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d9.l<Throwable, h> lVar = this.f5665c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f5666d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f5667e;
        if (th != null) {
            i10 = th.hashCode();
        }
        return hashCode4 + i10;
    }

    public final String toString() {
        StringBuilder c10 = a.c("CompletedContinuation(result=");
        c10.append(this.f5663a);
        c10.append(", cancelHandler=");
        c10.append(this.f5664b);
        c10.append(", onCancellation=");
        c10.append(this.f5665c);
        c10.append(", idempotentResume=");
        c10.append(this.f5666d);
        c10.append(", cancelCause=");
        c10.append(this.f5667e);
        c10.append(')');
        return c10.toString();
    }
}
