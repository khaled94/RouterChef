package c8;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;
import x7.h;
import x7.w;
import x7.x;

/* loaded from: classes.dex */
public final class c extends w<Timestamp> {

    /* renamed from: b */
    public static final a f2821b = new a();

    /* renamed from: a */
    public final w<Date> f2822a;

    /* loaded from: classes.dex */
    public class a implements x {
        @Override // x7.x
        public final <T> w<T> a(h hVar, d8.a<T> aVar) {
            if (aVar.f3994a == Timestamp.class) {
                Objects.requireNonNull(hVar);
                return new c(hVar.c(new d8.a<>(Date.class)), null);
            }
            return null;
        }
    }

    public c(w wVar, a aVar) {
        this.f2822a = wVar;
    }

    @Override // x7.w
    public final Timestamp a(e8.a aVar) {
        Date a10 = this.f2822a.a(aVar);
        if (a10 != null) {
            return new Timestamp(a10.getTime());
        }
        return null;
    }

    @Override // x7.w
    public final void b(e8.c cVar, Timestamp timestamp) {
        this.f2822a.b(cVar, timestamp);
    }
}
