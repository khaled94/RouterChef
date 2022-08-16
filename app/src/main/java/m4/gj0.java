package m4;

import d.a;
import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gj0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f8947a;

    /* renamed from: b */
    public final vd2 f8948b;

    /* renamed from: c */
    public final vd2 f8949c;

    public /* synthetic */ gj0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f8947a = i10;
        this.f8948b = vd2Var;
        this.f8949c = vd2Var2;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f8947a) {
            case 0:
                dj0 dj0Var = (dj0) this.f8948b.a();
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                Set emptySet = ((JSONObject) this.f8949c.a()) == null ? Collections.emptySet() : Collections.singleton(new es0(dj0Var, t90Var));
                a.d(emptySet);
                return emptySet;
            default:
                i11 i11Var = (i11) this.f8948b.a();
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return ((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue() ? new es0((y51) this.f8949c.a(), t90Var2) : new es0(i11Var, t90Var2);
        }
    }
}
