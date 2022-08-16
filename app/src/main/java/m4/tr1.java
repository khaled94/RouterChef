package m4;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;
import t3.w;

/* loaded from: classes.dex */
public final class tr1 extends or1 {
    public tr1(w wVar, HashSet<String> hashSet, JSONObject jSONObject, long j3) {
        super(wVar, hashSet, jSONObject, j3);
    }

    @Override // m4.pr1
    public final void a(String str) {
        rq1 rq1Var;
        if (!TextUtils.isEmpty(str) && (rq1Var = rq1.f13418c) != null) {
            for (jq1 jq1Var : rq1Var.b()) {
                if (this.f12280c.contains(jq1Var.f10166g)) {
                    br1 br1Var = jq1Var.f10163d;
                    if (this.f12282e >= br1Var.f6605b) {
                        br1Var.f6604a = 2;
                        wq1.f15090a.a(br1Var.a(), "setNativeViewHierarchy", str);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(Object[] objArr) {
        if (er1.e(this.f12281d, (JSONObject) this.f12615b.f18620s)) {
            return null;
        }
        w wVar = this.f12615b;
        JSONObject jSONObject = this.f12281d;
        wVar.f18620s = jSONObject;
        return jSONObject.toString();
    }
}
