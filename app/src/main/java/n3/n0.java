package n3;

import java.util.Map;
import java.util.Objects;
import m4.af;
import m4.b4;
import m4.e4;
import m4.h90;
import m4.i90;
import m4.j4;
import m4.k90;
import m4.ul0;
import m4.w90;
import m4.x4;

/* loaded from: classes.dex */
public final class n0 extends e4<b4> {
    public final w90<b4> E;
    public final k90 F;

    public n0(String str, w90 w90Var) {
        super(0, str, new m0(w90Var));
        this.E = w90Var;
        k90 k90Var = new k90();
        this.F = k90Var;
        if (!k90.d()) {
            return;
        }
        k90Var.e("onNetworkRequest", new h90(str, "GET", null, null));
    }

    @Override // m4.e4
    public final j4<b4> b(b4 b4Var) {
        return new j4<>(b4Var, x4.b(b4Var));
    }

    @Override // m4.e4
    public final void g(b4 b4Var) {
        b4 b4Var2 = b4Var;
        k90 k90Var = this.F;
        Map<String, String> map = b4Var2.f6357c;
        int i10 = b4Var2.f6355a;
        Objects.requireNonNull(k90Var);
        if (k90.d()) {
            k90Var.e("onNetworkResponse", new af(i10, map));
            if (i10 < 200 || i10 >= 300) {
                k90Var.e("onNetworkRequestError", new ul0(null, 1));
            }
        }
        k90 k90Var2 = this.F;
        byte[] bArr = b4Var2.f6356b;
        if (k90.d() && bArr != null) {
            Objects.requireNonNull(k90Var2);
            k90Var2.e("onNetworkResponseBody", new i90(bArr));
        }
        this.E.a(b4Var2);
    }
}
