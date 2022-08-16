package m4;

import java.util.HashSet;
import org.json.JSONObject;
import t3.w;

/* loaded from: classes.dex */
public final class sr1 extends or1 {
    public sr1(w wVar, HashSet<String> hashSet, JSONObject jSONObject, long j3) {
        super(wVar, hashSet, jSONObject, j3);
    }

    @Override // m4.pr1
    public final void a(String str) {
        b(str);
        super.onPostExecute(str);
    }

    public final void b(String str) {
        rq1 rq1Var = rq1.f13418c;
        if (rq1Var != null) {
            for (jq1 jq1Var : rq1Var.b()) {
                if (this.f12280c.contains(jq1Var.f10166g)) {
                    br1 br1Var = jq1Var.f10163d;
                    if (this.f12282e >= br1Var.f6605b && br1Var.f6604a != 3) {
                        br1Var.f6604a = 3;
                        wq1.f15090a.a(br1Var.a(), "setNativeViewHierarchy", str);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ String doInBackground(Object[] objArr) {
        return this.f12281d.toString();
    }

    @Override // m4.or1, m4.pr1, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        b(str2);
        super.onPostExecute(str2);
    }
}
