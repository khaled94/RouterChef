package z2;

import a3.x;
import androidx.activity.result.a;
import b3.d;
import c3.b;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import q2.h;
import t2.n;
import t2.r;
import t2.w;
import u2.e;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: f */
    public static final Logger f20909f = Logger.getLogger(w.class.getName());

    /* renamed from: a */
    public final x f20910a;

    /* renamed from: b */
    public final Executor f20911b;

    /* renamed from: c */
    public final e f20912c;

    /* renamed from: d */
    public final d f20913d;

    /* renamed from: e */
    public final b f20914e;

    public c(Executor executor, e eVar, x xVar, d dVar, b bVar) {
        this.f20911b = executor;
        this.f20912c = eVar;
        this.f20910a = xVar;
        this.f20913d = dVar;
        this.f20914e = bVar;
    }

    @Override // z2.e
    public final void a(final r rVar, final n nVar, final h hVar) {
        this.f20911b.execute(new Runnable() { // from class: z2.b
            @Override // java.lang.Runnable
            public final void run() {
                final c cVar = c.this;
                final r rVar2 = rVar;
                h hVar2 = hVar;
                n nVar2 = nVar;
                Objects.requireNonNull(cVar);
                try {
                    u2.n a10 = cVar.f20912c.a(rVar2.b());
                    if (a10 == null) {
                        String format = String.format("Transport backend '%s' is not registered", rVar2.b());
                        c.f20909f.warning(format);
                        hVar2.a(new IllegalArgumentException(format));
                    } else {
                        final n a11 = a10.a(nVar2);
                        cVar.f20914e.b(new b.a() { // from class: z2.a
                            @Override // c3.b.a
                            public final Object a() {
                                c cVar2 = c.this;
                                r rVar3 = rVar2;
                                cVar2.f20913d.S(rVar3, a11);
                                cVar2.f20910a.a(rVar3, 1);
                                return null;
                            }
                        });
                        hVar2.a(null);
                    }
                } catch (Exception e10) {
                    Logger logger = c.f20909f;
                    StringBuilder c10 = a.c("Error scheduling event ");
                    c10.append(e10.getMessage());
                    logger.warning(c10.toString());
                    hVar2.a(e10);
                }
            }
        });
    }
}
