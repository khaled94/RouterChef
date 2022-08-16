package m4;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ax implements lx<vd0> {
    @Override // m4.lx
    public final /* bridge */ /* synthetic */ void a(vd0 vd0Var, Map map) {
        JSONObject zza;
        vd0 vd0Var2 = vd0Var;
        ku K = vd0Var2.K();
        if (K == null || (zza = K.zza()) == null) {
            vd0Var2.l("nativeAdViewSignalsReady", new JSONObject());
        } else {
            vd0Var2.l("nativeAdViewSignalsReady", zza);
        }
    }
}
