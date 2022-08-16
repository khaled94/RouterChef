package m4;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import l3.s;
import n3.k1;

/* loaded from: classes.dex */
public final class ei0 implements th0 {

    /* renamed from: a */
    public final Context f7971a;

    /* renamed from: b */
    public final k1 f7972b = (k1) s.B.f5793g.c();

    public ei0(Context context) {
        this.f7971a = context;
    }

    @Override // m4.th0
    public final void a(Map<String, String> map) {
        HashMap hashMap = (HashMap) map;
        if (hashMap.isEmpty()) {
            return;
        }
        String str = (String) hashMap.get("gad_idless");
        if (str != null) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            hashMap.remove("gad_idless");
            yr<Boolean> yrVar = es.f8126k0;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                this.f7972b.l(parseBoolean);
                if (((Boolean) joVar.f10148c.a(es.Z3)).booleanValue() && parseBoolean) {
                    this.f7971a.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : hashMap.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8095g0)).booleanValue()) {
            return;
        }
        x70 x70Var = s.B.f5809x;
        Objects.requireNonNull(x70Var);
        x70Var.d("setConsent", new bs(bundle));
    }
}
