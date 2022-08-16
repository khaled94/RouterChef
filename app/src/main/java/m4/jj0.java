package m4;

import android.content.Context;
import d.a;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jj0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f10097a;

    /* renamed from: b */
    public final vd2 f10098b;

    /* renamed from: c */
    public final vd2 f10099c;

    /* renamed from: d */
    public final vd2 f10100d;

    public /* synthetic */ jj0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, int i10) {
        this.f10097a = i10;
        this.f10098b = vd2Var;
        this.f10099c = vd2Var2;
        this.f10100d = vd2Var3;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f10097a) {
            case 0:
                dj0 dj0Var = (dj0) this.f10098b.a();
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                Set emptySet = ((JSONObject) this.f10100d.a()) == null ? Collections.emptySet() : Collections.singleton(new es0(dj0Var, t90Var));
                a.d(emptySet);
                return emptySet;
            case 1:
                y01 y01Var = (y01) this.f10098b.a();
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return ((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue() ? new es0((q51) this.f10100d.a(), t90Var2) : new es0(y01Var, t90Var2);
            case 2:
                return new i11((d11) this.f10098b.a(), ((td2) this.f10099c).a(), (h4.a) this.f10100d.a());
            default:
                return new ia1((Context) this.f10098b.a(), (Executor) this.f10099c.a(), (kz0) this.f10100d.a());
        }
    }
}
