package m8;

import com.raouf.routerchef.Landing;
import com.raouf.routerchef.resModels.LandingMsg;
import da.a0;
import da.b;
import da.b0;
import da.d;
import f8.q0;
import x7.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: m8.a$a */
    /* loaded from: classes.dex */
    public class C0095a implements d<LandingMsg> {
        public C0095a() {
            a.this = r1;
        }

        @Override // da.d
        public final void a(b<LandingMsg> bVar, a0<LandingMsg> a0Var) {
            q0 q0Var = (q0) a.this;
            LandingMsg.Body body = new LandingMsg.Body(q0Var.f4675a.Q, a0Var.f4005b);
            if (body.landingMsg.k()) {
                if (LandingMsg.a(body.landingMsg).equals(q0Var.f4675a.getSharedPreferences("prefs", 0).getString("landing_msg_id", null))) {
                    return;
                }
                Landing.O(q0Var.f4675a, false, body.isEnglish ? body.landingMsg.i() : body.landingMsg.e(), body.isEnglish ? body.landingMsg.j() : body.landingMsg.f(), body.isEnglish ? body.landingMsg.h() : body.landingMsg.d(), body.isEnglish ? body.landingMsg.g() : body.landingMsg.c(), LandingMsg.a(body.landingMsg), LandingMsg.b(body.landingMsg));
            }
        }

        @Override // da.d
        public final void b(b<LandingMsg> bVar, Throwable th) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<da.f$a>, java.util.ArrayList] */
    public a() {
        b0.b bVar = new b0.b();
        bVar.a();
        bVar.f4019c.add(new ea.a(new h()));
        ((n8.a) bVar.b().b(n8.a.class)).a().G(new C0095a());
    }
}
