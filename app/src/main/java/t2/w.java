package t2;

import a3.r;
import a3.u;
import a3.v;
import android.content.Context;
import d3.a;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import q2.b;
import q2.g;
import t2.j;
import t2.r;
import z2.e;

/* loaded from: classes.dex */
public final class w implements v {

    /* renamed from: e */
    public static volatile k f18556e;

    /* renamed from: a */
    public final a f18557a;

    /* renamed from: b */
    public final a f18558b;

    /* renamed from: c */
    public final e f18559c;

    /* renamed from: d */
    public final r f18560d;

    public w(a aVar, a aVar2, e eVar, r rVar, v vVar) {
        this.f18557a = aVar;
        this.f18558b = aVar2;
        this.f18559c = eVar;
        this.f18560d = rVar;
        vVar.f101a.execute(new u(vVar, 0));
    }

    public static w a() {
        k kVar = f18556e;
        if (kVar != null) {
            return kVar.E.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f18556e == null) {
            synchronized (w.class) {
                if (f18556e == null) {
                    Objects.requireNonNull(context);
                    f18556e = new k(context);
                }
            }
        }
    }

    public final g c(l lVar) {
        Set set;
        if (lVar instanceof l) {
            Objects.requireNonNull((r2.a) lVar);
            set = Collections.unmodifiableSet(r2.a.f17228d);
        } else {
            set = Collections.singleton(new b("proto"));
        }
        r.a a10 = r.a();
        Objects.requireNonNull(lVar);
        j.a aVar = (j.a) a10;
        aVar.f18530a = "cct";
        aVar.f18531b = ((r2.a) lVar).b();
        return new s(set, aVar.b(), this);
    }
}
