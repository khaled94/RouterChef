package v9;

import ca.o;
import ca.t;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import r9.c0;
import r9.f0;
import r9.g0;
import r9.l;
import r9.m;
import r9.u;
import r9.w;
import r9.x;
import s9.e;

/* loaded from: classes.dex */
public final class a implements w {

    /* renamed from: a */
    public final m f19836a;

    public a(m mVar) {
        this.f19836a = mVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    @Override // r9.w
    public final g0 a(w.a aVar) {
        boolean z10;
        f fVar = (f) aVar;
        c0 c0Var = fVar.f19846e;
        Objects.requireNonNull(c0Var);
        c0.a aVar2 = new c0.a(c0Var);
        f0 f0Var = c0Var.f17314d;
        if (f0Var != null) {
            x b10 = f0Var.b();
            if (b10 != null) {
                aVar2.b("Content-Type", b10.f17494a);
            }
            long a10 = f0Var.a();
            if (a10 != -1) {
                aVar2.b("Content-Length", Long.toString(a10));
                aVar2.e("Transfer-Encoding");
            } else {
                aVar2.b("Transfer-Encoding", "chunked");
                aVar2.e("Content-Length");
            }
        }
        if (c0Var.b("Host") == null) {
            aVar2.b("Host", e.k(c0Var.f17311a, false));
        }
        if (c0Var.b("Connection") == null) {
            aVar2.b("Connection", "Keep-Alive");
        }
        if (c0Var.b("Accept-Encoding") == null && c0Var.b("Range") == null) {
            aVar2.b("Accept-Encoding", "gzip");
            z10 = true;
        } else {
            z10 = false;
        }
        Objects.requireNonNull((m.a) this.f19836a);
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = emptyList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb.append("; ");
                }
                l lVar = (l) emptyList.get(i10);
                sb.append(lVar.f17445a);
                sb.append('=');
                sb.append(lVar.f17446b);
            }
            aVar2.b("Cookie", sb.toString());
        }
        if (c0Var.b("User-Agent") == null) {
            aVar2.b("User-Agent", "okhttp/3.14.9");
        }
        g0 a11 = fVar.a(aVar2.a());
        e.d(this.f19836a, c0Var.f17311a, a11.f17378x);
        g0.a aVar3 = new g0.a(a11);
        aVar3.f17380a = c0Var;
        if (z10 && "gzip".equalsIgnoreCase(a11.c("Content-Encoding")) && e.b(a11)) {
            ca.m mVar = new ca.m(a11.y.j());
            u.a e10 = a11.f17378x.e();
            e10.e("Content-Encoding");
            e10.e("Content-Length");
            ?? r02 = e10.f17473a;
            u.a aVar4 = new u.a();
            Collections.addAll(aVar4.f17473a, (String[]) r02.toArray(new String[r02.size()]));
            aVar3.f17385f = aVar4;
            String c10 = a11.c("Content-Type");
            Logger logger = o.f2862a;
            aVar3.f17386g = new g(c10, -1L, new t(mVar));
        }
        return aVar3.a();
    }
}
