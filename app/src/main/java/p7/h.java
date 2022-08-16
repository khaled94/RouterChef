package p7;

import c5.j;
import d7.a;
import java.util.Objects;
import r7.e;

/* loaded from: classes.dex */
public final class h implements l {

    /* renamed from: a */
    public final m f16989a;

    /* renamed from: b */
    public final j<j> f16990b;

    public h(m mVar, j<j> jVar) {
        this.f16989a = mVar;
        this.f16990b = jVar;
    }

    @Override // p7.l
    public final boolean a(e eVar) {
        if (!eVar.j() || this.f16989a.d(eVar)) {
            return false;
        }
        j<j> jVar = this.f16990b;
        String a10 = eVar.a();
        Objects.requireNonNull(a10, "Null token");
        Long valueOf = Long.valueOf(eVar.b());
        Long valueOf2 = Long.valueOf(eVar.g());
        String str = valueOf == null ? " tokenExpirationTimestamp" : "";
        if (valueOf2 == null) {
            str = a.c(str, " tokenCreationTimestamp");
        }
        if (str.isEmpty()) {
            jVar.b(new a(a10, valueOf.longValue(), valueOf2.longValue()));
            return true;
        }
        throw new IllegalStateException(a.c("Missing required properties:", str));
    }

    @Override // p7.l
    public final boolean b(Exception exc) {
        this.f16990b.c(exc);
        return true;
    }
}
