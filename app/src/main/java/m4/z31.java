package m4;

import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class z31 implements xy1 {

    /* renamed from: a */
    public final /* synthetic */ int f15999a;

    /* renamed from: b */
    public final /* synthetic */ Object f16000b;

    public /* synthetic */ z31(Object obj, int i10) {
        this.f15999a = i10;
        this.f16000b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m4.xy1
    public final tz1 h(Object obj) {
        Object obj2;
        switch (this.f15999a) {
            case 0:
                return ((o00) this.f16000b).a((JSONObject) obj);
            default:
                kk1 kk1Var = (kk1) this.f16000b;
                vn1 vn1Var = (vn1) obj;
                Objects.requireNonNull(kk1Var);
                if (vn1Var == null || vn1Var.f14737a == null || (obj2 = vn1Var.f14738b) == null) {
                    throw new c31(1, "Empty prefetch");
                }
                jk1 jk1Var = (jk1) obj2;
                ek v10 = kk.v();
                ck v11 = dk.v();
                v11.n();
                hk x10 = hk.x();
                if (v11.f9884u) {
                    v11.m();
                    v11.f9884u = false;
                }
                dk.x((dk) v11.f9883t, x10);
                v10.n(v11);
                yq0 yq0Var = vn1Var.f14737a.f12576a.a().f15056f;
                Objects.requireNonNull(yq0Var);
                yq0Var.M0(new f7(v10.k(), 2));
                return kk1Var.b(vn1Var.f14737a, jk1Var.f10105b);
        }
    }
}
