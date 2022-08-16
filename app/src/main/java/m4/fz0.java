package m4;

import j0.d;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;

/* loaded from: classes.dex */
public final class fz0 implements ay {

    /* renamed from: s */
    public final ip0 f8677s;

    /* renamed from: t */
    public final k60 f8678t;

    /* renamed from: u */
    public final String f8679u;

    /* renamed from: v */
    public final String f8680v;

    public fz0(ip0 ip0Var, cm1 cm1Var) {
        this.f8677s = ip0Var;
        this.f8678t = cm1Var.f7055m;
        this.f8679u = cm1Var.f7052k;
        this.f8680v = cm1Var.f7054l;
    }

    @Override // m4.ay
    public final void a() {
        this.f8677s.b();
    }

    @Override // m4.ay
    public final void c() {
        this.f8677s.M0(d.f5386u);
    }

    @Override // m4.ay
    @ParametersAreNonnullByDefault
    public final void n0(k60 k60Var) {
        int i10;
        String str;
        k60 k60Var2 = this.f8678t;
        if (k60Var2 != null) {
            k60Var = k60Var2;
        }
        if (k60Var != null) {
            str = k60Var.f10283s;
            i10 = k60Var.f10284t;
        } else {
            i10 = 1;
            str = "";
        }
        final y50 y50Var = new y50(str, i10);
        ip0 ip0Var = this.f8677s;
        final String str2 = this.f8679u;
        final String str3 = this.f8680v;
        Objects.requireNonNull(ip0Var);
        ip0Var.M0(new ar0() { // from class: m4.hp0
            @Override // m4.ar0, m4.ko1
            /* renamed from: h */
            public final void mo30h(Object obj) {
                ((to0) obj).u(a60.this, str2, str3);
            }
        });
    }
}
