package m8;

import com.raouf.routerchef.Landing;
import com.raouf.routerchef.resModels.VersionChecker;
import da.a0;
import da.b0;
import da.d;
import f8.p0;
import x7.h;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public class a implements d<VersionChecker> {
        public a() {
            b.this = r1;
        }

        @Override // da.d
        public final void a(da.b<VersionChecker> bVar, a0<VersionChecker> a0Var) {
            String str;
            p0 p0Var = (p0) b.this;
            VersionChecker.Body body = new VersionChecker.Body(p0Var.f4669b.Q, a0Var.f4005b);
            p0Var.f4669b.N.setText(body.isEnglish ? body.versionChecker.e() : body.versionChecker.c());
            String h10 = r8.b.h(p0Var.f4668a);
            str = body.versionChecker.free;
            if (!h10.equals(str)) {
                Landing.O(p0Var.f4669b, true, body.isEnglish ? body.versionChecker.d() : body.versionChecker.b(), null, null, null, null, null);
            }
        }

        @Override // da.d
        public final void b(da.b<VersionChecker> bVar, Throwable th) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<da.f$a>, java.util.ArrayList] */
    public b() {
        b0.b bVar = new b0.b();
        bVar.a();
        bVar.f4019c.add(new ea.a(new h()));
        ((n8.b) bVar.b().b(n8.b.class)).a().G(new a());
    }
}
