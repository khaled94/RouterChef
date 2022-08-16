package m4;

import android.os.Bundle;
import android.util.Log;
import c5.a;
import c5.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import s4.aa;
import y4.d1;
import y4.e1;
import y4.f1;

/* loaded from: classes.dex */
public final class b10 implements ar0, mu1, d1, a {

    /* renamed from: s */
    public static final q01 f6321s = new q01(0);

    /* renamed from: t */
    public static final w51 f6322t = new w51(0);

    /* renamed from: u */
    public static final /* synthetic */ b10 f6323u = new b10();

    /* renamed from: v */
    public static final /* synthetic */ b10 f6324v = new b10();

    public /* synthetic */ b10() {
    }

    public /* synthetic */ b10(int i10) {
    }

    public /* synthetic */ b10(boolean z10) {
    }

    public static final List a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(optJSONArray.getString(i10));
            }
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }

    @Override // c5.a
    public Object d(i iVar) {
        if (iVar.n()) {
            return (Bundle) iVar.j();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(iVar.i());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", iVar.i());
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((jq0) obj).h();
    }

    @Override // m4.mu1
    public /* synthetic */ Iterator l(aa0 aa0Var, CharSequence charSequence) {
        return new ju1(aa0Var, charSequence);
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return Long.valueOf(aa.f17726t.zza().p());
    }
}
