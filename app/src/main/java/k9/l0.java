package k9;

import androidx.activity.result.a;
import d9.l;
import v8.h;

/* loaded from: classes.dex */
public final class l0 extends d {

    /* renamed from: s */
    public final l<Throwable, h> f5668s;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(l<? super Throwable, h> lVar) {
        this.f5668s = lVar;
    }

    @Override // k9.d
    public final void a(Throwable th) {
        this.f5668s.c(th);
    }

    @Override // d9.l
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        a((Throwable) obj);
        return h.f19835a;
    }

    public final String toString() {
        StringBuilder c10 = a.c("InvokeOnCancel[");
        c10.append(u.a(this.f5668s));
        c10.append('@');
        c10.append(u.b(this));
        c10.append(']');
        return c10.toString();
    }
}
