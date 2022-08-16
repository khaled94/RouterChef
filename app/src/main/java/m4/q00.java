package m4;

import android.util.Base64;
import java.util.Objects;
import l3.s;

/* loaded from: classes.dex */
public final /* synthetic */ class q00 implements xy1 {

    /* renamed from: a */
    public final /* synthetic */ int f12662a = 0;

    /* renamed from: b */
    public final /* synthetic */ String f12663b;

    /* renamed from: c */
    public final /* synthetic */ Object f12664c;

    public /* synthetic */ q00(String str, lx lxVar) {
        this.f12663b = str;
        this.f12664c = lxVar;
    }

    @Override // m4.xy1
    public final tz1 h(Object obj) {
        String str;
        switch (this.f12662a) {
            case 0:
                f00 f00Var = (f00) obj;
                f00Var.l0(this.f12663b, (lx) this.f12664c);
                return mz1.m(f00Var);
            default:
                mx0 mx0Var = (mx0) this.f12664c;
                String str2 = this.f12663b;
                Objects.requireNonNull(mx0Var);
                ge0 ge0Var = s.B.f5790d;
                vd0 a10 = ge0.a(mx0Var.f11332a, cf0.a(), "native-omid", false, false, mx0Var.f11334c, null, mx0Var.f11335d, null, mx0Var.f11336e, mx0Var.f11337f, null, null);
                v90 v90Var = new v90(a10);
                he0 he0Var = (he0) a10;
                ((ce0) he0Var.q0()).y = new np0(v90Var, 1);
                if (((Boolean) jo.f10145d.f10148c.a(es.j3)).booleanValue()) {
                    str2 = Base64.encodeToString(str2.getBytes(), 1);
                    str = "base64";
                } else {
                    str = "UTF-8";
                }
                he0Var.loadData(str2, "text/html", str);
                return v90Var;
        }
    }

    public /* synthetic */ q00(mx0 mx0Var, String str) {
        this.f12664c = mx0Var;
        this.f12663b = str;
    }
}
