package m4;

import android.content.Context;
import android.os.Binder;
import android.util.JsonWriter;
import android.util.Pair;

/* loaded from: classes.dex */
public final class ul0 implements j90, ar0, z41, rk1 {

    /* renamed from: s */
    public final /* synthetic */ int f14444s;

    /* renamed from: t */
    public final Object f14445t;

    public /* synthetic */ ul0(Object obj, int i10) {
        this.f14444s = i10;
        this.f14445t = obj;
    }

    @Override // m4.j90
    public final void a(JsonWriter jsonWriter) {
        String str = (String) this.f14445t;
        Object obj = k90.f10300b;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    @Override // m4.z41
    public final tz1 e(o50 o50Var) {
        return ((a51) this.f14445t).f6051c.a().N3(o50Var, Binder.getCallingUid());
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        switch (this.f14444s) {
            case 2:
                ((fp0) obj).r((Context) this.f14445t);
                return;
            default:
                Pair pair = (Pair) this.f14445t;
                ((ip) obj).d2((String) pair.first, (String) pair.second);
                return;
        }
    }
}
